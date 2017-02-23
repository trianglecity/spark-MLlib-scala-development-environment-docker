package org.apache.spark.internal.config;
/**
 * A type-safe config builder. Provides methods for transforming the input data (which can be
 * used, e.g., for validation) and creating the final config entry.
 * <p>
 * One of the methods that return a {@link ConfigEntry} must be called to create a config entry that
 * can be used with {@link SparkConf}.
 */
  class TypedConfigBuilder<T extends java.lang.Object> {
  public  org.apache.spark.internal.config.ConfigBuilder parent ()  { throw new RuntimeException(); }
  public  scala.Function1<java.lang.String, T> converter ()  { throw new RuntimeException(); }
  public  scala.Function1<T, java.lang.String> stringConverter ()  { throw new RuntimeException(); }
  // not preceding
  public   TypedConfigBuilder (org.apache.spark.internal.config.ConfigBuilder parent, scala.Function1<java.lang.String, T> converter, scala.Function1<T, java.lang.String> stringConverter)  { throw new RuntimeException(); }
  public   TypedConfigBuilder (org.apache.spark.internal.config.ConfigBuilder parent, scala.Function1<java.lang.String, T> converter)  { throw new RuntimeException(); }
  /** Apply a transformation to the user-provided values of the config entry. */
  public  org.apache.spark.internal.config.TypedConfigBuilder<T> transform (scala.Function1<T, T> fn)  { throw new RuntimeException(); }
  /** Check that user-provided values for the config match a pre-defined set. */
  public  org.apache.spark.internal.config.TypedConfigBuilder<T> checkValues (scala.collection.immutable.Set<T> validValues)  { throw new RuntimeException(); }
  /** Turns the config entry into a sequence of values of the underlying type. */
  public  org.apache.spark.internal.config.TypedConfigBuilder<scala.collection.Seq<T>> toSequence ()  { throw new RuntimeException(); }
  /** Creates a {@link ConfigEntry} that does not have a default value. */
  public  org.apache.spark.internal.config.OptionalConfigEntry<T> createOptional ()  { throw new RuntimeException(); }
  /** Creates a {@link ConfigEntry} that has a default value. */
  public  org.apache.spark.internal.config.ConfigEntry<T> createWithDefault (T default_)  { throw new RuntimeException(); }
  /**
   * Creates a {@link ConfigEntry} that has a default value. The default value is provided as a
   * {@link String} and must be a valid value for the entry.
   * @param default_ (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.internal.config.ConfigEntry<T> createWithDefaultString (java.lang.String default_)  { throw new RuntimeException(); }
}
