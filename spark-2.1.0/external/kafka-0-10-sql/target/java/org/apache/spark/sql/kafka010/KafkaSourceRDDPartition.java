package org.apache.spark.sql.kafka010;
/** Partition of the KafkaSourceRDD */
  class KafkaSourceRDDPartition implements org.apache.spark.Partition, scala.Product, scala.Serializable {
  static public  int hashCode ()  { throw new RuntimeException(); }
  static public  boolean equals (Object other)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaSourceRDDOffsetRange offsetRange ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaSourceRDDPartition (int index, org.apache.spark.sql.kafka010.KafkaSourceRDDOffsetRange offsetRange)  { throw new RuntimeException(); }
}
