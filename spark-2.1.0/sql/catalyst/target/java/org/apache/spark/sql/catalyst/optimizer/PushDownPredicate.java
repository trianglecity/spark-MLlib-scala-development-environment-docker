package org.apache.spark.sql.catalyst.optimizer;
/**
 * Pushes {@link Filter} operators through many operators iff:
 * 1) the operator is deterministic
 * 2) the predicate is deterministic and the operator will not change any of rows.
 * <p>
 * This heuristic is valid assuming the expression evaluation cost is minimal.
 */
public  class PushDownPredicate {
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static private  boolean canPushThrough (org.apache.spark.sql.catalyst.plans.logical.UnaryNode p)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan pushDownPredicate (org.apache.spark.sql.catalyst.plans.logical.Filter filter, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan grandchild, scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> insertFilter)  { throw new RuntimeException(); }
  /**
   * Check if we can safely push a filter through a projection, by making sure that predicate
   * subqueries in the condition do not contain the same attributes as the plan they are moved
   * into. This can happen when the plan and predicate subquery have the same source.
   * @param plan (undocumented)
   * @param condition (undocumented)
   * @return (undocumented)
   */
  static private  boolean canPushThroughCondition (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static public  java.lang.String ruleName ()  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitConjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitDisjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression replaceAlias (org.apache.spark.sql.catalyst.expressions.Expression condition, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Expression> aliases)  { throw new RuntimeException(); }
  static protected  boolean canEvaluate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
