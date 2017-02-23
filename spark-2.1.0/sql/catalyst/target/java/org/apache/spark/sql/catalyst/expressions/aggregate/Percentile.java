package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * The Percentile aggregate function returns the exact percentile(s) of numeric column <code>expr</code> at
 * the given percentage(s) with value range in [0.0, 1.0].
 * <p>
 * The operator is bound to the slower sort based aggregation path because the number of elements
 * and their partial order cannot be determined in advance. Therefore we have to store all the
 * elements in memory, and that too many elements can cause GC paused and eventually OutOfMemory
 * Errors.
 * <p>
 * param:  child child expression that produce numeric column value with <code>child.eval(inputRow)</code>
 * param:  percentageExpression Expression that represents a single percentage value or an array of
 *                             percentage values. Each percentage value must be in the range
 *                             [0.0, 1.0].
 */
public  class Percentile extends org.apache.spark.sql.catalyst.expressions.aggregate.TypedImperativeAggregate<org.apache.spark.util.collection.OpenHashMap<java.lang.Number, java.lang.Object>> implements scala.Product, scala.Serializable {
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
  static protected  scala.collection.Iterator<java.lang.Object> flatArguments ()  { throw new RuntimeException(); }
  static public final  java.lang.String verboseString ()  { throw new RuntimeException(); }
  static public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  java.lang.String sql ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.InternalRow eval$default$1 ()  { throw new RuntimeException(); }
  static public final  boolean foldable ()  { throw new RuntimeException(); }
  static public  boolean supportsPartial ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.catalyst.expressions.Literal> defaultResult ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression toAggregateExpression ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression toAggregateExpression (boolean isDistinct)  { throw new RuntimeException(); }
  static public  java.lang.String sql (boolean isDistinct)  { throw new RuntimeException(); }
  static public  java.lang.String toAggString (boolean isDistinct)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  static public final  void initialize (org.apache.spark.sql.catalyst.InternalRow buffer)  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes ()  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> inputAggBufferAttributes ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.sql.types.StructType aggBufferSchema ()  { throw new RuntimeException(); }
  static public final  void serializeAggregateBufferInPlace (org.apache.spark.sql.catalyst.InternalRow buffer)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression percentageExpression ()  { throw new RuntimeException(); }
  public  int mutableAggBufferOffset ()  { throw new RuntimeException(); }
  public  int inputAggBufferOffset ()  { throw new RuntimeException(); }
  // not preceding
  public   Percentile (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression percentageExpression, int mutableAggBufferOffset, int inputAggBufferOffset)  { throw new RuntimeException(); }
  public   Percentile (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression percentageExpression)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.Percentile withNewMutableAggBufferOffset (int newMutableAggBufferOffset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.Percentile withNewInputAggBufferOffset (int newInputAggBufferOffset)  { throw new RuntimeException(); }
  private  boolean returnPercentileArray ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.Object> percentages ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.OpenHashMap<java.lang.Number, java.lang.Object> createAggregationBuffer ()  { throw new RuntimeException(); }
  public  void update (org.apache.spark.util.collection.OpenHashMap<java.lang.Number, java.lang.Object> buffer, org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  void merge (org.apache.spark.util.collection.OpenHashMap<java.lang.Number, java.lang.Object> buffer, org.apache.spark.util.collection.OpenHashMap<java.lang.Number, java.lang.Object> other)  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.util.collection.OpenHashMap<java.lang.Number, java.lang.Object> buffer)  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.Object> getPercentiles (org.apache.spark.util.collection.OpenHashMap<java.lang.Number, java.lang.Object> buffer)  { throw new RuntimeException(); }
  private  Object generateOutput (scala.collection.Seq<java.lang.Object> results)  { throw new RuntimeException(); }
  /**
   * Get the percentile value.
   * <p>
   * This function has been based upon similar function from HIVE
   * <code>org.apache.hadoop.hive.ql.udf.UDAFPercentile.getPercentile()</code>.
   * @param aggreCounts (undocumented)
   * @param position (undocumented)
   * @return (undocumented)
   */
  private  java.lang.Number getPercentile (scala.collection.Seq<scala.Tuple2<java.lang.Number, java.lang.Object>> aggreCounts, double position)  { throw new RuntimeException(); }
  /**
   * use a binary search to find the index of the position closest to the current value.
   * @param countsArray (undocumented)
   * @param start (undocumented)
   * @param end (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  private  int binarySearchCount (long[] countsArray, int start, int end, long value)  { throw new RuntimeException(); }
  public  byte[] serialize (org.apache.spark.util.collection.OpenHashMap<java.lang.Number, java.lang.Object> obj)  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.OpenHashMap<java.lang.Number, java.lang.Object> deserialize (byte[] bytes)  { throw new RuntimeException(); }
}
