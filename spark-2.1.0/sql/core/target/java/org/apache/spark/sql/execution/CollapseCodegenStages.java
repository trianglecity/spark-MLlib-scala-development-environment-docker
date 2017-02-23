package org.apache.spark.sql.execution;
/**
 * Find the chained plans that support codegen, collapse them together as WholeStageCodegen.
 */
public  class CollapseCodegenStages extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
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
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   CollapseCodegenStages (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  private  boolean supportCodegen (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  private  int numOfNestedFields (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  private  boolean supportCodegen (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  /**
   * Inserts an InputAdapter on top of those that do not support codegen.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.execution.SparkPlan insertInputAdapter (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  /**
   * Inserts a WholeStageCodegen on top of those that support codegen.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.execution.SparkPlan insertWholeStageCodegen (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
