package org.apache.spark.sql.hive;
public  class HiveUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HiveUtils$ MODULE$ = null;
  public   HiveUtils$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext withHiveExternalCatalog (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /** The version of hive used internally by Spark SQL. */
  public  java.lang.String hiveExecutionVersion ()  { throw new RuntimeException(); }
  /**
   * The property key that is used to store the raw hive type string in the metadata of StructField.
   * For example, in the case where the Hive type is varchar, the type gets mapped to a string type
   * in Spark SQL, but we need to preserve the original type in order to invoke the correct object
   * inspector in Hive.
   * @return (undocumented)
   */
  public  java.lang.String hiveTypeString ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> HIVE_METASTORE_VERSION ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> HIVE_EXECUTION_VERSION ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> HIVE_METASTORE_JARS ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CONVERT_METASTORE_PARQUET ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CONVERT_METASTORE_PARQUET_WITH_SCHEMA_MERGING ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CONVERT_METASTORE_ORC ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<scala.collection.Seq<java.lang.String>> HIVE_METASTORE_SHARED_PREFIXES ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> jdbcPrefixes ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<scala.collection.Seq<java.lang.String>> HIVE_METASTORE_BARRIER_PREFIXES ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> HIVE_THRIFT_SERVER_ASYNC ()  { throw new RuntimeException(); }
  /**
   * The version of the hive client that will be used to communicate with the metastore.  Note that
   * this does not necessarily need to be the same version of Hive that is used internally by
   * Spark SQL for execution.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String hiveMetastoreVersion (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
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
  private  java.lang.String hiveMetastoreJars (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  /**
   * A comma separated list of class prefixes that should be loaded using the classloader that
   * is shared between Spark SQL and a specific version of Hive. An example of classes that should
   * be shared is JDBC drivers that are needed to talk to the metastore. Other classes that need
   * to be shared are those that interact with classes that are already shared.  For example,
   * custom appenders that are used by log4j.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<java.lang.String> hiveMetastoreSharedPrefixes (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  /**
   * A comma separated list of class prefixes that should explicitly be reloaded for each version
   * of Hive that Spark SQL is communicating with.  For example, Hive UDFs that are declared in a
   * prefix that typically would be shared (i.e. org.apache.spark.*)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<java.lang.String> hiveMetastoreBarrierPrefixes (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  /**
   * Configurations needed to create a {@link HiveClient}.
   * @param hadoopConf (undocumented)
   * @return (undocumented)
   */
    scala.collection.immutable.Map<java.lang.String, java.lang.String> hiveClientConfigurations (org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
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
  protected  org.apache.spark.sql.hive.client.HiveClientImpl newClientForExecution (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /**
   * Create a {@link HiveClient} used to retrieve metadata from the Hive MetaStore.
   * <p>
   * The version of the Hive client that is used here must match the metastore that is configured
   * in the hive-site.xml file.
   * @param conf (undocumented)
   * @param hadoopConf (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.hive.client.HiveClient newClientForMetadata (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.hive.client.HiveClient newClientForMetadata (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf, scala.collection.immutable.Map<java.lang.String, java.lang.String> configurations)  { throw new RuntimeException(); }
  /** Constructs a configuration for hive, where the metastore is located in a temp directory. */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> newTemporaryConfiguration (boolean useInMemoryDerby)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.types.AtomicType> primitiveTypes ()  { throw new RuntimeException(); }
  protected  java.lang.String toHiveString (scala.Tuple2<java.lang.Object, org.apache.spark.sql.types.DataType> a)  { throw new RuntimeException(); }
  /** Hive outputs fields of structs slightly differently than top level attributes. */
  protected  java.lang.String toHiveStructString (scala.Tuple2<java.lang.Object, org.apache.spark.sql.types.DataType> a)  { throw new RuntimeException(); }
}
