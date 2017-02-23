package org.apache.spark.scheduler;
  class CompletionEvent implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.Task<?> task ()  { throw new RuntimeException(); }
  public  org.apache.spark.TaskEndReason reason ()  { throw new RuntimeException(); }
  public  Object result ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> accumUpdates ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskInfo taskInfo ()  { throw new RuntimeException(); }
  // not preceding
  public   CompletionEvent (org.apache.spark.scheduler.Task<?> task, org.apache.spark.TaskEndReason reason, Object result, scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> accumUpdates, org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
}
