package org.apache.spark.examples.sql.streaming;
/**
 * Consumes messages from one or more topics in Kafka and does wordcount.
 * Usage: StructuredKafkaWordCount <bootstrap-servers> <subscribe-type> <topics>
 *   <bootstrap-servers> The Kafka "bootstrap.servers" configuration. A
 *   comma-separated list of host:port.
 *   <subscribe-type> There are three kinds of type, i.e. 'assign', 'subscribe',
 *   'subscribePattern'.
 *   |- <assign> Specific TopicPartitions to consume. Json string
 *   |  {"topicA":[0,1],"topicB":[2,4]}.
 *   |- <subscribe> The topic list to subscribe. A comma-separated list of
 *   |  topics.
 *   |- <subscribePattern> The pattern used to subscribe to topic(s).
 *   |  Java regex string.
 *   |- Only one of "assign, "subscribe" or "subscribePattern" options can be
 *   |  specified for Kafka source.
 *   <topics> Different value format depends on the value of 'subscribe-type'.
 * <p>
 * Example:
 *    <code>$ bin/run-example \
 *      sql.streaming.StructuredKafkaWordCount host1:port1,host2:port2 \
 *      subscribe topic1,topic2</code>
 */
public  class StructuredKafkaWordCount$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StructuredKafkaWordCount$ MODULE$ = null;
  public   StructuredKafkaWordCount$ ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
