package org.apache.spark.ml.r;
public  class ALSWrapper$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.r.ALSWrapper> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ALSWrapper$ MODULE$ = null;
  public   ALSWrapper$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.r.ALSWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String ratingCol, java.lang.String userCol, java.lang.String itemCol, int rank, double regParam, int maxIter, boolean implicitPrefs, double alpha, boolean nonnegative, int numUserBlocks, int numItemBlocks, int checkpointInterval, int seed)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.ALSWrapper> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.r.ALSWrapper load (java.lang.String path)  { throw new RuntimeException(); }
}
