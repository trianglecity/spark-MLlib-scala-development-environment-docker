package org.apache.spark.sql.catalyst.plans.logical;
public abstract class LogicalPlan extends org.apache.spark.sql.catalyst.plans.QueryPlan<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.internal.Logging {
  public   LogicalPlan ()  { throw new RuntimeException(); }
  private  boolean _analyzed ()  { throw new RuntimeException(); }
  /**
   * Marks this plan as already analyzed.  This should only be called by CheckAnalysis.
   */
    void setAnalyzed ()  { throw new RuntimeException(); }
  /**
   * Returns true if this node and its children have already been gone through analysis and
   * verification.  Note that this is only an optimization used to avoid analyzing trees that
   * have already been analyzed, and can be reset by transformations.
   * @return (undocumented)
   */
  public  boolean analyzed ()  { throw new RuntimeException(); }
  /** Returns true if this subtree contains any streaming data sources. */
  public  boolean isStreaming ()  { throw new RuntimeException(); }
  /**
   * Returns a copy of this node where <code>rule</code> has been recursively applied first to all of its
   * children and then itself (post-order). When <code>rule</code> does not apply to a given node, it is left
   * unchanged.  This function is similar to <code>transformUp</code>, but skips sub-trees that have already
   * been marked as analyzed.
   * <p>
   * @param rule the function use to transform this nodes children
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan resolveOperators (scala.PartialFunction<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> rule)  { throw new RuntimeException(); }
  /**
   * Recursively transforms the expressions of a tree, skipping nodes that have already
   * been analyzed.
   * @param r (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan resolveExpressions (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> r)  { throw new RuntimeException(); }
  /**
   * Computes {@link Statistics} for this plan. The default implementation assumes the output
   * cardinality is the product of all child plan's cardinality, i.e. applies in the case
   * of cartesian joins.
   * <p>
   * {@link LeafNode}s must override this.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics statistics ()  { throw new RuntimeException(); }
  /**
   * Returns the maximum number of rows that this plan may compute.
   * <p>
   * Any operator that a Limit can be pushed passed should override this function (e.g., Union).
   * Any operator that can push through a Limit should override this function (e.g., Project).
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Object> maxRows ()  { throw new RuntimeException(); }
  /**
   * Returns true if this expression and all its children have been resolved to a specific schema
   * and false if it still contains any unresolved placeholders. Implementations of LogicalPlan
   * can override this (e.g.
   * {@link org.apache.spark.sql.catalyst.analysis.UnresolvedRelation UnresolvedRelation}
   * should return <code>false</code>).
   * @return (undocumented)
   */
  public  boolean resolved ()  { throw new RuntimeException(); }
  protected  java.lang.String statePrefix ()  { throw new RuntimeException(); }
  /**
   * Returns true if all its children of this query plan have been resolved.
   * @return (undocumented)
   */
  public  boolean childrenResolved ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan canonicalized ()  { throw new RuntimeException(); }
  /**
   * Resolves a given schema to concrete {@link Attribute} references in this query plan. This function
   * should only be called on analyzed plans since it will throw {@link AnalysisException} for
   * unresolved {@link Attribute}s.
   * @param schema (undocumented)
   * @param resolver (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> resolve (org.apache.spark.sql.types.StructType schema, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver)  { throw new RuntimeException(); }
  /**
   * Optionally resolves the given strings to a {@link NamedExpression} using the input from all child
   * nodes of this LogicalPlan. The attribute is expressed as
   * as string in the following form: <code>[scope].AttributeName.[nested].[fields]...</code>.
   * @param nameParts (undocumented)
   * @param resolver (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.NamedExpression> resolveChildren (scala.collection.Seq<java.lang.String> nameParts, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver)  { throw new RuntimeException(); }
  /**
   * Optionally resolves the given strings to a {@link NamedExpression} based on the output of this
   * LogicalPlan. The attribute is expressed as string in the following form:
   * <code>[scope].AttributeName.[nested].[fields]...</code>.
   * @param nameParts (undocumented)
   * @param resolver (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.NamedExpression> resolve (scala.collection.Seq<java.lang.String> nameParts, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver)  { throw new RuntimeException(); }
  /**
   * Given an attribute name, split it to name parts by dot, but
   * don't split the name parts quoted by backticks, for example,
   * <code>ab.cd</code>.<code>efg</code> should be split into two parts "ab.cd" and "efg".
   * @param name (undocumented)
   * @param resolver (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.NamedExpression> resolveQuoted (java.lang.String name, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver)  { throw new RuntimeException(); }
  /**
   * Resolve the given <code>name</code> string against the given attribute, returning either 0 or 1 match.
   * <p>
   * This assumes <code>name</code> has multiple parts, where the 1st part is a qualifier
   * (i.e. table name, alias, or subquery alias).
   * See the comment above <code>candidates</code> variable in resolve() for semantics the returned data.
   * @param nameParts (undocumented)
   * @param resolver (undocumented)
   * @param attribute (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Attribute, scala.collection.immutable.List<java.lang.String>>> resolveAsTableColumn (scala.collection.Seq<java.lang.String> nameParts, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver, org.apache.spark.sql.catalyst.expressions.Attribute attribute)  { throw new RuntimeException(); }
  /**
   * Resolve the given <code>name</code> string against the given attribute, returning either 0 or 1 match.
   * <p>
   * Different from resolveAsTableColumn, this assumes <code>name</code> does NOT start with a qualifier.
   * See the comment above <code>candidates</code> variable in resolve() for semantics the returned data.
   * @param nameParts (undocumented)
   * @param resolver (undocumented)
   * @param attribute (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Attribute, scala.collection.immutable.List<java.lang.String>>> resolveAsColumn (scala.collection.Seq<java.lang.String> nameParts, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver, org.apache.spark.sql.catalyst.expressions.Attribute attribute)  { throw new RuntimeException(); }
  /** Performs attribute resolution given a name and a sequence of possible attributes. */
  protected  scala.Option<org.apache.spark.sql.catalyst.expressions.NamedExpression> resolve (scala.collection.Seq<java.lang.String> nameParts, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> input, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver)  { throw new RuntimeException(); }
  /**
   * Refreshes (or invalidates) any metadata/data cached in the plan recursively.
   */
  public  void refresh ()  { throw new RuntimeException(); }
}
