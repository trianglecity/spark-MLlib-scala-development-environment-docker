package org.apache.spark.streaming.scheduler;
public  class ExecutorAllocationManager$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExecutorAllocationManager$ MODULE$ = null;
  public   ExecutorAllocationManager$ ()  { throw new RuntimeException(); }
  public  java.lang.String ENABLED_KEY ()  { throw new RuntimeException(); }
  public  java.lang.String SCALING_INTERVAL_KEY ()  { throw new RuntimeException(); }
  public  int SCALING_INTERVAL_DEFAULT_SECS ()  { throw new RuntimeException(); }
  public  java.lang.String SCALING_UP_RATIO_KEY ()  { throw new RuntimeException(); }
  public  double SCALING_UP_RATIO_DEFAULT ()  { throw new RuntimeException(); }
  public  java.lang.String SCALING_DOWN_RATIO_KEY ()  { throw new RuntimeException(); }
  public  double SCALING_DOWN_RATIO_DEFAULT ()  { throw new RuntimeException(); }
  public  java.lang.String MIN_EXECUTORS_KEY ()  { throw new RuntimeException(); }
  public  java.lang.String MAX_EXECUTORS_KEY ()  { throw new RuntimeException(); }
  public  boolean isDynamicAllocationEnabled (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.scheduler.ExecutorAllocationManager> createIfEnabled (org.apache.spark.ExecutorAllocationClient client, org.apache.spark.streaming.scheduler.ReceiverTracker receiverTracker, org.apache.spark.SparkConf conf, long batchDurationMs, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
}
