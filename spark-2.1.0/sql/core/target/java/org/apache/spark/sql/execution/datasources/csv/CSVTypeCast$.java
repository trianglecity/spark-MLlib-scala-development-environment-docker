package org.apache.spark.sql.execution.datasources.csv;
public  class CSVTypeCast$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CSVTypeCast$ MODULE$ = null;
  public   CSVTypeCast$ ()  { throw new RuntimeException(); }
  /**
   * Casts given string datum to specified type.
   * Currently we do not support complex types (ArrayType, MapType, StructType).
   * <p>
   * For string types, this is simply the datum. For other types.
   * For other nullable types, returns null if it is null or equals to the value specified
   * in <code>nullValue</code> option.
   * <p>
   * @param datum string value
   * @param name field name in schema.
   * @param castType data type to cast <code>datum</code> into.
   * @param nullable nullability for the field.
   * @param options CSV options.
   * @return (undocumented)
   */
  public  Object castTo (java.lang.String datum, java.lang.String name, org.apache.spark.sql.types.DataType castType, boolean nullable, org.apache.spark.sql.execution.datasources.csv.CSVOptions options)  { throw new RuntimeException(); }
  /**
   * Helper method that converts string representation of a character to actual character.
   * It handles some Java escaped strings and throws exception if given string is longer than one
   * character.
   * @param str (undocumented)
   * @return (undocumented)
   */
  public  char toChar (java.lang.String str) throws java.lang.IllegalArgumentException { throw new RuntimeException(); }
}
