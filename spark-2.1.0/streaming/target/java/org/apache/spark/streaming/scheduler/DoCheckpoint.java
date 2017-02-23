package org.apache.spark.streaming.scheduler;
  class DoCheckpoint implements org.apache.spark.streaming.scheduler.JobGeneratorEvent, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time time ()  { throw new RuntimeException(); }
  public  boolean clearCheckpointDataLater ()  { throw new RuntimeException(); }
  // not preceding
  public   DoCheckpoint (org.apache.spark.streaming.Time time, boolean clearCheckpointDataLater)  { throw new RuntimeException(); }
}
