package org.apache.spark.streaming.kafka010;
/**
 * Subscribe to a collection of topics.
 * param:  topics collection of topics to subscribe
 * param:  kafkaParams Kafka
 * <a href="http://kafka.apache.org/documentation.html#newconsumerconfigs">
 * configuration parameters</a> to be used on driver. The same params will be used on executors,
 * with minor automatic modifications applied.
 *  Requires "bootstrap.servers" to be set
 * with Kafka broker(s) specified in host1:port1,host2:port2 form.
 * param:  offsets: offsets to begin at on initial startup.  If no offset is given for a
 * TopicPartition, the committed offset (if applicable) or kafka param
 * auto.offset.reset will be used.
 */
public  class Subscribe<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.streaming.kafka010.ConsumerStrategy<K, V> implements org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
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
  public  java.util.Collection<java.lang.String> topics ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> kafkaParams ()  { throw new RuntimeException(); }
  public  java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.Long> offsets ()  { throw new RuntimeException(); }
  // not preceding
  public   Subscribe (java.util.Collection<java.lang.String> topics, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.Long> offsets)  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams ()  { throw new RuntimeException(); }
  public  org.apache.kafka.clients.consumer.Consumer<K, V> onStart (java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.Long> currentOffsets)  { throw new RuntimeException(); }
}
