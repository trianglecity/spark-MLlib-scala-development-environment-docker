package org.apache.spark.sql.catalyst.analysis;
/**
 * Provides a logical query plan analyzer, which translates {@link UnresolvedAttribute}s and
 * {@link UnresolvedRelation}s into fully typed objects using information in a
 * {@link SessionCatalog} and a {@link FunctionRegistry}.
 */
public  class Analyzer extends org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.CheckAnalysis {
  public   Analyzer (org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog, org.apache.spark.sql.catalyst.CatalystConf conf, int maxIterations)  { throw new RuntimeException(); }
  public   Analyzer (org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog, org.apache.spark.sql.catalyst.CatalystConf conf)  { throw new RuntimeException(); }
  public  scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.FixedPoint fixedPoint ()  { throw new RuntimeException(); }
  /**
   * Override to provide additional rules for the "Resolution" batch.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> extendedResolutionRules ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.Batch> batches ()  { throw new RuntimeException(); }
  /**
   * Analyze cte definitions and substitute child plan with analyzed cte definitions.
   */
  public  class CTESubstitution extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   CTESubstitution ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan substituteCTE (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> cteRelations)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.CTESubstitution$ CTESubstitution ()  { throw new RuntimeException(); }
  /**
   * Substitute child plan with WindowSpecDefinitions.
   */
  public  class WindowsSubstitution extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   WindowsSubstitution ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.WindowsSubstitution$ WindowsSubstitution ()  { throw new RuntimeException(); }
  /**
   * Replaces {@link UnresolvedAlias}s with concrete aliases.
   */
  public  class ResolveAliases extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveAliases ()  { throw new RuntimeException(); }
    private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> assignAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> exprs)  { throw new RuntimeException(); }
    private  boolean hasUnresolvedAlias (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> exprs)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveAliases$ ResolveAliases ()  { throw new RuntimeException(); }
  public  class ResolveGroupingAnalytics extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveGroupingAnalytics ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.Object> bitmasks (org.apache.spark.sql.catalyst.expressions.Rollup r)  { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.Object> bitmasks (org.apache.spark.sql.catalyst.expressions.Cube c)  { throw new RuntimeException(); }
    private  boolean hasGroupingAttribute (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
      boolean hasGroupingFunction (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.Expression replaceGroupingFunc (org.apache.spark.sql.catalyst.expressions.Expression expr, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupByExprs, org.apache.spark.sql.catalyst.expressions.Expression gid)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> findGroupingExprs (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveGroupingAnalytics$ ResolveGroupingAnalytics ()  { throw new RuntimeException(); }
  public  class ResolvePivot extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolvePivot ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolvePivot$ ResolvePivot ()  { throw new RuntimeException(); }
  /**
   * Replaces {@link UnresolvedRelation}s with concrete relations from the catalog.
   */
  public  class ResolveRelations extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveRelations ()  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan lookupTableFromCatalog (org.apache.spark.sql.catalyst.analysis.UnresolvedRelation u)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveRelations$ ResolveRelations ()  { throw new RuntimeException(); }
  /**
   * Replaces {@link UnresolvedAttribute}s with concrete {@link AttributeReference}s from
   * a logical plan node's children.
   */
  public  class ResolveReferences extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveReferences ()  { throw new RuntimeException(); }
    /**
     * Generate a new logical plan for the right child with different expression IDs
     * for all conflicting attributes.
     * @param left (undocumented)
     * @param right (undocumented)
     * @return (undocumented)
     */
    private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan dedupRight (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> newAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> expressions)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.AttributeSet findAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList)  { throw new RuntimeException(); }
    /**
     * Build a project list for Project/Aggregate and expand the star if possible
     * @param exprs (undocumented)
     * @param child (undocumented)
     * @return (undocumented)
     */
    private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> buildExpandedProjectList (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> exprs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
    /**
     * Returns true if <code>exprs</code> contains a {@link Star}.
     * @param exprs (undocumented)
     * @return (undocumented)
     */
    public  boolean containsStar (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
    /**
     * Expands the matching attribute.*'s in <code>child</code>'s output.
     * @param expr (undocumented)
     * @param child (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.catalyst.expressions.Expression expandStarExpression (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveReferences$ ResolveReferences ()  { throw new RuntimeException(); }
  private  boolean containsDeserializer (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression resolveExpression (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, boolean throws_)  { throw new RuntimeException(); }
  /**
   * In many dialects of SQL it is valid to use ordinal positions in order/sort by and group by
   * clauses. This rule is to convert ordinal positions to the corresponding expressions in the
   * select list. This support is introduced in Spark 2.0.
   * <p>
   * - When the sort references or group by expressions are not integer but foldable expressions,
   * just ignore them.
   * - When spark.sql.orderByOrdinal/spark.sql.groupByOrdinal is set to false, ignore the position
   * numbers too.
   * <p>
   * Before the release of Spark 2.0, the literals in order/sort by and group by clauses
   * have no effect on the results.
   */
  public  class ResolveOrdinalInOrderByAndGroupBy extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveOrdinalInOrderByAndGroupBy ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveOrdinalInOrderByAndGroupBy$ ResolveOrdinalInOrderByAndGroupBy ()  { throw new RuntimeException(); }
  /**
   * In many dialects of SQL it is valid to sort by attributes that are not present in the SELECT
   * clause.  This rule detects such queries and adds the required attributes to the original
   * projection, so that they will be available during sorting. Another projection is added to
   * remove these attributes after sorting.
   * <p>
   * The HAVING clause could also used a grouping columns that is not presented in the SELECT.
   */
  public  class ResolveMissingReferences extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveMissingReferences ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    /**
     * Add the missing attributes into projectList of Project/Window or aggregateExpressions of
     * Aggregate.
     * @param plan (undocumented)
     * @param missingAttrs (undocumented)
     * @return (undocumented)
     */
    private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan addMissingAttr (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.catalyst.expressions.AttributeSet missingAttrs)  { throw new RuntimeException(); }
    /**
     * Resolve the expression on a specified logical plan and it's child (recursively), until
     * the expression is resolved or meet a non-unary node or Subquery.
     * @param expr (undocumented)
     * @param plan (undocumented)
     * @return (undocumented)
     */
    private  org.apache.spark.sql.catalyst.expressions.Expression resolveExpressionRecursively (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveMissingReferences$ ResolveMissingReferences ()  { throw new RuntimeException(); }
  /**
   * Replaces {@link UnresolvedFunction}s with concrete {@link Expression}s.
   */
  public  class ResolveFunctions extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveFunctions ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveFunctions$ ResolveFunctions ()  { throw new RuntimeException(); }
  /**
   * This rule resolves and rewrites subqueries inside expressions.
   * <p>
   * Note: CTEs are handled in CTESubstitution.
   */
  public  class ResolveSubquery extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
    public   ResolveSubquery ()  { throw new RuntimeException(); }
    /**
     * Resolve the correlated expressions in a subquery by using the an outer plans' references. All
     * resolved outer references are wrapped in an {@link OuterReference}
     * @param plan (undocumented)
     * @param outer (undocumented)
     * @return (undocumented)
     */
    private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan resolveOuterReferences (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan outer)  { throw new RuntimeException(); }
    /**
     * Pull out all (outer) correlated predicates from a given subquery. This method removes the
     * correlated predicates from subquery {@link Filter}s and adds the references of these predicates
     * to all intermediate {@link Project} and {@link Aggregate} clauses (if they are missing) in order to
     * be able to evaluate the predicates at the top level.
     * <p>
     * This method returns the rewritten subquery and correlated predicates.
     * @param sub (undocumented)
     * @return (undocumented)
     */
    private  scala.Tuple2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> pullOutCorrelatedPredicates (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan sub)  { throw new RuntimeException(); }
    /**
     * Rewrite the subquery in a safe way by preventing that the subquery and the outer use the same
     * attributes.
     * @param sub (undocumented)
     * @param outer (undocumented)
     * @return (undocumented)
     */
    private  scala.Tuple2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> rewriteSubQuery (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan sub, scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> outer)  { throw new RuntimeException(); }
    /**
     * Resolve and rewrite a subquery. The subquery is resolved using its outer plans. This method
     * will resolve the subquery by alternating between the regular analyzer and by applying the
     * resolveOuterReferences rule.
     * <p>
     * All correlated conditions are pulled out of the subquery as soon as the subquery is resolved.
     * @param e (undocumented)
     * @param plans (undocumented)
     * @param requiredColumns (undocumented)
     * @param f (undocumented)
     * @return (undocumented)
     */
    private  org.apache.spark.sql.catalyst.expressions.SubqueryExpression resolveSubQuery (org.apache.spark.sql.catalyst.expressions.SubqueryExpression e, scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> plans, int requiredColumns, scala.Function2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.SubqueryExpression> f)  { throw new RuntimeException(); }
    /**
     * Resolve and rewrite all subqueries in a LogicalPlan. This method transforms IN and EXISTS
     * expressions into PredicateSubquery expression once the are resolved.
     * @param plan (undocumented)
     * @param plans (undocumented)
     * @return (undocumented)
     */
    private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan resolveSubQueries (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> plans)  { throw new RuntimeException(); }
    /**
     * Resolve and rewrite all subqueries in an operator tree..
     * @param plan (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveSubquery$ ResolveSubquery ()  { throw new RuntimeException(); }
  /**
   * Turns projections that contain aggregate expressions into aggregations.
   */
  public  class GlobalAggregates extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   GlobalAggregates ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  boolean containsAggregates (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.GlobalAggregates$ GlobalAggregates ()  { throw new RuntimeException(); }
  /**
   * This rule finds aggregate expressions that are not in an aggregate operator.  For example,
   * those in a HAVING clause or ORDER BY clause.  These expressions are pushed down to the
   * underlying aggregate operator and then projected away after the original operator.
   */
  public  class ResolveAggregateFunctions extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveAggregateFunctions ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  boolean containsAggregate (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveAggregateFunctions$ ResolveAggregateFunctions ()  { throw new RuntimeException(); }
  /**
   * Extracts {@link Generator} from the projectList of a {@link Project} operator and create {@link Generate}
   * operator under {@link Project}.
   * <p>
   * This rule will throw {@link AnalysisException} for following cases:
   * 1. {@link Generator} is nested in expressions, e.g. <code>SELECT explode(list) + 1 FROM tbl</code>
   * 2. more than one {@link Generator} is found in projectList,
   *    e.g. <code>SELECT explode(list), explode(list) FROM tbl</code>
   * 3. {@link Generator} is found in other operators that are not {@link Project} or {@link Generate},
   *    e.g. <code>SELECT * FROM tbl SORT BY explode(list)</code>
   */
  public  class ExtractGenerator extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ExtractGenerator ()  { throw new RuntimeException(); }
    private  boolean hasGenerator (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
    private  boolean hasNestedGenerator (org.apache.spark.sql.catalyst.expressions.NamedExpression expr)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.Expression trimAlias (org.apache.spark.sql.catalyst.expressions.NamedExpression expr)  { throw new RuntimeException(); }
    /** Extracts a {@link Generator} expression and any names assigned by aliases to their output. */
    private  class AliasedGenerator {
      public   AliasedGenerator ()  { throw new RuntimeException(); }
      public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Generator, scala.collection.Seq<java.lang.String>>> unapply (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
    }
    private  org.apache.spark.sql.catalyst.analysis.Analyzer.ExtractGenerator$.AliasedGenerator$ AliasedGenerator ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ExtractGenerator$ ExtractGenerator ()  { throw new RuntimeException(); }
  /**
   * Rewrites table generating expressions that either need one or more of the following in order
   * to be resolved:
   *  - concrete attribute references for their output.
   *  - to be relocated from a SELECT clause (i.e. from  a {@link Project}) into a {@link Generate}).
   * <p>
   * Names for the output {@link Attribute}s are extracted from {@link Alias} or {@link MultiAlias} expressions
   * that wrap the {@link Generator}.
   */
  public  class ResolveGenerate extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveGenerate ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    /**
     * Construct the output attributes for a {@link Generator}, given a list of names.  If the list of
     * names is empty names are assigned from field names in generator.
     * @param generator (undocumented)
     * @param names (undocumented)
     * @return (undocumented)
     */
      scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> makeGeneratorOutput (org.apache.spark.sql.catalyst.expressions.Generator generator, scala.collection.Seq<java.lang.String> names)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveGenerate$ ResolveGenerate ()  { throw new RuntimeException(); }
  /**
   * Fixes nullability of Attributes in a resolved LogicalPlan by using the nullability of
   * corresponding Attributes of its children output Attributes. This step is needed because
   * users can use a resolved AttributeReference in the Dataset API and outer joins
   * can change the nullability of an AttribtueReference. Without the fix, a nullable column's
   * nullable field can be actually set as non-nullable, which cause illegal optimization
   * (e.g., NULL propagation) and wrong answers.
   * See SPARK-13484 and SPARK-13801 for the concrete queries of this case.
   */
  public  class FixNullability extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   FixNullability ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.FixNullability$ FixNullability ()  { throw new RuntimeException(); }
  /**
   * Extracts {@link WindowExpression}s from the projectList of a {@link Project} operator and
   * aggregateExpressions of an {@link Aggregate} operator and creates individual {@link Window}
   * operators for every distinct {@link WindowSpecDefinition}.
   * <p>
   * This rule handles three cases:
   *  - A {@link Project} having {@link WindowExpression}s in its projectList;
   *  - An {@link Aggregate} having {@link WindowExpression}s in its aggregateExpressions.
   *  - A {@link Filter}->{@link Aggregate} pattern representing GROUP BY with a HAVING
   *    clause and the {@link Aggregate} has {@link WindowExpression}s in its aggregateExpressions.
   * Note: If there is a GROUP BY clause in the query, aggregations and corresponding
   * filters (expressions in the HAVING clause) should be evaluated before any
   * {@link WindowExpression}. If a query has SELECT DISTINCT, the DISTINCT part should be
   * evaluated after all {@link WindowExpression}s.
   * <p>
   * For every case, the transformation works as follows:
   * 1. For a list of {@link Expression}s (a projectList or an aggregateExpressions), partitions
   *    it two lists of {@link Expression}s, one for all {@link WindowExpression}s and another for
   *    all regular expressions.
   * 2. For all {@link WindowExpression}s, groups them based on their {@link WindowSpecDefinition}s.
   * 3. For every distinct {@link WindowSpecDefinition}, creates a {@link Window} operator and inserts
   *    it into the plan tree.
   */
  public  class ExtractWindowExpressions extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ExtractWindowExpressions ()  { throw new RuntimeException(); }
    private  boolean hasWindowFunction (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList)  { throw new RuntimeException(); }
    private  boolean hasWindowFunction (org.apache.spark.sql.catalyst.expressions.NamedExpression expr)  { throw new RuntimeException(); }
    /**
     * From a Seq of {@link NamedExpression}s, extract expressions containing window expressions and
     * other regular expressions that do not contain any window expression. For example, for
     * <code>col1, Sum(col2 + col3) OVER (PARTITION BY col4 ORDER BY col5)</code>, we will extract
     * <code>col1</code>, <code>col2 + col3</code>, <code>col4</code>, and <code>col5</code> out and replace their appearances in
     * the window expression as attribute references. So, the first returned value will be
     * <code>[Sum(_w0) OVER (PARTITION BY _w1 ORDER BY _w2)]</code> and the second returned value will be
     * [col1, col2 + col3 as _w0, col4 as _w1, col5 as _w2].
     * <p>
     * @return (seq of expressions containing at lease one window expressions,
     *          seq of non-window expressions)
     * @param expressions (undocumented)
     */
    private  scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>> extract (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> expressions)  { throw new RuntimeException(); }
    /**
     * Adds operators for Window Expressions. Every Window operator handles a single Window Spec.
     * @param expressionsWithWindowFunctions (undocumented)
     * @param child (undocumented)
     * @return (undocumented)
     */
    private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan addWindow (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> expressionsWithWindowFunctions, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ExtractWindowExpressions$ ExtractWindowExpressions ()  { throw new RuntimeException(); }
  /**
   * Pulls out nondeterministic expressions from LogicalPlan which is not Project or Filter,
   * put them into an inner Project and finally project them away at the outer Project.
   */
  public  class PullOutNondeterministic extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   PullOutNondeterministic ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.PullOutNondeterministic$ PullOutNondeterministic ()  { throw new RuntimeException(); }
  /**
   * Correctly handle null primitive inputs for UDF by adding extra {@link If} expression to do the
   * null check.  When user defines a UDF with primitive parameters, there is no way to tell if the
   * primitive parameter is null or not, so here we assume the primitive input is null-propagatable
   * and we should return null if the input is null.
   */
  public  class HandleNullInputsForUDF extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   HandleNullInputsForUDF ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.HandleNullInputsForUDF$ HandleNullInputsForUDF ()  { throw new RuntimeException(); }
  /**
   * Check and add proper window frames for all window functions.
   */
  public  class ResolveWindowFrame extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveWindowFrame ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveWindowFrame$ ResolveWindowFrame ()  { throw new RuntimeException(); }
  /**
   * Check and add order to {@link AggregateWindowFunction}s.
   */
  public  class ResolveWindowOrder extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveWindowOrder ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveWindowOrder$ ResolveWindowOrder ()  { throw new RuntimeException(); }
  /**
   * Removes natural or using joins by calculating output columns based on output from two sides,
   * Then apply a Project on a normal Join to eliminate natural or using join.
   */
  public  class ResolveNaturalAndUsingJoin extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveNaturalAndUsingJoin ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveNaturalAndUsingJoin$ ResolveNaturalAndUsingJoin ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.plans.logical.Project commonNaturalJoinProcessing (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right, org.apache.spark.sql.catalyst.plans.JoinType joinType, scala.collection.Seq<java.lang.String> joinNames, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition)  { throw new RuntimeException(); }
  /**
   * Replaces {@link UnresolvedDeserializer} with the deserialization expression that has been resolved
   * to the given input attributes.
   */
  public  class ResolveDeserializer extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveDeserializer ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    private  void fail (org.apache.spark.sql.types.StructType schema, int maxOrdinal)  { throw new RuntimeException(); }
    /**
     * For each top-level Tuple field, we use {@link GetColumnByOrdinal} to get its corresponding column
     * by position.  However, the actual number of columns may be different from the number of Tuple
     * fields.  This method is used to check the number of columns and fields, and throw an
     * exception if they do not match.
     * @param deserializer (undocumented)
     * @param inputs (undocumented)
     */
    private  void validateTopLevelTupleFields (org.apache.spark.sql.catalyst.expressions.Expression deserializer, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputs)  { throw new RuntimeException(); }
    /**
     * For each nested Tuple field, we use {@link GetStructField} to get its corresponding struct field
     * by position.  However, the actual number of struct fields may be different from the number
     * of nested Tuple fields.  This method is used to check the number of struct fields and nested
     * Tuple fields, and throw an exception if they do not match.
     * @param deserializer (undocumented)
     */
    private  void validateNestedTupleFields (org.apache.spark.sql.catalyst.expressions.Expression deserializer)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveDeserializer$ ResolveDeserializer ()  { throw new RuntimeException(); }
  /**
   * Resolves {@link NewInstance} by finding and adding the outer scope to it if the object being
   * constructed is an inner class.
   */
  public  class ResolveNewInstance extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveNewInstance ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveNewInstance$ ResolveNewInstance ()  { throw new RuntimeException(); }
  /**
   * Replace the {@link UpCast} expression by {@link Cast}, and throw exceptions if the cast may truncate.
   */
  public  class ResolveUpCast extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveUpCast ()  { throw new RuntimeException(); }
    private  scala.runtime.Nothing$ fail (org.apache.spark.sql.catalyst.expressions.Expression from, org.apache.spark.sql.types.DataType to, scala.collection.Seq<java.lang.String> walkedTypePath)  { throw new RuntimeException(); }
    private  boolean illegalNumericPrecedence (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveUpCast$ ResolveUpCast ()  { throw new RuntimeException(); }
}
