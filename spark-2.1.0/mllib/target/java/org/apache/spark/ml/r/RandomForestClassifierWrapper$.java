package org.apache.spark.ml.r;
public  class RandomForestClassifierWrapper$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.r.RandomForestClassifierWrapper> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RandomForestClassifierWrapper$ MODULE$ = null;
  public   RandomForestClassifierWrapper$ ()  { throw new RuntimeException(); }
  public  java.lang.String PREDICTED_LABEL_INDEX_COL ()  { throw new RuntimeException(); }
  public  java.lang.String PREDICTED_LABEL_COL ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.r.RandomForestClassifierWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, int maxDepth, int maxBins, int numTrees, java.lang.String impurity, int minInstancesPerNode, double minInfoGain, int checkpointInterval, java.lang.String featureSubsetStrategy, java.lang.String seed, double subsamplingRate, int maxMemoryInMB, boolean cacheNodeIds)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.RandomForestClassifierWrapper> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.r.RandomForestClassifierWrapper load (java.lang.String path)  { throw new RuntimeException(); }
}
