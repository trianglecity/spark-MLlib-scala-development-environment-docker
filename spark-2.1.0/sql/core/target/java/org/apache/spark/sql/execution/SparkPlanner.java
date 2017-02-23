package org.apache.spark.sql.execution;
public  class SparkPlanner extends org.apache.spark.sql.execution.SparkStrategies {
  public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.SparkStrategy> extraStrategies ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkPlanner (org.apache.spark.SparkContext sparkContext, org.apache.spark.sql.internal.SQLConf conf, scala.collection.Seq<org.apache.spark.sql.execution.SparkStrategy> extraStrategies)  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.SparkStrategy> strategies ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.execution.SparkPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> collectPlaceholders (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  protected  scala.collection.Iterator<org.apache.spark.sql.execution.SparkPlan> prunePlans (scala.collection.Iterator<org.apache.spark.sql.execution.SparkPlan> plans)  { throw new RuntimeException(); }
  /**
   * Used to build table scan operators where complex projection and filtering are done using
   * separate physical operators.  This function returns the given scan operator with Project and
   * Filter nodes added only when needed.  For example, a Project operator is only used when the
   * final desired output requires complex expressions to be evaluated or when columns can be
   * further eliminated out after filtering has been done.
   * <p>
   * The <code>prunePushedDownFilters</code> parameter is used to remove those filters that can be optimized
   * away by the filter pushdown optimization.
   * <p>
   * The required attributes for both filtering and expression evaluation are passed to the
   * provided <code>scanBuilder</code> function so that it can avoid unnecessary column materialization.
   * @param projectList (undocumented)
   * @param filterPredicates (undocumented)
   * @param prunePushedDownFilters (undocumented)
   * @param scanBuilder (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.SparkPlan pruneFilterProject (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filterPredicates, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> prunePushedDownFilters, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, org.apache.spark.sql.execution.SparkPlan> scanBuilder)  { throw new RuntimeException(); }
}
