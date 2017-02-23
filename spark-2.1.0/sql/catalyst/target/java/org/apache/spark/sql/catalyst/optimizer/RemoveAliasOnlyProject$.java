package org.apache.spark.sql.catalyst.optimizer;
/**
 * Removes the Project only conducting Alias of its child node.
 * It is created mainly for removing extra Project added in EliminateSerialization rule,
 * but can also benefit other operators.
 */
public  class RemoveAliasOnlyProject$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RemoveAliasOnlyProject$ MODULE$ = null;
  public   RemoveAliasOnlyProject$ ()  { throw new RuntimeException(); }
  /**
   * Returns true if the project list is semantically same as child output, after strip alias on
   * attribute.
   * @param projectList (undocumented)
   * @param childOutput (undocumented)
   * @return (undocumented)
   */
  private  boolean isAliasOnly (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> childOutput)  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> stripAliasOnAttribute (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
