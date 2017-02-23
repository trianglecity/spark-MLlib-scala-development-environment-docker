package org.apache.spark.ml.attribute;
/**
 * :: DeveloperApi ::
 * Attributes that describe a vector ML column.
 * <p>
 * param:  name name of the attribute group (the ML column name)
 * param:  numAttributes optional number of attributes. At most one of <code>numAttributes</code> and <code>attrs</code>
 *                      can be defined.
 * param:  attrs optional array of attributes. Attribute will be copied with their corresponding
 *              indices in the array.
 */
public  class AttributeGroup implements scala.Serializable {
  /** Creates an attribute group from a {@link Metadata} instance with name. */
  static   org.apache.spark.ml.attribute.AttributeGroup fromMetadata (org.apache.spark.sql.types.Metadata metadata, java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Creates an attribute group from a <code>StructField</code> instance.
   * @param field (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.ml.attribute.AttributeGroup fromStructField (org.apache.spark.sql.types.StructField field)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> numAttributes ()  { throw new RuntimeException(); }
  // not preceding
  private   AttributeGroup (java.lang.String name, scala.Option<java.lang.Object> numAttributes, scala.Option<org.apache.spark.ml.attribute.Attribute[]> attrs)  { throw new RuntimeException(); }
  /**
   * Creates an attribute group without attribute info.
   * @param name name of the attribute group
   */
  public   AttributeGroup (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Creates an attribute group knowing only the number of attributes.
   * @param name name of the attribute group
   * @param numAttributes number of attributes
   */
  public   AttributeGroup (java.lang.String name, int numAttributes)  { throw new RuntimeException(); }
  /**
   * Creates an attribute group with attributes.
   * @param name name of the attribute group
   * @param attrs array of attributes. Attributes will be copied with their corresponding indices in
   *              the array.
   */
  public   AttributeGroup (java.lang.String name, org.apache.spark.ml.attribute.Attribute[] attrs)  { throw new RuntimeException(); }
  /**
   * Optional array of attributes. At most one of <code>numAttributes</code> and <code>attributes</code> can be defined.
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.ml.attribute.Attribute[]> attributes ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.Object> nameToIndex ()  { throw new RuntimeException(); }
  /** Size of the attribute group. Returns -1 if the size is unknown. */
  public  int size ()  { throw new RuntimeException(); }
  /** Test whether this attribute group contains a specific attribute. */
  public  boolean hasAttr (java.lang.String attrName)  { throw new RuntimeException(); }
  /** Index of an attribute specified by name. */
  public  int indexOf (java.lang.String attrName)  { throw new RuntimeException(); }
  /** Gets an attribute by its name. */
  public  org.apache.spark.ml.attribute.Attribute apply (java.lang.String attrName)  { throw new RuntimeException(); }
  /** Gets an attribute by its name. */
  public  org.apache.spark.ml.attribute.Attribute getAttr (java.lang.String attrName)  { throw new RuntimeException(); }
  /** Gets an attribute by its index. */
  public  org.apache.spark.ml.attribute.Attribute apply (int attrIndex)  { throw new RuntimeException(); }
  /** Gets an attribute by its index. */
  public  org.apache.spark.ml.attribute.Attribute getAttr (int attrIndex)  { throw new RuntimeException(); }
  /** Converts to metadata without name. */
    org.apache.spark.sql.types.Metadata toMetadataImpl ()  { throw new RuntimeException(); }
  /** Converts to ML metadata with some existing metadata. */
  public  org.apache.spark.sql.types.Metadata toMetadata (org.apache.spark.sql.types.Metadata existingMetadata)  { throw new RuntimeException(); }
  /** Converts to ML metadata */
  public  org.apache.spark.sql.types.Metadata toMetadata ()  { throw new RuntimeException(); }
  /** Converts to a StructField with some existing metadata. */
  public  org.apache.spark.sql.types.StructField toStructField (org.apache.spark.sql.types.Metadata existingMetadata)  { throw new RuntimeException(); }
  /** Converts to a StructField. */
  public  org.apache.spark.sql.types.StructField toStructField ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
