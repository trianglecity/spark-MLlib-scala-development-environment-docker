package org.apache.spark.broadcast;
/**
 * An interface for all the broadcast implementations in Spark (to allow
 * multiple broadcast implementations). SparkContext uses a user-specified
 * BroadcastFactory implementation to instantiate a particular broadcast for the
 * entire Spark job.
 */
  interface BroadcastFactory {
  public  void initialize (boolean isDriver, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityMgr)  ;
  /**
   * Creates a new broadcast variable.
   * <p>
   * @param value value to broadcast
   * @param isLocal whether we are in local mode (single JVM process)
   * @param id unique id representing this broadcast variable
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.broadcast.Broadcast<T> newBroadcast (T value, boolean isLocal, long id, scala.reflect.ClassTag<T> evidence$1)  ;
  public  void unbroadcast (long id, boolean removeFromDriver, boolean blocking)  ;
  public  void stop ()  ;
}
