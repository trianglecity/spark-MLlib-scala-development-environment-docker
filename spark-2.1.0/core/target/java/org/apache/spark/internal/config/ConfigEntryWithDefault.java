package org.apache.spark.internal.config;
public  class ConfigEntryWithDefault<T extends java.lang.Object> extends org.apache.spark.internal.config.ConfigEntry<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ConfigEntryWithDefault (java.lang.String key, T _defaultValue, scala.Function1<java.lang.String, T> valueConverter, scala.Function1<T, java.lang.String> stringConverter, java.lang.String doc, boolean isPublic)  { throw new RuntimeException(); }
  public  scala.Option<T> defaultValue ()  { throw new RuntimeException(); }
  public  java.lang.String defaultValueString ()  { throw new RuntimeException(); }
  public  T readFrom (org.apache.spark.internal.config.ConfigReader reader)  { throw new RuntimeException(); }
}
