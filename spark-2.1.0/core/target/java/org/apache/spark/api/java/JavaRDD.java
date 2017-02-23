package org.apache.spark.api.java;
public  class JavaRDD<T extends java.lang.Object> extends org.apache.spark.api.java.AbstractJavaRDDLike<T, org.apache.spark.api.java.JavaRDD<T>> {
  static public <T extends java.lang.Object> org.apache.spark.api.java.JavaRDD<T> fromRDD (org.apache.spark.rdd.RDD<T> rdd, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.apache.spark.rdd.RDD<T> toRDD (org.apache.spark.api.java.JavaRDD<T> rdd)  { throw new RuntimeException(); }
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
  static public  T first ()  { throw new RuntimeException(); }
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
  static public  T max (java.util.Comparator<T> comp)  { throw new RuntimeException(); }
  static public  T min (java.util.Comparator<T> comp)  { throw new RuntimeException(); }
  static public  java.util.List<T> takeOrdered (int num)  { throw new RuntimeException(); }
  static public  long countApproxDistinct (double relativeSD)  { throw new RuntimeException(); }
  static public  java.lang.String name ()  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaFutureAction<java.lang.Long> countAsync ()  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaFutureAction<java.util.List<T>> collectAsync ()  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaFutureAction<java.util.List<T>> takeAsync (int num)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaFutureAction<java.lang.Void> foreachAsync (org.apache.spark.api.java.function.VoidFunction<T> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaFutureAction<java.lang.Void> foreachPartitionAsync (org.apache.spark.api.java.function.VoidFunction<java.util.Iterator<T>> f)  { throw new RuntimeException(); }
  static public <R extends java.lang.Object> boolean mapPartitionsWithIndex$default$2 ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<T> rdd ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<T> classTag ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaRDD (org.apache.spark.rdd.RDD<T> rdd, scala.reflect.ClassTag<T> classTag)  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<T> wrapRDD (org.apache.spark.rdd.RDD<T> rdd)  { throw new RuntimeException(); }
  /**
   * Persist this RDD with the default storage level (<code>MEMORY_ONLY</code>).
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> cache ()  { throw new RuntimeException(); }
  /**
   * Set this RDD's storage level to persist its values across operations after the first time
   * it is computed. This can only be used to assign a new storage level if the RDD does not
   * have a storage level set yet..
   * @param newLevel (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> persist (org.apache.spark.storage.StorageLevel newLevel)  { throw new RuntimeException(); }
  /**
   * Mark the RDD as non-persistent, and remove all blocks for it from memory and disk.
   * This method blocks until all blocks are deleted.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> unpersist ()  { throw new RuntimeException(); }
  /**
   * Mark the RDD as non-persistent, and remove all blocks for it from memory and disk.
   * <p>
   * @param blocking Whether to block until all blocks are deleted.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> unpersist (boolean blocking)  { throw new RuntimeException(); }
  /**
   * Return a new RDD containing the distinct elements in this RDD.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> distinct ()  { throw new RuntimeException(); }
  /**
   * Return a new RDD containing the distinct elements in this RDD.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> distinct (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new RDD containing only the elements that satisfy a predicate.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> filter (org.apache.spark.api.java.function.Function<T, java.lang.Boolean> f)  { throw new RuntimeException(); }
  /**
   * Return a new RDD that is reduced into <code>numPartitions</code> partitions.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> coalesce (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new RDD that is reduced into <code>numPartitions</code> partitions.
   * @param numPartitions (undocumented)
   * @param shuffle (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> coalesce (int numPartitions, boolean shuffle)  { throw new RuntimeException(); }
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
  public  org.apache.spark.api.java.JavaRDD<T> repartition (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a sampled subset of this RDD with a random seed.
   * <p>
   * @param withReplacement can elements be sampled multiple times (replaced when sampled out)
   * @param fraction expected size of the sample as a fraction of this RDD's size
   *  without replacement: probability that each element is chosen; fraction must be [0, 1]
   *  with replacement: expected number of times each element is chosen; fraction must be greater
   *  than or equal to 0
   * <p>
   * @note This is NOT guaranteed to provide exactly the fraction of the count
   * of the given <code>RDD</code>.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> sample (boolean withReplacement, double fraction)  { throw new RuntimeException(); }
  /**
   * Return a sampled subset of this RDD, with a user-supplied seed.
   * <p>
   * @param withReplacement can elements be sampled multiple times (replaced when sampled out)
   * @param fraction expected size of the sample as a fraction of this RDD's size
   *  without replacement: probability that each element is chosen; fraction must be [0, 1]
   *  with replacement: expected number of times each element is chosen; fraction must be greater
   *  than or equal to 0
   * @param seed seed for the random number generator
   * <p>
   * @note This is NOT guaranteed to provide exactly the fraction of the count
   * of the given <code>RDD</code>.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> sample (boolean withReplacement, double fraction, long seed)  { throw new RuntimeException(); }
  /**
   * Randomly splits this RDD with the provided weights.
   * <p>
   * @param weights weights for splits, will be normalized if they don't sum to 1
   * <p>
   * @return split RDDs in an array
   */
  public  org.apache.spark.api.java.JavaRDD<T>[] randomSplit (double[] weights)  { throw new RuntimeException(); }
  /**
   * Randomly splits this RDD with the provided weights.
   * <p>
   * @param weights weights for splits, will be normalized if they don't sum to 1
   * @param seed random seed
   * <p>
   * @return split RDDs in an array
   */
  public  org.apache.spark.api.java.JavaRDD<T>[] randomSplit (double[] weights, long seed)  { throw new RuntimeException(); }
  /**
   * Return the union of this RDD and another one. Any identical elements will appear multiple
   * times (use <code>.distinct()</code> to eliminate them).
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> union (org.apache.spark.api.java.JavaRDD<T> other)  { throw new RuntimeException(); }
  /**
   * Return the intersection of this RDD and another one. The output will not contain any duplicate
   * elements, even if the input RDDs did.
   * <p>
   * @note This method performs a shuffle internally.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> intersection (org.apache.spark.api.java.JavaRDD<T> other)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the elements from <code>this</code> that are not in <code>other</code>.
   * <p>
   * Uses <code>this</code> partitioner/partition size, because even if <code>other</code> is huge, the resulting
   * RDD will be less than or equal to us.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> subtract (org.apache.spark.api.java.JavaRDD<T> other)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the elements from <code>this</code> that are not in <code>other</code>.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> subtract (org.apache.spark.api.java.JavaRDD<T> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the elements from <code>this</code> that are not in <code>other</code>.
   * @param other (undocumented)
   * @param p (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> subtract (org.apache.spark.api.java.JavaRDD<T> other, org.apache.spark.Partitioner p)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /** Assign a name to this RDD */
  public  org.apache.spark.api.java.JavaRDD<T> setName (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Return this RDD sorted by the given key function.
   * @param f (undocumented)
   * @param ascending (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <S extends java.lang.Object> org.apache.spark.api.java.JavaRDD<T> sortBy (org.apache.spark.api.java.function.Function<T, S> f, boolean ascending, int numPartitions)  { throw new RuntimeException(); }
}
