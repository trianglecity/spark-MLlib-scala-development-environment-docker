package org.apache.spark.streaming.flume;
/**
 * A <code>ReceiverInputDStream</code> that can be used to read data from several Flume agents running
 * {@link org.apache.spark.streaming.flume.sink.SparkSink}s.
 * param:  _ssc Streaming context that will execute this input stream
 * param:  addresses List of addresses at which SparkSinks are listening
 * param:  maxBatchSize Maximum size of a batch
 * param:  parallelism Number of parallel connections to open
 * param:  storageLevel The storage level to use.
 * @tparam T Class type of the object of this stream
 */
  class FlumePollingInputDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.ReceiverInputDStream<org.apache.spark.streaming.flume.SparkFlumeEvent> {
  public  scala.collection.Seq<java.net.InetSocketAddress> addresses ()  { throw new RuntimeException(); }
  public  int maxBatchSize ()  { throw new RuntimeException(); }
  public  int parallelism ()  { throw new RuntimeException(); }
  // not preceding
  public   FlumePollingInputDStream (org.apache.spark.streaming.StreamingContext _ssc, scala.collection.Seq<java.net.InetSocketAddress> addresses, int maxBatchSize, int parallelism, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.receiver.Receiver<org.apache.spark.streaming.flume.SparkFlumeEvent> getReceiver ()  { throw new RuntimeException(); }
}
