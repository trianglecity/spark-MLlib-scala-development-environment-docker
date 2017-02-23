package org.apache.spark.sql.execution;
/**
 * For lazy computing, be sure the generator.terminate() called in the very last
 * TODO reusing the CompletionIterator?
 */
  class LazyIterator implements scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>, scala.Product, scala.Serializable {
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
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.Function0<scala.collection.TraversableOnce<org.apache.spark.sql.catalyst.InternalRow>> func ()  { throw new RuntimeException(); }
  // not preceding
  public   LazyIterator (scala.Function0<scala.collection.TraversableOnce<org.apache.spark.sql.catalyst.InternalRow>> func)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> results ()  { throw new RuntimeException(); }
  public  boolean hasNext ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow next ()  { throw new RuntimeException(); }
}
