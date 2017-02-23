package org.apache.spark.rpc.netty;
/**
 * An {@link RpcEndpoint} for remote {@link RpcEnv}s to query if an <code>RpcEndpoint</code> exists.
 * <p>
 * This is used when setting up a remote endpoint reference.
 */
  class RpcEndpointVerifier implements org.apache.spark.rpc.RpcEndpoint {
  /** A message used to ask the remote {@link RpcEndpointVerifier} if an `RpcEndpoint` exists. */
  static public  class CheckExistence implements scala.Product, scala.Serializable {
    public  java.lang.String name ()  { throw new RuntimeException(); }
    // not preceding
    public   CheckExistence (java.lang.String name)  { throw new RuntimeException(); }
  }
  static public  class CheckExistence$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.rpc.netty.RpcEndpointVerifier.CheckExistence> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CheckExistence$ MODULE$ = null;
    public   CheckExistence$ ()  { throw new RuntimeException(); }
  }
  static public  java.lang.String NAME ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.rpc.RpcEndpointRef self ()  { throw new RuntimeException(); }
  static public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  static public  void onError (java.lang.Throwable cause)  { throw new RuntimeException(); }
  static public  void onConnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  static public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  static public  void onNetworkError (java.lang.Throwable cause, org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  static public  void onStart ()  { throw new RuntimeException(); }
  static public  void onStop ()  { throw new RuntimeException(); }
  static public final  void stop ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  // not preceding
  public   RpcEndpointVerifier (org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.rpc.netty.Dispatcher dispatcher)  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
}
