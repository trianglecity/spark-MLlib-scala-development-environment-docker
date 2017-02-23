package org.apache.spark.ml.attribute;
/** Trait for ML attribute factories. */
  interface AttributeFactory {
  /**
   * Creates an {@link Attribute} from a {@link Metadata} instance.
   * @param metadata (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.ml.attribute.Attribute fromMetadata (org.apache.spark.sql.types.Metadata metadata)  ;
  /**
   * Creates an {@link Attribute} from a {@link StructField} instance, optionally preserving name.
   * @param field (undocumented)
   * @param preserveName (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.ml.attribute.Attribute decodeStructField (org.apache.spark.sql.types.StructField field, boolean preserveName)  ;
  /**
   * Creates an {@link Attribute} from a {@link StructField} instance.
   * @param field (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.attribute.Attribute fromStructField (org.apache.spark.sql.types.StructField field)  ;
}
