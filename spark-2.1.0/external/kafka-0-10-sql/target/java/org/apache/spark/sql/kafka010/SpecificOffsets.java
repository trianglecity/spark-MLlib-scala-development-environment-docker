package org.apache.spark.sql.kafka010;
  class SpecificOffsets implements org.apache.spark.sql.kafka010.StartingOffsets, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> partitionOffsets ()  { throw new RuntimeException(); }
  // not preceding
  public   SpecificOffsets (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> partitionOffsets)  { throw new RuntimeException(); }
}
