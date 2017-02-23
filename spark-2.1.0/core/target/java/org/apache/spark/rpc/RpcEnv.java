package org.apache.spark.rpc;
/**
 * An RPC environment. {@link RpcEndpoint}s need to register itself with a name to {@link RpcEnv} to
 * receives messages. Then {@link RpcEnv} will process messages sent from {@link RpcEndpointRef} or remote
 * nodes, and deliver them to corresponding {@link RpcEndpoint}s. For uncaught exceptions caught by
 * {@link RpcEnv}, {@link RpcEnv} will use {@link RpcCallContext.sendFailure} to send exceptions back to the
 * sender, or logging them if no such sender or <code>NotSerializableException</code>.
 * <p>
 * {@link RpcEnv} also provides some methods to retrieve {@link RpcEndpointRef}s given name or uri.
 */
 abstract class RpcEnv {
  static public  org.apache.spark.rpc.RpcEnv create (java.lang.String name, java.lang.String host, int port, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager, boolean clientMode)  { throw new RuntimeException(); }
  static public  org.apache.spark.rpc.RpcEnv create (java.lang.String name, java.lang.String bindAddress, java.lang.String advertiseAddress, int port, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager, boolean clientMode)  { throw new RuntimeException(); }
  public   RpcEnv (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    org.apache.spark.rpc.RpcTimeout defaultLookupTimeout ()  { throw new RuntimeException(); }
  /**
   * Return RpcEndpointRef of the registered {@link RpcEndpoint}. Will be used to implement
   * {@link RpcEndpoint.self}. Return <code>null</code> if the corresponding {@link RpcEndpointRef} does not exist.
   * @param endpoint (undocumented)
   * @return (undocumented)
   */
   abstract  org.apache.spark.rpc.RpcEndpointRef endpointRef (org.apache.spark.rpc.RpcEndpoint endpoint)  ;
  /**
   * Return the address that {@link RpcEnv} is listening to.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.rpc.RpcAddress address ()  ;
  /**
   * Register a {@link RpcEndpoint} with a name and return its {@link RpcEndpointRef}. {@link RpcEnv} does not
   * guarantee thread-safety.
   * @param name (undocumented)
   * @param endpoint (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.rpc.RpcEndpointRef setupEndpoint (java.lang.String name, org.apache.spark.rpc.RpcEndpoint endpoint)  ;
  /**
   * Retrieve the {@link RpcEndpointRef} represented by <code>uri</code> asynchronously.
   * @param uri (undocumented)
   * @return (undocumented)
   */
  public abstract  scala.concurrent.Future<org.apache.spark.rpc.RpcEndpointRef> asyncSetupEndpointRefByURI (java.lang.String uri)  ;
  /**
   * Retrieve the {@link RpcEndpointRef} represented by <code>uri</code>. This is a blocking action.
   * @param uri (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rpc.RpcEndpointRef setupEndpointRefByURI (java.lang.String uri)  { throw new RuntimeException(); }
  /**
   * Retrieve the {@link RpcEndpointRef} represented by <code>address</code> and <code>endpointName</code>.
   * This is a blocking action.
   * @param address (undocumented)
   * @param endpointName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rpc.RpcEndpointRef setupEndpointRef (org.apache.spark.rpc.RpcAddress address, java.lang.String endpointName)  { throw new RuntimeException(); }
  /**
   * Stop {@link RpcEndpoint} specified by <code>endpoint</code>.
   * @param endpoint (undocumented)
   */
  public abstract  void stop (org.apache.spark.rpc.RpcEndpointRef endpoint)  ;
  /**
   * Shutdown this {@link RpcEnv} asynchronously. If need to make sure {@link RpcEnv} exits successfully,
   * call {@link awaitTermination()} straight after {@link shutdown()}.
   */
  public abstract  void shutdown ()  ;
  /**
   * Wait until {@link RpcEnv} exits.
   * <p>
   * TODO do we need a timeout parameter?
   */
  public abstract  void awaitTermination ()  ;
  /**
   * {@link RpcEndpointRef} cannot be deserialized without {@link RpcEnv}. So when deserializing any object
   * that contains {@link RpcEndpointRef}s, the deserialization codes should be wrapped by this method.
   * @param deserializationAction (undocumented)
   * @return (undocumented)
   */
  public abstract <T extends java.lang.Object> T deserialize (scala.Function0<T> deserializationAction)  ;
  /**
   * Return the instance of the file server used to serve files. This may be <code>null</code> if the
   * RpcEnv is not operating in server mode.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.rpc.RpcEnvFileServer fileServer ()  ;
  /**
   * Open a channel to download a file from the given URI. If the URIs returned by the
   * RpcEnvFileServer use the "spark" scheme, this method will be called by the Utils class to
   * retrieve the files.
   * <p>
   * @param uri URI with location of the file.
   * @return (undocumented)
   */
  public abstract  java.nio.channels.ReadableByteChannel openChannel (java.lang.String uri)  ;
}
