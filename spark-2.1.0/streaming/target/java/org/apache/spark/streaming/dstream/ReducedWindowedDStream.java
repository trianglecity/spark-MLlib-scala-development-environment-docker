package org.apache.spark.streaming.dstream;
  class ReducedWindowedDStream<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ReducedWindowedDStream (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> parent, scala.Function2<V, V, V> reduceFunc, scala.Function2<V, V, V> invReduceFunc, scala.Option<scala.Function1<scala.Tuple2<K, V>, java.lang.Object>> filterFunc, org.apache.spark.streaming.Duration _windowDuration, org.apache.spark.streaming.Duration _slideDuration, org.apache.spark.Partitioner partitioner, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2)  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reducedStream ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration windowDuration ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<?>> dependencies ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration ()  { throw new RuntimeException(); }
  public  boolean mustCheckpoint ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration parentRememberDuration ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> persist (org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> checkpoint (org.apache.spark.streaming.Duration interval)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<scala.Tuple2<K, V>>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
}
