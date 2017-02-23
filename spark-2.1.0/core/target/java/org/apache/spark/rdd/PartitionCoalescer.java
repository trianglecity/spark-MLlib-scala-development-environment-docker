package org.apache.spark.rdd;
/**
 * ::DeveloperApi::
 * A PartitionCoalescer defines how to coalesce the partitions of a given RDD.
 */
public  interface PartitionCoalescer {
  /**
   * Coalesce the partitions of the given RDD.
   * <p>
   * @param maxPartitions the maximum number of partitions to have after coalescing
   * @param parent the parent RDD whose partitions to coalesce
   * @return an array of {@link PartitionGroup}s, where each element is itself an array of
   * <code>Partition</code>s and represents a partition after coalescing is performed.
   */
  public  org.apache.spark.rdd.PartitionGroup[] coalesce (int maxPartitions, org.apache.spark.rdd.RDD<?> parent)  ;
}
