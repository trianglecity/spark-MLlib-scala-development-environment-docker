package org.apache.spark.util;
/**
 * :: DeveloperApi ::
 * <p>
 * Listener providing a callback function to invoke when a task's execution completes.
 */
public  interface TaskCompletionListener extends java.util.EventListener {
  public  void onTaskCompletion (org.apache.spark.TaskContext context)  ;
}
