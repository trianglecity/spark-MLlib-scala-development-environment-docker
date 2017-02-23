package org.apache.spark.sql.catalyst.optimizer;
/**
 * Reorder associative integral-type operators and fold all constants into one.
 */
public  class ReorderAssociativeOperator {
  static private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> flattenAdd (org.apache.spark.sql.catalyst.expressions.Expression expression, org.apache.spark.sql.catalyst.expressions.ExpressionSet groupSet)  { throw new RuntimeException(); }
  static private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> flattenMultiply (org.apache.spark.sql.catalyst.expressions.Expression expression, org.apache.spark.sql.catalyst.expressions.ExpressionSet groupSet)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.ExpressionSet collectGroupingExpressions (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
}
