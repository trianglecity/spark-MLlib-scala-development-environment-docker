package org.apache.spark.rpc.netty;
/**
 * A message dispatcher, responsible for routing RPC messages to the appropriate endpoint(s).
 */
  class Dispatcher implements org.apache.spark.internal.Logging {
  public   Dispatcher (org.apache.spark.rpc.netty.NettyRpcEnv nettyEnv)  { throw new RuntimeException(); }
  private  class EndpointData {
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.rpc.RpcEndpoint endpoint ()  { throw new RuntimeException(); }
    public  org.apache.spark.rpc.netty.NettyRpcEndpointRef ref ()  { throw new RuntimeException(); }
    // not preceding
    public   EndpointData (java.lang.String name, org.apache.spark.rpc.RpcEndpoint endpoint, org.apache.spark.rpc.netty.NettyRpcEndpointRef ref)  { throw new RuntimeException(); }
    public  org.apache.spark.rpc.netty.Inbox inbox ()  { throw new RuntimeException(); }
  }
  private  java.util.concurrent.ConcurrentMap<java.lang.String, org.apache.spark.rpc.netty.Dispatcher.EndpointData> endpoints ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentMap<org.apache.spark.rpc.RpcEndpoint, org.apache.spark.rpc.RpcEndpointRef> endpointRefs ()  { throw new RuntimeException(); }
  private  java.util.concurrent.LinkedBlockingQueue<org.apache.spark.rpc.netty.Dispatcher.EndpointData> receivers ()  { throw new RuntimeException(); }
  /**
   * True if the dispatcher has been stopped. Once stopped, all messages posted will be bounced
   * immediately.
   * @return (undocumented)
   */
  private  boolean stopped ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.netty.NettyRpcEndpointRef registerRpcEndpoint (java.lang.String name, org.apache.spark.rpc.RpcEndpoint endpoint)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef getRpcEndpointRef (org.apache.spark.rpc.RpcEndpoint endpoint)  { throw new RuntimeException(); }
  public  void removeRpcEndpointRef (org.apache.spark.rpc.RpcEndpoint endpoint)  { throw new RuntimeException(); }
  private  void unregisterRpcEndpoint (java.lang.String name)  { throw new RuntimeException(); }
  public  void stop (org.apache.spark.rpc.RpcEndpointRef rpcEndpointRef)  { throw new RuntimeException(); }
  /**
   * Send a message to all registered {@link RpcEndpoint}s in this process.
   * <p>
   * This can be used to make network events known to all end points (e.g. "a new node connected").
   * @param message (undocumented)
   */
  public  void postToAll (org.apache.spark.rpc.netty.InboxMessage message)  { throw new RuntimeException(); }
  /** Posts a message sent by a remote endpoint. */
  public  void postRemoteMessage (org.apache.spark.rpc.netty.RequestMessage message, org.apache.spark.network.client.RpcResponseCallback callback)  { throw new RuntimeException(); }
  /** Posts a message sent by a local endpoint. */
  public  void postLocalMessage (org.apache.spark.rpc.netty.RequestMessage message, scala.concurrent.Promise<java.lang.Object> p)  { throw new RuntimeException(); }
  /** Posts a one-way message. */
  public  void postOneWayMessage (org.apache.spark.rpc.netty.RequestMessage message)  { throw new RuntimeException(); }
  /**
   * Posts a message to a specific endpoint.
   * <p>
   * @param endpointName name of the endpoint.
   * @param message the message to post
   * @param callbackIfStopped callback function if the endpoint is stopped.
   */
  private  void postMessage (java.lang.String endpointName, org.apache.spark.rpc.netty.InboxMessage message, scala.Function1<java.lang.Exception, scala.runtime.BoxedUnit> callbackIfStopped)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void awaitTermination ()  { throw new RuntimeException(); }
  /**
   * Return if the endpoint exists
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  boolean verify (java.lang.String name)  { throw new RuntimeException(); }
  /** Thread pool used for dispatching messages. */
  private  java.util.concurrent.ThreadPoolExecutor threadpool ()  { throw new RuntimeException(); }
  /** Message loop used for dispatching messages. */
  private  class MessageLoop implements java.lang.Runnable {
    public   MessageLoop ()  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
  }
  /** A poison endpoint that indicates MessageLoop should exit its message loop. */
  private  org.apache.spark.rpc.netty.Dispatcher.EndpointData PoisonPill ()  { throw new RuntimeException(); }
}
