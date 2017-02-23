package org.apache.spark.scheduler;
/**
 * An interface to build Schedulable tree
 * buildPools: build the tree nodes(pools)
 * addTaskSetManager: build the leaf nodes(TaskSetManagers)
 */
  interface SchedulableBuilder {
  public  org.apache.spark.scheduler.Pool rootPool ()  ;
  public  void buildPools ()  ;
  public  void addTaskSetManager (org.apache.spark.scheduler.Schedulable manager, java.util.Properties properties)  ;
}
