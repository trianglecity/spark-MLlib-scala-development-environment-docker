package org.apache.spark.streaming.kafka010;
public  class CachedKafkaConsumer$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CachedKafkaConsumer$ MODULE$ = null;
  public   CachedKafkaConsumer$ ()  { throw new RuntimeException(); }
  private  java.util.LinkedHashMap<org.apache.spark.streaming.kafka010.CachedKafkaConsumer.CacheKey, org.apache.spark.streaming.kafka010.CachedKafkaConsumer<?, ?>> cache ()  { throw new RuntimeException(); }
  /** Must be called before get, once per JVM, to configure the cache. Further calls are ignored */
  public  void init (int initialCapacity, int maxCapacity, float loadFactor)  { throw new RuntimeException(); }
  /**
   * Get a cached consumer for groupId, assigned to topic and partition.
   * If matching consumer doesn't already exist, will be created using kafkaParams.
   * @param groupId (undocumented)
   * @param topic (undocumented)
   * @param partition (undocumented)
   * @param kafkaParams (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.kafka010.CachedKafkaConsumer<K, V> get (java.lang.String groupId, java.lang.String topic, int partition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  /**
   * Get a fresh new instance, unassociated with the global cache.
   * Caller is responsible for closing
   * @param groupId (undocumented)
   * @param topic (undocumented)
   * @param partition (undocumented)
   * @param kafkaParams (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.kafka010.CachedKafkaConsumer<K, V> getUncached (java.lang.String groupId, java.lang.String topic, int partition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  /** remove consumer for given groupId, topic, and partition, if it exists */
  public  void remove (java.lang.String groupId, java.lang.String topic, int partition)  { throw new RuntimeException(); }
}
