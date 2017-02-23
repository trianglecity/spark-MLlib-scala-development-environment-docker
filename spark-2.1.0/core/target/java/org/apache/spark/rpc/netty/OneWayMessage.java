package org.apache.spark.rpc.netty;
  class OneWayMessage implements org.apache.spark.rpc.netty.InboxMessage, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress senderAddress ()  { throw new RuntimeException(); }
  public  Object content ()  { throw new RuntimeException(); }
  // not preceding
  public   OneWayMessage (org.apache.spark.rpc.RpcAddress senderAddress, Object content)  { throw new RuntimeException(); }
}
