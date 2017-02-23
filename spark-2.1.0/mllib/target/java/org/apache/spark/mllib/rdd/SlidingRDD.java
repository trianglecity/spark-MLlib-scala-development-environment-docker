package org.apache.spark.mllib.rdd;
/**
 * Represents an RDD from grouping items of its parent RDD in fixed size blocks by passing a sliding
 * window over them. The ordering is first based on the partition index and then the ordering of
 * items within each partition. This is similar to sliding in Scala collections, except that it
 * becomes an empty RDD if the window size is greater than the total number of items. It needs to
 * trigger a Spark job if the parent RDD has more than one partitions. To make this operation
 * efficient, the number of items per partition should be larger than the window size and the
 * window size should be small, e.g., 2.
 * <p>
 * param:  parent the parent RDD
 * param:  windowSize the window size, must be greater than 1
 * param:  step step size for windows
 * <p>
 * @see <code>org.apache.spark.mllib.rdd.RDDFunctions.sliding(Int, Int)*</code>
 * @see <code>scala.collection.IterableLike.sliding(Int, Int)*</code>
 */
  class SlidingRDD<T extends java.lang.Object> extends org.apache.spark.rdd.RDD<java.lang.Object> {
  public  org.apache.spark.rdd.RDD<T> parent ()  { throw new RuntimeException(); }
  public  int windowSize ()  { throw new RuntimeException(); }
  public  int step ()  { throw new RuntimeException(); }
  // not preceding
  public   SlidingRDD (org.apache.spark.rdd.RDD<T> parent, int windowSize, int step, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
}
