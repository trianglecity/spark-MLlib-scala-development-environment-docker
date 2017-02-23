package org.apache.spark.sql.types;
/**
 * A {@link StructType} object can be constructed by
 * <pre><code>
 * StructType(fields: Seq[StructField])
 * </code></pre>
 * For a {@link StructType} object, one or multiple {@link StructField}s can be extracted by names.
 * If multiple {@link StructField}s are extracted, a {@link StructType} object will be returned.
 * If a provided name does not have a matching field, it will be ignored. For the case
 * of extracting a single StructField, a <code>null</code> will be returned.
 * Example:
 * <pre><code>
 * import org.apache.spark.sql._
 * import org.apache.spark.sql.types._
 *
 * val struct =
 *   StructType(
 *     StructField("a", IntegerType, true) ::
 *     StructField("b", LongType, false) ::
 *     StructField("c", BooleanType, false) :: Nil)
 *
 * // Extract a single StructField.
 * val singleField = struct("b")
 * // singleField: StructField = StructField(b,LongType,false)
 *
 * // This struct does not have a field called "d". null will be returned.
 * val nonExisting = struct("d")
 * // nonExisting: StructField = null
 *
 * // Extract multiple StructFields. Field names are provided in a set.
 * // A StructType object will be returned.
 * val twoFields = struct(Set("b", "c"))
 * // twoFields: StructType =
 * //   StructType(List(StructField(b,LongType,false), StructField(c,BooleanType,false)))
 *
 * // Any names without matching fields will be ignored.
 * // For the case shown below, "d" will be ignored and
 * // it is treated as struct(Set("b", "c")).
 * val ignoreNonExisting = struct(Set("b", "c", "d"))
 * // ignoreNonExisting: StructType =
 * //   StructType(List(StructField(b,LongType,false), StructField(c,BooleanType,false)))
 * </code></pre>
 * <p>
 * A {@link org.apache.spark.sql.Row} object is used as a value of the StructType.
 * Example:
 * <pre><code>
 * import org.apache.spark.sql._
 *
 * val innerStruct =
 *   StructType(
 *     StructField("f1", IntegerType, true) ::
 *     StructField("f2", LongType, false) ::
 *     StructField("f3", BooleanType, false) :: Nil)
 *
 * val struct = StructType(
 *   StructField("a", innerStruct, true) :: Nil)
 *
 * // Create a Row with the schema defined by struct
 * val row = Row(Row(1, 2, true))
 * // row: Row = {&#64;link 1,2,true}
 * </code></pre>
 * <p>
 * @since 1.3.0
 */
public  class StructType extends org.apache.spark.sql.types.DataType implements scala.collection.Seq<org.apache.spark.sql.types.StructField>, scala.Product, scala.Serializable {
  /**
   * A key used in field metadata to indicate that the field comes from the result of merging
   * two different StructTypes that do not always contain the field. That is to say, the field
   * might be missing (optional) from one of the StructTypes.
   * @return (undocumented)
   */
  static   java.lang.String metadataKeyForOptionalField ()  { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.DataType defaultConcreteType ()  { throw new RuntimeException(); }
  static   boolean acceptsType (org.apache.spark.sql.types.DataType other)  { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.StructType fromString (java.lang.String raw)  { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.StructType fromAttributes (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> attributes)  { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.DataType removeMetadata (java.lang.String key, org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  static   scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.types.StructField> fieldsMap (org.apache.spark.sql.types.StructField[] fields)  { throw new RuntimeException(); }
  static   boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  static public  java.lang.String typeName ()  { throw new RuntimeException(); }
  static public  java.lang.String json ()  { throw new RuntimeException(); }
  static public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  static   boolean sameType (org.apache.spark.sql.types.DataType other)  { throw new RuntimeException(); }
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
  static protected  scala.collection.Seq<A> thisCollection ()  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<A> toCollection (Repr repr)  { throw new RuntimeException(); }
  static protected  scala.collection.parallel.Combiner<A, scala.collection.parallel.ParSeq<A>> parCombiner ()  { throw new RuntimeException(); }
  static public  int lengthCompare (int len)  { throw new RuntimeException(); }
  static public  boolean isEmpty ()  { throw new RuntimeException(); }
  static public  int size ()  { throw new RuntimeException(); }
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
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructField[] fields ()  { throw new RuntimeException(); }
  // not preceding
  public   StructType (org.apache.spark.sql.types.StructField[] fields)  { throw new RuntimeException(); }
  /** No-arg constructor for kryo. */
  public   StructType ()  { throw new RuntimeException(); }
  /** Returns all field names in an array. */
  public  java.lang.String[] fieldNames ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.String> fieldNamesSet ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.types.StructField> nameToField ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.Object> nameToIndex ()  { throw new RuntimeException(); }
  public  boolean equals (Object that)  { throw new RuntimeException(); }
  private  int _hashCode ()  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  /**
   * Creates a new {@link StructType} by adding a new field.
   * <pre><code>
   * val struct = (new StructType)
   *   .add(StructField("a", IntegerType, true))
   *   .add(StructField("b", LongType, false))
   *   .add(StructField("c", StringType, true))
   *</code></pre>
   * @param field (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType add (org.apache.spark.sql.types.StructField field)  { throw new RuntimeException(); }
  /**
   * Creates a new {@link StructType} by adding a new nullable field with no metadata.
   * <p>
   * val struct = (new StructType)
   *   .add("a", IntegerType)
   *   .add("b", LongType)
   *   .add("c", StringType)
   * @param name (undocumented)
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType add (java.lang.String name, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Creates a new {@link StructType} by adding a new field with no metadata.
   * <p>
   * val struct = (new StructType)
   *   .add("a", IntegerType, true)
   *   .add("b", LongType, false)
   *   .add("c", StringType, true)
   * @param name (undocumented)
   * @param dataType (undocumented)
   * @param nullable (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType add (java.lang.String name, org.apache.spark.sql.types.DataType dataType, boolean nullable)  { throw new RuntimeException(); }
  /**
   * Creates a new {@link StructType} by adding a new field and specifying metadata.
   * <pre><code>
   * val struct = (new StructType)
   *   .add("a", IntegerType, true, Metadata.empty)
   *   .add("b", LongType, false, Metadata.empty)
   *   .add("c", StringType, true, Metadata.empty)
   * </code></pre>
   * @param name (undocumented)
   * @param dataType (undocumented)
   * @param nullable (undocumented)
   * @param metadata (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType add (java.lang.String name, org.apache.spark.sql.types.DataType dataType, boolean nullable, org.apache.spark.sql.types.Metadata metadata)  { throw new RuntimeException(); }
  /**
   * Creates a new {@link StructType} by adding a new field and specifying metadata.
   * <pre><code>
   * val struct = (new StructType)
   *   .add("a", IntegerType, true, "comment1")
   *   .add("b", LongType, false, "comment2")
   *   .add("c", StringType, true, "comment3")
   * </code></pre>
   * @param name (undocumented)
   * @param dataType (undocumented)
   * @param nullable (undocumented)
   * @param comment (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType add (java.lang.String name, org.apache.spark.sql.types.DataType dataType, boolean nullable, java.lang.String comment)  { throw new RuntimeException(); }
  /**
   * Creates a new {@link StructType} by adding a new nullable field with no metadata where the
   * dataType is specified as a String.
   * <p>
   * <pre><code>
   * val struct = (new StructType)
   *   .add("a", "int")
   *   .add("b", "long")
   *   .add("c", "string")
   * </code></pre>
   * @param name (undocumented)
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType add (java.lang.String name, java.lang.String dataType)  { throw new RuntimeException(); }
  /**
   * Creates a new {@link StructType} by adding a new field with no metadata where the
   * dataType is specified as a String.
   * <p>
   * <pre><code>
   * val struct = (new StructType)
   *   .add("a", "int", true)
   *   .add("b", "long", false)
   *   .add("c", "string", true)
   * </code></pre>
   * @param name (undocumented)
   * @param dataType (undocumented)
   * @param nullable (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType add (java.lang.String name, java.lang.String dataType, boolean nullable)  { throw new RuntimeException(); }
  /**
   * Creates a new {@link StructType} by adding a new field and specifying metadata where the
   * dataType is specified as a String.
   * <pre><code>
   * val struct = (new StructType)
   *   .add("a", "int", true, Metadata.empty)
   *   .add("b", "long", false, Metadata.empty)
   *   .add("c", "string", true, Metadata.empty)
   * </code></pre>
   * @param name (undocumented)
   * @param dataType (undocumented)
   * @param nullable (undocumented)
   * @param metadata (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType add (java.lang.String name, java.lang.String dataType, boolean nullable, org.apache.spark.sql.types.Metadata metadata)  { throw new RuntimeException(); }
  /**
   * Creates a new {@link StructType} by adding a new field and specifying metadata where the
   * dataType is specified as a String.
   * <pre><code>
   * val struct = (new StructType)
   *   .add("a", "int", true, "comment1")
   *   .add("b", "long", false, "comment2")
   *   .add("c", "string", true, "comment3")
   * </code></pre>
   * @param name (undocumented)
   * @param dataType (undocumented)
   * @param nullable (undocumented)
   * @param comment (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType add (java.lang.String name, java.lang.String dataType, boolean nullable, java.lang.String comment)  { throw new RuntimeException(); }
  /**
   * Extracts the {@link StructField} with the given name.
   * <p>
   * @throws IllegalArgumentException if a field with the given name does not exist
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructField apply (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Returns a {@link StructType} containing {@link StructField}s of the given names, preserving the
   * original order of fields.
   * <p>
   * @throws IllegalArgumentException if a field cannot be found for any of the given names
   * @param names (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType apply (scala.collection.immutable.Set<java.lang.String> names)  { throw new RuntimeException(); }
  /**
   * Returns the index of a given field.
   * <p>
   * @throws IllegalArgumentException if a field with the given name does not exist
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  int fieldIndex (java.lang.String name)  { throw new RuntimeException(); }
    scala.Option<java.lang.Object> getFieldIndex (java.lang.String name)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> toAttributes ()  { throw new RuntimeException(); }
  public  java.lang.String treeString ()  { throw new RuntimeException(); }
  public  void printTreeString ()  { throw new RuntimeException(); }
    void buildFormattedString (java.lang.String prefix, scala.collection.mutable.StringBuilder builder)  { throw new RuntimeException(); }
    org.json4s.JsonAST.JObject jsonValue ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructField apply (int fieldIndex)  { throw new RuntimeException(); }
  public  int length ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.types.StructField> iterator ()  { throw new RuntimeException(); }
  /**
   * The default size of a value of the StructType is the total default sizes of all field types.
   * @return (undocumented)
   */
  public  int defaultSize ()  { throw new RuntimeException(); }
  public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  public  java.lang.String catalogString ()  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
    java.lang.String simpleString (int maxNumberFields)  { throw new RuntimeException(); }
  /**
   * Merges with another schema (<code>StructType</code>).  For a struct field A from <code>this</code> and a struct field
   * B from <code>that</code>,
   * <p>
   * 1. If A and B have the same name and data type, they are merged to a field C with the same name
   *    and data type.  C is nullable if and only if either A or B is nullable.
   * 2. If A doesn't exist in <code>that</code>, it's included in the result schema.
   * 3. If B doesn't exist in <code>this</code>, it's also included in the result schema.
   * 4. Otherwise, <code>this</code> and <code>that</code> are considered as conflicting schemas and an exception would be
   *    thrown.
   * @param that (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.sql.types.StructType merge (org.apache.spark.sql.types.StructType that)  { throw new RuntimeException(); }
    org.apache.spark.sql.types.StructType asNullable ()  { throw new RuntimeException(); }
    boolean existsRecursively (scala.Function1<org.apache.spark.sql.types.DataType, java.lang.Object> f)  { throw new RuntimeException(); }
    org.apache.spark.sql.catalyst.expressions.InterpretedOrdering interpretedOrdering ()  { throw new RuntimeException(); }
}
