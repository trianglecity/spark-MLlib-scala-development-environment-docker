package org.apache.spark.streaming.kafka;
/**
 * ReliableKafkaReceiver offers the ability to reliably store data into BlockManager without loss.
 * It is turned off by default and will be enabled when
 * spark.streaming.receiver.writeAheadLog.enable is true. The difference compared to KafkaReceiver
 * is that this receiver manages topic-partition/offset itself and updates the offset information
 * after data is reliably stored as write-ahead log. Offsets will only be updated when data is
 * reliably stored, so the potential data loss problem of KafkaReceiver can be eliminated.
 * <p>
 * Note: ReliableKafkaReceiver will set auto.commit.enable to false to turn off automatic offset
 * commit mechanism in Kafka consumer. So setting this configuration manually within kafkaParams
 * will not take effect.
 */
  class ReliableKafkaReceiver<K extends java.lang.Object, V extends java.lang.Object, U extends kafka.serializer.Decoder<?>, T extends kafka.serializer.Decoder<?>> extends org.apache.spark.streaming.receiver.Receiver<scala.Tuple2<K, V>> implements org.apache.spark.internal.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(ExistentialTypeTree(AppliedTypeTree(Select(Select(Ident(kafka), kafka.serializer), kafka.serializer.Decoder), List(TypeTree().setOriginal(Ident(TypeName("_$1"))))), List(TypeDef(Modifiers(DEFERRED | SYNTHETIC), TypeName("_$1"), List(), TypeBoundsTree(EmptyTree, EmptyTree)))))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(ExistentialTypeTree(AppliedTypeTree(Select(Select(Ident(kafka), kafka.serializer), kafka.serializer.Decoder), List(TypeTree().setOriginal(Ident(TypeName("_$2"))))), List(TypeDef(Modifiers(DEFERRED | SYNTHETIC), TypeName("_$2"), List(), TypeBoundsTree(EmptyTree, EmptyTree)))))))
  public   ReliableKafkaReceiver (scala.collection.Map<java.lang.String, java.lang.String> kafkaParams, scala.collection.Map<java.lang.String, java.lang.Object> topics, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2, scala.reflect.ClassTag<U> evidence$3, scala.reflect.ClassTag<T> evidence$4)  { throw new RuntimeException(); }
  private  java.lang.String groupId ()  { throw new RuntimeException(); }
  private  java.lang.String AUTO_OFFSET_COMMIT ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  /** High level consumer to connect to Kafka. */
  private  kafka.consumer.ConsumerConnector consumerConnector ()  { throw new RuntimeException(); }
  /** zkClient to connect to Zookeeper to commit the offsets. */
  private  org.I0Itec.zkclient.ZkClient zkClient ()  { throw new RuntimeException(); }
  /**
   * A HashMap to manage the offset for each topic/partition, this HashMap is called in
   * synchronized block, so mutable HashMap will not meet concurrency issue.
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashMap<kafka.common.TopicAndPartition, java.lang.Object> topicPartitionOffsetMap ()  { throw new RuntimeException(); }
  /** A concurrent HashMap to store the stream block id and related offset snapshot. */
  private  java.util.concurrent.ConcurrentHashMap<org.apache.spark.storage.StreamBlockId, scala.collection.Map<kafka.common.TopicAndPartition, java.lang.Object>> blockOffsetMap ()  { throw new RuntimeException(); }
  /**
   * Manage the BlockGenerator in receiver itself for better managing block store and offset
   * commit.
   * @return (undocumented)
   */
  private  org.apache.spark.streaming.receiver.BlockGenerator blockGenerator ()  { throw new RuntimeException(); }
  /** Thread pool running the handlers for receiving message from multiple topics and partitions. */
  private  java.util.concurrent.ThreadPoolExecutor messageHandlerThreadPool ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  /** Store a Kafka message and the associated metadata as a tuple. */
  private  void storeMessageAndMetadata (kafka.message.MessageAndMetadata<K, V> msgAndMetadata)  { throw new RuntimeException(); }
  /** Update stored offset */
  private  void updateOffset (kafka.common.TopicAndPartition topicAndPartition, long offset)  { throw new RuntimeException(); }
  /**
   * Remember the current offsets for each topic and partition. This is called when a block is
   * generated.
   * @param blockId (undocumented)
   */
  private  void rememberBlockOffsets (org.apache.spark.storage.StreamBlockId blockId)  { throw new RuntimeException(); }
  /**
   * Store the ready-to-be-stored block and commit the related offsets to zookeeper. This method
   * will try a fixed number of times to push the block. If the push fails, the receiver is stopped.
   * @param blockId (undocumented)
   * @param arrayBuffer (undocumented)
   */
  private  void storeBlockAndCommitOffset (org.apache.spark.storage.StreamBlockId blockId, scala.collection.mutable.ArrayBuffer<?> arrayBuffer)  { throw new RuntimeException(); }
  /**
   * Commit the offset of Kafka's topic/partition, the commit mechanism follow Kafka 0.8.x's
   * metadata schema in Zookeeper.
   * @param offsetMap (undocumented)
   */
  private  void commitOffset (scala.collection.Map<kafka.common.TopicAndPartition, java.lang.Object> offsetMap)  { throw new RuntimeException(); }
  /** Class to handle received Kafka message. */
  private final class MessageHandler implements java.lang.Runnable {
    public   MessageHandler (kafka.consumer.KafkaStream<K, V> stream)  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
  }
  /** Class to handle blocks generated by the block generator. */
  private final class GeneratedBlockHandler implements org.apache.spark.streaming.receiver.BlockGeneratorListener {
    public   GeneratedBlockHandler ()  { throw new RuntimeException(); }
    public  void onAddData (Object data, Object metadata)  { throw new RuntimeException(); }
    public  void onGenerateBlock (org.apache.spark.storage.StreamBlockId blockId)  { throw new RuntimeException(); }
    public  void onPushBlock (org.apache.spark.storage.StreamBlockId blockId, scala.collection.mutable.ArrayBuffer<?> arrayBuffer)  { throw new RuntimeException(); }
    public  void onError (java.lang.String message, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  }
}
