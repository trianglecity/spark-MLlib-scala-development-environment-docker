package org.apache.spark.streaming.scheduler;
public  class StreamingListenerOutputOperationCompleted implements org.apache.spark.streaming.scheduler.StreamingListenerEvent, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.OutputOperationInfo outputOperationInfo ()  { throw new RuntimeException(); }
  // not preceding
  public   StreamingListenerOutputOperationCompleted (org.apache.spark.streaming.scheduler.OutputOperationInfo outputOperationInfo)  { throw new RuntimeException(); }
}
