package org.apache.spark.util.collection;
/**
 * :: DeveloperApi ::
 * An append-only map that spills sorted content to disk when there is insufficient space for it
 * to grow.
 * <p>
 * This map takes two passes over the data:
 * <p>
 *   (1) Values are merged into combiners, which are sorted and spilled to disk as necessary
 *   (2) Combiners are read from disk and merged together
 * <p>
 * The setting of the spill threshold faces the following trade-off: If the spill threshold is
 * too high, the in-memory map may occupy more memory than is available, resulting in OOM.
 * However, if the spill threshold is too low, we spill frequently and incur unnecessary disk
 * writes. This may lead to a performance regression compared to the normal case of using the
 * non-spilling AppendOnlyMap.
 */
public  class ExternalAppendOnlyMap<K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> extends org.apache.spark.util.collection.Spillable<org.apache.spark.util.collection.SizeTracker> implements java.io.Serializable, org.apache.spark.internal.Logging, scala.collection.Iterable<scala.Tuple2<K, C>> {
  /**
   * An iterator that sort-merges (K, C) pairs from the in-memory map and the spilled maps
   */
  private  class ExternalIterator implements scala.collection.Iterator<scala.Tuple2<K, C>> {
    public   ExternalIterator ()  { throw new RuntimeException(); }
    private  scala.collection.mutable.PriorityQueue<org.apache.spark.util.collection.ExternalAppendOnlyMap<K, V, C>.ExternalIterator.StreamBuffer> mergeHeap ()  { throw new RuntimeException(); }
    private  org.apache.spark.util.CompletionIterator<scala.Tuple2<K, C>, scala.collection.Iterator<scala.Tuple2<K, C>>> sortedMap ()  { throw new RuntimeException(); }
    private  scala.collection.Seq<scala.collection.BufferedIterator<scala.Tuple2<K, C>>> inputStreams ()  { throw new RuntimeException(); }
    /**
     * Fill a buffer with the next set of keys with the same hash code from a given iterator. We
     * read streams one hash code at a time to ensure we don't miss elements when they are merged.
     * <p>
     * Assumes the given iterator is in sorted order of hash code.
     * <p>
     * @param it iterator to read from
     * @param buf buffer to write the results into
     */
    private  void readNextHashCode (scala.collection.BufferedIterator<scala.Tuple2<K, C>> it, scala.collection.mutable.ArrayBuffer<scala.Tuple2<K, C>> buf)  { throw new RuntimeException(); }
    /**
     * If the given buffer contains a value for the given key, merge that value into
     * baseCombiner and remove the corresponding (K, C) pair from the buffer.
     * @param key (undocumented)
     * @param baseCombiner (undocumented)
     * @param buffer (undocumented)
     * @return (undocumented)
     */
    private  C mergeIfKeyExists (K key, C baseCombiner, org.apache.spark.util.collection.ExternalAppendOnlyMap<K, V, C>.ExternalIterator.StreamBuffer buffer)  { throw new RuntimeException(); }
    /**
     * Remove the index'th element from an ArrayBuffer in constant time, swapping another element
     * into its place. This is more efficient than the ArrayBuffer.remove method because it does
     * not have to shift all the elements in the array over. It works for our array buffers because
     * we don't care about the order of elements inside, we just want to search them for a key.
     * @param buffer (undocumented)
     * @param index (undocumented)
     * @return (undocumented)
     */
    private <T extends java.lang.Object> T removeFromBuffer (scala.collection.mutable.ArrayBuffer<T> buffer, int index)  { throw new RuntimeException(); }
    /**
     * Return true if there exists an input stream that still has unvisited pairs.
     * @return (undocumented)
     */
    public  boolean hasNext ()  { throw new RuntimeException(); }
    /**
     * Select a key with the minimum hash, then combine all values with the same key from all
     * input streams.
     * @return (undocumented)
     */
    public  scala.Tuple2<K, C> next ()  { throw new RuntimeException(); }
    /**
     * A buffer for streaming from a map iterator (in-memory or on-disk) sorted by key hash.
     * Each buffer maintains all of the key-value pairs with what is currently the lowest hash
     * code among keys in the stream. There may be multiple keys if there are hash collisions.
     * Note that because when we spill data out, we only spill one value for each key, there is
     * at most one element for each key.
     * <p>
     * StreamBuffers are ordered by the minimum key hash currently available in their stream so
     * that we can put them into a heap and sort that.
     */
    private  class StreamBuffer implements java.lang.Comparable<org.apache.spark.util.collection.ExternalAppendOnlyMap<K, V, C>.ExternalIterator.StreamBuffer> {
      public  scala.collection.BufferedIterator<scala.Tuple2<K, C>> iterator ()  { throw new RuntimeException(); }
      public  scala.collection.mutable.ArrayBuffer<scala.Tuple2<K, C>> pairs ()  { throw new RuntimeException(); }
      // not preceding
      public   StreamBuffer (scala.collection.BufferedIterator<scala.Tuple2<K, C>> iterator, scala.collection.mutable.ArrayBuffer<scala.Tuple2<K, C>> pairs)  { throw new RuntimeException(); }
      public  boolean isEmpty ()  { throw new RuntimeException(); }
      public  int minKeyHash ()  { throw new RuntimeException(); }
      public  int compareTo (org.apache.spark.util.collection.ExternalAppendOnlyMap<K, V, C>.ExternalIterator.StreamBuffer other)  { throw new RuntimeException(); }
    }
  }
  private  class DiskMapIterator implements scala.collection.Iterator<scala.Tuple2<K, C>> {
    public   DiskMapIterator (java.io.File file, org.apache.spark.storage.BlockId blockId, scala.collection.mutable.ArrayBuffer<java.lang.Object> batchSizes)  { throw new RuntimeException(); }
    private  scala.collection.mutable.ArrayBuffer<java.lang.Object> batchOffsets ()  { throw new RuntimeException(); }
    /**
     * Return the next (K, C) pair from the deserialization stream.
     * <p>
     * If the current batch is drained, construct a stream for the next batch and read from it.
     * If no more pairs are left, return null.
     * @return (undocumented)
     */
    private  int batchIndex ()  { throw new RuntimeException(); }
    private  java.io.FileInputStream fileStream ()  { throw new RuntimeException(); }
    private  org.apache.spark.serializer.DeserializationStream deserializeStream ()  { throw new RuntimeException(); }
    private  scala.Tuple2<K, C> nextItem ()  { throw new RuntimeException(); }
    private  int objectsRead ()  { throw new RuntimeException(); }
    private  org.apache.spark.serializer.DeserializationStream nextBatchStream ()  { throw new RuntimeException(); }
    private  scala.Tuple2<K, C> readNextItem ()  { throw new RuntimeException(); }
    public  boolean hasNext ()  { throw new RuntimeException(); }
    public  scala.Tuple2<K, C> next ()  { throw new RuntimeException(); }
    private  void cleanup ()  { throw new RuntimeException(); }
  }
  private  class SpillableIterator implements scala.collection.Iterator<scala.Tuple2<K, C>> {
    public  scala.collection.Iterator<scala.Tuple2<K, C>> upstream ()  { throw new RuntimeException(); }
    public   SpillableIterator (scala.collection.Iterator<scala.Tuple2<K, C>> upstream)  { throw new RuntimeException(); }
    private  java.lang.Object SPILL_LOCK ()  { throw new RuntimeException(); }
    private  scala.collection.Iterator<scala.Tuple2<K, C>> nextUpstream ()  { throw new RuntimeException(); }
    private  scala.Tuple2<K, C> cur ()  { throw new RuntimeException(); }
    private  boolean hasSpilled ()  { throw new RuntimeException(); }
    public  boolean spill ()  { throw new RuntimeException(); }
    public  scala.Tuple2<K, C> readNext ()  { throw new RuntimeException(); }
    public  boolean hasNext ()  { throw new RuntimeException(); }
    public  scala.Tuple2<K, C> next ()  { throw new RuntimeException(); }
  }
  /**
   * A comparator which sorts arbitrary keys based on their hash codes.
   */
  static private  class HashComparator<K extends java.lang.Object> implements java.util.Comparator<K> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   HashComparator ()  { throw new RuntimeException(); }
    public  int compare (K key1, K key2)  { throw new RuntimeException(); }
  }
  /**
   * Return the hash code of the given object. If the object is null, return a special hash code.
   * @param obj (undocumented)
   * @return (undocumented)
   */
  static private <T extends java.lang.Object> int hash (T obj)  { throw new RuntimeException(); }
  static public  org.apache.spark.memory.MemoryMode getMode ()  { throw new RuntimeException(); }
  static protected  long getUsed ()  { throw new RuntimeException(); }
  static public  org.apache.spark.unsafe.array.LongArray allocateArray (long size)  { throw new RuntimeException(); }
  static public  void freeArray (org.apache.spark.unsafe.array.LongArray array)  { throw new RuntimeException(); }
  static protected  org.apache.spark.unsafe.memory.MemoryBlock allocatePage (long required)  { throw new RuntimeException(); }
  static protected  void freePage (org.apache.spark.unsafe.memory.MemoryBlock page)  { throw new RuntimeException(); }
  static public  long acquireMemory (long size)  { throw new RuntimeException(); }
  static public  void freeMemory (long size)  { throw new RuntimeException(); }
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
  static protected  long elementsRead ()  { throw new RuntimeException(); }
  static protected  void addElementsRead ()  { throw new RuntimeException(); }
  static protected  boolean maybeSpill (C collection, long currentMemory)  { throw new RuntimeException(); }
  static public  long memoryBytesSpilled ()  { throw new RuntimeException(); }
  static public  void releaseMemory ()  { throw new RuntimeException(); }
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
  static public abstract  int size ()  ;
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
  public   ExternalAppendOnlyMap (scala.Function1<V, C> createCombiner, scala.Function2<C, V, C> mergeValue, scala.Function2<C, C, C> mergeCombiners, org.apache.spark.serializer.Serializer serializer, org.apache.spark.storage.BlockManager blockManager, org.apache.spark.TaskContext context, org.apache.spark.serializer.SerializerManager serializerManager)  { throw new RuntimeException(); }
  public   ExternalAppendOnlyMap (scala.Function1<V, C> createCombiner, scala.Function2<C, V, C> mergeValue, scala.Function2<C, C, C> mergeCombiners, org.apache.spark.serializer.Serializer serializer, org.apache.spark.storage.BlockManager blockManager)  { throw new RuntimeException(); }
  private  org.apache.spark.util.collection.SizeTrackingAppendOnlyMap<K, C> currentMap ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.util.collection.ExternalAppendOnlyMap<K, V, C>.DiskMapIterator> spilledMaps ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  private  org.apache.spark.storage.DiskBlockManager diskBlockManager ()  { throw new RuntimeException(); }
  /**
   * Size of object batches when reading/writing from serializers.
   * <p>
   * Objects are written in batches, with each batch using its own serialization stream. This
   * cuts down on the size of reference-tracking maps constructed when deserializing a stream.
   * <p>
   * NOTE: Setting this too low can cause excessive copying when serializing, since some serializers
   * grow internal data structures by growing + copying every time the number of objects doubles.
   * @return (undocumented)
   */
  private  long serializerBatchSize ()  { throw new RuntimeException(); }
  private  long _diskBytesSpilled ()  { throw new RuntimeException(); }
  public  long diskBytesSpilled ()  { throw new RuntimeException(); }
  private  int fileBufferSize ()  { throw new RuntimeException(); }
  private  org.apache.spark.executor.ShuffleWriteMetrics writeMetrics ()  { throw new RuntimeException(); }
  private  long _peakMemoryUsedBytes ()  { throw new RuntimeException(); }
  public  long peakMemoryUsedBytes ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.collection.ExternalAppendOnlyMap.HashComparator<K> keyComparator ()  { throw new RuntimeException(); }
  private  org.apache.spark.serializer.SerializerInstance ser ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.collection.ExternalAppendOnlyMap<K, V, C>.SpillableIterator readingIterator ()  { throw new RuntimeException(); }
  /**
   * Number of files this map has spilled so far.
   * Exposed for testing.
   * @return (undocumented)
   */
    int numSpills ()  { throw new RuntimeException(); }
  /**
   * Insert the given key and value into the map.
   * @param key (undocumented)
   * @param value (undocumented)
   */
  public  void insert (K key, V value)  { throw new RuntimeException(); }
  /**
   * Insert the given iterator of keys and values into the map.
   * <p>
   * When the underlying map needs to grow, check if the global pool of shuffle memory has
   * enough room for this to happen. If so, allocate the memory required to grow the map;
   * otherwise, spill the in-memory map to disk.
   * <p>
   * The shuffle memory usage of the first trackMemoryThreshold entries is not tracked.
   * @param entries (undocumented)
   */
  public  void insertAll (scala.collection.Iterator<scala.Product2<K, V>> entries)  { throw new RuntimeException(); }
  /**
   * Insert the given iterable of keys and values into the map.
   * <p>
   * When the underlying map needs to grow, check if the global pool of shuffle memory has
   * enough room for this to happen. If so, allocate the memory required to grow the map;
   * otherwise, spill the in-memory map to disk.
   * <p>
   * The shuffle memory usage of the first trackMemoryThreshold entries is not tracked.
   * @param entries (undocumented)
   */
  public  void insertAll (scala.collection.Iterable<scala.Product2<K, V>> entries)  { throw new RuntimeException(); }
  /**
   * Sort the existing contents of the in-memory map and spill them to a temporary file on disk.
   * @param collection (undocumented)
   */
  protected  void spill (org.apache.spark.util.collection.SizeTracker collection)  { throw new RuntimeException(); }
  /**
   * Force to spilling the current in-memory collection to disk to release memory,
   * It will be called by TaskMemoryManager when there is not enough memory for the task.
   * @return (undocumented)
   */
  protected  boolean forceSpill ()  { throw new RuntimeException(); }
  /**
   * Spill the in-memory Iterator to a temporary file on disk.
   * @param inMemoryIterator (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.util.collection.ExternalAppendOnlyMap<K, V, C>.DiskMapIterator spillMemoryIteratorToDisk (scala.collection.Iterator<scala.Tuple2<K, C>> inMemoryIterator)  { throw new RuntimeException(); }
  /**
   * Returns a destructive iterator for iterating over the entries of this map.
   * If this iterator is forced spill to disk to release memory when there is not enough memory,
   * it returns pairs from an on-disk map.
   * @param inMemoryIterator (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Tuple2<K, C>> destructiveIterator (scala.collection.Iterator<scala.Tuple2<K, C>> inMemoryIterator)  { throw new RuntimeException(); }
  /**
   * Return a destructive iterator that merges the in-memory map with the spilled maps.
   * If no spill has occurred, simply return the in-memory map's iterator.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Tuple2<K, C>> iterator ()  { throw new RuntimeException(); }
  private  void freeCurrentMap ()  { throw new RuntimeException(); }
  /** Convenience function to hash the given (K, C) pair by the key. */
  private  int hashKey (scala.Tuple2<K, C> kc)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
