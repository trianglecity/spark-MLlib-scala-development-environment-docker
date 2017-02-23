package org.apache.spark.streaming.kafka010;
public  class PreferFixed extends org.apache.spark.streaming.kafka010.LocationStrategy implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.String> hostMap ()  { throw new RuntimeException(); }
  // not preceding
  public   PreferFixed (java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.String> hostMap)  { throw new RuntimeException(); }
}
