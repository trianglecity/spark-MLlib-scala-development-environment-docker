package org.apache.spark.sql.execution.python;
/**
 * Extracts all the Python UDFs in logical aggregate, which depends on aggregate expression or
 * grouping key, evaluate them after aggregate.
 */
public  class ExtractPythonUDFFromAggregate {
  /**
   * Returns whether the expression could only be evaluated within aggregate.
   * @param e (undocumented)
   * @param agg (undocumented)
   * @return (undocumented)
   */
  static private  boolean belongAggregate (org.apache.spark.sql.catalyst.expressions.Expression e, org.apache.spark.sql.catalyst.plans.logical.Aggregate agg)  { throw new RuntimeException(); }
  static private  boolean hasPythonUdfOverAggregate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.Aggregate agg)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan extract (org.apache.spark.sql.catalyst.plans.logical.Aggregate agg)  { throw new RuntimeException(); }
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
