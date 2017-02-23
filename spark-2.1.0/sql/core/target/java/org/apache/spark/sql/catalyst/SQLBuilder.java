package org.apache.spark.sql.catalyst;
/**
 * A builder class used to convert a resolved logical plan into a SQL query string.  Note that not
 * all resolved logical plan are convertible.  They either don't have corresponding SQL
 * representations (e.g. logical plans that operate on local Scala collections), or are simply not
 * supported by this builder (yet).
 */
public  class SQLBuilder implements org.apache.spark.internal.Logging {
  private   SQLBuilder (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan, java.util.concurrent.atomic.AtomicLong nextSubqueryId, java.util.concurrent.atomic.AtomicLong nextGenAttrId, scala.collection.mutable.Map<java.lang.Object, java.lang.Object> exprIdMap)  { throw new RuntimeException(); }
  public   SQLBuilder (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan)  { throw new RuntimeException(); }
  public   SQLBuilder (org.apache.spark.sql.Dataset<?> df)  { throw new RuntimeException(); }
  private  java.lang.String newSubqueryName ()  { throw new RuntimeException(); }
  private  java.lang.String normalizedName (org.apache.spark.sql.catalyst.expressions.NamedExpression n)  { throw new RuntimeException(); }
  public  java.lang.String toSQL ()  { throw new RuntimeException(); }
  private  java.lang.String toSQL (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan node)  { throw new RuntimeException(); }
  /**
   * Turns a bunch of string segments into a single string and separate each segment by a space.
   * The segments are trimmed so only a single space appears in the separation.
   * For example, <code>build("a", " b ", " c")</code> becomes "a b c".
   * @param segments (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String build (scala.collection.Seq<java.lang.String> segments)  { throw new RuntimeException(); }
  private  java.lang.String projectToSQL (org.apache.spark.sql.catalyst.plans.logical.Project plan, boolean isDistinct)  { throw new RuntimeException(); }
  private  java.lang.String scriptTransformationToSQL (org.apache.spark.sql.catalyst.plans.logical.ScriptTransformation plan)  { throw new RuntimeException(); }
  private  java.lang.String aggregateToSQL (org.apache.spark.sql.catalyst.plans.logical.Aggregate plan)  { throw new RuntimeException(); }
  private  java.lang.String generateToSQL (org.apache.spark.sql.catalyst.plans.logical.Generate g)  { throw new RuntimeException(); }
  private  boolean sameOutput (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output1, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output2)  { throw new RuntimeException(); }
  private  boolean isGroupingSet (org.apache.spark.sql.catalyst.plans.logical.Aggregate a, org.apache.spark.sql.catalyst.plans.logical.Expand e, org.apache.spark.sql.catalyst.plans.logical.Project p)  { throw new RuntimeException(); }
  private  java.lang.String groupingSetToSQL (org.apache.spark.sql.catalyst.plans.logical.Aggregate agg, org.apache.spark.sql.catalyst.plans.logical.Expand expand, org.apache.spark.sql.catalyst.plans.logical.Project project)  { throw new RuntimeException(); }
  private  java.lang.String windowToSQL (org.apache.spark.sql.catalyst.plans.logical.Window w)  { throw new RuntimeException(); }
  public  class Canonicalizer extends org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   Canonicalizer ()  { throw new RuntimeException(); }
    protected  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.Batch> batches ()  { throw new RuntimeException(); }
    public  class NormalizedAttribute extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
      public   NormalizedAttribute ()  { throw new RuntimeException(); }
      public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    }
    public  org.apache.spark.sql.catalyst.SQLBuilder.Canonicalizer$.NormalizedAttribute$ NormalizedAttribute ()  { throw new RuntimeException(); }
    public  class RemoveSubqueriesAboveSQLTable extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
      public   RemoveSubqueriesAboveSQLTable ()  { throw new RuntimeException(); }
      public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    }
    public  org.apache.spark.sql.catalyst.SQLBuilder.Canonicalizer$.RemoveSubqueriesAboveSQLTable$ RemoveSubqueriesAboveSQLTable ()  { throw new RuntimeException(); }
    public  class ResolveSQLTable extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
      public   ResolveSQLTable ()  { throw new RuntimeException(); }
      public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
      /**
       * Aliases the table columns to the generated attribute names, as we use exprId to generate
       * unique name for each attribute when normalize attributes, and we can't reference table
       * columns with their real names.
       * @param table (undocumented)
       * @return (undocumented)
       */
      private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan aliasColumns (org.apache.spark.sql.catalyst.SQLBuilder.SQLTable table)  { throw new RuntimeException(); }
    }
    public  org.apache.spark.sql.catalyst.SQLBuilder.Canonicalizer$.ResolveSQLTable$ ResolveSQLTable ()  { throw new RuntimeException(); }
    public  class AddSubquery extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
      public   AddSubquery ()  { throw new RuntimeException(); }
      public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan tree)  { throw new RuntimeException(); }
    }
    public  org.apache.spark.sql.catalyst.SQLBuilder.Canonicalizer$.AddSubquery$ AddSubquery ()  { throw new RuntimeException(); }
    public  class ConstructSubqueryExpressions extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
      public   ConstructSubqueryExpressions ()  { throw new RuntimeException(); }
      public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan tree)  { throw new RuntimeException(); }
    }
    public  org.apache.spark.sql.catalyst.SQLBuilder.Canonicalizer$.ConstructSubqueryExpressions$ ConstructSubqueryExpressions ()  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.plans.logical.SubqueryAlias addSubquery (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan addSubqueryIfNeeded (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.SQLBuilder.Canonicalizer$ Canonicalizer ()  { throw new RuntimeException(); }
  public  class SQLTable extends org.apache.spark.sql.catalyst.plans.logical.LeafNode implements scala.Product, scala.Serializable {
    public  java.lang.String database ()  { throw new RuntimeException(); }
    public  java.lang.String table ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
    public  scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> sample ()  { throw new RuntimeException(); }
    // not preceding
    public   SQLTable (java.lang.String database, java.lang.String table, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> sample)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.SQLBuilder.SQLTable withSample (double lowerBound, double upperBound)  { throw new RuntimeException(); }
  }
  public  class SQLTable extends scala.runtime.AbstractFunction4<java.lang.String, java.lang.String, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>>, org.apache.spark.sql.catalyst.SQLBuilder.SQLTable> implements scala.Serializable {
    public   SQLTable ()  { throw new RuntimeException(); }
  }
  public  class ExtractSQLTable {
    public   ExtractSQLTable ()  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.sql.catalyst.SQLBuilder.SQLTable> unapply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.SQLBuilder.ExtractSQLTable$ ExtractSQLTable ()  { throw new RuntimeException(); }
  /**
   * A place holder for generated SQL for subquery expression.
   */
  public  class SubqueryHolder extends org.apache.spark.sql.catalyst.expressions.LeafExpression implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
    public  java.lang.String sql ()  { throw new RuntimeException(); }
    // not preceding
    public   SubqueryHolder (java.lang.String sql)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
    public  boolean nullable ()  { throw new RuntimeException(); }
  }
  public  class SubqueryHolder extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.catalyst.SQLBuilder.SubqueryHolder> implements scala.Serializable {
    public   SubqueryHolder ()  { throw new RuntimeException(); }
  }
}
