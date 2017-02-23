package org.apache.spark.sql.catalyst.planning;
/**
 * A pattern that collects the filter and inner joins.
 * <p>
 *          Filter
 *            |
 *        inner Join
 *          /    \            ---->      (Seq(plan0, plan1, plan2), conditions)
 *      Filter   plan2
 *        |
 *  inner join
 *      /    \
 *   plan0    plan1
 * <p>
 * Note: This pattern currently only works for left-deep trees.
 */
public  class ExtractFiltersAndInnerJoins {
  /**
   * Flatten all inner joins, which are next to each other.
   * Return a list of logical plans to be joined with a boolean for each plan indicating if it
   * was involved in an explicit cross join. Also returns the entire list of join conditions for
   * the left-deep tree.
   * @param plan (undocumented)
   * @param parentJoinType (undocumented)
   * @return (undocumented)
   */
  static public  scala.Tuple2<scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.InnerLike>>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> flattenJoin (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.catalyst.plans.InnerLike parentJoinType)  { throw new RuntimeException(); }
  static public  scala.Option<scala.Tuple2<scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.InnerLike>>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>>> unapply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitConjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitDisjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression replaceAlias (org.apache.spark.sql.catalyst.expressions.Expression condition, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Expression> aliases)  { throw new RuntimeException(); }
  static protected  boolean canEvaluate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
