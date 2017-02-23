package org.apache.spark.streaming.scheduler;
/**
 * This message is sent to ReceiverTrackerEndpoint when we start to launch Spark jobs for receivers
 * at the first time.
 */
  class StartAllReceivers implements org.apache.spark.streaming.scheduler.ReceiverTrackerLocalMessage, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.receiver.Receiver<?>> receiver ()  { throw new RuntimeException(); }
  // not preceding
  public   StartAllReceivers (scala.collection.Seq<org.apache.spark.streaming.receiver.Receiver<?>> receiver)  { throw new RuntimeException(); }
}
