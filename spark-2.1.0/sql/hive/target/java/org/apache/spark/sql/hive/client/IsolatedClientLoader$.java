package org.apache.spark.sql.hive.client;
/** Factory for `IsolatedClientLoader` with specific versions of hive. */
public  class IsolatedClientLoader$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final IsolatedClientLoader$ MODULE$ = null;
  public   IsolatedClientLoader$ ()  { throw new RuntimeException(); }
  /**
   * Creates isolated Hive client loaders by downloading the requested version from maven.
   * @param hiveMetastoreVersion (undocumented)
   * @param hadoopVersion (undocumented)
   * @param sparkConf (undocumented)
   * @param hadoopConf (undocumented)
   * @param config (undocumented)
   * @param ivyPath (undocumented)
   * @param sharedPrefixes (undocumented)
   * @param barrierPrefixes (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.hive.client.IsolatedClientLoader forVersion (java.lang.String hiveMetastoreVersion, java.lang.String hadoopVersion, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf, scala.collection.immutable.Map<java.lang.String, java.lang.String> config, scala.Option<java.lang.String> ivyPath, scala.collection.Seq<java.lang.String> sharedPrefixes, scala.collection.Seq<java.lang.String> barrierPrefixes)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.client.HiveVersion hiveVersion (java.lang.String version)  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.net.URL> downloadVersion (org.apache.spark.sql.hive.client.HiveVersion version, java.lang.String hadoopVersion, scala.Option<java.lang.String> ivyPath)  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<scala.Tuple2<org.apache.spark.sql.hive.client.HiveVersion, java.lang.String>, scala.collection.Seq<java.net.URL>> resolvedVersions ()  { throw new RuntimeException(); }
}
