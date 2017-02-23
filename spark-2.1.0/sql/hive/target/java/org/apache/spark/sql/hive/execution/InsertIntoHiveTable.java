package org.apache.spark.sql.hive.execution;
/**
 * Command for writing data out to a Hive table.
 * <p>
 * This class is mostly a mess, for legacy reasons (since it evolved in organic ways and had to
 * follow Hive's internal implementations closely, which itself was a mess too). Please don't
 * blame Reynold for this! He was just moving code around!
 * <p>
 * In the future we should converge the write path for Hive with the normal data source write path,
 * as defined in {@link org.apache.spark.sql.execution.datasources.FileFormatWriter}.
 * <p>
 * param:  table the logical plan representing the table. In the future this should be a
 *              {@link org.apache.spark.sql.catalyst.catalog.CatalogTable} once we converge Hive tables
 *              and data source tables.
 * param:  partition a map from the partition key to the partition value (optional). If the partition
 *                  value is optional, dynamic partition insert will be performed.
 *                  As an example, <code>INSERT INTO tbl PARTITION (a=1, b=2) AS ...</code> would have
 * <p>
 *                  <pre><code>
 *                  Map('a' -&gt; Some('1'), 'b' -&gt; Some('2'))
 *                  </code></pre>
 * <p>
 *                  and <code>INSERT INTO tbl PARTITION (a=1, b) AS ...</code>
 *                  would have
 * <p>
 *                  <pre><code>
 *                  Map('a' -&gt; Some('1'), 'b' -&gt; None)
 *                  </code></pre>.
 * param:  child the logical plan representing data to write to.
 * param:  overwrite overwrite existing table or partitions.
 * param:  ifNotExists If true, only write if the table or partition does not exist.
 */
public  class InsertIntoHiveTable extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryExecNode, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.trees.Origin origin ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.trees.TreeNode<?>> containsChild ()  { throw new RuntimeException(); }
  static public  int hashCode ()  { throw new RuntimeException(); }
  static public  boolean fastEquals (org.apache.spark.sql.catalyst.trees.TreeNode<?> other)  { throw new RuntimeException(); }
  static public  scala.Option<BaseType> find (scala.Function1<BaseType, java.lang.Object> f)  { throw new RuntimeException(); }
  static public  void foreach (scala.Function1<BaseType, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void foreachUp (scala.Function1<BaseType, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.collection.Seq<A> map (scala.Function1<BaseType, A> f)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.collection.Seq<A> flatMap (scala.Function1<BaseType, scala.collection.TraversableOnce<A>> f)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Seq<B> collect (scala.PartialFunction<BaseType, B> pf)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<BaseType> collectLeaves ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.Option<B> collectFirst (scala.PartialFunction<BaseType, B> pf)  { throw new RuntimeException(); }
  static protected <B extends java.lang.Object> java.lang.Object mapProductIterator (scala.Function1<java.lang.Object, B> f, scala.reflect.ClassTag<B> evidence$1)  { throw new RuntimeException(); }
  static public  BaseType mapChildren (scala.Function1<BaseType, BaseType> f)  { throw new RuntimeException(); }
  static public  BaseType withNewChildren (scala.collection.Seq<BaseType> newChildren)  { throw new RuntimeException(); }
  static public  BaseType transform (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static public  BaseType transformDown (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static public  BaseType transformUp (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static protected  BaseType transformChildren (scala.PartialFunction<BaseType, BaseType> rule, scala.Function2<BaseType, scala.PartialFunction<BaseType, BaseType>, BaseType> nextOperation)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<java.lang.Object> otherCopyArgs ()  { throw new RuntimeException(); }
  static public  java.lang.String nodeName ()  { throw new RuntimeException(); }
  static protected  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
  static public  java.lang.String argString ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  java.lang.String treeString ()  { throw new RuntimeException(); }
  static public  java.lang.String treeString (boolean verbose)  { throw new RuntimeException(); }
  static public  java.lang.String numberedTreeString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.trees.TreeNode<?> apply (int number)  { throw new RuntimeException(); }
  static public  BaseType p (int number)  { throw new RuntimeException(); }
  static public  scala.collection.mutable.StringBuilder generateTreeString (int depth, scala.collection.Seq<java.lang.Object> lastChildren, scala.collection.mutable.StringBuilder builder, boolean verbose, java.lang.String prefix)  { throw new RuntimeException(); }
  static public  java.lang.String asCode ()  { throw new RuntimeException(); }
  static public  java.lang.String toJSON ()  { throw new RuntimeException(); }
  static public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  static protected  scala.collection.immutable.List<scala.Tuple2<java.lang.String, org.json4s.JsonAST.JValue>> jsonFields ()  { throw new RuntimeException(); }
  static public  java.lang.String generateTreeString$default$5 ()  { throw new RuntimeException(); }
  static protected  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> getRelevantConstraints (scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> constraints)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.ExpressionSet constraints ()  { throw new RuntimeException(); }
  static protected  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> validConstraints ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet outputSet ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet references ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet inputSet ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet missingInput ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressions (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressionsDown (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressionsUp (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformAllExpressions (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  static public  java.lang.String schemaString ()  { throw new RuntimeException(); }
  static public  void printSchema ()  { throw new RuntimeException(); }
  static protected  java.lang.String statePrefix ()  { throw new RuntimeException(); }
  static public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  static public  java.lang.String verboseString ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<PlanType> subqueries ()  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.QueryPlan<?>> innerChildren ()  { throw new RuntimeException(); }
  static protected  PlanType canonicalized ()  { throw new RuntimeException(); }
  static public  boolean sameResult (PlanType plan)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSeq allAttributes ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression cleanExpression (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<java.lang.Object> cleanArgs ()  { throw new RuntimeException(); }
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
  static public final  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  static public  boolean subexpressionEliminationEnabled ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.SparkPlan makeCopy (java.lang.Object[] newArgs)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> metadata ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  static public  void resetMetrics ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.metric.SQLMetric longMetric (java.lang.String name)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredChildDistribution ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder>> requiredChildOrdering ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> execute ()  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> org.apache.spark.broadcast.Broadcast<T> executeBroadcast ()  { throw new RuntimeException(); }
  static protected final <T extends java.lang.Object> T executeQuery (scala.Function0<T> query)  { throw new RuntimeException(); }
  static protected  void prepareSubqueries ()  { throw new RuntimeException(); }
  static protected  void waitForSubqueries ()  { throw new RuntimeException(); }
  static public final  void prepare ()  { throw new RuntimeException(); }
  static protected  void doPrepare ()  { throw new RuntimeException(); }
  static protected <T extends java.lang.Object> org.apache.spark.broadcast.Broadcast<T> doExecuteBroadcast ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> executeToIterator ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Row[] executeCollectPublic ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.InternalRow[] executeTake (int n)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.MutableProjection newMutableProjection (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema, boolean useSubexprElimination)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.codegen.Predicate newPredicate (org.apache.spark.sql.catalyst.expressions.Expression expression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  static protected  scala.math.Ordering<org.apache.spark.sql.catalyst.InternalRow> newOrdering (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> order, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  static protected  scala.math.Ordering<org.apache.spark.sql.catalyst.InternalRow> newNaturalAscendingOrdering (scala.collection.Seq<org.apache.spark.sql.types.DataType> dataTypes)  { throw new RuntimeException(); }
  static protected  boolean newMutableProjection$default$3 ()  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.MetastoreRelation table ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, scala.Option<java.lang.String>> partition ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  public  boolean overwrite ()  { throw new RuntimeException(); }
  public  boolean ifNotExists ()  { throw new RuntimeException(); }
  // not preceding
  public   InsertIntoHiveTable (org.apache.spark.sql.hive.MetastoreRelation table, scala.collection.immutable.Map<java.lang.String, scala.Option<java.lang.String>> partition, org.apache.spark.sql.execution.SparkPlan child, boolean overwrite, boolean ifNotExists)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.hive.HiveSessionState sessionState ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.catalog.ExternalCatalog externalCatalog ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  public  java.lang.String stagingDir ()  { throw new RuntimeException(); }
  private  java.lang.String executionId ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path getStagingDir (org.apache.hadoop.fs.Path inputPath, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path getExternalScratchDir (java.net.URI extURI, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.Path getExternalTmpPath (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.Path getExtTmpPathRelTo (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  private  void saveAsHiveFile (org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> rdd, java.lang.Class<?> valueClass, org.apache.spark.sql.hive.HiveShim.ShimFileSinkDesc fileSinkConf, org.apache.spark.util.SerializableJobConf conf, org.apache.spark.sql.hive.SparkHiveWriterContainer writerContainer)  { throw new RuntimeException(); }
  /**
   * Inserts all the rows in the table into Hive.  Row objects are properly serialized with the
   * <code>org.apache.hadoop.hive.serde2.SerDe</code> and the
   * <code>org.apache.hadoop.mapred.OutputFormat</code> provided by the table definition.
   * <p>
   * Note: this is run once and then kept to avoid double insertions.
   * @return (undocumented)
   */
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> sideEffectResult ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow[] executeCollect ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
}
