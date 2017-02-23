package org.apache.spark;
/**
 * MapOutputTracker for the executors, which fetches map output information from the driver's
 * MapOutputTrackerMaster.
 */
  class MapOutputTrackerWorker extends org.apache.spark.MapOutputTracker {
  public   MapOutputTrackerWorker (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  protected  scala.collection.mutable.Map<java.lang.Object, org.apache.spark.scheduler.MapStatus[]> mapStatuses ()  { throw new RuntimeException(); }
}
