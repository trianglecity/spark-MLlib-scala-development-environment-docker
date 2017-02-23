package org.apache.spark.rpc.netty;
/**
 * The message that is sent from the sender to the receiver.
 */
  class RequestMessage implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress senderAddress ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.netty.NettyRpcEndpointRef receiver ()  { throw new RuntimeException(); }
  public  Object content ()  { throw new RuntimeException(); }
  // not preceding
  public   RequestMessage (org.apache.spark.rpc.RpcAddress senderAddress, org.apache.spark.rpc.netty.NettyRpcEndpointRef receiver, Object content)  { throw new RuntimeException(); }
}
