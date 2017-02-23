package org.apache.spark.scheduler;
  class BeginEvent implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.Task<?> task ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskInfo taskInfo ()  { throw new RuntimeException(); }
  // not preceding
  public   BeginEvent (org.apache.spark.scheduler.Task<?> task, org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
}
