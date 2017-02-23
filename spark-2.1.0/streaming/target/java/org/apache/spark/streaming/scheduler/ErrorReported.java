package org.apache.spark.streaming.scheduler;
  class ErrorReported implements org.apache.spark.streaming.scheduler.JobSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String msg ()  { throw new RuntimeException(); }
  public  java.lang.Throwable e ()  { throw new RuntimeException(); }
  // not preceding
  public   ErrorReported (java.lang.String msg, java.lang.Throwable e)  { throw new RuntimeException(); }
}
