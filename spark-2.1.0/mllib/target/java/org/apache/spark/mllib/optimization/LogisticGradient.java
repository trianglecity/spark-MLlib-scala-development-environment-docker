package org.apache.spark.mllib.optimization;
/**
 * :: DeveloperApi ::
 * Compute gradient and loss for a multinomial logistic loss function, as used
 * in multi-class classification (it is also used in binary logistic regression).
 * <p>
 * In <code>The Elements of Statistical Learning: Data Mining, Inference, and Prediction, 2nd Edition</code>
 * by Trevor Hastie, Robert Tibshirani, and Jerome Friedman, which can be downloaded from
 * http://statweb.stanford.edu/~tibs/ElemStatLearn/ , Eq. (4.17) on page 119 gives the formula of
 * multinomial logistic regression model. A simple calculation shows that
 * <p>
 * <blockquote>
 *    $$
 *    P(y=0|x, w) = 1 / (1 + \sum_i^{K-1} \exp(x w_i))\\
 *    P(y=1|x, w) = exp(x w_1) / (1 + \sum_i^{K-1} \exp(x w_i))\\
 *    ...\\
 *    P(y=K-1|x, w) = exp(x w_{K-1}) / (1 + \sum_i^{K-1} \exp(x w_i))\\
 *    $$
 * </blockquote>
 * <p>
 * for K classes multiclass classification problem.
 * <p>
 * The model weights $w = (w_1, w_2, ..., w_{K-1})^T$ becomes a matrix which has dimension of
 * (K-1) * (N+1) if the intercepts are added. If the intercepts are not added, the dimension
 * will be (K-1) * N.
 * <p>
 * As a result, the loss of objective function for a single instance of data can be written as
 * <blockquote>
 *    $$
 *    \begin{align}
 *    l(w, x) &amp;= -log P(y|x, w) = -\alpha(y) log P(y=0|x, w) - (1-\alpha(y)) log P(y|x, w) \\
 *            &amp;= log(1 + \sum_i^{K-1}\exp(x w_i)) - (1-\alpha(y)) x w_{y-1} \\
 *            &amp;= log(1 + \sum_i^{K-1}\exp(margins_i)) - (1-\alpha(y)) margins_{y-1}
 *    \end{align}
 *    $$
 * </blockquote>
 * <p>
 * where $\alpha(i) = 1$ if $i \ne 0$, and
 *       $\alpha(i) = 0$ if $i == 0$,
 *       $margins_i = x w_i$.
 * <p>
 * For optimization, we have to calculate the first derivative of the loss function, and
 * a simple calculation shows that
 * <p>
 * <blockquote>
 *    $$
 *    \begin{align}
 *      \frac{\partial l(w, x)}{\partial w_{ij}} &amp;=
 *         (\exp(x w_i) / (1 + \sum_k^{K-1} \exp(x w_k)) - (1-\alpha(y)\delta_{y, i+1})) * x_j \\
 *                                               &amp;= multiplier_i * x_j
 *    \end{align}
 *    $$
 * </blockquote>
 * <p>
 * where $\delta_{i, j} = 1$ if $i == j$,
 *       $\delta_{i, j} = 0$ if $i != j$, and
 *       multiplier =
 *         $\exp(margins_i) / (1 + \sum_k^{K-1} \exp(margins_i)) - (1-\alpha(y)\delta_{y, i+1})$
 * <p>
 * If any of margins is larger than 709.78, the numerical computation of multiplier and loss
 * function will be suffered from arithmetic overflow. This issue occurs when there are outliers
 * in data which are far away from hyperplane, and this will cause the failing of training once
 * infinity / infinity is introduced. Note that this is only a concern when max(margins) &amp;gt; 0.
 * <p>
 * Fortunately, when max(margins) = maxMargin &amp;gt; 0, the loss function and the multiplier can be
 * easily rewritten into the following equivalent numerically stable formula.
 * <p>
 * <blockquote>
 *    $$
 *    \begin{align}
 *      l(w, x) &amp;= log(1 + \sum_i^{K-1}\exp(margins_i)) - (1-\alpha(y)) margins_{y-1} \\
 *              &amp;= log(\exp(-maxMargin) + \sum_i^{K-1}\exp(margins_i - maxMargin)) + maxMargin
 *                  - (1-\alpha(y)) margins_{y-1} \\
 *              &amp;= log(1 + sum) + maxMargin - (1-\alpha(y)) margins_{y-1}
 *    \end{align}
 *    $$
 * </blockquote>
 * <p>
 * where sum = $\exp(-maxMargin) + \sum_i^{K-1}\exp(margins_i - maxMargin) - 1$.
 * <p>
 * Note that each term, $(margins_i - maxMargin)$ in $\exp$ is smaller than zero; as a result,
 * overflow will not happen with this formula.
 * <p>
 * For multiplier, similar trick can be applied as the following,
 * <p>
 * <blockquote>
 *    $$
 *    \begin{align}
 *      multiplier
 *       &amp;= \exp(margins_i) /
 *           (1 + \sum_k^{K-1} \exp(margins_i)) - (1-\alpha(y)\delta_{y, i+1}) \\
 *       &amp;= \exp(margins_i - maxMargin) / (1 + sum) - (1-\alpha(y)\delta_{y, i+1})
 *    \end{align}
 *    $$
 * </blockquote>
 * <p>
 * where each term in $\exp$ is also smaller than zero, so overflow is not a concern.
 * <p>
 * For the detailed mathematical derivation, see the reference at
 * http://www.slideshare.net/dbtsai/2014-0620-mlor-36132297
 * <p>
 * param:  numClasses the number of possible outcomes for k classes classification problem in
 *                   Multinomial Logistic Regression. By default, it is binary logistic regression
 *                   so numClasses will be set to 2.
 */
public  class LogisticGradient extends org.apache.spark.mllib.optimization.Gradient {
  public   LogisticGradient (int numClasses)  { throw new RuntimeException(); }
  public   LogisticGradient ()  { throw new RuntimeException(); }
  public  double compute (org.apache.spark.mllib.linalg.Vector data, double label, org.apache.spark.mllib.linalg.Vector weights, org.apache.spark.mllib.linalg.Vector cumGradient)  { throw new RuntimeException(); }
}
