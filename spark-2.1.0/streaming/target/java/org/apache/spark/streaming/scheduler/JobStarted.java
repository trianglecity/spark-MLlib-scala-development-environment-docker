package org.apache.spark.streaming.scheduler;
  class JobStarted implements org.apache.spark.streaming.scheduler.JobSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.Job job ()  { throw new RuntimeException(); }
  public  long startTime ()  { throw new RuntimeException(); }
  // not preceding
  public   JobStarted (org.apache.spark.streaming.scheduler.Job job, long startTime)  { throw new RuntimeException(); }
}
