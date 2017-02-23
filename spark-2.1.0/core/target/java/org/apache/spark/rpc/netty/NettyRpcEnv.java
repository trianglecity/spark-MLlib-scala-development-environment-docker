package org.apache.spark.rpc.netty;
  class NettyRpcEnv extends org.apache.spark.rpc.RpcEnv implements org.apache.spark.internal.Logging {
  private  class FileDownloadChannel implements java.nio.channels.ReadableByteChannel {
    public   FileDownloadChannel (java.nio.channels.ReadableByteChannel source)  { throw new RuntimeException(); }
    private  java.lang.Throwable error ()  { throw new RuntimeException(); }
    public  void setError (java.lang.Throwable e)  { throw new RuntimeException(); }
    public  int read (java.nio.ByteBuffer dst)  { throw new RuntimeException(); }
    public  void close ()  { throw new RuntimeException(); }
    public  boolean isOpen ()  { throw new RuntimeException(); }
  }
  private  class FileDownloadCallback implements org.apache.spark.network.client.StreamCallback {
    public   FileDownloadCallback (java.nio.channels.WritableByteChannel sink, org.apache.spark.rpc.netty.NettyRpcEnv.FileDownloadChannel source, org.apache.spark.network.client.TransportClient client)  { throw new RuntimeException(); }
    public  void onData (java.lang.String streamId, java.nio.ByteBuffer buf)  { throw new RuntimeException(); }
    public  void onComplete (java.lang.String streamId)  { throw new RuntimeException(); }
    public  void onFailure (java.lang.String streamId, java.lang.Throwable cause)  { throw new RuntimeException(); }
  }
  /**
   * When deserializing the {@link NettyRpcEndpointRef}, it needs a reference to {@link NettyRpcEnv}.
   * Use <code>currentEnv</code> to wrap the deserialization codes. E.g.,
   * <p>
   * <pre><code>
   *   NettyRpcEnv.currentEnv.withValue(this) {
   *     your deserialization codes
   *   }
   * </code></pre>
   * @return (undocumented)
   */
  static   scala.util.DynamicVariable<org.apache.spark.rpc.netty.NettyRpcEnv> currentEnv ()  { throw new RuntimeException(); }
  /**
   * Similar to <code>currentEnv</code>, this variable references the client instance associated with an
   * RPC, in case it's needed to find out the remote address during deserialization.
   * @return (undocumented)
   */
  static   scala.util.DynamicVariable<org.apache.spark.network.client.TransportClient> currentClient ()  { throw new RuntimeException(); }
  static   org.apache.spark.rpc.RpcTimeout defaultLookupTimeout ()  { throw new RuntimeException(); }
  static public  org.apache.spark.rpc.RpcEndpointRef setupEndpointRefByURI (java.lang.String uri)  { throw new RuntimeException(); }
  static public  org.apache.spark.rpc.RpcEndpointRef setupEndpointRef (org.apache.spark.rpc.RpcAddress address, java.lang.String endpointName)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   NettyRpcEnv (org.apache.spark.SparkConf conf, org.apache.spark.serializer.JavaSerializerInstance javaSerializerInstance, java.lang.String host, org.apache.spark.SecurityManager securityManager)  { throw new RuntimeException(); }
    org.apache.spark.network.util.TransportConf transportConf ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.netty.Dispatcher dispatcher ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.netty.NettyStreamManager streamManager ()  { throw new RuntimeException(); }
  private  org.apache.spark.network.TransportContext transportContext ()  { throw new RuntimeException(); }
  private  java.util.List<org.apache.spark.network.client.TransportClientBootstrap> createClientBootstraps ()  { throw new RuntimeException(); }
  private  org.apache.spark.network.client.TransportClientFactory clientFactory ()  { throw new RuntimeException(); }
  /**
   * A separate client factory for file downloads. This avoids using the same RPC handler as
   * the main RPC context, so that events caused by these clients are kept isolated from the
   * main RPC traffic.
   * <p>
   * It also allows for different configuration of certain properties, such as the number of
   * connections per peer.
   * @return (undocumented)
   */
  private  org.apache.spark.network.client.TransportClientFactory fileDownloadFactory ()  { throw new RuntimeException(); }
  public  java.util.concurrent.ScheduledExecutorService timeoutScheduler ()  { throw new RuntimeException(); }
    java.util.concurrent.ThreadPoolExecutor clientConnectionExecutor ()  { throw new RuntimeException(); }
  private  org.apache.spark.network.server.TransportServer server ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicBoolean stopped ()  { throw new RuntimeException(); }
  /**
   * A map for {@link RpcAddress} and {@link Outbox}. When we are connecting to a remote {@link RpcAddress},
   * we just put messages to its {@link Outbox} to implement a non-blocking <code>send</code> method.
   * @return (undocumented)
   */
  private  java.util.concurrent.ConcurrentHashMap<org.apache.spark.rpc.RpcAddress, org.apache.spark.rpc.netty.Outbox> outboxes ()  { throw new RuntimeException(); }
  /**
   * Remove the address's Outbox and stop it.
   * @param address (undocumented)
   */
    void removeOutbox (org.apache.spark.rpc.RpcAddress address)  { throw new RuntimeException(); }
  public  void startServer (java.lang.String bindAddress, int port)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress address ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef setupEndpoint (java.lang.String name, org.apache.spark.rpc.RpcEndpoint endpoint)  { throw new RuntimeException(); }
  public  scala.concurrent.Future<org.apache.spark.rpc.RpcEndpointRef> asyncSetupEndpointRefByURI (java.lang.String uri)  { throw new RuntimeException(); }
  public  void stop (org.apache.spark.rpc.RpcEndpointRef endpointRef)  { throw new RuntimeException(); }
  private  void postToOutbox (org.apache.spark.rpc.netty.NettyRpcEndpointRef receiver, org.apache.spark.rpc.netty.OutboxMessage message)  { throw new RuntimeException(); }
    void send (org.apache.spark.rpc.netty.RequestMessage message)  { throw new RuntimeException(); }
    org.apache.spark.network.client.TransportClient createClient (org.apache.spark.rpc.RpcAddress address)  { throw new RuntimeException(); }
   <T extends java.lang.Object> scala.concurrent.Future<T> ask (org.apache.spark.rpc.netty.RequestMessage message, org.apache.spark.rpc.RpcTimeout timeout, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
    java.nio.ByteBuffer serialize (Object content)  { throw new RuntimeException(); }
   <T extends java.lang.Object> T deserialize (org.apache.spark.network.client.TransportClient client, java.nio.ByteBuffer bytes, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef endpointRef (org.apache.spark.rpc.RpcEndpoint endpoint)  { throw new RuntimeException(); }
  public  void shutdown ()  { throw new RuntimeException(); }
  public  void awaitTermination ()  { throw new RuntimeException(); }
  private  void cleanup ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T deserialize (scala.Function0<T> deserializationAction)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnvFileServer fileServer ()  { throw new RuntimeException(); }
  public  java.nio.channels.ReadableByteChannel openChannel (java.lang.String uri)  { throw new RuntimeException(); }
  private  org.apache.spark.network.client.TransportClient downloadClient (java.lang.String host, int port)  { throw new RuntimeException(); }
}
