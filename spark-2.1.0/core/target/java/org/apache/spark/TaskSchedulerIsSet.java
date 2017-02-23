package org.apache.spark;
/**
 * An event that SparkContext uses to notify HeartbeatReceiver that SparkContext.taskScheduler is
 * created.
 */
public  class TaskSchedulerIsSet {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
}
