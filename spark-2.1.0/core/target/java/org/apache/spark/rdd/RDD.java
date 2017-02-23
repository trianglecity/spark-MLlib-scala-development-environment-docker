package org.apache.spark.rdd;
/**
 * A Resilient Distributed Dataset (RDD), the basic abstraction in Spark. Represents an immutable,
 * partitioned collection of elements that can be operated on in parallel. This class contains the
 * basic operations available on all RDDs, such as <code>map</code>, <code>filter</code>, and <code>persist</code>. In addition,
 * {@link org.apache.spark.rdd.PairRDDFunctions} contains operations available only on RDDs of key-value
 * pairs, such as <code>groupByKey</code> and <code>join</code>;
 * {@link org.apache.spark.rdd.DoubleRDDFunctions} contains operations available only on RDDs of
 * Doubles; and
 * {@link org.apache.spark.rdd.SequenceFileRDDFunctions} contains operations available on RDDs that
 * can be saved as SequenceFiles.
 * All operations are automatically available on any RDD of the right type (e.g. RDD[(Int, Int)]
 * through implicit.
 * <p>
 * Internally, each RDD is characterized by five main properties:
 * <p>
 *  - A list of partitions
 *  - A function for computing each split
 *  - A list of dependencies on other RDDs
 *  - Optionally, a Partitioner for key-value RDDs (e.g. to say that the RDD is hash-partitioned)
 *  - Optionally, a list of preferred locations to compute each split on (e.g. block locations for
 *    an HDFS file)
 * <p>
 * All of the scheduling and execution in Spark is done based on these methods, allowing each RDD
 * to implement its own way of computing itself. Indeed, users can implement custom RDDs (e.g. for
 * reading data from a new storage system) by overriding these functions. Please refer to the
 * <a href="http://people.csail.mit.edu/matei/papers/2012/nsdi_spark.pdf">Spark paper</a>
 * for more details on RDD internals.
 */
public abstract class RDD<T extends java.lang.Object> implements scala.Serializable, org.apache.spark.internal.Logging {
  static   java.lang.String CHECKPOINT_ALL_MARKED_ANCESTORS ()  { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.PairRDDFunctions<K, V> rddToPairRDDFunctions (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, scala.reflect.ClassTag<K> kt, scala.reflect.ClassTag<V> vt, scala.math.Ordering<K> ord)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.apache.spark.rdd.AsyncRDDActions<T> rddToAsyncRDDActions (org.apache.spark.rdd.RDD<T> rdd, scala.reflect.ClassTag<T> evidence$34)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.SequenceFileRDDFunctions<K, V> rddToSequenceFileRDDFunctions (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, scala.reflect.ClassTag<K> kt, scala.reflect.ClassTag<V> vt, org.apache.spark.WritableFactory<K> keyWritableFactory, org.apache.spark.WritableFactory<V> valueWritableFactory)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.OrderedRDDFunctions<K, V, scala.Tuple2<K, V>> rddToOrderedRDDFunctions (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, scala.math.Ordering<K> evidence$35, scala.reflect.ClassTag<K> evidence$36, scala.reflect.ClassTag<V> evidence$37)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.DoubleRDDFunctions doubleRDDToDoubleRDDFunctions (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.apache.spark.rdd.DoubleRDDFunctions numericRDDToDoubleRDDFunctions (org.apache.spark.rdd.RDD<T> rdd, scala.math.Numeric<T> num)  { throw new RuntimeException(); }
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
  private  org.apache.spark.SparkContext _sc ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.Dependency<?>> deps ()  { throw new RuntimeException(); }
  // not preceding
  public   RDD (org.apache.spark.SparkContext _sc, scala.collection.Seq<org.apache.spark.Dependency<?>> deps, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  private  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  /** Construct an RDD with just a one-to-one dependency on one parent */
  public   RDD (org.apache.spark.rdd.RDD<?> oneParent, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
    org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Implemented by subclasses to compute a given partition.
   * @param split (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  public abstract  scala.collection.Iterator<T> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  ;
  /**
   * Implemented by subclasses to return the set of partitions in this RDD. This method will only
   * be called once, so it is safe to implement a time-consuming computation in it.
   * <p>
   * The partitions in this array must satisfy the following property:
   *   <code>rdd.partitions.zipWithIndex.forall { case (partition, index) =&gt; partition.index == index }</code>
   * @return (undocumented)
   */
  protected abstract  org.apache.spark.Partition[] getPartitions ()  ;
  /**
   * Implemented by subclasses to return how this RDD depends on parent RDDs. This method will only
   * be called once, so it is safe to implement a time-consuming computation in it.
   * @return (undocumented)
   */
  protected  scala.collection.Seq<org.apache.spark.Dependency<?>> getDependencies ()  { throw new RuntimeException(); }
  /**
   * Optionally overridden by subclasses to specify placement preferences.
   * @param split (undocumented)
   * @return (undocumented)
   */
  protected  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
  /** Optionally overridden by subclasses to specify how they are partitioned. */
  public  scala.Option<org.apache.spark.Partitioner> partitioner ()  { throw new RuntimeException(); }
  /** The SparkContext that created this RDD. */
  public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  /** A unique ID for this RDD (within its SparkContext). */
  public  int id ()  { throw new RuntimeException(); }
  /** A friendly name for this RDD */
  public  java.lang.String name ()  { throw new RuntimeException(); }
  /** Assign a name to this RDD */
  public  org.apache.spark.rdd.RDD<T> setName (java.lang.String _name)  { throw new RuntimeException(); }
  /**
   * Mark this RDD for persisting using the specified level.
   * <p>
   * @param newLevel the target storage level
   * @param allowOverride whether to override any existing level with the new one
   * @return (undocumented)
   */
  private  org.apache.spark.rdd.RDD<T> persist (org.apache.spark.storage.StorageLevel newLevel, boolean allowOverride)  { throw new RuntimeException(); }
  /**
   * Set this RDD's storage level to persist its values across operations after the first time
   * it is computed. This can only be used to assign a new storage level if the RDD does not
   * have a storage level set yet. Local checkpointing is an exception.
   * @param newLevel (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> persist (org.apache.spark.storage.StorageLevel newLevel)  { throw new RuntimeException(); }
  /**
   * Persist this RDD with the default storage level (<code>MEMORY_ONLY</code>).
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> persist ()  { throw new RuntimeException(); }
  /**
   * Persist this RDD with the default storage level (<code>MEMORY_ONLY</code>).
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> cache ()  { throw new RuntimeException(); }
  /**
   * Mark the RDD as non-persistent, and remove all blocks for it from memory and disk.
   * <p>
   * @param blocking Whether to block until all blocks are deleted.
   * @return This RDD.
   */
  public  org.apache.spark.rdd.RDD<T> unpersist (boolean blocking)  { throw new RuntimeException(); }
  /** Get the RDD's current storage level, or StorageLevel.NONE if none is set. */
  public  org.apache.spark.storage.StorageLevel getStorageLevel ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.Dependency<?>> dependencies_ ()  { throw new RuntimeException(); }
  private  org.apache.spark.Partition[] partitions_ ()  { throw new RuntimeException(); }
  /** An Option holding our checkpoint RDD, if we are checkpointed */
  private  scala.Option<org.apache.spark.rdd.CheckpointRDD<T>> checkpointRDD ()  { throw new RuntimeException(); }
  /**
   * Get the list of dependencies of this RDD, taking into account whether the
   * RDD is checkpointed or not.
   * @return (undocumented)
   */
  public final  scala.collection.Seq<org.apache.spark.Dependency<?>> dependencies ()  { throw new RuntimeException(); }
  /**
   * Get the array of partitions of this RDD, taking into account whether the
   * RDD is checkpointed or not.
   * @return (undocumented)
   */
  public final  org.apache.spark.Partition[] partitions ()  { throw new RuntimeException(); }
  /**
   * Returns the number of partitions of this RDD.
   * @return (undocumented)
   */
  public final  int getNumPartitions ()  { throw new RuntimeException(); }
  /**
   * Get the preferred locations of a partition, taking into account whether the
   * RDD is checkpointed.
   * @param split (undocumented)
   * @return (undocumented)
   */
  public final  scala.collection.Seq<java.lang.String> preferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
  /**
   * Internal method to this RDD; will read from cache if applicable, or otherwise compute it.
   * This should ''not'' be called by users directly, but is available for implementors of custom
   * subclasses of RDD.
   * @param split (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  public final  scala.collection.Iterator<T> iterator (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /**
   * Return the ancestors of the given RDD that are related to it only through a sequence of
   * narrow dependencies. This traverses the given RDD's dependency tree using DFS, but maintains
   * no ordering on the RDDs returned.
   * @return (undocumented)
   */
    scala.collection.Seq<org.apache.spark.rdd.RDD<?>> getNarrowAncestors ()  { throw new RuntimeException(); }
  /**
   * Compute an RDD partition or read it from a checkpoint if the RDD is checkpointing.
   * @param split (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
    scala.collection.Iterator<T> computeOrReadCheckpoint (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /**
   * Gets or computes an RDD partition. Used by RDD.iterator() when an RDD is cached.
   * @param partition (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
    scala.collection.Iterator<T> getOrCompute (org.apache.spark.Partition partition, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /**
   * Execute a block of code in a scope such that all new RDDs created in this body will
   * be part of the same scope. For more detail, see {{org.apache.spark.rdd.RDDOperationScope}}.
   * <p>
   * Note: Return statements are NOT allowed in the given body.
   * @param body (undocumented)
   * @return (undocumented)
   */
   <U extends java.lang.Object> U withScope (scala.Function0<U> body)  { throw new RuntimeException(); }
  /**
   * Return a new RDD by applying a function to all elements of this RDD.
   * @param f (undocumented)
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> map (scala.Function1<T, U> f, scala.reflect.ClassTag<U> evidence$3)  { throw new RuntimeException(); }
  /**
   *  Return a new RDD by first applying a function to all elements of this
   *  RDD, and then flattening the results.
   * @param f (undocumented)
   * @param evidence$4 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> flatMap (scala.Function1<T, scala.collection.TraversableOnce<U>> f, scala.reflect.ClassTag<U> evidence$4)  { throw new RuntimeException(); }
  /**
   * Return a new RDD containing only the elements that satisfy a predicate.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> filter (scala.Function1<T, java.lang.Object> f)  { throw new RuntimeException(); }
  /**
   * Return a new RDD containing the distinct elements in this RDD.
   * @param numPartitions (undocumented)
   * @param ord (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> distinct (int numPartitions, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  /**
   * Return a new RDD containing the distinct elements in this RDD.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> distinct ()  { throw new RuntimeException(); }
  /**
   * Return a new RDD that has exactly numPartitions partitions.
   * <p>
   * Can increase or decrease the level of parallelism in this RDD. Internally, this uses
   * a shuffle to redistribute data.
   * <p>
   * If you are decreasing the number of partitions in this RDD, consider using <code>coalesce</code>,
   * which can avoid performing a shuffle.
   * @param numPartitions (undocumented)
   * @param ord (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> repartition (int numPartitions, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  /**
   * Return a new RDD that is reduced into <code>numPartitions</code> partitions.
   * <p>
   * This results in a narrow dependency, e.g. if you go from 1000 partitions
   * to 100 partitions, there will not be a shuffle, instead each of the 100
   * new partitions will claim 10 of the current partitions.
   * <p>
   * However, if you're doing a drastic coalesce, e.g. to numPartitions = 1,
   * this may result in your computation taking place on fewer nodes than
   * you like (e.g. one node in the case of numPartitions = 1). To avoid this,
   * you can pass shuffle = true. This will add a shuffle step, but means the
   * current upstream partitions will be executed in parallel (per whatever
   * the current partitioning is).
   * <p>
   * @note With shuffle = true, you can actually coalesce to a larger number
   * of partitions. This is useful if you have a small number of partitions,
   * say 100, potentially with a few partitions being abnormally large. Calling
   * coalesce(1000, shuffle = true) will result in 1000 partitions with the
   * data distributed using a hash partitioner. The optional partition coalescer
   * passed in must be serializable.
   * @param numPartitions (undocumented)
   * @param shuffle (undocumented)
   * @param partitionCoalescer (undocumented)
   * @param ord (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> coalesce (int numPartitions, boolean shuffle, scala.Option<org.apache.spark.rdd.PartitionCoalescer> partitionCoalescer, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  /**
   * Return a sampled subset of this RDD.
   * <p>
   * @param withReplacement can elements be sampled multiple times (replaced when sampled out)
   * @param fraction expected size of the sample as a fraction of this RDD's size
   *  without replacement: probability that each element is chosen; fraction must be [0, 1]
   *  with replacement: expected number of times each element is chosen; fraction must be greater
   *  than or equal to 0
   * @param seed seed for the random number generator
   * <p>
   * @note This is NOT guaranteed to provide exactly the fraction of the count
   * of the given {@link RDD}.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> sample (boolean withReplacement, double fraction, long seed)  { throw new RuntimeException(); }
  /**
   * Randomly splits this RDD with the provided weights.
   * <p>
   * @param weights weights for splits, will be normalized if they don't sum to 1
   * @param seed random seed
   * <p>
   * @return split RDDs in an array
   */
  public  org.apache.spark.rdd.RDD<T>[] randomSplit (double[] weights, long seed)  { throw new RuntimeException(); }
  /**
   * Internal method exposed for Random Splits in DataFrames. Samples an RDD given a probability
   * range.
   * @param lb lower bound to use for the Bernoulli sampler
   * @param ub upper bound to use for the Bernoulli sampler
   * @param seed the seed for the Random number generator
   * @return A random sub-sample of the RDD without replacement.
   */
    org.apache.spark.rdd.RDD<T> randomSampleWithRange (double lb, double ub, long seed)  { throw new RuntimeException(); }
  /**
   * Return a fixed-size sampled subset of this RDD in an array
   * <p>
   * @param withReplacement whether sampling is done with replacement
   * @param num size of the returned sample
   * @param seed seed for the random number generator
   * @return sample of specified size in an array
   * <p>
   * @note this method should only be used if the resulting array is expected to be small, as
   * all the data is loaded into the driver's memory.
   */
  public  java.lang.Object takeSample (boolean withReplacement, int num, long seed)  { throw new RuntimeException(); }
  /**
   * Return the union of this RDD and another one. Any identical elements will appear multiple
   * times (use <code>.distinct()</code> to eliminate them).
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> union (org.apache.spark.rdd.RDD<T> other)  { throw new RuntimeException(); }
  /**
   * Return this RDD sorted by the given key function.
   * @param f (undocumented)
   * @param ascending (undocumented)
   * @param numPartitions (undocumented)
   * @param ord (undocumented)
   * @param ctag (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object> org.apache.spark.rdd.RDD<T> sortBy (scala.Function1<T, K> f, boolean ascending, int numPartitions, scala.math.Ordering<K> ord, scala.reflect.ClassTag<K> ctag)  { throw new RuntimeException(); }
  /**
   * Return the intersection of this RDD and another one. The output will not contain any duplicate
   * elements, even if the input RDDs did.
   * <p>
   * @note This method performs a shuffle internally.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> intersection (org.apache.spark.rdd.RDD<T> other)  { throw new RuntimeException(); }
  /**
   * Return the intersection of this RDD and another one. The output will not contain any duplicate
   * elements, even if the input RDDs did.
   * <p>
   * @note This method performs a shuffle internally.
   * <p>
   * @param partitioner Partitioner to use for the resulting RDD
   * @param other (undocumented)
   * @param ord (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> intersection (org.apache.spark.rdd.RDD<T> other, org.apache.spark.Partitioner partitioner, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  /**
   * Return the intersection of this RDD and another one. The output will not contain any duplicate
   * elements, even if the input RDDs did.  Performs a hash partition across the cluster
   * <p>
   * @note This method performs a shuffle internally.
   * <p>
   * @param numPartitions How many partitions to use in the resulting RDD
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> intersection (org.apache.spark.rdd.RDD<T> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return an RDD created by coalescing all elements within each partition into an array.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> glom ()  { throw new RuntimeException(); }
  /**
   * Return the Cartesian product of this RDD and another one, that is, the RDD of all pairs of
   * elements (a, b) where a is in <code>this</code> and b is in <code>other</code>.
   * @param other (undocumented)
   * @param evidence$5 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<T, U>> cartesian (org.apache.spark.rdd.RDD<U> other, scala.reflect.ClassTag<U> evidence$5)  { throw new RuntimeException(); }
  /**
   * Return an RDD of grouped items. Each group consists of a key and a sequence of elements
   * mapping to that key. The ordering of elements within each group is not guaranteed, and
   * may even differ each time the resulting RDD is evaluated.
   * <p>
   * @note This operation may be very expensive. If you are grouping in order to perform an
   * aggregation (such as a sum or average) over each key, using <code>PairRDDFunctions.aggregateByKey</code>
   * or <code>PairRDDFunctions.reduceByKey</code> will provide much better performance.
   * @param f (undocumented)
   * @param kt (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<T>>> groupBy (scala.Function1<T, K> f, scala.reflect.ClassTag<K> kt)  { throw new RuntimeException(); }
  /**
   * Return an RDD of grouped elements. Each group consists of a key and a sequence of elements
   * mapping to that key. The ordering of elements within each group is not guaranteed, and
   * may even differ each time the resulting RDD is evaluated.
   * <p>
   * @note This operation may be very expensive. If you are grouping in order to perform an
   * aggregation (such as a sum or average) over each key, using <code>PairRDDFunctions.aggregateByKey</code>
   * or <code>PairRDDFunctions.reduceByKey</code> will provide much better performance.
   * @param f (undocumented)
   * @param numPartitions (undocumented)
   * @param kt (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<T>>> groupBy (scala.Function1<T, K> f, int numPartitions, scala.reflect.ClassTag<K> kt)  { throw new RuntimeException(); }
  /**
   * Return an RDD of grouped items. Each group consists of a key and a sequence of elements
   * mapping to that key. The ordering of elements within each group is not guaranteed, and
   * may even differ each time the resulting RDD is evaluated.
   * <p>
   * @note This operation may be very expensive. If you are grouping in order to perform an
   * aggregation (such as a sum or average) over each key, using <code>PairRDDFunctions.aggregateByKey</code>
   * or <code>PairRDDFunctions.reduceByKey</code> will provide much better performance.
   * @param f (undocumented)
   * @param p (undocumented)
   * @param kt (undocumented)
   * @param ord (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<T>>> groupBy (scala.Function1<T, K> f, org.apache.spark.Partitioner p, scala.reflect.ClassTag<K> kt, scala.math.Ordering<K> ord)  { throw new RuntimeException(); }
  /**
   * Return an RDD created by piping elements to a forked external process.
   * @param command (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<java.lang.String> pipe (java.lang.String command)  { throw new RuntimeException(); }
  /**
   * Return an RDD created by piping elements to a forked external process.
   * @param command (undocumented)
   * @param env (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<java.lang.String> pipe (java.lang.String command, scala.collection.Map<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  /**
   * Return an RDD created by piping elements to a forked external process. The resulting RDD
   * is computed by executing the given process once per partition. All elements
   * of each input partition are written to a process's stdin as lines of input separated
   * by a newline. The resulting partition consists of the process's stdout output, with
   * each line of stdout resulting in one element of the output partition. A process is invoked
   * even for empty partitions.
   * <p>
   * The print behavior can be customized by providing two functions.
   * <p>
   * @param command command to run in forked process.
   * @param env environment variables to set.
   * @param printPipeContext Before piping elements, this function is called as an opportunity
   *                         to pipe context data. Print line function (like out.println) will be
   *                         passed as printPipeContext's parameter.
   * @param printRDDElement Use this function to customize how to pipe elements. This function
   *                        will be called with each RDD element as the 1st parameter, and the
   *                        print line function (like out.println()) as the 2nd parameter.
   *                        An example of pipe the RDD data of groupBy() in a streaming way,
   *                        instead of constructing a huge String to concat all the elements:
   *                        <pre><code>
   *                        def printRDDElement(record:(String, Seq[String]), f:String=&gt;Unit) =
   *                          for (e &lt;- record._2) {f(e)}
   *                        </code></pre>
   * @param separateWorkingDir Use separate working directories for each task.
   * @param bufferSize Buffer size for the stdin writer for the piped process.
   * @param encoding Char encoding used for interacting (via stdin, stdout and stderr) with
   *                 the piped process
   * @return the result RDD
   */
  public  org.apache.spark.rdd.RDD<java.lang.String> pipe (scala.collection.Seq<java.lang.String> command, scala.collection.Map<java.lang.String, java.lang.String> env, scala.Function1<scala.Function1<java.lang.String, scala.runtime.BoxedUnit>, scala.runtime.BoxedUnit> printPipeContext, scala.Function2<T, scala.Function1<java.lang.String, scala.runtime.BoxedUnit>, scala.runtime.BoxedUnit> printRDDElement, boolean separateWorkingDir, int bufferSize, java.lang.String encoding)  { throw new RuntimeException(); }
  /**
   * Return a new RDD by applying a function to each partition of this RDD.
   * <p>
   * <code>preservesPartitioning</code> indicates whether the input function preserves the partitioner, which
   * should be <code>false</code> unless this is a pair RDD and the input function doesn't modify the keys.
   * @param f (undocumented)
   * @param preservesPartitioning (undocumented)
   * @param evidence$6 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitions (scala.Function1<scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$6)  { throw new RuntimeException(); }
  /**
   * [performance] Spark's internal mapPartitionsWithIndex method that skips closure cleaning.
   * It is a performance API to be used carefully only if we are sure that the RDD elements are
   * serializable and don't require closure cleaning.
   * <p>
   * @param preservesPartitioning indicates whether the input function preserves the partitioner,
   * which should be <code>false</code> unless this is a pair RDD and the input function doesn't modify
   * the keys.
   * @param f (undocumented)
   * @param evidence$7 (undocumented)
   * @return (undocumented)
   */
   <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitionsWithIndexInternal (scala.Function2<java.lang.Object, scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$7)  { throw new RuntimeException(); }
  /**
   * [performance] Spark's internal mapPartitions method that skips closure cleaning.
   * @param f (undocumented)
   * @param preservesPartitioning (undocumented)
   * @param evidence$8 (undocumented)
   * @return (undocumented)
   */
   <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitionsInternal (scala.Function1<scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$8)  { throw new RuntimeException(); }
  /**
   * Return a new RDD by applying a function to each partition of this RDD, while tracking the index
   * of the original partition.
   * <p>
   * <code>preservesPartitioning</code> indicates whether the input function preserves the partitioner, which
   * should be <code>false</code> unless this is a pair RDD and the input function doesn't modify the keys.
   * @param f (undocumented)
   * @param preservesPartitioning (undocumented)
   * @param evidence$9 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitionsWithIndex (scala.Function2<java.lang.Object, scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$9)  { throw new RuntimeException(); }
  /**
   * Zips this RDD with another one, returning key-value pairs with the first element in each RDD,
   * second element in each RDD, etc. Assumes that the two RDDs have the *same number of
   * partitions* and the *same number of elements in each partition* (e.g. one was made through
   * a map on the other).
   * @param other (undocumented)
   * @param evidence$10 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<T, U>> zip (org.apache.spark.rdd.RDD<U> other, scala.reflect.ClassTag<U> evidence$10)  { throw new RuntimeException(); }
  /**
   * Zip this RDD's partitions with one (or more) RDD(s) and return a new RDD by
   * applying a function to the zipped partitions. Assumes that all the RDDs have the
   * *same number of partitions*, but does *not* require them to have the same number
   * of elements in each partition.
   * @param rdd2 (undocumented)
   * @param preservesPartitioning (undocumented)
   * @param f (undocumented)
   * @param evidence$11 (undocumented)
   * @param evidence$12 (undocumented)
   * @return (undocumented)
   */
  public <B extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, boolean preservesPartitioning, scala.Function2<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$11, scala.reflect.ClassTag<V> evidence$12)  { throw new RuntimeException(); }
  public <B extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, scala.Function2<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$13, scala.reflect.ClassTag<V> evidence$14)  { throw new RuntimeException(); }
  public <B extends java.lang.Object, C extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, org.apache.spark.rdd.RDD<C> rdd3, boolean preservesPartitioning, scala.Function3<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<C>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$15, scala.reflect.ClassTag<C> evidence$16, scala.reflect.ClassTag<V> evidence$17)  { throw new RuntimeException(); }
  public <B extends java.lang.Object, C extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, org.apache.spark.rdd.RDD<C> rdd3, scala.Function3<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<C>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$18, scala.reflect.ClassTag<C> evidence$19, scala.reflect.ClassTag<V> evidence$20)  { throw new RuntimeException(); }
  public <B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, org.apache.spark.rdd.RDD<C> rdd3, org.apache.spark.rdd.RDD<D> rdd4, boolean preservesPartitioning, scala.Function4<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<C>, scala.collection.Iterator<D>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$21, scala.reflect.ClassTag<C> evidence$22, scala.reflect.ClassTag<D> evidence$23, scala.reflect.ClassTag<V> evidence$24)  { throw new RuntimeException(); }
  public <B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, org.apache.spark.rdd.RDD<C> rdd3, org.apache.spark.rdd.RDD<D> rdd4, scala.Function4<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<C>, scala.collection.Iterator<D>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$25, scala.reflect.ClassTag<C> evidence$26, scala.reflect.ClassTag<D> evidence$27, scala.reflect.ClassTag<V> evidence$28)  { throw new RuntimeException(); }
  /**
   * Applies a function f to all elements of this RDD.
   * @param f (undocumented)
   */
  public  void foreach (scala.Function1<T, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /**
   * Applies a function f to each partition of this RDD.
   * @param f (undocumented)
   */
  public  void foreachPartition (scala.Function1<scala.collection.Iterator<T>, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /**
   * Return an array that contains all of the elements in this RDD.
   * <p>
   * @note This method should only be used if the resulting array is expected to be small, as
   * all the data is loaded into the driver's memory.
   * @return (undocumented)
   */
  public  java.lang.Object collect ()  { throw new RuntimeException(); }
  /**
   * Return an iterator that contains all of the elements in this RDD.
   * <p>
   * The iterator will consume as much memory as the largest partition in this RDD.
   * <p>
   * @note This results in multiple Spark jobs, and if the input RDD is the result
   * of a wide transformation (e.g. join with different partitioners), to avoid
   * recomputing the input RDD should be cached first.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<T> toLocalIterator ()  { throw new RuntimeException(); }
  /**
   * Return an RDD that contains all matching values by applying <code>f</code>.
   * @param f (undocumented)
   * @param evidence$29 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> collect (scala.PartialFunction<T, U> f, scala.reflect.ClassTag<U> evidence$29)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the elements from <code>this</code> that are not in <code>other</code>.
   * <p>
   * Uses <code>this</code> partitioner/partition size, because even if <code>other</code> is huge, the resulting
   * RDD will be &amp;lt;= us.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> subtract (org.apache.spark.rdd.RDD<T> other)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the elements from <code>this</code> that are not in <code>other</code>.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> subtract (org.apache.spark.rdd.RDD<T> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the elements from <code>this</code> that are not in <code>other</code>.
   * @param other (undocumented)
   * @param p (undocumented)
   * @param ord (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> subtract (org.apache.spark.rdd.RDD<T> other, org.apache.spark.Partitioner p, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  /**
   * Reduces the elements of this RDD using the specified commutative and
   * associative binary operator.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  T reduce (scala.Function2<T, T, T> f)  { throw new RuntimeException(); }
  /**
   * Reduces the elements of this RDD in a multi-level tree pattern.
   * <p>
   * @param depth suggested depth of the tree (default: 2)
   * @see org.apache.spark.rdd.RDD#reduce
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  T treeReduce (scala.Function2<T, T, T> f, int depth)  { throw new RuntimeException(); }
  /**
   * Aggregate the elements of each partition, and then the results for all the partitions, using a
   * given associative function and a neutral "zero value". The function
   * op(t1, t2) is allowed to modify t1 and return it as its result value to avoid object
   * allocation; however, it should not modify t2.
   * <p>
   * This behaves somewhat differently from fold operations implemented for non-distributed
   * collections in functional languages like Scala. This fold operation may be applied to
   * partitions individually, and then fold those results into the final result, rather than
   * apply the fold to each element sequentially in some defined ordering. For functions
   * that are not commutative, the result may differ from that of a fold applied to a
   * non-distributed collection.
   * <p>
   * @param zeroValue the initial value for the accumulated result of each partition for the <code>op</code>
   *                  operator, and also the initial value for the combine results from different
   *                  partitions for the <code>op</code> operator - this will typically be the neutral
   *                  element (e.g. <code>Nil</code> for list concatenation or <code>0</code> for summation)
   * @param op an operator used to both accumulate results within a partition and combine results
   *                  from different partitions
   * @return (undocumented)
   */
  public  T fold (T zeroValue, scala.Function2<T, T, T> op)  { throw new RuntimeException(); }
  /**
   * Aggregate the elements of each partition, and then the results for all the partitions, using
   * given combine functions and a neutral "zero value". This function can return a different result
   * type, U, than the type of this RDD, T. Thus, we need one operation for merging a T into an U
   * and one operation for merging two U's, as in scala.TraversableOnce. Both of these functions are
   * allowed to modify and return their first argument instead of creating a new U to avoid memory
   * allocation.
   * <p>
   * @param zeroValue the initial value for the accumulated result of each partition for the
   *                  <code>seqOp</code> operator, and also the initial value for the combine results from
   *                  different partitions for the <code>combOp</code> operator - this will typically be the
   *                  neutral element (e.g. <code>Nil</code> for list concatenation or <code>0</code> for summation)
   * @param seqOp an operator used to accumulate results within a partition
   * @param combOp an associative operator used to combine results from different partitions
   * @param evidence$30 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> U aggregate (U zeroValue, scala.Function2<U, T, U> seqOp, scala.Function2<U, U, U> combOp, scala.reflect.ClassTag<U> evidence$30)  { throw new RuntimeException(); }
  /**
   * Aggregates the elements of this RDD in a multi-level tree pattern.
   * <p>
   * @param depth suggested depth of the tree (default: 2)
   * @see org.apache.spark.rdd.RDD#aggregate
   * @param zeroValue (undocumented)
   * @param seqOp (undocumented)
   * @param combOp (undocumented)
   * @param evidence$31 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> U treeAggregate (U zeroValue, scala.Function2<U, T, U> seqOp, scala.Function2<U, U, U> combOp, int depth, scala.reflect.ClassTag<U> evidence$31)  { throw new RuntimeException(); }
  /**
   * Return the number of elements in the RDD.
   * @return (undocumented)
   */
  public  long count ()  { throw new RuntimeException(); }
  /**
   * Approximate version of count() that returns a potentially incomplete result
   * within a timeout, even if not all tasks have finished.
   * <p>
   * The confidence is the probability that the error bounds of the result will
   * contain the true value. That is, if countApprox were called repeatedly
   * with confidence 0.9, we would expect 90% of the results to contain the
   * true count. The confidence must be in the range [0,1] or an exception will
   * be thrown.
   * <p>
   * @param timeout maximum time to wait for the job, in milliseconds
   * @param confidence the desired statistical confidence in the result
   * @return a potentially incomplete result, with error bounds
   */
  public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> countApprox (long timeout, double confidence)  { throw new RuntimeException(); }
  /**
   * Return the count of each unique value in this RDD as a local map of (value, count) pairs.
   * <p>
   * @note This method should only be used if the resulting map is expected to be small, as
   * the whole thing is loaded into the driver's memory.
   * To handle very large results, consider using
   * <p>
   * <pre><code>
   * rdd.map(x =&gt; (x, 1L)).reduceByKey(_ + _)
   * </code></pre>
   * <p>
   * , which returns an RDD[T, Long] instead of a map.
   * @param ord (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Map<T, java.lang.Object> countByValue (scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  /**
   * Approximate version of countByValue().
   * <p>
   * @param timeout maximum time to wait for the job, in milliseconds
   * @param confidence the desired statistical confidence in the result
   * @return a potentially incomplete result, with error bounds
   * @param ord (undocumented)
   */
  public  org.apache.spark.partial.PartialResult<scala.collection.Map<T, org.apache.spark.partial.BoundedDouble>> countByValueApprox (long timeout, double confidence, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  /**
   * Return approximate number of distinct elements in the RDD.
   * <p>
   * The algorithm used is based on streamlib's implementation of "HyperLogLog in Practice:
   * Algorithmic Engineering of a State of The Art Cardinality Estimation Algorithm", available
   * <a href="http://dx.doi.org/10.1145/2452376.2452456">here</a>.
   * <p>
   * The relative accuracy is approximately <code>1.054 / sqrt(2^p)</code>. Setting a nonzero (<code>sp</code> is greater
   * than <code>p</code>) would trigger sparse representation of registers, which may reduce the memory
   * consumption and increase accuracy when the cardinality is small.
   * <p>
   * @param p The precision value for the normal set.
   *          <code>p</code> must be a value between 4 and <code>sp</code> if <code>sp</code> is not zero (32 max).
   * @param sp The precision value for the sparse set, between 0 and 32.
   *           If <code>sp</code> equals 0, the sparse representation is skipped.
   * @return (undocumented)
   */
  public  long countApproxDistinct (int p, int sp)  { throw new RuntimeException(); }
  /**
   * Return approximate number of distinct elements in the RDD.
   * <p>
   * The algorithm used is based on streamlib's implementation of "HyperLogLog in Practice:
   * Algorithmic Engineering of a State of The Art Cardinality Estimation Algorithm", available
   * <a href="http://dx.doi.org/10.1145/2452376.2452456">here</a>.
   * <p>
   * @param relativeSD Relative accuracy. Smaller values create counters that require more space.
   *                   It must be greater than 0.000017.
   * @return (undocumented)
   */
  public  long countApproxDistinct (double relativeSD)  { throw new RuntimeException(); }
  /**
   * Zips this RDD with its element indices. The ordering is first based on the partition index
   * and then the ordering of items within each partition. So the first item in the first
   * partition gets index 0, and the last item in the last partition receives the largest index.
   * <p>
   * This is similar to Scala's zipWithIndex but it uses Long instead of Int as the index type.
   * This method needs to trigger a spark job when this RDD contains more than one partitions.
   * <p>
   * @note Some RDDs, such as those returned by groupBy(), do not guarantee order of
   * elements in a partition. The index assigned to each element is therefore not guaranteed,
   * and may even change if the RDD is reevaluated. If a fixed ordering is required to guarantee
   * the same index assignments, you should sort the RDD with sortByKey() or save it to a file.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<T, java.lang.Object>> zipWithIndex ()  { throw new RuntimeException(); }
  /**
   * Zips this RDD with generated unique Long ids. Items in the kth partition will get ids k, n+k,
   * 2*n+k, ..., where n is the number of partitions. So there may exist gaps, but this method
   * won't trigger a spark job, which is different from {@link org.apache.spark.rdd.RDD#zipWithIndex}.
   * <p>
   * @note Some RDDs, such as those returned by groupBy(), do not guarantee order of
   * elements in a partition. The unique ID assigned to each element is therefore not guaranteed,
   * and may even change if the RDD is reevaluated. If a fixed ordering is required to guarantee
   * the same index assignments, you should sort the RDD with sortByKey() or save it to a file.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<T, java.lang.Object>> zipWithUniqueId ()  { throw new RuntimeException(); }
  /**
   * Take the first num elements of the RDD. It works by first scanning one partition, and use the
   * results from that partition to estimate the number of additional partitions needed to satisfy
   * the limit.
   * <p>
   * @note This method should only be used if the resulting array is expected to be small, as
   * all the data is loaded into the driver's memory.
   * <p>
   * @note Due to complications in the internal implementation, this method will raise
   * an exception if called on an RDD of <code>Nothing</code> or <code>Null</code>.
   * @param num (undocumented)
   * @return (undocumented)
   */
  public  java.lang.Object take (int num)  { throw new RuntimeException(); }
  /**
   * Return the first element in this RDD.
   * @return (undocumented)
   */
  public  T first ()  { throw new RuntimeException(); }
  /**
   * Returns the top k (largest) elements from this RDD as defined by the specified
   * implicit Ordering[T] and maintains the ordering. This does the opposite of
   * {@link takeOrdered}. For example:
   * <pre><code>
   *   sc.parallelize(Seq(10, 4, 2, 12, 3)).top(1)
   *   // returns Array(12)
   *
   *   sc.parallelize(Seq(2, 3, 4, 5, 6)).top(2)
   *   // returns Array(6, 5)
   * </code></pre>
   * <p>
   * @note This method should only be used if the resulting array is expected to be small, as
   * all the data is loaded into the driver's memory.
   * <p>
   * @param num k, the number of top elements to return
   * @param ord the implicit ordering for T
   * @return an array of top elements
   */
  public  java.lang.Object top (int num, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  /**
   * Returns the first k (smallest) elements from this RDD as defined by the specified
   * implicit Ordering[T] and maintains the ordering. This does the opposite of {@link top}.
   * For example:
   * <pre><code>
   *   sc.parallelize(Seq(10, 4, 2, 12, 3)).takeOrdered(1)
   *   // returns Array(2)
   *
   *   sc.parallelize(Seq(2, 3, 4, 5, 6)).takeOrdered(2)
   *   // returns Array(2, 3)
   * </code></pre>
   * <p>
   * @note This method should only be used if the resulting array is expected to be small, as
   * all the data is loaded into the driver's memory.
   * <p>
   * @param num k, the number of elements to return
   * @param ord the implicit ordering for T
   * @return an array of top elements
   */
  public  java.lang.Object takeOrdered (int num, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  /**
   * Returns the max of this RDD as defined by the implicit Ordering[T].
   * @return the maximum element of the RDD
   * @param ord (undocumented)
   * */
  public  T max (scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  /**
   * Returns the min of this RDD as defined by the implicit Ordering[T].
   * @return the minimum element of the RDD
   * @param ord (undocumented)
   * */
  public  T min (scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  /**
   * @note Due to complications in the internal implementation, this method will raise an
   * exception if called on an RDD of <code>Nothing</code> or <code>Null</code>. This may be come up in practice
   * because, for example, the type of <code>parallelize(Seq())</code> is <code>RDD[Nothing]</code>.
   * (<code>parallelize(Seq())</code> should be avoided anyway in favor of <code>parallelize(Seq[T]())</code>.)
   * @return true if and only if the RDD contains no elements at all. Note that an RDD
   *         may be empty even when it has at least 1 partition.
   */
  public  boolean isEmpty ()  { throw new RuntimeException(); }
  /**
   * Save this RDD as a text file, using string representations of elements.
   * @param path (undocumented)
   */
  public  void saveAsTextFile (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Save this RDD as a compressed text file, using string representations of elements.
   * @param path (undocumented)
   * @param codec (undocumented)
   */
  public  void saveAsTextFile (java.lang.String path, java.lang.Class<? extends org.apache.hadoop.io.compress.CompressionCodec> codec)  { throw new RuntimeException(); }
  /**
   * Save this RDD as a SequenceFile of serialized objects.
   * @param path (undocumented)
   */
  public  void saveAsObjectFile (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Creates tuples of the elements in this RDD by applying <code>f</code>.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, T>> keyBy (scala.Function1<T, K> f)  { throw new RuntimeException(); }
  /** A private method for tests, to look at the contents of each partition */
    java.lang.Object[] collectPartitions ()  { throw new RuntimeException(); }
  /**
   * Mark this RDD for checkpointing. It will be saved to a file inside the checkpoint
   * directory set with <code>SparkContext#setCheckpointDir</code> and all references to its parent
   * RDDs will be removed. This function must be called before any job has been
   * executed on this RDD. It is strongly recommended that this RDD is persisted in
   * memory, otherwise saving it on a file will require recomputation.
   */
  public  void checkpoint ()  { throw new RuntimeException(); }
  /**
   * Mark this RDD for local checkpointing using Spark's existing caching layer.
   * <p>
   * This method is for users who wish to truncate RDD lineages while skipping the expensive
   * step of replicating the materialized data in a reliable distributed file system. This is
   * useful for RDDs with long lineages that need to be truncated periodically (e.g. GraphX).
   * <p>
   * Local checkpointing sacrifices fault-tolerance for performance. In particular, checkpointed
   * data is written to ephemeral local storage in the executors instead of to a reliable,
   * fault-tolerant storage. The effect is that if an executor fails during the computation,
   * the checkpointed data may no longer be accessible, causing an irrecoverable job failure.
   * <p>
   * This is NOT safe to use with dynamic allocation, which removes executors along
   * with their cached blocks. If you must use both features, you are advised to set
   * <code>spark.dynamicAllocation.cachedExecutorIdleTimeout</code> to a high value.
   * <p>
   * The checkpoint directory set through <code>SparkContext#setCheckpointDir</code> is not used.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> localCheckpoint ()  { throw new RuntimeException(); }
  /**
   * Return whether this RDD is checkpointed and materialized, either reliably or locally.
   * @return (undocumented)
   */
  public  boolean isCheckpointed ()  { throw new RuntimeException(); }
  /**
   * Return whether this RDD is checkpointed and materialized, either reliably or locally.
   * This is introduced as an alias for <code>isCheckpointed</code> to clarify the semantics of the
   * return value. Exposed for testing.
   * @return (undocumented)
   */
    boolean isCheckpointedAndMaterialized ()  { throw new RuntimeException(); }
  /**
   * Return whether this RDD is marked for local checkpointing.
   * Exposed for testing.
   * @return (undocumented)
   */
    boolean isLocallyCheckpointed ()  { throw new RuntimeException(); }
  /**
   * Gets the name of the directory to which this RDD was checkpointed.
   * This is not defined if the RDD is checkpointed locally.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> getCheckpointFile ()  { throw new RuntimeException(); }
  private  org.apache.spark.storage.StorageLevel storageLevel ()  { throw new RuntimeException(); }
  /** User code that created this RDD (e.g. `textFile`, `parallelize`). */
    org.apache.spark.util.CallSite creationSite ()  { throw new RuntimeException(); }
  /**
   * The scope associated with the operation that created this RDD.
   * <p>
   * This is more flexible than the call site and can be defined hierarchically. For more
   * detail, see the documentation of {{RDDOperationScope}}. This scope is not defined if the
   * user instantiates this RDD himself without using any Spark operations.
   * @return (undocumented)
   */
    scala.Option<org.apache.spark.rdd.RDDOperationScope> scope ()  { throw new RuntimeException(); }
    java.lang.String getCreationSite ()  { throw new RuntimeException(); }
    scala.reflect.ClassTag<T> elementClassTag ()  { throw new RuntimeException(); }
    scala.Option<org.apache.spark.rdd.RDDCheckpointData<T>> checkpointData ()  { throw new RuntimeException(); }
  private  boolean checkpointAllMarkedAncestors ()  { throw new RuntimeException(); }
  /** Returns the first parent RDD */
  protected <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> firstParent (scala.reflect.ClassTag<U> evidence$32)  { throw new RuntimeException(); }
  /** Returns the jth parent RDD: e.g. rdd.parent[T](0) is equivalent to rdd.firstParent[T] */
  protected <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> parent (int j, scala.reflect.ClassTag<U> evidence$33)  { throw new RuntimeException(); }
  /** The {@link org.apache.spark.SparkContext} that this RDD was created on. */
  public  org.apache.spark.SparkContext context ()  { throw new RuntimeException(); }
  /**
   * Private API for changing an RDD's ClassTag.
   * Used for internal Java-Scala API compatibility.
   * @param cls (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.rdd.RDD<T> retag (java.lang.Class<T> cls)  { throw new RuntimeException(); }
  /**
   * Private API for changing an RDD's ClassTag.
   * Used for internal Java-Scala API compatibility.
   * @param classTag (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.rdd.RDD<T> retag (scala.reflect.ClassTag<T> classTag)  { throw new RuntimeException(); }
  private  boolean doCheckpointCalled ()  { throw new RuntimeException(); }
  /**
   * Performs the checkpointing of this RDD by saving this. It is called after a job using this RDD
   * has completed (therefore the RDD has been materialized and potentially stored in memory).
   * doCheckpoint() is called recursively on the parent RDDs.
   */
    void doCheckpoint ()  { throw new RuntimeException(); }
  /**
   * Changes the dependencies of this RDD from its original parents to a new RDD (<code>newRDD</code>)
   * created from the checkpoint file, and forget its old dependencies and partitions.
   */
    void markCheckpointed ()  { throw new RuntimeException(); }
  /**
   * Clears the dependencies of this RDD. This method must ensure that all references
   * to the original parent RDDs are removed to enable the parent RDDs to be garbage
   * collected. Subclasses of RDD may override this method for implementing their own cleaning
   * logic. See {@link org.apache.spark.rdd.UnionRDD} for an example.
   */
  protected  void clearDependencies ()  { throw new RuntimeException(); }
  /** A description of this RDD and its recursive dependencies for debugging. */
  public  java.lang.String toDebugString ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<T> toJavaRDD ()  { throw new RuntimeException(); }
}
