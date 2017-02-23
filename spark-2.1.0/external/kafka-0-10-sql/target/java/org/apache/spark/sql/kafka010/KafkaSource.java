package org.apache.spark.sql.kafka010;
/**
 * A {@link Source} that uses Kafka's own {@link KafkaConsumer} API to reads data from Kafka. The design
 * for this source is as follows.
 * <p>
 * - The {@link KafkaSourceOffset} is the custom {@link Offset} defined for this source that contains
 *   a map of TopicPartition -> offset. Note that this offset is 1 + (available offset). For
 *   example if the last record in a Kafka topic "t", partition 2 is offset 5, then
 *   KafkaSourceOffset will contain TopicPartition("t", 2) -> 6. This is done keep it consistent
 *   with the semantics of <code>KafkaConsumer.position()</code>.
 * <p>
 * - The {@link ConsumerStrategy} class defines which Kafka topics and partitions should be read
 *   by this source. These strategies directly correspond to the different consumption options
 *   in . This class is designed to return a configured {@link KafkaConsumer} that is used by the
 *   {@link KafkaSource} to query for the offsets. See the docs on
 *   {@link org.apache.spark.sql.kafka010.KafkaSource.ConsumerStrategy} for more details.
 * <p>
 * - The {@link KafkaSource} written to do the following.
 * <p>
 *  - As soon as the source is created, the pre-configured KafkaConsumer returned by the
 *    {@link ConsumerStrategy} is used to query the initial offsets that this source should
 *    start reading from. This used to create the first batch.
 * <p>
 *   - <code>getOffset()</code> uses the KafkaConsumer to query the latest available offsets, which are
 *     returned as a {@link KafkaSourceOffset}.
 * <p>
 *   - <code>getBatch()</code> returns a DF that reads from the 'start offset' until the 'end offset' in
 *     for each partition. The end offset is excluded to be consistent with the semantics of
 *     {@link KafkaSourceOffset} and <code>KafkaConsumer.position()</code>.
 * <p>
 *   - The DF returned is based on {@link KafkaSourceRDD} which is constructed such that the
 *     data from Kafka topic + partition is consistently read by the same executors across
 *     batches, and cached KafkaConsumers in the executors can be reused efficiently. See the
 *     docs on {@link KafkaSourceRDD} for more details.
 * <p>
 * Zero data lost is not guaranteed when topics are deleted. If zero data lost is critical, the user
 * must make sure all messages in a topic have been processed when deleting a topic.
 * <p>
 * There is a known issue caused by KAFKA-1894: the query using KafkaSource maybe cannot be stopped.
 * To avoid this issue, you should make sure stopping the query before stopping the Kafka brokers
 * and not use wrong broker addresses.
 */
  class KafkaSource implements org.apache.spark.sql.execution.streaming.Source, org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  static public  class AssignStrategy implements org.apache.spark.sql.kafka010.KafkaSource.ConsumerStrategy, scala.Product, scala.Serializable {
    public  org.apache.kafka.common.TopicPartition[] partitions ()  { throw new RuntimeException(); }
    public  java.util.Map<java.lang.String, java.lang.Object> kafkaParams ()  { throw new RuntimeException(); }
    // not preceding
    public   AssignStrategy (org.apache.kafka.common.TopicPartition[] partitions, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
    public  org.apache.kafka.clients.consumer.Consumer<byte[], byte[]> createConsumer ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static public  class AssignStrategy$ extends scala.runtime.AbstractFunction2<org.apache.kafka.common.TopicPartition[], java.util.Map<java.lang.String, java.lang.Object>, org.apache.spark.sql.kafka010.KafkaSource.AssignStrategy> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AssignStrategy$ MODULE$ = null;
    public   AssignStrategy$ ()  { throw new RuntimeException(); }
  }
  static public  class SubscribeStrategy implements org.apache.spark.sql.kafka010.KafkaSource.ConsumerStrategy, scala.Product, scala.Serializable {
    public  scala.collection.Seq<java.lang.String> topics ()  { throw new RuntimeException(); }
    public  java.util.Map<java.lang.String, java.lang.Object> kafkaParams ()  { throw new RuntimeException(); }
    // not preceding
    public   SubscribeStrategy (scala.collection.Seq<java.lang.String> topics, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
    public  org.apache.kafka.clients.consumer.Consumer<byte[], byte[]> createConsumer ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static public  class SubscribeStrategy$ extends scala.runtime.AbstractFunction2<scala.collection.Seq<java.lang.String>, java.util.Map<java.lang.String, java.lang.Object>, org.apache.spark.sql.kafka010.KafkaSource.SubscribeStrategy> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SubscribeStrategy$ MODULE$ = null;
    public   SubscribeStrategy$ ()  { throw new RuntimeException(); }
  }
  static public  class SubscribePatternStrategy implements org.apache.spark.sql.kafka010.KafkaSource.ConsumerStrategy, scala.Product, scala.Serializable {
    public  java.lang.String topicPattern ()  { throw new RuntimeException(); }
    public  java.util.Map<java.lang.String, java.lang.Object> kafkaParams ()  { throw new RuntimeException(); }
    // not preceding
    public   SubscribePatternStrategy (java.lang.String topicPattern, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
    public  org.apache.kafka.clients.consumer.Consumer<byte[], byte[]> createConsumer ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static public  class SubscribePatternStrategy$ extends scala.runtime.AbstractFunction2<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>, org.apache.spark.sql.kafka010.KafkaSource.SubscribePatternStrategy> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SubscribePatternStrategy$ MODULE$ = null;
    public   SubscribePatternStrategy$ ()  { throw new RuntimeException(); }
  }
  static public  interface ConsumerStrategy {
    public  org.apache.kafka.clients.consumer.Consumer<byte[], byte[]> createConsumer ()  ;
  }
  static public  java.lang.String INSTRUCTION_FOR_FAIL_ON_DATA_LOSS_FALSE ()  { throw new RuntimeException(); }
  static public  java.lang.String INSTRUCTION_FOR_FAIL_ON_DATA_LOSS_TRUE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType kafkaSchema ()  { throw new RuntimeException(); }
  static private  java.lang.String[] getSortedExecutorList (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  static private  boolean compare (org.apache.spark.scheduler.ExecutorCacheTaskLocation a, org.apache.spark.scheduler.ExecutorCacheTaskLocation b)  { throw new RuntimeException(); }
  static private  int floorMod (long a, int b)  { throw new RuntimeException(); }
  static public  void commit (org.apache.spark.sql.execution.streaming.Offset end)  { throw new RuntimeException(); }
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
  public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaSource.ConsumerStrategy consumerStrategy ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> sourceOptions ()  { throw new RuntimeException(); }
  public  java.lang.String metadataPath ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.StartingOffsets startingOffsets ()  { throw new RuntimeException(); }
  public  boolean failOnDataLoss ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaSource (org.apache.spark.sql.SQLContext sqlContext, org.apache.spark.sql.kafka010.KafkaSource.ConsumerStrategy consumerStrategy, java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams, scala.collection.immutable.Map<java.lang.String, java.lang.String> sourceOptions, java.lang.String metadataPath, org.apache.spark.sql.kafka010.StartingOffsets startingOffsets, boolean failOnDataLoss)  { throw new RuntimeException(); }
  private  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  private  long pollTimeoutMs ()  { throw new RuntimeException(); }
  private  int maxOffsetFetchAttempts ()  { throw new RuntimeException(); }
  private  long offsetFetchAttemptIntervalMs ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> maxOffsetsPerTrigger ()  { throw new RuntimeException(); }
  /**
   * A KafkaConsumer used in the driver to query the latest Kafka offsets. This only queries the
   * offsets and never commits them.
   * @return (undocumented)
   */
  private  org.apache.kafka.clients.consumer.Consumer<byte[], byte[]> consumer ()  { throw new RuntimeException(); }
  /**
   * Lazily initialize <code>initialPartitionOffsets</code> to make sure that <code>KafkaConsumer.poll</code> is only
   * called in StreamExecutionThread. Otherwise, interrupting a thread while running
   * <code>KafkaConsumer.poll</code> may hang forever (KAFKA-1894).
   * @return (undocumented)
   */
  private  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> initialPartitionOffsets ()  { throw new RuntimeException(); }
  private  scala.Option<scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object>> currentPartitionOffsets ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  /** Returns the maximum available offset for this source. */
  public  scala.Option<org.apache.spark.sql.execution.streaming.Offset> getOffset ()  { throw new RuntimeException(); }
  /** Proportionally distribute limit number of offsets among topicpartitions */
  private  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> rateLimit (long limit, scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> from, scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> until)  { throw new RuntimeException(); }
  /**
   * Returns the data that is between the offsets
   * [<code>start.get.partitionToOffsets</code>, <code>end.partitionToOffsets</code>), i.e. end.partitionToOffsets is
   * exclusive.
   * @param start (undocumented)
   * @param end (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getBatch (scala.Option<org.apache.spark.sql.execution.streaming.Offset> start, org.apache.spark.sql.execution.streaming.Offset end)  { throw new RuntimeException(); }
  /** Stop this source and free any resources it has allocated. */
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Set consumer position to specified offsets, making sure all assignments are set.
   * @param partitionOffsets (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchSpecificStartingOffsets (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> partitionOffsets)  { throw new RuntimeException(); }
  /**
   * Fetch the earliest offsets of partitions.
   * @return (undocumented)
   */
  private  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchEarliestOffsets ()  { throw new RuntimeException(); }
  /**
   * Fetch the latest offset of partitions.
   * @return (undocumented)
   */
  private  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchLatestOffsets ()  { throw new RuntimeException(); }
  /**
   * Fetch the earliest offsets for newly discovered partitions. The return result may not contain
   * some partitions if they are deleted.
   * @param newPartitions (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchNewPartitionEarliestOffsets (scala.collection.Seq<org.apache.kafka.common.TopicPartition> newPartitions)  { throw new RuntimeException(); }
  /**
   * Helper function that does multiple retries on the a body of code that returns offsets.
   * Retries are needed to handle transient failures. For e.g. race conditions between getting
   * assignment and getting position while topics/partitions are deleted can cause NPEs.
   * <p>
   * This method also makes sure <code>body</code> won't be interrupted to workaround a potential issue in
   * <code>KafkaConsumer.poll</code>. (KAFKA-1894)
   * @param body (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> withRetriesWithoutInterrupt (scala.Function0<scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object>> body)  { throw new RuntimeException(); }
  /**
   * If <code>failOnDataLoss</code> is true, this method will throw an <code>IllegalStateException</code>.
   * Otherwise, just log a warning.
   * @param message (undocumented)
   */
  private  void reportDataLoss (java.lang.String message)  { throw new RuntimeException(); }
}
