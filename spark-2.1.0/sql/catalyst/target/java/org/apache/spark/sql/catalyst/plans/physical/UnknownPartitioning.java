package org.apache.spark.sql.catalyst.plans.physical;
public  class UnknownPartitioning implements org.apache.spark.sql.catalyst.plans.physical.Partitioning, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  // not preceding
  public   UnknownPartitioning (int numPartitions)  { throw new RuntimeException(); }
  public  boolean satisfies (org.apache.spark.sql.catalyst.plans.physical.Distribution required)  { throw new RuntimeException(); }
  public  boolean compatibleWith (org.apache.spark.sql.catalyst.plans.physical.Partitioning other)  { throw new RuntimeException(); }
  public  boolean guarantees (org.apache.spark.sql.catalyst.plans.physical.Partitioning other)  { throw new RuntimeException(); }
}
