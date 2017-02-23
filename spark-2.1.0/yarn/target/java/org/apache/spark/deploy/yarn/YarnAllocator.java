package org.apache.spark.deploy.yarn;
/**
 * YarnAllocator is charged with requesting containers from the YARN ResourceManager and deciding
 * what to do with containers when YARN fulfills these requests.
 * <p>
 * This class makes use of YARN's AMRMClient APIs. We interact with the AMRMClient in three ways:
 * * Making our resource needs known, which updates local bookkeeping about containers requested.
 * * Calling "allocate", which syncs our local container requests with the RM, and returns any
 *   containers that YARN has granted to us.  This also functions as a heartbeat.
 * * Processing the containers granted to us to possibly launch executors inside of them.
 * <p>
 * The public methods of this class are thread-safe.  All methods that mutate state are
 * synchronized.
 */
  class YarnAllocator implements org.apache.spark.internal.Logging {
  static public  java.lang.String MEM_REGEX ()  { throw new RuntimeException(); }
  static public  java.util.regex.Pattern PMEM_EXCEEDED_PATTERN ()  { throw new RuntimeException(); }
  static public  java.util.regex.Pattern VMEM_EXCEEDED_PATTERN ()  { throw new RuntimeException(); }
  static public  int VMEM_EXCEEDED_EXIT_CODE ()  { throw new RuntimeException(); }
  static public  int PMEM_EXCEEDED_EXIT_CODE ()  { throw new RuntimeException(); }
  static public  java.lang.String memLimitExceededLogMessage (java.lang.String diagnostics, java.util.regex.Pattern pattern)  { throw new RuntimeException(); }
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
  public   YarnAllocator (java.lang.String driverUrl, org.apache.spark.rpc.RpcEndpointRef driverRef, org.apache.hadoop.yarn.conf.YarnConfiguration conf, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.yarn.client.api.AMRMClient<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> amClient, org.apache.hadoop.yarn.api.records.ApplicationAttemptId appAttemptId, org.apache.spark.SecurityManager securityMgr, scala.collection.immutable.Map<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> localResources)  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.Set<org.apache.hadoop.yarn.api.records.ContainerId>> allocatedHostToContainersMap ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<org.apache.hadoop.yarn.api.records.ContainerId, java.lang.String> allocatedContainerToHostMap ()  { throw new RuntimeException(); }
  private  java.util.Set<org.apache.hadoop.yarn.api.records.ContainerId> releasedContainers ()  { throw new RuntimeException(); }
  private  int numExecutorsRunning ()  { throw new RuntimeException(); }
  /**
   * Used to generate a unique ID per executor
   * <p>
   * Init <code>executorIdCounter</code>. when AM restart, <code>executorIdCounter</code> will reset to 0. Then
   * the id of new executor will start from 1, this will conflict with the executor has
   * already created before. So, we should initialize the <code>executorIdCounter</code> by getting
   * the max executorId from driver.
   * <p>
   * And this situation of executorId conflict is just in yarn client mode, so this is an issue
   * in yarn client mode. For more details, can check in jira.
   * <p>
   * @see SPARK-12864
   * @return (undocumented)
   */
  private  int executorIdCounter ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.Queue<java.lang.Object> failedExecutorsTimeStamps ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  private  long executorFailuresValidityInterval ()  { throw new RuntimeException(); }
  private  int targetNumExecutors ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.Buffer<org.apache.spark.rpc.RpcCallContext>> pendingLossReasonRequests ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.scheduler.ExecutorLossReason> releasedExecutorLossReasons ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.String, org.apache.hadoop.yarn.api.records.Container> executorIdToContainer ()  { throw new RuntimeException(); }
  private  long numUnexpectedContainerRelease ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.hadoop.yarn.api.records.ContainerId, java.lang.String> containerIdToExecutorId ()  { throw new RuntimeException(); }
  protected  int executorMemory ()  { throw new RuntimeException(); }
  protected  int memoryOverhead ()  { throw new RuntimeException(); }
  protected  int executorCores ()  { throw new RuntimeException(); }
    org.apache.hadoop.yarn.api.records.Resource resource ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ThreadPoolExecutor launcherPool ()  { throw new RuntimeException(); }
  private  boolean launchContainers ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.String> labelExpression ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.reflect.Constructor<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest>> nodeLabelConstructor ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.Object> hostToLocalTaskCounts ()  { throw new RuntimeException(); }
  private  int numLocalityAwareTasks ()  { throw new RuntimeException(); }
    org.apache.spark.deploy.yarn.LocalityPreferredContainerPlacementStrategy containerPlacementStrategy ()  { throw new RuntimeException(); }
  /**
   * Use a different clock for YarnAllocator. This is mainly used for testing.
   * @param newClock (undocumented)
   */
  public  void setClock (org.apache.spark.util.Clock newClock)  { throw new RuntimeException(); }
  public  int getNumExecutorsRunning ()  { throw new RuntimeException(); }
  public  int getNumExecutorsFailed ()  { throw new RuntimeException(); }
  /**
   * A sequence of pending container requests that have not yet been fulfilled.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> getPendingAllocate ()  { throw new RuntimeException(); }
  /**
   * A sequence of pending container requests at the given location that have not yet been
   * fulfilled.
   * @param location (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> getPendingAtLocation (java.lang.String location)  { throw new RuntimeException(); }
  /**
   * Request as many executors from the ResourceManager as needed to reach the desired total. If
   * the requested total is smaller than the current number of running executors, no executors will
   * be killed.
   * @param requestedTotal total number of containers requested
   * @param localityAwareTasks number of locality aware tasks to be used as container placement hint
   * @param hostToLocalTaskCount a map of preferred hostname to possible task counts to be used as
   *                             container placement hint.
   * @return Whether the new requested total is different than the old value.
   */
  public  boolean requestTotalExecutorsWithPreferredLocalities (int requestedTotal, int localityAwareTasks, scala.collection.immutable.Map<java.lang.String, java.lang.Object> hostToLocalTaskCount)  { throw new RuntimeException(); }
  /**
   * Request that the ResourceManager release the container running the specified executor.
   * @param executorId (undocumented)
   */
  public  void killExecutor (java.lang.String executorId)  { throw new RuntimeException(); }
  /**
   * Request resources such that, if YARN gives us all we ask for, we'll have a number of containers
   * equal to maxExecutors.
   * <p>
   * Deal with any containers YARN has granted to us by possibly launching executors in them.
   * <p>
   * This must be synchronized because variables read in this method are mutated by other methods.
   */
  public  void allocateResources ()  { throw new RuntimeException(); }
  /**
   * Update the set of container requests that we will sync with the RM based on the number of
   * executors we have currently running and our target number of executors.
   * <p>
   * Visible for testing.
   */
  public  void updateResourceRequests ()  { throw new RuntimeException(); }
  private  java.lang.String hostStr (org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest request)  { throw new RuntimeException(); }
  /**
   * Creates a container request, handling the reflection required to use YARN features that were
   * added in recent versions.
   * @param resource (undocumented)
   * @param nodes (undocumented)
   * @param racks (undocumented)
   * @return (undocumented)
   */
  private  org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest createContainerRequest (org.apache.hadoop.yarn.api.records.Resource resource, java.lang.String[] nodes, java.lang.String[] racks)  { throw new RuntimeException(); }
  /**
   * Handle containers granted by the RM by launching executors on them.
   * <p>
   * Due to the way the YARN allocation protocol works, certain healthy race conditions can result
   * in YARN granting containers that we no longer need. In this case, we release them.
   * <p>
   * Visible for testing.
   * @param allocatedContainers (undocumented)
   */
  public  void handleAllocatedContainers (scala.collection.Seq<org.apache.hadoop.yarn.api.records.Container> allocatedContainers)  { throw new RuntimeException(); }
  /**
   * Looks for requests for the given location that match the given container allocation. If it
   * finds one, removes the request so that it won't be submitted again. Places the container into
   * containersToUse or remaining.
   * <p>
   * @param allocatedContainer container that was given to us by YARN
   * @param location resource name, either a node, rack, or *
   * @param containersToUse list of containers that will be used
   * @param remaining list of containers that will not be used
   */
  private  void matchContainerToRequest (org.apache.hadoop.yarn.api.records.Container allocatedContainer, java.lang.String location, scala.collection.mutable.ArrayBuffer<org.apache.hadoop.yarn.api.records.Container> containersToUse, scala.collection.mutable.ArrayBuffer<org.apache.hadoop.yarn.api.records.Container> remaining)  { throw new RuntimeException(); }
  /**
   * Launches executors in the allocated containers.
   * @param containersToUse (undocumented)
   */
  private  void runAllocatedContainers (scala.collection.mutable.ArrayBuffer<org.apache.hadoop.yarn.api.records.Container> containersToUse)  { throw new RuntimeException(); }
    void processCompletedContainers (scala.collection.Seq<org.apache.hadoop.yarn.api.records.ContainerStatus> completedContainers)  { throw new RuntimeException(); }
  /**
   * Register that some RpcCallContext has asked the AM why the executor was lost. Note that
   * we can only find the loss reason to send back in the next call to allocateResources().
   * @param eid (undocumented)
   * @param context (undocumented)
   */
    void enqueueGetLossReasonRequest (java.lang.String eid, org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  private  void internalReleaseContainer (org.apache.hadoop.yarn.api.records.Container container)  { throw new RuntimeException(); }
    long getNumUnexpectedContainerRelease ()  { throw new RuntimeException(); }
    int getNumPendingLossReasonRequests ()  { throw new RuntimeException(); }
  /**
   * Split the pending container requests into 3 groups based on current localities of pending
   * tasks.
   * @param hostToLocalTaskCount a map of preferred hostname to possible task counts to be used as
   *                             container placement hint.
   * @param pendingAllocations A sequence of pending allocation container request.
   * @return A tuple of 3 sequences, first is a sequence of locality matched container
   *         requests, second is a sequence of locality unmatched container requests, and third is a
   *         sequence of locality free container requests.
   */
  private  scala.Tuple3<scala.collection.Seq<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest>, scala.collection.Seq<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest>, scala.collection.Seq<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest>> splitPendingAllocationsByLocality (scala.collection.immutable.Map<java.lang.String, java.lang.Object> hostToLocalTaskCount, scala.collection.Seq<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> pendingAllocations)  { throw new RuntimeException(); }
}
