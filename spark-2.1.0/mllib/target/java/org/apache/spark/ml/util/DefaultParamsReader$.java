package org.apache.spark.ml.util;
public  class DefaultParamsReader$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DefaultParamsReader$ MODULE$ = null;
  public   DefaultParamsReader$ ()  { throw new RuntimeException(); }
  /**
   * Load metadata saved using {@link DefaultParamsWriter.saveMetadata()}
   * <p>
   * @param expectedClassName  If non empty, this is checked against the loaded metadata.
   * @throws IllegalArgumentException if expectedClassName is specified and does not match metadata
   * @param path (undocumented)
   * @param sc (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.DefaultParamsReader.Metadata loadMetadata (java.lang.String path, org.apache.spark.SparkContext sc, java.lang.String expectedClassName)  { throw new RuntimeException(); }
  /**
   * Parse metadata JSON string produced by {@link DefaultParamsWriter.getMetadataToSave()}.
   * This is a helper function for {@link loadMetadata()}.
   * <p>
   * @param metadataStr  JSON string of metadata
   * @param expectedClassName  If non empty, this is checked against the loaded metadata.
   * @throws IllegalArgumentException if expectedClassName is specified and does not match metadata
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.DefaultParamsReader.Metadata parseMetadata (java.lang.String metadataStr, java.lang.String expectedClassName)  { throw new RuntimeException(); }
  /**
   * Extract Params from metadata, and set them in the instance.
   * This works if all Params implement {@link org.apache.spark.ml.param.Param.jsonDecode()}.
   * TODO: Move to {@link Metadata} method
   * @param instance (undocumented)
   * @param metadata (undocumented)
   */
  public  void getAndSetParams (org.apache.spark.ml.param.Params instance, org.apache.spark.ml.util.DefaultParamsReader.Metadata metadata)  { throw new RuntimeException(); }
  /**
   * Load a <code>Params</code> instance from the given path, and return it.
   * This assumes the instance implements {@link MLReadable}.
   * @param path (undocumented)
   * @param sc (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T loadParamsInstance (java.lang.String path, org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
}
