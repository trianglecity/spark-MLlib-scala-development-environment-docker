package org.apache.spark.ml.attribute;
/**
 * :: DeveloperApi ::
 * A binary attribute.
 * param:  name optional name
 * param:  index optional index
 * param:  values optional values. If set, its size must be 2.
 */
public  class BinaryAttribute extends org.apache.spark.ml.attribute.Attribute {
  /** The default binary attribute. */
  static public final  org.apache.spark.ml.attribute.BinaryAttribute defaultAttr ()  { throw new RuntimeException(); }
  static   org.apache.spark.ml.attribute.BinaryAttribute fromMetadata (org.apache.spark.sql.types.Metadata metadata)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.Metadata toMetadata (org.apache.spark.sql.types.Metadata existingMetadata)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.Metadata toMetadata ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructField toStructField (org.apache.spark.sql.types.Metadata existingMetadata)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructField toStructField ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> name ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> index ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String[]> values ()  { throw new RuntimeException(); }
  // not preceding
     BinaryAttribute (scala.Option<java.lang.String> name, scala.Option<java.lang.Object> index, scala.Option<java.lang.String[]> values)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.attribute.AttributeType attrType ()  { throw new RuntimeException(); }
  public  boolean isNumeric ()  { throw new RuntimeException(); }
  public  boolean isNominal ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.attribute.BinaryAttribute withName (java.lang.String name)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.attribute.BinaryAttribute withoutName ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.attribute.BinaryAttribute withIndex (int index)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.attribute.BinaryAttribute withoutIndex ()  { throw new RuntimeException(); }
  /**
   * Copy with new values.
   * @param negative name for negative
   * @param positive name for positive
   * @return (undocumented)
   */
  public  org.apache.spark.ml.attribute.BinaryAttribute withValues (java.lang.String negative, java.lang.String positive)  { throw new RuntimeException(); }
  /** Copy without the values. */
  public  org.apache.spark.ml.attribute.BinaryAttribute withoutValues ()  { throw new RuntimeException(); }
  /** Creates a copy of this attribute with optional changes. */
  private  org.apache.spark.ml.attribute.BinaryAttribute copy (scala.Option<java.lang.String> name, scala.Option<java.lang.Object> index, scala.Option<java.lang.String[]> values)  { throw new RuntimeException(); }
    org.apache.spark.sql.types.Metadata toMetadataImpl (boolean withType)  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
}
