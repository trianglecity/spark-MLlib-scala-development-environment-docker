package org.apache.spark.scheduler.cluster;
/**
 * Abstract Yarn scheduler backend that contains common logic
 * between the client and cluster Yarn scheduler backends.
 */
 abstract class YarnSchedulerBackend extends org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend {
  /**
   * Override the DriverEndpoint to add extra logic for the case when an executor is disconnected.
   * This endpoint communicates with the executors and queries the AM for an executor's exit
   * status when the executor is disconnected.
   */
  private  class YarnDriverEndpoint extends org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend.DriverEndpoint {
    public   YarnDriverEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> sparkProperties)  { throw new RuntimeException(); }
    /**
     * When onDisconnected is received at the driver endpoint, the superclass DriverEndpoint
     * handles it by assuming the Executor was lost for a bad reason and removes the executor
     * immediately.
     * <p>
     * In YARN's case however it is crucial to talk to the application master and ask why the
     * executor had exited. If the executor exited for some reason unrelated to the running tasks
     * (e.g., preemption), according to the application master, then we pass that information down
     * to the TaskSetManager to inform the TaskSetManager that tasks on that lost executor should
     * not count towards a job failure.
     * @param rpcAddress (undocumented)
     */
    public  void onDisconnected (org.apache.spark.rpc.RpcAddress rpcAddress)  { throw new RuntimeException(); }
  }
  /**
   * An {@link RpcEndpoint} that communicates with the ApplicationMaster.
   */
  private  class YarnSchedulerEndpoint implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging {
    public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
    // not preceding
    public   YarnSchedulerEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv)  { throw new RuntimeException(); }
    private  scala.Option<org.apache.spark.rpc.RpcEndpointRef> amEndpoint ()  { throw new RuntimeException(); }
      void handleExecutorDisconnectedFromDriver (java.lang.String executorId, org.apache.spark.rpc.RpcAddress executorRpcAddress)  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
    public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  }
  static public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  static public  boolean killExecutor (java.lang.String executorId)  { throw new RuntimeException(); }
  static public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> getDriverLogUrls ()  { throw new RuntimeException(); }
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
  static public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  static protected  java.util.concurrent.atomic.AtomicInteger totalCoreCount ()  { throw new RuntimeException(); }
  static protected  java.util.concurrent.atomic.AtomicInteger totalRegisteredExecutors ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  static protected  scala.collection.immutable.Map<java.lang.String, java.lang.Object> hostToLocalTaskCount ()  { throw new RuntimeException(); }
  static protected  void hostToLocalTaskCount_$eq (scala.collection.immutable.Map<java.lang.String, java.lang.Object> x$1)  { throw new RuntimeException(); }
  static protected  int localityAwareTasks ()  { throw new RuntimeException(); }
  static protected  void localityAwareTasks_$eq (int x$1)  { throw new RuntimeException(); }
  static protected  int currentExecutorIdCounter ()  { throw new RuntimeException(); }
  static protected  void currentExecutorIdCounter_$eq (int x$1)  { throw new RuntimeException(); }
  static public  org.apache.spark.rpc.RpcEndpointRef driverEndpoint ()  { throw new RuntimeException(); }
  static public  void driverEndpoint_$eq (org.apache.spark.rpc.RpcEndpointRef x$1)  { throw new RuntimeException(); }
  static protected  org.apache.spark.rpc.RpcEndpointRef createDriverEndpointRef (scala.collection.mutable.ArrayBuffer<scala.Tuple2<java.lang.String, java.lang.String>> properties)  { throw new RuntimeException(); }
  static public  void stopExecutors ()  { throw new RuntimeException(); }
  static public  void reviveOffers ()  { throw new RuntimeException(); }
  static public  void killTask (long taskId, java.lang.String executorId, boolean interruptThread)  { throw new RuntimeException(); }
  static public  int defaultParallelism ()  { throw new RuntimeException(); }
  static protected  void removeExecutor (java.lang.String executorId, org.apache.spark.scheduler.ExecutorLossReason reason)  { throw new RuntimeException(); }
  static public  boolean isReady ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.String> getExecutorIds ()  { throw new RuntimeException(); }
  static public final  boolean requestExecutors (int numAdditionalExecutors)  { throw new RuntimeException(); }
  static public final  boolean requestTotalExecutors (int numExecutors, int localityAwareTasks, scala.collection.immutable.Map<java.lang.String, java.lang.Object> hostToLocalTaskCount)  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<java.lang.String> killExecutors (scala.collection.Seq<java.lang.String> executorIds)  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<java.lang.String> killExecutors (scala.collection.Seq<java.lang.String> executorIds, boolean replace, boolean force)  { throw new RuntimeException(); }
  // not preceding
  public   YarnSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public  double minRegisteredRatio ()  { throw new RuntimeException(); }
  protected  int totalExpectedExecutors ()  { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.cluster.YarnSchedulerBackend.YarnSchedulerEndpoint yarnSchedulerEndpoint ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef yarnSchedulerEndpointRef ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcTimeout askTimeout ()  { throw new RuntimeException(); }
  /** Application ID. */
  protected  scala.Option<org.apache.hadoop.yarn.api.records.ApplicationId> appId ()  { throw new RuntimeException(); }
  /** Attempt ID. This is unset for client-mode schedulers */
  private  scala.Option<org.apache.hadoop.yarn.api.records.ApplicationAttemptId> attemptId ()  { throw new RuntimeException(); }
  /** Scheduler extension services. */
  private  org.apache.spark.scheduler.cluster.SchedulerExtensionServices services ()  { throw new RuntimeException(); }
  private  boolean shouldResetOnAmRegister ()  { throw new RuntimeException(); }
  /**
   * Bind to YARN. This *must* be done before calling {@link start()}.
   * <p>
   * @param appId YARN application ID
   * @param attemptId Optional YARN attempt ID
   */
  protected  void bindToYarn (org.apache.hadoop.yarn.api.records.ApplicationId appId, scala.Option<org.apache.hadoop.yarn.api.records.ApplicationAttemptId> attemptId)  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Get the attempt ID for this run, if the cluster manager supports multiple
   * attempts. Applications run in client mode will not have attempt IDs.
   * This attempt ID only includes attempt counter, like "1", "2".
   * <p>
   * @return The application attempt id, if available.
   */
  public  scala.Option<java.lang.String> applicationAttemptId ()  { throw new RuntimeException(); }
  /**
   * Get an application ID associated with the job.
   * This returns the string value of {@link appId} if set, otherwise
   * the locally-generated ID from the superclass.
   * @return The application ID
   */
  public  java.lang.String applicationId ()  { throw new RuntimeException(); }
  /**
   * Request executors from the ApplicationMaster by specifying the total number desired.
   * This includes executors already pending or running.
   * @param requestedTotal (undocumented)
   * @return (undocumented)
   */
  public  scala.concurrent.Future<java.lang.Object> doRequestTotalExecutors (int requestedTotal)  { throw new RuntimeException(); }
  /**
   * Request that the ApplicationMaster kill the specified executors.
   * @param executorIds (undocumented)
   * @return (undocumented)
   */
  public  scala.concurrent.Future<java.lang.Object> doKillExecutors (scala.collection.Seq<java.lang.String> executorIds)  { throw new RuntimeException(); }
  public  boolean sufficientResourcesRegistered ()  { throw new RuntimeException(); }
  /**
   * Add filters to the SparkUI.
   * @param filterName (undocumented)
   * @param filterParams (undocumented)
   * @param proxyBase (undocumented)
   */
  private  void addWebUIFilter (java.lang.String filterName, scala.collection.immutable.Map<java.lang.String, java.lang.String> filterParams, java.lang.String proxyBase)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend.DriverEndpoint createDriverEndpoint (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> properties)  { throw new RuntimeException(); }
  /**
   * Reset the state of SchedulerBackend to the initial state. This is happened when AM is failed
   * and re-registered itself to driver after a failure. The stale state in driver should be
   * cleaned.
   */
  protected  void reset ()  { throw new RuntimeException(); }
}
