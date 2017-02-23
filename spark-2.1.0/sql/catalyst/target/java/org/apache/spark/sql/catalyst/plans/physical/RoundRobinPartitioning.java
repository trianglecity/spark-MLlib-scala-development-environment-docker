package org.apache.spark.sql.catalyst.plans.physical;
/**
 * Represents a partitioning where rows are distributed evenly across output partitions
 * by starting from a random target partition number and distributing rows in a round-robin
 * fashion. This partitioning is used when implementing the DataFrame.repartition() operator.
 */
public  class RoundRobinPartitioning implements org.apache.spark.sql.catalyst.plans.physical.Partitioning, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  // not preceding
  public   RoundRobinPartitioning (int numPartitions)  { throw new RuntimeException(); }
  public  boolean satisfies (org.apache.spark.sql.catalyst.plans.physical.Distribution required)  { throw new RuntimeException(); }
  public  boolean compatibleWith (org.apache.spark.sql.catalyst.plans.physical.Partitioning other)  { throw new RuntimeException(); }
  public  boolean guarantees (org.apache.spark.sql.catalyst.plans.physical.Partitioning other)  { throw new RuntimeException(); }
}
