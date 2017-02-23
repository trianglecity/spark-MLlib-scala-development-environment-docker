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
public  class ExtractPythonUDFs$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExtractPythonUDFs$ MODULE$ = null;
  public   ExtractPythonUDFs$ ()  { throw new RuntimeException(); }
  private  boolean hasPythonUDF (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  private  boolean canEvaluateInPython (org.apache.spark.sql.execution.python.PythonUDF e)  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.execution.python.PythonUDF> collectEvaluatableUDF (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  /**
   * Extract all the PythonUDFs from the current operator and evaluate them before the operator.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.execution.SparkPlan extract (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
