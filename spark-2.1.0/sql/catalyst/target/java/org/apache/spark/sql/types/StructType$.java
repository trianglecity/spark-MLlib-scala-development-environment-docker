package org.apache.spark.sql.types;
/**
 * @since 1.3.0
 */
public  class StructType$ extends org.apache.spark.sql.types.AbstractDataType implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StructType$ MODULE$ = null;
  public   StructType$ ()  { throw new RuntimeException(); }
  /**
   * A key used in field metadata to indicate that the field comes from the result of merging
   * two different StructTypes that do not always contain the field. That is to say, the field
   * might be missing (optional) from one of the StructTypes.
   * @return (undocumented)
   */
    java.lang.String metadataKeyForOptionalField ()  { throw new RuntimeException(); }
    org.apache.spark.sql.types.DataType defaultConcreteType ()  { throw new RuntimeException(); }
    boolean acceptsType (org.apache.spark.sql.types.DataType other)  { throw new RuntimeException(); }
    java.lang.String simpleString ()  { throw new RuntimeException(); }
    org.apache.spark.sql.types.StructType fromString (java.lang.String raw)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType apply (scala.collection.Seq<org.apache.spark.sql.types.StructField> fields)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType apply (java.util.List<org.apache.spark.sql.types.StructField> fields)  { throw new RuntimeException(); }
    org.apache.spark.sql.types.StructType fromAttributes (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> attributes)  { throw new RuntimeException(); }
    org.apache.spark.sql.types.DataType removeMetadata (java.lang.String key, org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
    org.apache.spark.sql.types.DataType merge (org.apache.spark.sql.types.DataType left, org.apache.spark.sql.types.DataType right)  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.types.StructField> fieldsMap (org.apache.spark.sql.types.StructField[] fields)  { throw new RuntimeException(); }
}
