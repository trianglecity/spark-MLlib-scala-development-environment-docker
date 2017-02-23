package org.apache.spark.sql.catalyst.parser;
/**
 * Interface for a parser.
 */
public  interface ParserInterface {
  /** Creates LogicalPlan for a given SQL string. */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan parsePlan (java.lang.String sqlText)  ;
  /** Creates Expression for a given SQL string. */
  public  org.apache.spark.sql.catalyst.expressions.Expression parseExpression (java.lang.String sqlText)  ;
  /** Creates TableIdentifier for a given SQL string. */
  public  org.apache.spark.sql.catalyst.TableIdentifier parseTableIdentifier (java.lang.String sqlText)  ;
}
