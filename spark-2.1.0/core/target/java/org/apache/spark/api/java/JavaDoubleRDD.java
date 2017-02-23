package org.apache.spark.api.java;
public  class JavaDoubleRDD extends org.apache.spark.api.java.AbstractJavaRDDLike<java.lang.Double, org.apache.spark.api.java.JavaDoubleRDD> {
  static public  org.apache.spark.api.java.JavaDoubleRDD fromRDD (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.Object> toRDD (org.apache.spark.api.java.JavaDoubleRDD rdd)  { throw new RuntimeException(); }
  static public  java.util.List<org.apache.spark.Partition> partitions ()  { throw new RuntimeException(); }
  static public  int getNumPartitions ()  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.Optional<org.apache.spark.Partitioner> partitioner ()  { throw new RuntimeException(); }
  static public  org.apache.spark.SparkContext context ()  { throw new RuntimeException(); }
  static public  int id ()  { throw new RuntimeException(); }
  static public  org.apache.spark.storage.StorageLevel getStorageLevel ()  { throw new RuntimeException(); }
  static public  java.util.Iterator<T> iterator (org.apache.spark.Partition split, org.apache.spark.TaskContext taskContext)  { throw new RuntimeException(); }
  static public <R extends java.lang.Object> org.apache.spark.api.java.JavaRDD<R> map (org.apache.spark.api.java.function.Function<T, R> f)  { throw new RuntimeException(); }
  static public <R extends java.lang.Object> org.apache.spark.api.java.JavaRDD<R> mapPartitionsWithIndex (org.apache.spark.api.java.function.Function2<java.lang.Integer, java.util.Iterator<T>, java.util.Iterator<R>> f, boolean preservesPartitioning)  { throw new RuntimeException(); }
  static public <R extends java.lang.Object> org.apache.spark.api.java.JavaDoubleRDD mapToDouble (org.apache.spark.api.java.function.DoubleFunction<T> f)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K2, V2> mapToPair (org.apache.spark.api.java.function.PairFunction<T, K2, V2> f)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.api.java.JavaRDD<U> flatMap (org.apache.spark.api.java.function.FlatMapFunction<T, U> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaDoubleRDD flatMapToDouble (org.apache.spark.api.java.function.DoubleFlatMapFunction<T> f)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K2, V2> flatMapToPair (org.apache.spark.api.java.function.PairFlatMapFunction<T, K2, V2> f)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.api.java.JavaRDD<U> mapPartitions (org.apache.spark.api.java.function.FlatMapFunction<java.util.Iterator<T>, U> f)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.api.java.JavaRDD<U> mapPartitions (org.apache.spark.api.java.function.FlatMapFunction<java.util.Iterator<T>, U> f, boolean preservesPartitioning)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaDoubleRDD mapPartitionsToDouble (org.apache.spark.api.java.function.DoubleFlatMapFunction<java.util.Iterator<T>> f)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K2, V2> mapPartitionsToPair (org.apache.spark.api.java.function.PairFlatMapFunction<java.util.Iterator<T>, K2, V2> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaDoubleRDD mapPartitionsToDouble (org.apache.spark.api.java.function.DoubleFlatMapFunction<java.util.Iterator<T>> f, boolean preservesPartitioning)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K2, V2> mapPartitionsToPair (org.apache.spark.api.java.function.PairFlatMapFunction<java.util.Iterator<T>, K2, V2> f, boolean preservesPartitioning)  { throw new RuntimeException(); }
  static public  void foreachPartition (org.apache.spark.api.java.function.VoidFunction<java.util.Iterator<T>> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<java.util.List<T>> glom ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<T, U> cartesian (org.apache.spark.api.java.JavaRDDLike<U, ?> other)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<U, java.lang.Iterable<T>> groupBy (org.apache.spark.api.java.function.Function<T, U> f)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<U, java.lang.Iterable<T>> groupBy (org.apache.spark.api.java.function.Function<T, U> f, int numPartitions)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<java.lang.String> pipe (java.lang.String command)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<java.lang.String> pipe (java.util.List<java.lang.String> command)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<java.lang.String> pipe (java.util.List<java.lang.String> command, java.util.Map<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<java.lang.String> pipe (java.util.List<java.lang.String> command, java.util.Map<java.lang.String, java.lang.String> env, boolean separateWorkingDir, int bufferSize)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<java.lang.String> pipe (java.util.List<java.lang.String> command, java.util.Map<java.lang.String, java.lang.String> env, boolean separateWorkingDir, int bufferSize, java.lang.String encoding)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<T, U> zip (org.apache.spark.api.java.JavaRDDLike<U, ?> other)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, V extends java.lang.Object> org.apache.spark.api.java.JavaRDD<V> zipPartitions (org.apache.spark.api.java.JavaRDDLike<U, ?> other, org.apache.spark.api.java.function.FlatMapFunction2<java.util.Iterator<T>, java.util.Iterator<U>, V> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaPairRDD<T, java.lang.Long> zipWithUniqueId ()  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaPairRDD<T, java.lang.Long> zipWithIndex ()  { throw new RuntimeException(); }
  static public  void foreach (org.apache.spark.api.java.function.VoidFunction<T> f)  { throw new RuntimeException(); }
  static public  java.util.List<T> collect ()  { throw new RuntimeException(); }
  static public  java.util.Iterator<T> toLocalIterator ()  { throw new RuntimeException(); }
  static public  java.util.List<T>[] collectPartitions (int[] partitionIds)  { throw new RuntimeException(); }
  static public  T reduce (org.apache.spark.api.java.function.Function2<T, T, T> f)  { throw new RuntimeException(); }
  static public  T treeReduce (org.apache.spark.api.java.function.Function2<T, T, T> f, int depth)  { throw new RuntimeException(); }
  static public  T treeReduce (org.apache.spark.api.java.function.Function2<T, T, T> f)  { throw new RuntimeException(); }
  static public  T fold (T zeroValue, org.apache.spark.api.java.function.Function2<T, T, T> f)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> U aggregate (U zeroValue, org.apache.spark.api.java.function.Function2<U, T, U> seqOp, org.apache.spark.api.java.function.Function2<U, U, U> combOp)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> U treeAggregate (U zeroValue, org.apache.spark.api.java.function.Function2<U, T, U> seqOp, org.apache.spark.api.java.function.Function2<U, U, U> combOp, int depth)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> U treeAggregate (U zeroValue, org.apache.spark.api.java.function.Function2<U, T, U> seqOp, org.apache.spark.api.java.function.Function2<U, U, U> combOp)  { throw new RuntimeException(); }
  static public  long count ()  { throw new RuntimeException(); }
  static public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> countApprox (long timeout, double confidence)  { throw new RuntimeException(); }
  static public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> countApprox (long timeout)  { throw new RuntimeException(); }
  static public  java.util.Map<T, java.lang.Long> countByValue ()  { throw new RuntimeException(); }
  static public  org.apache.spark.partial.PartialResult<java.util.Map<T, org.apache.spark.partial.BoundedDouble>> countByValueApprox (long timeout, double confidence)  { throw new RuntimeException(); }
  static public  org.apache.spark.partial.PartialResult<java.util.Map<T, org.apache.spark.partial.BoundedDouble>> countByValueApprox (long timeout)  { throw new RuntimeException(); }
  static public  java.util.List<T> take (int num)  { throw new RuntimeException(); }
  static public  java.util.List<T> takeSample (boolean withReplacement, int num)  { throw new RuntimeException(); }
  static public  java.util.List<T> takeSample (boolean withReplacement, int num, long seed)  { throw new RuntimeException(); }
  static public  boolean isEmpty ()  { throw new RuntimeException(); }
  static public  void saveAsTextFile (java.lang.String path)  { throw new RuntimeException(); }
  static public  void saveAsTextFile (java.lang.String path, java.lang.Class<? extends org.apache.hadoop.io.compress.CompressionCodec> codec)  { throw new RuntimeException(); }
  static public  void saveAsObjectFile (java.lang.String path)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<U, T> keyBy (org.apache.spark.api.java.function.Function<T, U> f)  { throw new RuntimeException(); }
  static public  void checkpoint ()  { throw new RuntimeException(); }
  static public  boolean isCheckpointed ()  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.Optional<java.lang.String> getCheckpointFile ()  { throw new RuntimeException(); }
  static public  java.lang.String toDebugString ()  { throw new RuntimeException(); }
  static public  java.util.List<T> top (int num, java.util.Comparator<T> comp)  { throw new RuntimeException(); }
  static public  java.util.List<T> top (int num)  { throw new RuntimeException(); }
  static public  java.util.List<T> takeOrdered (int num, java.util.Comparator<T> comp)  { throw new RuntimeException(); }
  static public  java.util.List<T> takeOrdered (int num)  { throw new RuntimeException(); }
  static public  long countApproxDistinct (double relativeSD)  { throw new RuntimeException(); }
  static public  java.lang.String name ()  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaFutureAction<java.lang.Long> countAsync ()  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaFutureAction<java.util.List<T>> collectAsync ()  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaFutureAction<java.util.List<T>> takeAsync (int num)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaFutureAction<java.lang.Void> foreachAsync (org.apache.spark.api.java.function.VoidFunction<T> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaFutureAction<java.lang.Void> foreachPartitionAsync (org.apache.spark.api.java.function.VoidFunction<java.util.Iterator<T>> f)  { throw new RuntimeException(); }
  static public <R extends java.lang.Object> boolean mapPartitionsWithIndex$default$2 ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<java.lang.Object> srdd ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaDoubleRDD (org.apache.spark.rdd.RDD<java.lang.Object> srdd)  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<java.lang.Double> classTag ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<java.lang.Double> rdd ()  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaDoubleRDD wrapRDD (org.apache.spark.rdd.RDD<java.lang.Double> rdd)  { throw new RuntimeException(); }
  /**
   * Persist this RDD with the default storage level (<code>MEMORY_ONLY</code>).
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD cache ()  { throw new RuntimeException(); }
  /**
   * Set this RDD's storage level to persist its values across operations after the first time
   * it is computed. Can only be called once on each RDD.
   * @param newLevel (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD persist (org.apache.spark.storage.StorageLevel newLevel)  { throw new RuntimeException(); }
  /**
   * Mark the RDD as non-persistent, and remove all blocks for it from memory and disk.
   * This method blocks until all blocks are deleted.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD unpersist ()  { throw new RuntimeException(); }
  /**
   * Mark the RDD as non-persistent, and remove all blocks for it from memory and disk.
   * <p>
   * @param blocking Whether to block until all blocks are deleted.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD unpersist (boolean blocking)  { throw new RuntimeException(); }
  public  java.lang.Double first ()  { throw new RuntimeException(); }
  /**
   * Return a new RDD containing the distinct elements in this RDD.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD distinct ()  { throw new RuntimeException(); }
  /**
   * Return a new RDD containing the distinct elements in this RDD.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD distinct (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new RDD containing only the elements that satisfy a predicate.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD filter (org.apache.spark.api.java.function.Function<java.lang.Double, java.lang.Boolean> f)  { throw new RuntimeException(); }
  /**
   * Return a new RDD that is reduced into <code>numPartitions</code> partitions.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD coalesce (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new RDD that is reduced into <code>numPartitions</code> partitions.
   * @param numPartitions (undocumented)
   * @param shuffle (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD coalesce (int numPartitions, boolean shuffle)  { throw new RuntimeException(); }
  /**
   * Return a new RDD that has exactly numPartitions partitions.
   * <p>
   * Can increase or decrease the level of parallelism in this RDD. Internally, this uses
   * a shuffle to redistribute data.
   * <p>
   * If you are decreasing the number of partitions in this RDD, consider using <code>coalesce</code>,
   * which can avoid performing a shuffle.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD repartition (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the elements from <code>this</code> that are not in <code>other</code>.
   * <p>
   * Uses <code>this</code> partitioner/partition size, because even if <code>other</code> is huge, the resulting
   * RDD will be &amp;lt;= us.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD subtract (org.apache.spark.api.java.JavaDoubleRDD other)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the elements from <code>this</code> that are not in <code>other</code>.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD subtract (org.apache.spark.api.java.JavaDoubleRDD other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the elements from <code>this</code> that are not in <code>other</code>.
   * @param other (undocumented)
   * @param p (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD subtract (org.apache.spark.api.java.JavaDoubleRDD other, org.apache.spark.Partitioner p)  { throw new RuntimeException(); }
  /**
   * Return a sampled subset of this RDD.
   * @param withReplacement (undocumented)
   * @param fraction (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD sample (boolean withReplacement, java.lang.Double fraction)  { throw new RuntimeException(); }
  /**
   * Return a sampled subset of this RDD.
   * @param withReplacement (undocumented)
   * @param fraction (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD sample (boolean withReplacement, java.lang.Double fraction, long seed)  { throw new RuntimeException(); }
  /**
   * Return the union of this RDD and another one. Any identical elements will appear multiple
   * times (use <code>.distinct()</code> to eliminate them).
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD union (org.apache.spark.api.java.JavaDoubleRDD other)  { throw new RuntimeException(); }
  /**
   * Return the intersection of this RDD and another one. The output will not contain any duplicate
   * elements, even if the input RDDs did.
   * <p>
   * @note This method performs a shuffle internally.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaDoubleRDD intersection (org.apache.spark.api.java.JavaDoubleRDD other)  { throw new RuntimeException(); }
  /** Add up the elements in this RDD. */
  public  java.lang.Double sum ()  { throw new RuntimeException(); }
  /**
   * Returns the minimum element from this RDD as defined by
   * the default comparator natural order.
   * @return the minimum of the RDD
   */
  public  java.lang.Double min ()  { throw new RuntimeException(); }
  /**
   * Returns the maximum element from this RDD as defined by
   * the default comparator natural order.
   * @return the maximum of the RDD
   */
  public  java.lang.Double max ()  { throw new RuntimeException(); }
  /**
   * Return a {@link org.apache.spark.util.StatCounter} object that captures the mean, variance and
   * count of the RDD's elements in one operation.
   * @return (undocumented)
   */
  public  org.apache.spark.util.StatCounter stats ()  { throw new RuntimeException(); }
  /** Compute the mean of this RDD's elements. */
  public  java.lang.Double mean ()  { throw new RuntimeException(); }
  /** Compute the population variance of this RDD's elements. */
  public  java.lang.Double variance ()  { throw new RuntimeException(); }
  /** Compute the population standard deviation of this RDD's elements. */
  public  java.lang.Double stdev ()  { throw new RuntimeException(); }
  /**
   * Compute the sample standard deviation of this RDD's elements (which corrects for bias in
   * estimating the standard deviation by dividing by N-1 instead of N).
   * @return (undocumented)
   */
  public  java.lang.Double sampleStdev ()  { throw new RuntimeException(); }
  /**
   * Compute the sample variance of this RDD's elements (which corrects for bias in
   * estimating the standard variance by dividing by N-1 instead of N).
   * @return (undocumented)
   */
  public  java.lang.Double sampleVariance ()  { throw new RuntimeException(); }
  /**
   * Compute the population standard deviation of this RDD's elements.
   * @return (undocumented)
   */
  public  java.lang.Double popStdev ()  { throw new RuntimeException(); }
  /**
   * Compute the population variance of this RDD's elements.
   * @return (undocumented)
   */
  public  java.lang.Double popVariance ()  { throw new RuntimeException(); }
  /** Return the approximate mean of the elements in this RDD. */
  public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> meanApprox (long timeout, java.lang.Double confidence)  { throw new RuntimeException(); }
  /**
   * Approximate operation to return the mean within a timeout.
   * @param timeout (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> meanApprox (long timeout)  { throw new RuntimeException(); }
  /**
   * Approximate operation to return the sum within a timeout.
   * @param timeout (undocumented)
   * @param confidence (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> sumApprox (long timeout, java.lang.Double confidence)  { throw new RuntimeException(); }
  /**
   * Approximate operation to return the sum within a timeout.
   * @param timeout (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> sumApprox (long timeout)  { throw new RuntimeException(); }
  /**
   * Compute a histogram of the data using bucketCount number of buckets evenly
   *  spaced between the minimum and maximum of the RDD. For example if the min
   *  value is 0 and the max is 100 and there are two buckets the resulting
   *  buckets will be [0,50) [50,100]. bucketCount must be at least 1
   * If the RDD contains infinity, NaN throws an exception
   * If the elements in RDD do not vary (max == min) always returns a single bucket.
   * @param bucketCount (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple2<double[], long[]> histogram (int bucketCount)  { throw new RuntimeException(); }
  /**
   * Compute a histogram using the provided buckets. The buckets are all open
   * to the left except for the last which is closed
   *  e.g. for the array
   *  [1,10,20,50] the buckets are [1,10) [10,20) [20,50]
   *  e.g 1&amp;lt;=x&amp;lt;10 , 10&amp;lt;=x&amp;lt;20, 20&amp;lt;=x&amp;lt;50
   *  And on the input of 1 and 50 we would have a histogram of 1,0,0
   * <p>
   * @note If your histogram is evenly spaced (e.g. [0, 10, 20, 30]) this can be switched
   * from an O(log n) insertion to O(1) per element. (where n = # buckets) if you set evenBuckets
   * to true.
   * buckets must be sorted and not contain any duplicates.
   * buckets array must be at least two elements
   * All NaN entries are treated the same. If you have a NaN bucket it must be
   * the maximum value of the last position and all NaN entries will be counted
   * in that bucket.
   * @param buckets (undocumented)
   * @return (undocumented)
   */
  public  long[] histogram (double[] buckets)  { throw new RuntimeException(); }
  public  long[] histogram (java.lang.Double[] buckets, boolean evenBuckets)  { throw new RuntimeException(); }
  /** Assign a name to this RDD */
  public  org.apache.spark.api.java.JavaDoubleRDD setName (java.lang.String name)  { throw new RuntimeException(); }
}
