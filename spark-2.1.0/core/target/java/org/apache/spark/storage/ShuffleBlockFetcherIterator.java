package org.apache.spark.storage;
/**
 * An iterator that fetches multiple blocks. For local blocks, it fetches from the local block
 * manager. For remote blocks, it fetches them using the provided BlockTransferService.
 * <p>
 * This creates an iterator of (BlockID, InputStream) tuples so the caller can handle blocks
 * in a pipelined fashion as they are received.
 * <p>
 * The implementation throttles the remote fetches so they don't exceed maxBytesInFlight to avoid
 * using too much memory.
 * <p>
 * param:  context {@link TaskContext}, used for metrics update
 * param:  shuffleClient {@link ShuffleClient} for fetching remote blocks
 * param:  blockManager {@link BlockManager} for reading local blocks
 * param:  blocksByAddress list of blocks to fetch grouped by the {@link BlockManagerId}.
 *                        For each block we also require the size (in bytes as a long field) in
 *                        order to throttle the memory usage.
 * param:  maxBytesInFlight max size (in bytes) of remote blocks to fetch at any given point.
 * param:  maxReqsInFlight max number of remote requests to fetch blocks at any given point.
 */
 final class ShuffleBlockFetcherIterator implements scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockId, java.io.InputStream>>, org.apache.spark.internal.Logging {
  /**
   * A request to fetch blocks from a remote BlockManager.
   * param:  address remote BlockManager to fetch from.
   * param:  blocks Sequence of tuple, where the first element is the block id,
   *               and the second element is the estimated size, used to calculate bytesInFlight.
   */
  static public  class FetchRequest implements scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockManagerId address ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>> blocks ()  { throw new RuntimeException(); }
    // not preceding
    public   FetchRequest (org.apache.spark.storage.BlockManagerId address, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>> blocks)  { throw new RuntimeException(); }
    public  long size ()  { throw new RuntimeException(); }
  }
  static public  class FetchRequest$ extends scala.runtime.AbstractFunction2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>>, org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchRequest> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FetchRequest$ MODULE$ = null;
    public   FetchRequest$ ()  { throw new RuntimeException(); }
  }
  /**
   * Result of a fetch from a remote block successfully.
   * param:  blockId block id
   * param:  address BlockManager that the block was fetched from.
   * param:  size estimated size of the block, used to calculate bytesInFlight.
   *             Note that this is NOT the exact bytes.
   * param:  buf <code>ManagedBuffer</code> for the content.
   * param:  isNetworkReqDone Is this the last network request for this host in this fetch request.
   */
  static   class SuccessFetchResult implements org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchResult, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    public  org.apache.spark.storage.BlockManagerId address ()  { throw new RuntimeException(); }
    public  long size ()  { throw new RuntimeException(); }
    public  org.apache.spark.network.buffer.ManagedBuffer buf ()  { throw new RuntimeException(); }
    public  boolean isNetworkReqDone ()  { throw new RuntimeException(); }
    // not preceding
    public   SuccessFetchResult (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockManagerId address, long size, org.apache.spark.network.buffer.ManagedBuffer buf, boolean isNetworkReqDone)  { throw new RuntimeException(); }
  }
  static public  class SuccessFetchResult$ extends scala.runtime.AbstractFunction5<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockManagerId, java.lang.Object, org.apache.spark.network.buffer.ManagedBuffer, java.lang.Object, org.apache.spark.storage.ShuffleBlockFetcherIterator.SuccessFetchResult> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SuccessFetchResult$ MODULE$ = null;
    public   SuccessFetchResult$ ()  { throw new RuntimeException(); }
  }
  /**
   * Result of a fetch from a remote block unsuccessfully.
   * param:  blockId block id
   * param:  address BlockManager that the block was attempted to be fetched from
   * param:  e the failure exception
   */
  static   class FailureFetchResult implements org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchResult, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    public  org.apache.spark.storage.BlockManagerId address ()  { throw new RuntimeException(); }
    public  java.lang.Throwable e ()  { throw new RuntimeException(); }
    // not preceding
    public   FailureFetchResult (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockManagerId address, java.lang.Throwable e)  { throw new RuntimeException(); }
  }
  static public  class FailureFetchResult$ extends scala.runtime.AbstractFunction3<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockManagerId, java.lang.Throwable, org.apache.spark.storage.ShuffleBlockFetcherIterator.FailureFetchResult> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FailureFetchResult$ MODULE$ = null;
    public   FailureFetchResult$ ()  { throw new RuntimeException(); }
  }
  /**
   * Result of a fetch from a remote block.
   */
  static   interface FetchResult {
    public  org.apache.spark.storage.BlockId blockId ()  ;
    public  org.apache.spark.storage.BlockManagerId address ()  ;
  }
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
  public   ShuffleBlockFetcherIterator (org.apache.spark.TaskContext context, org.apache.spark.network.shuffle.ShuffleClient shuffleClient, org.apache.spark.storage.BlockManager blockManager, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>>>> blocksByAddress, long maxBytesInFlight, int maxReqsInFlight)  { throw new RuntimeException(); }
    void releaseCurrentResultBuffer ()  { throw new RuntimeException(); }
  /**
   * Mark the iterator as zombie, and release all buffers that haven't been deserialized yet.
   */
  private  void cleanup ()  { throw new RuntimeException(); }
  private  void sendRequest (org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchRequest req)  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchRequest> splitLocalRemoteBlocks ()  { throw new RuntimeException(); }
  /**
   * Fetch the local blocks while we are fetching remote blocks. This is ok because
   * <code>ManagedBuffer</code>'s memory is allocated lazily when we create the input stream, so all we
   * track in-memory are the ManagedBuffer references themselves.
   */
  private  void fetchLocalBlocks ()  { throw new RuntimeException(); }
  private  void initialize ()  { throw new RuntimeException(); }
  public  boolean hasNext ()  { throw new RuntimeException(); }
  /**
   * Fetches the next (BlockId, InputStream). If a task fails, the ManagedBuffers
   * underlying each InputStream will be freed by the cleanup() method registered with the
   * TaskCompletionListener. However, callers should close() these InputStreams
   * as soon as they are no longer needed, in order to release memory as early as possible.
   * <p>
   * Throws a FetchFailedException if the next block could not be fetched.
   * @return (undocumented)
   */
  public  scala.Tuple2<org.apache.spark.storage.BlockId, java.io.InputStream> next ()  { throw new RuntimeException(); }
  private  void fetchUpToMaxBytes ()  { throw new RuntimeException(); }
  private  scala.runtime.Nothing$ throwFetchFailedException (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockManagerId address, java.lang.Throwable e)  { throw new RuntimeException(); }
}
