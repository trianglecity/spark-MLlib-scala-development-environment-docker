package org.apache.spark.streaming.kafka;
  class KafkaReceiver<K extends java.lang.Object, V extends java.lang.Object, U extends kafka.serializer.Decoder<?>, T extends kafka.serializer.Decoder<?>> extends org.apache.spark.streaming.receiver.Receiver<scala.Tuple2<K, V>> implements org.apache.spark.internal.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(ExistentialTypeTree(AppliedTypeTree(Select(Select(Ident(kafka), kafka.serializer), kafka.serializer.Decoder), List(TypeTree().setOriginal(Ident(TypeName("_$3"))))), List(TypeDef(Modifiers(DEFERRED | SYNTHETIC), TypeName("_$3"), List(), TypeBoundsTree(EmptyTree, EmptyTree)))))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(ExistentialTypeTree(AppliedTypeTree(Select(Select(Ident(kafka), kafka.serializer), kafka.serializer.Decoder), List(TypeTree().setOriginal(Ident(TypeName("_$4"))))), List(TypeDef(Modifiers(DEFERRED | SYNTHETIC), TypeName("_$4"), List(), TypeBoundsTree(EmptyTree, EmptyTree)))))))
  public   KafkaReceiver (scala.collection.Map<java.lang.String, java.lang.String> kafkaParams, scala.collection.Map<java.lang.String, java.lang.Object> topics, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<K> evidence$5, scala.reflect.ClassTag<V> evidence$6, scala.reflect.ClassTag<U> evidence$7, scala.reflect.ClassTag<T> evidence$8)  { throw new RuntimeException(); }
  public  kafka.consumer.ConsumerConnector consumerConnector ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  private  class MessageHandler implements java.lang.Runnable {
    public   MessageHandler (kafka.consumer.KafkaStream<K, V> stream)  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
  }
}
