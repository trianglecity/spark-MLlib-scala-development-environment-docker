package org.apache.spark.scheduler;
/**
 * An object that waits for a DAGScheduler job to complete. As tasks finish, it passes their
 * results to the given handler function.
 */
  class JobWaiter<T extends java.lang.Object> implements org.apache.spark.scheduler.JobListener, org.apache.spark.internal.Logging {
  public  int jobId ()  { throw new RuntimeException(); }
  // not preceding
  public   JobWaiter (org.apache.spark.scheduler.DAGScheduler dagScheduler, int jobId, int totalTasks, scala.Function2<java.lang.Object, T, scala.runtime.BoxedUnit> resultHandler)  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicInteger finishedTasks ()  { throw new RuntimeException(); }
  private  scala.concurrent.Promise<scala.runtime.BoxedUnit> jobPromise ()  { throw new RuntimeException(); }
  public  boolean jobFinished ()  { throw new RuntimeException(); }
  public  scala.concurrent.Future<scala.runtime.BoxedUnit> completionFuture ()  { throw new RuntimeException(); }
  /**
   * Sends a signal to the DAGScheduler to cancel the job. The cancellation itself is handled
   * asynchronously. After the low level scheduler cancels all the tasks belonging to this job, it
   * will fail this job with a SparkException.
   */
  public  void cancel ()  { throw new RuntimeException(); }
  public  void taskSucceeded (int index, Object result)  { throw new RuntimeException(); }
  public  void jobFailed (java.lang.Exception exception)  { throw new RuntimeException(); }
}
