package org.apache.spark.streaming;
/**
 * This is a simple class that represents an absolute instant of time.
 * Internally, it represents time as the difference, measured in milliseconds, between the current
 * time and midnight, January 1, 1970 UTC. This is the same format as what is returned by
 * System.currentTimeMillis.
 */
public  class Time implements scala.Product, scala.Serializable {
  static public  scala.math.Ordering<org.apache.spark.streaming.Time> ordering ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  private  long millis ()  { throw new RuntimeException(); }
  // not preceding
  public   Time (long millis)  { throw new RuntimeException(); }
  public  long milliseconds ()  { throw new RuntimeException(); }
  public  boolean less (org.apache.spark.streaming.Time that)  { throw new RuntimeException(); }
  public  boolean lessEq (org.apache.spark.streaming.Time that)  { throw new RuntimeException(); }
  public  boolean greater (org.apache.spark.streaming.Time that)  { throw new RuntimeException(); }
  public  boolean greaterEq (org.apache.spark.streaming.Time that)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time plus (org.apache.spark.streaming.Duration that)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration minus (org.apache.spark.streaming.Time that)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time minus (org.apache.spark.streaming.Duration that)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time floor (org.apache.spark.streaming.Duration that)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time floor (org.apache.spark.streaming.Duration that, org.apache.spark.streaming.Time zeroTime)  { throw new RuntimeException(); }
  public  boolean isMultipleOf (org.apache.spark.streaming.Duration that)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time min (org.apache.spark.streaming.Time that)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time max (org.apache.spark.streaming.Time that)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.Time> until (org.apache.spark.streaming.Time that, org.apache.spark.streaming.Duration interval)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.Time> to (org.apache.spark.streaming.Time that, org.apache.spark.streaming.Duration interval)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
