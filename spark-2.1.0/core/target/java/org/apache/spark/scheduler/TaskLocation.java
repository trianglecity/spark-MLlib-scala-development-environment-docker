package org.apache.spark.scheduler;
/**
 * A location where a task should run. This can either be a host or a (host, executorID) pair.
 * In the latter case, we will prefer to launch the task on that executorID, but our next level
 * of preference will be executors on the same host if this is not possible.
 */
  interface TaskLocation {
  public  java.lang.String host ()  ;
}
