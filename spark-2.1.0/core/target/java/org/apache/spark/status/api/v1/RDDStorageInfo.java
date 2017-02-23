package org.apache.spark.status.api.v1;
public  class RDDStorageInfo {
  public  int id ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  public  int numCachedPartitions ()  { throw new RuntimeException(); }
  public  java.lang.String storageLevel ()  { throw new RuntimeException(); }
  public  long memoryUsed ()  { throw new RuntimeException(); }
  public  long diskUsed ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<org.apache.spark.status.api.v1.RDDDataDistribution>> dataDistribution ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<org.apache.spark.status.api.v1.RDDPartitionInfo>> partitions ()  { throw new RuntimeException(); }
  // not preceding
     RDDStorageInfo (int id, java.lang.String name, int numPartitions, int numCachedPartitions, java.lang.String storageLevel, long memoryUsed, long diskUsed, scala.Option<scala.collection.Seq<org.apache.spark.status.api.v1.RDDDataDistribution>> dataDistribution, scala.Option<scala.collection.Seq<org.apache.spark.status.api.v1.RDDPartitionInfo>> partitions)  { throw new RuntimeException(); }
}
