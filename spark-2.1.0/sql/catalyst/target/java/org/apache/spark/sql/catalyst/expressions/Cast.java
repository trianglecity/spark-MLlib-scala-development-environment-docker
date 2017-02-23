package org.apache.spark.sql.catalyst.expressions;
public  class Cast extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.NullIntolerant, scala.Product, scala.Serializable {
  /**
   * Returns true iff we can cast <code>from</code> type to <code>to</code> type.
   * @param from (undocumented)
   * @param to (undocumented)
   * @return (undocumented)
   */
  static public  boolean canCast (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  static private  boolean resolvableNullability (boolean from, boolean to)  { throw new RuntimeException(); }
  static private  boolean forceNullable (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.trees.Origin origin ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.trees.TreeNode<?>> containsChild ()  { throw new RuntimeException(); }
  static public  int hashCode ()  { throw new RuntimeException(); }
  static public  boolean fastEquals (org.apache.spark.sql.catalyst.trees.TreeNode<?> other)  { throw new RuntimeException(); }
  static public  scala.Option<BaseType> find (scala.Function1<BaseType, java.lang.Object> f)  { throw new RuntimeException(); }
  static public  void foreach (scala.Function1<BaseType, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void foreachUp (scala.Function1<BaseType, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.collection.Seq<A> map (scala.Function1<BaseType, A> f)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.collection.Seq<A> flatMap (scala.Function1<BaseType, scala.collection.TraversableOnce<A>> f)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Seq<B> collect (scala.PartialFunction<BaseType, B> pf)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<BaseType> collectLeaves ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.Option<B> collectFirst (scala.PartialFunction<BaseType, B> pf)  { throw new RuntimeException(); }
  static protected <B extends java.lang.Object> java.lang.Object mapProductIterator (scala.Function1<java.lang.Object, B> f, scala.reflect.ClassTag<B> evidence$1)  { throw new RuntimeException(); }
  static public  BaseType mapChildren (scala.Function1<BaseType, BaseType> f)  { throw new RuntimeException(); }
  static public  BaseType withNewChildren (scala.collection.Seq<BaseType> newChildren)  { throw new RuntimeException(); }
  static public  BaseType transform (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static public  BaseType transformDown (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static public  BaseType transformUp (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static protected  BaseType transformChildren (scala.PartialFunction<BaseType, BaseType> rule, scala.Function2<BaseType, scala.PartialFunction<BaseType, BaseType>, BaseType> nextOperation)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<java.lang.Object> otherCopyArgs ()  { throw new RuntimeException(); }
  static public  BaseType makeCopy (java.lang.Object[] newArgs)  { throw new RuntimeException(); }
  static public  java.lang.String nodeName ()  { throw new RuntimeException(); }
  static protected  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
  static public  java.lang.String argString ()  { throw new RuntimeException(); }
  static public  java.lang.String treeString ()  { throw new RuntimeException(); }
  static public  java.lang.String treeString (boolean verbose)  { throw new RuntimeException(); }
  static public  java.lang.String numberedTreeString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.trees.TreeNode<?> apply (int number)  { throw new RuntimeException(); }
  static public  BaseType p (int number)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.trees.TreeNode<?>> innerChildren ()  { throw new RuntimeException(); }
  static public  scala.collection.mutable.StringBuilder generateTreeString (int depth, scala.collection.Seq<java.lang.Object> lastChildren, scala.collection.mutable.StringBuilder builder, boolean verbose, java.lang.String prefix)  { throw new RuntimeException(); }
  static public  java.lang.String asCode ()  { throw new RuntimeException(); }
  static public  java.lang.String toJSON ()  { throw new RuntimeException(); }
  static public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  static protected  scala.collection.immutable.List<scala.Tuple2<java.lang.String, org.json4s.JsonAST.JValue>> jsonFields ()  { throw new RuntimeException(); }
  static public  java.lang.String generateTreeString$default$5 ()  { throw new RuntimeException(); }
  static public  boolean deterministic ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet references ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  static public  boolean resolved ()  { throw new RuntimeException(); }
  static public  boolean childrenResolved ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.Expression canonicalized ()  { throw new RuntimeException(); }
  static public  boolean semanticEquals (org.apache.spark.sql.catalyst.expressions.Expression other)  { throw new RuntimeException(); }
  static public  int semanticHash ()  { throw new RuntimeException(); }
  static public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  static protected  scala.collection.Iterator<java.lang.Object> flatArguments ()  { throw new RuntimeException(); }
  static public final  java.lang.String verboseString ()  { throw new RuntimeException(); }
  static public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.InternalRow eval$default$1 ()  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  static public  boolean foldable ()  { throw new RuntimeException(); }
  static public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode defineCodeGen (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev, scala.Function1<java.lang.String, java.lang.String> f)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode nullSafeCodeGen (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev, scala.Function1<java.lang.String, java.lang.String> f)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  // not preceding
  public   Cast (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  private <T extends java.lang.Object> Object buildCast (Object a, scala.Function1<T, java.lang.Object> func)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToString (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToBinary (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToBoolean (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToTimestamp (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  long decimalToTimestamp (org.apache.spark.sql.types.Decimal d)  { throw new RuntimeException(); }
  private  Object doubleToTimestamp (double d)  { throw new RuntimeException(); }
  private  long longToTimestamp (long t)  { throw new RuntimeException(); }
  private  long timestampToLong (long ts)  { throw new RuntimeException(); }
  private  double timestampToDouble (long ts)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToDate (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToInterval (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToLong (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToInt (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToShort (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToByte (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  /**
   * Change the precision / scale in a given decimal to those set in <code>decimalType</code> (if any),
   * returning null if it overflows or modifying <code>value</code> in-place and returning it if successful.
   * <p>
   * NOTE: this modifies <code>value</code> in-place, so don't call it on external data.
   * @param value (undocumented)
   * @param decimalType (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.types.Decimal changePrecision (org.apache.spark.sql.types.Decimal value, org.apache.spark.sql.types.DecimalType decimalType)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToDecimal (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DecimalType target)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToDouble (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToFloat (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castArray (org.apache.spark.sql.types.DataType fromType, org.apache.spark.sql.types.DataType toType)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castMap (org.apache.spark.sql.types.MapType from, org.apache.spark.sql.types.MapType to)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castStruct (org.apache.spark.sql.types.StructType from, org.apache.spark.sql.types.StructType to)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> cast (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> cast ()  { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  private  scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> nullSafeCastFunction (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to, org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  private  java.lang.String castCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String childPrim, java.lang.String childNull, java.lang.String resultPrim, java.lang.String resultNull, org.apache.spark.sql.types.DataType resultType, scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> cast)  { throw new RuntimeException(); }
  private  scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> castToStringCode (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  private  scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> castToBinaryCode (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> castToDateCode (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  private  java.lang.String changePrecision (java.lang.String d, org.apache.spark.sql.types.DecimalType decimalType, java.lang.String evPrim, java.lang.String evNull)  { throw new RuntimeException(); }
  private  scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> castToDecimalCode (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DecimalType target, org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  private  scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> castToTimestampCode (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  private  scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> castToIntervalCode (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  java.lang.String decimalToTimestampCode (java.lang.String d)  { throw new RuntimeException(); }
  private  java.lang.String longToTimeStampCode (java.lang.String l)  { throw new RuntimeException(); }
  private  java.lang.String timestampToIntegerCode (java.lang.String ts)  { throw new RuntimeException(); }
  private  java.lang.String timestampToDoubleCode (java.lang.String ts)  { throw new RuntimeException(); }
  private  scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> castToBooleanCode (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> castToByteCode (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> castToShortCode (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> castToIntCode (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> castToLongCode (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> castToFloatCode (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> castToDoubleCode (org.apache.spark.sql.types.DataType from)  { throw new RuntimeException(); }
  private  scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> castArrayCode (org.apache.spark.sql.types.DataType fromType, org.apache.spark.sql.types.DataType toType, org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  private  scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> castMapCode (org.apache.spark.sql.types.MapType from, org.apache.spark.sql.types.MapType to, org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  private  scala.Function3<java.lang.String, java.lang.String, java.lang.String, java.lang.String> castStructCode (org.apache.spark.sql.types.StructType from, org.apache.spark.sql.types.StructType to, org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
}
