package org.apache.spark.sql.kafka010;
/**
 * An RDD that reads data from Kafka based on offset ranges across multiple partitions.
 * Additionally, it allows preferred locations to be set for each topic + partition, so that
 * the {@link KafkaSource} can ensure the same executor always reads the same topic + partition
 * and cached KafkaConsuemrs (see {@link CachedKafkaConsumer} can be used read data efficiently.
 * <p>
 * param:  sc the {@link SparkContext}
 * param:  executorKafkaParams Kafka configuration for creating KafkaConsumer on the executors
 * param:  offsetRanges Offset ranges that define the Kafka data belonging to this RDD
 */
  class KafkaSourceRDD extends org.apache.spark.rdd.RDD<org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>> {
  public   KafkaSourceRDD (org.apache.spark.SparkContext sc, java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams, scala.collection.Seq<org.apache.spark.sql.kafka010.KafkaSourceRDDOffsetRange> offsetRanges, long pollTimeoutMs, boolean failOnDataLoss)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaSourceRDD persist (org.apache.spark.storage.StorageLevel newLevel)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  long count ()  { throw new RuntimeException(); }
  public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> countApprox (long timeout, double confidence)  { throw new RuntimeException(); }
  public  boolean isEmpty ()  { throw new RuntimeException(); }
  public  org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>[] take (int num)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>> compute (org.apache.spark.Partition thePart, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
