package org.apache.spark.sql.catalyst.plans.physical;
/**
 * Represents data where tuples that share the same values for the <code>clustering</code>
 * {@link Expression Expressions} will be co-located. Based on the context, this
 * can mean such tuples are either co-located in the same partition or they will be contiguous
 * within a single partition.
 */
public  class ClusteredDistribution implements org.apache.spark.sql.catalyst.plans.physical.Distribution, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> clustering ()  { throw new RuntimeException(); }
  // not preceding
  public   ClusteredDistribution (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> clustering)  { throw new RuntimeException(); }
}
