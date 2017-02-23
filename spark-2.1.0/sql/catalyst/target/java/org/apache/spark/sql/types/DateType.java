package org.apache.spark.sql.types;
/**
 * A date type, supporting "0001-01-01" through "9999-12-31".
 * <p>
 * Please use the singleton <code>DataTypes.DateType</code>.
 * <p>
 * Internally, this is represented as the number of days from 1970-01-01.
 * <p>
 * @since 1.3.0
 */
public  class DateType extends org.apache.spark.sql.types.AtomicType {
  static   boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  static public  java.lang.String typeName ()  { throw new RuntimeException(); }
  static   org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
  static public  java.lang.String json ()  { throw new RuntimeException(); }
  static public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  static public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  static public  java.lang.String catalogString ()  { throw new RuntimeException(); }
  static   java.lang.String simpleString (int maxNumberFields)  { throw new RuntimeException(); }
  static public  java.lang.String sql ()  { throw new RuntimeException(); }
  static   boolean sameType (org.apache.spark.sql.types.DataType other)  { throw new RuntimeException(); }
  static   boolean existsRecursively (scala.Function1<org.apache.spark.sql.types.DataType, java.lang.Object> f)  { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.DataType defaultConcreteType ()  { throw new RuntimeException(); }
  static   boolean acceptsType (org.apache.spark.sql.types.DataType other)  { throw new RuntimeException(); }
  private   DateType ()  { throw new RuntimeException(); }
    scala.reflect.api.TypeTags.TypeTag<java.lang.Object> tag ()  { throw new RuntimeException(); }
    scala.math.Ordering<java.lang.Object> ordering ()  { throw new RuntimeException(); }
  /**
   * The default size of a value of the DateType is 4 bytes.
   * @return (undocumented)
   */
  public  int defaultSize ()  { throw new RuntimeException(); }
    org.apache.spark.sql.types.DateType asNullable ()  { throw new RuntimeException(); }
}
