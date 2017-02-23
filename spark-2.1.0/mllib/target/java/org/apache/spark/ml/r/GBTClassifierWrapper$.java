package org.apache.spark.ml.r;
public  class GBTClassifierWrapper$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.r.GBTClassifierWrapper> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GBTClassifierWrapper$ MODULE$ = null;
  public   GBTClassifierWrapper$ ()  { throw new RuntimeException(); }
  public  java.lang.String PREDICTED_LABEL_INDEX_COL ()  { throw new RuntimeException(); }
  public  java.lang.String PREDICTED_LABEL_COL ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.r.GBTClassifierWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, int maxDepth, int maxBins, int maxIter, double stepSize, int minInstancesPerNode, double minInfoGain, int checkpointInterval, java.lang.String lossType, java.lang.String seed, double subsamplingRate, int maxMemoryInMB, boolean cacheNodeIds)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.GBTClassifierWrapper> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.r.GBTClassifierWrapper load (java.lang.String path)  { throw new RuntimeException(); }
}
