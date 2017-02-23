package org.apache.spark.streaming.kafka010;
/**
 * A batch-oriented interface for consuming from Kafka.
 * Starting and ending offsets are specified in advance,
 * so that you can control exactly-once semantics.
 * param:  kafkaParams Kafka
 * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
 * configuration parameters</a>. Requires "bootstrap.servers" to be set
 * with Kafka broker(s) specified in host1:port1,host2:port2 form.
 * param:  offsetRanges offset ranges that define the Kafka data belonging to this RDD
 * param:  preferredHosts map from TopicPartition to preferred host for processing that partition.
 * In most cases, use {@link DirectKafkaInputDStream.preferConsistent}
 * Use {@link DirectKafkaInputDStream.preferBrokers} if your executors are on same nodes as brokers.
 * param:  useConsumerCache whether to use a consumer from a per-jvm cache
 * @tparam K type of Kafka message key
 * @tparam V type of Kafka message value
 */
  class KafkaRDD<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.rdd.RDD<org.apache.kafka.clients.consumer.ConsumerRecord<K, V>> implements org.apache.spark.internal.Logging, org.apache.spark.streaming.kafka010.HasOffsetRanges {
  public  java.util.Map<java.lang.String, java.lang.Object> kafkaParams ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kafka010.OffsetRange[] offsetRanges ()  { throw new RuntimeException(); }
  public  java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.String> preferredHosts ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaRDD (org.apache.spark.SparkContext sc, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, org.apache.spark.streaming.kafka010.OffsetRange[] offsetRanges, java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.String> preferredHosts, boolean useConsumerCache)  { throw new RuntimeException(); }
  private  long pollTimeout ()  { throw new RuntimeException(); }
  private  int cacheInitialCapacity ()  { throw new RuntimeException(); }
  private  int cacheMaxCapacity ()  { throw new RuntimeException(); }
  private  float cacheLoadFactor ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.kafka010.KafkaRDD<K, V> persist (org.apache.spark.storage.StorageLevel newLevel)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  long count ()  { throw new RuntimeException(); }
  public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> countApprox (long timeout, double confidence)  { throw new RuntimeException(); }
  public  boolean isEmpty ()  { throw new RuntimeException(); }
  public  org.apache.kafka.clients.consumer.ConsumerRecord<K, V>[] take (int num)  { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.ExecutorCacheTaskLocation[] executors ()  { throw new RuntimeException(); }
  protected  boolean compareExecutors (org.apache.spark.scheduler.ExecutorCacheTaskLocation a, org.apache.spark.scheduler.ExecutorCacheTaskLocation b)  { throw new RuntimeException(); }
  /**
   * Non-negative modulus, from java 8 math
   * @param a (undocumented)
   * @param b (undocumented)
   * @return (undocumented)
   */
  private  int floorMod (int a, int b)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition thePart)  { throw new RuntimeException(); }
  private  java.lang.String errBeginAfterEnd (org.apache.spark.streaming.kafka010.KafkaRDDPartition part)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<K, V>> compute (org.apache.spark.Partition thePart, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /**
   * An iterator that fetches messages directly from Kafka for the offsets in partition.
   * Uses a cached consumer where possible to take advantage of prefetching
   */
  private  class KafkaRDDIterator implements scala.collection.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<K, V>> {
    public   KafkaRDDIterator (org.apache.spark.streaming.kafka010.KafkaRDDPartition part, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
    public  java.lang.String groupId ()  { throw new RuntimeException(); }
    public  org.apache.spark.streaming.kafka010.CachedKafkaConsumer<K, V> consumer ()  { throw new RuntimeException(); }
    public  long requestOffset ()  { throw new RuntimeException(); }
    public  void closeIfNeeded ()  { throw new RuntimeException(); }
    public  boolean hasNext ()  { throw new RuntimeException(); }
    public  org.apache.kafka.clients.consumer.ConsumerRecord<K, V> next ()  { throw new RuntimeException(); }
  }
}
