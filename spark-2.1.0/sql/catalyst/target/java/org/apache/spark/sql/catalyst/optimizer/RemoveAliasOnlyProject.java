package org.apache.spark.sql.catalyst.optimizer;
/**
 * Removes the Project only conducting Alias of its child node.
 * It is created mainly for removing extra Project added in EliminateSerialization rule,
 * but can also benefit other operators.
 */
public  class RemoveAliasOnlyProject {
  /**
   * Returns true if the project list is semantically same as child output, after strip alias on
   * attribute.
   * @param projectList (undocumented)
   * @param childOutput (undocumented)
   * @return (undocumented)
   */
  static private  boolean isAliasOnly (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> childOutput)  { throw new RuntimeException(); }
  static private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> stripAliasOnAttribute (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList)  { throw new RuntimeException(); }
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
