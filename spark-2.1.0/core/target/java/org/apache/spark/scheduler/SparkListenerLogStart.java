package org.apache.spark.scheduler;
/**
 * An internal class that describes the metadata of an event log.
 * This event is not meant to be posted to listeners downstream.
 */
  class SparkListenerLogStart implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static protected  boolean logEvent ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String sparkVersion ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerLogStart (java.lang.String sparkVersion)  { throw new RuntimeException(); }
}
