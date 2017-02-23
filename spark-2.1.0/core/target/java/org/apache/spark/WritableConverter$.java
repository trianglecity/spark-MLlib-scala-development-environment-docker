package org.apache.spark;
public  class WritableConverter$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final WritableConverter$ MODULE$ = null;
  public   WritableConverter$ ()  { throw new RuntimeException(); }
   <T extends java.lang.Object, W extends org.apache.hadoop.io.Writable> org.apache.spark.WritableConverter<T> simpleWritableConverter (scala.Function1<W, T> convert, scala.reflect.ClassTag<W> evidence$22)  { throw new RuntimeException(); }
  public  org.apache.spark.WritableConverter<java.lang.Object> intWritableConverter ()  { throw new RuntimeException(); }
  public  org.apache.spark.WritableConverter<java.lang.Object> longWritableConverter ()  { throw new RuntimeException(); }
  public  org.apache.spark.WritableConverter<java.lang.Object> doubleWritableConverter ()  { throw new RuntimeException(); }
  public  org.apache.spark.WritableConverter<java.lang.Object> floatWritableConverter ()  { throw new RuntimeException(); }
  public  org.apache.spark.WritableConverter<java.lang.Object> booleanWritableConverter ()  { throw new RuntimeException(); }
  public  org.apache.spark.WritableConverter<byte[]> bytesWritableConverter ()  { throw new RuntimeException(); }
  public  org.apache.spark.WritableConverter<java.lang.String> stringWritableConverter ()  { throw new RuntimeException(); }
  public <T extends org.apache.hadoop.io.Writable> org.apache.spark.WritableConverter<T> writableWritableConverter ()  { throw new RuntimeException(); }
}
