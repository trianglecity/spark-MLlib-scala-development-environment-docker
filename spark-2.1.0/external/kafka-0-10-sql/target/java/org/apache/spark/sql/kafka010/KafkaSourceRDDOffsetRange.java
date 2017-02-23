package org.apache.spark.sql.kafka010;
/** Offset range that one partition of the KafkaSourceRDD has to read */
  class KafkaSourceRDDOffsetRange implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
  public  long fromOffset ()  { throw new RuntimeException(); }
  public  long untilOffset ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> preferredLoc ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaSourceRDDOffsetRange (org.apache.kafka.common.TopicPartition topicPartition, long fromOffset, long untilOffset, scala.Option<java.lang.String> preferredLoc)  { throw new RuntimeException(); }
  public  java.lang.String topic ()  { throw new RuntimeException(); }
  public  int partition ()  { throw new RuntimeException(); }
  public  long size ()  { throw new RuntimeException(); }
}
