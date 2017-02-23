package org.apache.spark.streaming.kafka;
public  class KafkaUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KafkaUtils$ MODULE$ = null;
  public   KafkaUtils$ ()  { throw new RuntimeException(); }
  /**
   * Create an input stream that pulls messages from Kafka Brokers.
   * @param ssc       StreamingContext object
   * @param zkQuorum  Zookeeper quorum (hostname:port,hostname:port,..)
   * @param groupId   The group id for this consumer
   * @param topics    Map of (topic_name to numPartitions) to consume. Each partition is consumed
   *                  in its own thread
   * @param storageLevel  Storage level to use for storing the received objects
   *                      (default: StorageLevel.MEMORY_AND_DISK_SER_2)
   * @return DStream of (Kafka message key, Kafka message value)
   */
  public  org.apache.spark.streaming.dstream.ReceiverInputDStream<scala.Tuple2<java.lang.String, java.lang.String>> createStream (org.apache.spark.streaming.StreamingContext ssc, java.lang.String zkQuorum, java.lang.String groupId, scala.collection.immutable.Map<java.lang.String, java.lang.Object> topics, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /**
   * Create an input stream that pulls messages from Kafka Brokers.
   * @param ssc         StreamingContext object
   * @param kafkaParams Map of kafka configuration parameters,
   *                    see http://kafka.apache.org/08/configuration.html
   * @param topics      Map of (topic_name to numPartitions) to consume. Each partition is consumed
   *                    in its own thread.
   * @param storageLevel Storage level to use for storing the received objects
   * @tparam K type of Kafka message key
   * @tparam V type of Kafka message value
   * @tparam U type of Kafka message key decoder
   * @tparam T type of Kafka message value decoder
   * @return DStream of (Kafka message key, Kafka message value)
   * @param evidence$1 (undocumented)
   * @param evidence$2 (undocumented)
   * @param evidence$3 (undocumented)
   * @param evidence$4 (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, U extends kafka.serializer.Decoder<?>, T extends kafka.serializer.Decoder<?>> org.apache.spark.streaming.dstream.ReceiverInputDStream<scala.Tuple2<K, V>> createStream (org.apache.spark.streaming.StreamingContext ssc, scala.collection.immutable.Map<java.lang.String, java.lang.String> kafkaParams, scala.collection.immutable.Map<java.lang.String, java.lang.Object> topics, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2, scala.reflect.ClassTag<U> evidence$3, scala.reflect.ClassTag<T> evidence$4)  { throw new RuntimeException(); }
  /**
   * Create an input stream that pulls messages from Kafka Brokers.
   * Storage level of the data will be the default StorageLevel.MEMORY_AND_DISK_SER_2.
   * @param jssc      JavaStreamingContext object
   * @param zkQuorum  Zookeeper quorum (hostname:port,hostname:port,..)
   * @param groupId   The group id for this consumer
   * @param topics    Map of (topic_name to numPartitions) to consume. Each partition is consumed
   *                  in its own thread
   * @return DStream of (Kafka message key, Kafka message value)
   */
  public  org.apache.spark.streaming.api.java.JavaPairReceiverInputDStream<java.lang.String, java.lang.String> createStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.lang.String zkQuorum, java.lang.String groupId, java.util.Map<java.lang.String, java.lang.Integer> topics)  { throw new RuntimeException(); }
  /**
   * Create an input stream that pulls messages from Kafka Brokers.
   * @param jssc      JavaStreamingContext object
   * @param zkQuorum  Zookeeper quorum (hostname:port,hostname:port,..).
   * @param groupId   The group id for this consumer.
   * @param topics    Map of (topic_name to numPartitions) to consume. Each partition is consumed
   *                  in its own thread.
   * @param storageLevel RDD storage level.
   * @return DStream of (Kafka message key, Kafka message value)
   */
  public  org.apache.spark.streaming.api.java.JavaPairReceiverInputDStream<java.lang.String, java.lang.String> createStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.lang.String zkQuorum, java.lang.String groupId, java.util.Map<java.lang.String, java.lang.Integer> topics, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /**
   * Create an input stream that pulls messages from Kafka Brokers.
   * @param jssc      JavaStreamingContext object
   * @param keyTypeClass Key type of DStream
   * @param valueTypeClass value type of Dstream
   * @param keyDecoderClass Type of kafka key decoder
   * @param valueDecoderClass Type of kafka value decoder
   * @param kafkaParams Map of kafka configuration parameters,
   *                    see http://kafka.apache.org/08/configuration.html
   * @param topics  Map of (topic_name to numPartitions) to consume. Each partition is consumed
   *                in its own thread
   * @param storageLevel RDD storage level.
   * @tparam K type of Kafka message key
   * @tparam V type of Kafka message value
   * @tparam U type of Kafka message key decoder
   * @tparam T type of Kafka message value decoder
   * @return DStream of (Kafka message key, Kafka message value)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, U extends kafka.serializer.Decoder<?>, T extends kafka.serializer.Decoder<?>> org.apache.spark.streaming.api.java.JavaPairReceiverInputDStream<K, V> createStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.lang.Class<K> keyTypeClass, java.lang.Class<V> valueTypeClass, java.lang.Class<U> keyDecoderClass, java.lang.Class<T> valueDecoderClass, java.util.Map<java.lang.String, java.lang.String> kafkaParams, java.util.Map<java.lang.String, java.lang.Integer> topics, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /** get leaders for the given offset ranges, or throw an exception */
  private  scala.collection.immutable.Map<kafka.common.TopicAndPartition, scala.Tuple2<java.lang.String, java.lang.Object>> leadersForRanges (org.apache.spark.streaming.kafka.KafkaCluster kc, org.apache.spark.streaming.kafka.OffsetRange[] offsetRanges)  { throw new RuntimeException(); }
  /** Make sure offsets are available in kafka, or throw an exception */
  private  void checkOffsets (org.apache.spark.streaming.kafka.KafkaCluster kc, org.apache.spark.streaming.kafka.OffsetRange[] offsetRanges)  { throw new RuntimeException(); }
    scala.collection.immutable.Map<kafka.common.TopicAndPartition, java.lang.Object> getFromOffsets (org.apache.spark.streaming.kafka.KafkaCluster kc, scala.collection.immutable.Map<java.lang.String, java.lang.String> kafkaParams, scala.collection.immutable.Set<java.lang.String> topics)  { throw new RuntimeException(); }
  /**
   * Create an RDD from Kafka using offset ranges for each topic and partition.
   * <p>
   * @param sc SparkContext object
   * @param kafkaParams Kafka <a href="http://kafka.apache.org/documentation.html#configuration">
   *    configuration parameters</a>. Requires "metadata.broker.list" or "bootstrap.servers"
   *    to be set with Kafka broker(s) (NOT zookeeper servers) specified in
   *    host1:port1,host2:port2 form.
   * @param offsetRanges Each OffsetRange in the batch corresponds to a
   *   range of offsets for a given Kafka topic/partition
   * @tparam K type of Kafka message key
   * @tparam V type of Kafka message value
   * @tparam KD type of Kafka message key decoder
   * @tparam VD type of Kafka message value decoder
   * @return RDD of (Kafka message key, Kafka message value)
   * @param evidence$5 (undocumented)
   * @param evidence$6 (undocumented)
   * @param evidence$7 (undocumented)
   * @param evidence$8 (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, KD extends kafka.serializer.Decoder<K>, VD extends kafka.serializer.Decoder<V>> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> createRDD (org.apache.spark.SparkContext sc, scala.collection.immutable.Map<java.lang.String, java.lang.String> kafkaParams, org.apache.spark.streaming.kafka.OffsetRange[] offsetRanges, scala.reflect.ClassTag<K> evidence$5, scala.reflect.ClassTag<V> evidence$6, scala.reflect.ClassTag<KD> evidence$7, scala.reflect.ClassTag<VD> evidence$8)  { throw new RuntimeException(); }
  /**
   * Create an RDD from Kafka using offset ranges for each topic and partition. This allows you
   * specify the Kafka leader to connect to (to optimize fetching) and access the message as well
   * as the metadata.
   * <p>
   * @param sc SparkContext object
   * @param kafkaParams Kafka <a href="http://kafka.apache.org/documentation.html#configuration">
   *    configuration parameters</a>. Requires "metadata.broker.list" or "bootstrap.servers"
   *    to be set with Kafka broker(s) (NOT zookeeper servers) specified in
   *    host1:port1,host2:port2 form.
   * @param offsetRanges Each OffsetRange in the batch corresponds to a
   *   range of offsets for a given Kafka topic/partition
   * @param leaders Kafka brokers for each TopicAndPartition in offsetRanges.  May be an empty map,
   *   in which case leaders will be looked up on the driver.
   * @param messageHandler Function for translating each message and metadata into the desired type
   * @tparam K type of Kafka message key
   * @tparam V type of Kafka message value
   * @tparam KD type of Kafka message key decoder
   * @tparam VD type of Kafka message value decoder
   * @tparam R type returned by messageHandler
   * @return RDD of R
   * @param evidence$9 (undocumented)
   * @param evidence$10 (undocumented)
   * @param evidence$11 (undocumented)
   * @param evidence$12 (undocumented)
   * @param evidence$13 (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, KD extends kafka.serializer.Decoder<K>, VD extends kafka.serializer.Decoder<V>, R extends java.lang.Object> org.apache.spark.rdd.RDD<R> createRDD (org.apache.spark.SparkContext sc, scala.collection.immutable.Map<java.lang.String, java.lang.String> kafkaParams, org.apache.spark.streaming.kafka.OffsetRange[] offsetRanges, scala.collection.immutable.Map<kafka.common.TopicAndPartition, org.apache.spark.streaming.kafka.Broker> leaders, scala.Function1<kafka.message.MessageAndMetadata<K, V>, R> messageHandler, scala.reflect.ClassTag<K> evidence$9, scala.reflect.ClassTag<V> evidence$10, scala.reflect.ClassTag<KD> evidence$11, scala.reflect.ClassTag<VD> evidence$12, scala.reflect.ClassTag<R> evidence$13)  { throw new RuntimeException(); }
  /**
   * Create an RDD from Kafka using offset ranges for each topic and partition.
   * <p>
   * @param jsc JavaSparkContext object
   * @param kafkaParams Kafka <a href="http://kafka.apache.org/documentation.html#configuration">
   *    configuration parameters</a>. Requires "metadata.broker.list" or "bootstrap.servers"
   *    to be set with Kafka broker(s) (NOT zookeeper servers) specified in
   *    host1:port1,host2:port2 form.
   * @param offsetRanges Each OffsetRange in the batch corresponds to a
   *   range of offsets for a given Kafka topic/partition
   * @param keyClass type of Kafka message key
   * @param valueClass type of Kafka message value
   * @param keyDecoderClass type of Kafka message key decoder
   * @param valueDecoderClass type of Kafka message value decoder
   * @tparam K type of Kafka message key
   * @tparam V type of Kafka message value
   * @tparam KD type of Kafka message key decoder
   * @tparam VD type of Kafka message value decoder
   * @return RDD of (Kafka message key, Kafka message value)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, KD extends kafka.serializer.Decoder<K>, VD extends kafka.serializer.Decoder<V>> org.apache.spark.api.java.JavaPairRDD<K, V> createRDD (org.apache.spark.api.java.JavaSparkContext jsc, java.lang.Class<K> keyClass, java.lang.Class<V> valueClass, java.lang.Class<KD> keyDecoderClass, java.lang.Class<VD> valueDecoderClass, java.util.Map<java.lang.String, java.lang.String> kafkaParams, org.apache.spark.streaming.kafka.OffsetRange[] offsetRanges)  { throw new RuntimeException(); }
  /**
   * Create an RDD from Kafka using offset ranges for each topic and partition. This allows you
   * specify the Kafka leader to connect to (to optimize fetching) and access the message as well
   * as the metadata.
   * <p>
   * @param jsc JavaSparkContext object
   * @param kafkaParams Kafka <a href="http://kafka.apache.org/documentation.html#configuration">
   *    configuration parameters</a>. Requires "metadata.broker.list" or "bootstrap.servers"
   *    to be set with Kafka broker(s) (NOT zookeeper servers) specified in
   *    host1:port1,host2:port2 form.
   * @param offsetRanges Each OffsetRange in the batch corresponds to a
   *   range of offsets for a given Kafka topic/partition
   * @param leaders Kafka brokers for each TopicAndPartition in offsetRanges.  May be an empty map,
   *   in which case leaders will be looked up on the driver.
   * @param messageHandler Function for translating each message and metadata into the desired type
   * @tparam K type of Kafka message key
   * @tparam V type of Kafka message value
   * @tparam KD type of Kafka message key decoder
   * @tparam VD type of Kafka message value decoder
   * @tparam R type returned by messageHandler
   * @return RDD of R
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param keyDecoderClass (undocumented)
   * @param valueDecoderClass (undocumented)
   * @param recordClass (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, KD extends kafka.serializer.Decoder<K>, VD extends kafka.serializer.Decoder<V>, R extends java.lang.Object> org.apache.spark.api.java.JavaRDD<R> createRDD (org.apache.spark.api.java.JavaSparkContext jsc, java.lang.Class<K> keyClass, java.lang.Class<V> valueClass, java.lang.Class<KD> keyDecoderClass, java.lang.Class<VD> valueDecoderClass, java.lang.Class<R> recordClass, java.util.Map<java.lang.String, java.lang.String> kafkaParams, org.apache.spark.streaming.kafka.OffsetRange[] offsetRanges, java.util.Map<kafka.common.TopicAndPartition, org.apache.spark.streaming.kafka.Broker> leaders, org.apache.spark.api.java.function.Function<kafka.message.MessageAndMetadata<K, V>, R> messageHandler)  { throw new RuntimeException(); }
  /**
   * Create an input stream that directly pulls messages from Kafka Brokers
   * without using any receiver. This stream can guarantee that each message
   * from Kafka is included in transformations exactly once (see points below).
   * <p>
   * Points to note:
   *  - No receivers: This stream does not use any receiver. It directly queries Kafka
   *  - Offsets: This does not use Zookeeper to store offsets. The consumed offsets are tracked
   *    by the stream itself. For interoperability with Kafka monitoring tools that depend on
   *    Zookeeper, you have to update Kafka/Zookeeper yourself from the streaming application.
   *    You can access the offsets used in each batch from the generated RDDs (see
   *    {@link org.apache.spark.streaming.kafka.HasOffsetRanges}).
   *  - Failure Recovery: To recover from driver failures, you have to enable checkpointing
   *    in the <code>StreamingContext</code>. The information on consumed offset can be
   *    recovered from the checkpoint. See the programming guide for details (constraints, etc.).
   *  - End-to-end semantics: This stream ensures that every records is effectively received and
   *    transformed exactly once, but gives no guarantees on whether the transformed data are
   *    outputted exactly once. For end-to-end exactly-once semantics, you have to either ensure
   *    that the output operation is idempotent, or use transactions to output records atomically.
   *    See the programming guide for more details.
   * <p>
   * @param ssc StreamingContext object
   * @param kafkaParams Kafka <a href="http://kafka.apache.org/documentation.html#configuration">
   *    configuration parameters</a>. Requires "metadata.broker.list" or "bootstrap.servers"
   *    to be set with Kafka broker(s) (NOT zookeeper servers) specified in
   *    host1:port1,host2:port2 form.
   * @param fromOffsets Per-topic/partition Kafka offsets defining the (inclusive)
   *    starting point of the stream
   * @param messageHandler Function for translating each message and metadata into the desired type
   * @tparam K type of Kafka message key
   * @tparam V type of Kafka message value
   * @tparam KD type of Kafka message key decoder
   * @tparam VD type of Kafka message value decoder
   * @tparam R type returned by messageHandler
   * @return DStream of R
   * @param evidence$14 (undocumented)
   * @param evidence$15 (undocumented)
   * @param evidence$16 (undocumented)
   * @param evidence$17 (undocumented)
   * @param evidence$18 (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, KD extends kafka.serializer.Decoder<K>, VD extends kafka.serializer.Decoder<V>, R extends java.lang.Object> org.apache.spark.streaming.dstream.InputDStream<R> createDirectStream (org.apache.spark.streaming.StreamingContext ssc, scala.collection.immutable.Map<java.lang.String, java.lang.String> kafkaParams, scala.collection.immutable.Map<kafka.common.TopicAndPartition, java.lang.Object> fromOffsets, scala.Function1<kafka.message.MessageAndMetadata<K, V>, R> messageHandler, scala.reflect.ClassTag<K> evidence$14, scala.reflect.ClassTag<V> evidence$15, scala.reflect.ClassTag<KD> evidence$16, scala.reflect.ClassTag<VD> evidence$17, scala.reflect.ClassTag<R> evidence$18)  { throw new RuntimeException(); }
  /**
   * Create an input stream that directly pulls messages from Kafka Brokers
   * without using any receiver. This stream can guarantee that each message
   * from Kafka is included in transformations exactly once (see points below).
   * <p>
   * Points to note:
   *  - No receivers: This stream does not use any receiver. It directly queries Kafka
   *  - Offsets: This does not use Zookeeper to store offsets. The consumed offsets are tracked
   *    by the stream itself. For interoperability with Kafka monitoring tools that depend on
   *    Zookeeper, you have to update Kafka/Zookeeper yourself from the streaming application.
   *    You can access the offsets used in each batch from the generated RDDs (see
   *    {@link org.apache.spark.streaming.kafka.HasOffsetRanges}).
   *  - Failure Recovery: To recover from driver failures, you have to enable checkpointing
   *    in the <code>StreamingContext</code>. The information on consumed offset can be
   *    recovered from the checkpoint. See the programming guide for details (constraints, etc.).
   *  - End-to-end semantics: This stream ensures that every records is effectively received and
   *    transformed exactly once, but gives no guarantees on whether the transformed data are
   *    outputted exactly once. For end-to-end exactly-once semantics, you have to either ensure
   *    that the output operation is idempotent, or use transactions to output records atomically.
   *    See the programming guide for more details.
   * <p>
   * @param ssc StreamingContext object
   * @param kafkaParams Kafka <a href="http://kafka.apache.org/documentation.html#configuration">
   *   configuration parameters</a>. Requires "metadata.broker.list" or "bootstrap.servers"
   *   to be set with Kafka broker(s) (NOT zookeeper servers), specified in
   *   host1:port1,host2:port2 form.
   *   If not starting from a checkpoint, "auto.offset.reset" may be set to "largest" or "smallest"
   *   to determine where the stream starts (defaults to "largest")
   * @param topics Names of the topics to consume
   * @tparam K type of Kafka message key
   * @tparam V type of Kafka message value
   * @tparam KD type of Kafka message key decoder
   * @tparam VD type of Kafka message value decoder
   * @return DStream of (Kafka message key, Kafka message value)
   * @param evidence$19 (undocumented)
   * @param evidence$20 (undocumented)
   * @param evidence$21 (undocumented)
   * @param evidence$22 (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, KD extends kafka.serializer.Decoder<K>, VD extends kafka.serializer.Decoder<V>> org.apache.spark.streaming.dstream.InputDStream<scala.Tuple2<K, V>> createDirectStream (org.apache.spark.streaming.StreamingContext ssc, scala.collection.immutable.Map<java.lang.String, java.lang.String> kafkaParams, scala.collection.immutable.Set<java.lang.String> topics, scala.reflect.ClassTag<K> evidence$19, scala.reflect.ClassTag<V> evidence$20, scala.reflect.ClassTag<KD> evidence$21, scala.reflect.ClassTag<VD> evidence$22)  { throw new RuntimeException(); }
  /**
   * Create an input stream that directly pulls messages from Kafka Brokers
   * without using any receiver. This stream can guarantee that each message
   * from Kafka is included in transformations exactly once (see points below).
   * <p>
   * Points to note:
   *  - No receivers: This stream does not use any receiver. It directly queries Kafka
   *  - Offsets: This does not use Zookeeper to store offsets. The consumed offsets are tracked
   *    by the stream itself. For interoperability with Kafka monitoring tools that depend on
   *    Zookeeper, you have to update Kafka/Zookeeper yourself from the streaming application.
   *    You can access the offsets used in each batch from the generated RDDs (see
   *    {@link org.apache.spark.streaming.kafka.HasOffsetRanges}).
   *  - Failure Recovery: To recover from driver failures, you have to enable checkpointing
   *    in the <code>StreamingContext</code>. The information on consumed offset can be
   *    recovered from the checkpoint. See the programming guide for details (constraints, etc.).
   *  - End-to-end semantics: This stream ensures that every records is effectively received and
   *    transformed exactly once, but gives no guarantees on whether the transformed data are
   *    outputted exactly once. For end-to-end exactly-once semantics, you have to either ensure
   *    that the output operation is idempotent, or use transactions to output records atomically.
   *    See the programming guide for more details.
   * <p>
   * @param jssc JavaStreamingContext object
   * @param keyClass Class of the keys in the Kafka records
   * @param valueClass Class of the values in the Kafka records
   * @param keyDecoderClass Class of the key decoder
   * @param valueDecoderClass Class of the value decoder
   * @param recordClass Class of the records in DStream
   * @param kafkaParams Kafka <a href="http://kafka.apache.org/documentation.html#configuration">
   *   configuration parameters</a>. Requires "metadata.broker.list" or "bootstrap.servers"
   *   to be set with Kafka broker(s) (NOT zookeeper servers), specified in
   *   host1:port1,host2:port2 form.
   * @param fromOffsets Per-topic/partition Kafka offsets defining the (inclusive)
   *    starting point of the stream
   * @param messageHandler Function for translating each message and metadata into the desired type
   * @tparam K type of Kafka message key
   * @tparam V type of Kafka message value
   * @tparam KD type of Kafka message key decoder
   * @tparam VD type of Kafka message value decoder
   * @tparam R type returned by messageHandler
   * @return DStream of R
   */
  public <K extends java.lang.Object, V extends java.lang.Object, KD extends kafka.serializer.Decoder<K>, VD extends kafka.serializer.Decoder<V>, R extends java.lang.Object> org.apache.spark.streaming.api.java.JavaInputDStream<R> createDirectStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.lang.Class<K> keyClass, java.lang.Class<V> valueClass, java.lang.Class<KD> keyDecoderClass, java.lang.Class<VD> valueDecoderClass, java.lang.Class<R> recordClass, java.util.Map<java.lang.String, java.lang.String> kafkaParams, java.util.Map<kafka.common.TopicAndPartition, java.lang.Long> fromOffsets, org.apache.spark.api.java.function.Function<kafka.message.MessageAndMetadata<K, V>, R> messageHandler)  { throw new RuntimeException(); }
  /**
   * Create an input stream that directly pulls messages from Kafka Brokers
   * without using any receiver. This stream can guarantee that each message
   * from Kafka is included in transformations exactly once (see points below).
   * <p>
   * Points to note:
   *  - No receivers: This stream does not use any receiver. It directly queries Kafka
   *  - Offsets: This does not use Zookeeper to store offsets. The consumed offsets are tracked
   *    by the stream itself. For interoperability with Kafka monitoring tools that depend on
   *    Zookeeper, you have to update Kafka/Zookeeper yourself from the streaming application.
   *    You can access the offsets used in each batch from the generated RDDs (see
   *    {@link org.apache.spark.streaming.kafka.HasOffsetRanges}).
   *  - Failure Recovery: To recover from driver failures, you have to enable checkpointing
   *    in the <code>StreamingContext</code>. The information on consumed offset can be
   *    recovered from the checkpoint. See the programming guide for details (constraints, etc.).
   *  - End-to-end semantics: This stream ensures that every records is effectively received and
   *    transformed exactly once, but gives no guarantees on whether the transformed data are
   *    outputted exactly once. For end-to-end exactly-once semantics, you have to either ensure
   *    that the output operation is idempotent, or use transactions to output records atomically.
   *    See the programming guide for more details.
   * <p>
   * @param jssc JavaStreamingContext object
   * @param keyClass Class of the keys in the Kafka records
   * @param valueClass Class of the values in the Kafka records
   * @param keyDecoderClass Class of the key decoder
   * @param valueDecoderClass Class type of the value decoder
   * @param kafkaParams Kafka <a href="http://kafka.apache.org/documentation.html#configuration">
   *   configuration parameters</a>. Requires "metadata.broker.list" or "bootstrap.servers"
   *   to be set with Kafka broker(s) (NOT zookeeper servers), specified in
   *   host1:port1,host2:port2 form.
   *   If not starting from a checkpoint, "auto.offset.reset" may be set to "largest" or "smallest"
   *   to determine where the stream starts (defaults to "largest")
   * @param topics Names of the topics to consume
   * @tparam K type of Kafka message key
   * @tparam V type of Kafka message value
   * @tparam KD type of Kafka message key decoder
   * @tparam VD type of Kafka message value decoder
   * @return DStream of (Kafka message key, Kafka message value)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, KD extends kafka.serializer.Decoder<K>, VD extends kafka.serializer.Decoder<V>> org.apache.spark.streaming.api.java.JavaPairInputDStream<K, V> createDirectStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.lang.Class<K> keyClass, java.lang.Class<V> valueClass, java.lang.Class<KD> keyDecoderClass, java.lang.Class<VD> valueDecoderClass, java.util.Map<java.lang.String, java.lang.String> kafkaParams, java.util.Set<java.lang.String> topics)  { throw new RuntimeException(); }
}
