package org.apache.spark.streaming.api.python;
/**
 * Transformed from two DStreams in Python.
 */
  class PythonTransformed2DStream extends org.apache.spark.streaming.dstream.DStream<byte[]> {
  public   PythonTransformed2DStream (org.apache.spark.streaming.dstream.DStream<?> parent, org.apache.spark.streaming.dstream.DStream<?> parent2, org.apache.spark.streaming.api.python.PythonTransformFunction pfunc)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.api.python.TransformFunction func ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<?>> dependencies ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<byte[]>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.api.java.JavaDStream<byte[]> asJavaDStream ()  { throw new RuntimeException(); }
}
