package org.apache.spark.scheduler;
  class ExecutorExited extends org.apache.spark.scheduler.ExecutorLossReason implements scala.Product, scala.Serializable {
  static public  org.apache.spark.scheduler.ExecutorExited apply (int exitCode, boolean exitCausedByApp)  { throw new RuntimeException(); }
  static public  java.lang.String message ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int exitCode ()  { throw new RuntimeException(); }
  public  boolean exitCausedByApp ()  { throw new RuntimeException(); }
  public  java.lang.String reason ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorExited (int exitCode, boolean exitCausedByApp, java.lang.String reason)  { throw new RuntimeException(); }
}
