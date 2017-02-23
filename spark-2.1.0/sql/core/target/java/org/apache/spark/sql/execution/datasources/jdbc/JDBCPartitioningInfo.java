package org.apache.spark.sql.execution.datasources.jdbc;
/**
 * Instructions on how to partition the table among workers.
 */
  class JDBCPartitioningInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String column ()  { throw new RuntimeException(); }
  public  long lowerBound ()  { throw new RuntimeException(); }
  public  long upperBound ()  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  // not preceding
  public   JDBCPartitioningInfo (java.lang.String column, long lowerBound, long upperBound, int numPartitions)  { throw new RuntimeException(); }
}
