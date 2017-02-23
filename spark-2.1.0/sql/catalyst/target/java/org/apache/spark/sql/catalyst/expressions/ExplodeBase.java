package org.apache.spark.sql.catalyst.expressions;
/**
 * A base class for Explode and PosExplode
 */
public abstract class ExplodeBase extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.Generator, org.apache.spark.sql.catalyst.expressions.codegen.CodegenFallback, scala.Serializable {
  public   ExplodeBase (org.apache.spark.sql.catalyst.expressions.Expression child, boolean position)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType elementSchema ()  { throw new RuntimeException(); }
  public  scala.collection.TraversableOnce<org.apache.spark.sql.catalyst.InternalRow> eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
}
