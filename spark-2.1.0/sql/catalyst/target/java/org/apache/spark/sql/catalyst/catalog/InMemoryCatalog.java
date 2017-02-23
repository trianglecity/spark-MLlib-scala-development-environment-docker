package org.apache.spark.sql.catalyst.catalog;
/**
 * An in-memory (ephemeral) implementation of the system catalog.
 * <p>
 * This is a dummy implementation that does not require setting up external systems.
 * It is intended for testing or exploration purposes only and should not be used
 * in production.
 * <p>
 * All public methods should be synchronized for thread-safety.
 */
public  class InMemoryCatalog extends org.apache.spark.sql.catalyst.catalog.ExternalCatalog {
  private  class TableDesc {
    public  org.apache.spark.sql.catalyst.catalog.CatalogTable table ()  { throw new RuntimeException(); }
    // not preceding
    public   TableDesc (org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
    public  scala.collection.mutable.HashMap<scala.collection.immutable.Map<java.lang.String, java.lang.String>, org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> partitions ()  { throw new RuntimeException(); }
  }
  private  class DatabaseDesc {
    public  org.apache.spark.sql.catalyst.catalog.CatalogDatabase db ()  { throw new RuntimeException(); }
    // not preceding
    public   DatabaseDesc (org.apache.spark.sql.catalyst.catalog.CatalogDatabase db)  { throw new RuntimeException(); }
    public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.sql.catalyst.catalog.InMemoryCatalog.TableDesc> tables ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.sql.catalyst.catalog.CatalogFunction> functions ()  { throw new RuntimeException(); }
  }
  static protected  void requireDbExists (java.lang.String db)  { throw new RuntimeException(); }
  static protected  void requireTableExists (java.lang.String db, java.lang.String table)  { throw new RuntimeException(); }
  static protected  void requireFunctionExists (java.lang.String db, java.lang.String funcName)  { throw new RuntimeException(); }
  static protected  void requireFunctionNotExists (java.lang.String db, java.lang.String funcName)  { throw new RuntimeException(); }
  static public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> listPartitionNames$default$3 ()  { throw new RuntimeException(); }
  static public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> listPartitions$default$3 ()  { throw new RuntimeException(); }
  public   InMemoryCatalog (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConfig)  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.sql.catalyst.catalog.InMemoryCatalog.DatabaseDesc> catalog ()  { throw new RuntimeException(); }
  private  boolean partitionExists (java.lang.String db, java.lang.String table, scala.collection.immutable.Map<java.lang.String, java.lang.String> spec)  { throw new RuntimeException(); }
  private  void requireTableNotExists (java.lang.String db, java.lang.String table)  { throw new RuntimeException(); }
  private  void requirePartitionsExist (java.lang.String db, java.lang.String table, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> specs)  { throw new RuntimeException(); }
  private  void requirePartitionsNotExist (java.lang.String db, java.lang.String table, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> specs)  { throw new RuntimeException(); }
  public  void createDatabase (org.apache.spark.sql.catalyst.catalog.CatalogDatabase dbDefinition, boolean ignoreIfExists)  { throw new RuntimeException(); }
  public  void dropDatabase (java.lang.String db, boolean ignoreIfNotExists, boolean cascade)  { throw new RuntimeException(); }
  public  void alterDatabase (org.apache.spark.sql.catalyst.catalog.CatalogDatabase dbDefinition)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogDatabase getDatabase (java.lang.String db)  { throw new RuntimeException(); }
  public  boolean databaseExists (java.lang.String db)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listDatabases ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listDatabases (java.lang.String pattern)  { throw new RuntimeException(); }
  public  void setCurrentDatabase (java.lang.String db)  { throw new RuntimeException(); }
  public  void createTable (org.apache.spark.sql.catalyst.catalog.CatalogTable tableDefinition, boolean ignoreIfExists)  { throw new RuntimeException(); }
  public  void dropTable (java.lang.String db, java.lang.String table, boolean ignoreIfNotExists, boolean purge)  { throw new RuntimeException(); }
  public  void renameTable (java.lang.String db, java.lang.String oldName, java.lang.String newName)  { throw new RuntimeException(); }
  public  void alterTable (org.apache.spark.sql.catalyst.catalog.CatalogTable tableDefinition)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogTable getTable (java.lang.String db, java.lang.String table)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogTable> getTableOption (java.lang.String db, java.lang.String table)  { throw new RuntimeException(); }
  public  boolean tableExists (java.lang.String db, java.lang.String table)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listTables (java.lang.String db)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listTables (java.lang.String db, java.lang.String pattern)  { throw new RuntimeException(); }
  public  void loadTable (java.lang.String db, java.lang.String table, java.lang.String loadPath, boolean isOverwrite, boolean holdDDLTime)  { throw new RuntimeException(); }
  public  void loadPartition (java.lang.String db, java.lang.String table, java.lang.String loadPath, scala.collection.immutable.Map<java.lang.String, java.lang.String> partition, boolean isOverwrite, boolean holdDDLTime, boolean inheritTableSpecs)  { throw new RuntimeException(); }
  public  void loadDynamicPartitions (java.lang.String db, java.lang.String table, java.lang.String loadPath, scala.collection.immutable.Map<java.lang.String, java.lang.String> partition, boolean replace, int numDP, boolean holdDDLTime)  { throw new RuntimeException(); }
  public  void createPartitions (java.lang.String db, java.lang.String table, scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> parts, boolean ignoreIfExists)  { throw new RuntimeException(); }
  public  void dropPartitions (java.lang.String db, java.lang.String table, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partSpecs, boolean ignoreIfNotExists, boolean purge, boolean retainData)  { throw new RuntimeException(); }
  public  void renamePartitions (java.lang.String db, java.lang.String table, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> specs, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> newSpecs)  { throw new RuntimeException(); }
  public  void alterPartitions (java.lang.String db, java.lang.String table, scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> parts)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogTablePartition getPartition (java.lang.String db, java.lang.String table, scala.collection.immutable.Map<java.lang.String, java.lang.String> spec)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> getPartitionOption (java.lang.String db, java.lang.String table, scala.collection.immutable.Map<java.lang.String, java.lang.String> spec)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listPartitionNames (java.lang.String db, java.lang.String table, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partialSpec)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> listPartitions (java.lang.String db, java.lang.String table, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partialSpec)  { throw new RuntimeException(); }
  /**
   * Returns true if <code>spec1</code> is a partial partition spec w.r.t. <code>spec2</code>, e.g. PARTITION (a=1) is a
   * partial partition spec w.r.t. PARTITION (a=1,b=2).
   * @param spec1 (undocumented)
   * @param spec2 (undocumented)
   * @return (undocumented)
   */
  private  boolean isPartialPartitionSpec (scala.collection.immutable.Map<java.lang.String, java.lang.String> spec1, scala.collection.immutable.Map<java.lang.String, java.lang.String> spec2)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> listPartitionsByFilter (java.lang.String db, java.lang.String table, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates)  { throw new RuntimeException(); }
  public  void createFunction (java.lang.String db, org.apache.spark.sql.catalyst.catalog.CatalogFunction func)  { throw new RuntimeException(); }
  public  void dropFunction (java.lang.String db, java.lang.String funcName)  { throw new RuntimeException(); }
  public  void renameFunction (java.lang.String db, java.lang.String oldName, java.lang.String newName)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogFunction getFunction (java.lang.String db, java.lang.String funcName)  { throw new RuntimeException(); }
  public  boolean functionExists (java.lang.String db, java.lang.String funcName)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listFunctions (java.lang.String db, java.lang.String pattern)  { throw new RuntimeException(); }
}
