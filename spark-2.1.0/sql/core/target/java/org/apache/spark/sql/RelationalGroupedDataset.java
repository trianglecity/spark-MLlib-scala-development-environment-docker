package org.apache.spark.sql;
/**
 * A set of methods for aggregations on a <code>DataFrame</code>, created by <code>Dataset.groupBy</code>.
 * <p>
 * The main method is the agg function, which has multiple variants. This class also contains
 * convenience some first order statistics such as mean, sum for convenience.
 * <p>
 * This class was named <code>GroupedData</code> in Spark 1.x.
 * <p>
 * @since 2.0.0
 */
public  class RelationalGroupedDataset {
  /**
   * To indicate it's the GroupBy
   */
  static public  class GroupByType$ implements org.apache.spark.sql.RelationalGroupedDataset.GroupType {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GroupByType$ MODULE$ = null;
    public   GroupByType$ ()  { throw new RuntimeException(); }
  }
  /**
   * To indicate it's the CUBE
   */
  static public  class CubeType$ implements org.apache.spark.sql.RelationalGroupedDataset.GroupType {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CubeType$ MODULE$ = null;
    public   CubeType$ ()  { throw new RuntimeException(); }
  }
  /**
   * To indicate it's the ROLLUP
   */
  static public  class RollupType$ implements org.apache.spark.sql.RelationalGroupedDataset.GroupType {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RollupType$ MODULE$ = null;
    public   RollupType$ ()  { throw new RuntimeException(); }
  }
  /**
   * To indicate it's the PIVOT
   */
  static   class PivotType implements org.apache.spark.sql.RelationalGroupedDataset.GroupType, scala.Product, scala.Serializable {
    public  org.apache.spark.sql.catalyst.expressions.Expression pivotCol ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Literal> values ()  { throw new RuntimeException(); }
    // not preceding
    public   PivotType (org.apache.spark.sql.catalyst.expressions.Expression pivotCol, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Literal> values)  { throw new RuntimeException(); }
  }
  static public  class PivotType$ extends scala.runtime.AbstractFunction2<org.apache.spark.sql.catalyst.expressions.Expression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Literal>, org.apache.spark.sql.RelationalGroupedDataset.PivotType> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PivotType$ MODULE$ = null;
    public   PivotType$ ()  { throw new RuntimeException(); }
  }
  /**
   * The Grouping Type
   */
  static   interface GroupType {
  }
  static public  org.apache.spark.sql.RelationalGroupedDataset apply (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupingExprs, org.apache.spark.sql.RelationalGroupedDataset.GroupType groupType)  { throw new RuntimeException(); }
  /**
   * Compute aggregates by specifying a series of aggregate columns. Note that this function by
   * default retains the grouping columns in its output. To not retain grouping columns, set
   * <code>spark.sql.retainGroupColumns</code> to false.
   * <p>
   * The available aggregate methods are defined in {@link org.apache.spark.sql.functions}.
   * <p>
   * <pre><code>
   *   // Selects the age of the oldest employee and the aggregate expense for each department
   *
   *   // Scala:
   *   import org.apache.spark.sql.functions._
   *   df.groupBy("department").agg(max("age"), sum("expense"))
   *
   *   // Java:
   *   import static org.apache.spark.sql.functions.*;
   *   df.groupBy("department").agg(max("age"), sum("expense"));
   * </code></pre>
   * <p>
   * Note that before Spark 1.4, the default behavior is to NOT retain grouping columns. To change
   * to that behavior, set config variable <code>spark.sql.retainGroupColumns</code> to <code>false</code>.
   * <pre><code>
   *   // Scala, 1.3.x:
   *   df.groupBy("department").agg($"department", max("age"), sum("expense"))
   *
   *   // Java, 1.3.x:
   *   df.groupBy("department").agg(col("department"), max("age"), sum("expense"));
   * </code></pre>
   * <p>
   * @since 1.3.0
   * @param expr (undocumented)
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> agg (org.apache.spark.sql.Column expr, org.apache.spark.sql.Column... exprs)  { throw new RuntimeException(); }
  /**
   * Compute the average value for each numeric columns for each group. This is an alias for <code>avg</code>.
   * The resulting <code>DataFrame</code> will also contain the grouping columns.
   * When specified columns are given, only compute the average values for them.
   * <p>
   * @since 1.3.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> mean (java.lang.String... colNames)  { throw new RuntimeException(); }
  /**
   * Compute the max value for each numeric columns for each group.
   * The resulting <code>DataFrame</code> will also contain the grouping columns.
   * When specified columns are given, only compute the max values for them.
   * <p>
   * @since 1.3.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> max (java.lang.String... colNames)  { throw new RuntimeException(); }
  /**
   * Compute the mean value for each numeric columns for each group.
   * The resulting <code>DataFrame</code> will also contain the grouping columns.
   * When specified columns are given, only compute the mean values for them.
   * <p>
   * @since 1.3.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> avg (java.lang.String... colNames)  { throw new RuntimeException(); }
  /**
   * Compute the min value for each numeric column for each group.
   * The resulting <code>DataFrame</code> will also contain the grouping columns.
   * When specified columns are given, only compute the min values for them.
   * <p>
   * @since 1.3.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> min (java.lang.String... colNames)  { throw new RuntimeException(); }
  /**
   * Compute the sum for each numeric columns for each group.
   * The resulting <code>DataFrame</code> will also contain the grouping columns.
   * When specified columns are given, only compute the sum for them.
   * <p>
   * @since 1.3.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> sum (java.lang.String... colNames)  { throw new RuntimeException(); }
  // not preceding
  protected   RelationalGroupedDataset (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupingExprs, org.apache.spark.sql.RelationalGroupedDataset.GroupType groupType)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> toDF (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> aggExprs)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.NamedExpression alias (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> aggregateNumericColumns (scala.collection.Seq<java.lang.String> colNames, scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.aggregate.AggregateFunction> f)  { throw new RuntimeException(); }
  private  scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> strToExpr (java.lang.String expr)  { throw new RuntimeException(); }
  /**
   * (Scala-specific) Compute aggregates by specifying the column names and
   * aggregate methods. The resulting <code>DataFrame</code> will also contain the grouping columns.
   * <p>
   * The available aggregate methods are <code>avg</code>, <code>max</code>, <code>min</code>, <code>sum</code>, <code>count</code>.
   * <pre><code>
   *   // Selects the age of the oldest employee and the aggregate expense for each department
   *   df.groupBy("department").agg(
   *     "age" -&gt; "max",
   *     "expense" -&gt; "sum"
   *   )
   * </code></pre>
   * <p>
   * @since 1.3.0
   * @param aggExpr (undocumented)
   * @param aggExprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> agg (scala.Tuple2<java.lang.String, java.lang.String> aggExpr, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> aggExprs)  { throw new RuntimeException(); }
  /**
   * (Scala-specific) Compute aggregates by specifying a map from column name to
   * aggregate methods. The resulting <code>DataFrame</code> will also contain the grouping columns.
   * <p>
   * The available aggregate methods are <code>avg</code>, <code>max</code>, <code>min</code>, <code>sum</code>, <code>count</code>.
   * <pre><code>
   *   // Selects the age of the oldest employee and the aggregate expense for each department
   *   df.groupBy("department").agg(Map(
   *     "age" -&gt; "max",
   *     "expense" -&gt; "sum"
   *   ))
   * </code></pre>
   * <p>
   * @since 1.3.0
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> agg (scala.collection.immutable.Map<java.lang.String, java.lang.String> exprs)  { throw new RuntimeException(); }
  /**
   * (Java-specific) Compute aggregates by specifying a map from column name to
   * aggregate methods. The resulting <code>DataFrame</code> will also contain the grouping columns.
   * <p>
   * The available aggregate methods are <code>avg</code>, <code>max</code>, <code>min</code>, <code>sum</code>, <code>count</code>.
   * <pre><code>
   *   // Selects the age of the oldest employee and the aggregate expense for each department
   *   import com.google.common.collect.ImmutableMap;
   *   df.groupBy("department").agg(ImmutableMap.of("age", "max", "expense", "sum"));
   * </code></pre>
   * <p>
   * @since 1.3.0
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> agg (java.util.Map<java.lang.String, java.lang.String> exprs)  { throw new RuntimeException(); }
  /**
   * Compute aggregates by specifying a series of aggregate columns. Note that this function by
   * default retains the grouping columns in its output. To not retain grouping columns, set
   * <code>spark.sql.retainGroupColumns</code> to false.
   * <p>
   * The available aggregate methods are defined in {@link org.apache.spark.sql.functions}.
   * <p>
   * <pre><code>
   *   // Selects the age of the oldest employee and the aggregate expense for each department
   *
   *   // Scala:
   *   import org.apache.spark.sql.functions._
   *   df.groupBy("department").agg(max("age"), sum("expense"))
   *
   *   // Java:
   *   import static org.apache.spark.sql.functions.*;
   *   df.groupBy("department").agg(max("age"), sum("expense"));
   * </code></pre>
   * <p>
   * Note that before Spark 1.4, the default behavior is to NOT retain grouping columns. To change
   * to that behavior, set config variable <code>spark.sql.retainGroupColumns</code> to <code>false</code>.
   * <pre><code>
   *   // Scala, 1.3.x:
   *   df.groupBy("department").agg($"department", max("age"), sum("expense"))
   *
   *   // Java, 1.3.x:
   *   df.groupBy("department").agg(col("department"), max("age"), sum("expense"));
   * </code></pre>
   * <p>
   * @since 1.3.0
   * @param expr (undocumented)
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> agg (org.apache.spark.sql.Column expr, scala.collection.Seq<org.apache.spark.sql.Column> exprs)  { throw new RuntimeException(); }
  /**
   * Count the number of rows for each group.
   * The resulting <code>DataFrame</code> will also contain the grouping columns.
   * <p>
   * @since 1.3.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> count ()  { throw new RuntimeException(); }
  /**
   * Compute the average value for each numeric columns for each group. This is an alias for <code>avg</code>.
   * The resulting <code>DataFrame</code> will also contain the grouping columns.
   * When specified columns are given, only compute the average values for them.
   * <p>
   * @since 1.3.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> mean (scala.collection.Seq<java.lang.String> colNames)  { throw new RuntimeException(); }
  /**
   * Compute the max value for each numeric columns for each group.
   * The resulting <code>DataFrame</code> will also contain the grouping columns.
   * When specified columns are given, only compute the max values for them.
   * <p>
   * @since 1.3.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> max (scala.collection.Seq<java.lang.String> colNames)  { throw new RuntimeException(); }
  /**
   * Compute the mean value for each numeric columns for each group.
   * The resulting <code>DataFrame</code> will also contain the grouping columns.
   * When specified columns are given, only compute the mean values for them.
   * <p>
   * @since 1.3.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> avg (scala.collection.Seq<java.lang.String> colNames)  { throw new RuntimeException(); }
  /**
   * Compute the min value for each numeric column for each group.
   * The resulting <code>DataFrame</code> will also contain the grouping columns.
   * When specified columns are given, only compute the min values for them.
   * <p>
   * @since 1.3.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> min (scala.collection.Seq<java.lang.String> colNames)  { throw new RuntimeException(); }
  /**
   * Compute the sum for each numeric columns for each group.
   * The resulting <code>DataFrame</code> will also contain the grouping columns.
   * When specified columns are given, only compute the sum for them.
   * <p>
   * @since 1.3.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> sum (scala.collection.Seq<java.lang.String> colNames)  { throw new RuntimeException(); }
  /**
   * Pivots a column of the current <code>DataFrame</code> and perform the specified aggregation.
   * There are two versions of pivot function: one that requires the caller to specify the list
   * of distinct values to pivot on, and one that does not. The latter is more concise but less
   * efficient, because Spark needs to first compute the list of distinct values internally.
   * <p>
   * <pre><code>
   *   // Compute the sum of earnings for each year by course with each course as a separate column
   *   df.groupBy("year").pivot("course", Seq("dotNET", "Java")).sum("earnings")
   *
   *   // Or without specifying column values (less efficient)
   *   df.groupBy("year").pivot("course").sum("earnings")
   * </code></pre>
   * <p>
   * @param pivotColumn Name of the column to pivot.
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.RelationalGroupedDataset pivot (java.lang.String pivotColumn)  { throw new RuntimeException(); }
  /**
   * Pivots a column of the current <code>DataFrame</code> and perform the specified aggregation.
   * There are two versions of pivot function: one that requires the caller to specify the list
   * of distinct values to pivot on, and one that does not. The latter is more concise but less
   * efficient, because Spark needs to first compute the list of distinct values internally.
   * <p>
   * <pre><code>
   *   // Compute the sum of earnings for each year by course with each course as a separate column
   *   df.groupBy("year").pivot("course", Seq("dotNET", "Java")).sum("earnings")
   *
   *   // Or without specifying column values (less efficient)
   *   df.groupBy("year").pivot("course").sum("earnings")
   * </code></pre>
   * <p>
   * @param pivotColumn Name of the column to pivot.
   * @param values List of values that will be translated to columns in the output DataFrame.
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.RelationalGroupedDataset pivot (java.lang.String pivotColumn, scala.collection.Seq<java.lang.Object> values)  { throw new RuntimeException(); }
  /**
   * Pivots a column of the current <code>DataFrame</code> and perform the specified aggregation.
   * There are two versions of pivot function: one that requires the caller to specify the list
   * of distinct values to pivot on, and one that does not. The latter is more concise but less
   * efficient, because Spark needs to first compute the list of distinct values internally.
   * <p>
   * <pre><code>
   *   // Compute the sum of earnings for each year by course with each course as a separate column
   *   df.groupBy("year").pivot("course", Arrays.&lt;Object&gt;asList("dotNET", "Java")).sum("earnings");
   *
   *   // Or without specifying column values (less efficient)
   *   df.groupBy("year").pivot("course").sum("earnings");
   * </code></pre>
   * <p>
   * @param pivotColumn Name of the column to pivot.
   * @param values List of values that will be translated to columns in the output DataFrame.
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.RelationalGroupedDataset pivot (java.lang.String pivotColumn, java.util.List<java.lang.Object> values)  { throw new RuntimeException(); }
  /**
   * Applies the given serialized R function <code>func</code> to each group of data. For each unique group,
   * the function will be passed the group key and an iterator that contains all of the elements in
   * the group. The function can return an iterator containing elements of an arbitrary type which
   * will be returned as a new <code>DataFrame</code>.
   * <p>
   * This function does not support partial aggregation, and as a result requires shuffling all
   * the data in the {@link Dataset}. If an application intends to perform an aggregation over each
   * key, it is best to use the reduce function or an
   * <code>org.apache.spark.sql.expressions#Aggregator</code>.
   * <p>
   * Internally, the implementation will spill to disk if any given group is too large to fit into
   * memory.  However, users must take care to avoid materializing the whole iterator for a group
   * (for example, by calling <code>toList</code>) unless they are sure that this is possible given the memory
   * constraints of their cluster.
   * <p>
   * @since 2.0.0
   * @param f (undocumented)
   * @param packageNames (undocumented)
   * @param broadcastVars (undocumented)
   * @param outputSchema (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> flatMapGroupsInR (byte[] f, byte[] packageNames, org.apache.spark.broadcast.Broadcast<java.lang.Object>[] broadcastVars, org.apache.spark.sql.types.StructType outputSchema)  { throw new RuntimeException(); }
}
