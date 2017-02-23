package org.apache.spark.ml.attribute;
/**
 * :: DeveloperApi ::
 * A numeric attribute with optional summary statistics.
 * param:  name optional name
 * param:  index optional index
 * param:  min optional min value
 * param:  max optional max value
 * param:  std optional standard deviation
 * param:  sparsity optional sparsity (ratio of zeros)
 */
public  class NumericAttribute extends org.apache.spark.ml.attribute.Attribute {
  /** The default numeric attribute. */
  static public  org.apache.spark.ml.attribute.NumericAttribute defaultAttr ()  { throw new RuntimeException(); }
  static   org.apache.spark.ml.attribute.NumericAttribute fromMetadata (org.apache.spark.sql.types.Metadata metadata)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.Metadata toMetadata (org.apache.spark.sql.types.Metadata existingMetadata)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.Metadata toMetadata ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructField toStructField (org.apache.spark.sql.types.Metadata existingMetadata)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructField toStructField ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> name ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> index ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> min ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> max ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> std ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> sparsity ()  { throw new RuntimeException(); }
  // not preceding
     NumericAttribute (scala.Option<java.lang.String> name, scala.Option<java.lang.Object> index, scala.Option<java.lang.Object> min, scala.Option<java.lang.Object> max, scala.Option<java.lang.Object> std, scala.Option<java.lang.Object> sparsity)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.attribute.AttributeType attrType ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.attribute.NumericAttribute withName (java.lang.String name)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.attribute.NumericAttribute withoutName ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.attribute.NumericAttribute withIndex (int index)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.attribute.NumericAttribute withoutIndex ()  { throw new RuntimeException(); }
  /** Copy with a new min value. */
  public  org.apache.spark.ml.attribute.NumericAttribute withMin (double min)  { throw new RuntimeException(); }
  /** Copy without the min value. */
  public  org.apache.spark.ml.attribute.NumericAttribute withoutMin ()  { throw new RuntimeException(); }
  /** Copy with a new max value. */
  public  org.apache.spark.ml.attribute.NumericAttribute withMax (double max)  { throw new RuntimeException(); }
  /** Copy without the max value. */
  public  org.apache.spark.ml.attribute.NumericAttribute withoutMax ()  { throw new RuntimeException(); }
  /** Copy with a new standard deviation. */
  public  org.apache.spark.ml.attribute.NumericAttribute withStd (double std)  { throw new RuntimeException(); }
  /** Copy without the standard deviation. */
  public  org.apache.spark.ml.attribute.NumericAttribute withoutStd ()  { throw new RuntimeException(); }
  /** Copy with a new sparsity. */
  public  org.apache.spark.ml.attribute.NumericAttribute withSparsity (double sparsity)  { throw new RuntimeException(); }
  /** Copy without the sparsity. */
  public  org.apache.spark.ml.attribute.NumericAttribute withoutSparsity ()  { throw new RuntimeException(); }
  /** Copy without summary statistics. */
  public  org.apache.spark.ml.attribute.NumericAttribute withoutSummary ()  { throw new RuntimeException(); }
  public  boolean isNumeric ()  { throw new RuntimeException(); }
  public  boolean isNominal ()  { throw new RuntimeException(); }
  /** Convert this attribute to metadata. */
    org.apache.spark.sql.types.Metadata toMetadataImpl (boolean withType)  { throw new RuntimeException(); }
  /** Creates a copy of this attribute with optional changes. */
  private  org.apache.spark.ml.attribute.NumericAttribute copy (scala.Option<java.lang.String> name, scala.Option<java.lang.Object> index, scala.Option<java.lang.Object> min, scala.Option<java.lang.Object> max, scala.Option<java.lang.Object> std, scala.Option<java.lang.Object> sparsity)  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
}
