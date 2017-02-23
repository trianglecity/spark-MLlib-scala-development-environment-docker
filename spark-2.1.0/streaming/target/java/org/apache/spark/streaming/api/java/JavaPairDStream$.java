package org.apache.spark.streaming.api.java;
public  class JavaPairDStream$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JavaPairDStream$ MODULE$ = null;
  public   JavaPairDStream$ ()  { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, V> fromPairDStream (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> dstream, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2)  { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, V> fromJavaDStream (org.apache.spark.streaming.api.java.JavaDStream<scala.Tuple2<K, V>> dstream)  { throw new RuntimeException(); }
  public <K extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, java.lang.Long> scalaToJavaLong (org.apache.spark.streaming.api.java.JavaPairDStream<K, java.lang.Object> dstream, scala.reflect.ClassTag<K> evidence$3)  { throw new RuntimeException(); }
}
