package org.apache.spark.ml.regression;
/**
 * :: Experimental ::
 * Linear regression results evaluated on a dataset.
 * <p>
 * param:  predictions predictions output by the model's <code>transform</code> method.
 * param:  predictionCol Field in "predictions" which gives the predicted value of the label at
 *                      each instance.
 * param:  labelCol Field in "predictions" which gives the true label of each instance.
 * param:  featuresCol Field in "predictions" which gives the features of each instance as a vector.
 */
public  class LinearRegressionSummary implements scala.Serializable {
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions ()  { throw new RuntimeException(); }
  public  java.lang.String predictionCol ()  { throw new RuntimeException(); }
  public  java.lang.String labelCol ()  { throw new RuntimeException(); }
  public  java.lang.String featuresCol ()  { throw new RuntimeException(); }
  private  org.apache.spark.ml.regression.LinearRegressionModel privateModel ()  { throw new RuntimeException(); }
  private  double[] diagInvAtWA ()  { throw new RuntimeException(); }
  // not preceding
     LinearRegressionSummary (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String predictionCol, java.lang.String labelCol, java.lang.String featuresCol, org.apache.spark.ml.regression.LinearRegressionModel privateModel, double[] diagInvAtWA)  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.evaluation.RegressionMetrics metrics ()  { throw new RuntimeException(); }
  /**
   * Returns the explained variance regression score.
   * explainedVariance = 1 - variance(y - \hat{y}) / variance(y)
   * Reference: <a href="http://en.wikipedia.org/wiki/Explained_variation">
   * Wikipedia explain variation</a>
   * <p>
   * @note This ignores instance weights (setting all to 1.0) from <code>LinearRegression.weightCol</code>.
   * This will change in later Spark versions.
   * @return (undocumented)
   */
  public  double explainedVariance ()  { throw new RuntimeException(); }
  /**
   * Returns the mean absolute error, which is a risk function corresponding to the
   * expected value of the absolute error loss or l1-norm loss.
   * <p>
   * @note This ignores instance weights (setting all to 1.0) from <code>LinearRegression.weightCol</code>.
   * This will change in later Spark versions.
   * @return (undocumented)
   */
  public  double meanAbsoluteError ()  { throw new RuntimeException(); }
  /**
   * Returns the mean squared error, which is a risk function corresponding to the
   * expected value of the squared error loss or quadratic loss.
   * <p>
   * @note This ignores instance weights (setting all to 1.0) from <code>LinearRegression.weightCol</code>.
   * This will change in later Spark versions.
   * @return (undocumented)
   */
  public  double meanSquaredError ()  { throw new RuntimeException(); }
  /**
   * Returns the root mean squared error, which is defined as the square root of
   * the mean squared error.
   * <p>
   * @note This ignores instance weights (setting all to 1.0) from <code>LinearRegression.weightCol</code>.
   * This will change in later Spark versions.
   * @return (undocumented)
   */
  public  double rootMeanSquaredError ()  { throw new RuntimeException(); }
  /**
   * Returns R^2^, the coefficient of determination.
   * Reference: <a href="http://en.wikipedia.org/wiki/Coefficient_of_determination">
   * Wikipedia coefficient of determination</a>
   * <p>
   * @note This ignores instance weights (setting all to 1.0) from <code>LinearRegression.weightCol</code>.
   * This will change in later Spark versions.
   * @return (undocumented)
   */
  public  double r2 ()  { throw new RuntimeException(); }
  /** Residuals (label - predicted value) */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> residuals ()  { throw new RuntimeException(); }
  /** Number of instances in DataFrame predictions */
  public  long numInstances ()  { throw new RuntimeException(); }
  /** Degrees of freedom */
  private  long degreesOfFreedom ()  { throw new RuntimeException(); }
  /**
   * The weighted residuals, the usual residuals rescaled by
   * the square root of the instance weights.
   * @return (undocumented)
   */
  public  double[] devianceResiduals ()  { throw new RuntimeException(); }
  /**
   * Standard error of estimated coefficients and intercept.
   * This value is only available when using the "normal" solver.
   * <p>
   * If <code>LinearRegression.fitIntercept</code> is set to true,
   * then the last element returned corresponds to the intercept.
   * <p>
   * @see <code>LinearRegression.solver</code>
   * @return (undocumented)
   */
  public  double[] coefficientStandardErrors ()  { throw new RuntimeException(); }
  /**
   * T-statistic of estimated coefficients and intercept.
   * This value is only available when using the "normal" solver.
   * <p>
   * If <code>LinearRegression.fitIntercept</code> is set to true,
   * then the last element returned corresponds to the intercept.
   * <p>
   * @see <code>LinearRegression.solver</code>
   * @return (undocumented)
   */
  public  double[] tValues ()  { throw new RuntimeException(); }
  /**
   * Two-sided p-value of estimated coefficients and intercept.
   * This value is only available when using the "normal" solver.
   * <p>
   * If <code>LinearRegression.fitIntercept</code> is set to true,
   * then the last element returned corresponds to the intercept.
   * <p>
   * @see <code>LinearRegression.solver</code>
   * @return (undocumented)
   */
  public  double[] pValues ()  { throw new RuntimeException(); }
}
