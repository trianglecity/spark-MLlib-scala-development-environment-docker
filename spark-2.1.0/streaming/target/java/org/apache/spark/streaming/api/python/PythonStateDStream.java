package org.apache.spark.streaming.api.python;
/**
 * similar to StateDStream
 */
  class PythonStateDStream extends org.apache.spark.streaming.api.python.PythonDStream {
  public   PythonStateDStream (org.apache.spark.streaming.dstream.DStream<byte[]> parent, org.apache.spark.streaming.api.python.PythonTransformFunction reduceFunc, scala.Option<org.apache.spark.rdd.RDD<byte[]>> initialRDD)  { throw new RuntimeException(); }
  public   PythonStateDStream (org.apache.spark.streaming.dstream.DStream<byte[]> parent, org.apache.spark.streaming.api.python.PythonTransformFunction reduceFunc)  { throw new RuntimeException(); }
  public   PythonStateDStream (org.apache.spark.streaming.dstream.DStream<byte[]> parent, org.apache.spark.streaming.api.python.PythonTransformFunction reduceFunc, org.apache.spark.api.java.JavaRDD<byte[]> initialRDD)  { throw new RuntimeException(); }
  public  boolean mustCheckpoint ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<byte[]>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
}
