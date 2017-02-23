package org.apache.spark.streaming.dstream;
  class SocketInputDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.ReceiverInputDStream<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   SocketInputDStream (org.apache.spark.streaming.StreamingContext _ssc, java.lang.String host, int port, scala.Function1<java.io.InputStream, scala.collection.Iterator<T>> bytesToObjects, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.receiver.Receiver<T> getReceiver ()  { throw new RuntimeException(); }
}
