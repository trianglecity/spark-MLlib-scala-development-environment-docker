package org.apache.spark.streaming.kafka010;
/**
 * Assign a fixed collection of TopicPartitions
 * param:  topicPartitions collection of TopicPartitions to assign
 * param:  kafkaParams Kafka
 * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
 * configuration parameters</a> to be used on driver. The same params will be used on executors,
 * with minor automatic modifications applied.
 *  Requires "bootstrap.servers" to be set
 * with Kafka broker(s) specified in host1:port1,host2:port2 form.
 * param:  offsets: offsets to begin at on initial startup.  If no offset is given for a
 * TopicPartition, the committed offset (if applicable) or kafka param
 * auto.offset.reset will be used.
 */
public  class Assign<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitions ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> kafkaParams ()  { throw new RuntimeException(); }
  public  java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.Long> offsets ()  { throw new RuntimeException(); }
  // not preceding
  public   Assign (java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitions, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.Long> offsets)  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams ()  { throw new RuntimeException(); }
  public  org.apache.kafka.clients.consumer.Consumer<K, V> onStart (java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.Long> currentOffsets)  { throw new RuntimeException(); }
}
