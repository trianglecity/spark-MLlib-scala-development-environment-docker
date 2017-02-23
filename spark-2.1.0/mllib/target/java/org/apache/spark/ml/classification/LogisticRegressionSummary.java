package org.apache.spark.ml.classification;
/**
 * Abstraction for Logistic Regression Results for a given model.
 */
public  interface LogisticRegressionSummary extends scala.Serializable {
  /**
   * Dataframe output by the model's <code>transform</code> method.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions ()  ;
  /** Field in "predictions" which gives the probability of each class as a vector. */
  public  java.lang.String probabilityCol ()  ;
  /** Field in "predictions" which gives the true label of each instance (if available). */
  public  java.lang.String labelCol ()  ;
  /** Field in "predictions" which gives the features of each instance as a vector. */
  public  java.lang.String featuresCol ()  ;
}
