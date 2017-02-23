package org.apache.spark.ml.r;
public  class GBTRegressorWrapper$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.r.GBTRegressorWrapper> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GBTRegressorWrapper$ MODULE$ = null;
  public   GBTRegressorWrapper$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.r.GBTRegressorWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, int maxDepth, int maxBins, int maxIter, double stepSize, int minInstancesPerNode, double minInfoGain, int checkpointInterval, java.lang.String lossType, java.lang.String seed, double subsamplingRate, int maxMemoryInMB, boolean cacheNodeIds)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.GBTRegressorWrapper> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.r.GBTRegressorWrapper load (java.lang.String path)  { throw new RuntimeException(); }
}
