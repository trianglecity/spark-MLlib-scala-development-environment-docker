package org.apache.spark.sql.execution;
/**
 * Iterates over a presorted set of rows, chunking it up by the grouping expression.  Each call to
 * next will return a pair containing the current group and an iterator that will return all the
 * elements of that group.  Iterators for each group are lazily constructed by extracting rows
 * from the input iterator.  As such, full groups are never materialized by this class.
 * <p>
 * Example input:
 * <pre><code>
 *   Input: [a, 1], [b, 2], [b, 3]
 *   Grouping: x#1
 *   InputSchema: x#1, y#2
 * </code></pre>
 * <p>
 * Result:
 * <pre><code>
 *   First call to next():  ([a], Iterator([a, 1])
 *   Second call to next(): ([b], Iterator([b, 2], [b, 3])
 * </code></pre>
 * <p>
 * Note, the class does not handle the case of an empty input for simplicity of implementation.
 * Use the factory to construct a new instance.
 * <p>
 * param:  input An iterator of rows.  This iterator must be ordered by the groupingExpressions or
 *              it is possible for the same group to appear more than once.
 * param:  groupingExpressions The set of expressions used to do grouping.  The result of evaluating
 *                            these expressions will be returned as the first part of each call
 *                            to <code>next()</code>.
 * param:  inputSchema The schema of the rows in the <code>input</code> iterator.
 */
public  class GroupedIterator implements scala.collection.Iterator<scala.Tuple2<org.apache.spark.sql.catalyst.InternalRow, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>>> {
  static public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.sql.catalyst.InternalRow, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>>> apply (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> input, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> keyExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  static protected  scala.collection.immutable.List<A> reversed ()  { throw new RuntimeException(); }
  static public  int size ()  { throw new RuntimeException(); }
  static public  boolean nonEmpty ()  { throw new RuntimeException(); }
  static public  int count (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.Option<B> collectFirst (scala.PartialFunction<A, B> pf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> B $div$colon (B z, scala.Function2<B, A, B> op)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> B $colon$bslash (B z, scala.Function2<A, B, B> op)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> B foldLeft (B z, scala.Function2<B, A, B> op)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> B foldRight (B z, scala.Function2<A, B, B> op)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> B reduceLeft (scala.Function2<B, A, B> op)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> B reduceRight (scala.Function2<A, B, B> op)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.Option<B> reduceLeftOption (scala.Function2<B, A, B> op)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.Option<B> reduceRightOption (scala.Function2<A, B, B> op)  { throw new RuntimeException(); }
  static public <A1 extends java.lang.Object> A1 reduce (scala.Function2<A1, A1, A1> op)  { throw new RuntimeException(); }
  static public <A1 extends java.lang.Object> scala.Option<A1> reduceOption (scala.Function2<A1, A1, A1> op)  { throw new RuntimeException(); }
  static public <A1 extends java.lang.Object> A1 fold (A1 z, scala.Function2<A1, A1, A1> op)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> B aggregate (scala.Function0<B> z, scala.Function2<B, A, B> seqop, scala.Function2<B, B, B> combop)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> B sum (scala.math.Numeric<B> num)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> B product (scala.math.Numeric<B> num)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> A min (scala.math.Ordering<B> cmp)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> A max (scala.math.Ordering<B> cmp)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> A maxBy (scala.Function1<A, B> f, scala.math.Ordering<B> cmp)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> A minBy (scala.Function1<A, B> f, scala.math.Ordering<B> cmp)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> void copyToBuffer (scala.collection.mutable.Buffer<B> dest)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> void copyToArray (java.lang.Object xs, int start)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> void copyToArray (java.lang.Object xs)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> java.lang.Object toArray (scala.reflect.ClassTag<B> evidence$1)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.List<A> toList ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterable<A> toIterable ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<A> toSeq ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.IndexedSeq<A> toIndexedSeq ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.mutable.Buffer<B> toBuffer ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.immutable.Set<B> toSet ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Vector<A> toVector ()  { throw new RuntimeException(); }
  static public <Col extends java.lang.Object> Col to (scala.collection.generic.CanBuildFrom<scala.runtime.Nothing$, A, Col> cbf)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object, U extends java.lang.Object> scala.collection.immutable.Map<T, U> toMap (scala.Predef.$less$colon$less<A, scala.Tuple2<T, U>> ev)  { throw new RuntimeException(); }
  static public  java.lang.String mkString (java.lang.String start, java.lang.String sep, java.lang.String end)  { throw new RuntimeException(); }
  static public  java.lang.String mkString (java.lang.String sep)  { throw new RuntimeException(); }
  static public  java.lang.String mkString ()  { throw new RuntimeException(); }
  static public  scala.collection.mutable.StringBuilder addString (scala.collection.mutable.StringBuilder b, java.lang.String start, java.lang.String sep, java.lang.String end)  { throw new RuntimeException(); }
  static public  scala.collection.mutable.StringBuilder addString (scala.collection.mutable.StringBuilder b, java.lang.String sep)  { throw new RuntimeException(); }
  static public  scala.collection.mutable.StringBuilder addString (scala.collection.mutable.StringBuilder b)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<A> seq ()  { throw new RuntimeException(); }
  static public  boolean isEmpty ()  { throw new RuntimeException(); }
  static public  boolean isTraversableAgain ()  { throw new RuntimeException(); }
  static public  boolean hasDefiniteSize ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<A> take (int n)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<A> drop (int n)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<A> slice (int from, int until)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Iterator<B> map (scala.Function1<A, B> f)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Iterator<B> $plus$plus (scala.Function0<scala.collection.GenTraversableOnce<B>> that)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Iterator<B> flatMap (scala.Function1<A, scala.collection.GenTraversableOnce<B>> f)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<A> filter (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> boolean corresponds (scala.collection.GenTraversableOnce<B> that, scala.Function2<A, B, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<A> withFilter (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<A> filterNot (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Iterator<B> collect (scala.PartialFunction<A, B> pf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Iterator<B> scanLeft (B z, scala.Function2<B, A, B> op)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Iterator<B> scanRight (B z, scala.Function2<A, B, B> op)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<A> takeWhile (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  scala.Tuple2<scala.collection.Iterator<A>, scala.collection.Iterator<A>> partition (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  scala.Tuple2<scala.collection.Iterator<A>, scala.collection.Iterator<A>> span (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<A> dropWhile (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Iterator<scala.Tuple2<A, B>> zip (scala.collection.Iterator<B> that)  { throw new RuntimeException(); }
  static public <A1 extends java.lang.Object> scala.collection.Iterator<A1> padTo (int len, A1 elem)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<scala.Tuple2<A, java.lang.Object>> zipWithIndex ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, A1 extends java.lang.Object, B1 extends java.lang.Object> scala.collection.Iterator<scala.Tuple2<A1, B1>> zipAll (scala.collection.Iterator<B> that, A1 thisElem, B1 thatElem)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> void foreach (scala.Function1<A, U> f)  { throw new RuntimeException(); }
  static public  boolean forall (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  boolean exists (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  boolean contains (Object elem)  { throw new RuntimeException(); }
  static public  scala.Option<A> find (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  int indexWhere (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> int indexOf (B elem)  { throw new RuntimeException(); }
  static public  scala.collection.BufferedIterator<A> buffered ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Iterator<A>.GroupedIterator<B> grouped (int size)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Iterator<A>.GroupedIterator<B> sliding (int size, int step)  { throw new RuntimeException(); }
  static public  int length ()  { throw new RuntimeException(); }
  static public  scala.Tuple2<scala.collection.Iterator<A>, scala.collection.Iterator<A>> duplicate ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Iterator<B> patch (int from, scala.collection.Iterator<B> patchElems, int replaced)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> void copyToArray (java.lang.Object xs, int start, int len)  { throw new RuntimeException(); }
  static public  boolean sameElements (scala.collection.Iterator<?> that)  { throw new RuntimeException(); }
  static public  scala.collection.Traversable<A> toTraversable ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<A> toIterator ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Stream<A> toStream ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> int sliding$default$2 ()  { throw new RuntimeException(); }
  private   GroupedIterator (scala.collection.BufferedIterator<org.apache.spark.sql.catalyst.InternalRow> input, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupingExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  /** Compares two input rows and returns 0 if they are in the same group. */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> sortOrder ()  { throw new RuntimeException(); }
  public  scala.math.Ordering<org.apache.spark.sql.catalyst.InternalRow> keyOrdering ()  { throw new RuntimeException(); }
  /** Creates a row containing only the key for a given input row. */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection keyProjection ()  { throw new RuntimeException(); }
  /**
   * Holds null or the row that will be returned on next call to <code>next()</code> in the inner iterator.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.InternalRow currentRow ()  { throw new RuntimeException(); }
  /** Holds a copy of an input row that is in the current group. */
  public  org.apache.spark.sql.catalyst.InternalRow currentGroup ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> currentIterator ()  { throw new RuntimeException(); }
  /**
   * Return true if we already have the next iterator or fetching a new iterator is successful.
   * <p>
   * Note that, if we get the iterator by <code>next</code>, we should consume it before call <code>hasNext</code>,
   * because we will consume the input data to skip to next group while fetching a new iterator,
   * thus make the previous iterator empty.
   * @return (undocumented)
   */
  public  boolean hasNext ()  { throw new RuntimeException(); }
  public  scala.Tuple2<org.apache.spark.sql.catalyst.InternalRow, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>> next ()  { throw new RuntimeException(); }
  private  boolean fetchNextGroupIterator ()  { throw new RuntimeException(); }
  private  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> createGroupValuesIterator ()  { throw new RuntimeException(); }
}
