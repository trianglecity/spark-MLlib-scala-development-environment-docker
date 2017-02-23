package org.apache.spark.sql.types;
/**
 * @since 1.3.0
 */
public  class DataType$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DataType$ MODULE$ = null;
  public   DataType$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType fromJson (java.lang.String json)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.types.DataType> nonDecimalNameToType ()  { throw new RuntimeException(); }
  /** Given the string representation of a type, return its DataType */
  private  org.apache.spark.sql.types.DataType nameToType (java.lang.String name)  { throw new RuntimeException(); }
    org.apache.spark.sql.types.DataType parseDataType (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructField parseStructField (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  protected  void buildFormattedString (org.apache.spark.sql.types.DataType dataType, java.lang.String prefix, scala.collection.mutable.StringBuilder builder)  { throw new RuntimeException(); }
  /**
   * Compares two types, ignoring nullability of ArrayType, MapType, StructType.
   * @param left (undocumented)
   * @param right (undocumented)
   * @return (undocumented)
   */
    boolean equalsIgnoreNullability (org.apache.spark.sql.types.DataType left, org.apache.spark.sql.types.DataType right)  { throw new RuntimeException(); }
  /**
   * Compares two types, ignoring compatible nullability of ArrayType, MapType, StructType.
   * <p>
   * Compatible nullability is defined as follows:
   *   - If <code>from</code> and <code>to</code> are ArrayTypes, <code>from</code> has a compatible nullability with <code>to</code>
   *   if and only if <code>to.containsNull</code> is true, or both of <code>from.containsNull</code> and
   *   <code>to.containsNull</code> are false.
   *   - If <code>from</code> and <code>to</code> are MapTypes, <code>from</code> has a compatible nullability with <code>to</code>
   *   if and only if <code>to.valueContainsNull</code> is true, or both of <code>from.valueContainsNull</code> and
   *   <code>to.valueContainsNull</code> are false.
   *   - If <code>from</code> and <code>to</code> are StructTypes, <code>from</code> has a compatible nullability with <code>to</code>
   *   if and only if for all every pair of fields, <code>to.nullable</code> is true, or both
   *   of <code>fromField.nullable</code> and <code>toField.nullable</code> are false.
   * @param from (undocumented)
   * @param to (undocumented)
   * @return (undocumented)
   */
    boolean equalsIgnoreCompatibleNullability (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  /**
   * Compares two types, ignoring nullability of ArrayType, MapType, StructType, and ignoring case
   * sensitivity of field names in StructType.
   * @param from (undocumented)
   * @param to (undocumented)
   * @return (undocumented)
   */
    boolean equalsIgnoreCaseAndNullability (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
}
