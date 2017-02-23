package org.apache.spark.sql.execution.datasources;
public  class PartitionSpec implements scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.execution.datasources.PartitionSpec emptySpec ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType partitionColumns ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.datasources.PartitionPath> partitions ()  { throw new RuntimeException(); }
  // not preceding
  public   PartitionSpec (org.apache.spark.sql.types.StructType partitionColumns, scala.collection.Seq<org.apache.spark.sql.execution.datasources.PartitionPath> partitions)  { throw new RuntimeException(); }
}
