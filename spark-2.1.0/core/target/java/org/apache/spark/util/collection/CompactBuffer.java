package org.apache.spark.util.collection;
/**
 * An append-only buffer similar to ArrayBuffer, but more memory-efficient for small buffers.
 * ArrayBuffer always allocates an Object array to store the data, with 16 entries by default,
 * so it has about 80-100 bytes of overhead. In contrast, CompactBuffer can keep up to two
 * elements in fields of the main object, and only allocates an Array[AnyRef] if there are more
 * entries than that. This makes it more efficient for operations like groupBy where we expect
 * some keys to have very few elements.
 */
  class CompactBuffer<T extends java.lang.Object> implements scala.collection.Seq<T>, scala.Serializable {
  static public <A extends java.lang.Object> scala.Function1<A, R> compose (scala.Function1<A, T1> g)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public abstract  boolean isDefinedAt (A x)  ;
  static public <A1 extends A, B1 extends java.lang.Object> scala.PartialFunction<A1, B1> orElse (scala.PartialFunction<A1, B1> that)  { throw new RuntimeException(); }
  static public <C extends java.lang.Object> scala.PartialFunction<A, C> andThen (scala.Function1<B, C> k)  { throw new RuntimeException(); }
  static public  scala.Function1<A, scala.Option<B>> lift ()  { throw new RuntimeException(); }
  static public <A1 extends A, B1 extends java.lang.Object> B1 applyOrElse (A1 x, scala.Function1<A1, B1> default_)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> scala.Function1<A, java.lang.Object> runWith (scala.Function1<B, U> action)  { throw new RuntimeException(); }
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
  static public <U extends java.lang.Object> void foreach (scala.Function1<A, U> f)  { throw new RuntimeException(); }
  static public  boolean forall (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  boolean exists (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  scala.Option<A> find (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
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
  static public  boolean isDefinedAt (int idx)  { throw new RuntimeException(); }
  static public  int prefixLength (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  int indexWhere (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> int indexOf (B elem)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> int indexOf (B elem, int from)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> int lastIndexOf (B elem)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> int lastIndexOf (B elem, int end)  { throw new RuntimeException(); }
  static public  int lastIndexWhere (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> boolean startsWith (scala.collection.GenSeq<B> that)  { throw new RuntimeException(); }
  static public  int hashCode ()  { throw new RuntimeException(); }
  static public  boolean equals (Object that)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<A> thisCollection ()  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<A> toCollection (Repr repr)  { throw new RuntimeException(); }
  static protected  scala.collection.parallel.Combiner<A, scala.collection.parallel.ParSeq<A>> parCombiner ()  { throw new RuntimeException(); }
  static public  int lengthCompare (int len)  { throw new RuntimeException(); }
  static public  boolean isEmpty ()  { throw new RuntimeException(); }
  static public  int segmentLength (scala.Function1<A, java.lang.Object> p, int from)  { throw new RuntimeException(); }
  static public  int indexWhere (scala.Function1<A, java.lang.Object> p, int from)  { throw new RuntimeException(); }
  static public  int lastIndexWhere (scala.Function1<A, java.lang.Object> p, int end)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<Repr> permutations ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<Repr> combinations (int n)  { throw new RuntimeException(); }
  static public  Repr reverse ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That reverseMap (scala.Function1<A, B> f, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<A> reverseIterator ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> boolean startsWith (scala.collection.GenSeq<B> that, int offset)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> boolean endsWith (scala.collection.GenSeq<B> that)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> int indexOfSlice (scala.collection.GenSeq<B> that)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> int indexOfSlice (scala.collection.GenSeq<B> that, int from)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> int lastIndexOfSlice (scala.collection.GenSeq<B> that)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> int lastIndexOfSlice (scala.collection.GenSeq<B> that, int end)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> boolean containsSlice (scala.collection.GenSeq<B> that)  { throw new RuntimeException(); }
  static public <A1 extends java.lang.Object> boolean contains (A1 elem)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That union (scala.collection.GenSeq<B> that, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> Repr diff (scala.collection.GenSeq<B> that)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> Repr intersect (scala.collection.GenSeq<B> that)  { throw new RuntimeException(); }
  static public  Repr distinct ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That patch (int from, scala.collection.GenSeq<B> patch, int replaced, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That updated (int index, B elem, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That $plus$colon (B elem, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That $colon$plus (B elem, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That padTo (int len, B elem, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> boolean corresponds (scala.collection.GenSeq<B> that, scala.Function2<A, B, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  Repr sortWith (scala.Function2<A, A, java.lang.Object> lt)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> Repr sortBy (scala.Function1<A, B> f, scala.math.Ordering<B> ord)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> Repr sorted (scala.math.Ordering<B> ord)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<A> toSeq ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Range indices ()  { throw new RuntimeException(); }
  static public  java.lang.Object view ()  { throw new RuntimeException(); }
  static public  scala.collection.SeqView<A, Repr> view (int from, int until)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  scala.collection.generic.GenericCompanion<scala.collection.Seq> companion ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<A> seq ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   CompactBuffer (scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  private  T element0 ()  { throw new RuntimeException(); }
  private  T element1 ()  { throw new RuntimeException(); }
  private  int curSize ()  { throw new RuntimeException(); }
  private  java.lang.Object otherElements ()  { throw new RuntimeException(); }
  public  T apply (int position)  { throw new RuntimeException(); }
  private  void update (int position, T value)  { throw new RuntimeException(); }
  public  int length ()  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<T> iterator ()  { throw new RuntimeException(); }
  /** Increase our size to newSize and grow the backing array if needed. */
  private  void growToSize (int newSize)  { throw new RuntimeException(); }
}
