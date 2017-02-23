package org.apache.spark.util;
/**
 * This is a custom implementation of scala.collection.mutable.Map which stores the insertion
 * timestamp along with each key-value pair. If specified, the timestamp of each pair can be
 * updated every time it is accessed. Key-value pairs whose timestamp are older than a particular
 * threshold time can then be removed using the clearOldValues method. This is intended to
 * be a drop-in replacement of scala.collection.mutable.HashMap.
 * <p>
 * param:  updateTimeStampOnGet Whether timestamp of a pair will be updated when it is accessed
 */
  class TimeStampedHashMap<A extends java.lang.Object, B extends java.lang.Object> implements scala.collection.mutable.Map<A, B>, org.apache.spark.internal.Logging {
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
  static public <B extends java.lang.Object> scala.collection.immutable.Set<B> toSet ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Vector<A> toVector ()  { throw new RuntimeException(); }
  static public  java.lang.String mkString (java.lang.String start, java.lang.String sep, java.lang.String end)  { throw new RuntimeException(); }
  static public  java.lang.String mkString (java.lang.String sep)  { throw new RuntimeException(); }
  static public  java.lang.String mkString ()  { throw new RuntimeException(); }
  static public  scala.collection.mutable.StringBuilder addString (scala.collection.mutable.StringBuilder b, java.lang.String sep)  { throw new RuntimeException(); }
  static public  scala.collection.mutable.StringBuilder addString (scala.collection.mutable.StringBuilder b)  { throw new RuntimeException(); }
  static public  ParRepr par ()  { throw new RuntimeException(); }
  static public  Repr repr ()  { throw new RuntimeException(); }
  static public final  boolean isTraversableAgain ()  { throw new RuntimeException(); }
  static public  boolean hasDefiniteSize ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That $plus$plus (scala.collection.GenTraversableOnce<B> that, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That $plus$plus$colon (scala.collection.TraversableOnce<B> that, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That $plus$plus$colon (scala.collection.Traversable<B> that, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That map (scala.Function1<A, B> f, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That flatMap (scala.Function1<A, scala.collection.GenTraversableOnce<B>> f, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
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
  static public  scala.collection.generic.FilterMonadic<A, Repr> withFilter (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public abstract  A head ()  ;
  static public abstract  boolean isEmpty ()  ;
  static protected  scala.collection.mutable.Builder<A, CC> newBuilder ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.mutable.Builder<B, CC> genericBuilder ()  { throw new RuntimeException(); }
  static public <A1 extends java.lang.Object, A2 extends java.lang.Object> scala.Tuple2<CC, CC> unzip (scala.Function1<A, scala.Tuple2<A1, A2>> asPair)  { throw new RuntimeException(); }
  static public <A1 extends java.lang.Object, A2 extends java.lang.Object, A3 extends java.lang.Object> scala.Tuple3<CC, CC, CC> unzip3 (scala.Function1<A, scala.Tuple3<A1, A2, A3>> asTriple)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> CC flatten (scala.Function1<A, scala.collection.GenTraversableOnce<B>> asTraversable)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> CC transpose (scala.Function1<A, scala.collection.GenTraversableOnce<B>> asTraversable)  { throw new RuntimeException(); }
  static protected  scala.collection.Iterable<A> thisCollection ()  { throw new RuntimeException(); }
  static protected  scala.collection.Iterable<A> toCollection (Repr repr)  { throw new RuntimeException(); }
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
  static public  java.lang.Object view ()  { throw new RuntimeException(); }
  static public  scala.collection.IterableView<A, Repr> view (int from, int until)  { throw new RuntimeException(); }
  static public  scala.collection.generic.GenericCompanion<scala.collection.mutable.Iterable> companion ()  { throw new RuntimeException(); }
  static protected  scala.collection.parallel.Combiner<A, scala.collection.parallel.mutable.ParIterable<A>> parCombiner ()  { throw new RuntimeException(); }
  static public  int hashCode ()  { throw new RuntimeException(); }
  static public  boolean equals (Object that)  { throw new RuntimeException(); }
  static public abstract <B1 extends java.lang.Object> scala.collection.GenMap<A, B1> updated (A key, B1 value)  ;
  static public <A extends java.lang.Object> scala.Function1<A, R> compose (scala.Function1<A, T1> g)  { throw new RuntimeException(); }
  static public <A1 extends A, B1 extends java.lang.Object> scala.PartialFunction<A1, B1> orElse (scala.PartialFunction<A1, B1> that)  { throw new RuntimeException(); }
  static public <C extends java.lang.Object> scala.PartialFunction<A, C> andThen (scala.Function1<B, C> k)  { throw new RuntimeException(); }
  static public  scala.Function1<A, scala.Option<B>> lift ()  { throw new RuntimeException(); }
  static public <A1 extends A, B1 extends java.lang.Object> B1 applyOrElse (A1 x, scala.Function1<A1, B1> default_)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> scala.Function1<A, java.lang.Object> runWith (scala.Function1<B, U> action)  { throw new RuntimeException(); }
  static protected abstract  Repr repr ()  ;
  static public  boolean isEmpty ()  { throw new RuntimeException(); }
  static public <B1 extends java.lang.Object> B1 getOrElse (A key, scala.Function0<B1> default_)  { throw new RuntimeException(); }
  static public  boolean contains (A key)  { throw new RuntimeException(); }
  static public  boolean isDefinedAt (A key)  { throw new RuntimeException(); }
  static public  scala.collection.Set<A> keySet ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<A> keysIterator ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterable<A> keys ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterable<B> values ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<B> valuesIterator ()  { throw new RuntimeException(); }
  static public  scala.collection.Map<A, B> filterKeys (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public <C extends java.lang.Object> scala.collection.Map<A, C> mapValues (scala.Function1<B, C> f)  { throw new RuntimeException(); }
  static public  This filterNot (scala.Function1<scala.Tuple2<A, B>, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.Tuple2<A, B>> toSeq ()  { throw new RuntimeException(); }
  static public <C extends java.lang.Object> scala.collection.mutable.Buffer<C> toBuffer ()  { throw new RuntimeException(); }
  static public  scala.collection.mutable.StringBuilder addString (scala.collection.mutable.StringBuilder b, java.lang.String start, java.lang.String sep, java.lang.String end)  { throw new RuntimeException(); }
  static public  java.lang.String stringPrefix ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  scala.collection.generic.Growable<A> $plus$eq (A elem1, A elem2, scala.collection.Seq<A> elems)  { throw new RuntimeException(); }
  static public  scala.collection.generic.Growable<A> $plus$plus$eq (scala.collection.TraversableOnce<A> xs)  { throw new RuntimeException(); }
  static public  void sizeHint (int size)  { throw new RuntimeException(); }
  static public  void sizeHint (scala.collection.TraversableLike<?, ?> coll)  { throw new RuntimeException(); }
  static public  void sizeHint (scala.collection.TraversableLike<?, ?> coll, int delta)  { throw new RuntimeException(); }
  static public  void sizeHintBounded (int size, scala.collection.TraversableLike<?, ?> boundingColl)  { throw new RuntimeException(); }
  static public <NewTo extends java.lang.Object> scala.collection.mutable.Builder<Elem, NewTo> mapResult (scala.Function1<To, NewTo> f)  { throw new RuntimeException(); }
  static public  scala.collection.generic.Shrinkable<A> $minus$eq (A elem1, A elem2, scala.collection.Seq<A> elems)  { throw new RuntimeException(); }
  static public  scala.collection.generic.Shrinkable<A> $minus$minus$eq (scala.collection.TraversableOnce<A> xs)  { throw new RuntimeException(); }
  static protected  scala.collection.mutable.Builder<scala.Tuple2<A, B>, This> newBuilder ()  { throw new RuntimeException(); }
  static protected  scala.collection.parallel.Combiner<scala.Tuple2<A, B>, scala.collection.parallel.mutable.ParMap<A, B>> parCombiner ()  { throw new RuntimeException(); }
  static public  scala.Option<B> put (A key, B value)  { throw new RuntimeException(); }
  static public abstract  scala.collection.mutable.MapLike<A, B, This> $plus$eq (scala.Tuple2<A, B> kv)  ;
  static public <B1 extends java.lang.Object> scala.collection.mutable.Map<A, B1> updated (A key, B1 value)  { throw new RuntimeException(); }
  static public <B1 extends java.lang.Object> scala.collection.mutable.Map<A, B1> $plus (scala.Tuple2<A, B1> kv)  { throw new RuntimeException(); }
  static public <B1 extends java.lang.Object> scala.collection.mutable.Map<A, B1> $plus (scala.Tuple2<A, B1> elem1, scala.Tuple2<A, B1> elem2, scala.collection.Seq<scala.Tuple2<A, B1>> elems)  { throw new RuntimeException(); }
  static public <B1 extends java.lang.Object> scala.collection.mutable.Map<A, B1> $plus$plus (scala.collection.GenTraversableOnce<scala.Tuple2<A, B1>> xs)  { throw new RuntimeException(); }
  static public  scala.Option<B> remove (A key)  { throw new RuntimeException(); }
  static public abstract  scala.collection.mutable.MapLike<A, B, This> $minus$eq (A key)  ;
  static public  This $minus (A key)  { throw new RuntimeException(); }
  static public  void clear ()  { throw new RuntimeException(); }
  static public  B getOrElseUpdate (A key, scala.Function0<B> op)  { throw new RuntimeException(); }
  static public  scala.collection.mutable.MapLike<A, B, This> transform (scala.Function2<A, B, B> f)  { throw new RuntimeException(); }
  static public  scala.collection.mutable.MapLike<A, B, This> retain (scala.Function2<A, B, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  This clone ()  { throw new RuntimeException(); }
  static public  This result ()  { throw new RuntimeException(); }
  static public  This $minus (A elem1, A elem2, scala.collection.Seq<A> elems)  { throw new RuntimeException(); }
  static public  This $minus$minus (scala.collection.GenTraversableOnce<A> xs)  { throw new RuntimeException(); }
  static public  scala.collection.mutable.Map<A, B> seq ()  { throw new RuntimeException(); }
  static public  scala.collection.mutable.Map<A, B> withDefault (scala.Function1<A, B> d)  { throw new RuntimeException(); }
  static public  scala.collection.mutable.Map<A, B> withDefaultValue (B d)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   TimeStampedHashMap (boolean updateTimeStampOnGet)  { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<A, org.apache.spark.util.TimeStampedValue<B>> internalMap ()  { throw new RuntimeException(); }
  public  scala.Option<B> get (A key)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<A, B>> iterator ()  { throw new RuntimeException(); }
  public  java.util.Set<java.util.Map.Entry<A, org.apache.spark.util.TimeStampedValue<B>>> getEntrySet ()  { throw new RuntimeException(); }
  public  void update (A key, B value)  { throw new RuntimeException(); }
  public  B apply (A key)  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<A, B> filter (scala.Function1<scala.Tuple2<A, B>, java.lang.Object> p)  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<A, B> empty ()  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
  public <U extends java.lang.Object> void foreach (scala.Function1<scala.Tuple2<A, B>, U> f)  { throw new RuntimeException(); }
  public  scala.Option<B> putIfAbsent (A key, B value)  { throw new RuntimeException(); }
  public  void putAll (scala.collection.immutable.Map<A, B> map)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<A, B> toMap ()  { throw new RuntimeException(); }
  public  void clearOldValues (long threshTime, scala.Function2<A, B, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /** Removes old key-value pairs that have timestamp earlier than `threshTime`. */
  public  void clearOldValues (long threshTime)  { throw new RuntimeException(); }
  private  long currentTime ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.util.TimeStampedValue<B>> getTimeStampedValue (A key)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> getTimestamp (A key)  { throw new RuntimeException(); }
}
