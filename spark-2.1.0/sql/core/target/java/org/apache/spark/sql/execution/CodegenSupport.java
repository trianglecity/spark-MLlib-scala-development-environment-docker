package org.apache.spark.sql.execution;
/**
 * An interface for those physical operators that support codegen.
 */
public  interface CodegenSupport {
  /** Prefix used in the current operator's variable names. */
  public  java.lang.String variablePrefix ()  ;
  /**
   * Creates a metric using the specified name.
   * <p>
   * @return name of the variable representing the metric
   * @param ctx (undocumented)
   * @param name (undocumented)
   */
  public  java.lang.String metricTerm (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String name)  ;
  /**
   * Whether this SparkPlan support whole stage codegen or not.
   * @return (undocumented)
   */
  public  boolean supportCodegen ()  ;
  /**
   * Which SparkPlan is calling produce() of this one. It's itself for the first SparkPlan.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.CodegenSupport parent ()  ;
  /**
   * Returns all the RDDs of InternalRow which generates the input rows.
   * <p>
   * Note: right now we support up to two RDDs.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow>> inputRDDs ()  ;
  /**
   * Returns Java source code to process the rows from input RDD.
   * @param ctx (undocumented)
   * @param parent (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String produce (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.execution.CodegenSupport parent)  ;
  /**
   * Generate the Java source code to process, should be overridden by subclass to support codegen.
   * <p>
   * doProduce() usually generate the framework, for example, aggregation could generate this:
   * <p>
   *   if (!initialized) {
   *     # create a hash map, then build the aggregation hash map
   *     # call child.produce()
   *     initialized = true;
   *   }
   *   while (hashmap.hasNext()) {
   *     row = hashmap.next();
   *     # build the aggregation results
   *     # create variables for results
   *     # call consume(), which will call parent.doConsume()
   *      if (shouldStop()) return;
   *   }
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String doProduce (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  ;
  /**
   * Consume the generated columns or row from current SparkPlan, call its parent's <code>doConsume()</code>.
   * @param ctx (undocumented)
   * @param outputVars (undocumented)
   * @param row (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String consume (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> outputVars, java.lang.String row)  ;
  /**
   * Returns source code to evaluate all the variables, and clear the code of them, to prevent
   * them to be evaluated twice.
   * @param variables (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String evaluateVariables (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> variables)  ;
  /**
   * Returns source code to evaluate the variables for required attributes, and clear the code
   * of evaluated variables, to prevent them to be evaluated twice.
   * @param attributes (undocumented)
   * @param variables (undocumented)
   * @param required (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String evaluateRequiredVariables (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> attributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> variables, org.apache.spark.sql.catalyst.expressions.AttributeSet required)  ;
  /**
   * The subset of inputSet those should be evaluated before this plan.
   * <p>
   * We will use this to insert some code to access those columns that are actually used by current
   * plan before calling doConsume().
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet usedInputs ()  ;
  /**
   * Generate the Java source code to process the rows from child SparkPlan.
   * <p>
   * This should be override by subclass to support codegen.
   * <p>
   * For example, Filter will generate the code like this:
   * <p>
   *   # code to evaluate the predicate expression, result is isNull1 and value2
   *   if (isNull1 || !value2) continue;
   *   # call consume(), which will call parent.doConsume()
   * <p>
   * Note: A plan can either consume the rows as UnsafeRow (row), or a list of variables (input).
   * @param ctx (undocumented)
   * @param input (undocumented)
   * @param row (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String doConsume (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> input, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode row)  ;
}
