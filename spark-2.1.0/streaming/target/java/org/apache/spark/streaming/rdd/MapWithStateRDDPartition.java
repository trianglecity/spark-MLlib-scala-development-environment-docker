package org.apache.spark.streaming.rdd;
/**
 * Partition of the {@link MapWithStateRDD}, which depends on corresponding partitions of prev state
 * RDD, and a partitioned keyed-data RDD
 */
  class MapWithStateRDDPartition implements org.apache.spark.Partition {
  public  int index ()  { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDD<?> prevStateRDD ()  { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDD<?> partitionedDataRDD ()  { throw new RuntimeException(); }
  // not preceding
  public   MapWithStateRDDPartition (int index, org.apache.spark.rdd.RDD<?> prevStateRDD, org.apache.spark.rdd.RDD<?> partitionedDataRDD)  { throw new RuntimeException(); }
    org.apache.spark.Partition previousSessionRDDPartition ()  { throw new RuntimeException(); }
    org.apache.spark.Partition partitionedDataRDDPartition ()  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  private  void writeObject (java.io.ObjectOutputStream oos) throws java.io.IOException { throw new RuntimeException(); }
}
