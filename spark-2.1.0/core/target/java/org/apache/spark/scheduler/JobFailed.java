package org.apache.spark.scheduler;
  class JobFailed implements org.apache.spark.scheduler.JobResult, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.Exception exception ()  { throw new RuntimeException(); }
  // not preceding
  public   JobFailed (java.lang.Exception exception)  { throw new RuntimeException(); }
}
