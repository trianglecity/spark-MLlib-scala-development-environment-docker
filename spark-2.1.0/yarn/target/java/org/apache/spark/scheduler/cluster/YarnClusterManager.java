package org.apache.spark.scheduler.cluster;
/**
 * Cluster Manager for creation of Yarn scheduler and backend
 */
  class YarnClusterManager implements org.apache.spark.scheduler.ExternalClusterManager {
  public   YarnClusterManager ()  { throw new RuntimeException(); }
  public  boolean canCreate (java.lang.String masterURL)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskScheduler createTaskScheduler (org.apache.spark.SparkContext sc, java.lang.String masterURL)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.SchedulerBackend createSchedulerBackend (org.apache.spark.SparkContext sc, java.lang.String masterURL, org.apache.spark.scheduler.TaskScheduler scheduler)  { throw new RuntimeException(); }
  public  void initialize (org.apache.spark.scheduler.TaskScheduler scheduler, org.apache.spark.scheduler.SchedulerBackend backend)  { throw new RuntimeException(); }
}
