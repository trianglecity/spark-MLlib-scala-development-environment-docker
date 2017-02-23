package org.apache.spark.rdd;
/**
 * A dummy CheckpointRDD that exists to provide informative error messages during failures.
 * <p>
 * This is simply a placeholder because the original checkpointed RDD is expected to be
 * fully cached. Only if an executor fails or if the user explicitly unpersists the original
 * RDD will Spark ever attempt to compute this CheckpointRDD. When this happens, however,
 * we must provide an informative error message.
 * <p>
 * param:  sc the active SparkContext
 * param:  rddId the ID of the checkpointed RDD
 * param:  numPartitions the number of partitions in the checkpointed RDD
 */
  class LocalCheckpointRDD<T extends java.lang.Object> extends org.apache.spark.rdd.CheckpointRDD<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   LocalCheckpointRDD (org.apache.spark.SparkContext sc, int rddId, int numPartitions, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public   LocalCheckpointRDD (org.apache.spark.rdd.RDD<T> rdd, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  protected  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  /**
   * Throw an exception indicating that the relevant block is not found.
   * <p>
   * This should only be called if the original RDD is explicitly unpersisted or if an
   * executor is lost. Under normal circumstances, however, the original RDD (our child)
   * is expected to be fully cached and so all partitions should already be computed and
   * available in the block storage.
   * @param partition (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<T> compute (org.apache.spark.Partition partition, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
