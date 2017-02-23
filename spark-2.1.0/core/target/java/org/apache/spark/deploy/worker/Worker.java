package org.apache.spark.deploy.worker;
  class Worker implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging {
  static public  java.lang.String SYSTEM_NAME ()  { throw new RuntimeException(); }
  static public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] argStrings)  { throw new RuntimeException(); }
  static public  org.apache.spark.rpc.RpcEnv startRpcEnvAndEndpoint (java.lang.String host, int port, int webUiPort, int cores, int memory, java.lang.String[] masterUrls, java.lang.String workDir, scala.Option<java.lang.Object> workerNumber, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static public  boolean isUseLocalNodeSSLConfig (org.apache.spark.deploy.Command cmd)  { throw new RuntimeException(); }
  static public  org.apache.spark.deploy.Command maybeUpdateSSLSettings (org.apache.spark.deploy.Command cmd, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static public final  org.apache.spark.rpc.RpcEndpointRef self ()  { throw new RuntimeException(); }
  static public  void onError (java.lang.Throwable cause)  { throw new RuntimeException(); }
  static public  void onConnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  static public  void onNetworkError (java.lang.Throwable cause, org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  static public final  void stop ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityMgr ()  { throw new RuntimeException(); }
  // not preceding
  public   Worker (org.apache.spark.rpc.RpcEnv rpcEnv, int webUiPort, int cores, int memory, org.apache.spark.rpc.RpcAddress[] masterRpcAddresses, java.lang.String endpointName, java.lang.String workDirPath, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityMgr)  { throw new RuntimeException(); }
  private  java.lang.String host ()  { throw new RuntimeException(); }
  private  int port ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledExecutorService forwordMessageScheduler ()  { throw new RuntimeException(); }
  private  scala.concurrent.ExecutionContextExecutorService cleanupThreadExecutor ()  { throw new RuntimeException(); }
  private  java.text.SimpleDateFormat createDateFormat ()  { throw new RuntimeException(); }
  private  long HEARTBEAT_MILLIS ()  { throw new RuntimeException(); }
  private  int INITIAL_REGISTRATION_RETRIES ()  { throw new RuntimeException(); }
  private  int TOTAL_REGISTRATION_RETRIES ()  { throw new RuntimeException(); }
  private  double FUZZ_MULTIPLIER_INTERVAL_LOWER_BOUND ()  { throw new RuntimeException(); }
  private  double REGISTRATION_RETRY_FUZZ_MULTIPLIER ()  { throw new RuntimeException(); }
  private  long INITIAL_REGISTRATION_RETRY_INTERVAL_SECONDS ()  { throw new RuntimeException(); }
  private  long PROLONGED_REGISTRATION_RETRY_INTERVAL_SECONDS ()  { throw new RuntimeException(); }
  private  boolean CLEANUP_ENABLED ()  { throw new RuntimeException(); }
  private  long CLEANUP_INTERVAL_MILLIS ()  { throw new RuntimeException(); }
  private  long APP_DATA_RETENTION_SECONDS ()  { throw new RuntimeException(); }
  private  boolean testing ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.rpc.RpcEndpointRef> master ()  { throw new RuntimeException(); }
  private  java.lang.String activeMasterUrl ()  { throw new RuntimeException(); }
    java.lang.String activeMasterWebUiUrl ()  { throw new RuntimeException(); }
  private  java.lang.String workerWebUiUrl ()  { throw new RuntimeException(); }
  private  java.lang.String workerUri ()  { throw new RuntimeException(); }
  private  boolean registered ()  { throw new RuntimeException(); }
  private  boolean connected ()  { throw new RuntimeException(); }
  private  java.lang.String workerId ()  { throw new RuntimeException(); }
  private  java.io.File sparkHome ()  { throw new RuntimeException(); }
  public  java.io.File workDir ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.LinkedHashMap<java.lang.String, org.apache.spark.deploy.worker.ExecutorRunner> finishedExecutors ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.deploy.worker.DriverRunner> drivers ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.deploy.worker.ExecutorRunner> executors ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.LinkedHashMap<java.lang.String, org.apache.spark.deploy.worker.DriverRunner> finishedDrivers ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, scala.collection.Seq<java.lang.String>> appDirectories ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<java.lang.String> finishedApps ()  { throw new RuntimeException(); }
  public  int retainedExecutors ()  { throw new RuntimeException(); }
  public  int retainedDrivers ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.ExternalShuffleService shuffleService ()  { throw new RuntimeException(); }
  private  java.lang.String publicAddress ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.worker.ui.WorkerWebUI webUi ()  { throw new RuntimeException(); }
  private  int connectionAttemptCount ()  { throw new RuntimeException(); }
  private  org.apache.spark.metrics.MetricsSystem metricsSystem ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.worker.WorkerSource workerSource ()  { throw new RuntimeException(); }
  private  java.util.concurrent.Future<?>[] registerMasterFutures ()  { throw new RuntimeException(); }
  private  scala.Option<java.util.concurrent.ScheduledFuture<?>> registrationRetryTimer ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ThreadPoolExecutor registerMasterThreadPool ()  { throw new RuntimeException(); }
  public  int coresUsed ()  { throw new RuntimeException(); }
  public  int memoryUsed ()  { throw new RuntimeException(); }
  public  int coresFree ()  { throw new RuntimeException(); }
  public  int memoryFree ()  { throw new RuntimeException(); }
  private  void createWorkDir ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  private  void changeMaster (org.apache.spark.rpc.RpcEndpointRef masterRef, java.lang.String uiUrl)  { throw new RuntimeException(); }
  private  java.util.concurrent.Future<?>[] tryRegisterAllMasters ()  { throw new RuntimeException(); }
  /**
   * Re-register with the master because a network failure or a master failure has occurred.
   * If the re-registration attempt threshold is exceeded, the worker exits with error.
   * Note that for thread-safety this should only be called from the rpcEndpoint.
   */
  private  void reregisterWithMaster ()  { throw new RuntimeException(); }
  /**
   * Cancel last registeration retry, or do nothing if no retry
   */
  private  void cancelLastRegistrationRetry ()  { throw new RuntimeException(); }
  private  void registerWithMaster ()  { throw new RuntimeException(); }
  private  void registerWithMaster (org.apache.spark.rpc.RpcEndpointRef masterEndpoint)  { throw new RuntimeException(); }
  private  void handleRegisterResponse (org.apache.spark.deploy.DeployMessages.RegisterWorkerResponse msg)  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  private  void masterDisconnected ()  { throw new RuntimeException(); }
  private  void maybeCleanupApplication (java.lang.String id)  { throw new RuntimeException(); }
  /**
   * Send a message to the current master. If we have not yet registered successfully with any
   * master, the message will be dropped.
   * @param message (undocumented)
   */
  private  void sendToMaster (Object message)  { throw new RuntimeException(); }
  private  java.lang.String generateWorkerId ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  private  void trimFinishedExecutorsIfNecessary ()  { throw new RuntimeException(); }
  private  void trimFinishedDriversIfNecessary ()  { throw new RuntimeException(); }
    void handleDriverStateChanged (org.apache.spark.deploy.DeployMessages.DriverStateChanged driverStateChanged)  { throw new RuntimeException(); }
    void handleExecutorStateChanged (org.apache.spark.deploy.DeployMessages.ExecutorStateChanged executorStateChanged)  { throw new RuntimeException(); }
}
