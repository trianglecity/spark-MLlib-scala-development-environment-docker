package org.apache.spark.sql.execution;
/**
 * The {@link Partition} used by {@link ShuffledRowRDD}. A post-shuffle partition
 * (identified by <code>postShufflePartitionIndex</code>) contains a range of pre-shuffle partitions
 * (<code>startPreShufflePartitionIndex</code> to <code>endPreShufflePartitionIndex - 1</code>, inclusive).
 */
public final class ShuffledRowRDDPartition implements org.apache.spark.Partition {
  public  int postShufflePartitionIndex ()  { throw new RuntimeException(); }
  public  int startPreShufflePartitionIndex ()  { throw new RuntimeException(); }
  public  int endPreShufflePartitionIndex ()  { throw new RuntimeException(); }
  // not preceding
  public   ShuffledRowRDDPartition (int postShufflePartitionIndex, int startPreShufflePartitionIndex, int endPreShufflePartitionIndex)  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
}
