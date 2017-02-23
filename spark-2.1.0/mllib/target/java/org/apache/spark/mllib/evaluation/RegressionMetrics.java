package org.apache.spark.mllib.evaluation;
/**
 * Evaluator for regression.
 * <p>
 * param:  predictionAndObservations an RDD of (prediction, observation) pairs
 * param:  throughOrigin True if the regression is through the origin. For example, in linear
 *                      regression, it will be true without fitting intercept.
 */
public  class RegressionMetrics implements org.apache.spark.internal.Logging {
  public   RegressionMetrics (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> predictionAndObservations, boolean throughOrigin)  { throw new RuntimeException(); }
  public   RegressionMetrics (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> predictionAndObservations)  { throw new RuntimeException(); }
  /**
   * An auxiliary constructor taking a DataFrame.
   * @param predictionAndObservations a DataFrame with two double columns:
   *                                  prediction and observation
   */
     RegressionMetrics (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictionAndObservations)  { throw new RuntimeException(); }
  /**
   * Use MultivariateOnlineSummarizer to calculate summary statistics of observations and errors.
   * @return (undocumented)
   */
  private  org.apache.spark.mllib.stat.MultivariateStatisticalSummary summary ()  { throw new RuntimeException(); }
  private  double SSy ()  { throw new RuntimeException(); }
  private  double SSerr ()  { throw new RuntimeException(); }
  private  double SStot ()  { throw new RuntimeException(); }
  private  double SSreg ()  { throw new RuntimeException(); }
  /**
   * Returns the variance explained by regression.
   * explainedVariance = $\sum_i (\hat{y_i} - \bar{y})^2^ / n$
   * @see <a href="https://en.wikipedia.org/wiki/Fraction_of_variance_unexplained">
   * Fraction of variance unexplained (Wikipedia)</a>
   * @return (undocumented)
   */
  public  double explainedVariance ()  { throw new RuntimeException(); }
  /**
   * Returns the mean absolute error, which is a risk function corresponding to the
   * expected value of the absolute error loss or l1-norm loss.
   * @return (undocumented)
   */
  public  double meanAbsoluteError ()  { throw new RuntimeException(); }
  /**
   * Returns the mean squared error, which is a risk function corresponding to the
   * expected value of the squared error loss or quadratic loss.
   * @return (undocumented)
   */
  public  double meanSquaredError ()  { throw new RuntimeException(); }
  /**
   * Returns the root mean squared error, which is defined as the square root of
   * the mean squared error.
   * @return (undocumented)
   */
  public  double rootMeanSquaredError ()  { throw new RuntimeException(); }
  /**
   * Returns R^2^, the unadjusted coefficient of determination.
   * @see <a href="http://en.wikipedia.org/wiki/Coefficient_of_determination">
   * Coefficient of determination (Wikipedia)</a>
   * In case of regression through the origin, the definition of R^2^ is to be modified.
   * @see <a href="https://online.stat.psu.edu/~ajw13/stat501/SpecialTopics/Reg_thru_origin.pdf">
   * J. G. Eisenhauer, Regression through the Origin. Teaching Statistics 25, 76-80 (2003)</a>
   * @return (undocumented)
   */
  public  double r2 ()  { throw new RuntimeException(); }
}
