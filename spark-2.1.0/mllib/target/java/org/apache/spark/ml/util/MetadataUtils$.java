package org.apache.spark.ml.util;
/**
 * Helper utilities for algorithms using ML metadata
 */
public  class MetadataUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MetadataUtils$ MODULE$ = null;
  public   MetadataUtils$ ()  { throw new RuntimeException(); }
  /**
   * Examine a schema to identify the number of classes in a label column.
   * Returns None if the number of labels is not specified, or if the label column is continuous.
   * @param labelSchema (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Object> getNumClasses (org.apache.spark.sql.types.StructField labelSchema)  { throw new RuntimeException(); }
  /**
   * Examine a schema to identify categorical (Binary and Nominal) features.
   * <p>
   * @param featuresSchema  Schema of the features column.
   *                        If a feature does not have metadata, it is assumed to be continuous.
   *                        If a feature is Nominal, then it must have the number of values
   *                        specified.
   * @return  Map: feature index to number of categories.
   *          The map's set of keys will be the set of categorical feature indices.
   */
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> getCategoricalFeatures (org.apache.spark.sql.types.StructField featuresSchema)  { throw new RuntimeException(); }
  /**
   * Takes a Vector column and a list of feature names, and returns the corresponding list of
   * feature indices in the column, in order.
   * @param col  Vector column which must have feature names specified via attributes
   * @param names  List of feature names
   * @return (undocumented)
   */
  public  int[] getFeatureIndicesFromNames (org.apache.spark.sql.types.StructField col, java.lang.String[] names)  { throw new RuntimeException(); }
}
