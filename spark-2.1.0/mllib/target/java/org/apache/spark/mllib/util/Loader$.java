package org.apache.spark.mllib.util;
/**
 * Helper methods for loading models from files.
 */
public  class Loader$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Loader$ MODULE$ = null;
  public   Loader$ ()  { throw new RuntimeException(); }
  /** Returns URI for path/data using the Hadoop filesystem */
  public  java.lang.String dataPath (java.lang.String path)  { throw new RuntimeException(); }
  /** Returns URI for path/metadata using the Hadoop filesystem */
  public  java.lang.String metadataPath (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Check the schema of loaded model data.
   * <p>
   * This checks every field in the expected schema to make sure that a field with the same
   * name and DataType appears in the loaded schema.  Note that this does NOT check metadata
   * or containsNull.
   * <p>
   * @param loadedSchema  Schema for model data loaded from file.
   * @tparam Data  Expected data type from which an expected schema can be derived.
   * @param evidence$1 (undocumented)
   */
  public <Data extends java.lang.Object> void checkSchema (org.apache.spark.sql.types.StructType loadedSchema, scala.reflect.api.TypeTags.TypeTag<Data> evidence$1)  { throw new RuntimeException(); }
  /**
   * Load metadata from the given path.
   * @return (class name, version, metadata)
   * @param sc (undocumented)
   * @param path (undocumented)
   */
  public  scala.Tuple3<java.lang.String, java.lang.String, org.json4s.JsonAST.JValue> loadMetadata (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
