package org.apache.spark.internal.config;
/**
 * A config provider that only reads Spark config keys, and considers default values for known
 * configs when fetching configuration values.
 */
  class SparkConfigProvider implements org.apache.spark.internal.config.ConfigProvider {
  public   SparkConfigProvider (java.util.Map<java.lang.String, java.lang.String> conf)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> get (java.lang.String key)  { throw new RuntimeException(); }
  private  scala.Option<java.lang.String> defaultValueString (java.lang.String key)  { throw new RuntimeException(); }
}
