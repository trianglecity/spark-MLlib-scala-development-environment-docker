package org.apache.spark.scheduler;
public  class SparkListenerTaskEnd implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static protected  boolean logEvent ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  int stageAttemptId ()  { throw new RuntimeException(); }
  public  java.lang.String taskType ()  { throw new RuntimeException(); }
  public  org.apache.spark.TaskEndReason reason ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskInfo taskInfo ()  { throw new RuntimeException(); }
  public  org.apache.spark.executor.TaskMetrics taskMetrics ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerTaskEnd (int stageId, int stageAttemptId, java.lang.String taskType, org.apache.spark.TaskEndReason reason, org.apache.spark.scheduler.TaskInfo taskInfo, org.apache.spark.executor.TaskMetrics taskMetrics)  { throw new RuntimeException(); }
}
