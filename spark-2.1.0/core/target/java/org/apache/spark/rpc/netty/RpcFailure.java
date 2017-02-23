package org.apache.spark.rpc.netty;
/**
 * A response that indicates some failure happens in the receiver side.
 */
  class RpcFailure implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.Throwable e ()  { throw new RuntimeException(); }
  // not preceding
  public   RpcFailure (java.lang.Throwable e)  { throw new RuntimeException(); }
}
