package org.apache.spark.sql.catalyst.optimizer;
/**
 * This rule rewrites predicate sub-queries into left semi/anti joins. The following predicates
 * are supported:
 * a. EXISTS/NOT EXISTS will be rewritten as semi/anti join, unresolved conditions in Filter
 *    will be pulled out as the join conditions.
 * b. IN/NOT IN will be rewritten as semi/anti join, unresolved conditions in the Filter will
 *    be pulled out as join conditions, value = selected column will also be used as join
 *    condition.
 */
public  class RewritePredicateSubquery$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RewritePredicateSubquery$ MODULE$ = null;
  public   RewritePredicateSubquery$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Given a predicate expression and an input plan, it rewrites
   * any embedded existential sub-query into an existential join.
   * It returns the rewritten expression together with the updated plan.
   * Currently, it does not support null-aware joins. Embedded NOT IN predicates
   * are blocked in the Analyzer.
   * @param exprs (undocumented)
   * @param plan (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<scala.Option<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> rewriteExistentialExpr (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
