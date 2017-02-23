package org.apache.spark.mllib.stat.correlation;
/**
 * Compute Pearson correlation for two RDDs of the type RDD[Double] or the correlation matrix
 * for an RDD of the type RDD[Vector].
 * <p>
 * Definition of Pearson correlation can be found at
 * http://en.wikipedia.org/wiki/Pearson_product-moment_correlation_coefficient
 */
public  class PearsonCorrelation {
  /**
   * Compute the Pearson correlation for two datasets. NaN if either vector has 0 variance.
   * @param x (undocumented)
   * @param y (undocumented)
   * @return (undocumented)
   */
  static public  double computeCorrelation (org.apache.spark.rdd.RDD<java.lang.Object> x, org.apache.spark.rdd.RDD<java.lang.Object> y)  { throw new RuntimeException(); }
  /**
   * Compute the Pearson correlation matrix S, for the input matrix, where S(i, j) is the
   * correlation between column i and j. 0 covariance results in a correlation value of Double.NaN.
   * @param X (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.linalg.Matrix computeCorrelationMatrix (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> X)  { throw new RuntimeException(); }
  /**
   * Compute the Pearson correlation matrix from the covariance matrix.
   * 0 variance results in a correlation value of Double.NaN.
   * @param covarianceMatrix (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.linalg.Matrix computeCorrelationMatrixFromCovariance (org.apache.spark.mllib.linalg.Matrix covarianceMatrix)  { throw new RuntimeException(); }
  static private  boolean closeToZero (double value, double threshold)  { throw new RuntimeException(); }
  static public  double computeCorrelationWithMatrixImpl (org.apache.spark.rdd.RDD<java.lang.Object> x, org.apache.spark.rdd.RDD<java.lang.Object> y)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
}
