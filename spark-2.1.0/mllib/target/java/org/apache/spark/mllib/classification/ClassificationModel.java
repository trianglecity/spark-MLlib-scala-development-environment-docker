package org.apache.spark.mllib.classification;
/**
 * Represents a classification model that predicts to which of a set of categories an example
 * belongs. The categories are represented by double values: 0.0, 1.0, 2.0, etc.
 */
public  interface ClassificationModel extends scala.Serializable {
  /**
   * Predict values for the given data set using the model trained.
   * <p>
   * @param testData RDD representing data points to be predicted
   * @return an RDD[Double] where each entry contains the corresponding prediction
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> testData)  ;
  /**
   * Predict values for a single data point using the model trained.
   * <p>
   * @param testData array representing a single data point
   * @return predicted category from the trained model
   */
  public  double predict (org.apache.spark.mllib.linalg.Vector testData)  ;
  /**
   * Predict values for examples stored in a JavaRDD.
   * @param testData JavaRDD representing data points to be predicted
   * @return a JavaRDD[java.lang.Double] where each entry contains the corresponding prediction
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Double> predict (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> testData)  ;
}
