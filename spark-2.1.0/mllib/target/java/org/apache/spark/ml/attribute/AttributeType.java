package org.apache.spark.ml.attribute;
/**
 * :: DeveloperApi ::
 * An enum-like type for attribute types: {@link AttributeType$#Numeric}, {@link AttributeType$#Nominal},
 * and {@link AttributeType$#Binary}.
 */
public abstract class AttributeType {
  /** Numeric type. */
  static public  org.apache.spark.ml.attribute.AttributeType Numeric ()  { throw new RuntimeException(); }
  /** Nominal type. */
  static public  org.apache.spark.ml.attribute.AttributeType Nominal ()  { throw new RuntimeException(); }
  /** Binary type. */
  static public  org.apache.spark.ml.attribute.AttributeType Binary ()  { throw new RuntimeException(); }
  /** Unresolved type. */
  static public  org.apache.spark.ml.attribute.AttributeType Unresolved ()  { throw new RuntimeException(); }
  /**
   * Gets the {@link AttributeType} object from its name.
   * @param name attribute type name: "numeric", "nominal", or "binary"
   * @return (undocumented)
   */
  static public  org.apache.spark.ml.attribute.AttributeType fromName (java.lang.String name)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  // not preceding
  public   AttributeType (java.lang.String name)  { throw new RuntimeException(); }
}
