package org.apache.spark.streaming.kafka010;
/**
 *  :: Experimental ::
 * Represents any object that can commit a collection of {@link OffsetRange}s.
 * The direct Kafka DStream implements this interface (see
 * {@link KafkaUtils.createDirectStream}).
 * <pre><code>
 *   val stream = KafkaUtils.createDirectStream(...)
 *     ...
 *   stream.asInstanceOf[CanCommitOffsets].commitAsync(offsets, new OffsetCommitCallback() {
 *     def onComplete(m: java.util.Map[TopicPartition, OffsetAndMetadata], e: Exception) {
 *        if (null != e) {
 *           // error
 *        } else {
 *         // success
 *       }
 *     }
 *   })
 * </code></pre>
 */
public  interface CanCommitOffsets {
  /**
   *  :: Experimental ::
   * Queue up offset ranges for commit to Kafka at a future time.  Threadsafe.
   * This is only needed if you intend to store offsets in Kafka, instead of your own store.
   * @param offsetRanges The maximum untilOffset for a given partition will be used at commit.
   */
  public  void commitAsync (org.apache.spark.streaming.kafka010.OffsetRange[] offsetRanges)  ;
  /**
   *  :: Experimental ::
   * Queue up offset ranges for commit to Kafka at a future time.  Threadsafe.
   * This is only needed if you intend to store offsets in Kafka, instead of your own store.
   * @param offsetRanges The maximum untilOffset for a given partition will be used at commit.
   * @param callback Only the most recently provided callback will be used at commit.
   */
  public  void commitAsync (org.apache.spark.streaming.kafka010.OffsetRange[] offsetRanges, org.apache.kafka.clients.consumer.OffsetCommitCallback callback)  ;
}
