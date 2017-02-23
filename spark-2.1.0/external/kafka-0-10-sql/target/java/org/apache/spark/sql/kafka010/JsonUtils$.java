package org.apache.spark.sql.kafka010;
/**
 * Utilities for converting Kafka related objects to and from json.
 */
public  class JsonUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JsonUtils$ MODULE$ = null;
  public   JsonUtils$ ()  { throw new RuntimeException(); }
  private  java.lang.Object formats ()  { throw new RuntimeException(); }
  /**
   * Read TopicPartitions from json string
   * @param str (undocumented)
   * @return (undocumented)
   */
  public  org.apache.kafka.common.TopicPartition[] partitions (java.lang.String str)  { throw new RuntimeException(); }
  /**
   * Write TopicPartitions as json string
   * @param partitions (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String partitions (scala.collection.Iterable<org.apache.kafka.common.TopicPartition> partitions)  { throw new RuntimeException(); }
  /**
   * Read per-TopicPartition offsets from json string
   * @param str (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> partitionOffsets (java.lang.String str)  { throw new RuntimeException(); }
  /**
   * Write per-TopicPartition offsets as json string
   * @param partitionOffsets (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String partitionOffsets (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> partitionOffsets)  { throw new RuntimeException(); }
}
