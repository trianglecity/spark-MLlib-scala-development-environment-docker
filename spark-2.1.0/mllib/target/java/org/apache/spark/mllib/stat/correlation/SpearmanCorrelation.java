package org.apache.spark.mllib.stat.correlation;
/**
 * Compute Spearman's correlation for two RDDs of the type RDD[Double] or the correlation matrix
 * for an RDD of the type RDD[Vector].
 * <p>
 * Definition of Spearman's correlation can be found at
 * http://en.wikipedia.org/wiki/Spearman's_rank_correlation_coefficient
 */
public  class SpearmanCorrelation {
  /**
   * Compute Spearman's correlation for two datasets.
   * @param x (undocumented)
   * @param y (undocumented)
   * @return (undocumented)
   */
  static public  double computeCorrelation (org.apache.spark.rdd.RDD<java.lang.Object> x, org.apache.spark.rdd.RDD<java.lang.Object> y)  { throw new RuntimeException(); }
  /**
   * Compute Spearman's correlation matrix S, for the input matrix, where S(i, j) is the
   * correlation between column i and j.
   * @param X (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.linalg.Matrix computeCorrelationMatrix (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> X)  { throw new RuntimeException(); }
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
