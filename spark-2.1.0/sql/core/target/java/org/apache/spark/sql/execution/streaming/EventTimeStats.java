package org.apache.spark.sql.execution.streaming;
/** Class for collecting event time stats with an accumulator */
public  class EventTimeStats implements scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.execution.streaming.EventTimeStats zero ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long max ()  { throw new RuntimeException(); }
  public  long min ()  { throw new RuntimeException(); }
  public  long sum ()  { throw new RuntimeException(); }
  public  long count ()  { throw new RuntimeException(); }
  // not preceding
  public   EventTimeStats (long max, long min, long sum, long count)  { throw new RuntimeException(); }
  public  void add (long eventTime)  { throw new RuntimeException(); }
  public  void merge (org.apache.spark.sql.execution.streaming.EventTimeStats that)  { throw new RuntimeException(); }
  public  long avg ()  { throw new RuntimeException(); }
}
