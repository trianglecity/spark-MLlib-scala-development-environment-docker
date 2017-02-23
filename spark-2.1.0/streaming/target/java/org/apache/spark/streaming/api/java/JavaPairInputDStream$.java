package org.apache.spark.streaming.api.java;
public  class JavaPairInputDStream$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JavaPairInputDStream$ MODULE$ = null;
  public   JavaPairInputDStream$ ()  { throw new RuntimeException(); }
  /**
   * Convert a scala {@link org.apache.spark.streaming.dstream.InputDStream} of pairs to a
   * Java-friendly {@link org.apache.spark.streaming.api.java.JavaPairInputDStream}.
   * @param inputDStream (undocumented)
   * @param evidence$1 (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairInputDStream<K, V> fromInputDStream (org.apache.spark.streaming.dstream.InputDStream<scala.Tuple2<K, V>> inputDStream, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2)  { throw new RuntimeException(); }
}
