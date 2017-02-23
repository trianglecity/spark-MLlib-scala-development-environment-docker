package org.apache.spark.sql.catalyst.expressions;
/**
 * An expression that cannot be evaluated. Some expressions don't live past analysis or optimization
 * time (e.g. Star). This trait is used by those expressions.
 */
public  interface Unevaluable {
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  ;
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  ;
}
