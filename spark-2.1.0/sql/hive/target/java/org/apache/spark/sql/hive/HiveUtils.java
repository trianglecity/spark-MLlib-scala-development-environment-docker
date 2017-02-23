package org.apache.spark.sql.hive;
public  class HiveUtils {
  static public  org.apache.spark.SparkContext withHiveExternalCatalog (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /** The version of hive used internally by Spark SQL. */
  static public  java.lang.String hiveExecutionVersion ()  { throw new RuntimeException(); }
  /**
   * The property key that is used to store the raw hive type string in the metadata of StructField.
   * For example, in the case where the Hive type is varchar, the type gets mapped to a string type
   * in Spark SQL, but we need to preserve the original type in order to invoke the correct object
   * inspector in Hive.
   * @return (undocumented)
   */
  static public  java.lang.String hiveTypeString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> HIVE_METASTORE_VERSION ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> HIVE_EXECUTION_VERSION ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> HIVE_METASTORE_JARS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CONVERT_METASTORE_PARQUET ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CONVERT_METASTORE_PARQUET_WITH_SCHEMA_MERGING ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CONVERT_METASTORE_ORC ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<scala.collection.Seq<java.lang.String>> HIVE_METASTORE_SHARED_PREFIXES ()  { throw new RuntimeException(); }
  static private  scala.collection.Seq<java.lang.String> jdbcPrefixes ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<scala.collection.Seq<java.lang.String>> HIVE_METASTORE_BARRIER_PREFIXES ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> HIVE_THRIFT_SERVER_ASYNC ()  { throw new RuntimeException(); }
  /**
   * The version of the hive client that will be used to communicate with the metastore.  Note that
   * this does not necessarily need to be the same version of Hive that is used internally by
   * Spark SQL for execution.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static private  java.lang.String hiveMetastoreVersion (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  /**
   * The location of the jars that should be used to instantiate the HiveMetastoreClient.  This
   * property can be one of three options:
   *  - a classpath in the standard format for both hive and hadoop.
   *  - builtin - attempt to discover the jars that were used to load Spark SQL and use those. This
   *              option is only valid when using the execution version of Hive.
   *  - maven - download the correct version of hive on demand from maven.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static private  java.lang.String hiveMetastoreJars (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  /**
   * A comma separated list of class prefixes that should be loaded using the classloader that
   * is shared between Spark SQL and a specific version of Hive. An example of classes that should
   * be shared is JDBC drivers that are needed to talk to the metastore. Other classes that need
   * to be shared are those that interact with classes that are already shared.  For example,
   * custom appenders that are used by log4j.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static private  scala.collection.Seq<java.lang.String> hiveMetastoreSharedPrefixes (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  /**
   * A comma separated list of class prefixes that should explicitly be reloaded for each version
   * of Hive that Spark SQL is communicating with.  For example, Hive UDFs that are declared in a
   * prefix that typically would be shared (i.e. org.apache.spark.*)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static private  scala.collection.Seq<java.lang.String> hiveMetastoreBarrierPrefixes (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  /**
   * Configurations needed to create a {@link HiveClient}.
   * @param hadoopConf (undocumented)
   * @return (undocumented)
   */
  static   scala.collection.immutable.Map<java.lang.String, java.lang.String> hiveClientConfigurations (org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /**
   * Create a {@link HiveClient} used for execution.
   * <p>
   * Currently this must always be Hive 13 as this is the version of Hive that is packaged
   * with Spark SQL. This copy of the client is used for execution related tasks like
   * registering temporary functions or ensuring that the ThreadLocal SessionState is
   * correctly populated.  This copy of Hive is *not* used for storing persistent metadata,
   * and only point to a dummy metastore in a temporary directory.
   * @param conf (undocumented)
   * @param hadoopConf (undocumented)
   * @return (undocumented)
   */
  static protected  org.apache.spark.sql.hive.client.HiveClientImpl newClientForExecution (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /**
   * Create a {@link HiveClient} used to retrieve metadata from the Hive MetaStore.
   * <p>
   * The version of the Hive client that is used here must match the metastore that is configured
   * in the hive-site.xml file.
   * @param conf (undocumented)
   * @param hadoopConf (undocumented)
   * @return (undocumented)
   */
  static protected  org.apache.spark.sql.hive.client.HiveClient newClientForMetadata (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.hive.client.HiveClient newClientForMetadata (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf, scala.collection.immutable.Map<java.lang.String, java.lang.String> configurations)  { throw new RuntimeException(); }
  /** Constructs a configuration for hive, where the metastore is located in a temp directory. */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> newTemporaryConfiguration (boolean useInMemoryDerby)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.types.AtomicType> primitiveTypes ()  { throw new RuntimeException(); }
  static protected  java.lang.String toHiveString (scala.Tuple2<java.lang.Object, org.apache.spark.sql.types.DataType> a)  { throw new RuntimeException(); }
  /** Hive outputs fields of structs slightly differently than top level attributes. */
  static protected  java.lang.String toHiveStructString (scala.Tuple2<java.lang.Object, org.apache.spark.sql.types.DataType> a)  { throw new RuntimeException(); }
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
}
