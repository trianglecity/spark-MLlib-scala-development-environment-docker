package org.apache.spark;
/**
 * A class encapsulating how to convert some type T to Writable. It stores both the Writable class
 * corresponding to T (e.g. IntWritable for Int) and a function for doing the conversion.
 * The Writable class will be used in <code>SequenceFileRDDFunctions</code>.
 */
  class WritableFactory<T extends java.lang.Object> implements java.io.Serializable {
  static  <T extends java.lang.Object, W extends org.apache.hadoop.io.Writable> org.apache.spark.WritableFactory<T> simpleWritableFactory (scala.Function1<T, W> convert, scala.reflect.ClassTag<T> evidence$23, scala.reflect.ClassTag<W> evidence$24)  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableFactory<java.lang.Object> intWritableFactory ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableFactory<java.lang.Object> longWritableFactory ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableFactory<java.lang.Object> floatWritableFactory ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableFactory<java.lang.Object> doubleWritableFactory ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableFactory<java.lang.Object> booleanWritableFactory ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableFactory<byte[]> bytesWritableFactory ()  { throw new RuntimeException(); }
  static public  org.apache.spark.WritableFactory<java.lang.String> stringWritableFactory ()  { throw new RuntimeException(); }
  static public <T extends org.apache.hadoop.io.Writable> org.apache.spark.WritableFactory<T> writableWritableFactory (scala.reflect.ClassTag<T> evidence$25)  { throw new RuntimeException(); }
  public  scala.Function1<scala.reflect.ClassTag<T>, java.lang.Class<? extends org.apache.hadoop.io.Writable>> writableClass ()  { throw new RuntimeException(); }
  public  scala.Function1<T, org.apache.hadoop.io.Writable> convert ()  { throw new RuntimeException(); }
  // not preceding
  public   WritableFactory (scala.Function1<scala.reflect.ClassTag<T>, java.lang.Class<? extends org.apache.hadoop.io.Writable>> writableClass, scala.Function1<T, org.apache.hadoop.io.Writable> convert)  { throw new RuntimeException(); }
}
