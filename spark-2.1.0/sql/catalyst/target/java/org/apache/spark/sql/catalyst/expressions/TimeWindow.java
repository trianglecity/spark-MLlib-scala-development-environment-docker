package org.apache.spark.sql.catalyst.expressions;
public  class TimeWindow extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, org.apache.spark.sql.catalyst.expressions.Unevaluable, org.apache.spark.sql.catalyst.expressions.NonSQLExpression, scala.Product, scala.Serializable {
  /**
   * Parses the interval string for a valid time duration. CalendarInterval expects interval
   * strings to start with the string <code>interval</code>. For usability, we prepend <code>interval</code> to the string
   * if the user omitted it.
   * <p>
   * @param interval The interval string
   * @return The interval duration in microseconds. SparkSQL casts TimestampType has microsecond
   *         precision.
   */
  static private  long getIntervalInMicroSeconds (java.lang.String interval)  { throw new RuntimeException(); }
  /**
   * Parses the duration expression to generate the long value for the original constructor so
   * that we can use <code>window</code> in SQL.
   * @param expr (undocumented)
   * @return (undocumented)
   */
  static private  long parseExpression (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.TimeWindow apply (org.apache.spark.sql.catalyst.expressions.Expression timeColumn, java.lang.String windowDuration, java.lang.String slideDuration, java.lang.String startTime)  { throw new RuntimeException(); }
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
  static public  boolean childrenResolved ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.Expression canonicalized ()  { throw new RuntimeException(); }
  static public  boolean semanticEquals (org.apache.spark.sql.catalyst.expressions.Expression other)  { throw new RuntimeException(); }
  static public  int semanticHash ()  { throw new RuntimeException(); }
  static public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  static protected  scala.collection.Iterator<java.lang.Object> flatArguments ()  { throw new RuntimeException(); }
  static public final  java.lang.String verboseString ()  { throw new RuntimeException(); }
  static public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  static public  boolean foldable ()  { throw new RuntimeException(); }
  static public  boolean nullable ()  { throw new RuntimeException(); }
  static public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  static protected  Object nullSafeEval (Object input)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode defineCodeGen (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev, scala.Function1<java.lang.String, java.lang.String> f)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode nullSafeCodeGen (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev, scala.Function1<java.lang.String, java.lang.String> f)  { throw new RuntimeException(); }
  static public final  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  static public final  org.apache.spark.sql.catalyst.InternalRow eval$default$1 ()  { throw new RuntimeException(); }
  static public final  java.lang.String sql ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression timeColumn ()  { throw new RuntimeException(); }
  public  long windowDuration ()  { throw new RuntimeException(); }
  public  long slideDuration ()  { throw new RuntimeException(); }
  public  long startTime ()  { throw new RuntimeException(); }
  // not preceding
  public   TimeWindow (org.apache.spark.sql.catalyst.expressions.Expression timeColumn, long windowDuration, long slideDuration, long startTime)  { throw new RuntimeException(); }
  public   TimeWindow (org.apache.spark.sql.catalyst.expressions.Expression timeColumn, org.apache.spark.sql.catalyst.expressions.Expression windowDuration, org.apache.spark.sql.catalyst.expressions.Expression slideDuration, org.apache.spark.sql.catalyst.expressions.Expression startTime)  { throw new RuntimeException(); }
  public   TimeWindow (org.apache.spark.sql.catalyst.expressions.Expression timeColumn, org.apache.spark.sql.catalyst.expressions.Expression windowDuration, org.apache.spark.sql.catalyst.expressions.Expression slideDuration)  { throw new RuntimeException(); }
  public   TimeWindow (org.apache.spark.sql.catalyst.expressions.Expression timeColumn, org.apache.spark.sql.catalyst.expressions.Expression windowDuration)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean resolved ()  { throw new RuntimeException(); }
  /**
   * Validate the inputs for the window duration, slide duration, and start time in addition to
   * the input data type.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
}
