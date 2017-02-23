package org.apache.spark.scheduler;
/**
 * A location that includes both a host and an executor id on that host.
 */
  class ExecutorCacheTaskLocation implements org.apache.spark.scheduler.TaskLocation, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorCacheTaskLocation (java.lang.String host, java.lang.String executorId)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
