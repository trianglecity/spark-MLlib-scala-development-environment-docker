package org.apache.spark.streaming.kafka010;
/**
 * :: Experimental ::
 * Choice of how to create and configure underlying Kafka Consumers on driver and executors.
 * See {@link ConsumerStrategies} to obtain instances.
 * Kafka 0.10 consumers can require additional, sometimes complex, setup after object
 *  instantiation. This interface encapsulates that process, and allows it to be checkpointed.
 * @tparam K type of Kafka message key
 * @tparam V type of Kafka message value
 */
public abstract class ConsumerStrategy<K extends java.lang.Object, V extends java.lang.Object> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ConsumerStrategy ()  { throw new RuntimeException(); }
  /**
   * Kafka <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
   * configuration parameters</a> to be used on executors. Requires "bootstrap.servers" to be set
   * with Kafka broker(s) specified in host1:port1,host2:port2 form.
   * @return (undocumented)
   */
  public abstract  java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams ()  ;
  /**
   * Must return a fully configured Kafka Consumer, including subscribed or assigned topics.
   * See <a href="http://kafka.apache.org/documentation.html#newconsumerapi">Kafka docs</a>.
   * This consumer will be used on the driver to query for offsets only, not messages.
   * The consumer must be returned in a state that it is safe to call poll(0) on.
   * @param currentOffsets A map from TopicPartition to offset, indicating how far the driver
   * has successfully read.  Will be empty on initial start, possibly non-empty on restart from
   * checkpoint.
   * @return (undocumented)
   */
  public abstract  org.apache.kafka.clients.consumer.Consumer<K, V> onStart (java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.Long> currentOffsets)  ;
}
