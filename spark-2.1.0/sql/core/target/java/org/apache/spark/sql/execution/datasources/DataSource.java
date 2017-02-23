package org.apache.spark.sql.execution.datasources;
/**
 * The main class responsible for representing a pluggable Data Source in Spark SQL. In addition to
 * acting as the canonical set of parameters that can describe a Data Source, this class is used to
 * resolve a description to a concrete implementation that can be used in a query plan
 * (either batch or streaming) or to write out data using an external library.
 * <p>
 * From an end user's perspective a DataSource description can be created explicitly using
 * {@link org.apache.spark.sql.DataFrameReader} or CREATE TABLE USING DDL.  Additionally, this class is
 * used when resolving a description from a metastore to a concrete implementation.
 * <p>
 * Many of the arguments to this class are optional, though depending on the specific API being used
 * these optional arguments might be filled in during resolution using either inference or external
 * metadata.  For example, when reading a partitioned table from a file system, partition columns
 * will be inferred from the directory layout even if they are not specified.
 * <p>
 * param:  paths A list of file system paths that hold data.  These will be globbed before and
 *              qualified. This option only works when reading from a {@link FileFormat}.
 * param:  userSpecifiedSchema An optional specification of the schema of the data. When present
 *                            we skip attempting to infer the schema.
 * param:  partitionColumns A list of column names that the relation is partitioned by. This list is
 *                         generally empty during the read path, unless this DataSource is managed
 *                         by Hive. In these cases, during <code>resolveRelation</code>, we will call
 *                         <code>getOrInferFileFormatSchema</code> for file based DataSources to infer the
 *                         partitioning. In other cases, if this list is empty, then this table
 *                         is unpartitioned.
 * param:  bucketSpec An optional specification for bucketing (hash-partitioning) of the data.
 * param:  catalogTable Optional catalog table reference that can be used to push down operations
 *                     over the datasource to the catalog service.
 */
public  class DataSource implements org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  public  class SourceInfo implements scala.Product, scala.Serializable {
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.String> partitionColumns ()  { throw new RuntimeException(); }
    // not preceding
    public   SourceInfo (java.lang.String name, org.apache.spark.sql.types.StructType schema, scala.collection.Seq<java.lang.String> partitionColumns)  { throw new RuntimeException(); }
  }
  public  class SourceInfo$ extends scala.runtime.AbstractFunction3<java.lang.String, org.apache.spark.sql.types.StructType, scala.collection.Seq<java.lang.String>, org.apache.spark.sql.execution.datasources.DataSource.SourceInfo> implements scala.Serializable {
    public   SourceInfo$ ()  { throw new RuntimeException(); }
  }
  /** A map to maintain backward compatibility in case we move data sources around. */
  static private  scala.collection.immutable.Map<java.lang.String, java.lang.String> backwardCompatibilityMap ()  { throw new RuntimeException(); }
  /**
   * Class that were removed in Spark 2.0. Used to detect incompatibility libraries for Spark 2.0.
   * @return (undocumented)
   */
  static private  scala.collection.immutable.Set<java.lang.String> spark2RemovedClasses ()  { throw new RuntimeException(); }
  /** Given a provider name, look up the data source class definition. */
  static public  java.lang.Class<?> lookupDataSource (java.lang.String provider)  { throw new RuntimeException(); }
  /**
   * When creating a data source table, the <code>path</code> option has a special meaning: the table location.
   * This method extracts the <code>path</code> option and treat it as table location to build a
   * {@link CatalogStorageFormat}. Note that, the <code>path</code> option is removed from options after this.
   * @param options (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat buildStorageFormatFromOptions (scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
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
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  public  java.lang.String className ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> paths ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> userSpecifiedSchema ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> partitionColumns ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.BucketSpec> bucketSpec ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> options ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogTable> catalogTable ()  { throw new RuntimeException(); }
  // not preceding
  public   DataSource (org.apache.spark.sql.SparkSession sparkSession, java.lang.String className, scala.collection.Seq<java.lang.String> paths, scala.Option<org.apache.spark.sql.types.StructType> userSpecifiedSchema, scala.collection.Seq<java.lang.String> partitionColumns, scala.Option<org.apache.spark.sql.catalyst.catalog.BucketSpec> bucketSpec, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogTable> catalogTable)  { throw new RuntimeException(); }
  public  java.lang.Class<?> providingClass ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.DataSource.SourceInfo sourceInfo ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.util.CaseInsensitiveMap caseInsensitiveOptions ()  { throw new RuntimeException(); }
  /**
   * Get the schema of the given FileFormat, if provided by <code>userSpecifiedSchema</code>, or try to infer
   * it. In the read path, only managed tables by Hive provide the partition columns properly when
   * initializing this class. All other file based data sources will try to infer the partitioning,
   * and then cast the inferred types to user specified dataTypes if the partition columns exist
   * inside <code>userSpecifiedSchema</code>, otherwise we can hit data corruption bugs like SPARK-18510.
   * This method will try to skip file scanning whether <code>userSpecifiedSchema</code> and
   * <code>partitionColumns</code> are provided. Here are some code paths that use this method:
   *   1. <code>spark.read</code> (no schema): Most amount of work. Infer both schema and partitioning columns
   *   2. <code>spark.read.schema(userSpecifiedSchema)</code>: Parse partitioning columns, cast them to the
   *     dataTypes provided in <code>userSpecifiedSchema</code> if they exist or fallback to inferred
   *     dataType if they don't.
   *   3. <code>spark.readStream.schema(userSpecifiedSchema)</code>: For streaming use cases, users have to
   *     provide the schema. Here, we also perform partition inference like 2, and try to use
   *     dataTypes in <code>userSpecifiedSchema</code>. All subsequent triggers for this stream will re-use
   *     this information, therefore calls to this method should be very cheap, i.e. there won't
   *     be any further inference in any triggers.
   *   4. <code>df.saveAsTable(tableThatExisted)</code>: In this case, we call this method to resolve the
   *     existing table's partitioning scheme. This is achieved by not providing
   *     <code>userSpecifiedSchema</code>. For this case, we add the boolean <code>justPartitioning</code> for an early
   *     exit, if we don't care about the schema of the original table.
   * <p>
   * @param format the file format object for this DataSource
   * @param justPartitioning Whether to exit early and provide just the schema partitioning.
   * @return A pair of the data schema (excluding partition columns) and the schema of the partition
   *         columns. If <code>justPartitioning</code> is <code>true</code>, then the dataSchema will be provided as
   *         <code>null</code>.
   */
  private  scala.Tuple2<org.apache.spark.sql.types.StructType, org.apache.spark.sql.types.StructType> getOrInferFileFormatSchema (org.apache.spark.sql.execution.datasources.FileFormat format, boolean justPartitioning)  { throw new RuntimeException(); }
  /** Returns the name and schema of the source that can be used to continually read data. */
  private  org.apache.spark.sql.execution.datasources.DataSource.SourceInfo sourceSchema ()  { throw new RuntimeException(); }
  /** Returns a source that can be used to continually read data. */
  public  org.apache.spark.sql.execution.streaming.Source createSource (java.lang.String metadataPath)  { throw new RuntimeException(); }
  /** Returns a sink that can be used to continually write data. */
  public  org.apache.spark.sql.execution.streaming.Sink createSink (org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  /**
   * Returns true if there is a single path that has a metadata log indicating which files should
   * be read.
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  boolean hasMetadata (scala.collection.Seq<java.lang.String> path)  { throw new RuntimeException(); }
  /**
   * Create a resolved {@link BaseRelation} that can be used to read data from or write data into this
   * {@link DataSource}
   * <p>
   * @param checkFilesExist Whether to confirm that the files exist when generating the
   *                        non-streaming file based datasource. StructuredStreaming jobs already
   *                        list file existence, and when generating incremental jobs, the batch
   *                        is considered as a non-streaming file based data source. Since we know
   *                        that files already exist, we don't need to check them again.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.sources.BaseRelation resolveRelation (boolean checkFilesExist)  { throw new RuntimeException(); }
  /** Writes the given {@link DataFrame} out to this {@link DataSource}. */
  public  org.apache.spark.sql.sources.BaseRelation write (org.apache.spark.sql.SaveMode mode, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data)  { throw new RuntimeException(); }
}
