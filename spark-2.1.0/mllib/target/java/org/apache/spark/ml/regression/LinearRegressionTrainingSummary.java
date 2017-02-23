package org.apache.spark.ml.regression;
/**
 * :: Experimental ::
 * Linear regression training results. Currently, the training summary ignores the
 * training weights except for the objective trace.
 * <p>
 * param:  predictions predictions output by the model's <code>transform</code> method.
 * param:  objectiveHistory objective function (scaled loss + regularization) at each iteration.
 */
public  class LinearRegressionTrainingSummary extends org.apache.spark.ml.regression.LinearRegressionSummary {
  public  double[] objectiveHistory ()  { throw new RuntimeException(); }
  // not preceding
     LinearRegressionTrainingSummary (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String predictionCol, java.lang.String labelCol, java.lang.String featuresCol, org.apache.spark.ml.regression.LinearRegressionModel model, double[] diagInvAtWA, double[] objectiveHistory)  { throw new RuntimeException(); }
  /**
   * Number of training iterations until termination
   * <p>
   * This value is only available when using the "l-bfgs" solver.
   * <p>
   * @see <code>LinearRegression.solver</code>
   * @return (undocumented)
   */
  public  int totalIterations ()  { throw new RuntimeException(); }
}
