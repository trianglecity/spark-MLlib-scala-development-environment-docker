package org.apache.spark.streaming.kafka010;
/**
 * :: Experimental ::
 * object for obtaining instances of {@link ConsumerStrategy}
 */
public  class ConsumerStrategies {
  /**
   *  :: Experimental ::
   * Subscribe to a collection of topics.
   * @param topics collection of topics to subscribe
   * @param kafkaParams Kafka
   * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
   * configuration parameters</a> to be used on driver. The same params will be used on executors,
   * with minor automatic modifications applied.
   *  Requires "bootstrap.servers" to be set
   * with Kafka broker(s) specified in host1:port1,host2:port2 form.
   * @param offsets: offsets to begin at on initial startup.  If no offset is given for a
   * TopicPartition, the committed offset (if applicable) or kafka param
   * auto.offset.reset will be used.
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> Subscribe (scala.collection.Iterable<java.lang.String> topics, scala.collection.Map<java.lang.String, java.lang.Object> kafkaParams, scala.collection.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> offsets)  { throw new RuntimeException(); }
  /**
   *  :: Experimental ::
   * Subscribe to a collection of topics.
   * @param topics collection of topics to subscribe
   * @param kafkaParams Kafka
   * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
   * configuration parameters</a> to be used on driver. The same params will be used on executors,
   * with minor automatic modifications applied.
   *  Requires "bootstrap.servers" to be set
   * with Kafka broker(s) specified in host1:port1,host2:port2 form.
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> Subscribe (scala.collection.Iterable<java.lang.String> topics, scala.collection.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  /**
   *  :: Experimental ::
   * Subscribe to a collection of topics.
   * @param topics collection of topics to subscribe
   * @param kafkaParams Kafka
   * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
   * configuration parameters</a> to be used on driver. The same params will be used on executors,
   * with minor automatic modifications applied.
   *  Requires "bootstrap.servers" to be set
   * with Kafka broker(s) specified in host1:port1,host2:port2 form.
   * @param offsets: offsets to begin at on initial startup.  If no offset is given for a
   * TopicPartition, the committed offset (if applicable) or kafka param
   * auto.offset.reset will be used.
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> Subscribe (java.util.Collection<java.lang.String> topics, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.Long> offsets)  { throw new RuntimeException(); }
  /**
   *  :: Experimental ::
   * Subscribe to a collection of topics.
   * @param topics collection of topics to subscribe
   * @param kafkaParams Kafka
   * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
   * configuration parameters</a> to be used on driver. The same params will be used on executors,
   * with minor automatic modifications applied.
   *  Requires "bootstrap.servers" to be set
   * with Kafka broker(s) specified in host1:port1,host2:port2 form.
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> Subscribe (java.util.Collection<java.lang.String> topics, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  /** :: Experimental ::
   * Subscribe to all topics matching specified pattern to get dynamically assigned partitions.
   * The pattern matching will be done periodically against topics existing at the time of check.
   * @param pattern pattern to subscribe to
   * @param kafkaParams Kafka
   * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
   * configuration parameters</a> to be used on driver. The same params will be used on executors,
   * with minor automatic modifications applied.
   *  Requires "bootstrap.servers" to be set
   * with Kafka broker(s) specified in host1:port1,host2:port2 form.
   * @param offsets: offsets to begin at on initial startup.  If no offset is given for a
   * TopicPartition, the committed offset (if applicable) or kafka param
   * auto.offset.reset will be used.
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> SubscribePattern (java.util.regex.Pattern pattern, scala.collection.Map<java.lang.String, java.lang.Object> kafkaParams, scala.collection.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> offsets)  { throw new RuntimeException(); }
  /** :: Experimental ::
   * Subscribe to all topics matching specified pattern to get dynamically assigned partitions.
   * The pattern matching will be done periodically against topics existing at the time of check.
   * @param pattern pattern to subscribe to
   * @param kafkaParams Kafka
   * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
   * configuration parameters</a> to be used on driver. The same params will be used on executors,
   * with minor automatic modifications applied.
   *  Requires "bootstrap.servers" to be set
   * with Kafka broker(s) specified in host1:port1,host2:port2 form.
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> SubscribePattern (java.util.regex.Pattern pattern, scala.collection.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  /** :: Experimental ::
   * Subscribe to all topics matching specified pattern to get dynamically assigned partitions.
   * The pattern matching will be done periodically against topics existing at the time of check.
   * @param pattern pattern to subscribe to
   * @param kafkaParams Kafka
   * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
   * configuration parameters</a> to be used on driver. The same params will be used on executors,
   * with minor automatic modifications applied.
   *  Requires "bootstrap.servers" to be set
   * with Kafka broker(s) specified in host1:port1,host2:port2 form.
   * @param offsets: offsets to begin at on initial startup.  If no offset is given for a
   * TopicPartition, the committed offset (if applicable) or kafka param
   * auto.offset.reset will be used.
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> SubscribePattern (java.util.regex.Pattern pattern, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.Long> offsets)  { throw new RuntimeException(); }
  /** :: Experimental ::
   * Subscribe to all topics matching specified pattern to get dynamically assigned partitions.
   * The pattern matching will be done periodically against topics existing at the time of check.
   * @param pattern pattern to subscribe to
   * @param kafkaParams Kafka
   * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
   * configuration parameters</a> to be used on driver. The same params will be used on executors,
   * with minor automatic modifications applied.
   *  Requires "bootstrap.servers" to be set
   * with Kafka broker(s) specified in host1:port1,host2:port2 form.
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> SubscribePattern (java.util.regex.Pattern pattern, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  /**
   *  :: Experimental ::
   * Assign a fixed collection of TopicPartitions
   * @param topicPartitions collection of TopicPartitions to assign
   * @param kafkaParams Kafka
   * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
   * configuration parameters</a> to be used on driver. The same params will be used on executors,
   * with minor automatic modifications applied.
   *  Requires "bootstrap.servers" to be set
   * with Kafka broker(s) specified in host1:port1,host2:port2 form.
   * @param offsets: offsets to begin at on initial startup.  If no offset is given for a
   * TopicPartition, the committed offset (if applicable) or kafka param
   * auto.offset.reset will be used.
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> Assign (scala.collection.Iterable<org.apache.kafka.common.TopicPartition> topicPartitions, scala.collection.Map<java.lang.String, java.lang.Object> kafkaParams, scala.collection.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> offsets)  { throw new RuntimeException(); }
  /**
   *  :: Experimental ::
   * Assign a fixed collection of TopicPartitions
   * @param topicPartitions collection of TopicPartitions to assign
   * @param kafkaParams Kafka
   * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
   * configuration parameters</a> to be used on driver. The same params will be used on executors,
   * with minor automatic modifications applied.
   *  Requires "bootstrap.servers" to be set
   * with Kafka broker(s) specified in host1:port1,host2:port2 form.
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> Assign (scala.collection.Iterable<org.apache.kafka.common.TopicPartition> topicPartitions, scala.collection.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  /**
   *  :: Experimental ::
   * Assign a fixed collection of TopicPartitions
   * @param topicPartitions collection of TopicPartitions to assign
   * @param kafkaParams Kafka
   * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
   * configuration parameters</a> to be used on driver. The same params will be used on executors,
   * with minor automatic modifications applied.
   *  Requires "bootstrap.servers" to be set
   * with Kafka broker(s) specified in host1:port1,host2:port2 form.
   * @param offsets: offsets to begin at on initial startup.  If no offset is given for a
   * TopicPartition, the committed offset (if applicable) or kafka param
   * auto.offset.reset will be used.
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> Assign (java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitions, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.Long> offsets)  { throw new RuntimeException(); }
  /**
   *  :: Experimental ::
   * Assign a fixed collection of TopicPartitions
   * @param topicPartitions collection of TopicPartitions to assign
   * @param kafkaParams Kafka
   * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
   * configuration parameters</a> to be used on driver. The same params will be used on executors,
   * with minor automatic modifications applied.
   *  Requires "bootstrap.servers" to be set
   * with Kafka broker(s) specified in host1:port1,host2:port2 form.
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> Assign (java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitions, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
}
