package org.apache.spark;
/**
 * :: DeveloperApi ::
 * Various possible reasons why a task failed.
 */
public  interface TaskFailedReason extends org.apache.spark.TaskEndReason {
  /** Error message displayed in the web UI. */
  public  java.lang.String toErrorString ()  ;
  /**
   * Whether this task failure should be counted towards the maximum number of times the task is
   * allowed to fail before the stage is aborted.  Set to false in cases where the task's failure
   * was unrelated to the task; for example, if the task failed because the executor it was running
   * on was killed.
   * @return (undocumented)
   */
  public  boolean countTowardsTaskFailures ()  ;
}
