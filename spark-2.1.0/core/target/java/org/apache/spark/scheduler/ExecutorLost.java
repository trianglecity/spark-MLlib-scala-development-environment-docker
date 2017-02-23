package org.apache.spark.scheduler;
  class ExecutorLost implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String execId ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.ExecutorLossReason reason ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorLost (java.lang.String execId, org.apache.spark.scheduler.ExecutorLossReason reason)  { throw new RuntimeException(); }
}
