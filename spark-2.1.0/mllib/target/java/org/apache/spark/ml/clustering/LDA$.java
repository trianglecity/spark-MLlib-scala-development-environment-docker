package org.apache.spark.ml.clustering;
public  class LDA$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.clustering.LDA>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LDA$ MODULE$ = null;
  public   LDA$ ()  { throw new RuntimeException(); }
  /** Get dataset for spark.mllib LDA */
    org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> getOldDataset (org.apache.spark.sql.Dataset<?> dataset, java.lang.String featuresCol)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.LDA> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.LDA load (java.lang.String path)  { throw new RuntimeException(); }
}
