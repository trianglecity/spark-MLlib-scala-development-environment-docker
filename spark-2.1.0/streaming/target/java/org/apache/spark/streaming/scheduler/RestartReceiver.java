package org.apache.spark.streaming.scheduler;
/**
 * This message will trigger ReceiverTrackerEndpoint to restart a Spark job for the receiver.
 */
  class RestartReceiver implements org.apache.spark.streaming.scheduler.ReceiverTrackerLocalMessage, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.receiver.Receiver<?> receiver ()  { throw new RuntimeException(); }
  // not preceding
  public   RestartReceiver (org.apache.spark.streaming.receiver.Receiver<?> receiver)  { throw new RuntimeException(); }
}
