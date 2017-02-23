package org.apache.spark.sql.catalyst.planning;
/**
 * A pattern that matches any number of project or filter operations on top of another relational
 * operator.  All filter operators are collected and their conditions are broken up and returned
 * together with the top project operator.
 * {@link org.apache.spark.sql.catalyst.expressions.Alias Aliases} are in-lined/substituted if
 * necessary.
 */
public  class PhysicalOperation {
  static public  scala.Option<scala.Tuple3<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> unapply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Collects all deterministic projects and filters, in-lining/substituting aliases if necessary.
   * Here are two examples for alias in-lining/substitution.
   * Before:
   * <pre><code>
   *   SELECT c1 FROM (SELECT key AS c1 FROM t1) t2 WHERE c1 &gt; 10
   *   SELECT c1 AS c2 FROM (SELECT key AS c1 FROM t1) t2 WHERE c1 &gt; 10
   * </code></pre>
   * After:
   * <pre><code>
   *   SELECT key AS c1 FROM t1 WHERE key &gt; 10
   *   SELECT key AS c2 FROM t1 WHERE key &gt; 10
   * </code></pre>
   * @param plan (undocumented)
   * @return (undocumented)
   */
  static private  scala.Tuple4<scala.Option<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Attribute, org.apache.spark.sql.catalyst.expressions.Expression>> collectProjectsAndFilters (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static private  scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Attribute, org.apache.spark.sql.catalyst.expressions.Expression> collectAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> fields)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.Expression substitute (scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Attribute, org.apache.spark.sql.catalyst.expressions.Expression> aliases, org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitConjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitDisjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression replaceAlias (org.apache.spark.sql.catalyst.expressions.Expression condition, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Expression> aliases)  { throw new RuntimeException(); }
  static protected  boolean canEvaluate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
