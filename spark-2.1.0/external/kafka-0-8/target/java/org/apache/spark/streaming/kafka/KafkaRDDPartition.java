package org.apache.spark.streaming.kafka;
/**
 * param:  topic kafka topic name
 * param:  partition kafka partition id
 * param:  fromOffset inclusive starting offset
 * param:  untilOffset exclusive ending offset
 * param:  host preferred kafka host, i.e. the leader at the time the rdd was created
 * param:  port preferred kafka host's port
 */
  class KafkaRDDPartition implements org.apache.spark.Partition {
  public  int index ()  { throw new RuntimeException(); }
  public  java.lang.String topic ()  { throw new RuntimeException(); }
  public  int partition ()  { throw new RuntimeException(); }
  public  long fromOffset ()  { throw new RuntimeException(); }
  public  long untilOffset ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaRDDPartition (int index, java.lang.String topic, int partition, long fromOffset, long untilOffset, java.lang.String host, int port)  { throw new RuntimeException(); }
  /** Number of messages this partition refers to */
  public  long count ()  { throw new RuntimeException(); }
}
