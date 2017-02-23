package org.apache.spark.deploy.client;
/**
 * Interface allowing applications to speak with a Spark standalone cluster manager.
 * <p>
 * Takes a master URL, an app description, and a listener for cluster events, and calls
 * back the listener when various events occur.
 * <p>
 * param:  masterUrls Each url should look like spark://host:port.
 */
  class StandaloneAppClient implements org.apache.spark.internal.Logging {
  public   StandaloneAppClient (org.apache.spark.rpc.RpcEnv rpcEnv, java.lang.String[] masterUrls, org.apache.spark.deploy.ApplicationDescription appDescription, org.apache.spark.deploy.client.StandaloneAppClientListener listener, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcAddress[] masterRpcAddresses ()  { throw new RuntimeException(); }
  private  int REGISTRATION_TIMEOUT_SECONDS ()  { throw new RuntimeException(); }
  private  int REGISTRATION_RETRIES ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicReference<org.apache.spark.rpc.RpcEndpointRef> endpoint ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicReference<java.lang.String> appId ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicBoolean registered ()  { throw new RuntimeException(); }
  private  class ClientEndpoint implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging {
    public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
    // not preceding
    public   ClientEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv)  { throw new RuntimeException(); }
    private  scala.Option<org.apache.spark.rpc.RpcEndpointRef> master ()  { throw new RuntimeException(); }
    private  boolean alreadyDisconnected ()  { throw new RuntimeException(); }
    private  java.util.concurrent.atomic.AtomicBoolean alreadyDead ()  { throw new RuntimeException(); }
    private  java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>[]> registerMasterFutures ()  { throw new RuntimeException(); }
    private  java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledFuture<?>> registrationRetryTimer ()  { throw new RuntimeException(); }
    private  java.util.concurrent.ThreadPoolExecutor registerMasterThreadPool ()  { throw new RuntimeException(); }
    private  java.util.concurrent.ScheduledExecutorService registrationRetryThread ()  { throw new RuntimeException(); }
    public  void onStart ()  { throw new RuntimeException(); }
    /**
     *  Register with all masters asynchronously and returns an array <code>Future</code>s for cancellation.
     * @return (undocumented)
     */
    private  java.util.concurrent.Future<?>[] tryRegisterAllMasters ()  { throw new RuntimeException(); }
    /**
     * Register with all masters asynchronously. It will call <code>registerWithMaster</code> every
     * REGISTRATION_TIMEOUT_SECONDS seconds until exceeding REGISTRATION_RETRIES times.
     * Once we connect to a master successfully, all scheduling work and Futures will be cancelled.
     * <p>
     * nthRetry means this is the nth attempt to register with master.
     * @param nthRetry (undocumented)
     */
    private  void registerWithMaster (int nthRetry)  { throw new RuntimeException(); }
    /**
     * Send a message to the current master. If we have not yet registered successfully with any
     * master, the message will be dropped.
     * @param message (undocumented)
     */
    private  void sendToMaster (Object message)  { throw new RuntimeException(); }
    private  boolean isPossibleMaster (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
    private <T extends java.lang.Object> void askAndReplyAsync (org.apache.spark.rpc.RpcEndpointRef endpointRef, org.apache.spark.rpc.RpcCallContext context, T msg)  { throw new RuntimeException(); }
    public  void onDisconnected (org.apache.spark.rpc.RpcAddress address)  { throw new RuntimeException(); }
    public  void onNetworkError (java.lang.Throwable cause, org.apache.spark.rpc.RpcAddress address)  { throw new RuntimeException(); }
    /**
     * Notify the listener that we disconnected, if we hadn't already done so before.
     */
    public  void markDisconnected ()  { throw new RuntimeException(); }
    public  void markDead (java.lang.String reason)  { throw new RuntimeException(); }
    public  void onStop ()  { throw new RuntimeException(); }
  }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Request executors from the Master by specifying the total number desired,
   * including existing pending and running executors.
   * <p>
   * @return whether the request is acknowledged.
   * @param requestedTotal (undocumented)
   */
  public  scala.concurrent.Future<java.lang.Object> requestTotalExecutors (int requestedTotal)  { throw new RuntimeException(); }
  /**
   * Kill the given list of executors through the Master.
   * @return whether the kill request is acknowledged.
   * @param executorIds (undocumented)
   */
  public  scala.concurrent.Future<java.lang.Object> killExecutors (scala.collection.Seq<java.lang.String> executorIds)  { throw new RuntimeException(); }
}
