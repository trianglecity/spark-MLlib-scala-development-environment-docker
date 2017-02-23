package org.apache.spark.scheduler;
/**
 * An interface for sort algorithm
 * FIFO: FIFO algorithm between TaskSetManagers
 * FS: FS algorithm between Pools, and FIFO or FS within Pools
 */
  interface SchedulingAlgorithm {
  public  boolean comparator (org.apache.spark.scheduler.Schedulable s1, org.apache.spark.scheduler.Schedulable s2)  ;
}
