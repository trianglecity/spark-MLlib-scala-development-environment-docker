package org.apache.spark.streaming.scheduler;
/**
 * A message used by ReceiverTracker to ask all receiver's ids still stored in
 * ReceiverTrackerEndpoint.
 */
public  class AllReceiverIds {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
}
