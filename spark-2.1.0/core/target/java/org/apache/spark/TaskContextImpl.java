package org.apache.spark;
  class TaskContextImpl extends org.apache.spark.TaskContext implements org.apache.spark.internal.Logging {
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
  public  int stageId ()  { throw new RuntimeException(); }
  public  int partitionId ()  { throw new RuntimeException(); }
  public  long taskAttemptId ()  { throw new RuntimeException(); }
  public  int attemptNumber ()  { throw new RuntimeException(); }
  public  org.apache.spark.memory.TaskMemoryManager taskMemoryManager ()  { throw new RuntimeException(); }
  private  org.apache.spark.metrics.MetricsSystem metricsSystem ()  { throw new RuntimeException(); }
  public  org.apache.spark.executor.TaskMetrics taskMetrics ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskContextImpl (int stageId, int partitionId, long taskAttemptId, int attemptNumber, org.apache.spark.memory.TaskMemoryManager taskMemoryManager, java.util.Properties localProperties, org.apache.spark.metrics.MetricsSystem metricsSystem, org.apache.spark.executor.TaskMetrics taskMetrics)  { throw new RuntimeException(); }
  /** List of callback functions to execute when the task completes. */
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.util.TaskCompletionListener> onCompleteCallbacks ()  { throw new RuntimeException(); }
  /** List of callback functions to execute when the task fails. */
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.util.TaskFailureListener> onFailureCallbacks ()  { throw new RuntimeException(); }
  private  boolean interrupted ()  { throw new RuntimeException(); }
  private  boolean completed ()  { throw new RuntimeException(); }
  private  boolean failed ()  { throw new RuntimeException(); }
  public  org.apache.spark.TaskContextImpl addTaskCompletionListener (org.apache.spark.util.TaskCompletionListener listener)  { throw new RuntimeException(); }
  public  org.apache.spark.TaskContextImpl addTaskFailureListener (org.apache.spark.util.TaskFailureListener listener)  { throw new RuntimeException(); }
  /** Marks the task as failed and triggers the failure listeners. */
    void markTaskFailed (java.lang.Throwable error)  { throw new RuntimeException(); }
  /** Marks the task as completed and triggers the completion listeners. */
    void markTaskCompleted ()  { throw new RuntimeException(); }
  /** Marks the task for interruption, i.e. cancellation. */
    void markInterrupted ()  { throw new RuntimeException(); }
  public  boolean isCompleted ()  { throw new RuntimeException(); }
  public  boolean isRunningLocally ()  { throw new RuntimeException(); }
  public  boolean isInterrupted ()  { throw new RuntimeException(); }
  public  java.lang.String getLocalProperty (java.lang.String key)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.metrics.source.Source> getMetricsSources (java.lang.String sourceName)  { throw new RuntimeException(); }
    void registerAccumulator (org.apache.spark.util.AccumulatorV2<?, ?> a)  { throw new RuntimeException(); }
}
