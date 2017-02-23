package org.apache.spark.util.collection;
/**
 * Sorts and potentially merges a number of key-value pairs of type (K, V) to produce key-combiner
 * pairs of type (K, C). Uses a Partitioner to first group the keys into partitions, and then
 * optionally sorts keys within each partition using a custom Comparator. Can output a single
 * partitioned file with a different byte range for each partition, suitable for shuffle fetches.
 * <p>
 * If combining is disabled, the type C must equal V -- we'll cast the objects at the end.
 * <p>
 * Note: Although ExternalSorter is a fairly generic sorter, some of its configuration is tied
 * to its use in sort-based shuffle (for example, its block compression is controlled by
 * <code>spark.shuffle.compress</code>).  We may need to revisit this if ExternalSorter is used in other
 * non-shuffle contexts where we might want to use different configuration settings.
 * <p>
 * param:  aggregator optional Aggregator with combine functions to use for merging data
 * param:  partitioner optional Partitioner; if given, sort by partition ID and then key
 * param:  ordering optional Ordering to sort keys within each partition; should be a total ordering
 * param:  serializer serializer to use when spilling to disk
 * <p>
 * Note that if an Ordering is given, we'll always sort using it, so only provide it if you really
 * want the output keys to be sorted. In a map task without map-side combine for example, you
 * probably want to pass None as the ordering to avoid extra sorting. On the other hand, if you do
 * want to do combining, having an Ordering is more efficient than not having it.
 * <p>
 * Users interact with this class in the following way:
 * <p>
 * 1. Instantiate an ExternalSorter.
 * <p>
 * 2. Call insertAll() with a set of records.
 * <p>
 * 3. Request an iterator() back to traverse sorted/aggregated records.
 *     - or -
 *    Invoke writePartitionedFile() to create a file containing sorted/aggregated outputs
 *    that can be used in Spark's sort shuffle.
 * <p>
 * At a high level, this class works internally as follows:
 * <p>
 *  - We repeatedly fill up buffers of in-memory data, using either a PartitionedAppendOnlyMap if
 *    we want to combine by key, or a PartitionedPairBuffer if we don't.
 *    Inside these buffers, we sort elements by partition ID and then possibly also by key.
 *    To avoid calling the partitioner multiple times with each key, we store the partition ID
 *    alongside each record.
 * <p>
 *  - When each buffer reaches our memory limit, we spill it to a file. This file is sorted first
 *    by partition ID and possibly second by key or by hash code of the key, if we want to do
 *    aggregation. For each file, we track how many objects were in each partition in memory, so we
 *    don't have to write out the partition ID for every element.
 * <p>
 *  - When the user requests an iterator or file output, the spilled files are merged, along with
 *    any remaining in-memory data, using the same sort order defined above (unless both sorting
 *    and aggregation are disabled). If we need to aggregate by key, we either use a total ordering
 *    from the ordering parameter, or read the keys with the same hash code and compare them with
 *    each other for equality to merge values.
 * <p>
 *  - Users are expected to call stop() at the end to delete all the intermediate files.
 */
  class ExternalSorter<K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> extends org.apache.spark.util.collection.Spillable<org.apache.spark.util.collection.WritablePartitionedPairCollection<K, C>> implements org.apache.spark.internal.Logging {
  private  class SpilledFile implements scala.Product, scala.Serializable {
    public  java.io.File file ()  { throw new RuntimeException(); }
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    public  long[] serializerBatchSizes ()  { throw new RuntimeException(); }
    public  long[] elementsPerPartition ()  { throw new RuntimeException(); }
    // not preceding
    public   SpilledFile (java.io.File file, org.apache.spark.storage.BlockId blockId, long[] serializerBatchSizes, long[] elementsPerPartition)  { throw new RuntimeException(); }
  }
  private  class SpilledFile$ extends scala.runtime.AbstractFunction4<java.io.File, org.apache.spark.storage.BlockId, long[], long[], org.apache.spark.util.collection.ExternalSorter<K, V, C>.SpilledFile> implements scala.Serializable {
    public   SpilledFile$ ()  { throw new RuntimeException(); }
  }
  private  class SpillReader {
    public   SpillReader (org.apache.spark.util.collection.ExternalSorter<K, V, C>.SpilledFile spill)  { throw new RuntimeException(); }
    public  long[] batchOffsets ()  { throw new RuntimeException(); }
    public  int partitionId ()  { throw new RuntimeException(); }
    public  long indexInPartition ()  { throw new RuntimeException(); }
    public  int batchId ()  { throw new RuntimeException(); }
    public  int indexInBatch ()  { throw new RuntimeException(); }
    public  int lastPartitionId ()  { throw new RuntimeException(); }
    /**
     * An iterator that reads only the elements for a given partition ID from an underlying buffered
     * stream, assuming this partition is the next one to be read. Used to make it easier to return
     * partitioned iterators from our in-memory collection.
     * @return (undocumented)
     */
    public  java.io.FileInputStream fileStream ()  { throw new RuntimeException(); }
    public  org.apache.spark.serializer.DeserializationStream deserializeStream ()  { throw new RuntimeException(); }
    public  scala.Tuple2<K, C> nextItem ()  { throw new RuntimeException(); }
    public  boolean finished ()  { throw new RuntimeException(); }
    public  org.apache.spark.serializer.DeserializationStream nextBatchStream ()  { throw new RuntimeException(); }
    private  void skipToNextPartition ()  { throw new RuntimeException(); }
    private  scala.Tuple2<K, C> readNextItem ()  { throw new RuntimeException(); }
    public  int nextPartitionToRead ()  { throw new RuntimeException(); }
    public  scala.collection.Iterator<scala.Product2<K, C>> readNextPartition ()  { throw new RuntimeException(); }
    public  void cleanup ()  { throw new RuntimeException(); }
  }
  private  class IteratorForPartition implements scala.collection.Iterator<scala.Product2<K, C>> {
    public   IteratorForPartition (int partitionId, scala.collection.BufferedIterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, C>> data)  { throw new RuntimeException(); }
    public  boolean hasNext ()  { throw new RuntimeException(); }
    public  scala.Product2<K, C> next ()  { throw new RuntimeException(); }
  }
  private  class SpillableIterator implements scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, C>> {
    public  scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, C>> upstream ()  { throw new RuntimeException(); }
    public   SpillableIterator (scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, C>> upstream)  { throw new RuntimeException(); }
    private  java.lang.Object SPILL_LOCK ()  { throw new RuntimeException(); }
    private  scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, C>> nextUpstream ()  { throw new RuntimeException(); }
    private  scala.Tuple2<scala.Tuple2<java.lang.Object, K>, C> cur ()  { throw new RuntimeException(); }
    private  boolean hasSpilled ()  { throw new RuntimeException(); }
    public  boolean spill ()  { throw new RuntimeException(); }
    public  scala.Tuple2<scala.Tuple2<java.lang.Object, K>, C> readNext ()  { throw new RuntimeException(); }
    public  boolean hasNext ()  { throw new RuntimeException(); }
    public  scala.Tuple2<scala.Tuple2<java.lang.Object, K>, C> next ()  { throw new RuntimeException(); }
  }
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
  // not preceding
  public   ExternalSorter (org.apache.spark.TaskContext context, scala.Option<org.apache.spark.Aggregator<K, V, C>> aggregator, scala.Option<org.apache.spark.Partitioner> partitioner, scala.Option<scala.math.Ordering<K>> ordering, org.apache.spark.serializer.Serializer serializer)  { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  private  int numPartitions ()  { throw new RuntimeException(); }
  private  boolean shouldPartition ()  { throw new RuntimeException(); }
  private  int getPartition (K key)  { throw new RuntimeException(); }
  private  org.apache.spark.storage.BlockManager blockManager ()  { throw new RuntimeException(); }
  private  org.apache.spark.storage.DiskBlockManager diskBlockManager ()  { throw new RuntimeException(); }
  private  org.apache.spark.serializer.SerializerManager serializerManager ()  { throw new RuntimeException(); }
  private  org.apache.spark.serializer.SerializerInstance serInstance ()  { throw new RuntimeException(); }
  private  int fileBufferSize ()  { throw new RuntimeException(); }
  private  long serializerBatchSize ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.collection.PartitionedAppendOnlyMap<K, C> map ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.collection.PartitionedPairBuffer<K, C> buffer ()  { throw new RuntimeException(); }
  private  long _diskBytesSpilled ()  { throw new RuntimeException(); }
  public  long diskBytesSpilled ()  { throw new RuntimeException(); }
  private  long _peakMemoryUsedBytes ()  { throw new RuntimeException(); }
  public  long peakMemoryUsedBytes ()  { throw new RuntimeException(); }
  private  boolean isShuffleSort ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.util.collection.ExternalSorter<K, V, C>.SpilledFile> forceSpillFiles ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.collection.ExternalSorter<K, V, C>.SpillableIterator readingIterator ()  { throw new RuntimeException(); }
  private  java.util.Comparator<K> keyComparator ()  { throw new RuntimeException(); }
  private  scala.Option<java.util.Comparator<K>> comparator ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.util.collection.ExternalSorter<K, V, C>.SpilledFile> spills ()  { throw new RuntimeException(); }
    int numSpills ()  { throw new RuntimeException(); }
  public  void insertAll (scala.collection.Iterator<scala.Product2<K, V>> records)  { throw new RuntimeException(); }
  private  void maybeSpillCollection (boolean usingMap)  { throw new RuntimeException(); }
  protected  void spill (org.apache.spark.util.collection.WritablePartitionedPairCollection<K, C> collection)  { throw new RuntimeException(); }
  protected  boolean forceSpill ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.collection.ExternalSorter<K, V, C>.SpilledFile spillMemoryIteratorToDisk (org.apache.spark.util.collection.WritablePartitionedIterator inMemoryIterator)  { throw new RuntimeException(); }
  private  scala.collection.Iterator<scala.Tuple2<java.lang.Object, scala.collection.Iterator<scala.Product2<K, C>>>> merge (scala.collection.Seq<org.apache.spark.util.collection.ExternalSorter<K, V, C>.SpilledFile> spills, scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, C>> inMemory)  { throw new RuntimeException(); }
  private  scala.collection.Iterator<scala.Product2<K, C>> mergeSort (scala.collection.Seq<scala.collection.Iterator<scala.Product2<K, C>>> iterators, java.util.Comparator<K> comparator)  { throw new RuntimeException(); }
  private  scala.collection.Iterator<scala.Product2<K, C>> mergeWithAggregation (scala.collection.Seq<scala.collection.Iterator<scala.Product2<K, C>>> iterators, scala.Function2<C, C, C> mergeCombiners, java.util.Comparator<K> comparator, boolean totalOrder)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, C>> destructiveIterator (scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, C>> memoryIterator)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, scala.collection.Iterator<scala.Product2<K, C>>>> partitionedIterator ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Product2<K, C>> iterator ()  { throw new RuntimeException(); }
  public  long[] writePartitionedFile (org.apache.spark.storage.BlockId blockId, java.io.File outputFile)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  private  scala.collection.Iterator<scala.Tuple2<java.lang.Object, scala.collection.Iterator<scala.Product2<K, C>>>> groupByPartition (scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, C>> data)  { throw new RuntimeException(); }
}
