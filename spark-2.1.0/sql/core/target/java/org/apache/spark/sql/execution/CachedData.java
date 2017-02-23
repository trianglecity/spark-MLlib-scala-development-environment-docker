package org.apache.spark.sql.execution;
/** Holds a cached logical plan and its data */
public  class CachedData implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.columnar.InMemoryRelation cachedRepresentation ()  { throw new RuntimeException(); }
  // not preceding
  public   CachedData (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.execution.columnar.InMemoryRelation cachedRepresentation)  { throw new RuntimeException(); }
}
