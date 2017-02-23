package org.apache.spark.sql.execution.command;
public  class PartitionStatistics implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int numFiles ()  { throw new RuntimeException(); }
  public  long totalSize ()  { throw new RuntimeException(); }
  // not preceding
  public   PartitionStatistics (int numFiles, long totalSize)  { throw new RuntimeException(); }
}
