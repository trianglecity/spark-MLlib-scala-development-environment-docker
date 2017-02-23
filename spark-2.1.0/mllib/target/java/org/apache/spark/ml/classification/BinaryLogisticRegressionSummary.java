package org.apache.spark.ml.classification;
/**
 * :: Experimental ::
 * Binary Logistic regression results for a given model.
 * <p>
 * param:  predictions dataframe output by the model's <code>transform</code> method.
 * param:  probabilityCol field in "predictions" which gives the probability of
 *                       each class as a vector.
 * param:  labelCol field in "predictions" which gives the true label of each instance.
 * param:  featuresCol field in "predictions" which gives the features of each instance as a vector.
 */
public  class BinaryLogisticRegressionSummary implements org.apache.spark.ml.classification.LogisticRegressionSummary {
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions ()  { throw new RuntimeException(); }
  public  java.lang.String probabilityCol ()  { throw new RuntimeException(); }
  public  java.lang.String labelCol ()  { throw new RuntimeException(); }
  public  java.lang.String featuresCol ()  { throw new RuntimeException(); }
  // not preceding
     BinaryLogisticRegressionSummary (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String probabilityCol, java.lang.String labelCol, java.lang.String featuresCol)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  /**
   * Returns a BinaryClassificationMetrics object.
   * @return (undocumented)
   */
  private  org.apache.spark.mllib.evaluation.BinaryClassificationMetrics binaryMetrics ()  { throw new RuntimeException(); }
  /**
   * Returns the receiver operating characteristic (ROC) curve,
   * which is a Dataframe having two fields (FPR, TPR)
   * with (0.0, 0.0) prepended and (1.0, 1.0) appended to it.
   * See http://en.wikipedia.org/wiki/Receiver_operating_characteristic
   * <p>
   * @note This ignores instance weights (setting all to 1.0) from <code>LogisticRegression.weightCol</code>.
   * This will change in later Spark versions.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> roc ()  { throw new RuntimeException(); }
  /**
   * Computes the area under the receiver operating characteristic (ROC) curve.
   * <p>
   * @note This ignores instance weights (setting all to 1.0) from <code>LogisticRegression.weightCol</code>.
   * This will change in later Spark versions.
   * @return (undocumented)
   */
  public  double areaUnderROC ()  { throw new RuntimeException(); }
  /**
   * Returns the precision-recall curve, which is a Dataframe containing
   * two fields recall, precision with (0.0, 1.0) prepended to it.
   * <p>
   * @note This ignores instance weights (setting all to 1.0) from <code>LogisticRegression.weightCol</code>.
   * This will change in later Spark versions.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> pr ()  { throw new RuntimeException(); }
  /**
   * Returns a dataframe with two fields (threshold, F-Measure) curve with beta = 1.0.
   * <p>
   * @note This ignores instance weights (setting all to 1.0) from <code>LogisticRegression.weightCol</code>.
   * This will change in later Spark versions.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> fMeasureByThreshold ()  { throw new RuntimeException(); }
  /**
   * Returns a dataframe with two fields (threshold, precision) curve.
   * Every possible probability obtained in transforming the dataset are used
   * as thresholds used in calculating the precision.
   * <p>
   * @note This ignores instance weights (setting all to 1.0) from <code>LogisticRegression.weightCol</code>.
   * This will change in later Spark versions.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> precisionByThreshold ()  { throw new RuntimeException(); }
  /**
   * Returns a dataframe with two fields (threshold, recall) curve.
   * Every possible probability obtained in transforming the dataset are used
   * as thresholds used in calculating the recall.
   * <p>
   * @note This ignores instance weights (setting all to 1.0) from <code>LogisticRegression.weightCol</code>.
   * This will change in later Spark versions.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> recallByThreshold ()  { throw new RuntimeException(); }
}
