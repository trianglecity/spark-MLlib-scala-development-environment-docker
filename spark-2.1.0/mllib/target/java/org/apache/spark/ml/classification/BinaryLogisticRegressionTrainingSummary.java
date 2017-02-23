package org.apache.spark.ml.classification;
/**
 * :: Experimental ::
 * Logistic regression training results.
 * <p>
 * param:  predictions dataframe output by the model's <code>transform</code> method.
 * param:  probabilityCol field in "predictions" which gives the probability of
 *                       each class as a vector.
 * param:  labelCol field in "predictions" which gives the true label of each instance.
 * param:  featuresCol field in "predictions" which gives the features of each instance as a vector.
 * param:  objectiveHistory objective function (scaled loss + regularization) at each iteration.
 */
public  class BinaryLogisticRegressionTrainingSummary extends org.apache.spark.ml.classification.BinaryLogisticRegressionSummary implements org.apache.spark.ml.classification.LogisticRegressionTrainingSummary {
  public  double[] objectiveHistory ()  { throw new RuntimeException(); }
  // not preceding
     BinaryLogisticRegressionTrainingSummary (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String probabilityCol, java.lang.String labelCol, java.lang.String featuresCol, double[] objectiveHistory)  { throw new RuntimeException(); }
}
