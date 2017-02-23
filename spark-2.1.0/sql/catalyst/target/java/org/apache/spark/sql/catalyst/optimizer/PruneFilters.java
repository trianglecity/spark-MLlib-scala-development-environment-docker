package org.apache.spark.sql.catalyst.optimizer;
/**
 * Removes filters that can be evaluated trivially.  This can be done through the following ways:
 * 1) by eliding the filter for cases where it will always evaluate to <code>true</code>.
 * 2) by substituting a dummy empty relation when the filter will always evaluate to <code>false</code>.
 * 3) by eliminating the always-true conditions given the constraints on the child's output.
 */
public  class PruneFilters {
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
