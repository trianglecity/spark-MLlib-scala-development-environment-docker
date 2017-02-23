package org.apache.spark.sql.catalyst.expressions.objects;
/**
 * Common base class for {@link StaticInvoke}, {@link Invoke}, and {@link NewInstance}.
 */
public  interface InvokeLike extends org.apache.spark.sql.catalyst.expressions.NonSQLExpression {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> arguments ()  ;
  public  boolean propagateNull ()  ;
  public  boolean needNullCheck ()  ;
  /**
   * Prepares codes for arguments.
   * <p>
   * - generate codes for argument.
   * - use ctx.splitExpressions() to not exceed 64kb JVM limit while preparing arguments.
   * - avoid some of nullabilty checking which are not needed because the expression is not
   *   nullable.
   * - when needNullCheck == true, short circuit if we found one of arguments is null because
   *   preparing rest of arguments can be skipped in the case.
   * <p>
   * @param ctx a {@link CodegenContext}
   * @return (code to prepare arguments, argument string, result of argument null check)
   */
  public  scala.Tuple3<java.lang.String, java.lang.String, java.lang.String> prepareArguments (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  ;
}
