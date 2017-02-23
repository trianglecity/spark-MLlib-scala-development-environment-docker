package org.apache.spark.rpc.netty;
/** A message to tell all endpoints that a remote process has connected. */
  class RemoteProcessConnected implements org.apache.spark.rpc.netty.InboxMessage, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress remoteAddress ()  { throw new RuntimeException(); }
  // not preceding
  public   RemoteProcessConnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
}
