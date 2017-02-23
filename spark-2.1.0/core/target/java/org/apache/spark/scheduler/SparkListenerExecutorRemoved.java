package org.apache.spark.scheduler;
public  class SparkListenerExecutorRemoved implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static protected  boolean logEvent ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long time ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  java.lang.String reason ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerExecutorRemoved (long time, java.lang.String executorId, java.lang.String reason)  { throw new RuntimeException(); }
}
