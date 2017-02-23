package org.apache.spark.streaming.rdd;
public  class MapWithStateRDDRecord$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MapWithStateRDDRecord$ MODULE$ = null;
  public   MapWithStateRDDRecord$ ()  { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object, S extends java.lang.Object, E extends java.lang.Object> org.apache.spark.streaming.rdd.MapWithStateRDDRecord<K, S, E> updateRecordWithData (scala.Option<org.apache.spark.streaming.rdd.MapWithStateRDDRecord<K, S, E>> prevRecord, scala.collection.Iterator<scala.Tuple2<K, V>> dataIterator, scala.Function4<org.apache.spark.streaming.Time, K, scala.Option<V>, org.apache.spark.streaming.State<S>, scala.Option<E>> mappingFunction, org.apache.spark.streaming.Time batchTime, scala.Option<java.lang.Object> timeoutThresholdTime, boolean removeTimedoutData, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2, scala.reflect.ClassTag<S> evidence$3, scala.reflect.ClassTag<E> evidence$4)  { throw new RuntimeException(); }
}
