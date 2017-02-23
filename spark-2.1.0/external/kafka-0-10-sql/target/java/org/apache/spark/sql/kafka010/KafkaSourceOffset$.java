package org.apache.spark.sql.kafka010;
/** Companion object of the {@link KafkaSourceOffset} */
public  class KafkaSourceOffset$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KafkaSourceOffset$ MODULE$ = null;
  public   KafkaSourceOffset$ ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> getPartitionOffsets (org.apache.spark.sql.execution.streaming.Offset offset)  { throw new RuntimeException(); }
  /**
   * Returns {@link KafkaSourceOffset} from a variable sequence of (topic, partitionId, offset)
   * tuples.
   * @param offsetTuples (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.kafka010.KafkaSourceOffset apply (scala.collection.Seq<scala.Tuple3<java.lang.String, java.lang.Object, java.lang.Object>> offsetTuples)  { throw new RuntimeException(); }
  /**
   * Returns {@link KafkaSourceOffset} from a JSON {@link SerializedOffset}
   * @param offset (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.kafka010.KafkaSourceOffset apply (org.apache.spark.sql.execution.streaming.SerializedOffset offset)  { throw new RuntimeException(); }
}
