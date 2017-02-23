package org.apache.spark.sql.catalyst.optimizer;
/**
 * Combines two adjacent {@link Project} operators into one and perform alias substitution,
 * merging the expressions into one single expression.
 */
public  class CollapseProject {
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Alias> collectAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList)  { throw new RuntimeException(); }
  static private  boolean haveCommonNonDeterministicOutput (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> upper, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> lower)  { throw new RuntimeException(); }
  static private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> buildCleanedProjectList (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> upper, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> lower)  { throw new RuntimeException(); }
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
