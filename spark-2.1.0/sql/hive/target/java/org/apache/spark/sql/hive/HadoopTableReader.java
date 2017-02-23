package org.apache.spark.sql.hive;
/**
 * Helper class for scanning tables stored in Hadoop - e.g., to read Hive tables that reside in the
 * data warehouse directory.
 */
  class HadoopTableReader implements org.apache.spark.sql.hive.TableReader, org.apache.spark.internal.Logging {
  /**
   * Curried. After given an argument for 'path', the resulting JobConf =&gt; Unit closure is used to
   * instantiate a HadoopRDD.
   * @param path (undocumented)
   * @param tableDesc (undocumented)
   * @param jobConf (undocumented)
   */
  static public  void initializeLocalJobConfFunc (java.lang.String path, org.apache.hadoop.hive.ql.plan.TableDesc tableDesc, org.apache.hadoop.mapred.JobConf jobConf)  { throw new RuntimeException(); }
  /**
   * Transform all given raw <code>Writable</code>s into <code>Row</code>s.
   * <p>
   * @param iterator Iterator of all <code>Writable</code>s to be transformed
   * @param rawDeser The <code>Deserializer</code> associated with the input <code>Writable</code>
   * @param nonPartitionKeyAttrs Attributes that should be filled together with their corresponding
   *                             positions in the output schema
   * @param mutableRow A reusable <code>MutableRow</code> that should be filled
   * @param tableDeser Table Deserializer
   * @return An <code>Iterator[Row]</code> transformed from <code>iterator</code>
   */
  static public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> fillObject (scala.collection.Iterator<org.apache.hadoop.io.Writable> iterator, org.apache.hadoop.hive.serde2.Deserializer rawDeser, scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Attribute, java.lang.Object>> nonPartitionKeyAttrs, org.apache.spark.sql.catalyst.InternalRow mutableRow, org.apache.hadoop.hive.serde2.Deserializer tableDeser)  { throw new RuntimeException(); }
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
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> attributes ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.hive.MetastoreRelation relation ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  // not preceding
  public   HadoopTableReader (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> attributes, org.apache.spark.sql.hive.MetastoreRelation relation, org.apache.spark.sql.SparkSession sparkSession, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  private  int _minSplitsPerRDD ()  { throw new RuntimeException(); }
  private  org.apache.spark.broadcast.Broadcast<org.apache.spark.util.SerializableConfiguration> _broadcastedHadoopConf ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> makeRDDForTable (org.apache.hadoop.hive.ql.metadata.Table hiveTable)  { throw new RuntimeException(); }
  /**
   * Creates a Hadoop RDD to read data from the target table's data directory. Returns a transformed
   * RDD that contains deserialized rows.
   * <p>
   * @param hiveTable Hive metadata for the table being scanned.
   * @param deserializerClass Class of the SerDe used to deserialize Writables read from Hadoop.
   * @param filterOpt If defined, then the filter is used to reject files contained in the data
   *                  directory being read. If None, then all files are accepted.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> makeRDDForTable (org.apache.hadoop.hive.ql.metadata.Table hiveTable, java.lang.Class<? extends org.apache.hadoop.hive.serde2.Deserializer> deserializerClass, scala.Option<org.apache.hadoop.fs.PathFilter> filterOpt)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> makeRDDForPartitionedTable (scala.collection.Seq<org.apache.hadoop.hive.ql.metadata.Partition> partitions)  { throw new RuntimeException(); }
  /**
   * Create a HadoopRDD for every partition key specified in the query. Note that for on-disk Hive
   * tables, a data directory is created for each partition corresponding to keys specified using
   * 'PARTITION BY'.
   * <p>
   * @param partitionToDeserializer Mapping from a Hive Partition metadata object to the SerDe
   *     class to use to deserialize input Writables from the corresponding partition.
   * @param filterOpt If defined, then the filter is used to reject files contained in the data
   *     subdirectory of each partition being read. If None, then all files are accepted.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> makeRDDForPartitionedTable (scala.collection.immutable.Map<org.apache.hadoop.hive.ql.metadata.Partition, java.lang.Class<? extends org.apache.hadoop.hive.serde2.Deserializer>> partitionToDeserializer, scala.Option<org.apache.hadoop.fs.PathFilter> filterOpt)  { throw new RuntimeException(); }
  /**
   * If <code>filterOpt</code> is defined, then it will be used to filter files from <code>path</code>. These files are
   * returned in a single, comma-separated string.
   * @param path (undocumented)
   * @param filterOpt (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String applyFilterIfNeeded (org.apache.hadoop.fs.Path path, scala.Option<org.apache.hadoop.fs.PathFilter> filterOpt)  { throw new RuntimeException(); }
  /**
   * Creates a HadoopRDD based on the broadcasted HiveConf and other job properties that will be
   * applied locally on each slave.
   * @param tableDesc (undocumented)
   * @param path (undocumented)
   * @param inputFormatClass (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.rdd.RDD<org.apache.hadoop.io.Writable> createHadoopRdd (org.apache.hadoop.hive.ql.plan.TableDesc tableDesc, java.lang.String path, java.lang.Class<org.apache.hadoop.mapred.InputFormat<org.apache.hadoop.io.Writable, org.apache.hadoop.io.Writable>> inputFormatClass)  { throw new RuntimeException(); }
}
