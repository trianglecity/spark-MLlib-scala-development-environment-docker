package org.apache.spark.sql.execution.metric;
public  class SQLMetric extends org.apache.spark.util.AccumulatorV2<java.lang.Object, java.lang.Object> {
  static   org.apache.spark.util.AccumulatorMetadata metadata ()  { throw new RuntimeException(); }
  static   void metadata_$eq (org.apache.spark.util.AccumulatorMetadata x$1)  { throw new RuntimeException(); }
  static   void register (org.apache.spark.SparkContext sc, scala.Option<java.lang.String> name, boolean countFailedValues)  { throw new RuntimeException(); }
  static public final  boolean isRegistered ()  { throw new RuntimeException(); }
  static public final  long id ()  { throw new RuntimeException(); }
  static public final  scala.Option<java.lang.String> name ()  { throw new RuntimeException(); }
  static  final  boolean countFailedValues ()  { throw new RuntimeException(); }
  static  final  boolean isAtDriverSide ()  { throw new RuntimeException(); }
  static public  org.apache.spark.util.AccumulatorV2<IN, OUT> copyAndReset ()  { throw new RuntimeException(); }
  static protected final  Object writeReplace ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> register$default$2 ()  { throw new RuntimeException(); }
  static public  boolean register$default$3 ()  { throw new RuntimeException(); }
  public  java.lang.String metricType ()  { throw new RuntimeException(); }
  // not preceding
  public   SQLMetric (java.lang.String metricType, long initValue)  { throw new RuntimeException(); }
  private  long _zeroValue ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.metric.SQLMetric copy ()  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
  public  void merge (org.apache.spark.util.AccumulatorV2<java.lang.Object, java.lang.Object> other)  { throw new RuntimeException(); }
  public  boolean isZero ()  { throw new RuntimeException(); }
  public  void add (long v)  { throw new RuntimeException(); }
  public  long value ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.AccumulableInfo toInfo (scala.Option<java.lang.Object> update, scala.Option<java.lang.Object> value)  { throw new RuntimeException(); }
}
