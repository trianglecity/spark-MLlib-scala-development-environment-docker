package org.apache.spark.sql.catalyst.expressions;
/**
 * The NTile function divides the rows for each window partition into <code>n</code> buckets ranging from 1 to
 * at most <code>n</code>. Bucket values will differ by at most 1. If the number of rows in the partition does
 * not divide evenly into the number of buckets, then the remainder values are distributed one per
 * bucket, starting with the first bucket.
 * <p>
 * The NTile function is particularly useful for the calculation of tertiles, quartiles, deciles and
 * other common summary statistics
 * <p>
 * The function calculates two variables during initialization: The size of a regular bucket, and
 * the number of buckets that will have one extra row added to it (when the rows do not evenly fit
 * into the number of buckets); both variables are based on the size of the current partition.
 * During the calculation process the function keeps track of the current row number, the current
 * bucket number, and the row number at which the bucket will change (bucketThreshold). When the
 * current row number reaches bucket threshold, the bucket value is increased by one and the the
 * threshold is increased by the bucket size (plus one extra if the current bucket is padded).
 * <p>
 * This documentation has been based upon similar documentation for the Hive and Presto projects.
 * <p>
 * param:  buckets number of buckets to divide the rows in. Default value is 1.
 */
public  class NTile extends org.apache.spark.sql.catalyst.expressions.RowNumberLike implements org.apache.spark.sql.catalyst.expressions.SizeBasedWindowFunction, scala.Product, scala.Serializable {
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
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  java.lang.String sql ()  { throw new RuntimeException(); }
  static public final  boolean foldable ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.catalyst.expressions.Literal> defaultResult ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression toAggregateExpression ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression toAggregateExpression (boolean isDistinct)  { throw new RuntimeException(); }
  static public  java.lang.String sql (boolean isDistinct)  { throw new RuntimeException(); }
  static public  java.lang.String toAggString (boolean isDistinct)  { throw new RuntimeException(); }
  static public final  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  static public final  org.apache.spark.sql.catalyst.InternalRow eval$default$1 ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.sql.types.StructType aggBufferSchema ()  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> inputAggBufferAttributes ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.aggregate.DeclarativeAggregate.RichAttribute RichAttribute (org.apache.spark.sql.catalyst.expressions.AttributeReference a)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.SpecifiedWindowFrame frame ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  static public  boolean nullable ()  { throw new RuntimeException(); }
  static public  boolean supportsPartial ()  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ mergeExpressions ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Literal zero ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Literal one ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.AttributeReference rowNumber ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeReference n ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression buckets ()  { throw new RuntimeException(); }
  // not preceding
  public   NTile (org.apache.spark.sql.catalyst.expressions.Expression buckets)  { throw new RuntimeException(); }
  public   NTile ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.AttributeReference bucket ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.AttributeReference bucketThreshold ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.AttributeReference bucketSize ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.AttributeReference bucketsWithPadding ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.If bucketOverflow (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> initialValues ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> updateExpressions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference evaluateExpression ()  { throw new RuntimeException(); }
}
