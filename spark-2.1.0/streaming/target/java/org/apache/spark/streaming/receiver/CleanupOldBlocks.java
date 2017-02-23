package org.apache.spark.streaming.receiver;
  class CleanupOldBlocks implements org.apache.spark.streaming.receiver.ReceiverMessage, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time threshTime ()  { throw new RuntimeException(); }
  // not preceding
  public   CleanupOldBlocks (org.apache.spark.streaming.Time threshTime)  { throw new RuntimeException(); }
}
