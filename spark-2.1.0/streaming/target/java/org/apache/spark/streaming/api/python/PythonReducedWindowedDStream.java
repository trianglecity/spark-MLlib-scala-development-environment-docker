package org.apache.spark.streaming.api.python;
/**
 * similar to ReducedWindowedDStream
 */
  class PythonReducedWindowedDStream extends org.apache.spark.streaming.api.python.PythonDStream {
  private  org.apache.spark.streaming.api.python.PythonTransformFunction pinvReduceFunc ()  { throw new RuntimeException(); }
  // not preceding
  public   PythonReducedWindowedDStream (org.apache.spark.streaming.dstream.DStream<byte[]> parent, org.apache.spark.streaming.api.python.PythonTransformFunction preduceFunc, org.apache.spark.streaming.api.python.PythonTransformFunction pinvReduceFunc, org.apache.spark.streaming.Duration _windowDuration, org.apache.spark.streaming.Duration _slideDuration)  { throw new RuntimeException(); }
  public  boolean mustCheckpoint ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.api.python.TransformFunction invReduceFunc ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration windowDuration ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration parentRememberDuration ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<byte[]>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
}
