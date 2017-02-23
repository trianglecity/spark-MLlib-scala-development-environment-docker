package org.apache.spark.mllib.regression;
public  interface RegressionModel extends scala.Serializable {
  /**
   * Predict values for the given data set using the model trained.
   * <p>
   * @param testData RDD representing data points to be predicted
   * @return RDD[Double] where each entry contains the corresponding prediction
   * <p>
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> testData)  ;
  /**
   * Predict values for a single data point using the model trained.
   * <p>
   * @param testData array representing a single data point
   * @return Double prediction from the trained model
   * <p>
   */
  public  double predict (org.apache.spark.mllib.linalg.Vector testData)  ;
  /**
   * Predict values for examples stored in a JavaRDD.
   * @param testData JavaRDD representing data points to be predicted
   * @return a JavaRDD[java.lang.Double] where each entry contains the corresponding prediction
   * <p>
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Double> predict (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> testData)  ;
}
