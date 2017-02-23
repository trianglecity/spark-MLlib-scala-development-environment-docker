package org.apache.spark.scheduler;
/**
 * A unit of execution. We have two kinds of Task's in Spark:
 * <p>
 *  - {@link org.apache.spark.scheduler.ShuffleMapTask}
 *  - {@link org.apache.spark.scheduler.ResultTask}
 * <p>
 * A Spark job consists of one or more stages. The very last stage in a job consists of multiple
 * ResultTasks, while earlier stages consist of ShuffleMapTasks. A ResultTask executes the task
 * and sends the task output back to the driver application. A ShuffleMapTask executes the task
 * and divides the task output to multiple buckets (based on the task's partitioner).
 * <p>
 * param:  stageId id of the stage this task belongs to
 * param:  stageAttemptId attempt id of the stage this task belongs to
 * param:  partitionId index of the number in the RDD
 * param:  metrics a <code>TaskMetrics</code> that is created at driver side and sent to executor side.
 * param:  localProperties copy of thread-local properties set by the user on the driver side.
 * <p>
 * The parameters below are optional:
 * param:  jobId id of the job this task belongs to
 * param:  appId id of the app this task belongs to
 * param:  appAttemptId attempt id of the app this task belongs to
 */
 abstract class Task<T extends java.lang.Object> implements scala.Serializable {
  /**
   * Serialize a task and the current app dependencies (files and JARs added to the SparkContext)
   * @param task (undocumented)
   * @param currentFiles (undocumented)
   * @param currentJars (undocumented)
   * @param serializer (undocumented)
   * @return (undocumented)
   */
  static public  java.nio.ByteBuffer serializeWithDependencies (org.apache.spark.scheduler.Task<?> task, scala.collection.mutable.Map<java.lang.String, java.lang.Object> currentFiles, scala.collection.mutable.Map<java.lang.String, java.lang.Object> currentJars, org.apache.spark.serializer.SerializerInstance serializer)  { throw new RuntimeException(); }
  /**
   * Deserialize the list of dependencies in a task serialized with serializeWithDependencies,
   * and return the task itself as a serialized ByteBuffer. The caller can then update its
   * ClassLoaders and deserialize the task.
   * <p>
   * @return (taskFiles, taskJars, taskProps, taskBytes)
   * @param serializedTask (undocumented)
   */
  static public  scala.Tuple4<scala.collection.mutable.HashMap<java.lang.String, java.lang.Object>, scala.collection.mutable.HashMap<java.lang.String, java.lang.Object>, java.util.Properties, java.nio.ByteBuffer> deserializeWithDependencies (java.nio.ByteBuffer serializedTask)  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  int stageAttemptId ()  { throw new RuntimeException(); }
  public  int partitionId ()  { throw new RuntimeException(); }
  public  org.apache.spark.executor.TaskMetrics metrics ()  { throw new RuntimeException(); }
  public  java.util.Properties localProperties ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> jobId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> appId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> appAttemptId ()  { throw new RuntimeException(); }
  // not preceding
  public   Task (int stageId, int stageAttemptId, int partitionId, org.apache.spark.executor.TaskMetrics metrics, java.util.Properties localProperties, scala.Option<java.lang.Object> jobId, scala.Option<java.lang.String> appId, scala.Option<java.lang.String> appAttemptId)  { throw new RuntimeException(); }
  /**
   * Called by {@link org.apache.spark.executor.Executor} to run this task.
   * <p>
   * @param taskAttemptId an identifier for this task attempt that is unique within a SparkContext.
   * @param attemptNumber how many times this task has been attempted (0 for the first attempt)
   * @return the result of the task along with updates of Accumulators.
   * @param metricsSystem (undocumented)
   */
  public final  T run (long taskAttemptId, int attemptNumber, org.apache.spark.metrics.MetricsSystem metricsSystem)  { throw new RuntimeException(); }
  private  org.apache.spark.memory.TaskMemoryManager taskMemoryManager ()  { throw new RuntimeException(); }
  public  void setTaskMemoryManager (org.apache.spark.memory.TaskMemoryManager taskMemoryManager)  { throw new RuntimeException(); }
  public abstract  T runTask (org.apache.spark.TaskContext context)  ;
  public  scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> preferredLocations ()  { throw new RuntimeException(); }
  public  long epoch ()  { throw new RuntimeException(); }
  protected  org.apache.spark.TaskContextImpl context ()  { throw new RuntimeException(); }
  private  java.lang.Thread taskThread ()  { throw new RuntimeException(); }
  private  boolean _killed ()  { throw new RuntimeException(); }
  protected  long _executorDeserializeTime ()  { throw new RuntimeException(); }
  protected  long _executorDeserializeCpuTime ()  { throw new RuntimeException(); }
  /**
   * Whether the task has been killed.
   * @return (undocumented)
   */
  public  boolean killed ()  { throw new RuntimeException(); }
  /**
   * Returns the amount of time spent deserializing the RDD and function to be run.
   * @return (undocumented)
   */
  public  long executorDeserializeTime ()  { throw new RuntimeException(); }
  public  long executorDeserializeCpuTime ()  { throw new RuntimeException(); }
  /**
   * Collect the latest values of accumulators used in this task. If the task failed,
   * filter out the accumulators whose values should not be included on failures.
   * @param taskFailed (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> collectAccumulatorUpdates (boolean taskFailed)  { throw new RuntimeException(); }
  /**
   * Kills a task by setting the interrupted flag to true. This relies on the upper level Spark
   * code and user code to properly handle the flag. This function should be idempotent so it can
   * be called multiple times.
   * If interruptThread is true, we will also call Thread.interrupt() on the Task's executor thread.
   * @param interruptThread (undocumented)
   */
  public  void kill (boolean interruptThread)  { throw new RuntimeException(); }
}
