package org.apache.spark.streaming.kafka;
/**
 * :: DeveloperApi ::
 * Convenience methods for interacting with a Kafka cluster.
 * See <a href="https://cwiki.apache.org/confluence/display/KAFKA/A+Guide+To+The+Kafka+Protocol">
 * A Guide To The Kafka Protocol</a> for more details on individual api calls.
 * param:  kafkaParams Kafka <a href="http://kafka.apache.org/documentation.html#configuration">
 * configuration parameters</a>.
 *   Requires "metadata.broker.list" or "bootstrap.servers" to be set with Kafka broker(s),
 *   NOT zookeeper servers, specified in host1:port1,host2:port2 form
 */
public  class KafkaCluster implements scala.Serializable {
  static public  class LeaderOffset implements scala.Product, scala.Serializable {
    public  java.lang.String host ()  { throw new RuntimeException(); }
    public  int port ()  { throw new RuntimeException(); }
    public  long offset ()  { throw new RuntimeException(); }
    // not preceding
    public   LeaderOffset (java.lang.String host, int port, long offset)  { throw new RuntimeException(); }
  }
  static public  class LeaderOffset$ extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.Object, java.lang.Object, org.apache.spark.streaming.kafka.KafkaCluster.LeaderOffset> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final LeaderOffset$ MODULE$ = null;
    public   LeaderOffset$ ()  { throw new RuntimeException(); }
  }
  /**
   * High-level kafka consumers connect to ZK.  ConsumerConfig assumes this use case.
   * Simple consumers connect directly to brokers, but need many of the same configs.
   * This subclass won't warn about missing ZK params, or presence of broker params.
   */
  static public  class SimpleConsumerConfig extends kafka.consumer.ConsumerConfig {
    private   SimpleConsumerConfig (java.lang.String brokers, java.util.Properties originalProps)  { throw new RuntimeException(); }
    public  scala.Tuple2<java.lang.String, java.lang.Object>[] seedBrokers ()  { throw new RuntimeException(); }
  }
  static public  class SimpleConsumerConfig$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SimpleConsumerConfig$ MODULE$ = null;
    public   SimpleConsumerConfig$ ()  { throw new RuntimeException(); }
    /**
     * Make a consumer config without requiring group.id or zookeeper.connect,
     * since communicating with brokers also needs common settings such as timeout
     * @param kafkaParams (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.streaming.kafka.KafkaCluster.SimpleConsumerConfig apply (scala.collection.immutable.Map<java.lang.String, java.lang.String> kafkaParams)  { throw new RuntimeException(); }
  }
  /** If the result is right, return it, otherwise throw SparkException */
  static public <T extends java.lang.Object> T checkErrors (scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, T> result)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> kafkaParams ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaCluster (scala.collection.immutable.Map<java.lang.String, java.lang.String> kafkaParams)  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.kafka.KafkaCluster.SimpleConsumerConfig _config ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kafka.KafkaCluster.SimpleConsumerConfig config ()  { throw new RuntimeException(); }
  public  kafka.consumer.SimpleConsumer connect (java.lang.String host, int port)  { throw new RuntimeException(); }
  public  scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, kafka.consumer.SimpleConsumer> connectLeader (java.lang.String topic, int partition)  { throw new RuntimeException(); }
  public  scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, scala.Tuple2<java.lang.String, java.lang.Object>> findLeader (java.lang.String topic, int partition)  { throw new RuntimeException(); }
  public  scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, scala.collection.immutable.Map<kafka.common.TopicAndPartition, scala.Tuple2<java.lang.String, java.lang.Object>>> findLeaders (scala.collection.immutable.Set<kafka.common.TopicAndPartition> topicAndPartitions)  { throw new RuntimeException(); }
  public  scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, scala.collection.immutable.Set<kafka.common.TopicAndPartition>> getPartitions (scala.collection.immutable.Set<java.lang.String> topics)  { throw new RuntimeException(); }
  public  scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, scala.collection.immutable.Set<kafka.api.TopicMetadata>> getPartitionMetadata (scala.collection.immutable.Set<java.lang.String> topics)  { throw new RuntimeException(); }
  public  scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, scala.collection.immutable.Map<kafka.common.TopicAndPartition, org.apache.spark.streaming.kafka.KafkaCluster.LeaderOffset>> getLatestLeaderOffsets (scala.collection.immutable.Set<kafka.common.TopicAndPartition> topicAndPartitions)  { throw new RuntimeException(); }
  public  scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, scala.collection.immutable.Map<kafka.common.TopicAndPartition, org.apache.spark.streaming.kafka.KafkaCluster.LeaderOffset>> getEarliestLeaderOffsets (scala.collection.immutable.Set<kafka.common.TopicAndPartition> topicAndPartitions)  { throw new RuntimeException(); }
  public  scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, scala.collection.immutable.Map<kafka.common.TopicAndPartition, org.apache.spark.streaming.kafka.KafkaCluster.LeaderOffset>> getLeaderOffsets (scala.collection.immutable.Set<kafka.common.TopicAndPartition> topicAndPartitions, long before)  { throw new RuntimeException(); }
  private <K extends java.lang.Object, V extends java.lang.Object> scala.collection.immutable.Map<V, scala.collection.Seq<K>> flip (scala.collection.immutable.Map<K, V> m)  { throw new RuntimeException(); }
  public  scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, scala.collection.immutable.Map<kafka.common.TopicAndPartition, scala.collection.Seq<org.apache.spark.streaming.kafka.KafkaCluster.LeaderOffset>>> getLeaderOffsets (scala.collection.immutable.Set<kafka.common.TopicAndPartition> topicAndPartitions, long before, int maxNumOffsets)  { throw new RuntimeException(); }
  private  short defaultConsumerApiVersion ()  { throw new RuntimeException(); }
  /**
   * Requires Kafka 0.8.1.1 or later.
   * Defaults to the original ZooKeeper backed API version.
   * @param groupId (undocumented)
   * @param topicAndPartitions (undocumented)
   * @return (undocumented)
   */
  public  scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, scala.collection.immutable.Map<kafka.common.TopicAndPartition, java.lang.Object>> getConsumerOffsets (java.lang.String groupId, scala.collection.immutable.Set<kafka.common.TopicAndPartition> topicAndPartitions)  { throw new RuntimeException(); }
  public  scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, scala.collection.immutable.Map<kafka.common.TopicAndPartition, java.lang.Object>> getConsumerOffsets (java.lang.String groupId, scala.collection.immutable.Set<kafka.common.TopicAndPartition> topicAndPartitions, short consumerApiVersion)  { throw new RuntimeException(); }
  /**
   * Requires Kafka 0.8.1.1 or later.
   * Defaults to the original ZooKeeper backed API version.
   * @param groupId (undocumented)
   * @param topicAndPartitions (undocumented)
   * @return (undocumented)
   */
  public  scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, scala.collection.immutable.Map<kafka.common.TopicAndPartition, kafka.common.OffsetMetadataAndError>> getConsumerOffsetMetadata (java.lang.String groupId, scala.collection.immutable.Set<kafka.common.TopicAndPartition> topicAndPartitions)  { throw new RuntimeException(); }
  public  scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, scala.collection.immutable.Map<kafka.common.TopicAndPartition, kafka.common.OffsetMetadataAndError>> getConsumerOffsetMetadata (java.lang.String groupId, scala.collection.immutable.Set<kafka.common.TopicAndPartition> topicAndPartitions, short consumerApiVersion)  { throw new RuntimeException(); }
  /**
   * Requires Kafka 0.8.1.1 or later.
   * Defaults to the original ZooKeeper backed API version.
   * @param groupId (undocumented)
   * @param offsets (undocumented)
   * @return (undocumented)
   */
  public  scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, scala.collection.immutable.Map<kafka.common.TopicAndPartition, java.lang.Object>> setConsumerOffsets (java.lang.String groupId, scala.collection.immutable.Map<kafka.common.TopicAndPartition, java.lang.Object> offsets)  { throw new RuntimeException(); }
  public  scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, scala.collection.immutable.Map<kafka.common.TopicAndPartition, java.lang.Object>> setConsumerOffsets (java.lang.String groupId, scala.collection.immutable.Map<kafka.common.TopicAndPartition, java.lang.Object> offsets, short consumerApiVersion)  { throw new RuntimeException(); }
  /**
   * Requires Kafka 0.8.1.1 or later.
   * Defaults to the original ZooKeeper backed API version.
   * @param groupId (undocumented)
   * @param metadata (undocumented)
   * @return (undocumented)
   */
  public  scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, scala.collection.immutable.Map<kafka.common.TopicAndPartition, java.lang.Object>> setConsumerOffsetMetadata (java.lang.String groupId, scala.collection.immutable.Map<kafka.common.TopicAndPartition, kafka.common.OffsetAndMetadata> metadata)  { throw new RuntimeException(); }
  public  scala.util.Either<scala.collection.mutable.ArrayBuffer<java.lang.Throwable>, scala.collection.immutable.Map<kafka.common.TopicAndPartition, java.lang.Object>> setConsumerOffsetMetadata (java.lang.String groupId, scala.collection.immutable.Map<kafka.common.TopicAndPartition, kafka.common.OffsetAndMetadata> metadata, short consumerApiVersion)  { throw new RuntimeException(); }
  private  void withBrokers (scala.collection.Iterable<scala.Tuple2<java.lang.String, java.lang.Object>> brokers, scala.collection.mutable.ArrayBuffer<java.lang.Throwable> errs, scala.Function1<kafka.consumer.SimpleConsumer, java.lang.Object> fn)  { throw new RuntimeException(); }
}
