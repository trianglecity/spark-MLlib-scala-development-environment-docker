package org.apache.spark.scheduler;
/**
 * A stage is a set of parallel tasks all computing the same function that need to run as part
 * of a Spark job, where all the tasks have the same shuffle dependencies. Each DAG of tasks run
 * by the scheduler is split up into stages at the boundaries where shuffle occurs, and then the
 * DAGScheduler runs these stages in topological order.
 * <p>
 * Each Stage can either be a shuffle map stage, in which case its tasks' results are input for
 * other stage(s), or a result stage, in which case its tasks directly compute a Spark action
 * (e.g. count(), save(), etc) by running a function on an RDD. For shuffle map stages, we also
 * track the nodes that each output partition is on.
 * <p>
 * Each Stage also has a firstJobId, identifying the job that first submitted the stage.  When FIFO
 * scheduling is used, this allows Stages from earlier jobs to be computed first or recovered
 * faster on failure.
 * <p>
 * Finally, a single stage can be re-executed in multiple attempts due to fault recovery. In that
 * case, the Stage object will track multiple StageInfo objects to pass to listeners or the web UI.
 * The latest one will be accessible through latestInfo.
 * <p>
 * param:  id Unique stage ID
 * param:  rdd RDD that this stage runs on: for a shuffle map stage, it's the RDD we run map tasks
 *   on, while for a result stage, it's the target RDD that we ran an action on
 * param:  numTasks Total number of tasks in stage; result stages in particular may not need to
 *   compute all partitions, e.g. for first(), lookup(), and take().
 * param:  parents List of stages that this stage depends on (through shuffle dependencies).
 * param:  firstJobId ID of the first job this stage was part of, for FIFO scheduling.
 * param:  callSite Location in the user program associated with this stage: either where the target
 *   RDD was created, for a shuffle map stage, or where the action for a result stage was called.
 */
 abstract class Stage implements org.apache.spark.internal.Logging {
  static public  int MAX_CONSECUTIVE_FETCH_FAILURES ()  { throw new RuntimeException(); }
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
  public  int id ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<?> rdd ()  { throw new RuntimeException(); }
  public  int numTasks ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.scheduler.Stage> parents ()  { throw new RuntimeException(); }
  public  int firstJobId ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.CallSite callSite ()  { throw new RuntimeException(); }
  // not preceding
  public   Stage (int id, org.apache.spark.rdd.RDD<?> rdd, int numTasks, scala.collection.immutable.List<org.apache.spark.scheduler.Stage> parents, int firstJobId, org.apache.spark.util.CallSite callSite)  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  /** Set of jobs that this stage belongs to. */
  public  scala.collection.mutable.HashSet<java.lang.Object> jobIds ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<java.lang.Object> pendingPartitions ()  { throw new RuntimeException(); }
  /** The ID to use for the next new attempt for this stage. */
  private  int nextAttemptId ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String details ()  { throw new RuntimeException(); }
  /**
   * Pointer to the [StageInfo] object for the most recent attempt. This needs to be initialized
   * here, before any attempts have actually been created, because the DAGScheduler uses this
   * StageInfo to tell SparkListeners when a job starts (which happens before any stage attempts
   * have been created).
   * @return (undocumented)
   */
  private  org.apache.spark.scheduler.StageInfo _latestInfo ()  { throw new RuntimeException(); }
  /**
   * Set of stage attempt IDs that have failed with a FetchFailure. We keep track of these
   * failures in order to avoid endless retries if a stage keeps failing with a FetchFailure.
   * We keep track of each attempt ID that has failed to avoid recording duplicate failures if
   * multiple tasks from the same stage attempt fail (SPARK-5945).
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashSet<java.lang.Object> fetchFailedAttemptIds ()  { throw new RuntimeException(); }
    void clearFailures ()  { throw new RuntimeException(); }
  /**
   * Check whether we should abort the failedStage due to multiple consecutive fetch failures.
   * <p>
   * This method updates the running set of failed stage attempts and returns
   * true if the number of failures exceeds the allowable number of failures.
   * @param stageAttemptId (undocumented)
   * @return (undocumented)
   */
    boolean failedOnFetchAndShouldAbort (int stageAttemptId)  { throw new RuntimeException(); }
  /** Creates a new attempt for this stage by creating a new StageInfo with a new attempt ID. */
  public  void makeNewStageAttempt (int numPartitionsToCompute, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> taskLocalityPreferences)  { throw new RuntimeException(); }
  /** Returns the StageInfo for the most recent attempt for this stage. */
  public  org.apache.spark.scheduler.StageInfo latestInfo ()  { throw new RuntimeException(); }
  public final  int hashCode ()  { throw new RuntimeException(); }
  public final  boolean equals (Object other)  { throw new RuntimeException(); }
  /** Returns the sequence of partition ids that are missing (i.e. needs to be computed). */
  public abstract  scala.collection.Seq<java.lang.Object> findMissingPartitions ()  ;
}
