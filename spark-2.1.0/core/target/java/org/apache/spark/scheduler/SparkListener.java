package org.apache.spark.scheduler;
/**
 * :: DeveloperApi ::
 * A default implementation for {@link SparkListenerInterface} that has no-op implementations for
 * all callbacks.
 * <p>
 * Note that this is an internal interface which might change in different Spark releases.
 */
public abstract class SparkListener implements org.apache.spark.scheduler.SparkListenerInterface {
  public   SparkListener ()  { throw new RuntimeException(); }
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  { throw new RuntimeException(); }
  public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmitted)  { throw new RuntimeException(); }
  public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart taskStart)  { throw new RuntimeException(); }
  public  void onTaskGettingResult (org.apache.spark.scheduler.SparkListenerTaskGettingResult taskGettingResult)  { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
  public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart jobStart)  { throw new RuntimeException(); }
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd jobEnd)  { throw new RuntimeException(); }
  public  void onEnvironmentUpdate (org.apache.spark.scheduler.SparkListenerEnvironmentUpdate environmentUpdate)  { throw new RuntimeException(); }
  public  void onBlockManagerAdded (org.apache.spark.scheduler.SparkListenerBlockManagerAdded blockManagerAdded)  { throw new RuntimeException(); }
  public  void onBlockManagerRemoved (org.apache.spark.scheduler.SparkListenerBlockManagerRemoved blockManagerRemoved)  { throw new RuntimeException(); }
  public  void onUnpersistRDD (org.apache.spark.scheduler.SparkListenerUnpersistRDD unpersistRDD)  { throw new RuntimeException(); }
  public  void onApplicationStart (org.apache.spark.scheduler.SparkListenerApplicationStart applicationStart)  { throw new RuntimeException(); }
  public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd applicationEnd)  { throw new RuntimeException(); }
  public  void onExecutorMetricsUpdate (org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate executorMetricsUpdate)  { throw new RuntimeException(); }
  public  void onExecutorAdded (org.apache.spark.scheduler.SparkListenerExecutorAdded executorAdded)  { throw new RuntimeException(); }
  public  void onExecutorRemoved (org.apache.spark.scheduler.SparkListenerExecutorRemoved executorRemoved)  { throw new RuntimeException(); }
  public  void onBlockUpdated (org.apache.spark.scheduler.SparkListenerBlockUpdated blockUpdated)  { throw new RuntimeException(); }
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
}
