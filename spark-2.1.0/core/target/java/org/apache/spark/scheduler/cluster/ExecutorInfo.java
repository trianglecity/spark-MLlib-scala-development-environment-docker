package org.apache.spark.scheduler.cluster;
/**
 * :: DeveloperApi ::
 * Stores information about an executor to pass from the scheduler to SparkListeners.
 */
public  class ExecutorInfo {
  public  java.lang.String executorHost ()  { throw new RuntimeException(); }
  public  int totalCores ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> logUrlMap ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorInfo (java.lang.String executorHost, int totalCores, scala.collection.immutable.Map<java.lang.String, java.lang.String> logUrlMap)  { throw new RuntimeException(); }
  public  boolean canEqual (Object other)  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
}
