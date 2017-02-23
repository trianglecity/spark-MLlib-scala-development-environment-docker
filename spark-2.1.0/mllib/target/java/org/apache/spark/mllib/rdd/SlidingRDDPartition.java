package org.apache.spark.mllib.rdd;
  class SlidingRDDPartition<T extends java.lang.Object> implements org.apache.spark.Partition, scala.Serializable {
  public  int idx ()  { throw new RuntimeException(); }
  public  org.apache.spark.Partition prev ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<T> tail ()  { throw new RuntimeException(); }
  public  int offset ()  { throw new RuntimeException(); }
  // not preceding
  public   SlidingRDDPartition (int idx, org.apache.spark.Partition prev, scala.collection.Seq<T> tail, int offset)  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
}
