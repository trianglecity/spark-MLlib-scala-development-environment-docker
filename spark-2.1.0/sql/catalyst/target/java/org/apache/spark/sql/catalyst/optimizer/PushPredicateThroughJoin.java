package org.apache.spark.sql.catalyst.optimizer;
/**
 * Pushes down {@link Filter} operators where the <code>condition</code> can be
 * evaluated using only the attributes of the left or right side of a join.  Other
 * {@link Filter} conditions are moved into the <code>condition</code> of the {@link Join}.
 * <p>
 * And also pushes down the join filter, where the <code>condition</code> can be evaluated using only the
 * attributes of the left or right side of sub query when applicable.
 * <p>
 * Check https://cwiki.apache.org/confluence/display/Hive/OuterJoinBehavior for more details
 */
public  class PushPredicateThroughJoin {
  /**
   * Splits join condition expressions or filter predicates (on a given join's output) into three
   * categories based on the attributes required to evaluate them. Note that we explicitly exclude
   * on-deterministic (i.e., stateful) condition expressions in canEvaluateInLeft or
   * canEvaluateInRight to prevent pushing these predicates on either side of the join.
   * <p>
   * @return (canEvaluateInLeft, canEvaluateInRight, haveToEvaluateInBoth)
   * @param condition (undocumented)
   * @param left (undocumented)
   * @param right (undocumented)
   */
  static private  scala.Tuple3<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> split (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> condition, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
