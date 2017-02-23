package org.apache.spark.rdd;
/**
 * ::DeveloperApi::
 * A group of <code>Partition</code>s
 * param:  prefLoc preferred location for the partition group
 */
public  class PartitionGroup {
  public  scala.Option<java.lang.String> prefLoc ()  { throw new RuntimeException(); }
  // not preceding
  public   PartitionGroup (scala.Option<java.lang.String> prefLoc)  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.Partition> partitions ()  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
}
