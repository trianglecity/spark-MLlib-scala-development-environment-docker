package org.apache.spark.sql.execution;
/**
 * The base class for subquery that is used in SparkPlan.
 */
public abstract class ExecSubqueryExpression extends org.apache.spark.sql.catalyst.expressions.PlanExpression<org.apache.spark.sql.execution.SubqueryExec> {
  public   ExecSubqueryExpression ()  { throw new RuntimeException(); }
  /**
   * Fill the expression with collected result from executed plan.
   */
  public abstract  void updateResult ()  ;
}
