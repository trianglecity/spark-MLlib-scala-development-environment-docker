package org.apache.spark.sql.execution.ui;
public  class SparkListenerDriverAccumUpdates implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  static protected  boolean logEvent ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long executionId ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> accumUpdates ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerDriverAccumUpdates (long executionId, scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> accumUpdates)  { throw new RuntimeException(); }
}
