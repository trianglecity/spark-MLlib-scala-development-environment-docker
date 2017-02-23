package org.apache.spark.sql.hive.client;
  class IsolatedClientLoader implements org.apache.spark.internal.Logging {
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
  static public  org.apache.spark.sql.hive.client.IsolatedClientLoader forVersion (java.lang.String hiveMetastoreVersion, java.lang.String hadoopVersion, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf, scala.collection.immutable.Map<java.lang.String, java.lang.String> config, scala.Option<java.lang.String> ivyPath, scala.collection.Seq<java.lang.String> sharedPrefixes, scala.collection.Seq<java.lang.String> barrierPrefixes)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.hive.client.HiveVersion hiveVersion (java.lang.String version)  { throw new RuntimeException(); }
  static private  scala.collection.Seq<java.net.URL> downloadVersion (org.apache.spark.sql.hive.client.HiveVersion version, java.lang.String hadoopVersion, scala.Option<java.lang.String> ivyPath)  { throw new RuntimeException(); }
  static private  scala.collection.mutable.HashMap<scala.Tuple2<org.apache.spark.sql.hive.client.HiveVersion, java.lang.String>, scala.collection.Seq<java.net.URL>> resolvedVersions ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.sql.hive.client.HiveVersion version ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.net.URL> execJars ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> config ()  { throw new RuntimeException(); }
  public  boolean isolationOn ()  { throw new RuntimeException(); }
  public  boolean sharesHadoopClasses ()  { throw new RuntimeException(); }
  public  java.lang.ClassLoader rootClassLoader ()  { throw new RuntimeException(); }
  public  java.lang.ClassLoader baseClassLoader ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> sharedPrefixes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> barrierPrefixes ()  { throw new RuntimeException(); }
  public   IsolatedClientLoader (org.apache.spark.sql.hive.client.HiveVersion version, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf, scala.collection.Seq<java.net.URL> execJars, scala.collection.immutable.Map<java.lang.String, java.lang.String> config, boolean isolationOn, boolean sharesHadoopClasses, java.lang.ClassLoader rootClassLoader, java.lang.ClassLoader baseClassLoader, scala.collection.Seq<java.lang.String> sharedPrefixes, scala.collection.Seq<java.lang.String> barrierPrefixes)  { throw new RuntimeException(); }
  /** All jars used by the hive specific classloader. */
  protected  java.net.URL[] allJars ()  { throw new RuntimeException(); }
  protected  boolean isSharedClass (java.lang.String name)  { throw new RuntimeException(); }
  /** True if `name` refers to a spark class that must see specific version of Hive. */
  protected  boolean isBarrierClass (java.lang.String name)  { throw new RuntimeException(); }
  protected  java.lang.String classToPath (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * The classloader that is used to load an isolated version of Hive.
   * This classloader is a special URLClassLoader that exposes the addURL method.
   * So, when we add jar, we can add this new jar directly through the addURL method
   * instead of stacking a new URLClassLoader on top of it.
   * @return (undocumented)
   */
    org.apache.spark.util.MutableURLClassLoader classLoader ()  { throw new RuntimeException(); }
    void addJar (java.net.URL path)  { throw new RuntimeException(); }
  /** The isolated client interface to Hive. */
    org.apache.spark.sql.hive.client.HiveClient createClient ()  { throw new RuntimeException(); }
  /**
   * The place holder for shared Hive client for all the HiveContext sessions (they share an
   * IsolatedClientLoader).
   * @return (undocumented)
   */
    Object cachedHive ()  { throw new RuntimeException(); }
}
