package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * HyperLogLog++ (HLL++) is a state of the art cardinality estimation algorithm. This class
 * implements the dense version of the HLL++ algorithm as an Aggregate Function.
 * <p>
 * This implementation has been based on the following papers:
 * HyperLogLog: the analysis of a near-optimal cardinality estimation algorithm
 * http://algo.inria.fr/flajolet/Publications/FlFuGaMe07.pdf
 * <p>
 * HyperLogLog in Practice: Algorithmic Engineering of a State of The Art Cardinality Estimation
 * Algorithm
 * http://static.googleusercontent.com/external_content/untrusted_dlcp/research.google.com/en/us/pubs/archive/40671.pdf
 * <p>
 * Appendix to HyperLogLog in Practice: Algorithmic Engineering of a State of the Art Cardinality
 * Estimation Algorithm
 * https://docs.google.com/document/d/1gyjfMHy43U9OWBXxfaeG-3MjGzejW1dlpyMwEYAAWEI/view?fullscreen#
 * <p>
 * param:  child to estimate the cardinality of.
 * param:  relativeSD the maximum estimation error allowed.
 */
public  class HyperLogLogPlusPlus extends org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate implements scala.Product, scala.Serializable {
  /**
   * The size of a word used for storing registers: 64 Bits.
   * @return (undocumented)
   */
  static public  int WORD_SIZE ()  { throw new RuntimeException(); }
  /**
   * The number of bits that is required per register.
   * <p>
   * This number is determined by the maximum number of leading binary zeros a hashcode can
   * produce. This is equal to the number of bits the hashcode returns. The current
   * implementation uses a 64-bit hashcode, this means 6-bits are (at most) needed to store the
   * number of leading zeros.
   * @return (undocumented)
   */
  static public  int REGISTER_SIZE ()  { throw new RuntimeException(); }
  /**
   * Value used to mask a register stored in a word.
   * @return (undocumented)
   */
  static public  long REGISTER_WORD_MASK ()  { throw new RuntimeException(); }
  /**
   * The number of registers which can be stored in one word.
   * @return (undocumented)
   */
  static public  int REGISTERS_PER_WORD ()  { throw new RuntimeException(); }
  /**
   * Number of points used for interpolating the bias value.
   * @return (undocumented)
   */
  static public  int K ()  { throw new RuntimeException(); }
  /**
   * Thresholds which decide if the linear counting or the regular algorithm is used.
   * @return (undocumented)
   */
  static public  double[] THRESHOLDS ()  { throw new RuntimeException(); }
  /**
   * Lookup table used to find the (index of the) bias correction for a given precision (exact)
   * and estimate (nearest).
   * @return (undocumented)
   */
  static public  double[][] RAW_ESTIMATE_DATA ()  { throw new RuntimeException(); }
  /**
   * Bias corrections given a precision and the index of the raw estimate table.
   * @return (undocumented)
   */
  static public  double[][] BIAS_DATA ()  { throw new RuntimeException(); }
  static private  double validateDoubleLiteral (org.apache.spark.sql.catalyst.expressions.Expression exp)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  static public final  boolean foldable ()  { throw new RuntimeException(); }
  static public  boolean supportsPartial ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.catalyst.expressions.Literal> defaultResult ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression toAggregateExpression ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression toAggregateExpression (boolean isDistinct)  { throw new RuntimeException(); }
  static public  java.lang.String sql (boolean isDistinct)  { throw new RuntimeException(); }
  static public  java.lang.String toAggString (boolean isDistinct)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  double relativeSD ()  { throw new RuntimeException(); }
  public  int mutableAggBufferOffset ()  { throw new RuntimeException(); }
  public  int inputAggBufferOffset ()  { throw new RuntimeException(); }
  // not preceding
  public   HyperLogLogPlusPlus (org.apache.spark.sql.catalyst.expressions.Expression child, double relativeSD, int mutableAggBufferOffset, int inputAggBufferOffset)  { throw new RuntimeException(); }
  public   HyperLogLogPlusPlus (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  public   HyperLogLogPlusPlus (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression relativeSD)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewMutableAggBufferOffset (int newMutableAggBufferOffset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewInputAggBufferOffset (int newInputAggBufferOffset)  { throw new RuntimeException(); }
  /**
   * The number of words used to store the registers. We use Longs for storage because this is the
   * most compact way of storage; Spark aligns to 8-byte words or uses Long wrappers.
   * <p>
   * We only store whole registers per word in order to prevent overly complex bitwise operations.
   * In practice this means we only use 60 out of 64 bits.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType aggBufferSchema ()  { throw new RuntimeException(); }
  /** Allocate enough words to store all registers. */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> inputAggBufferAttributes ()  { throw new RuntimeException(); }
  /** Fill all words with zeros. */
  public  void initialize (org.apache.spark.sql.catalyst.InternalRow buffer)  { throw new RuntimeException(); }
  /**
   * Update the HLL++ buffer.
   * <p>
   * Variable names in the HLL++ paper match variable names in the code.
   * @param buffer (undocumented)
   * @param input (undocumented)
   */
  public  void update (org.apache.spark.sql.catalyst.InternalRow buffer, org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  /**
   * Merge the HLL buffers by iterating through the registers in both buffers and select the
   * maximum number of leading zeros for each register.
   * @param buffer1 (undocumented)
   * @param buffer2 (undocumented)
   */
  public  void merge (org.apache.spark.sql.catalyst.InternalRow buffer1, org.apache.spark.sql.catalyst.InternalRow buffer2)  { throw new RuntimeException(); }
  /**
   * Estimate the bias using the raw estimates with their respective biases from the HLL++
   * appendix. We currently use KNN interpolation to determine the bias (as suggested in the
   * paper).
   * @param e (undocumented)
   * @return (undocumented)
   */
  public  double estimateBias (double e)  { throw new RuntimeException(); }
  /**
   * Compute the HyperLogLog estimate.
   * <p>
   * Variable names in the HLL++ paper match variable names in the code.
   * @param buffer (undocumented)
   * @return (undocumented)
   */
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow buffer)  { throw new RuntimeException(); }
  /**
   * The <code>rsd</code> of HLL++ is always equal to or better than the <code>rsd</code> requested.
   * This method returns the <code>rsd</code> this instance actually guarantees.
   * <p>
   * @return the actual <code>rsd</code>.
   */
  public  double trueRsd ()  { throw new RuntimeException(); }
}
