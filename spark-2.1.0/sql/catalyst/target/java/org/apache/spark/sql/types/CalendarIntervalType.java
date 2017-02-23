package org.apache.spark.sql.types;
/**
 * The data type representing calendar time intervals. The calendar time interval is stored
 * internally in two components: number of months the number of microseconds.
 * <p>
 * Please use the singleton <code>DataTypes.CalendarIntervalType</code>.
 * <p>
 * @note Calendar intervals are not comparable.
 * <p>
 * @since 1.5.0
 */
public  class CalendarIntervalType extends org.apache.spark.sql.types.DataType {
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
  private   CalendarIntervalType ()  { throw new RuntimeException(); }
  public  int defaultSize ()  { throw new RuntimeException(); }
    org.apache.spark.sql.types.CalendarIntervalType asNullable ()  { throw new RuntimeException(); }
}
