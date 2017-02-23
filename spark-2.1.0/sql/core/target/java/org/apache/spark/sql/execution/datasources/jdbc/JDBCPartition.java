package org.apache.spark.sql.execution.datasources.jdbc;
/**
 * Data corresponding to one partition of a JDBCRDD.
 */
public  class JDBCPartition implements org.apache.spark.Partition, scala.Product, scala.Serializable {
  static public  int hashCode ()  { throw new RuntimeException(); }
  static public  boolean equals (Object other)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String whereClause ()  { throw new RuntimeException(); }
  public  int idx ()  { throw new RuntimeException(); }
  // not preceding
  public   JDBCPartition (java.lang.String whereClause, int idx)  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
}
