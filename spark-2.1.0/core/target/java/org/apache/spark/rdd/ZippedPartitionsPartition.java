package org.apache.spark.rdd;
  class ZippedPartitionsPartition implements org.apache.spark.Partition {
  private  scala.collection.Seq<org.apache.spark.rdd.RDD<?>> rdds ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> preferredLocations ()  { throw new RuntimeException(); }
  // not preceding
  public   ZippedPartitionsPartition (int idx, scala.collection.Seq<org.apache.spark.rdd.RDD<?>> rdds, scala.collection.Seq<java.lang.String> preferredLocations)  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.Partition> partitionValues ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.Partition> partitions ()  { throw new RuntimeException(); }
  private  void writeObject (java.io.ObjectOutputStream oos) throws java.io.IOException { throw new RuntimeException(); }
}
