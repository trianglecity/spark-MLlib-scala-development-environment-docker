package org.apache.spark.streaming.flume;
public  class FlumeUtils {
  static private  int DEFAULT_POLLING_PARALLELISM ()  { throw new RuntimeException(); }
  static private  int DEFAULT_POLLING_BATCH_SIZE ()  { throw new RuntimeException(); }
  /**
   * Create a input stream from a Flume source.
   * @param ssc      StreamingContext object
   * @param hostname Hostname of the slave machine to which the flume data will be sent
   * @param port     Port of the slave machine to which the flume data will be sent
   * @param storageLevel  Storage level to use for storing the received objects
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.dstream.ReceiverInputDStream<org.apache.spark.streaming.flume.SparkFlumeEvent> createStream (org.apache.spark.streaming.StreamingContext ssc, java.lang.String hostname, int port, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /**
   * Create a input stream from a Flume source.
   * @param ssc      StreamingContext object
   * @param hostname Hostname of the slave machine to which the flume data will be sent
   * @param port     Port of the slave machine to which the flume data will be sent
   * @param storageLevel  Storage level to use for storing the received objects
   * @param enableDecompression  should netty server decompress input stream
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.dstream.ReceiverInputDStream<org.apache.spark.streaming.flume.SparkFlumeEvent> createStream (org.apache.spark.streaming.StreamingContext ssc, java.lang.String hostname, int port, org.apache.spark.storage.StorageLevel storageLevel, boolean enableDecompression)  { throw new RuntimeException(); }
  /**
   * Creates a input stream from a Flume source.
   * Storage level of the data will be the default StorageLevel.MEMORY_AND_DISK_SER_2.
   * @param hostname Hostname of the slave machine to which the flume data will be sent
   * @param port     Port of the slave machine to which the flume data will be sent
   * @param jssc (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.api.java.JavaReceiverInputDStream<org.apache.spark.streaming.flume.SparkFlumeEvent> createStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.lang.String hostname, int port)  { throw new RuntimeException(); }
  /**
   * Creates a input stream from a Flume source.
   * @param hostname Hostname of the slave machine to which the flume data will be sent
   * @param port     Port of the slave machine to which the flume data will be sent
   * @param storageLevel  Storage level to use for storing the received objects
   * @param jssc (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.api.java.JavaReceiverInputDStream<org.apache.spark.streaming.flume.SparkFlumeEvent> createStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.lang.String hostname, int port, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /**
   * Creates a input stream from a Flume source.
   * @param hostname Hostname of the slave machine to which the flume data will be sent
   * @param port     Port of the slave machine to which the flume data will be sent
   * @param storageLevel  Storage level to use for storing the received objects
   * @param enableDecompression  should netty server decompress input stream
   * @param jssc (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.api.java.JavaReceiverInputDStream<org.apache.spark.streaming.flume.SparkFlumeEvent> createStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.lang.String hostname, int port, org.apache.spark.storage.StorageLevel storageLevel, boolean enableDecompression)  { throw new RuntimeException(); }
  /**
   * Creates an input stream that is to be used with the Spark Sink deployed on a Flume agent.
   * This stream will poll the sink for data and will pull events as they are available.
   * This stream will use a batch size of 1000 events and run 5 threads to pull data.
   * @param hostname Address of the host on which the Spark Sink is running
   * @param port Port of the host at which the Spark Sink is listening
   * @param storageLevel Storage level to use for storing the received objects
   * @param ssc (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.dstream.ReceiverInputDStream<org.apache.spark.streaming.flume.SparkFlumeEvent> createPollingStream (org.apache.spark.streaming.StreamingContext ssc, java.lang.String hostname, int port, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /**
   * Creates an input stream that is to be used with the Spark Sink deployed on a Flume agent.
   * This stream will poll the sink for data and will pull events as they are available.
   * This stream will use a batch size of 1000 events and run 5 threads to pull data.
   * @param addresses List of InetSocketAddresses representing the hosts to connect to.
   * @param storageLevel Storage level to use for storing the received objects
   * @param ssc (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.dstream.ReceiverInputDStream<org.apache.spark.streaming.flume.SparkFlumeEvent> createPollingStream (org.apache.spark.streaming.StreamingContext ssc, scala.collection.Seq<java.net.InetSocketAddress> addresses, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /**
   * Creates an input stream that is to be used with the Spark Sink deployed on a Flume agent.
   * This stream will poll the sink for data and will pull events as they are available.
   * @param addresses List of InetSocketAddresses representing the hosts to connect to.
   * @param maxBatchSize Maximum number of events to be pulled from the Spark sink in a
   *                     single RPC call
   * @param parallelism Number of concurrent requests this stream should send to the sink. Note
   *                    that having a higher number of requests concurrently being pulled will
   *                    result in this stream using more threads
   * @param storageLevel Storage level to use for storing the received objects
   * @param ssc (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.dstream.ReceiverInputDStream<org.apache.spark.streaming.flume.SparkFlumeEvent> createPollingStream (org.apache.spark.streaming.StreamingContext ssc, scala.collection.Seq<java.net.InetSocketAddress> addresses, org.apache.spark.storage.StorageLevel storageLevel, int maxBatchSize, int parallelism)  { throw new RuntimeException(); }
  /**
   * Creates an input stream that is to be used with the Spark Sink deployed on a Flume agent.
   * This stream will poll the sink for data and will pull events as they are available.
   * This stream will use a batch size of 1000 events and run 5 threads to pull data.
   * @param hostname Hostname of the host on which the Spark Sink is running
   * @param port     Port of the host at which the Spark Sink is listening
   * @param jssc (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.api.java.JavaReceiverInputDStream<org.apache.spark.streaming.flume.SparkFlumeEvent> createPollingStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.lang.String hostname, int port)  { throw new RuntimeException(); }
  /**
   * Creates an input stream that is to be used with the Spark Sink deployed on a Flume agent.
   * This stream will poll the sink for data and will pull events as they are available.
   * This stream will use a batch size of 1000 events and run 5 threads to pull data.
   * @param hostname     Hostname of the host on which the Spark Sink is running
   * @param port         Port of the host at which the Spark Sink is listening
   * @param storageLevel Storage level to use for storing the received objects
   * @param jssc (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.api.java.JavaReceiverInputDStream<org.apache.spark.streaming.flume.SparkFlumeEvent> createPollingStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.lang.String hostname, int port, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /**
   * Creates an input stream that is to be used with the Spark Sink deployed on a Flume agent.
   * This stream will poll the sink for data and will pull events as they are available.
   * This stream will use a batch size of 1000 events and run 5 threads to pull data.
   * @param addresses    List of InetSocketAddresses on which the Spark Sink is running.
   * @param storageLevel Storage level to use for storing the received objects
   * @param jssc (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.api.java.JavaReceiverInputDStream<org.apache.spark.streaming.flume.SparkFlumeEvent> createPollingStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.net.InetSocketAddress[] addresses, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /**
   * Creates an input stream that is to be used with the Spark Sink deployed on a Flume agent.
   * This stream will poll the sink for data and will pull events as they are available.
   * @param addresses    List of InetSocketAddresses on which the Spark Sink is running
   * @param maxBatchSize The maximum number of events to be pulled from the Spark sink in a
   *                     single RPC call
   * @param parallelism  Number of concurrent requests this stream should send to the sink. Note
   *                     that having a higher number of requests concurrently being pulled will
   *                     result in this stream using more threads
   * @param storageLevel Storage level to use for storing the received objects
   * @param jssc (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.api.java.JavaReceiverInputDStream<org.apache.spark.streaming.flume.SparkFlumeEvent> createPollingStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.net.InetSocketAddress[] addresses, org.apache.spark.storage.StorageLevel storageLevel, int maxBatchSize, int parallelism)  { throw new RuntimeException(); }
}
