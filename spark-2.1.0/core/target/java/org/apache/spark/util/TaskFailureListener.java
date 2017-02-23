package org.apache.spark.util;
/**
 * :: DeveloperApi ::
 * <p>
 * Listener providing a callback function to invoke when a task's execution encounters an error.
 * Operations defined here must be idempotent, as <code>onTaskFailure</code> can be called multiple times.
 */
public  interface TaskFailureListener extends java.util.EventListener {
  public  void onTaskFailure (org.apache.spark.TaskContext context, java.lang.Throwable error)  ;
}
