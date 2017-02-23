package org.apache.spark.streaming.dstream;
  class PluggableInputDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.ReceiverInputDStream<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PluggableInputDStream (org.apache.spark.streaming.StreamingContext _ssc, org.apache.spark.streaming.receiver.Receiver<T> receiver, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.receiver.Receiver<T> getReceiver ()  { throw new RuntimeException(); }
}
