package org.apache.spark.scheduler;
/**
 * An interface for schedulable entities.
 * there are two type of Schedulable entities(Pools and TaskSetManagers)
 */
  interface Schedulable {
  public  org.apache.spark.scheduler.Pool parent ()  ;
  public  java.util.concurrent.ConcurrentLinkedQueue<org.apache.spark.scheduler.Schedulable> schedulableQueue ()  ;
  public  scala.Enumeration.Value schedulingMode ()  ;
  public  int weight ()  ;
  public  int minShare ()  ;
  public  int runningTasks ()  ;
  public  int priority ()  ;
  public  int stageId ()  ;
  public  java.lang.String name ()  ;
  public  void addSchedulable (org.apache.spark.scheduler.Schedulable schedulable)  ;
  public  void removeSchedulable (org.apache.spark.scheduler.Schedulable schedulable)  ;
  public  org.apache.spark.scheduler.Schedulable getSchedulableByName (java.lang.String name)  ;
  public  void executorLost (java.lang.String executorId, java.lang.String host, org.apache.spark.scheduler.ExecutorLossReason reason)  ;
  public  boolean checkSpeculatableTasks (int minTimeToSpeculation)  ;
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.scheduler.TaskSetManager> getSortedTaskSetQueue ()  ;
}
