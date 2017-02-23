package org.apache.spark.streaming.scheduler;
/**
 * A message used by ReceiverTracker to ask all receiver's ids still stored in
 * ReceiverTrackerEndpoint.
 */
public  class AllReceiverIds$ implements org.apache.spark.streaming.scheduler.ReceiverTrackerLocalMessage, scala.Product, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AllReceiverIds$ MODULE$ = null;
  public   AllReceiverIds$ ()  { throw new RuntimeException(); }
}
