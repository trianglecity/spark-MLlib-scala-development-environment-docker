package org.apache.spark.metrics;
  class MetricsConfig implements org.apache.spark.internal.Logging {
  public   MetricsConfig (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  private  java.lang.String DEFAULT_PREFIX ()  { throw new RuntimeException(); }
  private  scala.util.matching.Regex INSTANCE_REGEX ()  { throw new RuntimeException(); }
  private  java.lang.String DEFAULT_METRICS_CONF_FILENAME ()  { throw new RuntimeException(); }
    java.util.Properties properties ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.String, java.util.Properties> perInstanceSubProperties ()  { throw new RuntimeException(); }
  private  void setDefaultProperties (java.util.Properties prop)  { throw new RuntimeException(); }
  /**
   * Load properties from various places, based on precedence
   * If the same property is set again latter on in the method, it overwrites the previous value
   */
  public  void initialize ()  { throw new RuntimeException(); }
  /**
   * Take a simple set of properties and a regex that the instance names (part before the first dot)
   * have to conform to. And, return a map of the first order prefix (before the first dot) to the
   * sub-properties under that prefix.
   * <p>
   * For example, if the properties sent were Properties("*.sink.servlet.class"->"class1",
   * "*.sink.servlet.path"->"path1"), the returned map would be
   * Map("*" -> Properties("sink.servlet.class" -> "class1", "sink.servlet.path" -> "path1"))
   * Note in the subProperties (value of the returned Map), only the suffixes are used as property
   * keys.
   * If, in the passed properties, there is only one property with a given prefix, it is still
   * "unflattened". For example, if the input was Properties("*.sink.servlet.class" -> "class1"
   * the returned Map would contain one key-value pair
   * Map("*" -> Properties("sink.servlet.class" -> "class1"))
   * Any passed in properties, not complying with the regex are ignored.
   * <p>
   * @param prop the flat list of properties to "unflatten" based on prefixes
   * @param regex the regex that the prefix has to comply with
   * @return an unflatted map, mapping prefix with sub-properties under that prefix
   */
  public  scala.collection.mutable.HashMap<java.lang.String, java.util.Properties> subProperties (java.util.Properties prop, scala.util.matching.Regex regex)  { throw new RuntimeException(); }
  public  java.util.Properties getInstance (java.lang.String inst)  { throw new RuntimeException(); }
  /**
   * Loads configuration from a config file. If no config file is provided, try to get file
   * in class path.
   * @param path (undocumented)
   */
  private  void loadPropertiesFromFile (scala.Option<java.lang.String> path)  { throw new RuntimeException(); }
}
