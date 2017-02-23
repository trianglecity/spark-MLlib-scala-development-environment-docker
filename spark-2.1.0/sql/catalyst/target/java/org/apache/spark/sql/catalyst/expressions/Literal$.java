package org.apache.spark.sql.catalyst.expressions;
public  class Literal$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Literal$ MODULE$ = null;
  public   Literal$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Literal TrueLiteral ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Literal FalseLiteral ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Literal apply (Object v)  { throw new RuntimeException(); }
  /**
   * Returns the Spark SQL DataType for a given class object. Since this type needs to be resolved
   * in runtime, we use match-case idioms for class objects here. However, there are similar
   * functions in other files (e.g., HiveInspectors), so these functions need to merged into one.
   * @param clz (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.types.DataType componentTypeToDataType (java.lang.Class<?> clz)  { throw new RuntimeException(); }
  /**
   * Constructs a {@link Literal} of {@link ObjectType}, for example when you need to pass an object
   * into code generation.
   * @param obj (undocumented)
   * @param objType (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Literal fromObject (Object obj, org.apache.spark.sql.types.DataType objType)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Literal fromObject (Object obj)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Literal fromJSON (org.json4s.JsonAST.JValue json)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Literal create (Object v, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
}
