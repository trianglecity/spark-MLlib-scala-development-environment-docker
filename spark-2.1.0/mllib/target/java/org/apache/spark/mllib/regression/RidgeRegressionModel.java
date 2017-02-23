package org.apache.spark.mllib.regression;
/**
 * Regression model trained using RidgeRegression.
 * <p>
 * param:  weights Weights computed for every feature.
 * param:  intercept Intercept computed for this model.
 * <p>
 */
public  class RidgeRegressionModel extends org.apache.spark.mllib.regression.GeneralizedLinearModel implements org.apache.spark.mllib.regression.RegressionModel, scala.Serializable, org.apache.spark.mllib.util.Saveable, org.apache.spark.mllib.pmml.PMMLExportable {
  static public  org.apache.spark.mllib.regression.RidgeRegressionModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> testData)  { throw new RuntimeException(); }
  static public  double predict (org.apache.spark.mllib.linalg.Vector testData)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public abstract  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> testData)  ;
  static public abstract  double predict (org.apache.spark.mllib.linalg.Vector testData)  ;
  static public  org.apache.spark.api.java.JavaRDD<java.lang.Double> predict (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> testData)  { throw new RuntimeException(); }
  static public  void toPMML (java.lang.String localPath)  { throw new RuntimeException(); }
  static public  void toPMML (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  static public  void toPMML (java.io.OutputStream outputStream)  { throw new RuntimeException(); }
  static public  java.lang.String toPMML ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector weights ()  { throw new RuntimeException(); }
  public  double intercept ()  { throw new RuntimeException(); }
  // not preceding
  public   RidgeRegressionModel (org.apache.spark.mllib.linalg.Vector weights, double intercept)  { throw new RuntimeException(); }
  protected  double predictPoint (org.apache.spark.mllib.linalg.Vector dataMatrix, org.apache.spark.mllib.linalg.Vector weightMatrix, double intercept)  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  protected  java.lang.String formatVersion ()  { throw new RuntimeException(); }
}
