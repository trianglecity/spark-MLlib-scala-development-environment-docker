package org.apache.spark.ui.jobs;
/**
 * :: DeveloperApi ::
 * Tracks task-level information to be displayed in the UI.
 * <p>
 * All access to the data structures in this class must be synchronized on the
 * class, since the UI thread and the EventBus loop may otherwise be reading and
 * updating the internal data structures concurrently.
 */
public  class JobProgressListener extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.internal.Logging {
  public   JobProgressListener (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  long startTime ()  { throw new RuntimeException(); }
  public  long endTime ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.ui.jobs.UIData.JobUIData> activeJobs ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ListBuffer<org.apache.spark.ui.jobs.UIData.JobUIData> completedJobs ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ListBuffer<org.apache.spark.ui.jobs.UIData.JobUIData> failedJobs ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.ui.jobs.UIData.JobUIData> jobIdToData ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.HashSet<java.lang.Object>> jobGroupToJobIds ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.StageInfo> pendingStages ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.StageInfo> activeStages ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ListBuffer<org.apache.spark.scheduler.StageInfo> completedStages ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ListBuffer<org.apache.spark.scheduler.StageInfo> skippedStages ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ListBuffer<org.apache.spark.scheduler.StageInfo> failedStages ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.ui.jobs.UIData.StageUIData> stageIdToData ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.StageInfo> stageIdToInfo ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, scala.collection.mutable.HashSet<java.lang.Object>> stageIdToActiveJobIds ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.StageInfo>> poolToActiveStages ()  { throw new RuntimeException(); }
  public  int numCompletedStages ()  { throw new RuntimeException(); }
  public  int numFailedStages ()  { throw new RuntimeException(); }
  public  int numCompletedJobs ()  { throw new RuntimeException(); }
  public  int numFailedJobs ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.storage.BlockManagerId> executorIdToBlockManagerId ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> blockManagerIds ()  { throw new RuntimeException(); }
  public  scala.Option<scala.Enumeration.Value> schedulingMode ()  { throw new RuntimeException(); }
  public  int retainedStages ()  { throw new RuntimeException(); }
  public  int retainedJobs ()  { throw new RuntimeException(); }
  public  int retainedTasks ()  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.String, java.lang.Object> getSizesOfActiveStateTrackingCollections ()  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.String, java.lang.Object> getSizesOfHardSizeLimitedCollections ()  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.String, java.lang.Object> getSizesOfSoftSizeLimitedCollections ()  { throw new RuntimeException(); }
  /** If stages is too large, remove and garbage collect old stages */
  private  void trimStagesIfNecessary (scala.collection.mutable.ListBuffer<org.apache.spark.scheduler.StageInfo> stages)  { throw new RuntimeException(); }
  /** If jobs is too large, remove and garbage collect old jobs */
  private  void trimJobsIfNecessary (scala.collection.mutable.ListBuffer<org.apache.spark.ui.jobs.UIData.JobUIData> jobs)  { throw new RuntimeException(); }
  public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart jobStart)  { throw new RuntimeException(); }
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd jobEnd)  { throw new RuntimeException(); }
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  { throw new RuntimeException(); }
  /** For FIFO, all stages are contained by "default" pool but "default" pool here is meaningless */
  public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmitted)  { throw new RuntimeException(); }
  public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart taskStart)  { throw new RuntimeException(); }
  public  void onTaskGettingResult (org.apache.spark.scheduler.SparkListenerTaskGettingResult taskGettingResult)  { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
  /**
   * Upon receiving new metrics for a task, updates the per-stage and per-executor-per-stage
   * aggregate metrics by calculating deltas between the currently recorded metrics and the new
   * metrics.
   * @param stageData (undocumented)
   * @param execId (undocumented)
   * @param taskMetrics (undocumented)
   * @param oldMetrics (undocumented)
   */
  public  void updateAggregateMetrics (org.apache.spark.ui.jobs.UIData.StageUIData stageData, java.lang.String execId, org.apache.spark.executor.TaskMetrics taskMetrics, scala.Option<org.apache.spark.ui.jobs.UIData.TaskMetricsUIData> oldMetrics)  { throw new RuntimeException(); }
  public  void onExecutorMetricsUpdate (org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate executorMetricsUpdate)  { throw new RuntimeException(); }
  public  void onEnvironmentUpdate (org.apache.spark.scheduler.SparkListenerEnvironmentUpdate environmentUpdate)  { throw new RuntimeException(); }
  public  void onBlockManagerAdded (org.apache.spark.scheduler.SparkListenerBlockManagerAdded blockManagerAdded)  { throw new RuntimeException(); }
  public  void onBlockManagerRemoved (org.apache.spark.scheduler.SparkListenerBlockManagerRemoved blockManagerRemoved)  { throw new RuntimeException(); }
  public  void onApplicationStart (org.apache.spark.scheduler.SparkListenerApplicationStart appStarted)  { throw new RuntimeException(); }
  public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd appEnded)  { throw new RuntimeException(); }
  /**
   * For testing only. Wait until at least <code>numExecutors</code> executors are up, or throw
   * <code>TimeoutException</code> if the waiting time elapsed before <code>numExecutors</code> executors up.
   * Exposed for testing.
   * <p>
   * @param numExecutors the number of executors to wait at least
   * @param timeout time to wait in milliseconds
   */
    void waitUntilExecutorsUp (int numExecutors, long timeout)  { throw new RuntimeException(); }
}
