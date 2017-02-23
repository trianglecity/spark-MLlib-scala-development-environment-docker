package org.apache.spark.streaming.receiver;
/** class representing a block received as an ArrayBuffer */
  class ArrayBufferBlock implements org.apache.spark.streaming.receiver.ReceivedBlock, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<?> arrayBuffer ()  { throw new RuntimeException(); }
  // not preceding
  public   ArrayBufferBlock (scala.collection.mutable.ArrayBuffer<?> arrayBuffer)  { throw new RuntimeException(); }
}
