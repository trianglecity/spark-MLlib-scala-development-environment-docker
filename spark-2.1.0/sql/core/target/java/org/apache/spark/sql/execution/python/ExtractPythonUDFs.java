package org.apache.spark.sql.execution.python;
/**
 * Extracts PythonUDFs from operators, rewriting the query plan so that the UDF can be evaluated
 * alone in a batch.
 * <p>
 * Only extracts the PythonUDFs that could be evaluated in Python (the single child is PythonUDFs
 * or all the children could be evaluated in JVM).
 * <p>
 * This has the limitation that the input to the Python UDF is not allowed include attributes from
 * multiple child operators.
 */
public  class ExtractPythonUDFs {
  static private  boolean hasPythonUDF (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  static private  boolean canEvaluateInPython (org.apache.spark.sql.execution.python.PythonUDF e)  { throw new RuntimeException(); }
  static private  scala.collection.Seq<org.apache.spark.sql.execution.python.PythonUDF> collectEvaluatableUDF (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  /**
   * Extract all the PythonUDFs from the current operator and evaluate them before the operator.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.sql.execution.SparkPlan extract (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
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
