package org.apache.spark.sql.kafka010;
/**
 * Consumer of single topicpartition, intended for cached reuse.
 * Underlying consumer is not threadsafe, so neither is this,
 * but processing the same topicpartition and group id in multiple threads is usually bad anyway.
 */
  class CachedKafkaConsumer implements org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  static private  class CacheKey implements scala.Product, scala.Serializable {
    public  java.lang.String groupId ()  { throw new RuntimeException(); }
    public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
    // not preceding
    public   CacheKey (java.lang.String groupId, org.apache.kafka.common.TopicPartition topicPartition)  { throw new RuntimeException(); }
  }
  static private  class CacheKey$ extends scala.runtime.AbstractFunction2<java.lang.String, org.apache.kafka.common.TopicPartition, org.apache.spark.sql.kafka010.CachedKafkaConsumer.CacheKey> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CacheKey$ MODULE$ = null;
    public   CacheKey$ ()  { throw new RuntimeException(); }
  }
  static private  long UNKNOWN_OFFSET ()  { throw new RuntimeException(); }
  static private  java.util.LinkedHashMap<org.apache.spark.sql.kafka010.CachedKafkaConsumer.CacheKey, org.apache.spark.sql.kafka010.CachedKafkaConsumer> cache ()  { throw new RuntimeException(); }
  /**
   * Get a cached consumer for groupId, assigned to topic and partition.
   * If matching consumer doesn't already exist, will be created using kafkaParams.
   * @param topic (undocumented)
   * @param partition (undocumented)
   * @param kafkaParams (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.kafka010.CachedKafkaConsumer getOrCreate (java.lang.String topic, int partition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
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
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> kafkaParams ()  { throw new RuntimeException(); }
  // not preceding
  private   CachedKafkaConsumer (org.apache.kafka.common.TopicPartition topicPartition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  private  java.lang.String groupId ()  { throw new RuntimeException(); }
  private  org.apache.kafka.clients.consumer.KafkaConsumer<byte[], byte[]> consumer ()  { throw new RuntimeException(); }
  /** Iterator to the already fetch data */
  private  java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>> fetchedData ()  { throw new RuntimeException(); }
  private  long nextOffsetInFetchedData ()  { throw new RuntimeException(); }
  /** Create a KafkaConsumer to fetch records for `topicPartition` */
  private  org.apache.kafka.clients.consumer.KafkaConsumer<byte[], byte[]> createConsumer ()  { throw new RuntimeException(); }
  /**
   * Get the record for the given offset if available. Otherwise it will either throw error
   * (if failOnDataLoss = true), or return the next available offset within [offset, untilOffset),
   * or null.
   * <p>
   * @param offset the offset to fetch.
   * @param untilOffset the max offset to fetch. Exclusive.
   * @param pollTimeoutMs timeout in milliseconds to poll data from Kafka.
   * @param failOnDataLoss When <code>failOnDataLoss</code> is <code>true</code>, this method will either return record at
   *                       offset if available, or throw exception.when <code>failOnDataLoss</code> is <code>false</code>,
   *                       this method will either return record at offset if available, or return
   *                       the next earliest available record less than untilOffset, or null. It
   *                       will not throw any exception.
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> get (long offset, long untilOffset, long pollTimeoutMs, boolean failOnDataLoss)  { throw new RuntimeException(); }
  /**
   * Return the next earliest available offset in [offset, untilOffset). If all offsets in
   * [offset, untilOffset) are invalid (e.g., the topic is deleted and recreated), it will return
   * <code>UNKNOWN_OFFSET</code>.
   * @param offset (undocumented)
   * @param untilOffset (undocumented)
   * @return (undocumented)
   */
  private  long getEarliestAvailableOffsetBetween (long offset, long untilOffset)  { throw new RuntimeException(); }
  /**
   * Get the record for the given offset if available. Otherwise it will either throw error
   * (if failOnDataLoss = true), or return the next available offset within [offset, untilOffset),
   * or null.
   * <p>
   * @throws OffsetOutOfRangeException if <code>offset</code> is out of range
   * @throws TimeoutException if cannot fetch the record in <code>pollTimeoutMs</code> milliseconds.
   * @param offset (undocumented)
   * @param untilOffset (undocumented)
   * @param pollTimeoutMs (undocumented)
   * @param failOnDataLoss (undocumented)
   * @return (undocumented)
   */
  private  org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> fetchData (long offset, long untilOffset, long pollTimeoutMs, boolean failOnDataLoss)  { throw new RuntimeException(); }
  /** Create a new consumer and reset cached states */
  private  void resetConsumer ()  { throw new RuntimeException(); }
  /** Reset the internal pre-fetched data. */
  private  void resetFetchedData ()  { throw new RuntimeException(); }
  /**
   * Return an addition message including useful message and instruction.
   * @param failOnDataLoss (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String additionalMessage (boolean failOnDataLoss)  { throw new RuntimeException(); }
  /**
   * Throw an exception or log a warning as per <code>failOnDataLoss</code>.
   * @param failOnDataLoss (undocumented)
   * @param message (undocumented)
   * @param cause (undocumented)
   */
  private  void reportDataLoss (boolean failOnDataLoss, java.lang.String message, java.lang.Throwable cause)  { throw new RuntimeException(); }
  private  void close ()  { throw new RuntimeException(); }
  private  void seek (long offset)  { throw new RuntimeException(); }
  private  void poll (long pollTimeoutMs)  { throw new RuntimeException(); }
  /**
   * Return the available offset range of the current partition. It's a pair of the earliest offset
   * and the latest offset.
   * @return (undocumented)
   */
  private  scala.Tuple2<java.lang.Object, java.lang.Object> getAvailableOffsetRange ()  { throw new RuntimeException(); }
}
