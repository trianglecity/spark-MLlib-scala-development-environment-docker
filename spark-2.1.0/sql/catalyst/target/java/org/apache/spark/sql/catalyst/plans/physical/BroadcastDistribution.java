package org.apache.spark.sql.catalyst.plans.physical;
/**
 * Represents data where tuples are broadcasted to every node. It is quite common that the
 * entire set of tuples is transformed into different data structure.
 */
public  class BroadcastDistribution implements org.apache.spark.sql.catalyst.plans.physical.Distribution, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.BroadcastMode mode ()  { throw new RuntimeException(); }
  // not preceding
  public   BroadcastDistribution (org.apache.spark.sql.catalyst.plans.physical.BroadcastMode mode)  { throw new RuntimeException(); }
}
