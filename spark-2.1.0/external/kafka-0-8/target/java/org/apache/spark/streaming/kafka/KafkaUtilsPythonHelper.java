package org.apache.spark.streaming.kafka;
/**
 * This is a helper class that wraps the KafkaUtils.createStream() into more
 * Python-friendly class and function so that it can be easily
 * instantiated and called from Python's KafkaUtils.
 * <p>
 * The zero-arg constructor helps instantiate this class from the Class object
 * classOf[KafkaUtilsPythonHelper].newInstance(), and the createStream()
 * takes care of known parameters instead of passing them from Python
 */
  class KafkaUtilsPythonHelper {
  static public  class PythonMessageAndMetadata implements scala.Product, scala.Serializable {
    public  java.lang.String topic ()  { throw new RuntimeException(); }
    public  java.lang.Integer partition ()  { throw new RuntimeException(); }
    public  java.lang.Long offset ()  { throw new RuntimeException(); }
    public  byte[] key ()  { throw new RuntimeException(); }
    public  byte[] message ()  { throw new RuntimeException(); }
    // not preceding
    public   PythonMessageAndMetadata (java.lang.String topic, java.lang.Integer partition, java.lang.Long offset, byte[] key, byte[] message)  { throw new RuntimeException(); }
  }
  static public  class PythonMessageAndMetadata$ extends scala.runtime.AbstractFunction5<java.lang.String, java.lang.Integer, java.lang.Long, byte[], byte[], org.apache.spark.streaming.kafka.KafkaUtilsPythonHelper.PythonMessageAndMetadata> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PythonMessageAndMetadata$ MODULE$ = null;
    public   PythonMessageAndMetadata$ ()  { throw new RuntimeException(); }
  }
  static public  class PythonMessageAndMetadataPickler implements net.razorvine.pickle.IObjectPickler {
    public   PythonMessageAndMetadataPickler ()  { throw new RuntimeException(); }
    private  java.lang.String module ()  { throw new RuntimeException(); }
    public  void register ()  { throw new RuntimeException(); }
    public  void pickle (java.lang.Object obj, java.io.OutputStream out, net.razorvine.pickle.Pickler pickler)  { throw new RuntimeException(); }
  }
  static private  boolean initialized ()  { throw new RuntimeException(); }
  static public  void initialize ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<byte[]> picklerIterator (scala.collection.Iterator<java.lang.Object> iter)  { throw new RuntimeException(); }
  public   KafkaUtilsPythonHelper ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.api.java.JavaPairReceiverInputDStream<byte[], byte[]> createStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.util.Map<java.lang.String, java.lang.String> kafkaParams, java.util.Map<java.lang.String, java.lang.Integer> topics, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<scala.Tuple2<byte[], byte[]>> createRDDWithoutMessageHandler (org.apache.spark.api.java.JavaSparkContext jsc, java.util.Map<java.lang.String, java.lang.String> kafkaParams, java.util.List<org.apache.spark.streaming.kafka.OffsetRange> offsetRanges, java.util.Map<kafka.common.TopicAndPartition, org.apache.spark.streaming.kafka.Broker> leaders)  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<byte[]> createRDDWithMessageHandler (org.apache.spark.api.java.JavaSparkContext jsc, java.util.Map<java.lang.String, java.lang.String> kafkaParams, java.util.List<org.apache.spark.streaming.kafka.OffsetRange> offsetRanges, java.util.Map<kafka.common.TopicAndPartition, org.apache.spark.streaming.kafka.Broker> leaders)  { throw new RuntimeException(); }
  private <V extends java.lang.Object> org.apache.spark.rdd.RDD<V> createRDD (org.apache.spark.api.java.JavaSparkContext jsc, java.util.Map<java.lang.String, java.lang.String> kafkaParams, java.util.List<org.apache.spark.streaming.kafka.OffsetRange> offsetRanges, java.util.Map<kafka.common.TopicAndPartition, org.apache.spark.streaming.kafka.Broker> leaders, scala.Function1<kafka.message.MessageAndMetadata<byte[], byte[]>, V> messageHandler, scala.reflect.ClassTag<V> evidence$23)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.api.java.JavaDStream<scala.Tuple2<byte[], byte[]>> createDirectStreamWithoutMessageHandler (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.util.Map<java.lang.String, java.lang.String> kafkaParams, java.util.Set<java.lang.String> topics, java.util.Map<kafka.common.TopicAndPartition, java.lang.Number> fromOffsets)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.api.java.JavaDStream<byte[]> createDirectStreamWithMessageHandler (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.util.Map<java.lang.String, java.lang.String> kafkaParams, java.util.Set<java.lang.String> topics, java.util.Map<kafka.common.TopicAndPartition, java.lang.Number> fromOffsets)  { throw new RuntimeException(); }
  private <V extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<V> createDirectStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.util.Map<java.lang.String, java.lang.String> kafkaParams, java.util.Set<java.lang.String> topics, java.util.Map<kafka.common.TopicAndPartition, java.lang.Number> fromOffsets, scala.Function1<kafka.message.MessageAndMetadata<byte[], byte[]>, V> messageHandler, scala.reflect.ClassTag<V> evidence$24)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kafka.OffsetRange createOffsetRange (java.lang.String topic, java.lang.Integer partition, java.lang.Long fromOffset, java.lang.Long untilOffset)  { throw new RuntimeException(); }
  public  kafka.common.TopicAndPartition createTopicAndPartition (java.lang.String topic, java.lang.Integer partition)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kafka.Broker createBroker (java.lang.String host, java.lang.Integer port)  { throw new RuntimeException(); }
  public  java.util.List<org.apache.spark.streaming.kafka.OffsetRange> offsetRangesOfKafkaRDD (org.apache.spark.rdd.RDD<?> rdd)  { throw new RuntimeException(); }
}
