package org.apache.spark.ml.attribute;
/**
 * :: DeveloperApi ::
 * Factory methods to create attribute groups.
 */
public  class AttributeGroup$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AttributeGroup$ MODULE$ = null;
  public   AttributeGroup$ ()  { throw new RuntimeException(); }
  /** Creates an attribute group from a {@link Metadata} instance with name. */
    org.apache.spark.ml.attribute.AttributeGroup fromMetadata (org.apache.spark.sql.types.Metadata metadata, java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Creates an attribute group from a <code>StructField</code> instance.
   * @param field (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.attribute.AttributeGroup fromStructField (org.apache.spark.sql.types.StructField field)  { throw new RuntimeException(); }
}
