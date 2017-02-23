package org.apache.spark.executor;
public  class TaskMetrics$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TaskMetrics$ MODULE$ = null;
  public   TaskMetrics$ ()  { throw new RuntimeException(); }
  /**
   * Create an empty task metrics that doesn't register its accumulators.
   * @return (undocumented)
   */
  public  org.apache.spark.executor.TaskMetrics empty ()  { throw new RuntimeException(); }
  public  org.apache.spark.executor.TaskMetrics registered ()  { throw new RuntimeException(); }
  /**
   * Construct a {@link TaskMetrics} object from a list of {@link AccumulableInfo}, called on driver only.
   * The returned {@link TaskMetrics} is only used to get some internal metrics, we don't need to take
   * care of external accumulator info passed in.
   * @param infos (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.executor.TaskMetrics fromAccumulatorInfos (scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo> infos)  { throw new RuntimeException(); }
  /**
   * Construct a {@link TaskMetrics} object from a list of accumulator updates, called on driver only.
   * @param accums (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.executor.TaskMetrics fromAccumulators (scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> accums)  { throw new RuntimeException(); }
}
