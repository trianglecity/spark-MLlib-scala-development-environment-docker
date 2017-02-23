package org.apache.spark.streaming.kafka;
/**
 * Input stream that pulls messages from a Kafka Broker.
 * <p>
 * param:  kafkaParams Map of kafka configuration parameters.
 *                    See: http://kafka.apache.org/configuration.html
 * param:  topics Map of (topic_name to numPartitions) to consume. Each partition is consumed
 * in its own thread.
 * param:  storageLevel RDD storage level.
 */
  class KafkaInputDStream<K extends java.lang.Object, V extends java.lang.Object, U extends kafka.serializer.Decoder<?>, T extends kafka.serializer.Decoder<?>> extends org.apache.spark.streaming.dstream.ReceiverInputDStream<scala.Tuple2<K, V>> implements org.apache.spark.internal.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(ExistentialTypeTree(AppliedTypeTree(Select(Select(Ident(kafka), kafka.serializer), kafka.serializer.Decoder), List(TypeTree().setOriginal(Ident(TypeName("_$1"))))), List(TypeDef(Modifiers(DEFERRED | SYNTHETIC), TypeName("_$1"), List(), TypeBoundsTree(EmptyTree, EmptyTree)))))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(ExistentialTypeTree(AppliedTypeTree(Select(Select(Ident(kafka), kafka.serializer), kafka.serializer.Decoder), List(TypeTree().setOriginal(Ident(TypeName("_$2"))))), List(TypeDef(Modifiers(DEFERRED | SYNTHETIC), TypeName("_$2"), List(), TypeBoundsTree(EmptyTree, EmptyTree)))))))
  public   KafkaInputDStream (org.apache.spark.streaming.StreamingContext _ssc, scala.collection.Map<java.lang.String, java.lang.String> kafkaParams, scala.collection.Map<java.lang.String, java.lang.Object> topics, boolean useReliableReceiver, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2, scala.reflect.ClassTag<U> evidence$3, scala.reflect.ClassTag<T> evidence$4)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.receiver.Receiver<scala.Tuple2<K, V>> getReceiver ()  { throw new RuntimeException(); }
}
