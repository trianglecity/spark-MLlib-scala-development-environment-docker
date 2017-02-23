package org.apache.spark.scheduler;
/**
 * A task that sends back the output to the driver application.
 * <p>
 * See {@link Task} for more information.
 * <p>
 * param:  stageId id of the stage this task belongs to
 * param:  stageAttemptId attempt id of the stage this task belongs to
 * param:  taskBinary broadcasted version of the serialized RDD and the function to apply on each
 *                   partition of the given RDD. Once deserialized, the type should be
 *                   (RDD[T], (TaskContext, Iterator[T]) =&gt; U).
 * param:  partition partition of the RDD this task is associated with
 * param:  locs preferred task execution locations for locality scheduling
 * param:  outputId index of the task in this job (a job can launch tasks on only a subset of the
 *                 input RDD's partitions).
 * param:  localProperties copy of thread-local properties set by the user on the driver side.
 * param:  metrics a <code>TaskMetrics</code> that is created at driver side and sent to executor side.
 * <p>
 * The parameters below are optional:
 * param:  jobId id of the job this task belongs to
 * param:  appId id of the app this task belongs to
 * param:  appAttemptId attempt id of the app this task belongs to
 */
  class ResultTask<T extends java.lang.Object, U extends java.lang.Object> extends org.apache.spark.scheduler.Task<U> implements java.io.Serializable {
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
  public  int outputId ()  { throw new RuntimeException(); }
  // not preceding
  public   ResultTask (int stageId, int stageAttemptId, org.apache.spark.broadcast.Broadcast<byte[]> taskBinary, org.apache.spark.Partition partition, scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> locs, int outputId, java.util.Properties localProperties, org.apache.spark.executor.TaskMetrics metrics, scala.Option<java.lang.Object> jobId, scala.Option<java.lang.String> appId, scala.Option<java.lang.String> appAttemptId)  { throw new RuntimeException(); }
  public  U runTask (org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> preferredLocations ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
