package org.apache.spark.streaming.kafka010;
/**
 * param:  topic kafka topic name
 * param:  partition kafka partition id
 * param:  fromOffset inclusive starting offset
 * param:  untilOffset exclusive ending offset
 */
  class KafkaRDDPartition implements org.apache.spark.Partition {
  public  int index ()  { throw new RuntimeException(); }
  public  java.lang.String topic ()  { throw new RuntimeException(); }
  public  int partition ()  { throw new RuntimeException(); }
  public  long fromOffset ()  { throw new RuntimeException(); }
  public  long untilOffset ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaRDDPartition (int index, java.lang.String topic, int partition, long fromOffset, long untilOffset)  { throw new RuntimeException(); }
  /** Number of messages this partition refers to */
  public  long count ()  { throw new RuntimeException(); }
  /** Kafka TopicPartition object, for convenience */
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
}
