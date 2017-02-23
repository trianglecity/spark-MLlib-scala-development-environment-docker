package org.apache.spark.scheduler;
/**
 * The high-level scheduling layer that implements stage-oriented scheduling. It computes a DAG of
 * stages for each job, keeps track of which RDDs and stage outputs are materialized, and finds a
 * minimal schedule to run the job. It then submits stages as TaskSets to an underlying
 * TaskScheduler implementation that runs them on the cluster. A TaskSet contains fully independent
 * tasks that can run right away based on the data that's already on the cluster (e.g. map output
 * files from previous stages), though it may fail if this data becomes unavailable.
 * <p>
 * Spark stages are created by breaking the RDD graph at shuffle boundaries. RDD operations with
 * "narrow" dependencies, like map() and filter(), are pipelined together into one set of tasks
 * in each stage, but operations with shuffle dependencies require multiple stages (one to write a
 * set of map output files, and another to read those files after a barrier). In the end, every
 * stage will have only shuffle dependencies on other stages, and may compute multiple operations
 * inside it. The actual pipelining of these operations happens in the RDD.compute() functions of
 * various RDDs (MappedRDD, FilteredRDD, etc).
 * <p>
 * In addition to coming up with a DAG of stages, the DAGScheduler also determines the preferred
 * locations to run each task on, based on the current cache status, and passes these to the
 * low-level TaskScheduler. Furthermore, it handles failures due to shuffle output files being
 * lost, in which case old stages may need to be resubmitted. Failures *within* a stage that are
 * not caused by shuffle file loss are handled by the TaskScheduler, which will retry each task
 * a small number of times before cancelling the whole stage.
 * <p>
 * When looking through this code, there are several key concepts:
 * <p>
 *  - Jobs (represented by {@link ActiveJob}) are the top-level work items submitted to the scheduler.
 *    For example, when the user calls an action, like count(), a job will be submitted through
 *    submitJob. Each Job may require the execution of multiple stages to build intermediate data.
 * <p>
 *  - Stages ({@link Stage}) are sets of tasks that compute intermediate results in jobs, where each
 *    task computes the same function on partitions of the same RDD. Stages are separated at shuffle
 *    boundaries, which introduce a barrier (where we must wait for the previous stage to finish to
 *    fetch outputs). There are two types of stages: {@link ResultStage}, for the final stage that
 *    executes an action, and {@link ShuffleMapStage}, which writes map output files for a shuffle.
 *    Stages are often shared across multiple jobs, if these jobs reuse the same RDDs.
 * <p>
 *  - Tasks are individual units of work, each sent to one machine.
 * <p>
 *  - Cache tracking: the DAGScheduler figures out which RDDs are cached to avoid recomputing them
 *    and likewise remembers which shuffle map stages have already produced output files to avoid
 *    redoing the map side of a shuffle.
 * <p>
 *  - Preferred locations: the DAGScheduler also computes where to run each task in a stage based
 *    on the preferred locations of its underlying RDDs, or the location of cached or shuffle data.
 * <p>
 *  - Cleanup: all data structures are cleared when the running jobs that depend on them finish,
 *    to prevent memory leaks in a long-running application.
 * <p>
 * To recover from failures, the same stage might need to run multiple times, which are called
 * "attempts". If the TaskScheduler reports that a task failed because a map output file from a
 * previous stage was lost, the DAGScheduler resubmits that lost stage. This is detected through a
 * CompletionEvent with FetchFailed, or an ExecutorLost event. The DAGScheduler will wait a small
 * amount of time to see whether other nodes or tasks fail, then resubmit TaskSets for any lost
 * stage(s) that compute the missing tasks. As part of this process, we might also have to create
 * Stage objects for old (finished) stages where we previously cleaned up the Stage object. Since
 * tasks from the old attempt of a stage could still be running, care must be taken to map any
 * events received in the correct Stage object.
 * <p>
 * Here's a checklist to use when making or reviewing changes to this class:
 * <p>
 *  - All data structures should be cleared when the jobs involving them end to avoid indefinite
 *    accumulation of state in long-running programs.
 * <p>
 *  - When adding a new data structure, update <code>DAGSchedulerSuite.assertDataStructuresEmpty</code> to
 *    include the new structure. This will help to catch memory leaks.
 */
  class DAGScheduler implements org.apache.spark.internal.Logging {
  static public  int RESUBMIT_TIMEOUT ()  { throw new RuntimeException(); }
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
    org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
    org.apache.spark.scheduler.TaskScheduler taskScheduler ()  { throw new RuntimeException(); }
  // not preceding
  public   DAGScheduler (org.apache.spark.SparkContext sc, org.apache.spark.scheduler.TaskScheduler taskScheduler, org.apache.spark.scheduler.LiveListenerBus listenerBus, org.apache.spark.MapOutputTrackerMaster mapOutputTracker, org.apache.spark.storage.BlockManagerMaster blockManagerMaster, org.apache.spark.SparkEnv env, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  public   DAGScheduler (org.apache.spark.SparkContext sc, org.apache.spark.scheduler.TaskScheduler taskScheduler)  { throw new RuntimeException(); }
  public   DAGScheduler (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
    org.apache.spark.scheduler.DAGSchedulerSource metricsSource ()  { throw new RuntimeException(); }
    java.util.concurrent.atomic.AtomicInteger nextJobId ()  { throw new RuntimeException(); }
    int numTotalJobs ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicInteger nextStageId ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.Object, scala.collection.mutable.HashSet<java.lang.Object>> jobIdToStageIds ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.Stage> stageIdToStage ()  { throw new RuntimeException(); }
  /**
   * Mapping from shuffle dependency ID to the ShuffleMapStage that will generate the data for
   * that dependency. Only includes stages that are part of currently running job (when the job(s)
   * that require the shuffle stage complete, the mapping will be removed, and the only record of
   * the shuffle data will be in the MapOutputTracker).
   * @return (undocumented)
   */
    scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.ShuffleMapStage> shuffleIdToMapStage ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.ActiveJob> jobIdToActiveJob ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashSet<org.apache.spark.scheduler.Stage> waitingStages ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashSet<org.apache.spark.scheduler.Stage> runningStages ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashSet<org.apache.spark.scheduler.Stage> failedStages ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashSet<org.apache.spark.scheduler.ActiveJob> activeJobs ()  { throw new RuntimeException(); }
  /**
   * Contains the locations that each RDD's partitions are cached on.  This map's keys are RDD ids
   * and its values are arrays indexed by partition numbers. Each array value is the set of
   * locations where that RDD partition is cached.
   * <p>
   * All accesses to this map should be guarded by synchronizing on it (see SPARK-4454).
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashMap<java.lang.Object, scala.collection.IndexedSeq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>>> cacheLocs ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> failedEpoch ()  { throw new RuntimeException(); }
    org.apache.spark.scheduler.OutputCommitCoordinator outputCommitCoordinator ()  { throw new RuntimeException(); }
  private  org.apache.spark.serializer.SerializerInstance closureSerializer ()  { throw new RuntimeException(); }
  /** If enabled, FetchFailed will not cause stage retry, in order to surface the problem. */
  private  boolean disallowStageRetryForTest ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledExecutorService messageScheduler ()  { throw new RuntimeException(); }
    org.apache.spark.scheduler.DAGSchedulerEventProcessLoop eventProcessLoop ()  { throw new RuntimeException(); }
  /**
   * Called by the TaskSetManager to report task's starting.
   * @param task (undocumented)
   * @param taskInfo (undocumented)
   */
  public  void taskStarted (org.apache.spark.scheduler.Task<?> task, org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
  /**
   * Called by the TaskSetManager to report that a task has completed
   * and results are being fetched remotely.
   * @param taskInfo (undocumented)
   */
  public  void taskGettingResult (org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
  /**
   * Called by the TaskSetManager to report task completions or failures.
   * @param task (undocumented)
   * @param reason (undocumented)
   * @param result (undocumented)
   * @param accumUpdates (undocumented)
   * @param taskInfo (undocumented)
   */
  public  void taskEnded (org.apache.spark.scheduler.Task<?> task, org.apache.spark.TaskEndReason reason, Object result, scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> accumUpdates, org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
  /**
   * Update metrics for in-progress tasks and let the master know that the BlockManager is still
   * alive. Return true if the driver knows about the given block manager. Otherwise, return false,
   * indicating that the block manager should re-register.
   * @param execId (undocumented)
   * @param accumUpdates (undocumented)
   * @param blockManagerId (undocumented)
   * @return (undocumented)
   */
  public  boolean executorHeartbeatReceived (java.lang.String execId, scala.Tuple4<java.lang.Object, java.lang.Object, java.lang.Object, scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo>>[] accumUpdates, org.apache.spark.storage.BlockManagerId blockManagerId)  { throw new RuntimeException(); }
  /**
   * Called by TaskScheduler implementation when an executor fails.
   * @param execId (undocumented)
   * @param reason (undocumented)
   */
  public  void executorLost (java.lang.String execId, org.apache.spark.scheduler.ExecutorLossReason reason)  { throw new RuntimeException(); }
  /**
   * Called by TaskScheduler implementation when a host is added.
   * @param execId (undocumented)
   * @param host (undocumented)
   */
  public  void executorAdded (java.lang.String execId, java.lang.String host)  { throw new RuntimeException(); }
  /**
   * Called by the TaskSetManager to cancel an entire TaskSet due to either repeated failures or
   * cancellation of the job itself.
   * @param taskSet (undocumented)
   * @param reason (undocumented)
   * @param exception (undocumented)
   */
  public  void taskSetFailed (org.apache.spark.scheduler.TaskSet taskSet, java.lang.String reason, scala.Option<java.lang.Throwable> exception)  { throw new RuntimeException(); }
    scala.collection.IndexedSeq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> getCacheLocs (org.apache.spark.rdd.RDD<?> rdd)  { throw new RuntimeException(); }
  private  void clearCacheLocs ()  { throw new RuntimeException(); }
  /**
   * Gets a shuffle map stage if one exists in shuffleIdToMapStage. Otherwise, if the
   * shuffle map stage doesn't already exist, this method will create the shuffle map stage in
   * addition to any missing ancestor shuffle map stages.
   * @param shuffleDep (undocumented)
   * @param firstJobId (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.scheduler.ShuffleMapStage getOrCreateShuffleMapStage (org.apache.spark.ShuffleDependency<?, ?, ?> shuffleDep, int firstJobId)  { throw new RuntimeException(); }
  /**
   * Creates a ShuffleMapStage that generates the given shuffle dependency's partitions. If a
   * previously run stage generated the same shuffle data, this function will copy the output
   * locations that are still available from the previous shuffle to avoid unnecessarily
   * regenerating data.
   * @param shuffleDep (undocumented)
   * @param jobId (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.scheduler.ShuffleMapStage createShuffleMapStage (org.apache.spark.ShuffleDependency<?, ?, ?> shuffleDep, int jobId)  { throw new RuntimeException(); }
  /**
   * Create a ResultStage associated with the provided jobId.
   * @param rdd (undocumented)
   * @param func (undocumented)
   * @param partitions (undocumented)
   * @param jobId (undocumented)
   * @param callSite (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.scheduler.ResultStage createResultStage (org.apache.spark.rdd.RDD<?> rdd, scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<?>, ?> func, int[] partitions, int jobId, org.apache.spark.util.CallSite callSite)  { throw new RuntimeException(); }
  /**
   * Get or create the list of parent stages for a given RDD.  The new Stages will be created with
   * the provided firstJobId.
   * @param rdd (undocumented)
   * @param firstJobId (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.immutable.List<org.apache.spark.scheduler.Stage> getOrCreateParentStages (org.apache.spark.rdd.RDD<?> rdd, int firstJobId)  { throw new RuntimeException(); }
  /** Find ancestor shuffle dependencies that are not registered in shuffleToMapStage yet */
  private  scala.collection.mutable.Stack<org.apache.spark.ShuffleDependency<?, ?, ?>> getMissingAncestorShuffleDependencies (org.apache.spark.rdd.RDD<?> rdd)  { throw new RuntimeException(); }
  /**
   * Returns shuffle dependencies that are immediate parents of the given RDD.
   * <p>
   * This function will not return more distant ancestors.  For example, if C has a shuffle
   * dependency on B which has a shuffle dependency on A:
   * <p>
   * A <-- B <-- C
   * <p>
   * calling this function with rdd C will only return the B <-- C dependency.
   * <p>
   * This function is scheduler-visible for the purpose of unit testing.
   * @param rdd (undocumented)
   * @return (undocumented)
   */
    scala.collection.mutable.HashSet<org.apache.spark.ShuffleDependency<?, ?, ?>> getShuffleDependencies (org.apache.spark.rdd.RDD<?> rdd)  { throw new RuntimeException(); }
  private  scala.collection.immutable.List<org.apache.spark.scheduler.Stage> getMissingParentStages (org.apache.spark.scheduler.Stage stage)  { throw new RuntimeException(); }
  /**
   * Registers the given jobId among the jobs that need the given stage and
   * all of that stage's ancestors.
   * @param jobId (undocumented)
   * @param stage (undocumented)
   */
  private  void updateJobIdStageIdMaps (int jobId, org.apache.spark.scheduler.Stage stage)  { throw new RuntimeException(); }
  /**
   * Removes state for job and any stages that are not needed by any other job.  Does not
   * handle cancelling tasks or notifying the SparkListener about finished jobs/stages/tasks.
   * <p>
   * @param job The job whose state to cleanup.
   */
  private  void cleanupStateForJobAndIndependentStages (org.apache.spark.scheduler.ActiveJob job)  { throw new RuntimeException(); }
  /**
   * Submit an action job to the scheduler.
   * <p>
   * @param rdd target RDD to run tasks on
   * @param func a function to run on each partition of the RDD
   * @param partitions set of partitions to run on; some jobs may not want to compute on all
   *   partitions of the target RDD, e.g. for operations like first()
   * @param callSite where in the user program this job was called
   * @param resultHandler callback to pass each result to
   * @param properties scheduler properties to attach to this job, e.g. fair scheduler pool name
   * <p>
   * @return a JobWaiter object that can be used to block until the job finishes executing
   *         or can be used to cancel the job.
   * <p>
   * @throws IllegalArgumentException when partitions ids are illegal
   */
  public <T extends java.lang.Object, U extends java.lang.Object> org.apache.spark.scheduler.JobWaiter<U> submitJob (org.apache.spark.rdd.RDD<T> rdd, scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<T>, U> func, scala.collection.Seq<java.lang.Object> partitions, org.apache.spark.util.CallSite callSite, scala.Function2<java.lang.Object, U, scala.runtime.BoxedUnit> resultHandler, java.util.Properties properties)  { throw new RuntimeException(); }
  /**
   * Run an action job on the given RDD and pass all the results to the resultHandler function as
   * they arrive.
   * <p>
   * @param rdd target RDD to run tasks on
   * @param func a function to run on each partition of the RDD
   * @param partitions set of partitions to run on; some jobs may not want to compute on all
   *   partitions of the target RDD, e.g. for operations like first()
   * @param callSite where in the user program this job was called
   * @param resultHandler callback to pass each result to
   * @param properties scheduler properties to attach to this job, e.g. fair scheduler pool name
   * <p>
   * @throws Exception when the job fails
   */
  public <T extends java.lang.Object, U extends java.lang.Object> void runJob (org.apache.spark.rdd.RDD<T> rdd, scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<T>, U> func, scala.collection.Seq<java.lang.Object> partitions, org.apache.spark.util.CallSite callSite, scala.Function2<java.lang.Object, U, scala.runtime.BoxedUnit> resultHandler, java.util.Properties properties)  { throw new RuntimeException(); }
  /**
   * Run an approximate job on the given RDD and pass all the results to an ApproximateEvaluator
   * as they arrive. Returns a partial result object from the evaluator.
   * <p>
   * @param rdd target RDD to run tasks on
   * @param func a function to run on each partition of the RDD
   * @param evaluator {@link ApproximateEvaluator} to receive the partial results
   * @param callSite where in the user program this job was called
   * @param timeout maximum time to wait for the job, in milliseconds
   * @param properties scheduler properties to attach to this job, e.g. fair scheduler pool name
   * @return (undocumented)
   */
  public <T extends java.lang.Object, U extends java.lang.Object, R extends java.lang.Object> org.apache.spark.partial.PartialResult<R> runApproximateJob (org.apache.spark.rdd.RDD<T> rdd, scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<T>, U> func, org.apache.spark.partial.ApproximateEvaluator<U, R> evaluator, org.apache.spark.util.CallSite callSite, long timeout, java.util.Properties properties)  { throw new RuntimeException(); }
  /**
   * Submit a shuffle map stage to run independently and get a JobWaiter object back. The waiter
   * can be used to block until the job finishes executing or can be used to cancel the job.
   * This method is used for adaptive query planning, to run map stages and look at statistics
   * about their outputs before submitting downstream stages.
   * <p>
   * @param dependency the ShuffleDependency to run a map stage for
   * @param callback function called with the result of the job, which in this case will be a
   *   single MapOutputStatistics object showing how much data was produced for each partition
   * @param callSite where in the user program this job was submitted
   * @param properties scheduler properties to attach to this job, e.g. fair scheduler pool name
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> org.apache.spark.scheduler.JobWaiter<org.apache.spark.MapOutputStatistics> submitMapStage (org.apache.spark.ShuffleDependency<K, V, C> dependency, scala.Function1<org.apache.spark.MapOutputStatistics, scala.runtime.BoxedUnit> callback, org.apache.spark.util.CallSite callSite, java.util.Properties properties)  { throw new RuntimeException(); }
  /**
   * Cancel a job that is running or waiting in the queue.
   * @param jobId (undocumented)
   */
  public  void cancelJob (int jobId)  { throw new RuntimeException(); }
  /**
   * Cancel all jobs in the given job group ID.
   * @param groupId (undocumented)
   */
  public  void cancelJobGroup (java.lang.String groupId)  { throw new RuntimeException(); }
  /**
   * Cancel all jobs that are running or waiting in the queue.
   */
  public  void cancelAllJobs ()  { throw new RuntimeException(); }
    void doCancelAllJobs ()  { throw new RuntimeException(); }
  /**
   * Cancel all jobs associated with a running or scheduled stage.
   * @param stageId (undocumented)
   */
  public  void cancelStage (int stageId)  { throw new RuntimeException(); }
  /**
   * Resubmit any failed stages. Ordinarily called after a small amount of time has passed since
   * the last fetch failure.
   */
    void resubmitFailedStages ()  { throw new RuntimeException(); }
  /**
   * Check for waiting stages which are now eligible for resubmission.
   * Submits stages that depend on the given parent stage. Called when the parent stage completes
   * successfully.
   * @param parent (undocumented)
   */
  private  void submitWaitingChildStages (org.apache.spark.scheduler.Stage parent)  { throw new RuntimeException(); }
  /** Finds the earliest-created active job that needs the stage */
  private  scala.Option<java.lang.Object> activeJobForStage (org.apache.spark.scheduler.Stage stage)  { throw new RuntimeException(); }
    void handleJobGroupCancelled (java.lang.String groupId)  { throw new RuntimeException(); }
    void handleBeginEvent (org.apache.spark.scheduler.Task<?> task, org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
    void handleTaskSetFailed (org.apache.spark.scheduler.TaskSet taskSet, java.lang.String reason, scala.Option<java.lang.Throwable> exception)  { throw new RuntimeException(); }
    void cleanUpAfterSchedulerStop ()  { throw new RuntimeException(); }
    void handleGetTaskResult (org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
    void handleJobSubmitted (int jobId, org.apache.spark.rdd.RDD<?> finalRDD, scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<?>, ?> func, int[] partitions, org.apache.spark.util.CallSite callSite, org.apache.spark.scheduler.JobListener listener, java.util.Properties properties)  { throw new RuntimeException(); }
    void handleMapStageSubmitted (int jobId, org.apache.spark.ShuffleDependency<?, ?, ?> dependency, org.apache.spark.util.CallSite callSite, org.apache.spark.scheduler.JobListener listener, java.util.Properties properties)  { throw new RuntimeException(); }
  /** Submits stage, but first recursively submits any missing parents. */
  private  void submitStage (org.apache.spark.scheduler.Stage stage)  { throw new RuntimeException(); }
  /** Called when stage's parents are available and we can now do its task. */
  private  void submitMissingTasks (org.apache.spark.scheduler.Stage stage, int jobId)  { throw new RuntimeException(); }
  /**
   * Merge local values from a task into the corresponding accumulators previously registered
   * here on the driver.
   * <p>
   * Although accumulators themselves are not thread-safe, this method is called only from one
   * thread, the one that runs the scheduling loop. This means we only handle one task
   * completion event at a time so we don't need to worry about locking the accumulators.
   * This still doesn't stop the caller from updating the accumulator outside the scheduler,
   * but that's not our problem since there's nothing we can do about that.
   * @param event (undocumented)
   */
  private  void updateAccumulators (org.apache.spark.scheduler.CompletionEvent event)  { throw new RuntimeException(); }
  /**
   * Responds to a task finishing. This is called inside the event loop so it assumes that it can
   * modify the scheduler's internal state. Use taskEnded() to post a task end event from outside.
   * @param event (undocumented)
   */
    void handleTaskCompletion (org.apache.spark.scheduler.CompletionEvent event)  { throw new RuntimeException(); }
  /**
   * Responds to an executor being lost. This is called inside the event loop, so it assumes it can
   * modify the scheduler's internal state. Use executorLost() to post a loss event from outside.
   * <p>
   * We will also assume that we've lost all shuffle blocks associated with the executor if the
   * executor serves its own blocks (i.e., we're not using external shuffle), the entire slave
   * is lost (likely including the shuffle service), or a FetchFailed occurred, in which case we
   * presume all shuffle data related to this executor to be lost.
   * <p>
   * Optionally the epoch during which the failure was caught can be passed to avoid allowing
   * stray fetch failures from possibly retriggering the detection of a node as lost.
   * @param execId (undocumented)
   * @param filesLost (undocumented)
   * @param maybeEpoch (undocumented)
   */
    void handleExecutorLost (java.lang.String execId, boolean filesLost, scala.Option<java.lang.Object> maybeEpoch)  { throw new RuntimeException(); }
    void handleExecutorAdded (java.lang.String execId, java.lang.String host)  { throw new RuntimeException(); }
    void handleStageCancellation (int stageId)  { throw new RuntimeException(); }
    void handleJobCancellation (int jobId, java.lang.String reason)  { throw new RuntimeException(); }
  /**
   * Marks a stage as finished and removes it from the list of running stages.
   * @param stage (undocumented)
   * @param errorMessage (undocumented)
   */
  private  void markStageAsFinished (org.apache.spark.scheduler.Stage stage, scala.Option<java.lang.String> errorMessage)  { throw new RuntimeException(); }
  /**
   * Aborts all jobs depending on a particular Stage. This is called in response to a task set
   * being canceled by the TaskScheduler. Use taskSetFailed() to inject this event from outside.
   * @param failedStage (undocumented)
   * @param reason (undocumented)
   * @param exception (undocumented)
   */
    void abortStage (org.apache.spark.scheduler.Stage failedStage, java.lang.String reason, scala.Option<java.lang.Throwable> exception)  { throw new RuntimeException(); }
  /** Fails a job and all stages that are only used by that job, and cleans up relevant state. */
  private  void failJobAndIndependentStages (org.apache.spark.scheduler.ActiveJob job, java.lang.String failureReason, scala.Option<java.lang.Throwable> exception)  { throw new RuntimeException(); }
  /** Return true if one of stage's ancestors is target. */
  private  boolean stageDependsOn (org.apache.spark.scheduler.Stage stage, org.apache.spark.scheduler.Stage target)  { throw new RuntimeException(); }
  /**
   * Gets the locality information associated with a partition of a particular RDD.
   * <p>
   * This method is thread-safe and is called from both DAGScheduler and SparkContext.
   * <p>
   * @param rdd whose partitions are to be looked at
   * @param partition to lookup locality information for
   * @return list of machines that are preferred by the partition
   */
    scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> getPreferredLocs (org.apache.spark.rdd.RDD<?> rdd, int partition)  { throw new RuntimeException(); }
  /**
   * Recursive implementation for getPreferredLocs.
   * <p>
   * This method is thread-safe because it only accesses DAGScheduler state through thread-safe
   * methods (getCacheLocs()); please be careful when modifying this method, because any new
   * DAGScheduler state accessed by it may require additional synchronization.
   * @param rdd (undocumented)
   * @param partition (undocumented)
   * @param visited (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> getPreferredLocsInternal (org.apache.spark.rdd.RDD<?> rdd, int partition, scala.collection.mutable.HashSet<scala.Tuple2<org.apache.spark.rdd.RDD<?>, java.lang.Object>> visited)  { throw new RuntimeException(); }
  /** Mark a map stage job as finished with the given output stats, and report to its listener. */
  public  void markMapStageJobAsFinished (org.apache.spark.scheduler.ActiveJob job, org.apache.spark.MapOutputStatistics stats)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
