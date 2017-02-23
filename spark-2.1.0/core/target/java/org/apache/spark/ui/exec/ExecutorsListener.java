package org.apache.spark.ui.exec;
/**
 * :: DeveloperApi ::
 * A SparkListener that prepares information to be displayed on the ExecutorsTab
 */
public  class ExecutorsListener extends org.apache.spark.scheduler.SparkListener {
  public   ExecutorsListener (org.apache.spark.storage.StorageStatusListener storageStatusListener, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  scala.collection.mutable.LinkedHashMap<java.lang.String, org.apache.spark.ui.exec.ExecutorTaskSummary> executorToTaskSummary ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ListBuffer<org.apache.spark.scheduler.SparkListenerEvent> executorEvents ()  { throw new RuntimeException(); }
  private  int maxTimelineExecutors ()  { throw new RuntimeException(); }
  private  int retainedDeadExecutors ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.storage.StorageStatus> activeStorageStatusList ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.storage.StorageStatus> deadStorageStatusList ()  { throw new RuntimeException(); }
  public  void onExecutorAdded (org.apache.spark.scheduler.SparkListenerExecutorAdded executorAdded)  { throw new RuntimeException(); }
  public  void onExecutorRemoved (org.apache.spark.scheduler.SparkListenerExecutorRemoved executorRemoved)  { throw new RuntimeException(); }
  public  void onApplicationStart (org.apache.spark.scheduler.SparkListenerApplicationStart applicationStart)  { throw new RuntimeException(); }
  public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart taskStart)  { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
}
