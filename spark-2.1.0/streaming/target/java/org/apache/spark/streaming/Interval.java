package org.apache.spark.streaming;
  class Interval {
  static public  org.apache.spark.streaming.Interval currentInterval (org.apache.spark.streaming.Duration duration)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time beginTime ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time endTime ()  { throw new RuntimeException(); }
  // not preceding
  public   Interval (org.apache.spark.streaming.Time beginTime, org.apache.spark.streaming.Time endTime)  { throw new RuntimeException(); }
  public   Interval (long beginMs, long endMs)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration duration ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
