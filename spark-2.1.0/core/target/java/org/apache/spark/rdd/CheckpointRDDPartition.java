package org.apache.spark.rdd;
/**
 * An RDD partition used to recover checkpointed data.
 */
  class CheckpointRDDPartition implements org.apache.spark.Partition {
  public  int index ()  { throw new RuntimeException(); }
  // not preceding
  public   CheckpointRDDPartition (int index)  { throw new RuntimeException(); }
}
