package org.apache.spark.ml.classification;
/**
 * LogisticAggregator computes the gradient and loss for binary or multinomial logistic (softmax)
 * loss function, as used in classification for instances in sparse or dense vector in an online
 * fashion.
 * <p>
 * Two LogisticAggregators can be merged together to have a summary of loss and gradient of
 * the corresponding joint dataset.
 * <p>
 * For improving the convergence rate during the optimization process and also to prevent against
 * features with very large variances exerting an overly large influence during model training,
 * packages like R's GLMNET perform the scaling to unit variance and remove the mean in order to
 * reduce the condition number. The model is then trained in this scaled space, but returns the
 * coefficients in the original scale. See page 9 in
 * http://cran.r-project.org/web/packages/glmnet/glmnet.pdf
 * <p>
 * However, we don't want to apply the {@link org.apache.spark.ml.feature.StandardScaler} on the
 * training dataset, and then cache the standardized dataset since it will create a lot of overhead.
 * As a result, we perform the scaling implicitly when we compute the objective function (though
 * we do not subtract the mean).
 * <p>
 * Note that there is a difference between multinomial (softmax) and binary loss. The binary case
 * uses one outcome class as a "pivot" and regresses the other class against the pivot. In the
 * multinomial case, the softmax loss function is used to model each class probability
 * independently. Using softmax loss produces <code>K</code> sets of coefficients, while using a pivot class
 * produces <code>K - 1</code> sets of coefficients (a single coefficient vector in the binary case). In the
 * binary case, we can say that the coefficients are shared between the positive and negative
 * classes. When regularization is applied, multinomial (softmax) loss will produce a result
 * different from binary loss since the positive and negative don't share the coefficients while the
 * binary regression shares the coefficients between positive and negative.
 * <p>
 * The following is a mathematical derivation for the multinomial (softmax) loss.
 * <p>
 * The probability of the multinomial outcome $y$ taking on any of the K possible outcomes is:
 * <p>
 * <blockquote>
 *    $$
 *    P(y_i=0|\vec{x}_i, \beta) = \frac{e^{\vec{x}_i^T \vec{\beta}_0}}{\sum_{k=0}^{K-1}
 *       e^{\vec{x}_i^T \vec{\beta}_k}} \\
 *    P(y_i=1|\vec{x}_i, \beta) = \frac{e^{\vec{x}_i^T \vec{\beta}_1}}{\sum_{k=0}^{K-1}
 *       e^{\vec{x}_i^T \vec{\beta}_k}}\\
 *    P(y_i=K-1|\vec{x}_i, \beta) = \frac{e^{\vec{x}_i^T \vec{\beta}_{K-1}}\,}{\sum_{k=0}^{K-1}
 *       e^{\vec{x}_i^T \vec{\beta}_k}}
 *    $$
 * </blockquote>
 * <p>
 * The model coefficients $\beta = (\beta_0, \beta_1, \beta_2, ..., \beta_{K-1})$ become a matrix
 * which has dimension of $K \times (N+1)$ if the intercepts are added. If the intercepts are not
 * added, the dimension will be $K \times N$.
 * <p>
 * Note that the coefficients in the model above lack identifiability. That is, any constant scalar
 * can be added to all of the coefficients and the probabilities remain the same.
 * <p>
 * <blockquote>
 *    $$
 *    \begin{align}
 *    \frac{e^{\vec{x}_i^T \left(\vec{\beta}_0 + \vec{c}\right)}}{\sum_{k=0}^{K-1}
 *       e^{\vec{x}_i^T \left(\vec{\beta}_k + \vec{c}\right)}}
 *    = \frac{e^{\vec{x}_i^T \vec{\beta}_0}e^{\vec{x}_i^T \vec{c}}\,}{e^{\vec{x}_i^T \vec{c}}
 *       \sum_{k=0}^{K-1} e^{\vec{x}_i^T \vec{\beta}_k}}
 *    = \frac{e^{\vec{x}_i^T \vec{\beta}_0}}{\sum_{k=0}^{K-1} e^{\vec{x}_i^T \vec{\beta}_k}}
 *    \end{align}
 *    $$
 * </blockquote>
 * <p>
 * However, when regularization is added to the loss function, the coefficients are indeed
 * identifiable because there is only one set of coefficients which minimizes the regularization
 * term. When no regularization is applied, we choose the coefficients with the minimum L2
 * penalty for consistency and reproducibility. For further discussion see:
 * <p>
 * Friedman, et al. "Regularization Paths for Generalized Linear Models via Coordinate Descent"
 * <p>
 * The loss of objective function for a single instance of data (we do not include the
 * regularization term here for simplicity) can be written as
 * <p>
 * <blockquote>
 *    $$
 *    \begin{align}
 *    \ell\left(\beta, x_i\right) &amp;= -log{P\left(y_i \middle| \vec{x}_i, \beta\right)} \\
 *    &amp;= log\left(\sum_{k=0}^{K-1}e^{\vec{x}_i^T \vec{\beta}_k}\right) - \vec{x}_i^T \vec{\beta}_y\\
 *    &amp;= log\left(\sum_{k=0}^{K-1} e^{margins_k}\right) - margins_y
 *    \end{align}
 *    $$
 * </blockquote>
 * <p>
 * where ${margins}_k = \vec{x}_i^T \vec{\beta}_k$.
 * <p>
 * For optimization, we have to calculate the first derivative of the loss function, and a simple
 * calculation shows that
 * <p>
 * <blockquote>
 *    $$
 *    \begin{align}
 *    \frac{\partial \ell(\beta, \vec{x}_i, w_i)}{\partial \beta_{j, k}}
 *    &amp;= x_{i,j} \cdot w_i \cdot \left(\frac{e^{\vec{x}_i \cdot \vec{\beta}_k}}{\sum_{k'=0}^{K-1}
 *      e^{\vec{x}_i \cdot \vec{\beta}_{k'}}\,} - I_{y=k}\right) \\
 *    &amp;= x_{i, j} \cdot w_i \cdot multiplier_k
 *    \end{align}
 *    $$
 * </blockquote>
 * <p>
 * where $w_i$ is the sample weight, $I_{y=k}$ is an indicator function
 * <p>
 *  <blockquote>
 *    $$
 *    I_{y=k} = \begin{cases}
 *          1 &amp; y = k \\
 *          0 &amp; else
 *       \end{cases}
 *    $$
 * </blockquote>
 * <p>
 * and
 * <p>
 * <blockquote>
 *    $$
 *    multiplier_k = \left(\frac{e^{\vec{x}_i \cdot \vec{\beta}_k}}{\sum_{k=0}^{K-1}
 *       e^{\vec{x}_i \cdot \vec{\beta}_k}} - I_{y=k}\right)
 *    $$
 * </blockquote>
 * <p>
 * If any of margins is larger than 709.78, the numerical computation of multiplier and loss
 * function will suffer from arithmetic overflow. This issue occurs when there are outliers in
 * data which are far away from the hyperplane, and this will cause the failing of training once
 * infinity is introduced. Note that this is only a concern when max(margins) &amp;gt; 0.
 * <p>
 * Fortunately, when max(margins) = maxMargin &amp;gt; 0, the loss function and the multiplier can
 * easily be rewritten into the following equivalent numerically stable formula.
 * <p>
 * <blockquote>
 *    $$
 *    \ell\left(\beta, x\right) = log\left(\sum_{k=0}^{K-1} e^{margins_k - maxMargin}\right) -
 *       margins_{y} + maxMargin
 *    $$
 * </blockquote>
 * <p>
 * Note that each term, $(margins_k - maxMargin)$ in the exponential is no greater than zero; as a
 * result, overflow will not happen with this formula.
 * <p>
 * For $multiplier$, a similar trick can be applied as the following,
 * <p>
 * <blockquote>
 *    $$
 *    multiplier_k = \left(\frac{e^{\vec{x}_i \cdot \vec{\beta}_k - maxMargin}}{\sum_{k'=0}^{K-1}
 *       e^{\vec{x}_i \cdot \vec{\beta}_{k'} - maxMargin}} - I_{y=k}\right)
 *    $$
 * </blockquote>
 * <p>
 * param:  bcCoefficients The broadcast coefficients corresponding to the features.
 * param:  bcFeaturesStd The broadcast standard deviation values of the features.
 * param:  numClasses the number of possible outcomes for k classes classification problem in
 *                   Multinomial Logistic Regression.
 * param:  fitIntercept Whether to fit an intercept term.
 * param:  multinomial Whether to use multinomial (softmax) or binary loss
 * <p>
 * @note In order to avoid unnecessary computation during calculation of the gradient updates
 * we lay out the coefficients in column major order during training. This allows us to
 * perform feature standardization once, while still retaining sequential memory access
 * for speed. We convert back to row major order when we create the model,
 * since this form is optimal for the matrix operations used for prediction.
 */
public  class LogisticAggregator implements scala.Serializable, org.apache.spark.internal.Logging {
  public   LogisticAggregator (org.apache.spark.broadcast.Broadcast<org.apache.spark.ml.linalg.Vector> bcCoefficients, org.apache.spark.broadcast.Broadcast<double[]> bcFeaturesStd, int numClasses, boolean fitIntercept, boolean multinomial)  { throw new RuntimeException(); }
  private  int numFeatures ()  { throw new RuntimeException(); }
  private  int numFeaturesPlusIntercept ()  { throw new RuntimeException(); }
  private  int coefficientSize ()  { throw new RuntimeException(); }
  private  int numCoefficientSets ()  { throw new RuntimeException(); }
  private  double weightSum ()  { throw new RuntimeException(); }
  private  double lossSum ()  { throw new RuntimeException(); }
  private  double[] gradientSumArray ()  { throw new RuntimeException(); }
  /** Update gradient and loss using binary loss function. */
  private  void binaryUpdateInPlace (org.apache.spark.ml.linalg.Vector features, double weight, double label)  { throw new RuntimeException(); }
  /** Update gradient and loss using multinomial (softmax) loss function. */
  private  void multinomialUpdateInPlace (org.apache.spark.ml.linalg.Vector features, double weight, double label)  { throw new RuntimeException(); }
  /**
   * Add a new training instance to this LogisticAggregator, and update the loss and gradient
   * of the objective function.
   * <p>
   * @param instance The instance of data point to be added.
   * @return This LogisticAggregator object.
   */
  public  org.apache.spark.ml.classification.LogisticAggregator add (org.apache.spark.ml.feature.Instance instance)  { throw new RuntimeException(); }
  /**
   * Merge another LogisticAggregator, and update the loss and gradient
   * of the objective function.
   * (Note that it's in place merging; as a result, <code>this</code> object will be modified.)
   * <p>
   * @param other The other LogisticAggregator to be merged.
   * @return This LogisticAggregator object.
   */
  public  org.apache.spark.ml.classification.LogisticAggregator merge (org.apache.spark.ml.classification.LogisticAggregator other)  { throw new RuntimeException(); }
  public  double loss ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Matrix gradient ()  { throw new RuntimeException(); }
}
