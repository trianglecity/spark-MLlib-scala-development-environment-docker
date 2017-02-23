package org.apache.spark;
/**
 * Contextual information about a task which can be read or mutated during
 * execution. To access the TaskContext for a running task, use:
 * <pre><code>
 *   org.apache.spark.TaskContext.get()
 * </code></pre>
 */
public abstract class TaskContext implements java.io.Serializable {
  /**
   * Return the currently active TaskContext. This can be called inside of
   * user functions to access contextual information about running tasks.
   * @return (undocumented)
   */
  static public  org.apache.spark.TaskContext get ()  { throw new RuntimeException(); }
  /**
   * Returns the partition id of currently active TaskContext. It will return 0
   * if there is no active TaskContext for cases like local execution.
   * @return (undocumented)
   */
  static public  int getPartitionId ()  { throw new RuntimeException(); }
  /**
   * Set the thread local TaskContext. Internal to Spark.
   * @param tc (undocumented)
   */
  static protected  void setTaskContext (org.apache.spark.TaskContext tc)  { throw new RuntimeException(); }
  /**
   * Unset the thread local TaskContext. Internal to Spark.
   */
  static protected  void unset ()  { throw new RuntimeException(); }
  /**
   * An empty task context that does not represent an actual task.  This is only used in tests.
   * @return (undocumented)
   */
  static   org.apache.spark.TaskContextImpl empty ()  { throw new RuntimeException(); }
  public   TaskContext ()  { throw new RuntimeException(); }
  /**
   * Returns true if the task has completed.
   * @return (undocumented)
   */
  public abstract  boolean isCompleted ()  ;
  /**
   * Returns true if the task has been killed.
   * @return (undocumented)
   */
  public abstract  boolean isInterrupted ()  ;
  /**
   * Returns true if the task is running locally in the driver program.
   * @return false
   *
   * @deprecated Local execution was removed, so this always returns false. Since 2.0.0. 
  */
  public abstract  boolean isRunningLocally ()  ;
  /**
   * Adds a (Java friendly) listener to be executed on task completion.
   * This will be called in all situation - success, failure, or cancellation.
   * An example use is for HadoopRDD to register a callback to close the input stream.
   * <p>
   * Exceptions thrown by the listener will result in failure of the task.
   * @param listener (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.TaskContext addTaskCompletionListener (org.apache.spark.util.TaskCompletionListener listener)  ;
  /**
   * Adds a listener in the form of a Scala closure to be executed on task completion.
   * This will be called in all situations - success, failure, or cancellation.
   * An example use is for HadoopRDD to register a callback to close the input stream.
   * <p>
   * Exceptions thrown by the listener will result in failure of the task.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.TaskContext addTaskCompletionListener (scala.Function1<org.apache.spark.TaskContext, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /**
   * Adds a listener to be executed on task failure.
   * Operations defined here must be idempotent, as <code>onTaskFailure</code> can be called multiple times.
   * @param listener (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.TaskContext addTaskFailureListener (org.apache.spark.util.TaskFailureListener listener)  ;
  /**
   * Adds a listener to be executed on task failure.
   * Operations defined here must be idempotent, as <code>onTaskFailure</code> can be called multiple times.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.TaskContext addTaskFailureListener (scala.Function2<org.apache.spark.TaskContext, java.lang.Throwable, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /**
   * The ID of the stage that this task belong to.
   * @return (undocumented)
   */
  public abstract  int stageId ()  ;
  /**
   * The ID of the RDD partition that is computed by this task.
   * @return (undocumented)
   */
  public abstract  int partitionId ()  ;
  /**
   * How many times this task has been attempted.  The first task attempt will be assigned
   * attemptNumber = 0, and subsequent attempts will have increasing attempt numbers.
   * @return (undocumented)
   */
  public abstract  int attemptNumber ()  ;
  /**
   * An ID that is unique to this task attempt (within the same SparkContext, no two task attempts
   * will share the same attempt ID).  This is roughly equivalent to Hadoop's TaskAttemptID.
   * @return (undocumented)
   */
  public abstract  long taskAttemptId ()  ;
  /**
   * Get a local property set upstream in the driver, or null if it is missing. See also
   * <code>org.apache.spark.SparkContext.setLocalProperty</code>.
   * @param key (undocumented)
   * @return (undocumented)
   */
  public abstract  java.lang.String getLocalProperty (java.lang.String key)  ;
  public abstract  org.apache.spark.executor.TaskMetrics taskMetrics ()  ;
  /**
   * ::DeveloperApi::
   * Returns all metrics sources with the given name which are associated with the instance
   * which runs the task. For more information see <code>org.apache.spark.metrics.MetricsSystem</code>.
   * @param sourceName (undocumented)
   * @return (undocumented)
   */
  public abstract  scala.collection.Seq<org.apache.spark.metrics.source.Source> getMetricsSources (java.lang.String sourceName)  ;
  /**
   * Returns the manager for this task's managed memory.
   * @return (undocumented)
   */
   abstract  org.apache.spark.memory.TaskMemoryManager taskMemoryManager ()  ;
  /**
   * Register an accumulator that belongs to this task. Accumulators must call this method when
   * deserializing in executors.
   * @param a (undocumented)
   */
   abstract  void registerAccumulator (org.apache.spark.util.AccumulatorV2<?, ?> a)  ;
}
