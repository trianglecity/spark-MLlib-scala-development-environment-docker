package org.apache.spark.ml.regression;
/**
 * AFTAggregator computes the gradient and loss for a AFT loss function,
 * as used in AFT survival regression for samples in sparse or dense vector in an online fashion.
 * <p>
 * The loss function and likelihood function under the AFT model based on:
 * Lawless, J. F., Statistical Models and Methods for Lifetime Data,
 * New York: John Wiley &amp; Sons, Inc. 2003.
 * <p>
 * Two AFTAggregator can be merged together to have a summary of loss and gradient of
 * the corresponding joint dataset.
 * <p>
 * Given the values of the covariates $x^{'}$, for random lifetime $t_{i}$ of subjects i = 1,..,n,
 * with possible right-censoring, the likelihood function under the AFT model is given as
 * <p>
 * <blockquote>
 *    $$
 *    L(\beta,\sigma)=\prod_{i=1}^n[\frac{1}{\sigma}f_{0}
 *      (\frac{\log{t_{i}}-x^{'}\beta}{\sigma})]^{\delta_{i}}S_{0}
 *    (\frac{\log{t_{i}}-x^{'}\beta}{\sigma})^{1-\delta_{i}}
 *    $$
 * </blockquote>
 * <p>
 * Where $\delta_{i}$ is the indicator of the event has occurred i.e. uncensored or not.
 * Using $\epsilon_{i}=\frac{\log{t_{i}}-x^{'}\beta}{\sigma}$, the log-likelihood function
 * assumes the form
 * <p>
 * <blockquote>
 *    $$
 *    \iota(\beta,\sigma)=\sum_{i=1}^{n}[-\delta_{i}\log\sigma+
 *    \delta_{i}\log{f_{0}}(\epsilon_{i})+(1-\delta_{i})\log{S_{0}(\epsilon_{i})}]
 *    $$
 * </blockquote>
 * Where $S_{0}(\epsilon_{i})$ is the baseline survivor function,
 * and $f_{0}(\epsilon_{i})$ is corresponding density function.
 * <p>
 * The most commonly used log-linear survival regression method is based on the Weibull
 * distribution of the survival time. The Weibull distribution for lifetime corresponding
 * to extreme value distribution for log of the lifetime,
 * and the $S_{0}(\epsilon)$ function is
 * <p>
 * <blockquote>
 *    $$
 *    S_{0}(\epsilon_{i})=\exp(-e^{\epsilon_{i}})
 *    $$
 * </blockquote>
 * <p>
 * and the $f_{0}(\epsilon_{i})$ function is
 * <p>
 * <blockquote>
 *    $$
 *    f_{0}(\epsilon_{i})=e^{\epsilon_{i}}\exp(-e^{\epsilon_{i}})
 *    $$
 * </blockquote>
 * <p>
 * The log-likelihood function for Weibull distribution of lifetime is
 * <p>
 * <blockquote>
 *    $$
 *    \iota(\beta,\sigma)=
 *    -\sum_{i=1}^n[\delta_{i}\log\sigma-\delta_{i}\epsilon_{i}+e^{\epsilon_{i}}]
 *    $$
 * </blockquote>
 * <p>
 * Due to minimizing the negative log-likelihood equivalent to maximum a posteriori probability,
 * the loss function we use to optimize is $-\iota(\beta,\sigma)$.
 * The gradient functions for $\beta$ and $\log\sigma$ respectively are
 * <p>
 * <blockquote>
 *    $$
 *    \frac{\partial (-\iota)}{\partial \beta}=
 *    \sum_{1=1}^{n}[\delta_{i}-e^{\epsilon_{i}}]\frac{x_{i}}{\sigma} \\
 * <p>
 *    \frac{\partial (-\iota)}{\partial (\log\sigma)}=
 *    \sum_{i=1}^{n}[\delta_{i}+(\delta_{i}-e^{\epsilon_{i}})\epsilon_{i}]
 *    $$
 * </blockquote>
 * <p>
 * param:  bcParameters The broadcasted value includes three part: The log of scale parameter,
 *                     the intercept and regression coefficients corresponding to the features.
 * param:  fitIntercept Whether to fit an intercept term.
 * param:  bcFeaturesStd The broadcast standard deviation values of the features.
 */
public  class AFTAggregator implements scala.Serializable {
  public   AFTAggregator (org.apache.spark.broadcast.Broadcast<breeze.linalg.DenseVector<java.lang.Object>> bcParameters, boolean fitIntercept, org.apache.spark.broadcast.Broadcast<double[]> bcFeaturesStd)  { throw new RuntimeException(); }
  private  int length ()  { throw new RuntimeException(); }
  private  breeze.linalg.DenseVector<java.lang.Object> parameters ()  { throw new RuntimeException(); }
  private  breeze.linalg.DenseVector<java.lang.Object> coefficients ()  { throw new RuntimeException(); }
  private  double intercept ()  { throw new RuntimeException(); }
  private  double sigma ()  { throw new RuntimeException(); }
  private  long totalCnt ()  { throw new RuntimeException(); }
  private  double lossSum ()  { throw new RuntimeException(); }
  private  double[] gradientSumArray ()  { throw new RuntimeException(); }
  public  long count ()  { throw new RuntimeException(); }
  public  double loss ()  { throw new RuntimeException(); }
  public  breeze.linalg.DenseVector<java.lang.Object> gradient ()  { throw new RuntimeException(); }
  /**
   * Add a new training data to this AFTAggregator, and update the loss and gradient
   * of the objective function.
   * <p>
   * @param data The AFTPoint representation for one data point to be added into this aggregator.
   * @return This AFTAggregator object.
   */
  public  org.apache.spark.ml.regression.AFTAggregator add (org.apache.spark.ml.regression.AFTPoint data)  { throw new RuntimeException(); }
  /**
   * Merge another AFTAggregator, and update the loss and gradient
   * of the objective function.
   * (Note that it's in place merging; as a result, <code>this</code> object will be modified.)
   * <p>
   * @param other The other AFTAggregator to be merged.
   * @return This AFTAggregator object.
   */
  public  org.apache.spark.ml.regression.AFTAggregator merge (org.apache.spark.ml.regression.AFTAggregator other)  { throw new RuntimeException(); }
}
