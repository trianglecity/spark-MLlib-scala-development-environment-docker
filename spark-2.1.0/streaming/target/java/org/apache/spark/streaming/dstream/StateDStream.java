package org.apache.spark.streaming.dstream;
  class StateDStream<K extends java.lang.Object, V extends java.lang.Object, S extends java.lang.Object> extends org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, S>> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   StateDStream (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> parent, scala.Function2<org.apache.spark.streaming.Time, scala.collection.Iterator<scala.Tuple3<K, scala.collection.Seq<V>, scala.Option<S>>>, scala.collection.Iterator<scala.Tuple2<K, S>>> updateFunc, org.apache.spark.Partitioner partitioner, boolean preservePartitioning, scala.Option<org.apache.spark.rdd.RDD<scala.Tuple2<K, S>>> initialRDD, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2, scala.reflect.ClassTag<S> evidence$3)  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<?>> dependencies ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration ()  { throw new RuntimeException(); }
  public  boolean mustCheckpoint ()  { throw new RuntimeException(); }
  private  scala.Some<org.apache.spark.rdd.RDD<scala.Tuple2<K, S>>> computeUsingPreviousRDD (org.apache.spark.streaming.Time batchTime, org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> parentRDD, org.apache.spark.rdd.RDD<scala.Tuple2<K, S>> prevStateRDD)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<scala.Tuple2<K, S>>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
}
