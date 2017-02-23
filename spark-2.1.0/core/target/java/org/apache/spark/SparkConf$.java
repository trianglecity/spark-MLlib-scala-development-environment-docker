package org.apache.spark;
public  class SparkConf$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkConf$ MODULE$ = null;
  public   SparkConf$ ()  { throw new RuntimeException(); }
  /**
   * Maps deprecated config keys to information about the deprecation.
   * <p>
   * The extra information is logged as a warning when the config is present in the user's
   * configuration.
   * @return (undocumented)
   */
  private  scala.collection.immutable.Map<java.lang.String, org.apache.spark.SparkConf.DeprecatedConfig> deprecatedConfigs ()  { throw new RuntimeException(); }
  /**
   * Maps a current config key to alternate keys that were used in previous version of Spark.
   * <p>
   * The alternates are used in the order defined in this map. If deprecated configs are
   * present in the user's configuration, a warning is logged.
   * @return (undocumented)
   */
  private  scala.collection.immutable.Map<java.lang.String, scala.collection.Seq<org.apache.spark.SparkConf.AlternateConfig>> configsWithAlternatives ()  { throw new RuntimeException(); }
  /**
   * A view of <code>configsWithAlternatives</code> that makes it more efficient to look up deprecated
   * config keys.
   * <p>
   * Maps the deprecated config name to a 2-tuple (new config name, alternate config info).
   * @return (undocumented)
   */
  private  scala.collection.immutable.Map<java.lang.String, scala.Tuple2<java.lang.String, org.apache.spark.SparkConf.AlternateConfig>> allAlternatives ()  { throw new RuntimeException(); }
  /**
   * Return whether the given config should be passed to an executor on start-up.
   * <p>
   * Certain authentication configs are required from the executor when it connects to
   * the scheduler, while the rest of the spark configs can be inherited from the driver later.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  boolean isExecutorStartupConf (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Return true if the given config matches either <code>spark.*.port</code> or <code>spark.port.*</code>.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  boolean isSparkPortConf (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Looks for available deprecated keys for the given config option, and return the first
   * value available.
   * @param key (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> getDeprecatedConfig (java.lang.String key, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Logs a warning message if the given config key is deprecated.
   * @param key (undocumented)
   */
  public  void logDeprecationWarning (java.lang.String key)  { throw new RuntimeException(); }
}
