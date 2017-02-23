package org.apache.spark.sql.execution.datasources;
/**
 * A Strategy for planning scans over data sources defined using the sources API.
 */
public  class DataSourceStrategy {
  static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static public  int getBucketId (org.apache.spark.sql.catalyst.expressions.Attribute bucketColumn, int numBuckets, Object value)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.execution.SparkPlan pruneFilterProject (org.apache.spark.sql.execution.datasources.LogicalRelation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projects, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filterPredicates, scala.Function2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, org.apache.spark.sql.sources.Filter[], org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow>> scanBuilder)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.execution.SparkPlan pruneFilterProjectRaw (org.apache.spark.sql.execution.datasources.LogicalRelation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projects, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filterPredicates, scala.Function3<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.sources.Filter>, org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow>> scanBuilder)  { throw new RuntimeException(); }
  /**
   * Convert RDD of Row into RDD of InternalRow with objects in catalyst types
   * @param relation (undocumented)
   * @param output (undocumented)
   * @param rdd (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> toCatalystRDD (org.apache.spark.sql.execution.datasources.LogicalRelation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> rdd)  { throw new RuntimeException(); }
  /**
   * Convert RDD of Row into RDD of InternalRow with objects in catalyst types
   * @param relation (undocumented)
   * @param rdd (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> toCatalystRDD (org.apache.spark.sql.execution.datasources.LogicalRelation relation, org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> rdd)  { throw new RuntimeException(); }
  /**
   * Tries to translate a Catalyst {@link Expression} into data source {@link Filter}.
   * <p>
   * @return a <code>Some[Filter]</code> if the input {@link Expression} is convertible, otherwise a <code>None</code>.
   * @param predicate (undocumented)
   */
  static protected  scala.Option<org.apache.spark.sql.sources.Filter> translateFilter (org.apache.spark.sql.catalyst.expressions.Expression predicate)  { throw new RuntimeException(); }
  /**
   * Selects Catalyst predicate {@link Expression}s which are convertible into data source {@link Filter}s
   * and can be handled by <code>relation</code>.
   * <p>
   * @return A triplet of <code>Seq[Expression]</code>, <code>Seq[Filter]</code>, and <code>Seq[Filter]</code> . The first element
   *         contains all Catalyst predicate {@link Expression}s that are either not convertible or
   *         cannot be handled by <code>relation</code>. The second element contains all converted data source
   *         {@link Filter}s that will be pushed down to the data source. The third element contains
   *         all {@link Filter}s that are completely filtered at the DataSource.
   * @param relation (undocumented)
   * @param predicates (undocumented)
   */
  static protected  scala.Tuple3<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.sources.Filter>, scala.collection.immutable.Set<org.apache.spark.sql.sources.Filter>> selectFilters (org.apache.spark.sql.sources.BaseRelation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates)  { throw new RuntimeException(); }
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
  static protected  org.apache.spark.sql.execution.SparkPlan planLater (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
