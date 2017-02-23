package org.apache.spark.streaming.kafka010;
/**
 * Consumer of single topicpartition, intended for cached reuse.
 * Underlying consumer is not threadsafe, so neither is this,
 * but processing the same topicpartition and group id in multiple threads is usually bad anyway.
 */
  class CachedKafkaConsumer<K extends java.lang.Object, V extends java.lang.Object> implements org.apache.spark.internal.Logging {
  static private  class CacheKey implements scala.Product, scala.Serializable {
    public  java.lang.String groupId ()  { throw new RuntimeException(); }
    public  java.lang.String topic ()  { throw new RuntimeException(); }
    public  int partition ()  { throw new RuntimeException(); }
    // not preceding
    public   CacheKey (java.lang.String groupId, java.lang.String topic, int partition)  { throw new RuntimeException(); }
  }
  static private  class CacheKey$ extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.String, java.lang.Object, org.apache.spark.streaming.kafka010.CachedKafkaConsumer.CacheKey> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CacheKey$ MODULE$ = null;
    public   CacheKey$ ()  { throw new RuntimeException(); }
  }
  static private  java.util.LinkedHashMap<org.apache.spark.streaming.kafka010.CachedKafkaConsumer.CacheKey, org.apache.spark.streaming.kafka010.CachedKafkaConsumer<?, ?>> cache ()  { throw new RuntimeException(); }
  /** Must be called before get, once per JVM, to configure the cache. Further calls are ignored */
  static public  void init (int initialCapacity, int maxCapacity, float loadFactor)  { throw new RuntimeException(); }
  /**
   * Get a fresh new instance, unassociated with the global cache.
   * Caller is responsible for closing
   * @param groupId (undocumented)
   * @param topic (undocumented)
   * @param partition (undocumented)
   * @param kafkaParams (undocumented)
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.kafka010.CachedKafkaConsumer<K, V> getUncached (java.lang.String groupId, java.lang.String topic, int partition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  /** remove consumer for given groupId, topic, and partition, if it exists */
  static public  void remove (java.lang.String groupId, java.lang.String topic, int partition)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  public  java.lang.String groupId ()  { throw new RuntimeException(); }
  public  java.lang.String topic ()  { throw new RuntimeException(); }
  public  int partition ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> kafkaParams ()  { throw new RuntimeException(); }
  // not preceding
  private   CachedKafkaConsumer (java.lang.String groupId, java.lang.String topic, int partition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
  protected  org.apache.kafka.clients.consumer.KafkaConsumer<K, V> consumer ()  { throw new RuntimeException(); }
  protected  java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<K, V>> buffer ()  { throw new RuntimeException(); }
  protected  long nextOffset ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  /**
   * Get the record for the given offset, waiting up to timeout ms if IO is necessary.
   * Sequential forward access will use buffers, but random access will be horribly inefficient.
   * @param offset (undocumented)
   * @param timeout (undocumented)
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<K, V> get (long offset, long timeout)  { throw new RuntimeException(); }
  private  void seek (long offset)  { throw new RuntimeException(); }
  private  void poll (long timeout)  { throw new RuntimeException(); }
}
