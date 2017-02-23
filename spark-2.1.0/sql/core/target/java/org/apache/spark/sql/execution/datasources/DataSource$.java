package org.apache.spark.sql.execution.datasources;
public  class DataSource$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DataSource$ MODULE$ = null;
  public   DataSource$ ()  { throw new RuntimeException(); }
  /** A map to maintain backward compatibility in case we move data sources around. */
  private  scala.collection.immutable.Map<java.lang.String, java.lang.String> backwardCompatibilityMap ()  { throw new RuntimeException(); }
  /**
   * Class that were removed in Spark 2.0. Used to detect incompatibility libraries for Spark 2.0.
   * @return (undocumented)
   */
  private  scala.collection.immutable.Set<java.lang.String> spark2RemovedClasses ()  { throw new RuntimeException(); }
  /** Given a provider name, look up the data source class definition. */
  public  java.lang.Class<?> lookupDataSource (java.lang.String provider)  { throw new RuntimeException(); }
  /**
   * When creating a data source table, the <code>path</code> option has a special meaning: the table location.
   * This method extracts the <code>path</code> option and treat it as table location to build a
   * {@link CatalogStorageFormat}. Note that, the <code>path</code> option is removed from options after this.
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat buildStorageFormatFromOptions (scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
}
