package org.apache.spark.streaming.rdd;
/**
 * Record storing the keyed-state {@link MapWithStateRDD}. Each record contains a {@link StateMap} and a
 * sequence of records returned by the mapping function of <code>mapWithState</code>.
 */
  class MapWithStateRDDRecord<K extends java.lang.Object, S extends java.lang.Object, E extends java.lang.Object> implements scala.Product, scala.Serializable {
  static public <K extends java.lang.Object, V extends java.lang.Object, S extends java.lang.Object, E extends java.lang.Object> org.apache.spark.streaming.rdd.MapWithStateRDDRecord<K, S, E> updateRecordWithData (scala.Option<org.apache.spark.streaming.rdd.MapWithStateRDDRecord<K, S, E>> prevRecord, scala.collection.Iterator<scala.Tuple2<K, V>> dataIterator, scala.Function4<org.apache.spark.streaming.Time, K, scala.Option<V>, org.apache.spark.streaming.State<S>, scala.Option<E>> mappingFunction, org.apache.spark.streaming.Time batchTime, scala.Option<java.lang.Object> timeoutThresholdTime, boolean removeTimedoutData, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2, scala.reflect.ClassTag<S> evidence$3, scala.reflect.ClassTag<E> evidence$4)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.util.StateMap<K, S> stateMap ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<E> mappedData ()  { throw new RuntimeException(); }
  // not preceding
  public   MapWithStateRDDRecord (org.apache.spark.streaming.util.StateMap<K, S> stateMap, scala.collection.Seq<E> mappedData)  { throw new RuntimeException(); }
}
