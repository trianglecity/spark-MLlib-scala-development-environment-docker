package org.apache.spark.sql.execution.streaming;
/**
 * A helper class that looks like a Map[Source, Offset].
 */
public  class StreamProgress implements scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.Source, org.apache.spark.sql.execution.streaming.Offset> {
  static protected  scala.collection.immutable.List<A> reversed ()  { throw new RuntimeException(); }
  static public  int size ()  { throw new RuntimeException(); }
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
  static public abstract  int size ()  ;
  static public  Repr repr ()  { throw new RuntimeException(); }
  static public final  boolean isTraversableAgain ()  { throw new RuntimeException(); }
  static public  boolean hasDefiniteSize ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That $plus$plus (scala.collection.GenTraversableOnce<B> that, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That $plus$plus$colon (scala.collection.TraversableOnce<B> that, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That $plus$plus$colon (scala.collection.Traversable<B> that, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That map (scala.Function1<A, B> f, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, That extends java.lang.Object> That flatMap (scala.Function1<A, scala.collection.GenTraversableOnce<B>> f, scala.collection.generic.CanBuildFrom<Repr, B, That> bf)  { throw new RuntimeException(); }
  static public  Repr filter (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
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
  static public abstract <U extends java.lang.Object> void foreach (scala.Function1<A, U> f)  ;
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
  static public  java.lang.Object view ()  { throw new RuntimeException(); }
  static public  scala.collection.IterableView<A, Repr> view (int from, int until)  { throw new RuntimeException(); }
  static public  scala.collection.generic.GenericCompanion<scala.collection.immutable.Iterable> companion ()  { throw new RuntimeException(); }
  static protected  scala.collection.parallel.Combiner<A, scala.collection.parallel.immutable.ParIterable<A>> parCombiner ()  { throw new RuntimeException(); }
  static public  int hashCode ()  { throw new RuntimeException(); }
  static public  boolean equals (Object that)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.Function1<A, R> compose (scala.Function1<A, T1> g)  { throw new RuntimeException(); }
  static public <A1 extends A, B1 extends java.lang.Object> scala.PartialFunction<A1, B1> orElse (scala.PartialFunction<A1, B1> that)  { throw new RuntimeException(); }
  static public <C extends java.lang.Object> scala.PartialFunction<A, C> andThen (scala.Function1<B, C> k)  { throw new RuntimeException(); }
  static public  scala.Function1<A, scala.Option<B>> lift ()  { throw new RuntimeException(); }
  static public <A1 extends A, B1 extends java.lang.Object> B1 applyOrElse (A1 x, scala.Function1<A1, B1> default_)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> scala.Function1<A, java.lang.Object> runWith (scala.Function1<B, U> action)  { throw new RuntimeException(); }
  static protected abstract  Repr repr ()  ;
  static public  Repr $minus (A elem1, A elem2, scala.collection.Seq<A> elems)  { throw new RuntimeException(); }
  static public  Repr $minus$minus (scala.collection.GenTraversableOnce<A> xs)  { throw new RuntimeException(); }
  static protected  scala.collection.mutable.Builder<scala.Tuple2<A, B>, This> newBuilder ()  { throw new RuntimeException(); }
  static public abstract  This $minus (A key)  ;
  static public  boolean isEmpty ()  { throw new RuntimeException(); }
  static public <B1 extends java.lang.Object> B1 getOrElse (A key, scala.Function0<B1> default_)  { throw new RuntimeException(); }
  static public  B apply (A key)  { throw new RuntimeException(); }
  static public  boolean contains (A key)  { throw new RuntimeException(); }
  static public  boolean isDefinedAt (A key)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<A> keysIterator ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterable<A> keys ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterable<B> values ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<B> valuesIterator ()  { throw new RuntimeException(); }
  static public  This filterNot (scala.Function1<scala.Tuple2<A, B>, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.Tuple2<A, B>> toSeq ()  { throw new RuntimeException(); }
  static public <C extends java.lang.Object> scala.collection.mutable.Buffer<C> toBuffer ()  { throw new RuntimeException(); }
  static public  scala.collection.mutable.StringBuilder addString (scala.collection.mutable.StringBuilder b, java.lang.String start, java.lang.String sep, java.lang.String end)  { throw new RuntimeException(); }
  static public  java.lang.String stringPrefix ()  { throw new RuntimeException(); }
  static protected  scala.collection.parallel.Combiner<scala.Tuple2<A, B>, scala.collection.parallel.immutable.ParMap<A, B>> parCombiner ()  { throw new RuntimeException(); }
  static public <B1 extends java.lang.Object> scala.collection.immutable.Map<A, B1> updated (A key, B1 value)  { throw new RuntimeException(); }
  static public <B1 extends java.lang.Object> scala.collection.immutable.Map<A, B1> $plus (scala.Tuple2<A, B1> elem1, scala.Tuple2<A, B1> elem2, scala.collection.Seq<scala.Tuple2<A, B1>> elems)  { throw new RuntimeException(); }
  static public <B1 extends java.lang.Object> scala.collection.immutable.Map<A, B1> $plus$plus (scala.collection.GenTraversableOnce<scala.Tuple2<A, B1>> xs)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<A, B> filterKeys (scala.Function1<A, java.lang.Object> p)  { throw new RuntimeException(); }
  static public <C extends java.lang.Object> scala.collection.immutable.Map<A, C> mapValues (scala.Function1<B, C> f)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<A> keySet ()  { throw new RuntimeException(); }
  static public <C extends java.lang.Object, That extends java.lang.Object> That transform (scala.Function2<A, B, C> f, scala.collection.generic.CanBuildFrom<This, scala.Tuple2<A, C>, That> bf)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<A, B> empty ()  { throw new RuntimeException(); }
  static public <T extends java.lang.Object, U extends java.lang.Object> scala.collection.immutable.Map<T, U> toMap (scala.Predef.$less$colon$less<scala.Tuple2<A, B>, scala.Tuple2<T, U>> ev)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<A, B> seq ()  { throw new RuntimeException(); }
  static public <B1 extends java.lang.Object> scala.collection.immutable.Map<A, B1> withDefault (scala.Function1<A, B1> d)  { throw new RuntimeException(); }
  static public <B1 extends java.lang.Object> scala.collection.immutable.Map<A, B1> withDefaultValue (B1 d)  { throw new RuntimeException(); }
  static public abstract <B1 extends java.lang.Object> scala.collection.immutable.Map<A, B1> updated (A key, B1 value)  ;
  static public abstract <B1 extends java.lang.Object> scala.collection.immutable.Map<A, B1> $plus (scala.Tuple2<A, B1> kv)  ;
  public  scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.Source, org.apache.spark.sql.execution.streaming.Offset> baseMap ()  { throw new RuntimeException(); }
  // not preceding
  public   StreamProgress (scala.collection.immutable.Map<org.apache.spark.sql.execution.streaming.Source, org.apache.spark.sql.execution.streaming.Offset> baseMap)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.OffsetSeq toOffsetSeq (scala.collection.Seq<org.apache.spark.sql.execution.streaming.Source> source, org.apache.spark.sql.execution.streaming.OffsetSeqMetadata metadata)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.streaming.Offset> get (org.apache.spark.sql.execution.streaming.Source key)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.sql.execution.streaming.Source, org.apache.spark.sql.execution.streaming.Offset>> iterator ()  { throw new RuntimeException(); }
}
