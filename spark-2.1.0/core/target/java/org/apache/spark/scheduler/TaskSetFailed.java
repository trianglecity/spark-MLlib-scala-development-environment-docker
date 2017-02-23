package org.apache.spark.scheduler;
  class TaskSetFailed implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSet taskSet ()  { throw new RuntimeException(); }
  public  java.lang.String reason ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Throwable> exception ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskSetFailed (org.apache.spark.scheduler.TaskSet taskSet, java.lang.String reason, scala.Option<java.lang.Throwable> exception)  { throw new RuntimeException(); }
}
