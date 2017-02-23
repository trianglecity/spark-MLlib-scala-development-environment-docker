package org.apache.spark.streaming.kafka;
/**
 *  A stream of {@link KafkaRDD} where
 * each given Kafka topic/partition corresponds to an RDD partition.
 * The spark configuration spark.streaming.kafka.maxRatePerPartition gives the maximum number
 *  of messages
 * per second that each '''partition''' will accept.
 * Starting offsets are specified in advance,
 * and this DStream is not responsible for committing offsets,
 * so that you can control exactly-once semantics.
 * For an easy interface to Kafka-managed offsets,
 *  see {@link KafkaCluster}
 * param:  kafkaParams Kafka <a href="http://kafka.apache.org/documentation.html#configuration">
 * configuration parameters</a>.
 *   Requires "metadata.broker.list" or "bootstrap.servers" to be set with Kafka broker(s),
 *   NOT zookeeper servers, specified in host1:port1,host2:port2 form.
 * param:  fromOffsets per-topic/partition Kafka offsets defining the (inclusive)
 *  starting point of the stream
 * param:  messageHandler function for translating each message into the desired type
 */
  class DirectKafkaInputDStream<K extends java.lang.Object, V extends java.lang.Object, U extends kafka.serializer.Decoder<K>, T extends kafka.serializer.Decoder<V>, R extends java.lang.Object> extends org.apache.spark.streaming.dstream.InputDStream<R> implements org.apache.spark.internal.Logging {
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> kafkaParams ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<kafka.common.TopicAndPartition, java.lang.Object> fromOffsets ()  { throw new RuntimeException(); }
  // not preceding
  public   DirectKafkaInputDStream (org.apache.spark.streaming.StreamingContext _ssc, scala.collection.immutable.Map<java.lang.String, java.lang.String> kafkaParams, scala.collection.immutable.Map<kafka.common.TopicAndPartition, java.lang.Object> fromOffsets, scala.Function1<kafka.message.MessageAndMetadata<K, V>, R> messageHandler, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2, scala.reflect.ClassTag<U> evidence$3, scala.reflect.ClassTag<T> evidence$4, scala.reflect.ClassTag<R> evidence$5)  { throw new RuntimeException(); }
  public  int maxRetries ()  { throw new RuntimeException(); }
    java.lang.String name ()  { throw new RuntimeException(); }
  protected  org.apache.spark.streaming.kafka.DirectKafkaInputDStream<K, V, U, T, R>.DirectKafkaInputDStreamCheckpointData checkpointData ()  { throw new RuntimeException(); }
  /**
   * Asynchronously maintains &amp; sends new rate limits to the receiver through the receiver tracker.
   * @return (undocumented)
   */
  protected  scala.Option<org.apache.spark.streaming.scheduler.RateController> rateController ()  { throw new RuntimeException(); }
  protected  org.apache.spark.streaming.kafka.KafkaCluster kc ()  { throw new RuntimeException(); }
  private  long maxRateLimitPerPartition ()  { throw new RuntimeException(); }
  protected  scala.Option<scala.collection.immutable.Map<kafka.common.TopicAndPartition, java.lang.Object>> maxMessagesPerPartition (scala.collection.immutable.Map<kafka.common.TopicAndPartition, java.lang.Object> offsets)  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Map<kafka.common.TopicAndPartition, java.lang.Object> currentOffsets ()  { throw new RuntimeException(); }
  protected final  scala.collection.immutable.Map<kafka.common.TopicAndPartition, org.apache.spark.streaming.kafka.KafkaCluster.LeaderOffset> latestLeaderOffsets (int retries)  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Map<kafka.common.TopicAndPartition, org.apache.spark.streaming.kafka.KafkaCluster.LeaderOffset> clamp (scala.collection.immutable.Map<kafka.common.TopicAndPartition, org.apache.spark.streaming.kafka.KafkaCluster.LeaderOffset> leaderOffsets)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.kafka.KafkaRDD<K, V, U, T, R>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
    class DirectKafkaInputDStreamCheckpointData extends org.apache.spark.streaming.dstream.DStreamCheckpointData<R> {
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
