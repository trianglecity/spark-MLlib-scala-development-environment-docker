package org.apache.spark.sql.catalyst.expressions;
/**
 * An expression that gets replaced at runtime (currently by the optimizer) into a different
 * expression for evaluation. This is mainly used to provide compatibility with other databases.
 * For example, we use this to support "nvl" by replacing it with "coalesce".
 * <p>
 * A RuntimeReplaceable should have the original parameters along with a "child" expression in the
 * case class constructor, and define a normal constructor that accepts only the original
 * parameters. For an example, see {@link Nvl}. To make sure the explain plan and expression SQL
 * works correctly, the implementation should also override flatArguments method and sql method.
 */
public  interface RuntimeReplaceable extends org.apache.spark.sql.catalyst.expressions.Unevaluable {
  public  boolean nullable ()  ;
  public  boolean foldable ()  ;
  public  org.apache.spark.sql.types.DataType dataType ()  ;
}
