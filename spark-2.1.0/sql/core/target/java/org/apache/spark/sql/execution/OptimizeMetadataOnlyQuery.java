package org.apache.spark.sql.execution;
/**
 * This rule optimizes the execution of queries that can be answered by looking only at
 * partition-level metadata. This applies when all the columns scanned are partition columns, and
 * the query has an aggregate operator that satisfies the following conditions:
 * 1. aggregate expression is partition columns.
 *  e.g. SELECT col FROM tbl GROUP BY col.
 * 2. aggregate function on partition columns with DISTINCT.
 *  e.g. SELECT col1, count(DISTINCT col2) FROM tbl GROUP BY col1.
 * 3. aggregate function on partition columns which have same result w or w/o DISTINCT keyword.
 *  e.g. SELECT col1, Max(col2) FROM tbl GROUP BY col1.
 */
public  class OptimizeMetadataOnlyQuery extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements scala.Product, scala.Serializable {
  /**
   * A pattern that finds the partitioned table relation node inside the given plan, and returns a
   * pair of the partition attributes and the table relation node.
   * <p>
   * It keeps traversing down the given plan tree if there is a {@link Project} or {@link Filter} with
   * deterministic expressions, and returns result after reaching the partitioned table relation
   * node.
   */
  public  class PartitionedRelation$ {
    public   PartitionedRelation$ ()  { throw new RuntimeException(); }
    public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.AttributeSet, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> unapply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
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
  static public  java.lang.String ruleName ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   OptimizeMetadataOnlyQuery (org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog, org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Returns the partition attributes of the table relation plan.
   * @param partitionColumnNames (undocumented)
   * @param relation (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> getPartitionAttrs (scala.collection.Seq<java.lang.String> partitionColumnNames, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan relation)  { throw new RuntimeException(); }
  /**
   * Transform the given plan, find its table scan nodes that matches the given relation, and then
   * replace the table scan node with its corresponding partition values.
   * @param child (undocumented)
   * @param relation (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan replaceTableScanWithPartitionMetadata (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan relation)  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.OptimizeMetadataOnlyQuery.PartitionedRelation$ PartitionedRelation ()  { throw new RuntimeException(); }
}
