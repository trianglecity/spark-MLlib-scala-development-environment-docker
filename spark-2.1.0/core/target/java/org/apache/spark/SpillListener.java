package org.apache.spark;
/**
 * A <code>SparkListener</code> that detects whether spills have occurred in Spark jobs.
 */
public  class SpillListener extends org.apache.spark.scheduler.SparkListener {
  public   SpillListener ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, scala.collection.mutable.ArrayBuffer<org.apache.spark.executor.TaskMetrics>> stageIdToTaskMetrics ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.lang.Object> spilledStageIds ()  { throw new RuntimeException(); }
  private  java.util.concurrent.CountDownLatch stagesDone ()  { throw new RuntimeException(); }
  public  int numSpilledStages ()  { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageComplete)  { throw new RuntimeException(); }
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd jobEnd)  { throw new RuntimeException(); }
}
