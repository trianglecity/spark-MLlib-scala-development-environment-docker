package org.apache.spark.internal.config;
public  class ConfigHelpers$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ConfigHelpers$ MODULE$ = null;
  public   ConfigHelpers$ ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T toNumber (java.lang.String s, scala.Function1<java.lang.String, T> converter, java.lang.String key, java.lang.String configType)  { throw new RuntimeException(); }
  public  boolean toBoolean (java.lang.String s, java.lang.String key)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> scala.collection.Seq<T> stringToSeq (java.lang.String str, scala.Function1<java.lang.String, T> converter)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> java.lang.String seqToString (scala.collection.Seq<T> v, scala.Function1<T, java.lang.String> stringConverter)  { throw new RuntimeException(); }
  public  long timeFromString (java.lang.String str, java.util.concurrent.TimeUnit unit)  { throw new RuntimeException(); }
  public  java.lang.String timeToString (long v, java.util.concurrent.TimeUnit unit)  { throw new RuntimeException(); }
  public  long byteFromString (java.lang.String str, org.apache.spark.network.util.ByteUnit unit)  { throw new RuntimeException(); }
  public  java.lang.String byteToString (long v, org.apache.spark.network.util.ByteUnit unit)  { throw new RuntimeException(); }
}
