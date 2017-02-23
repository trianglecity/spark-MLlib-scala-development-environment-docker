package org.apache.spark.scheduler.cluster;
/**
 * This is a simple extension to ClusterScheduler - to ensure that appropriate initialization of
 * ApplicationMaster, etc is done
 */
  class YarnClusterScheduler extends org.apache.spark.scheduler.cluster.YarnScheduler {
  public   YarnClusterScheduler (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public  void postStartHook ()  { throw new RuntimeException(); }
}
