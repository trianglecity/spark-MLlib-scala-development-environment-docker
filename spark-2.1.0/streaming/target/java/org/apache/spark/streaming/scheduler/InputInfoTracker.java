package org.apache.spark.streaming.scheduler;
/**
 * This class manages all the input streams as well as their input data statistics. The information
 * will be exposed through StreamingListener for monitoring.
 */
  class InputInfoTracker implements org.apache.spark.internal.Logging {
  public   InputInfoTracker (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.streaming.scheduler.StreamInputInfo>> batchTimeToInputInfos ()  { throw new RuntimeException(); }
  /** Report the input information with batch time to the tracker */
  public  void reportInfo (org.apache.spark.streaming.Time batchTime, org.apache.spark.streaming.scheduler.StreamInputInfo inputInfo)  { throw new RuntimeException(); }
  /** Get the all the input stream's information of specified batch time */
  public  scala.collection.immutable.Map<java.lang.Object, org.apache.spark.streaming.scheduler.StreamInputInfo> getInfo (org.apache.spark.streaming.Time batchTime)  { throw new RuntimeException(); }
  /** Cleanup the tracked input information older than threshold batch time */
  public  void cleanup (org.apache.spark.streaming.Time batchThreshTime)  { throw new RuntimeException(); }
}
