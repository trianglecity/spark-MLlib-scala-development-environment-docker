package org.apache.spark;
/**
 * :: DeveloperApi ::
 * The task failed because the executor that it was running on was lost. This may happen because
 * the task crashed the JVM.
 */
public  class ExecutorLostFailure implements org.apache.spark.TaskFailedReason, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String execId ()  { throw new RuntimeException(); }
  public  boolean exitCausedByApp ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> reason ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorLostFailure (java.lang.String execId, boolean exitCausedByApp, scala.Option<java.lang.String> reason)  { throw new RuntimeException(); }
  public  java.lang.String toErrorString ()  { throw new RuntimeException(); }
  public  boolean countTowardsTaskFailures ()  { throw new RuntimeException(); }
}
