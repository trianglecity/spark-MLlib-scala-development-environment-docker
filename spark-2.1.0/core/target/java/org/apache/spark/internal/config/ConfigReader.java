package org.apache.spark.internal.config;
/**
 * A helper class for reading config entries and performing variable substitution.
 * <p>
 * If a config value contains variable references of the form "${prefix:variableName}", the
 * reference will be replaced with the value of the variable depending on the prefix. By default,
 * the following prefixes are handled:
 * <p>
 * - no prefix: use the default config provider
 * - system: looks for the value in the system properties
 * - env: looks for the value in the environment
 * <p>
 * Different prefixes can be bound to a <code>ConfigProvider</code>, which is used to read configuration
 * values from the data source for the prefix, and both the system and env providers can be
 * overridden.
 * <p>
 * If the reference cannot be resolved, the original string will be retained.
 * <p>
 * param:  conf The config provider for the default namespace (no prefix).
 */
  class ConfigReader {
  static private  scala.util.matching.Regex REF_RE ()  { throw new RuntimeException(); }
  public   ConfigReader (org.apache.spark.internal.config.ConfigProvider conf)  { throw new RuntimeException(); }
  public   ConfigReader (java.util.Map<java.lang.String, java.lang.String> conf)  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.internal.config.ConfigProvider> bindings ()  { throw new RuntimeException(); }
  /**
   * Binds a prefix to a provider. This method is not thread-safe and should be called
   * before the instance is used to expand values.
   * @param prefix (undocumented)
   * @param provider (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.internal.config.ConfigReader bind (java.lang.String prefix, org.apache.spark.internal.config.ConfigProvider provider)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigReader bind (java.lang.String prefix, java.util.Map<java.lang.String, java.lang.String> values)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigReader bindEnv (org.apache.spark.internal.config.ConfigProvider provider)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigReader bindSystem (org.apache.spark.internal.config.ConfigProvider provider)  { throw new RuntimeException(); }
  /**
   * Reads a configuration key from the default provider, and apply variable substitution.
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> get (java.lang.String key)  { throw new RuntimeException(); }
  /**
   * Perform variable substitution on the given input string.
   * @param input (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String substitute (java.lang.String input)  { throw new RuntimeException(); }
  private  java.lang.String substitute (java.lang.String input, scala.collection.immutable.Set<java.lang.String> usedRefs)  { throw new RuntimeException(); }
}
