package org.apache.spark.util.collection;
/**
 * :: DeveloperApi ::
 * A simple open hash table optimized for the append-only use case, where keys
 * are never removed, but the value for each key may be changed.
 * <p>
 * This implementation uses quadratic probing with a power-of-2 hash table
 * size, which is guaranteed to explore all spaces for each key (see
 * http://en.wikipedia.org/wiki/Quadratic_probing).
 * <p>
 * The map can support up to <code>375809638 (0.7 * 2 ^ 29)</code> elements.
 * <p>
 * TODO: Cache the hash values of each key? java.util.HashMap does that.
 */
public  class AppendOnlyMap<K extends java.lang.Object, V extends java.lang.Object> implements scala.collection.Iterable<scala.Tuple2<K, V>>, scala.Serializable {
  static public  int MAXIMUM_CAPACITY ()  { throw new RuntimeException(); }
  static protected  scala.collection.immutable.List<A> reversed ()  { throw new RuntimeException(); }
  static public  boolean nonEmpty ()  { throw new RuntimeException(); }
  static public  int count (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.Option<B> collectFirst (scala.PartialFunction<A, B> pf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> B $div$colon (B z, scala.Function2<B, A, B> op)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> B $colon$bslash (B z, scala.Function2<A, B, B> op)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> B foldLeft (B z, scala.Function2<B, A, B> op)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> B reduceLeft (scala.Function2<B, A, B> op)  { throw new RuntimeException(); }
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
  static public  scala.collection.Seq<A> toSeq ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.IndexedSeq<A> toIndexedSeq ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.mutable.Buffer<B> toBuffer ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.immutable.Set<B> toSet ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Vector<A> toVector ()  { throw new RuntimeException(); }
  static public <T extends java.lang.Object, U extends java.lang.Object> scala.collection.immutable.Map<T, U> toMap (scala.Predef.$less$colon$less<A, scala.Tuple2<T, U>> ev)  { throw new RuntimeException(); }
  static public  java.lang.String mkString (java.lang.String start, java.lang.String sep, java.lang.String end)  { throw new RuntimeException(); }
  static public  java.lang.String mkString (java.lang.String sep)  { throw new RuntimeException(); }
  static public  java.lang.String mkString ()  { throw new RuntimeException(); }
  static public  scala.collection.mutable.StringBuilder addString (scala.collection.mutable.StringBuilder b, java.lang.String start, java.lang.String sep, java.lang.String end)  { throw new RuntimeException(); }
  static public  scala.collection.mutable.StringBuilder addString (scala.collection.mutable.StringBuilder b, java.lang.String sep)  { throw new RuntimeException(); }
  static public  scala.collection.mutable.StringBuilder addString (scala.collection.mutable.StringBuilder b)  { throw new RuntimeException(); }
  static public  ParRepr par ()  { throw new RuntimeException(); }
  static public  Repr repr ()  { throw new RuntimeException(); }
  static public final  boolean isTraversableAgain ()  { throw new RuntimeException(); }
  static protected abstract  scala.collection.mutable.Builder<A, Repr> newBuilder ()  ;
  static protected  scala.collection.parallel.Combiner<A, scala.collection.parallel.ParIterable<A>> parCombiner ()  { throw new RuntimeException(); }
  static public  boolean hasDefiniteSize ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That $plus$plus (scala.collection.GenTraversableOnce<B> that, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That $plus$plus$colon (scala.collection.TraversableOnce<B> that, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That $plus$plus$colon (scala.collection.Traversable<B> that, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That map (scala.Function1<A, B> f, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That flatMap (scala.Function1<A, scala.collection.GenTraversableOnce<B>> f, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public  Repr filter (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  Repr filterNot (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That collect (scala.PartialFunction<A, B> pf, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public  scala.Tuple2<Repr, Repr> partition (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> scala.collection.immutable.Map<K, Repr> groupBy (scala.Function1<A, K> f)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That scan (B z, scala.Function2<B, B, B> op, scala.collection.generic.CanBuildFrom<Repr, B, That> cbf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That scanLeft (B z, scala.Function2<B, A, B> op, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That scanRight (B z, scala.Function2<A, B, B> op, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public  scala.Option<A> headOption ()  { throw new RuntimeException(); }
  static public  Repr tail ()  { throw new RuntimeException(); }
  static public  A last ()  { throw new RuntimeException(); }
  static public  scala.Option<A> lastOption ()  { throw new RuntimeException(); }
  static public  Repr init ()  { throw new RuntimeException(); }
  static   Repr sliceWithKnownDelta (int from, int until, int delta)  { throw new RuntimeException(); }
  static   Repr sliceWithKnownBound (int from, int until)  { throw new RuntimeException(); }
  static public  Repr dropWhile (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  scala.Tuple2<Repr, Repr> span (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  scala.Tuple2<Repr, Repr> splitAt (int n)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<Repr> tails ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<Repr> inits ()  { throw new RuntimeException(); }
  static public  scala.collection.Traversable<A> toTraversable ()  { throw new RuntimeException(); }
  static public <Col extends java.lang.Object> Col to (scala.collection.generic.CanBuildFrom<scala.runtime.Nothing$, A, Col> cbf)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  java.lang.String stringPrefix ()  { throw new RuntimeException(); }
  static public  scala.collection.generic.FilterMonadic<A, Repr> withFilter (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public abstract <U extends java.lang.Object> void foreach (scala.Function1<A, U> f)  ;
  static public abstract  A head ()  ;
  static public abstract  boolean isEmpty ()  ;
  static protected  scala.collection.mutable.Builder<A, CC> newBuilder ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.mutable.Builder<B, CC> genericBuilder ()  { throw new RuntimeException(); }
  static public <A1 extends java.lang.Object, A2 extends java.lang.Object> scala.Tuple2<CC, CC> unzip (scala.Function1<A, scala.Tuple2<A1, A2>> asPair)  { throw new RuntimeException(); }
  static public <A1 extends java.lang.Object, A2 extends java.lang.Object, A3 extends java.lang.Object> scala.Tuple3<CC, CC, CC> unzip3 (scala.Function1<A, scala.Tuple3<A1, A2, A3>> asTriple)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> CC flatten (scala.Function1<A, scala.collection.GenTraversableOnce<B>> asTraversable)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> CC transpose (scala.Function1<A, scala.collection.GenTraversableOnce<B>> asTraversable)  { throw new RuntimeException(); }
  static public abstract  boolean equals (Object that)  ;
  static protected  scala.collection.Iterable<A> thisCollection ()  { throw new RuntimeException(); }
  static protected  scala.collection.Iterable<A> toCollection (Repr repr)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> void foreach (scala.Function1<A, U> f)  { throw new RuntimeException(); }
  static public  boolean forall (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  boolean exists (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  scala.Option<A> find (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  boolean isEmpty ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> B foldRight (B z, scala.Function2<A, B, B> op)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> B reduceRight (scala.Function2<A, B, B> op)  { throw new RuntimeException(); }
  static public  scala.collection.Iterable<A> toIterable ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<A> toIterator ()  { throw new RuntimeException(); }
  static public  A head ()  { throw new RuntimeException(); }
  static public  Repr slice (int from, int until)  { throw new RuntimeException(); }
  static public  Repr take (int n)  { throw new RuntimeException(); }
  static public  Repr drop (int n)  { throw new RuntimeException(); }
  static public  Repr takeWhile (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<Repr> grouped (int size)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<Repr> sliding (int size)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<Repr> sliding (int size, int step)  { throw new RuntimeException(); }
  static public  Repr takeRight (int n)  { throw new RuntimeException(); }
  static public  Repr dropRight (int n)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> void copyToArray (java.lang.Object xs, int start, int len)  { throw new RuntimeException(); }
  static public <A1 extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That zip (scala.collection.GenIterable<B> that, scala.collection.generic.CanBuildFrom<Repr, scala.Tuple2<A1, B>, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, A1 extends java.lang.Object, That extends java.lang.Object> That zipAll (scala.collection.GenIterable<B> that, A1 thisElem, B thatElem, scala.collection.generic.CanBuildFrom<Repr, scala.Tuple2<A1, B>, That> bf)  { throw new RuntimeException(); }
  static public <A1 extends java.lang.Object, That extends java.lang.Object> That zipWithIndex (scala.collection.generic.CanBuildFrom<Repr, scala.Tuple2<A1, java.lang.Object>, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> boolean sameElements (scala.collection.GenIterable<B> that)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Stream<A> toStream ()  { throw new RuntimeException(); }
  static public  boolean canEqual (Object that)  { throw new RuntimeException(); }
  static public  java.lang.Object view ()  { throw new RuntimeException(); }
  static public  scala.collection.IterableView<A, Repr> view (int from, int until)  { throw new RuntimeException(); }
  static public  scala.collection.generic.GenericCompanion<scala.collection.Iterable> companion ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterable<A> seq ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   AppendOnlyMap (int initialCapacity)  { throw new RuntimeException(); }
  private  double LOAD_FACTOR ()  { throw new RuntimeException(); }
  private  int capacity ()  { throw new RuntimeException(); }
  private  int mask ()  { throw new RuntimeException(); }
  private  int curSize ()  { throw new RuntimeException(); }
  private  int growThreshold ()  { throw new RuntimeException(); }
  private  java.lang.Object[] data ()  { throw new RuntimeException(); }
  private  boolean haveNullValue ()  { throw new RuntimeException(); }
  private  V nullValue ()  { throw new RuntimeException(); }
  private  boolean destroyed ()  { throw new RuntimeException(); }
  private  java.lang.String destructionMessage ()  { throw new RuntimeException(); }
  /** Get the value for a given key */
  public  V apply (K key)  { throw new RuntimeException(); }
  /** Set the value for a key */
  public  void update (K key, V value)  { throw new RuntimeException(); }
  /**
   * Set the value for key to updateFunc(hadValue, oldValue), where oldValue will be the old value
   * for key, if any, or null otherwise. Returns the newly updated value.
   * @param key (undocumented)
   * @param updateFunc (undocumented)
   * @return (undocumented)
   */
  public  V changeValue (K key, scala.Function2<java.lang.Object, V, V> updateFunc)  { throw new RuntimeException(); }
  /** Iterator method from Iterable */
  public  scala.collection.Iterator<scala.Tuple2<K, V>> iterator ()  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
  /** Increase table size by 1, rehashing if necessary */
  private  void incrementSize ()  { throw new RuntimeException(); }
  /**
   * Re-hash a value to deal better with hash functions that don't differ in the lower bits.
   * @param h (undocumented)
   * @return (undocumented)
   */
  private  int rehash (int h)  { throw new RuntimeException(); }
  /** Double the table's size and re-hash everything */
  protected  void growTable ()  { throw new RuntimeException(); }
  private  int nextPowerOf2 (int n)  { throw new RuntimeException(); }
  /**
   * Return an iterator of the map in sorted order. This provides a way to sort the map without
   * using additional memory, at the expense of destroying the validity of the map.
   * @param keyComparator (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Tuple2<K, V>> destructiveSortedIterator (java.util.Comparator<K> keyComparator)  { throw new RuntimeException(); }
  /**
   * Return whether the next insert will cause the map to grow
   * @return (undocumented)
   */
  public  boolean atGrowThreshold ()  { throw new RuntimeException(); }
}
