package org.apache.spark.sql.execution.datasources;
/**
 * A collection of file blocks that should be read as a single task
 * (possibly from multiple partitioned directories).
 */
public  class FilePartition implements org.apache.spark.Partition, scala.Product, scala.Serializable {
  static public  int hashCode ()  { throw new RuntimeException(); }
  static public  boolean equals (Object other)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.datasources.PartitionedFile> files ()  { throw new RuntimeException(); }
  // not preceding
  public   FilePartition (int index, scala.collection.Seq<org.apache.spark.sql.execution.datasources.PartitionedFile> files)  { throw new RuntimeException(); }
}
