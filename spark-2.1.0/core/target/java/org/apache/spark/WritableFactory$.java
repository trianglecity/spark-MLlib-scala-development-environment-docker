package org.apache.spark;
public  class WritableFactory$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final WritableFactory$ MODULE$ = null;
  public   WritableFactory$ ()  { throw new RuntimeException(); }
   <T extends java.lang.Object, W extends org.apache.hadoop.io.Writable> org.apache.spark.WritableFactory<T> simpleWritableFactory (scala.Function1<T, W> convert, scala.reflect.ClassTag<T> evidence$23, scala.reflect.ClassTag<W> evidence$24)  { throw new RuntimeException(); }
  public  org.apache.spark.WritableFactory<java.lang.Object> intWritableFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.WritableFactory<java.lang.Object> longWritableFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.WritableFactory<java.lang.Object> floatWritableFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.WritableFactory<java.lang.Object> doubleWritableFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.WritableFactory<java.lang.Object> booleanWritableFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.WritableFactory<byte[]> bytesWritableFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.WritableFactory<java.lang.String> stringWritableFactory ()  { throw new RuntimeException(); }
  public <T extends org.apache.hadoop.io.Writable> org.apache.spark.WritableFactory<T> writableWritableFactory (scala.reflect.ClassTag<T> evidence$25)  { throw new RuntimeException(); }
}
