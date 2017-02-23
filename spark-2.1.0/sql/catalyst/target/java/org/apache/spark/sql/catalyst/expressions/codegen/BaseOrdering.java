package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * Inherits some default implementation for Java from <code>Ordering[Row]</code>
 */
public  class BaseOrdering implements scala.math.Ordering<org.apache.spark.sql.catalyst.InternalRow> {
  public   BaseOrdering ()  { throw new RuntimeException(); }
  public  int compare (org.apache.spark.sql.catalyst.InternalRow a, org.apache.spark.sql.catalyst.InternalRow b)  { throw new RuntimeException(); }
}
