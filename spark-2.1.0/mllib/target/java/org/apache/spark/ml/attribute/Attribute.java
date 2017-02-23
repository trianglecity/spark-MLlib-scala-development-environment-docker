package org.apache.spark.ml.attribute;
/**
 * :: DeveloperApi ::
 * Abstract class for ML attributes.
 */
public abstract class Attribute implements scala.Serializable {
  static   org.apache.spark.ml.attribute.Attribute fromMetadata (org.apache.spark.sql.types.Metadata metadata)  { throw new RuntimeException(); }
  /** Gets the attribute factory given the attribute type name. */
  static private  org.apache.spark.ml.attribute.AttributeFactory getFactory (java.lang.String attrType)  { throw new RuntimeException(); }
  public   Attribute ()  { throw new RuntimeException(); }
  /** Attribute type. */
  public abstract  org.apache.spark.ml.attribute.AttributeType attrType ()  ;
  /** Name of the attribute. None if it is not set. */
  public abstract  scala.Option<java.lang.String> name ()  ;
  /** Copy with a new name. */
  public abstract  org.apache.spark.ml.attribute.Attribute withName (java.lang.String name)  ;
  /** Copy without the name. */
  public abstract  org.apache.spark.ml.attribute.Attribute withoutName ()  ;
  /** Index of the attribute. None if it is not set. */
  public abstract  scala.Option<java.lang.Object> index ()  ;
  /** Copy with a new index. */
  public abstract  org.apache.spark.ml.attribute.Attribute withIndex (int index)  ;
  /** Copy without the index. */
  public abstract  org.apache.spark.ml.attribute.Attribute withoutIndex ()  ;
  /**
   * Tests whether this attribute is numeric, true for {@link NumericAttribute} and {@link BinaryAttribute}.
   * @return (undocumented)
   */
  public abstract  boolean isNumeric ()  ;
  /**
   * Tests whether this attribute is nominal, true for {@link NominalAttribute} and {@link BinaryAttribute}.
   * @return (undocumented)
   */
  public abstract  boolean isNominal ()  ;
  /**
   * Converts this attribute to {@link Metadata}.
   * @param withType whether to include the type info
   * @return (undocumented)
   */
   abstract  org.apache.spark.sql.types.Metadata toMetadataImpl (boolean withType)  ;
  /**
   * Converts this attribute to {@link Metadata}. For numeric attributes, the type info is excluded to
   * save space, because numeric type is the default attribute type. For nominal and binary
   * attributes, the type info is included.
   * @return (undocumented)
   */
    org.apache.spark.sql.types.Metadata toMetadataImpl ()  { throw new RuntimeException(); }
  /** Converts to ML metadata with some existing metadata. */
  public  org.apache.spark.sql.types.Metadata toMetadata (org.apache.spark.sql.types.Metadata existingMetadata)  { throw new RuntimeException(); }
  /** Converts to ML metadata */
  public  org.apache.spark.sql.types.Metadata toMetadata ()  { throw new RuntimeException(); }
  /**
   * Converts to a <code>StructField</code> with some existing metadata.
   * @param existingMetadata existing metadata to carry over
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructField toStructField (org.apache.spark.sql.types.Metadata existingMetadata)  { throw new RuntimeException(); }
  /**
   * Converts to a <code>StructField</code>.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructField toStructField ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
