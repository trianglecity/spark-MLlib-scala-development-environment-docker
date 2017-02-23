package org.apache.spark;
/**
 * An agent that dynamically allocates and removes executors based on the workload.
 * <p>
 * The ExecutorAllocationManager maintains a moving target number of executors which is periodically
 * synced to the cluster manager. The target starts at a configured initial value and changes with
 * the number of pending and running tasks.
 * <p>
 * Decreasing the target number of executors happens when the current target is more than needed to
 * handle the current load. The target number of executors is always truncated to the number of
 * executors that could run all current running and pending tasks at once.
 * <p>
 * Increasing the target number of executors happens in response to backlogged tasks waiting to be
 * scheduled. If the scheduler queue is not drained in N seconds, then new executors are added. If
 * the queue persists for another M seconds, then more executors are added and so on. The number
 * added in each round increases exponentially from the previous round until an upper bound has been
 * reached. The upper bound is based both on a configured property and on the current number of
 * running and pending tasks, as described above.
 * <p>
 * The rationale for the exponential increase is twofold: (1) Executors should be added slowly
 * in the beginning in case the number of extra executors needed turns out to be small. Otherwise,
 * we may add more executors than we need just to remove them later. (2) Executors should be added
 * quickly over time in case the maximum number of executors is very high. Otherwise, it will take
 * a long time to ramp up under heavy workloads.
 * <p>
 * The remove policy is simpler: If an executor has been idle for K seconds, meaning it has not
 * been scheduled to run any tasks, then it is removed.
 * <p>
 * There is no retry logic in either case because we make the assumption that the cluster manager
 * will eventually fulfill all requests it receives asynchronously.
 * <p>
 * The relevant Spark properties include the following:
 * <p>
 *   spark.dynamicAllocation.enabled - Whether this feature is enabled
 *   spark.dynamicAllocation.minExecutors - Lower bound on the number of executors
 *   spark.dynamicAllocation.maxExecutors - Upper bound on the number of executors
 *   spark.dynamicAllocation.initialExecutors - Number of executors to start with
 * <p>
 *   spark.dynamicAllocation.schedulerBacklogTimeout (M) -
 *     If there are backlogged tasks for this duration, add new executors
 * <p>
 *   spark.dynamicAllocation.sustainedSchedulerBacklogTimeout (N) -
 *     If the backlog is sustained for this duration, add more executors
 *     This is used only after the initial backlog timeout is exceeded
 * <p>
 *   spark.dynamicAllocation.executorIdleTimeout (K) -
 *     If an executor has been idle for this duration, remove it
 */
  class ExecutorAllocationManager implements org.apache.spark.internal.Logging {
  /**
   * A listener that notifies the given allocation manager of when to add and remove executors.
   * <p>
   * This class is intentionally conservative in its assumptions about the relative ordering
   * and consistency of events returned by the listener. For simplicity, it does not account
   * for speculated tasks.
   */
  private  class ExecutorAllocationListener extends org.apache.spark.scheduler.SparkListener {
    public   ExecutorAllocationListener ()  { throw new RuntimeException(); }
    private  scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> stageIdToNumTasks ()  { throw new RuntimeException(); }
    private  scala.collection.mutable.HashMap<java.lang.Object, scala.collection.mutable.HashSet<java.lang.Object>> stageIdToTaskIndices ()  { throw new RuntimeException(); }
    private  scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.HashSet<java.lang.Object>> executorIdToTaskIds ()  { throw new RuntimeException(); }
    private  int numRunningTasks ()  { throw new RuntimeException(); }
    private  scala.collection.mutable.HashMap<java.lang.Object, scala.Tuple2<java.lang.Object, scala.collection.immutable.Map<java.lang.String, java.lang.Object>>> stageIdToExecutorPlacementHints ()  { throw new RuntimeException(); }
    public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmitted)  { throw new RuntimeException(); }
    public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  { throw new RuntimeException(); }
    public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart taskStart)  { throw new RuntimeException(); }
    public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
    public  void onExecutorAdded (org.apache.spark.scheduler.SparkListenerExecutorAdded executorAdded)  { throw new RuntimeException(); }
    public  void onExecutorRemoved (org.apache.spark.scheduler.SparkListenerExecutorRemoved executorRemoved)  { throw new RuntimeException(); }
    /**
     * An estimate of the total number of pending tasks remaining for currently running stages. Does
     * not account for tasks which may have failed and been resubmitted.
     * <p>
     * Note: This is not thread-safe without the caller owning the <code>allocationManager</code> lock.
     * @return (undocumented)
     */
    public  int totalPendingTasks ()  { throw new RuntimeException(); }
    /**
     * The number of tasks currently running across all stages.
     * @return (undocumented)
     */
    public  int totalRunningTasks ()  { throw new RuntimeException(); }
    /**
     * Return true if an executor is not currently running a task, and false otherwise.
     * <p>
     * Note: This is not thread-safe without the caller owning the <code>allocationManager</code> lock.
     * @param executorId (undocumented)
     * @return (undocumented)
     */
    public  boolean isExecutorIdle (java.lang.String executorId)  { throw new RuntimeException(); }
    /**
     * Update the Executor placement hints (the number of tasks with locality preferences,
     * a map where each pair is a node and the number of tasks that would like to be scheduled
     * on that node).
     * <p>
     * These hints are updated when stages arrive and complete, so are not up-to-date at task
     * granularity within stages.
     */
    public  void updateExecutorPlacementHints ()  { throw new RuntimeException(); }
  }
  /**
   * Metric source for ExecutorAllocationManager to expose its internal executor allocation
   * status to MetricsSystem.
   * Note: These metrics heavily rely on the internal implementation of
   * ExecutorAllocationManager, metrics or value of metrics will be changed when internal
   * implementation is changed, so these metrics are not stable across Spark version.
   */
    class ExecutorAllocationManagerSource implements org.apache.spark.metrics.source.Source {
    public   ExecutorAllocationManagerSource ()  { throw new RuntimeException(); }
    public  java.lang.String sourceName ()  { throw new RuntimeException(); }
    public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
    private <T extends java.lang.Object> void registerGauge (java.lang.String name, scala.Function0<T> value, T defaultValue)  { throw new RuntimeException(); }
  }
  static public  long NOT_SET ()  { throw new RuntimeException(); }
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
  public   ExecutorAllocationManager (org.apache.spark.ExecutorAllocationClient client, org.apache.spark.scheduler.LiveListenerBus listenerBus, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  private  int minNumExecutors ()  { throw new RuntimeException(); }
  private  int maxNumExecutors ()  { throw new RuntimeException(); }
  private  int initialNumExecutors ()  { throw new RuntimeException(); }
  private  long schedulerBacklogTimeoutS ()  { throw new RuntimeException(); }
  private  long sustainedSchedulerBacklogTimeoutS ()  { throw new RuntimeException(); }
  private  long executorIdleTimeoutS ()  { throw new RuntimeException(); }
  private  long cachedExecutorIdleTimeoutS ()  { throw new RuntimeException(); }
  private  boolean testing ()  { throw new RuntimeException(); }
  private  int tasksPerExecutor ()  { throw new RuntimeException(); }
  private  int numExecutorsToAdd ()  { throw new RuntimeException(); }
  private  int numExecutorsTarget ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.lang.String> executorsPendingToRemove ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.lang.String> executorIds ()  { throw new RuntimeException(); }
  private  long addTime ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> removeTimes ()  { throw new RuntimeException(); }
  private  long intervalMillis ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  private  org.apache.spark.ExecutorAllocationManager.ExecutorAllocationListener listener ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledExecutorService executor ()  { throw new RuntimeException(); }
  public  org.apache.spark.ExecutorAllocationManager.ExecutorAllocationManagerSource executorAllocationManagerSource ()  { throw new RuntimeException(); }
  private  boolean initializing ()  { throw new RuntimeException(); }
  private  int localityAwareTasks ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.Object> hostToLocalTaskCount ()  { throw new RuntimeException(); }
  /**
   * Verify that the settings specified through the config are valid.
   * If not, throw an appropriate exception.
   */
  private  void validateSettings ()  { throw new RuntimeException(); }
  /**
   * Use a different clock for this allocation manager. This is mainly used for testing.
   * @param newClock (undocumented)
   */
  public  void setClock (org.apache.spark.util.Clock newClock)  { throw new RuntimeException(); }
  /**
   * Register for scheduler callbacks to decide when to add and remove executors, and start
   * the scheduling task.
   */
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Stop the allocation manager.
   */
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Reset the allocation manager to the initial state. Currently this will only be called in
   * yarn-client mode when AM re-registers after a failure.
   */
  public  void reset ()  { throw new RuntimeException(); }
  /**
   * The maximum number of executors we would need under the current load to satisfy all running
   * and pending tasks, rounded up.
   * @return (undocumented)
   */
  private  int maxNumExecutorsNeeded ()  { throw new RuntimeException(); }
  /**
   * This is called at a fixed interval to regulate the number of pending executor requests
   * and number of executors running.
   * <p>
   * First, adjust our requested executors based on the add time and our current needs.
   * Then, if the remove time for an existing executor has expired, kill the executor.
   * <p>
   * This is factored out into its own method for testing.
   */
  private  void schedule ()  { throw new RuntimeException(); }
  /**
   * Updates our target number of executors and syncs the result with the cluster manager.
   * <p>
   * Check to see whether our existing allocation and the requests we've made previously exceed our
   * current needs. If so, truncate our target and let the cluster manager know so that it can
   * cancel pending requests that are unneeded.
   * <p>
   * If not, and the add time has expired, see if we can request new executors and refresh the add
   * time.
   * <p>
   * @return the delta in the target number of executors.
   * @param now (undocumented)
   */
  private  int updateAndSyncNumExecutorsTarget (long now)  { throw new RuntimeException(); }
  /**
   * Request a number of executors from the cluster manager.
   * If the cap on the number of executors is reached, give up and reset the
   * number of executors to add next round instead of continuing to double it.
   * <p>
   * @param maxNumExecutorsNeeded the maximum number of executors all currently running or pending
   *                              tasks could fill
   * @return the number of additional executors actually requested.
   */
  private  int addExecutors (int maxNumExecutorsNeeded)  { throw new RuntimeException(); }
  /**
   * Request the cluster manager to remove the given executors.
   * Returns the list of executors which are removed.
   * @param executors (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<java.lang.String> removeExecutors (scala.collection.Seq<java.lang.String> executors)  { throw new RuntimeException(); }
  /**
   * Request the cluster manager to remove the given executor.
   * Return whether the request is acknowledged.
   * @param executorId (undocumented)
   * @return (undocumented)
   */
  private  boolean removeExecutor (java.lang.String executorId)  { throw new RuntimeException(); }
  /**
   * Determine if the given executor can be killed.
   * @param executorId (undocumented)
   * @return (undocumented)
   */
  private  boolean canBeKilled (java.lang.String executorId)  { throw new RuntimeException(); }
  /**
   * Callback invoked when the specified executor has been added.
   * @param executorId (undocumented)
   */
  private  void onExecutorAdded (java.lang.String executorId)  { throw new RuntimeException(); }
  /**
   * Callback invoked when the specified executor has been removed.
   * @param executorId (undocumented)
   */
  private  void onExecutorRemoved (java.lang.String executorId)  { throw new RuntimeException(); }
  /**
   * Callback invoked when the scheduler receives new pending tasks.
   * This sets a time in the future that decides when executors should be added
   * if it is not already set.
   */
  private  void onSchedulerBacklogged ()  { throw new RuntimeException(); }
  /**
   * Callback invoked when the scheduler queue is drained.
   * This resets all variables used for adding executors.
   */
  private  void onSchedulerQueueEmpty ()  { throw new RuntimeException(); }
  /**
   * Callback invoked when the specified executor is no longer running any tasks.
   * This sets a time in the future that decides when this executor should be removed if
   * the executor is not already marked as idle.
   * @param executorId (undocumented)
   */
  private  void onExecutorIdle (java.lang.String executorId)  { throw new RuntimeException(); }
  /**
   * Callback invoked when the specified executor is now running a task.
   * This resets all variables used for removing this executor.
   * @param executorId (undocumented)
   */
  private  void onExecutorBusy (java.lang.String executorId)  { throw new RuntimeException(); }
}
