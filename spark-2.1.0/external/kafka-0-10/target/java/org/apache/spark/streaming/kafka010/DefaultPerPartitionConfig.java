package org.apache.spark.streaming.kafka010;
/**
 * Default per-partition configuration
 */
public  class DefaultPerPartitionConfig extends org.apache.spark.streaming.kafka010.PerPartitionConfig {
  public   DefaultPerPartitionConfig (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  long maxRate ()  { throw new RuntimeException(); }
  public  long maxRatePerPartition (org.apache.kafka.common.TopicPartition topicPartition)  { throw new RuntimeException(); }
}
