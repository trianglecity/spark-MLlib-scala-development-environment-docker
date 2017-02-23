package org.apache.spark.streaming.kafka;
public  class KafkaRDD$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KafkaRDD$ MODULE$ = null;
  public   KafkaRDD$ ()  { throw new RuntimeException(); }
  /**
   * @param kafkaParams Kafka <a href="http://kafka.apache.org/documentation.html#configuration">
   * configuration parameters</a>.
   *   Requires "metadata.broker.list" or "bootstrap.servers" to be set with Kafka broker(s),
   *   NOT zookeeper servers, specified in host1:port1,host2:port2 form.
   * @param fromOffsets per-topic/partition Kafka offsets defining the (inclusive)
   *  starting point of the batch
   * @param untilOffsets per-topic/partition Kafka offsets defining the (exclusive)
   *  ending point of the batch
   * @param messageHandler function for translating each message into the desired type
   * @param sc (undocumented)
   * @param evidence$6 (undocumented)
   * @param evidence$7 (undocumented)
   * @param evidence$8 (undocumented)
   * @param evidence$9 (undocumented)
   * @param evidence$10 (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, U extends kafka.serializer.Decoder<?>, T extends kafka.serializer.Decoder<?>, R extends java.lang.Object> org.apache.spark.streaming.kafka.KafkaRDD<K, V, U, T, R> apply (org.apache.spark.SparkContext sc, scala.collection.immutable.Map<java.lang.String, java.lang.String> kafkaParams, scala.collection.immutable.Map<kafka.common.TopicAndPartition, java.lang.Object> fromOffsets, scala.collection.immutable.Map<kafka.common.TopicAndPartition, org.apache.spark.streaming.kafka.KafkaCluster.LeaderOffset> untilOffsets, scala.Function1<kafka.message.MessageAndMetadata<K, V>, R> messageHandler, scala.reflect.ClassTag<K> evidence$6, scala.reflect.ClassTag<V> evidence$7, scala.reflect.ClassTag<U> evidence$8, scala.reflect.ClassTag<T> evidence$9, scala.reflect.ClassTag<R> evidence$10)  { throw new RuntimeException(); }
}
