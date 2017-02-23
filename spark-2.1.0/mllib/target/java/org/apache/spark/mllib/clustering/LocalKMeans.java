package org.apache.spark.mllib.clustering;
/**
 * An utility object to run K-means locally. This is private to the ML package because it's used
 * in the initialization of KMeans but not meant to be publicly exposed.
 */
public  class LocalKMeans {
  /**
   * Run K-means++ on the weighted point set <code>points</code>. This first does the K-means++
   * initialization procedure and then rounds of Lloyd's algorithm.
   * @param seed (undocumented)
   * @param points (undocumented)
   * @param weights (undocumented)
   * @param k (undocumented)
   * @param maxIterations (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.clustering.VectorWithNorm[] kMeansPlusPlus (int seed, org.apache.spark.mllib.clustering.VectorWithNorm[] points, double[] weights, int k, int maxIterations)  { throw new RuntimeException(); }
  static private <T extends java.lang.Object> T pickWeighted (scala.util.Random rand, java.lang.Object data, double[] weights)  { throw new RuntimeException(); }
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
