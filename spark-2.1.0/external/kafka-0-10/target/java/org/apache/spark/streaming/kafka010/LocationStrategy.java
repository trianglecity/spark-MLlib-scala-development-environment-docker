package org.apache.spark.streaming.kafka010;
/**
 *  :: Experimental ::
 * Choice of how to schedule consumers for a given TopicPartition on an executor.
 * See {@link LocationStrategies} to obtain instances.
 * Kafka 0.10 consumers prefetch messages, so it's important for performance
 * to keep cached consumers on appropriate executors, not recreate them for every partition.
 * Choice of location is only a preference, not an absolute; partitions may be scheduled elsewhere.
 */
public abstract class LocationStrategy {
  public   LocationStrategy ()  { throw new RuntimeException(); }
}
