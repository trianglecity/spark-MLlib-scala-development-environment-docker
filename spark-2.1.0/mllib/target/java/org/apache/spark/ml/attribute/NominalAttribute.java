package org.apache.spark.ml.attribute;
/**
 * :: DeveloperApi ::
 * A nominal attribute.
 * param:  name optional name
 * param:  index optional index
 * param:  isOrdinal whether this attribute is ordinal (optional)
 * param:  numValues optional number of values. At most one of <code>numValues</code> and <code>values</code> can be
 *                  defined.
 * param:  values optional values. At most one of <code>numValues</code> and <code>values</code> can be defined.
 */
public  class NominalAttribute extends org.apache.spark.ml.attribute.Attribute {
  /** The default nominal attribute. */
  static public final  org.apache.spark.ml.attribute.NominalAttribute defaultAttr ()  { throw new RuntimeException(); }
  static   org.apache.spark.ml.attribute.NominalAttribute fromMetadata (org.apache.spark.sql.types.Metadata metadata)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.Metadata toMetadata (org.apache.spark.sql.types.Metadata existingMetadata)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.Metadata toMetadata ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructField toStructField (org.apache.spark.sql.types.Metadata existingMetadata)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructField toStructField ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Copy with new values and empty <code>numValues</code>.
   * @param first (undocumented)
   * @param others (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.attribute.NominalAttribute withValues (java.lang.String first, java.lang.String... others)  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<java.lang.String> name ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> index ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> isOrdinal ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> numValues ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String[]> values ()  { throw new RuntimeException(); }
  // not preceding
     NominalAttribute (scala.Option<java.lang.String> name, scala.Option<java.lang.Object> index, scala.Option<java.lang.Object> isOrdinal, scala.Option<java.lang.Object> numValues, scala.Option<java.lang.String[]> values)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.attribute.AttributeType attrType ()  { throw new RuntimeException(); }
  public  boolean isNumeric ()  { throw new RuntimeException(); }
  public  boolean isNominal ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.Object> valueToIndex ()  { throw new RuntimeException(); }
  /** Index of a specific value. */
  public  int indexOf (java.lang.String value)  { throw new RuntimeException(); }
  /** Tests whether this attribute contains a specific value. */
  public  boolean hasValue (java.lang.String value)  { throw new RuntimeException(); }
  /** Gets a value given its index. */
  public  java.lang.String getValue (int index)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.attribute.NominalAttribute withName (java.lang.String name)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.attribute.NominalAttribute withoutName ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.attribute.NominalAttribute withIndex (int index)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.attribute.NominalAttribute withoutIndex ()  { throw new RuntimeException(); }
  /**
   * Copy with new values and empty <code>numValues</code>.
   * @param values (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.attribute.NominalAttribute withValues (java.lang.String[] values)  { throw new RuntimeException(); }
  /**
   * Copy with new values and empty <code>numValues</code>.
   * @param first (undocumented)
   * @param others (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.attribute.NominalAttribute withValues (java.lang.String first, scala.collection.Seq<java.lang.String> others)  { throw new RuntimeException(); }
  /** Copy without the values. */
  public  org.apache.spark.ml.attribute.NominalAttribute withoutValues ()  { throw new RuntimeException(); }
  /**
   * Copy with a new <code>numValues</code> and empty <code>values</code>.
   * @param numValues (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.attribute.NominalAttribute withNumValues (int numValues)  { throw new RuntimeException(); }
  /**
   * Copy without the <code>numValues</code>.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.attribute.NominalAttribute withoutNumValues ()  { throw new RuntimeException(); }
  /**
   * Get the number of values, either from <code>numValues</code> or from <code>values</code>.
   * Return None if unknown.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Object> getNumValues ()  { throw new RuntimeException(); }
  /** Creates a copy of this attribute with optional changes. */
  private  org.apache.spark.ml.attribute.NominalAttribute copy (scala.Option<java.lang.String> name, scala.Option<java.lang.Object> index, scala.Option<java.lang.Object> isOrdinal, scala.Option<java.lang.Object> numValues, scala.Option<java.lang.String[]> values)  { throw new RuntimeException(); }
    org.apache.spark.sql.types.Metadata toMetadataImpl (boolean withType)  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
}
