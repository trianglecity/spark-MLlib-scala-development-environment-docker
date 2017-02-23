package org.apache.spark.streaming;
public  class Duration implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  private  long millis ()  { throw new RuntimeException(); }
  // not preceding
  public   Duration (long millis)  { throw new RuntimeException(); }
  public  boolean less (org.apache.spark.streaming.Duration that)  { throw new RuntimeException(); }
  public  boolean lessEq (org.apache.spark.streaming.Duration that)  { throw new RuntimeException(); }
  public  boolean greater (org.apache.spark.streaming.Duration that)  { throw new RuntimeException(); }
  public  boolean greaterEq (org.apache.spark.streaming.Duration that)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration plus (org.apache.spark.streaming.Duration that)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration minus (org.apache.spark.streaming.Duration that)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration times (int times)  { throw new RuntimeException(); }
  public  double div (org.apache.spark.streaming.Duration that)  { throw new RuntimeException(); }
  public  boolean isMultipleOf (org.apache.spark.streaming.Duration that)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration min (org.apache.spark.streaming.Duration that)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration max (org.apache.spark.streaming.Duration that)  { throw new RuntimeException(); }
  public  boolean isZero ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String toFormattedString ()  { throw new RuntimeException(); }
  public  long milliseconds ()  { throw new RuntimeException(); }
  public  java.lang.String prettyPrint ()  { throw new RuntimeException(); }
}
