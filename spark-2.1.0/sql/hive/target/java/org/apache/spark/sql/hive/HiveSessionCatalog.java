package org.apache.spark.sql.hive;
  class HiveSessionCatalog extends org.apache.spark.sql.catalyst.catalog.SessionCatalog {
  // not preceding
  public   HiveSessionCatalog (org.apache.spark.sql.hive.HiveExternalCatalog externalCatalog, org.apache.spark.sql.catalyst.catalog.GlobalTempViewManager globalTempViewManager, org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.catalyst.catalog.FunctionResourceLoader functionResourceLoader, org.apache.spark.sql.catalyst.analysis.FunctionRegistry functionRegistry, org.apache.spark.sql.internal.SQLConf conf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan lookupRelation (org.apache.spark.sql.catalyst.TableIdentifier name, scala.Option<java.lang.String> alias)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.hive.HiveMetastoreCatalog metastoreCatalog ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> ParquetConversions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> OrcConversions ()  { throw new RuntimeException(); }
  public  void refreshTable (org.apache.spark.sql.catalyst.TableIdentifier name)  { throw new RuntimeException(); }
  public  void invalidateCache ()  { throw new RuntimeException(); }
  public  java.lang.String hiveDefaultTableFilePath (org.apache.spark.sql.catalyst.TableIdentifier name)  { throw new RuntimeException(); }
    org.apache.spark.sql.catalyst.plans.logical.LogicalPlan getCachedDataSourceTable (org.apache.spark.sql.catalyst.TableIdentifier table)  { throw new RuntimeException(); }
  public  scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression> makeFunctionBuilder (java.lang.String funcName, java.lang.String className)  { throw new RuntimeException(); }
  /**
   * Construct a {@link FunctionBuilder} based on the provided class that represents a function.
   * @param name (undocumented)
   * @param clazz (undocumented)
   * @return (undocumented)
   */
  private  scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression> makeFunctionBuilder (java.lang.String name, java.lang.Class<?> clazz)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression lookupFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Expression lookupFunction0 (org.apache.spark.sql.catalyst.FunctionIdentifier name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  { throw new RuntimeException(); }
  /** List of functions we pass over to Hive. Note that over time this list should go to 0. */
  private  scala.collection.Seq<java.lang.String> hiveFunctions ()  { throw new RuntimeException(); }
}
