package org.apache.spark.sql.catalyst.analysis;
public  class FunctionRegistry$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FunctionRegistry$ MODULE$ = null;
  public   FunctionRegistry$ ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, scala.Tuple2<org.apache.spark.sql.catalyst.expressions.ExpressionInfo, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression>>> expressions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.SimpleFunctionRegistry builtin ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> functionSet ()  { throw new RuntimeException(); }
  /** See usage above. */
  private <T extends org.apache.spark.sql.catalyst.expressions.Expression> scala.Tuple2<java.lang.String, scala.Tuple2<org.apache.spark.sql.catalyst.expressions.ExpressionInfo, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression>>> expression (java.lang.String name, scala.reflect.ClassTag<T> tag)  { throw new RuntimeException(); }
  /**
   * Creates a function registry lookup entry for cast aliases (SPARK-16730).
   * For example, if name is "int", and dataType is IntegerType, this means int(x) would become
   * an alias for cast(x as IntegerType).
   * See usage above.
   * @param name (undocumented)
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<java.lang.String, scala.Tuple2<org.apache.spark.sql.catalyst.expressions.ExpressionInfo, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression>>> castAlias (java.lang.String name, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Creates an {@link ExpressionInfo} for the function as defined by expression T using the given name.
   * @param name (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  private <T extends org.apache.spark.sql.catalyst.expressions.Expression> org.apache.spark.sql.catalyst.expressions.ExpressionInfo expressionInfo (java.lang.String name, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
}
