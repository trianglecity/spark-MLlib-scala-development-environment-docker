package org.apache.spark.streaming.kafka010;
/**
 *  A DStream where
 * each given Kafka topic/partition corresponds to an RDD partition.
 * The spark configuration spark.streaming.kafka.maxRatePerPartition gives the maximum number
 *  of messages
 * per second that each '''partition''' will accept.
 * param:  locationStrategy In most cases, pass in {@link PreferConsistent},
 *   see {@link LocationStrategy} for more details.
 * param:  executorKafkaParams Kafka
 * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
 * configuration parameters</a>.
 *   Requires  "bootstrap.servers" to be set with Kafka broker(s),
 *   NOT zookeeper servers, specified in host1:port1,host2:port2 form.
 * param:  consumerStrategy In most cases, pass in {@link Subscribe},
 *   see {@link ConsumerStrategy} for more details
 * @tparam K type of Kafka message key
 * @tparam V type of Kafka message value
 */
  class DirectKafkaInputDStream<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.streaming.dstream.InputDStream<org.apache.kafka.clients.consumer.ConsumerRecord<K, V>> implements org.apache.spark.internal.Logging, org.apache.spark.streaming.kafka010.CanCommitOffsets {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   DirectKafkaInputDStream (org.apache.spark.streaming.StreamingContext _ssc, org.apache.spark.streaming.kafka010.LocationStrategy locationStrategy, org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> consumerStrategy, org.apache.spark.streaming.kafka010.PerPartitionConfig ppc)  { throw new RuntimeException(); }
  public  java.util.HashMap<java.lang.String, java.lang.Object> executorKafkaParams ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> currentOffsets ()  { throw new RuntimeException(); }
  private  org.apache.kafka.clients.consumer.Consumer<K, V> kc ()  { throw new RuntimeException(); }
  public  org.apache.kafka.clients.consumer.Consumer<K, V> consumer ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.DStream<org.apache.kafka.clients.consumer.ConsumerRecord<K, V>> persist (org.apache.spark.storage.StorageLevel newLevel)  { throw new RuntimeException(); }
  protected  java.util.HashMap<org.apache.kafka.common.TopicPartition, java.lang.String> getBrokers ()  { throw new RuntimeException(); }
  protected  java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.String> getPreferredHosts ()  { throw new RuntimeException(); }
    java.lang.String name ()  { throw new RuntimeException(); }
  protected  org.apache.spark.streaming.kafka010.DirectKafkaInputDStream<K, V>.DirectKafkaInputDStreamCheckpointData checkpointData ()  { throw new RuntimeException(); }
  /**
   * Asynchronously maintains &amp; sends new rate limits to the receiver through the receiver tracker.
   * @return (undocumented)
   */
  protected  scala.Option<org.apache.spark.streaming.scheduler.RateController> rateController ()  { throw new RuntimeException(); }
  protected  scala.Option<scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object>> maxMessagesPerPartition (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> offsets)  { throw new RuntimeException(); }
  /**
   * The concern here is that poll might consume messages despite being paused,
   * which would throw off consumer position.  Fix position if this happens.
   * @param c (undocumented)
   */
  private  void paranoidPoll (org.apache.kafka.clients.consumer.Consumer<K, V> c)  { throw new RuntimeException(); }
  /**
   * Returns the latest (highest) available offsets, taking new partitions into account.
   * @return (undocumented)
   */
  protected  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> latestOffsets ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> clamp (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> offsets)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.kafka010.KafkaRDD<K, V>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  protected  java.util.concurrent.ConcurrentLinkedQueue<org.apache.spark.streaming.kafka010.OffsetRange> commitQueue ()  { throw new RuntimeException(); }
  protected  java.util.concurrent.atomic.AtomicReference<org.apache.kafka.clients.consumer.OffsetCommitCallback> commitCallback ()  { throw new RuntimeException(); }
  /**
   * Queue up offset ranges for commit to Kafka at a future time.  Threadsafe.
   * @param offsetRanges The maximum untilOffset for a given partition will be used at commit.
   */
  public  void commitAsync (org.apache.spark.streaming.kafka010.OffsetRange[] offsetRanges)  { throw new RuntimeException(); }
  /**
   * Queue up offset ranges for commit to Kafka at a future time.  Threadsafe.
   * @param offsetRanges The maximum untilOffset for a given partition will be used at commit.
   * @param callback Only the most recently provided callback will be used at commit.
   */
  public  void commitAsync (org.apache.spark.streaming.kafka010.OffsetRange[] offsetRanges, org.apache.kafka.clients.consumer.OffsetCommitCallback callback)  { throw new RuntimeException(); }
  protected  void commitAll ()  { throw new RuntimeException(); }
    class DirectKafkaInputDStreamCheckpointData extends org.apache.spark.streaming.dstream.DStreamCheckpointData<org.apache.kafka.clients.consumer.ConsumerRecord<K, V>> {
    public   DirectKafkaInputDStreamCheckpointData ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, scala.Tuple4<java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object>[]> batchForTime ()  { throw new RuntimeException(); }
    public  void update (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
    public  void cleanup (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
    public  void restore ()  { throw new RuntimeException(); }
  }
  /**
   * A RateController to retrieve the rate from RateEstimator.
   */
    class DirectKafkaRateController extends org.apache.spark.streaming.scheduler.RateController {
    public   DirectKafkaRateController (int id, org.apache.spark.streaming.scheduler.rate.RateEstimator estimator)  { throw new RuntimeException(); }
    public  void publish (long rate)  { throw new RuntimeException(); }
  }
}
