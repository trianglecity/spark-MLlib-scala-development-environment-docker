package org.apache.spark.streaming.scheduler;
/** Class representing the blocks of all the streams allocated to a batch */
  class AllocatedBlocks implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo>> streamIdToAllocatedBlocks ()  { throw new RuntimeException(); }
  // not preceding
  public   AllocatedBlocks (scala.collection.immutable.Map<java.lang.Object, scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo>> streamIdToAllocatedBlocks)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo> getBlocksOfStream (int streamId)  { throw new RuntimeException(); }
}
