package org.apache.spark.scheduler;
/**
 * A {@link SparkListenerEvent} bus that relays {@link SparkListenerEvent}s to its listeners
 */
  interface SparkListenerBus extends org.apache.spark.util.ListenerBus<org.apache.spark.scheduler.SparkListenerInterface, org.apache.spark.scheduler.SparkListenerEvent> {
  public  void doPostEvent (org.apache.spark.scheduler.SparkListenerInterface listener, org.apache.spark.scheduler.SparkListenerEvent event)  ;
}
