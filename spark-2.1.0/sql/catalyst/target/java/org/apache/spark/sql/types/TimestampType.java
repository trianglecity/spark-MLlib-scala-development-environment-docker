package org.apache.spark.sql.types;
/**
 * The data type representing <code>java.sql.Timestamp</code> values.
 * Please use the singleton <code>DataTypes.TimestampType</code>.
 * <p>
 * @since 1.3.0
 */
public  class TimestampType extends org.apache.spark.sql.types.AtomicType {
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
  private   TimestampType ()  { throw new RuntimeException(); }
    scala.reflect.api.TypeTags.TypeTag<java.lang.Object> tag ()  { throw new RuntimeException(); }
    scala.math.Ordering<java.lang.Object> ordering ()  { throw new RuntimeException(); }
  /**
   * The default size of a value of the TimestampType is 8 bytes.
   * @return (undocumented)
   */
  public  int defaultSize ()  { throw new RuntimeException(); }
    org.apache.spark.sql.types.TimestampType asNullable ()  { throw new RuntimeException(); }
}
