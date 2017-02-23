package org.apache.spark.ml.attribute;
/**
 * :: DeveloperApi ::
 * An unresolved attribute.
 */
public  class UnresolvedAttribute {
  static public  org.apache.spark.ml.attribute.AttributeType attrType ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.attribute.Attribute withIndex (int index)  { throw new RuntimeException(); }
  static public  boolean isNumeric ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.attribute.Attribute withoutIndex ()  { throw new RuntimeException(); }
  static public  boolean isNominal ()  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> name ()  { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.Metadata toMetadataImpl (boolean withType)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.attribute.Attribute withoutName ()  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.Object> index ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.attribute.Attribute withName (java.lang.String name)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.Metadata toMetadata (org.apache.spark.sql.types.Metadata existingMetadata)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.Metadata toMetadata ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructField toStructField (org.apache.spark.sql.types.Metadata existingMetadata)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructField toStructField ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
}
