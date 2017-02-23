package org.apache.spark.scheduler;
/**
 * Periodic updates from executors.
 * param:  execId executor id
 * param:  accumUpdates sequence of (taskId, stageId, stageAttemptId, accumUpdates)
 */
public  class SparkListenerExecutorMetricsUpdate implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static protected  boolean logEvent ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String execId ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple4<java.lang.Object, java.lang.Object, java.lang.Object, scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo>>> accumUpdates ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerExecutorMetricsUpdate (java.lang.String execId, scala.collection.Seq<scala.Tuple4<java.lang.Object, java.lang.Object, java.lang.Object, scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo>>> accumUpdates)  { throw new RuntimeException(); }
}
