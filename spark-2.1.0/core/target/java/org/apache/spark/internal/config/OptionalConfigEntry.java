package org.apache.spark.internal.config;
/**
 * A config entry that does not have a default value.
 */
  class OptionalConfigEntry<T extends java.lang.Object> extends org.apache.spark.internal.config.ConfigEntry<scala.Option<T>> {
  public  scala.Function1<java.lang.String, T> rawValueConverter ()  { throw new RuntimeException(); }
  public  scala.Function1<T, java.lang.String> rawStringConverter ()  { throw new RuntimeException(); }
  // not preceding
  public   OptionalConfigEntry (java.lang.String key, scala.Function1<java.lang.String, T> rawValueConverter, scala.Function1<T, java.lang.String> rawStringConverter, java.lang.String doc, boolean isPublic)  { throw new RuntimeException(); }
  public  java.lang.String defaultValueString ()  { throw new RuntimeException(); }
  public  scala.Option<T> readFrom (org.apache.spark.internal.config.ConfigReader reader)  { throw new RuntimeException(); }
}
