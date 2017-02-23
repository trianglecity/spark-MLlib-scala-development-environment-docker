package org.apache.spark.scheduler;
/**
 * Authority that decides whether tasks can commit output to HDFS. Uses a "first committer wins"
 * policy.
 * <p>
 * OutputCommitCoordinator is instantiated in both the drivers and executors. On executors, it is
 * configured with a reference to the driver's OutputCommitCoordinatorEndpoint, so requests to
 * commit output will be forwarded to the driver's OutputCommitCoordinator.
 * <p>
 * This class was introduced in SPARK-4879; see that JIRA issue (and the associated pull requests)
 * for an extensive design discussion.
 */
  class OutputCommitCoordinator implements org.apache.spark.internal.Logging {
  static   class OutputCommitCoordinatorEndpoint implements org.apache.spark.rpc.RpcEndpoint, org.apache.spark.internal.Logging {
    public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
    // not preceding
    public   OutputCommitCoordinatorEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.scheduler.OutputCommitCoordinator outputCommitCoordinator)  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  }
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
  public   OutputCommitCoordinator (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rpc.RpcEndpointRef> coordinatorRef ()  { throw new RuntimeException(); }
  private  int NO_AUTHORIZED_COMMITTER ()  { throw new RuntimeException(); }
  /**
   * Map from active stages's id =&gt; partition id =&gt; task attempt with exclusive lock on committing
   * output for that partition.
   * <p>
   * Entries are added to the top-level map when stages start and are removed they finish
   * (either successfully or unsuccessfully).
   * <p>
   * Access to this map should be guarded by synchronizing on the OutputCommitCoordinator instance.
   * @return (undocumented)
   */
  private  scala.collection.mutable.Map<java.lang.Object, int[]> authorizedCommittersByStage ()  { throw new RuntimeException(); }
  /**
   * Returns whether the OutputCommitCoordinator's internal data structures are all empty.
   * @return (undocumented)
   */
  public  boolean isEmpty ()  { throw new RuntimeException(); }
  /**
   * Called by tasks to ask whether they can commit their output to HDFS.
   * <p>
   * If a task attempt has been authorized to commit, then all other attempts to commit the same
   * task will be denied.  If the authorized task attempt fails (e.g. due to its executor being
   * lost), then a subsequent task attempt may be authorized to commit its output.
   * <p>
   * @param stage the stage number
   * @param partition the partition number
   * @param attemptNumber how many times this task has been attempted
   *                      (see {@link TaskContext.attemptNumber()})
   * @return true if this task is authorized to commit, false otherwise
   */
  public  boolean canCommit (int stage, int partition, int attemptNumber)  { throw new RuntimeException(); }
  /**
   * Called by the DAGScheduler when a stage starts.
   * <p>
   * @param stage the stage id.
   * @param maxPartitionId the maximum partition id that could appear in this stage's tasks (i.e.
   *                       the maximum possible value of <code>context.partitionId</code>).
   */
    void stageStart (int stage, int maxPartitionId)  { throw new RuntimeException(); }
    void stageEnd (int stage)  { throw new RuntimeException(); }
    void taskCompleted (int stage, int partition, int attemptNumber, org.apache.spark.TaskEndReason reason)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
    boolean handleAskPermissionToCommit (int stage, int partition, int attemptNumber)  { throw new RuntimeException(); }
}
