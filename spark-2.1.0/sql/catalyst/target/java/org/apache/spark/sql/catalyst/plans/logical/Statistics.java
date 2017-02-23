package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Estimates of various statistics.  The default estimation logic simply lazily multiplies the
 * corresponding statistic produced by the children.  To override this behavior, override
 * <code>statistics</code> and assign it an overridden version of <code>Statistics</code>.
 * <p>
 * '''NOTE''': concrete and/or overridden versions of statistics fields should pay attention to the
 * performance of the implementations.  The reason is that estimations might get triggered in
 * performance-critical processes, such as query plan planning.
 * <p>
 * Note that we are using a BigInt here since it is easy to overflow a 64-bit integer in
 * cardinality estimation (e.g. cartesian joins).
 * <p>
 * param:  sizeInBytes Physical size in bytes. For leaf operators this defaults to 1, otherwise it
 *                    defaults to the product of children's <code>sizeInBytes</code>.
 * param:  rowCount Estimated number of rows.
 * param:  colStats Column-level statistics.
 * param:  isBroadcastable If true, output is small enough to be used in a broadcast join.
 */
public  class Statistics implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.math.BigInt sizeInBytes ()  { throw new RuntimeException(); }
  public  scala.Option<scala.math.BigInt> rowCount ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.catalyst.plans.logical.ColumnStat> colStats ()  { throw new RuntimeException(); }
  public  boolean isBroadcastable ()  { throw new RuntimeException(); }
  // not preceding
  public   Statistics (scala.math.BigInt sizeInBytes, scala.Option<scala.math.BigInt> rowCount, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.catalyst.plans.logical.ColumnStat> colStats, boolean isBroadcastable)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /** Readable string representation for the Statistics. */
  public  java.lang.String simpleString ()  { throw new RuntimeException(); }
}
