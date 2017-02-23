package org.apache.spark.sql.catalyst.optimizer;
/**
 * Combines two adjacent {@link Project} operators into one and perform alias substitution,
 * merging the expressions into one single expression.
 */
public  class CollapseProject$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CollapseProject$ MODULE$ = null;
  public   CollapseProject$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> collectAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList)  { throw new RuntimeException(); }
  private  boolean haveCommonNonDeterministicOutput (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> upper, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> lower)  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> buildCleanedProjectList (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> upper, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> lower)  { throw new RuntimeException(); }
}
