package org.apache.spark.deploy.master;
  class Master implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging, org.apache.spark.deploy.master.LeaderElectable {
  static public  java.lang.String SYSTEM_NAME ()  { throw new RuntimeException(); }
  static public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] argStrings)  { throw new RuntimeException(); }
  /**
   * Start the Master and return a three tuple of:
   *   (1) The Master RpcEnv
   *   (2) The web UI bound port
   *   (3) The REST server bound port, if any
   * @param host (undocumented)
   * @param port (undocumented)
   * @param webUiPort (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  scala.Tuple3<org.apache.spark.rpc.RpcEnv, java.lang.Object, scala.Option<java.lang.Object>> startRpcEnvAndEndpoint (java.lang.String host, int port, int webUiPort, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
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
  public  org.apache.spark.SecurityManager securityMgr ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   Master (org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.rpc.RpcAddress address, int webUiPort, org.apache.spark.SecurityManager securityMgr, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledExecutorService forwardMessageThread ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  private  java.text.SimpleDateFormat createDateFormat ()  { throw new RuntimeException(); }
  private  long WORKER_TIMEOUT_MS ()  { throw new RuntimeException(); }
  private  int RETAINED_APPLICATIONS ()  { throw new RuntimeException(); }
  private  int RETAINED_DRIVERS ()  { throw new RuntimeException(); }
  private  int REAPER_ITERATIONS ()  { throw new RuntimeException(); }
  private  java.lang.String RECOVERY_MODE ()  { throw new RuntimeException(); }
  private  int MAX_EXECUTOR_RETRIES ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<org.apache.spark.deploy.master.WorkerInfo> workers ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.deploy.master.ApplicationInfo> idToApp ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.deploy.master.ApplicationInfo> waitingApps ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<org.apache.spark.deploy.master.ApplicationInfo> apps ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.deploy.master.WorkerInfo> idToWorker ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.rpc.RpcAddress, org.apache.spark.deploy.master.WorkerInfo> addressToWorker ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.rpc.RpcEndpointRef, org.apache.spark.deploy.master.ApplicationInfo> endpointToApp ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.rpc.RpcAddress, org.apache.spark.deploy.master.ApplicationInfo> addressToApp ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.deploy.master.ApplicationInfo> completedApps ()  { throw new RuntimeException(); }
  private  int nextAppNumber ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<org.apache.spark.deploy.master.DriverInfo> drivers ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.deploy.master.DriverInfo> completedDrivers ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.deploy.master.DriverInfo> waitingDrivers ()  { throw new RuntimeException(); }
  private  int nextDriverNumber ()  { throw new RuntimeException(); }
  private  org.apache.spark.metrics.MetricsSystem masterMetricsSystem ()  { throw new RuntimeException(); }
  private  org.apache.spark.metrics.MetricsSystem applicationMetricsSystem ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.MasterSource masterSource ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.ui.MasterWebUI webUi ()  { throw new RuntimeException(); }
  private  java.lang.String masterPublicAddress ()  { throw new RuntimeException(); }
  private  java.lang.String masterUrl ()  { throw new RuntimeException(); }
  private  java.lang.String masterWebUiUrl ()  { throw new RuntimeException(); }
  private  scala.Enumeration.Value state ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.PersistenceEngine persistenceEngine ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.LeaderElectionAgent leaderElectionAgent ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledFuture<?> recoveryCompletionTask ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledFuture<?> checkForWorkerTimeOutTask ()  { throw new RuntimeException(); }
  private  boolean spreadOutApps ()  { throw new RuntimeException(); }
  private  int defaultCores ()  { throw new RuntimeException(); }
  public  boolean reverseProxy ()  { throw new RuntimeException(); }
  private  boolean restServerEnabled ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.deploy.rest.StandaloneRestServer> restServer ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> restServerBoundPort ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  public  void electedLeader ()  { throw new RuntimeException(); }
  public  void revokedLeadership ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  public  void onDisconnected (org.apache.spark.rpc.RpcAddress address)  { throw new RuntimeException(); }
  private  boolean canCompleteRecovery ()  { throw new RuntimeException(); }
  private  void beginRecovery (scala.collection.Seq<org.apache.spark.deploy.master.ApplicationInfo> storedApps, scala.collection.Seq<org.apache.spark.deploy.master.DriverInfo> storedDrivers, scala.collection.Seq<org.apache.spark.deploy.master.WorkerInfo> storedWorkers)  { throw new RuntimeException(); }
  private  void completeRecovery ()  { throw new RuntimeException(); }
  /**
   * Schedule executors to be launched on the workers.
   * Returns an array containing number of cores assigned to each worker.
   * <p>
   * There are two modes of launching executors. The first attempts to spread out an application's
   * executors on as many workers as possible, while the second does the opposite (i.e. launch them
   * on as few workers as possible). The former is usually better for data locality purposes and is
   * the default.
   * <p>
   * The number of cores assigned to each executor is configurable. When this is explicitly set,
   * multiple executors from the same application may be launched on the same worker if the worker
   * has enough cores and memory. Otherwise, each executor grabs all the cores available on the
   * worker by default, in which case only one executor may be launched on each worker.
   * <p>
   * It is important to allocate coresPerExecutor on each worker at a time (instead of 1 core
   * at a time). Consider the following example: cluster has 4 workers with 16 cores each.
   * User requests 3 executors (spark.cores.max = 48, spark.executor.cores = 16). If 1 core is
   * allocated at a time, 12 cores from each worker would be assigned to each executor.
   * Since 12 < 16, no executors would launch [SPARK-8881].
   * @param app (undocumented)
   * @param usableWorkers (undocumented)
   * @param spreadOutApps (undocumented)
   * @return (undocumented)
   */
  private  int[] scheduleExecutorsOnWorkers (org.apache.spark.deploy.master.ApplicationInfo app, org.apache.spark.deploy.master.WorkerInfo[] usableWorkers, boolean spreadOutApps)  { throw new RuntimeException(); }
  /**
   * Schedule and launch executors on workers
   */
  private  void startExecutorsOnWorkers ()  { throw new RuntimeException(); }
  /**
   * Allocate a worker's resources to one or more executors.
   * @param app the info of the application which the executors belong to
   * @param assignedCores number of cores on this worker for this application
   * @param coresPerExecutor number of cores per executor
   * @param worker the worker info
   */
  private  void allocateWorkerResourceToExecutors (org.apache.spark.deploy.master.ApplicationInfo app, int assignedCores, scala.Option<java.lang.Object> coresPerExecutor, org.apache.spark.deploy.master.WorkerInfo worker)  { throw new RuntimeException(); }
  /**
   * Schedule the currently available resources among waiting apps. This method will be called
   * every time a new app joins or resource availability changes.
   */
  private  void schedule ()  { throw new RuntimeException(); }
  private  void launchExecutor (org.apache.spark.deploy.master.WorkerInfo worker, org.apache.spark.deploy.master.ExecutorDesc exec)  { throw new RuntimeException(); }
  private  boolean registerWorker (org.apache.spark.deploy.master.WorkerInfo worker)  { throw new RuntimeException(); }
  private  void removeWorker (org.apache.spark.deploy.master.WorkerInfo worker)  { throw new RuntimeException(); }
  private  void relaunchDriver (org.apache.spark.deploy.master.DriverInfo driver)  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.ApplicationInfo createApplication (org.apache.spark.deploy.ApplicationDescription desc, org.apache.spark.rpc.RpcEndpointRef driver)  { throw new RuntimeException(); }
  private  void registerApplication (org.apache.spark.deploy.master.ApplicationInfo app)  { throw new RuntimeException(); }
  private  void finishApplication (org.apache.spark.deploy.master.ApplicationInfo app)  { throw new RuntimeException(); }
  public  void removeApplication (org.apache.spark.deploy.master.ApplicationInfo app, scala.Enumeration.Value state)  { throw new RuntimeException(); }
  /**
   * Handle a request to set the target number of executors for this application.
   * <p>
   * If the executor limit is adjusted upwards, new executors will be launched provided
   * that there are workers with sufficient resources. If it is adjusted downwards, however,
   * we do not kill existing executors until we explicitly receive a kill request.
   * <p>
   * @return whether the application has previously registered with this Master.
   * @param appId (undocumented)
   * @param requestedTotal (undocumented)
   */
  private  boolean handleRequestExecutors (java.lang.String appId, int requestedTotal)  { throw new RuntimeException(); }
  /**
   * Handle a kill request from the given application.
   * <p>
   * This method assumes the executor limit has already been adjusted downwards through
   * a separate {@link RequestExecutors} message, such that we do not launch new executors
   * immediately after the old ones are removed.
   * <p>
   * @return whether the application has previously registered with this Master.
   * @param appId (undocumented)
   * @param executorIds (undocumented)
   */
  private  boolean handleKillExecutors (java.lang.String appId, scala.collection.Seq<java.lang.Object> executorIds)  { throw new RuntimeException(); }
  /**
   * Cast the given executor IDs to integers and filter out the ones that fail.
   * <p>
   * All executors IDs should be integers since we launched these executors. However,
   * the kill interface on the driver side accepts arbitrary strings, so we need to
   * handle non-integer executor IDs just to be safe.
   * @param executorIds (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<java.lang.Object> formatExecutorIds (scala.collection.Seq<java.lang.String> executorIds)  { throw new RuntimeException(); }
  /**
   * Ask the worker on which the specified executor is launched to kill the executor.
   * @param exec (undocumented)
   */
  private  void killExecutor (org.apache.spark.deploy.master.ExecutorDesc exec)  { throw new RuntimeException(); }
  /** Generate a new app ID given an app's submission date */
  private  java.lang.String newApplicationId (java.util.Date submitDate)  { throw new RuntimeException(); }
  /** Check for, and remove, any timed-out workers */
  private  void timeOutDeadWorkers ()  { throw new RuntimeException(); }
  private  java.lang.String newDriverId (java.util.Date submitDate)  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.master.DriverInfo createDriver (org.apache.spark.deploy.DriverDescription desc)  { throw new RuntimeException(); }
  private  void launchDriver (org.apache.spark.deploy.master.WorkerInfo worker, org.apache.spark.deploy.master.DriverInfo driver)  { throw new RuntimeException(); }
  private  void removeDriver (java.lang.String driverId, scala.Enumeration.Value finalState, scala.Option<java.lang.Exception> exception)  { throw new RuntimeException(); }
}
