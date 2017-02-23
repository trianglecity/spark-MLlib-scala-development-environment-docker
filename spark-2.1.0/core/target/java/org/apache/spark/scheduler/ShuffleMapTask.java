package org.apache.spark.scheduler;
/**
 * A ShuffleMapTask divides the elements of an RDD into multiple buckets (based on a partitioner
 * specified in the ShuffleDependency).
 * <p>
 * See {@link org.apache.spark.scheduler.Task} for more information.
 * <p>
 * param:  stageId id of the stage this task belongs to
 * param:  stageAttemptId attempt id of the stage this task belongs to
 * param:  taskBinary broadcast version of the RDD and the ShuffleDependency. Once deserialized,
 *                   the type should be (RDD[_], ShuffleDependency[_, _, _]).
 * param:  partition partition of the RDD this task is associated with
 * param:  locs preferred task execution locations for locality scheduling
 * param:  metrics a <code>TaskMetrics</code> that is created at driver side and sent to executor side.
 * param:  localProperties copy of thread-local properties set by the user on the driver side.
 * <p>
 * The parameters below are optional:
 * param:  jobId id of the job this task belongs to
 * param:  appId id of the app this task belongs to
 * param:  appAttemptId attempt id of the app this task belongs to
 */
  class ShuffleMapTask extends org.apache.spark.scheduler.Task<org.apache.spark.scheduler.MapStatus> implements org.apache.spark.internal.Logging {
  static public  int stageId ()  { throw new RuntimeException(); }
  static public  int stageAttemptId ()  { throw new RuntimeException(); }
  static public  int partitionId ()  { throw new RuntimeException(); }
  static public  org.apache.spark.executor.TaskMetrics metrics ()  { throw new RuntimeException(); }
  static public  java.util.Properties localProperties ()  { throw new RuntimeException(); }
  static public  void localProperties_$eq (java.util.Properties x$1)  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.Object> jobId ()  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> appId ()  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> appAttemptId ()  { throw new RuntimeException(); }
  static public final  T run (long taskAttemptId, int attemptNumber, org.apache.spark.metrics.MetricsSystem metricsSystem)  { throw new RuntimeException(); }
  static public  void setTaskMemoryManager (org.apache.spark.memory.TaskMemoryManager taskMemoryManager)  { throw new RuntimeException(); }
  static public  long epoch ()  { throw new RuntimeException(); }
  static public  void epoch_$eq (long x$1)  { throw new RuntimeException(); }
  static protected  org.apache.spark.TaskContextImpl context ()  { throw new RuntimeException(); }
  static protected  void context_$eq (org.apache.spark.TaskContextImpl x$1)  { throw new RuntimeException(); }
  static protected  long _executorDeserializeTime ()  { throw new RuntimeException(); }
  static protected  void _executorDeserializeTime_$eq (long x$1)  { throw new RuntimeException(); }
  static protected  long _executorDeserializeCpuTime ()  { throw new RuntimeException(); }
  static protected  void _executorDeserializeCpuTime_$eq (long x$1)  { throw new RuntimeException(); }
  static public  boolean killed ()  { throw new RuntimeException(); }
  static public  long executorDeserializeTime ()  { throw new RuntimeException(); }
  static public  long executorDeserializeCpuTime ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> collectAccumulatorUpdates (boolean taskFailed)  { throw new RuntimeException(); }
  static public  void kill (boolean interruptThread)  { throw new RuntimeException(); }
  static public  boolean collectAccumulatorUpdates$default$1 ()  { throw new RuntimeException(); }
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
  private  scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> locs ()  { throw new RuntimeException(); }
  // not preceding
  public   ShuffleMapTask (int stageId, int stageAttemptId, org.apache.spark.broadcast.Broadcast<byte[]> taskBinary, org.apache.spark.Partition partition, scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> locs, org.apache.spark.executor.TaskMetrics metrics, java.util.Properties localProperties, scala.Option<java.lang.Object> jobId, scala.Option<java.lang.String> appId, scala.Option<java.lang.String> appAttemptId)  { throw new RuntimeException(); }
  /** A constructor used only in test suites. This does not require passing in an RDD. */
  public   ShuffleMapTask (int partitionId)  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> preferredLocs ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.MapStatus runTask (org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> preferredLocations ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
