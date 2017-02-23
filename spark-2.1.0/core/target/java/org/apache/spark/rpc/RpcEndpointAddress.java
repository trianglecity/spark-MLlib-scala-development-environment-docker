package org.apache.spark.rpc;
/**
 * An address identifier for an RPC endpoint.
 * <p>
 * The <code>rpcAddress</code> may be null, in which case the endpoint is registered via a client-only
 * connection and can only be reached via the client that sent the endpoint reference.
 * <p>
 * param:  rpcAddress The socket address of the endpoint.
 * param:  name Name of the endpoint.
 */
  class RpcEndpointAddress implements scala.Product, scala.Serializable {
  static public  org.apache.spark.rpc.RpcEndpointAddress apply (java.lang.String host, int port, java.lang.String name)  { throw new RuntimeException(); }
  static public  org.apache.spark.rpc.RpcEndpointAddress apply (java.lang.String sparkUrl)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress rpcAddress ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  // not preceding
  public   RpcEndpointAddress (org.apache.spark.rpc.RpcAddress rpcAddress, java.lang.String name)  { throw new RuntimeException(); }
  public   RpcEndpointAddress (java.lang.String host, int port, java.lang.String name)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
