package org.apache.spark.scheduler;
/**
 * Interface for listening to events from the Spark scheduler. Most applications should probably
 * extend SparkListener or SparkFirehoseListener directly, rather than implementing this class.
 * <p>
 * Note that this is an internal interface which might change in different Spark releases.
 */
  interface SparkListenerInterface {
  /**
   * Called when a stage completes successfully or fails, with information on the completed stage.
   * @param stageCompleted (undocumented)
   */
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  ;
  /**
   * Called when a stage is submitted
   * @param stageSubmitted (undocumented)
   */
  public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmitted)  ;
  /**
   * Called when a task starts
   * @param taskStart (undocumented)
   */
  public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart taskStart)  ;
  /**
   * Called when a task begins remotely fetching its result (will not be called for tasks that do
   * not need to fetch the result remotely).
   * @param taskGettingResult (undocumented)
   */
  public  void onTaskGettingResult (org.apache.spark.scheduler.SparkListenerTaskGettingResult taskGettingResult)  ;
  /**
   * Called when a task ends
   * @param taskEnd (undocumented)
   */
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  ;
  /**
   * Called when a job starts
   * @param jobStart (undocumented)
   */
  public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart jobStart)  ;
  /**
   * Called when a job ends
   * @param jobEnd (undocumented)
   */
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd jobEnd)  ;
  /**
   * Called when environment properties have been updated
   * @param environmentUpdate (undocumented)
   */
  public  void onEnvironmentUpdate (org.apache.spark.scheduler.SparkListenerEnvironmentUpdate environmentUpdate)  ;
  /**
   * Called when a new block manager has joined
   * @param blockManagerAdded (undocumented)
   */
  public  void onBlockManagerAdded (org.apache.spark.scheduler.SparkListenerBlockManagerAdded blockManagerAdded)  ;
  /**
   * Called when an existing block manager has been removed
   * @param blockManagerRemoved (undocumented)
   */
  public  void onBlockManagerRemoved (org.apache.spark.scheduler.SparkListenerBlockManagerRemoved blockManagerRemoved)  ;
  /**
   * Called when an RDD is manually unpersisted by the application
   * @param unpersistRDD (undocumented)
   */
  public  void onUnpersistRDD (org.apache.spark.scheduler.SparkListenerUnpersistRDD unpersistRDD)  ;
  /**
   * Called when the application starts
   * @param applicationStart (undocumented)
   */
  public  void onApplicationStart (org.apache.spark.scheduler.SparkListenerApplicationStart applicationStart)  ;
  /**
   * Called when the application ends
   * @param applicationEnd (undocumented)
   */
  public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd applicationEnd)  ;
  /**
   * Called when the driver receives task metrics from an executor in a heartbeat.
   * @param executorMetricsUpdate (undocumented)
   */
  public  void onExecutorMetricsUpdate (org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate executorMetricsUpdate)  ;
  /**
   * Called when the driver registers a new executor.
   * @param executorAdded (undocumented)
   */
  public  void onExecutorAdded (org.apache.spark.scheduler.SparkListenerExecutorAdded executorAdded)  ;
  /**
   * Called when the driver removes an executor.
   * @param executorRemoved (undocumented)
   */
  public  void onExecutorRemoved (org.apache.spark.scheduler.SparkListenerExecutorRemoved executorRemoved)  ;
  /**
   * Called when the driver receives a block update info.
   * @param blockUpdated (undocumented)
   */
  public  void onBlockUpdated (org.apache.spark.scheduler.SparkListenerBlockUpdated blockUpdated)  ;
  /**
   * Called when other events like SQL-specific events are posted.
   * @param event (undocumented)
   */
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  ;
}
