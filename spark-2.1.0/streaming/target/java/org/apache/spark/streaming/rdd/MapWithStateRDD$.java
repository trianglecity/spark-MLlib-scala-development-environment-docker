package org.apache.spark.streaming.rdd;
public  class MapWithStateRDD$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MapWithStateRDD$ MODULE$ = null;
  public   MapWithStateRDD$ ()  { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object, S extends java.lang.Object, E extends java.lang.Object> org.apache.spark.streaming.rdd.MapWithStateRDD<K, V, S, E> createFromPairRDD (org.apache.spark.rdd.RDD<scala.Tuple2<K, S>> pairRDD, org.apache.spark.Partitioner partitioner, org.apache.spark.streaming.Time updateTime, scala.reflect.ClassTag<K> evidence$9, scala.reflect.ClassTag<V> evidence$10, scala.reflect.ClassTag<S> evidence$11, scala.reflect.ClassTag<E> evidence$12)  { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object, S extends java.lang.Object, E extends java.lang.Object> org.apache.spark.streaming.rdd.MapWithStateRDD<K, V, S, E> createFromRDD (org.apache.spark.rdd.RDD<scala.Tuple3<K, S, java.lang.Object>> rdd, org.apache.spark.Partitioner partitioner, org.apache.spark.streaming.Time updateTime, scala.reflect.ClassTag<K> evidence$13, scala.reflect.ClassTag<V> evidence$14, scala.reflect.ClassTag<S> evidence$15, scala.reflect.ClassTag<E> evidence$16)  { throw new RuntimeException(); }
}
