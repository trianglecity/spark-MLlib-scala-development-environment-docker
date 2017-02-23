package org.apache.spark.sql.execution.datasources;
/**
 * A rule to do various checks before inserting into or writing to a data source table.
 */
public  class PreWriteCheck implements scala.Function1<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.runtime.BoxedUnit>, scala.Product, scala.Serializable {
  static public <A extends java.lang.Object> scala.Function1<A, R> compose (scala.Function1<A, T1> g)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.Function1<T1, A> andThen (scala.Function1<R, A> g)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog ()  { throw new RuntimeException(); }
  // not preceding
  public   PreWriteCheck (org.apache.spark.sql.internal.SQLConf conf, org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog)  { throw new RuntimeException(); }
  public  void failAnalysis (java.lang.String msg)  { throw new RuntimeException(); }
  public  void apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
