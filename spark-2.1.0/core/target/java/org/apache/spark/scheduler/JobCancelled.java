package org.apache.spark.scheduler;
  class JobCancelled implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int jobId ()  { throw new RuntimeException(); }
  // not preceding
  public   JobCancelled (int jobId)  { throw new RuntimeException(); }
}
