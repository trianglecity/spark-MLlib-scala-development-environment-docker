package org.apache.spark.sql.internal;
/**
 * A class that holds all session-specific state in a given {@link SparkSession}.
 */
  class SessionState {
  public   SessionState (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  /**
   * SQL-specific key-value configurations.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration newHadoopConf ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration newHadoopConfWithOptions (scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.ExperimentalMethods experimentalMethods ()  { throw new RuntimeException(); }
  /**
   * Internal catalog for managing functions registered by the user.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.FunctionRegistry functionRegistry ()  { throw new RuntimeException(); }
  /**
   * A class for loading resources specified by a function.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.FunctionResourceLoader functionResourceLoader ()  { throw new RuntimeException(); }
  /**
   * Internal catalog for managing table and database states.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog ()  { throw new RuntimeException(); }
  /**
   * Interface exposed to the user for registering user-defined functions.
   * Note that the user-defined functions must be deterministic.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.UDFRegistration udf ()  { throw new RuntimeException(); }
  /**
   * Logical query plan analyzer for resolving unresolved attributes and relations.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer analyzer ()  { throw new RuntimeException(); }
  /**
   * Logical query plan optimizer.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.optimizer.Optimizer optimizer ()  { throw new RuntimeException(); }
  /**
   * Parser that extracts expressions, plans, table identifiers etc. from SQL texts.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.parser.ParserInterface sqlParser ()  { throw new RuntimeException(); }
  /**
   * Planner that converts optimized logical plans to physical plans.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.SparkPlanner planner ()  { throw new RuntimeException(); }
  /**
   * An interface to register custom {@link org.apache.spark.sql.util.QueryExecutionListener}s
   * that listen for execution metrics.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.util.ExecutionListenerManager listenerManager ()  { throw new RuntimeException(); }
  /**
   * Interface to start and stop {@link StreamingQuery}s.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.StreamingQueryManager streamingQueryManager ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.internal.NonClosableMutableURLClassLoader jarClassLoader ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.QueryExecution executePlan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  void refreshTable (java.lang.String tableName)  { throw new RuntimeException(); }
  public  void addJar (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Analyzes the given table in the current database to generate statistics, which will be
   * used in query optimizations.
   * @param tableIdent (undocumented)
   * @param noscan (undocumented)
   */
  public  void analyze (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, boolean noscan)  { throw new RuntimeException(); }
}
