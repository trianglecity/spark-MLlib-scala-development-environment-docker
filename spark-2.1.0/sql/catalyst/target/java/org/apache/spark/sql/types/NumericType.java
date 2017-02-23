package org.apache.spark.sql.types;
/**
 * Numeric data types.
 * <p>
 * @since 1.3.0
 */
public abstract class NumericType extends org.apache.spark.sql.types.AtomicType {
  /**
   * Enables matching against NumericType for expressions:
   * <pre><code>
   *   case Cast(child &#64; NumericType(), StringType) =&gt;
   *     ...
   * </code></pre>
   * @param e (undocumented)
   * @return (undocumented)
   */
  static public  boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.DataType defaultConcreteType ()  { throw new RuntimeException(); }
  static   java.lang.String simpleString ()  { throw new RuntimeException(); }
  static   boolean acceptsType (org.apache.spark.sql.types.DataType other)  { throw new RuntimeException(); }
  static public abstract  int defaultSize ()  ;
  static public  java.lang.String typeName ()  { throw new RuntimeException(); }
  static   org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
  static public  java.lang.String json ()  { throw new RuntimeException(); }
  static public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  static public  java.lang.String catalogString ()  { throw new RuntimeException(); }
  static public  java.lang.String sql ()  { throw new RuntimeException(); }
  static   boolean sameType (org.apache.spark.sql.types.DataType other)  { throw new RuntimeException(); }
  static  abstract  org.apache.spark.sql.types.DataType asNullable ()  ;
  static   boolean existsRecursively (scala.Function1<org.apache.spark.sql.types.DataType, java.lang.Object> f)  { throw new RuntimeException(); }
  static  abstract  scala.reflect.api.TypeTags.TypeTag<java.lang.Object> tag ()  ;
  static  abstract  scala.math.Ordering<java.lang.Object> ordering ()  ;
  public   NumericType ()  { throw new RuntimeException(); }
   abstract  scala.math.Numeric<java.lang.Object> numeric ()  ;
}
