package org.apache.spark.streaming.dstream;
  class MapPartitionedDStream<T extends java.lang.Object, U extends java.lang.Object> extends org.apache.spark.streaming.dstream.DStream<U> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   MapPartitionedDStream (org.apache.spark.streaming.dstream.DStream<T> parent, scala.Function1<scala.collection.Iterator<T>, scala.collection.Iterator<U>> mapPartFunc, boolean preservePartitioning, scala.reflect.ClassTag<T> evidence$1, scala.reflect.ClassTag<U> evidence$2)  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<?>> dependencies ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<U>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
}
