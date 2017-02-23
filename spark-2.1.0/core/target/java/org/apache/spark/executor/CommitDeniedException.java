package org.apache.spark.executor;
/**
 * Exception thrown when a task attempts to commit output to HDFS but is denied by the driver.
 */
  class CommitDeniedException extends java.lang.Exception {
  public   CommitDeniedException (java.lang.String msg, int jobID, int splitID, int attemptNumber)  { throw new RuntimeException(); }
  public  org.apache.spark.TaskFailedReason toTaskFailedReason ()  { throw new RuntimeException(); }
}
