package org.apache.spark.streaming.kafka;
/**
 * Companion object the provides methods to create instances of {@link OffsetRange}.
 */
public  class OffsetRange$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OffsetRange$ MODULE$ = null;
  public   OffsetRange$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kafka.OffsetRange create (java.lang.String topic, int partition, long fromOffset, long untilOffset)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kafka.OffsetRange create (kafka.common.TopicAndPartition topicAndPartition, long fromOffset, long untilOffset)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kafka.OffsetRange apply (java.lang.String topic, int partition, long fromOffset, long untilOffset)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kafka.OffsetRange apply (kafka.common.TopicAndPartition topicAndPartition, long fromOffset, long untilOffset)  { throw new RuntimeException(); }
    org.apache.spark.streaming.kafka.OffsetRange apply (scala.Tuple4<java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object> t)  { throw new RuntimeException(); }
}
