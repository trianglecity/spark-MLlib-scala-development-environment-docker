package org.apache.spark.sql.catalyst.plans.physical;
/**
 * Represents a partitioning where rows are collected, transformed and broadcasted to each
 * node in the cluster.
 */
public  class BroadcastPartitioning implements org.apache.spark.sql.catalyst.plans.physical.Partitioning, scala.Product, scala.Serializable {
  static public  boolean guarantees (org.apache.spark.sql.catalyst.plans.physical.Partitioning other)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.BroadcastMode mode ()  { throw new RuntimeException(); }
  // not preceding
  public   BroadcastPartitioning (org.apache.spark.sql.catalyst.plans.physical.BroadcastMode mode)  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  public  boolean satisfies (org.apache.spark.sql.catalyst.plans.physical.Distribution required)  { throw new RuntimeException(); }
  public  boolean compatibleWith (org.apache.spark.sql.catalyst.plans.physical.Partitioning other)  { throw new RuntimeException(); }
}
