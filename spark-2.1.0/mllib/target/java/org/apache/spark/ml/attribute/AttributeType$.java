package org.apache.spark.ml.attribute;
/**
 * :: DeveloperApi ::
 */
public  class AttributeType$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AttributeType$ MODULE$ = null;
  public   AttributeType$ ()  { throw new RuntimeException(); }
  /** Numeric type. */
  public  org.apache.spark.ml.attribute.AttributeType Numeric ()  { throw new RuntimeException(); }
  /** Nominal type. */
  public  org.apache.spark.ml.attribute.AttributeType Nominal ()  { throw new RuntimeException(); }
  /** Binary type. */
  public  org.apache.spark.ml.attribute.AttributeType Binary ()  { throw new RuntimeException(); }
  /** Unresolved type. */
  public  org.apache.spark.ml.attribute.AttributeType Unresolved ()  { throw new RuntimeException(); }
  /**
   * Gets the {@link AttributeType} object from its name.
   * @param name attribute type name: "numeric", "nominal", or "binary"
   * @return (undocumented)
   */
  public  org.apache.spark.ml.attribute.AttributeType fromName (java.lang.String name)  { throw new RuntimeException(); }
}
