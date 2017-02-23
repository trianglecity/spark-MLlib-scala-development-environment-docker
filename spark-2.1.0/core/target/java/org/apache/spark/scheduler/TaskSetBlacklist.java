package org.apache.spark.scheduler;
/**
 * Handles blacklisting executors and nodes within a taskset.  This includes blacklisting specific
 * (task, executor) / (task, nodes) pairs, and also completely blacklisting executors and nodes
 * for the entire taskset.
 * <p>
 * THREADING:  This class is a helper to {@link TaskSetManager}; as with the methods in
 * {@link TaskSetManager} this class is designed only to be called from code with a lock on the
 * TaskScheduler (e.g. its event handlers). It should not be called from other threads.
 */
  class TaskSetBlacklist implements org.apache.spark.internal.Logging {
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskSetBlacklist (org.apache.spark.SparkConf conf, int stageId, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  private  int MAX_TASK_ATTEMPTS_PER_EXECUTOR ()  { throw new RuntimeException(); }
  private  int MAX_TASK_ATTEMPTS_PER_NODE ()  { throw new RuntimeException(); }
  private  int MAX_FAILURES_PER_EXEC_STAGE ()  { throw new RuntimeException(); }
  private  int MAX_FAILED_EXEC_PER_NODE_STAGE ()  { throw new RuntimeException(); }
  /**
   * A map from each executor to the task failures on that executor.
   * @return (undocumented)
   */
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.scheduler.ExecutorFailuresInTaskSet> execToFailures ()  { throw new RuntimeException(); }
  /**
   * Map from node to all executors on it with failures.  Needed because we want to know about
   * executors on a node even after they have died. (We don't want to bother tracking the
   * node -> execs mapping in the usual case when there aren't any failures).
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.HashSet<java.lang.String>> nodeToExecsWithFailures ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.HashSet<java.lang.Object>> nodeToBlacklistedTaskIndexes ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.lang.String> blacklistedExecs ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.lang.String> blacklistedNodes ()  { throw new RuntimeException(); }
  /**
   * Return true if this executor is blacklisted for the given task.  This does *not*
   * need to return true if the executor is blacklisted for the entire stage.
   * That is to keep this method as fast as possible in the inner-loop of the
   * scheduler, where those filters will have already been applied.
   * @param executorId (undocumented)
   * @param index (undocumented)
   * @return (undocumented)
   */
  public  boolean isExecutorBlacklistedForTask (java.lang.String executorId, int index)  { throw new RuntimeException(); }
  public  boolean isNodeBlacklistedForTask (java.lang.String node, int index)  { throw new RuntimeException(); }
  /**
   * Return true if this executor is blacklisted for the given stage.  Completely ignores
   * anything to do with the node the executor is on.  That
   * is to keep this method as fast as possible in the inner-loop of the scheduler, where those
   * filters will already have been applied.
   * @param executorId (undocumented)
   * @return (undocumented)
   */
  public  boolean isExecutorBlacklistedForTaskSet (java.lang.String executorId)  { throw new RuntimeException(); }
  public  boolean isNodeBlacklistedForTaskSet (java.lang.String node)  { throw new RuntimeException(); }
    void updateBlacklistForFailedTask (java.lang.String host, java.lang.String exec, int index)  { throw new RuntimeException(); }
}
