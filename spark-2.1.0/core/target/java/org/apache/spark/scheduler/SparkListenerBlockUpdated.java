package org.apache.spark.scheduler;
public  class SparkListenerBlockUpdated implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static protected  boolean logEvent ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockUpdatedInfo blockUpdatedInfo ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerBlockUpdated (org.apache.spark.storage.BlockUpdatedInfo blockUpdatedInfo)  { throw new RuntimeException(); }
}
