package org.apache.spark.scheduler;
public  class SparkListenerExecutorAdded implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static protected  boolean logEvent ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long time ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.cluster.ExecutorInfo executorInfo ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerExecutorAdded (long time, java.lang.String executorId, org.apache.spark.scheduler.cluster.ExecutorInfo executorInfo)  { throw new RuntimeException(); }
}
