package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * The ApproximatePercentile function returns the approximate percentile(s) of a column at the given
 * percentage(s). A percentile is a watermark value below which a given percentage of the column
 * values fall. For example, the percentile of column <code>col</code> at percentage 50% is the median of
 * column <code>col</code>.
 * <p>
 * This function supports partial aggregation.
 * <p>
 * param:  child child expression that can produce column value with <code>child.eval(inputRow)</code>
 * param:  percentageExpression Expression that represents a single percentage value or
 *                             an array of percentage values. Each percentage value must be between
 *                             0.0 and 1.0.
 * param:  accuracyExpression Integer literal expression of approximation accuracy. Higher value
 *                           yields better accuracy, the default value is
 *                           DEFAULT_PERCENTILE_ACCURACY.
 */
public  class ApproximatePercentile extends org.apache.spark.sql.catalyst.expressions.aggregate.TypedImperativeAggregate<org.apache.spark.sql.catalyst.expressions.aggregate.ApproximatePercentile.PercentileDigest> implements scala.Product, scala.Serializable {
  /**
   * PercentileDigest is a probabilistic data structure used for approximating percentiles
   * with limited memory. PercentileDigest is backed by {@link QuantileSummaries}.
   * <p>
   * param:  summaries underlying probabilistic data structure {@link QuantileSummaries}.
   * param:  isCompressed An internal flag from class {@link QuantileSummaries} to indicate whether the
   *                   underlying quantileSummaries is compressed.
   */
  static public  class PercentileDigest {
    private  org.apache.spark.sql.catalyst.util.QuantileSummaries summaries ()  { throw new RuntimeException(); }
    private  boolean isCompressed ()  { throw new RuntimeException(); }
    // not preceding
    public   PercentileDigest (org.apache.spark.sql.catalyst.util.QuantileSummaries summaries, boolean isCompressed)  { throw new RuntimeException(); }
    public   PercentileDigest (double relativeError)  { throw new RuntimeException(); }
    /** Returns compressed object of {@link QuantileSummaries} */
    public  org.apache.spark.sql.catalyst.util.QuantileSummaries quantileSummaries ()  { throw new RuntimeException(); }
    /** Insert an observation value into the PercentileDigest data structure. */
    public  void add (double value)  { throw new RuntimeException(); }
    /** In-place merges in another PercentileDigest. */
    public  void merge (org.apache.spark.sql.catalyst.expressions.aggregate.ApproximatePercentile.PercentileDigest other)  { throw new RuntimeException(); }
    /**
     * Returns the approximate percentiles of all observation values at the given percentages.
     * A percentile is a watermark value below which a given percentage of observation values fall.
     * For example, the following code returns the 25th, median, and 75th percentiles of
     * all observation values:
     * <p>
     * <pre><code>
     *   val Array(p25, median, p75) = percentileDigest.getPercentiles(Array(0.25, 0.5, 0.75))
     * </code></pre>
     * @param percentages (undocumented)
     * @return (undocumented)
     */
    public  double[] getPercentiles (double[] percentages)  { throw new RuntimeException(); }
    private final  void compress ()  { throw new RuntimeException(); }
  }
  /**
   * Serializer  for class {@link PercentileDigest}
   * <p>
   * This class is thread safe.
   */
  static public  class PercentileDigestSerializer {
    public   PercentileDigestSerializer ()  { throw new RuntimeException(); }
    private final  int length (org.apache.spark.sql.catalyst.util.QuantileSummaries summaries)  { throw new RuntimeException(); }
    public final  byte[] serialize (org.apache.spark.sql.catalyst.expressions.aggregate.ApproximatePercentile.PercentileDigest obj)  { throw new RuntimeException(); }
    public final  org.apache.spark.sql.catalyst.expressions.aggregate.ApproximatePercentile.PercentileDigest deserialize (byte[] bytes)  { throw new RuntimeException(); }
  }
  static public  int DEFAULT_PERCENTILE_ACCURACY ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.aggregate.ApproximatePercentile.PercentileDigestSerializer serializer ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.sql.catalyst.expressions.Expression accuracyExpression ()  { throw new RuntimeException(); }
  public  int mutableAggBufferOffset ()  { throw new RuntimeException(); }
  public  int inputAggBufferOffset ()  { throw new RuntimeException(); }
  // not preceding
  public   ApproximatePercentile (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression percentageExpression, org.apache.spark.sql.catalyst.expressions.Expression accuracyExpression, int mutableAggBufferOffset, int inputAggBufferOffset)  { throw new RuntimeException(); }
  public   ApproximatePercentile (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression percentageExpression, org.apache.spark.sql.catalyst.expressions.Expression accuracyExpression)  { throw new RuntimeException(); }
  public   ApproximatePercentile (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression percentageExpression)  { throw new RuntimeException(); }
  private  int accuracy ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  // not preceding
  private  boolean returnPercentileArray ()  { throw new RuntimeException(); }
  private  double[] percentages ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ApproximatePercentile.PercentileDigest createAggregationBuffer ()  { throw new RuntimeException(); }
  public  void update (org.apache.spark.sql.catalyst.expressions.aggregate.ApproximatePercentile.PercentileDigest buffer, org.apache.spark.sql.catalyst.InternalRow inputRow)  { throw new RuntimeException(); }
  public  void merge (org.apache.spark.sql.catalyst.expressions.aggregate.ApproximatePercentile.PercentileDigest buffer, org.apache.spark.sql.catalyst.expressions.aggregate.ApproximatePercentile.PercentileDigest other)  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.expressions.aggregate.ApproximatePercentile.PercentileDigest buffer)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ApproximatePercentile withNewMutableAggBufferOffset (int newOffset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ApproximatePercentile withNewInputAggBufferOffset (int newOffset)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  byte[] serialize (org.apache.spark.sql.catalyst.expressions.aggregate.ApproximatePercentile.PercentileDigest obj)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ApproximatePercentile.PercentileDigest deserialize (byte[] bytes)  { throw new RuntimeException(); }
}
