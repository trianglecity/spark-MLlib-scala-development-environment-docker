package org.apache.spark.sql.internal;
/**
 * Static SQL configuration is a cross-session, immutable Spark configuration. External users can
 * see the static sql configs via <code>SparkSession.conf</code>, but can NOT set/unset them.
 */
public  class StaticSQLConf$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StaticSQLConf$ MODULE$ = null;
  public   StaticSQLConf$ ()  { throw new RuntimeException(); }
  public  java.util.Set<java.lang.String> globalConfKeys ()  { throw new RuntimeException(); }
  private  org.apache.spark.internal.config.ConfigBuilder buildConf (java.lang.String key)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> WAREHOUSE_PATH ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> CATALOG_IMPLEMENTATION ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> GLOBAL_TEMP_DATABASE ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> SCHEMA_STRING_LENGTH_THRESHOLD ()  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> DEBUG_MODE ()  { throw new RuntimeException(); }
}
