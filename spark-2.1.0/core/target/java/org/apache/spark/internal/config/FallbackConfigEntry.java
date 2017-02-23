package org.apache.spark.internal.config;
/**
 * A config entry whose default value is defined by another config entry.
 */
public  class FallbackConfigEntry<T extends java.lang.Object> extends org.apache.spark.internal.config.ConfigEntry<T> {
    org.apache.spark.internal.config.ConfigEntry<T> fallback ()  { throw new RuntimeException(); }
  // not preceding
  public   FallbackConfigEntry (java.lang.String key, java.lang.String doc, boolean isPublic, org.apache.spark.internal.config.ConfigEntry<T> fallback)  { throw new RuntimeException(); }
  public  java.lang.String defaultValueString ()  { throw new RuntimeException(); }
  public  T readFrom (org.apache.spark.internal.config.ConfigReader reader)  { throw new RuntimeException(); }
}
