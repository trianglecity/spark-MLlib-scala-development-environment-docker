package org.apache.spark.streaming.kafka010;
/**
 * :: Experimental ::
 * Interface for user-supplied configurations that can't otherwise be set via Spark properties,
 * because they need tweaking on a per-partition basis,
 */
public abstract class PerPartitionConfig implements scala.Serializable {
  public   PerPartitionConfig ()  { throw new RuntimeException(); }
  /**
   *  Maximum rate (number of records per second) at which data will be read
   *  from each Kafka partition.
   * @param topicPartition (undocumented)
   * @return (undocumented)
   */
  public abstract  long maxRatePerPartition (org.apache.kafka.common.TopicPartition topicPartition)  ;
}
