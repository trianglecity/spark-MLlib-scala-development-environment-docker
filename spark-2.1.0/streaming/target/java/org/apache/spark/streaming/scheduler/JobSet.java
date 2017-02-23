package org.apache.spark.streaming.scheduler;
/**
 * Class representing a set of Jobs
 * belong to the same batch.
 */
  class JobSet implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time time ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.scheduler.Job> jobs ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, org.apache.spark.streaming.scheduler.StreamInputInfo> streamIdToInputInfo ()  { throw new RuntimeException(); }
  // not preceding
  public   JobSet (org.apache.spark.streaming.Time time, scala.collection.Seq<org.apache.spark.streaming.scheduler.Job> jobs, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.streaming.scheduler.StreamInputInfo> streamIdToInputInfo)  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<org.apache.spark.streaming.scheduler.Job> incompleteJobs ()  { throw new RuntimeException(); }
  private  long submissionTime ()  { throw new RuntimeException(); }
  private  long processingStartTime ()  { throw new RuntimeException(); }
  private  long processingEndTime ()  { throw new RuntimeException(); }
  public  void handleJobStart (org.apache.spark.streaming.scheduler.Job job)  { throw new RuntimeException(); }
  public  void handleJobCompletion (org.apache.spark.streaming.scheduler.Job job)  { throw new RuntimeException(); }
  public  boolean hasStarted ()  { throw new RuntimeException(); }
  public  boolean hasCompleted ()  { throw new RuntimeException(); }
  public  long processingDelay ()  { throw new RuntimeException(); }
  public  long totalDelay ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.BatchInfo toBatchInfo ()  { throw new RuntimeException(); }
}
