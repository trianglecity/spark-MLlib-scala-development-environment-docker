package org.apache.spark.sql.catalyst.parser;
/**
 * The AstBuilder converts an ANTLR4 ParseTree into a catalyst Expression, LogicalPlan or
 * TableIdentifier.
 */
public  class AstBuilder extends org.apache.spark.sql.catalyst.parser.SqlBaseBaseVisitor<java.lang.Object> implements org.apache.spark.internal.Logging {
  public   AstBuilder ()  { throw new RuntimeException(); }
  protected <T extends java.lang.Object> T typedVisit (org.antlr.v4.runtime.tree.ParseTree ctx)  { throw new RuntimeException(); }
  /**
   * Override the default behavior for all visit methods. This will only return a non-null result
   * when the context has only one child. This is done because there is no generic method to
   * combine the results of the context children. In all other cases null is returned.
   * @param node (undocumented)
   * @return (undocumented)
   */
  public  java.lang.Object visitChildren (org.antlr.v4.runtime.tree.RuleNode node)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitSingleStatement (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SingleStatementContext ctx)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression visitSingleExpression (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SingleExpressionContext ctx)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.TableIdentifier visitSingleTableIdentifier (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SingleTableIdentifierContext ctx)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType visitSingleDataType (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SingleDataTypeContext ctx)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan (org.antlr.v4.runtime.ParserRuleContext tree)  { throw new RuntimeException(); }
  /**
   * Create a top-level plan with Common Table Expressions.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitQuery (org.apache.spark.sql.catalyst.parser.SqlBaseParser.QueryContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a named logical plan.
   * <p>
   * This is only used for Common Table Expressions.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.SubqueryAlias visitNamedQuery (org.apache.spark.sql.catalyst.parser.SqlBaseParser.NamedQueryContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a logical plan which allows for multiple inserts using one 'from' statement. These
   * queries have the following SQL form:
   * <pre><code>
   *   [WITH cte...]?
   *   FROM src
   *   [INSERT INTO tbl1 SELECT *]+
   * </code></pre>
   * For example:
   * <pre><code>
   *   FROM db.tbl1 A
   *   INSERT INTO dbo.tbl1 SELECT * WHERE A.value = 10 LIMIT 5
   *   INSERT INTO dbo.tbl2 SELECT * WHERE A.value = 12
   * </code></pre>
   * This (Hive) feature cannot be combined with set-operators.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitMultiInsertQuery (org.apache.spark.sql.catalyst.parser.SqlBaseParser.MultiInsertQueryContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a logical plan for a regular (single-insert) query.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitSingleInsertQuery (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SingleInsertQueryContext ctx)  { throw new RuntimeException(); }
  /**
   * Add an INSERT INTO [TABLE]/INSERT OVERWRITE TABLE operation to the logical plan.
   * @param ctx (undocumented)
   * @param query (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withInsertInto (org.apache.spark.sql.catalyst.parser.SqlBaseParser.InsertIntoContext ctx, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query)  { throw new RuntimeException(); }
  /**
   * Create a partition specification map.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, scala.Option<java.lang.String>> visitPartitionSpec (org.apache.spark.sql.catalyst.parser.SqlBaseParser.PartitionSpecContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a partition specification map without optional values.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  protected  scala.collection.immutable.Map<java.lang.String, java.lang.String> visitNonOptionalPartitionSpec (org.apache.spark.sql.catalyst.parser.SqlBaseParser.PartitionSpecContext ctx)  { throw new RuntimeException(); }
  /**
   * Convert a constant of any type into a string. This is typically used in DDL commands, and its
   * main purpose is to prevent slight differences due to back to back conversions i.e.:
   * String -> Literal -> String.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  protected  java.lang.String visitStringConstant (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ConstantContext ctx)  { throw new RuntimeException(); }
  /**
   * Add ORDER BY/SORT BY/CLUSTER BY/DISTRIBUTE BY/LIMIT/WINDOWS clauses to the logical plan. These
   * clauses determine the shape (ordering/partitioning/rows) of the query result.
   * @param ctx (undocumented)
   * @param query (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withQueryResultClauses (org.apache.spark.sql.catalyst.parser.SqlBaseParser.QueryOrganizationContext ctx, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query)  { throw new RuntimeException(); }
  /**
   * Create a logical plan using a query specification.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitQuerySpecification (org.apache.spark.sql.catalyst.parser.SqlBaseParser.QuerySpecificationContext ctx)  { throw new RuntimeException(); }
  /**
   * Add a query specification to a logical plan. The query specification is the core of the logical
   * plan, this is where sourcing (FROM clause), transforming (SELECT TRANSFORM/MAP/REDUCE),
   * projection (SELECT), aggregation (GROUP BY ... HAVING ...) and filtering (WHERE) takes place.
   * <p>
   * Note that query hints are ignored (both by the parser and the builder).
   * @param ctx (undocumented)
   * @param relation (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withQuerySpecification (org.apache.spark.sql.catalyst.parser.SqlBaseParser.QuerySpecificationContext ctx, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan relation)  { throw new RuntimeException(); }
  /**
   * Create a (Hive based) {@link ScriptInputOutputSchema}.
   * @param ctx (undocumented)
   * @param inRowFormat (undocumented)
   * @param recordWriter (undocumented)
   * @param outRowFormat (undocumented)
   * @param recordReader (undocumented)
   * @param schemaLess (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.catalyst.plans.logical.ScriptInputOutputSchema withScriptIOSchema (org.apache.spark.sql.catalyst.parser.SqlBaseParser.QuerySpecificationContext ctx, org.apache.spark.sql.catalyst.parser.SqlBaseParser.RowFormatContext inRowFormat, org.antlr.v4.runtime.Token recordWriter, org.apache.spark.sql.catalyst.parser.SqlBaseParser.RowFormatContext outRowFormat, org.antlr.v4.runtime.Token recordReader, boolean schemaLess)  { throw new RuntimeException(); }
  /**
   * Create a logical plan for a given 'FROM' clause. Note that we support multiple (comma
   * separated) relations here, these get converted into a single plan by condition-less inner join.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitFromClause (org.apache.spark.sql.catalyst.parser.SqlBaseParser.FromClauseContext ctx)  { throw new RuntimeException(); }
  /**
   * Connect two queries by a Set operator.
   * <p>
   * Supported Set operators are:
   * - UNION [DISTINCT]
   * - UNION ALL
   * - EXCEPT [DISTINCT]
   * - MINUS [DISTINCT]
   * - INTERSECT [DISTINCT]
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitSetOperation (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SetOperationContext ctx)  { throw new RuntimeException(); }
  /**
   * Add a {@link WithWindowDefinition} operator to a logical plan.
   * @param ctx (undocumented)
   * @param query (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withWindows (org.apache.spark.sql.catalyst.parser.SqlBaseParser.WindowsContext ctx, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query)  { throw new RuntimeException(); }
  /**
   * Add an {@link Aggregate} to a logical plan.
   * @param ctx (undocumented)
   * @param selectExpressions (undocumented)
   * @param query (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withAggregation (org.apache.spark.sql.catalyst.parser.SqlBaseParser.AggregationContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> selectExpressions, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query)  { throw new RuntimeException(); }
  /**
   * Add a {@link Generate} (Lateral View) to a logical plan.
   * @param query (undocumented)
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withGenerate (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, org.apache.spark.sql.catalyst.parser.SqlBaseParser.LateralViewContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a single relation referenced in a FROM claused. This method is used when a part of the
   * join condition is nested, for example:
   * <pre><code>
   *   select * from t1 join (t2 cross join t3) on col1 = col2
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitRelation (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RelationContext ctx)  { throw new RuntimeException(); }
  /**
   * Join one more {@link LogicalPlan}s to the current logical plan.
   * @param base (undocumented)
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withJoinRelations (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan base, org.apache.spark.sql.catalyst.parser.SqlBaseParser.RelationContext ctx)  { throw new RuntimeException(); }
  /**
   * Add a {@link Sample} to a logical plan.
   * <p>
   * This currently supports the following sampling methods:
   * - TABLESAMPLE(x ROWS): Sample the table down to the given number of rows.
   * - TABLESAMPLE(x PERCENT): Sample the table down to the given percentage. Note that percentages
   * are defined as a number between 0 and 100.
   * - TABLESAMPLE(BUCKET x OUT OF y): Sample the table down to a 'x' divided by 'y' fraction.
   * @param ctx (undocumented)
   * @param query (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withSample (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SampleContext ctx, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query)  { throw new RuntimeException(); }
  /**
   * Create a logical plan for a sub-query.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitSubquery (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SubqueryContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an un-aliased table reference. This is typically used for top-level table references,
   * for example:
   * <pre><code>
   *   INSERT INTO db.tbl2
   *   TABLE db.tbl1
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitTable (org.apache.spark.sql.catalyst.parser.SqlBaseParser.TableContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an aliased table reference. This is typically used in FROM clauses.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitTableName (org.apache.spark.sql.catalyst.parser.SqlBaseParser.TableNameContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a table-valued function call with arguments, e.g. range(1000)
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitTableValuedFunction (org.apache.spark.sql.catalyst.parser.SqlBaseParser.TableValuedFunctionContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an inline table (a virtual table in Hive parlance).
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitInlineTable (org.apache.spark.sql.catalyst.parser.SqlBaseParser.InlineTableContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an alias (SubqueryAlias) for a join relation. This is practically the same as
   * visitAliasedQuery and visitNamedExpression, ANTLR4 however requires us to use 3 different
   * hooks.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitAliasedRelation (org.apache.spark.sql.catalyst.parser.SqlBaseParser.AliasedRelationContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an alias (SubqueryAlias) for a sub-query. This is practically the same as
   * visitAliasedRelation and visitNamedExpression, ANTLR4 however requires us to use 3 different
   * hooks.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitAliasedQuery (org.apache.spark.sql.catalyst.parser.SqlBaseParser.AliasedQueryContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an alias (SubqueryAlias) for a LogicalPlan.
   * @param alias (undocumented)
   * @param plan (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan aliasPlan (org.antlr.v4.runtime.ParserRuleContext alias, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Create a Sequence of Strings for a parenthesis enclosed alias list.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> visitIdentifierList (org.apache.spark.sql.catalyst.parser.SqlBaseParser.IdentifierListContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a Sequence of Strings for an identifier list.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> visitIdentifierSeq (org.apache.spark.sql.catalyst.parser.SqlBaseParser.IdentifierSeqContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link TableIdentifier} from a 'tableName' or 'databaseName'.'tableName' pattern.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.TableIdentifier visitTableIdentifier (org.apache.spark.sql.catalyst.parser.SqlBaseParser.TableIdentifierContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an expression from the given context. This method just passes the context on to the
   * visitor and only takes care of typing (We assume that the visitor returns an Expression here).
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.catalyst.expressions.Expression expression (org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  /**
   * Create sequence of expressions from the given sequence of contexts.
   * @param trees (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressionList (java.util.List<org.apache.spark.sql.catalyst.parser.SqlBaseParser.ExpressionContext> trees)  { throw new RuntimeException(); }
  /**
   * Create a star (i.e. all) expression; this selects all elements (in the specified object).
   * Both un-targeted (global) and targeted aliases are supported.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitStar (org.apache.spark.sql.catalyst.parser.SqlBaseParser.StarContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an aliased expression if an alias is specified. Both single and multi-aliases are
   * supported.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitNamedExpression (org.apache.spark.sql.catalyst.parser.SqlBaseParser.NamedExpressionContext ctx)  { throw new RuntimeException(); }
  /**
   * Combine a number of boolean expressions into a balanced expression tree. These expressions are
   * either combined by a logical {@link And} or a logical {@link Or}.
   * <p>
   * A balanced binary tree is created because regular left recursive trees cause considerable
   * performance degradations and can cause stack overflows.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitLogicalBinary (org.apache.spark.sql.catalyst.parser.SqlBaseParser.LogicalBinaryContext ctx)  { throw new RuntimeException(); }
  /**
   * Invert a boolean expression.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitLogicalNot (org.apache.spark.sql.catalyst.parser.SqlBaseParser.LogicalNotContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a filtering correlated sub-query (EXISTS).
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitExists (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ExistsContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a comparison expression. This compares two expressions. The following comparison
   * operators are supported:
   * - Equal: '=' or '=='
   * - Null-safe Equal: '<=&gt;'
   * - Not Equal: '<>' or '!='
   * - Less than: '<'
   * - Less then or Equal: '<='
   * - Greater than: '>'
   * - Greater then or Equal: '>='
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitComparison (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ComparisonContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a predicated expression. A predicated expression is a normal expression with a
   * predicate attached to it, for example:
   * <pre><code>
   *    a + 1 IS NULL
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitPredicated (org.apache.spark.sql.catalyst.parser.SqlBaseParser.PredicatedContext ctx)  { throw new RuntimeException(); }
  /**
   * Add a predicate to the given expression. Supported expressions are:
   * - (NOT) BETWEEN
   * - (NOT) IN
   * - (NOT) LIKE
   * - (NOT) RLIKE
   * - IS (NOT) NULL.
   * @param e (undocumented)
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.expressions.Expression withPredicate (org.apache.spark.sql.catalyst.expressions.Expression e, org.apache.spark.sql.catalyst.parser.SqlBaseParser.PredicateContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a binary arithmetic expression. The following arithmetic operators are supported:
   * - Multiplication: '*'
   * - Division: '/'
   * - Hive Long Division: 'DIV'
   * - Modulo: '%'
   * - Addition: '+'
   * - Subtraction: '-'
   * - Binary AND: '&amp;'
   * - Binary XOR
   * - Binary OR: '|'
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitArithmeticBinary (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ArithmeticBinaryContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a unary arithmetic expression. The following arithmetic operators are supported:
   * - Plus: '+'
   * - Minus: '-'
   * - Bitwise Not: '~'
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitArithmeticUnary (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ArithmeticUnaryContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link Cast} expression.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitCast (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CastContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a (windowed) Function expression.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitFunctionCall (org.apache.spark.sql.catalyst.parser.SqlBaseParser.FunctionCallContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a current timestamp/date expression. These are different from regular function because
   * they do not require the user to specify braces when calling them.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitTimeFunctionCall (org.apache.spark.sql.catalyst.parser.SqlBaseParser.TimeFunctionCallContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a function database (optional) and name pair.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.catalyst.FunctionIdentifier visitFunctionName (org.apache.spark.sql.catalyst.parser.SqlBaseParser.QualifiedNameContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a reference to a window frame, i.e. {@link WindowSpecReference}.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.WindowSpecReference visitWindowRef (org.apache.spark.sql.catalyst.parser.SqlBaseParser.WindowRefContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a window definition, i.e. {@link WindowSpecDefinition}.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.WindowSpecDefinition visitWindowDef (org.apache.spark.sql.catalyst.parser.SqlBaseParser.WindowDefContext ctx)  { throw new RuntimeException(); }
  /**
   * Create or resolve a {@link FrameBoundary}. Simple math expressions are allowed for Value
   * Preceding/Following boundaries. These expressions must be constant (foldable) and return an
   * integer value.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.FrameBoundary visitFrameBound (org.apache.spark.sql.catalyst.parser.SqlBaseParser.FrameBoundContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link CreateStruct} expression.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitRowConstructor (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RowConstructorContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link ScalarSubquery} expression.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitSubqueryExpression (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SubqueryExpressionContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a value based {@link CaseWhen} expression. This has the following SQL form:
   * <pre><code>
   *   CASE [expression]
   *    WHEN [value] THEN [expression]
   *    ...
   *    ELSE [expression]
   *   END
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitSimpleCase (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SimpleCaseContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a condition based {@link CaseWhen} expression. This has the following SQL syntax:
   * <pre><code>
   *   CASE
   *    WHEN [predicate] THEN [expression]
   *    ...
   *    ELSE [expression]
   *   END
   * </code></pre>
   * <p>
   * @param ctx the parse tree
   * @return (undocumented)
   *    */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitSearchedCase (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SearchedCaseContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a dereference expression. The return type depends on the type of the parent, this can
   * either be a {@link UnresolvedAttribute} (if the parent is an {@link UnresolvedAttribute}), or an
   * {@link UnresolvedExtractValue} if the parent is some expression.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitDereference (org.apache.spark.sql.catalyst.parser.SqlBaseParser.DereferenceContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link UnresolvedAttribute} expression.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitColumnReference (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ColumnReferenceContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link UnresolvedExtractValue} expression, this is used for subscript access to an array.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitSubscript (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SubscriptContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an expression for an expression between parentheses. This is need because the ANTLR
   * visitor cannot automatically convert the nested context into an expression.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression visitParenthesizedExpression (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ParenthesizedExpressionContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link SortOrder} expression.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.SortOrder visitSortItem (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SortItemContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a typed Literal expression. A typed literal has the following SQL syntax:
   * <pre><code>
   *   [TYPE] '[VALUE]'
   * </code></pre>
   * Currently Date, Timestamp and Binary typed literals are supported.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Literal visitTypeConstructor (org.apache.spark.sql.catalyst.parser.SqlBaseParser.TypeConstructorContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a NULL literal expression.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Literal visitNullLiteral (org.apache.spark.sql.catalyst.parser.SqlBaseParser.NullLiteralContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a Boolean literal expression.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Literal visitBooleanLiteral (org.apache.spark.sql.catalyst.parser.SqlBaseParser.BooleanLiteralContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an integral literal expression. The code selects the most narrow integral type
   * possible, either a BigDecimal, a Long or an Integer is returned.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Literal visitIntegerLiteral (org.apache.spark.sql.catalyst.parser.SqlBaseParser.IntegerLiteralContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a decimal literal for a regular decimal number.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Literal visitDecimalLiteral (org.apache.spark.sql.catalyst.parser.SqlBaseParser.DecimalLiteralContext ctx)  { throw new RuntimeException(); }
  /** Create a numeric literal expression. */
  private  org.apache.spark.sql.catalyst.expressions.Literal numericLiteral (org.apache.spark.sql.catalyst.parser.SqlBaseParser.NumberContext ctx, scala.math.BigDecimal minValue, scala.math.BigDecimal maxValue, java.lang.String typeName, scala.Function1<java.lang.String, java.lang.Object> converter)  { throw new RuntimeException(); }
  /**
   * Create a Byte Literal expression.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Literal visitTinyIntLiteral (org.apache.spark.sql.catalyst.parser.SqlBaseParser.TinyIntLiteralContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a Short Literal expression.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Literal visitSmallIntLiteral (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SmallIntLiteralContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a Long Literal expression.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Literal visitBigIntLiteral (org.apache.spark.sql.catalyst.parser.SqlBaseParser.BigIntLiteralContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a Double Literal expression.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Literal visitDoubleLiteral (org.apache.spark.sql.catalyst.parser.SqlBaseParser.DoubleLiteralContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a BigDecimal Literal expression.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Literal visitBigDecimalLiteral (org.apache.spark.sql.catalyst.parser.SqlBaseParser.BigDecimalLiteralContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a String literal expression.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Literal visitStringLiteral (org.apache.spark.sql.catalyst.parser.SqlBaseParser.StringLiteralContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a String from a string literal context. This supports multiple consecutive string
   * literals, these are concatenated, for example this expression "'hello' 'world'" will be
   * converted into "helloworld".
   * <p>
   * Special characters can be escaped by using Hive/C-style escaping.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String createString (org.apache.spark.sql.catalyst.parser.SqlBaseParser.StringLiteralContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link CalendarInterval} literal expression. An interval expression can contain multiple
   * unit value pairs, for instance: interval 2 months 2 days.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Literal visitInterval (org.apache.spark.sql.catalyst.parser.SqlBaseParser.IntervalContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link CalendarInterval} for a unit value pair. Two unit configuration types are
   * supported:
   * - Single unit.
   * - From-To unit (only 'YEAR TO MONTH' and 'DAY TO SECOND' are supported).
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.unsafe.types.CalendarInterval visitIntervalField (org.apache.spark.sql.catalyst.parser.SqlBaseParser.IntervalFieldContext ctx)  { throw new RuntimeException(); }
  /**
   * Resolve/create a primitive type.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.DataType visitPrimitiveDataType (org.apache.spark.sql.catalyst.parser.SqlBaseParser.PrimitiveDataTypeContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a complex DataType. Arrays, Maps and Structures are supported.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.DataType visitComplexDataType (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ComplexDataTypeContext ctx)  { throw new RuntimeException(); }
  /**
   * Create top level table schema.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.types.StructType createSchema (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ColTypeListContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link StructType} from a number of column definitions.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.types.StructField> visitColTypeList (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ColTypeListContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link StructField} from a column definition.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructField visitColType (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ColTypeContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link StructType} from a sequence of {@link StructField}s.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.types.StructType createStructType (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ComplexColTypeListContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link StructType} from a number of column definitions.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.types.StructField> visitComplexColTypeList (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ComplexColTypeListContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link StructField} from a column definition.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructField visitComplexColType (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ComplexColTypeContext ctx)  { throw new RuntimeException(); }
}
