package org.apache.spark.scheduler;
/** A map stage as submitted to run as a separate job */
  class MapStageSubmitted implements org.apache.spark.scheduler.DAGSchedulerEvent, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int jobId ()  { throw new RuntimeException(); }
  public  org.apache.spark.ShuffleDependency<?, ?, ?> dependency ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.CallSite callSite ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.JobListener listener ()  { throw new RuntimeException(); }
  public  java.util.Properties properties ()  { throw new RuntimeException(); }
  // not preceding
  public   MapStageSubmitted (int jobId, org.apache.spark.ShuffleDependency<?, ?, ?> dependency, org.apache.spark.util.CallSite callSite, org.apache.spark.scheduler.JobListener listener, java.util.Properties properties)  { throw new RuntimeException(); }
}
