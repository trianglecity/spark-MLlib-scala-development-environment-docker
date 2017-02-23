package org.apache.spark.scheduler.cluster;
/**
 * A scheduler backend that waits for coarse-grained executors to connect.
 * This backend holds onto each executor for the duration of the Spark job rather than relinquishing
 * executors whenever a task is done and asking the scheduler to launch a new executor for
 * each new task. Executors may be launched in a variety of ways, such as Mesos tasks for the
 * coarse-grained Mesos mode or standalone processes for Spark's standalone deploy mode
 * (spark.deploy.*).
 */
  class CoarseGrainedSchedulerBackend implements org.apache.spark.ExecutorAllocationClient, org.apache.spark.scheduler.SchedulerBackend, org.apache.spark.internal.Logging {
  public  class DriverEndpoint implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging {
    public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
    // not preceding
    public   DriverEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> sparkProperties)  { throw new RuntimeException(); }
    protected  scala.collection.mutable.HashSet<java.lang.String> executorsPendingLossReason ()  { throw new RuntimeException(); }
    private  org.apache.spark.serializer.SerializerInstance ser ()  { throw new RuntimeException(); }
    protected  scala.collection.mutable.HashMap<org.apache.spark.rpc.RpcAddress, java.lang.String> addressToExecutorId ()  { throw new RuntimeException(); }
    private  java.util.concurrent.ScheduledExecutorService reviveThread ()  { throw new RuntimeException(); }
    public  void onStart ()  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
    private  void makeOffers ()  { throw new RuntimeException(); }
    public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
    private  void makeOffers (java.lang.String executorId)  { throw new RuntimeException(); }
    private  boolean executorIsAlive (java.lang.String executorId)  { throw new RuntimeException(); }
    private  void launchTasks (scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskDescription>> tasks)  { throw new RuntimeException(); }
    private  void removeExecutor (java.lang.String executorId, org.apache.spark.scheduler.ExecutorLossReason reason)  { throw new RuntimeException(); }
    /**
     * Stop making resource offers for the given executor. The executor is marked as lost with
     * the loss reason still pending.
     * <p>
     * @return Whether executor should be disabled
     * @param executorId (undocumented)
     */
    protected  boolean disableExecutor (java.lang.String executorId)  { throw new RuntimeException(); }
    public  void onStop ()  { throw new RuntimeException(); }
  }
  static public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  static public  boolean killExecutor (java.lang.String executorId)  { throw new RuntimeException(); }
  static public  java.lang.String applicationId ()  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> applicationAttemptId ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  // not preceding
  public   CoarseGrainedSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.rpc.RpcEnv rpcEnv)  { throw new RuntimeException(); }
  protected  java.util.concurrent.atomic.AtomicInteger totalCoreCount ()  { throw new RuntimeException(); }
  protected  java.util.concurrent.atomic.AtomicInteger totalRegisteredExecutors ()  { throw new RuntimeException(); }
  protected  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  private  int maxRpcMessageSize ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcTimeout defaultAskTimeout ()  { throw new RuntimeException(); }
  private  double _minRegisteredRatio ()  { throw new RuntimeException(); }
  private  long maxRegisteredWaitingTimeMs ()  { throw new RuntimeException(); }
  private  long createTime ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.scheduler.cluster.ExecutorData> executorDataMap ()  { throw new RuntimeException(); }
  private  int numPendingExecutors ()  { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.LiveListenerBus listenerBus ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> executorsPendingToRemove ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Map<java.lang.String, java.lang.Object> hostToLocalTaskCount ()  { throw new RuntimeException(); }
  protected  int localityAwareTasks ()  { throw new RuntimeException(); }
  protected  int currentExecutorIdCounter ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef driverEndpoint ()  { throw new RuntimeException(); }
  protected  double minRegisteredRatio ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rpc.RpcEndpointRef createDriverEndpointRef (scala.collection.mutable.ArrayBuffer<scala.Tuple2<java.lang.String, java.lang.String>> properties)  { throw new RuntimeException(); }
  protected  org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend.DriverEndpoint createDriverEndpoint (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> properties)  { throw new RuntimeException(); }
  public  void stopExecutors ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Reset the state of CoarseGrainedSchedulerBackend to the initial state. Currently it will only
   * be called in the yarn-client mode when AM re-registers after a failure.
   * */
  protected  void reset ()  { throw new RuntimeException(); }
  public  void reviveOffers ()  { throw new RuntimeException(); }
  public  void killTask (long taskId, java.lang.String executorId, boolean interruptThread)  { throw new RuntimeException(); }
  public  int defaultParallelism ()  { throw new RuntimeException(); }
  /**
   * Called by subclasses when notified of a lost worker. It just fires the message and returns
   * at once.
   * @param executorId (undocumented)
   * @param reason (undocumented)
   */
  protected  void removeExecutor (java.lang.String executorId, org.apache.spark.scheduler.ExecutorLossReason reason)  { throw new RuntimeException(); }
  public  boolean sufficientResourcesRegistered ()  { throw new RuntimeException(); }
  public  boolean isReady ()  { throw new RuntimeException(); }
  /**
   * Return the number of executors currently registered with this backend.
   * @return (undocumented)
   */
  private  int numExistingExecutors ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getExecutorIds ()  { throw new RuntimeException(); }
  /**
   * Request an additional number of executors from the cluster manager.
   * @return whether the request is acknowledged.
   * @param numAdditionalExecutors (undocumented)
   */
  public final  boolean requestExecutors (int numAdditionalExecutors)  { throw new RuntimeException(); }
  /**
   * Update the cluster manager on our scheduling needs. Three bits of information are included
   * to help it make decisions.
   * @param numExecutors The total number of executors we'd like to have. The cluster manager
   *                     shouldn't kill any running executor to reach this number, but,
   *                     if all existing executors were to die, this is the number of executors
   *                     we'd want to be allocated.
   * @param localityAwareTasks The number of tasks in all active stages that have a locality
   *                           preferences. This includes running, pending, and completed tasks.
   * @param hostToLocalTaskCount A map of hosts to the number of tasks from all active stages
   *                             that would like to like to run on that host.
   *                             This includes running, pending, and completed tasks.
   * @return whether the request is acknowledged by the cluster manager.
   */
  public final  boolean requestTotalExecutors (int numExecutors, int localityAwareTasks, scala.collection.immutable.Map<java.lang.String, java.lang.Object> hostToLocalTaskCount)  { throw new RuntimeException(); }
  /**
   * Request executors from the cluster manager by specifying the total number desired,
   * including existing pending and running executors.
   * <p>
   * The semantics here guarantee that we do not over-allocate executors for this application,
   * since a later request overrides the value of any prior request. The alternative interface
   * of requesting a delta of executors risks double counting new executors when there are
   * insufficient resources to satisfy the first request. We make the assumption here that the
   * cluster manager will eventually fulfill all requests when resources free up.
   * <p>
   * @return a future whose evaluation indicates whether the request is acknowledged.
   * @param requestedTotal (undocumented)
   */
  protected  scala.concurrent.Future<java.lang.Object> doRequestTotalExecutors (int requestedTotal)  { throw new RuntimeException(); }
  /**
   * Request that the cluster manager kill the specified executors.
   * @return whether the kill request is acknowledged. If list to kill is empty, it will return
   *         false.
   * @param executorIds (undocumented)
   */
  public final  scala.collection.Seq<java.lang.String> killExecutors (scala.collection.Seq<java.lang.String> executorIds)  { throw new RuntimeException(); }
  /**
   * Request that the cluster manager kill the specified executors.
   * <p>
   * When asking the executor to be replaced, the executor loss is considered a failure, and
   * killed tasks that are running on the executor will count towards the failure limits. If no
   * replacement is being requested, then the tasks will not count towards the limit.
   * <p>
   * @param executorIds identifiers of executors to kill
   * @param replace whether to replace the killed executors with new ones
   * @param force whether to force kill busy executors
   * @return whether the kill request is acknowledged. If list to kill is empty, it will return
   *         false.
   */
  public final  scala.collection.Seq<java.lang.String> killExecutors (scala.collection.Seq<java.lang.String> executorIds, boolean replace, boolean force)  { throw new RuntimeException(); }
  /**
   * Kill the given list of executors through the cluster manager.
   * @return whether the kill request is acknowledged.
   * @param executorIds (undocumented)
   */
  protected  scala.concurrent.Future<java.lang.Object> doKillExecutors (scala.collection.Seq<java.lang.String> executorIds)  { throw new RuntimeException(); }
}
