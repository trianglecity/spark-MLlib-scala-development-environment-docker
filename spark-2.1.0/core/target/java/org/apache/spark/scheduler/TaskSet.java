package org.apache.spark.scheduler;
/**
 * A set of tasks submitted together to the low-level TaskScheduler, usually representing
 * missing partitions of a particular stage.
 */
  class TaskSet {
  public  org.apache.spark.scheduler.Task<?>[] tasks ()  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  int stageAttemptId ()  { throw new RuntimeException(); }
  public  int priority ()  { throw new RuntimeException(); }
  public  java.util.Properties properties ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskSet (org.apache.spark.scheduler.Task<?>[] tasks, int stageId, int stageAttemptId, int priority, java.util.Properties properties)  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
