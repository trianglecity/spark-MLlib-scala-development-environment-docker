package org.apache.spark.streaming.dstream;
/**
 * An input stream that reads blocks of serialized objects from a given network address.
 * The blocks will be inserted directly into the block store. This is the fastest way to get
 * data into Spark Streaming, though it requires the sender to batch data and serialize it
 * in the format that the system is configured with.
 */
  class RawInputDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.ReceiverInputDStream<T> implements org.apache.spark.internal.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   RawInputDStream (org.apache.spark.streaming.StreamingContext _ssc, java.lang.String host, int port, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.receiver.Receiver<T> getReceiver ()  { throw new RuntimeException(); }
}
