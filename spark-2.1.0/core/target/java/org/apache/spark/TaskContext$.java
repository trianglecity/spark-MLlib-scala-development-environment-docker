package org.apache.spark;
public  class TaskContext$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TaskContext$ MODULE$ = null;
  public   TaskContext$ ()  { throw new RuntimeException(); }
  /**
   * Return the currently active TaskContext. This can be called inside of
   * user functions to access contextual information about running tasks.
   * @return (undocumented)
   */
  public  org.apache.spark.TaskContext get ()  { throw new RuntimeException(); }
  /**
   * Returns the partition id of currently active TaskContext. It will return 0
   * if there is no active TaskContext for cases like local execution.
   * @return (undocumented)
   */
  public  int getPartitionId ()  { throw new RuntimeException(); }
  /**
   * Set the thread local TaskContext. Internal to Spark.
   * @param tc (undocumented)
   */
  protected  void setTaskContext (org.apache.spark.TaskContext tc)  { throw new RuntimeException(); }
  /**
   * Unset the thread local TaskContext. Internal to Spark.
   */
  protected  void unset ()  { throw new RuntimeException(); }
  /**
   * An empty task context that does not represent an actual task.  This is only used in tests.
   * @return (undocumented)
   */
    org.apache.spark.TaskContextImpl empty ()  { throw new RuntimeException(); }
}
