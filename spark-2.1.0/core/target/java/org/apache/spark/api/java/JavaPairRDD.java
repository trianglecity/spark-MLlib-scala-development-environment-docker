package org.apache.spark.api.java;
public  class JavaPairRDD<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.api.java.AbstractJavaRDDLike<scala.Tuple2<K, V>, org.apache.spark.api.java.JavaPairRDD<K, V>> {
  static  <K extends java.lang.Object, T extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, java.lang.Iterable<T>>> groupByResultToJava (org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<T>>> rdd, scala.reflect.ClassTag<K> evidence$1)  { throw new RuntimeException(); }
  static  <K extends java.lang.Object, V extends java.lang.Object, W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<java.lang.Iterable<V>, java.lang.Iterable<W>>>> cogroupResultToJava (org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<scala.collection.Iterable<V>, scala.collection.Iterable<W>>>> rdd, scala.reflect.ClassTag<K> evidence$2)  { throw new RuntimeException(); }
  static  <K extends java.lang.Object, V extends java.lang.Object, W1 extends java.lang.Object, W2 extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple3<java.lang.Iterable<V>, java.lang.Iterable<W1>, java.lang.Iterable<W2>>>> cogroupResult2ToJava (org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple3<scala.collection.Iterable<V>, scala.collection.Iterable<W1>, scala.collection.Iterable<W2>>>> rdd, scala.reflect.ClassTag<K> evidence$3)  { throw new RuntimeException(); }
  static  <K extends java.lang.Object, V extends java.lang.Object, W1 extends java.lang.Object, W2 extends java.lang.Object, W3 extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple4<java.lang.Iterable<V>, java.lang.Iterable<W1>, java.lang.Iterable<W2>, java.lang.Iterable<W3>>>> cogroupResult3ToJava (org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple4<scala.collection.Iterable<V>, scala.collection.Iterable<W1>, scala.collection.Iterable<W2>, scala.collection.Iterable<W3>>>> rdd, scala.reflect.ClassTag<K> evidence$4)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, V> fromRDD (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, scala.reflect.ClassTag<K> evidence$5, scala.reflect.ClassTag<V> evidence$6)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> toRDD (org.apache.spark.api.java.JavaPairRDD<K, V> rdd)  { throw new RuntimeException(); }
  static  <T1 extends java.lang.Object, T2 extends java.lang.Object, R extends java.lang.Object> scala.Function2<T1, T2, R> toScalaFunction2 (org.apache.spark.api.java.function.Function2<T1, T2, R> fun)  { throw new RuntimeException(); }
  static  <T extends java.lang.Object, R extends java.lang.Object> scala.Function1<T, R> toScalaFunction (org.apache.spark.api.java.function.Function<T, R> fun)  { throw new RuntimeException(); }
  static  <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object> scala.Function1<A, scala.Tuple2<B, C>> pairFunToScalaFun (org.apache.spark.api.java.function.PairFunction<A, B, C> x)  { throw new RuntimeException(); }
  /** Convert a JavaRDD of key-value pairs to JavaPairRDD. */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, V> fromJavaRDD (org.apache.spark.api.java.JavaRDD<scala.Tuple2<K, V>> rdd)  { throw new RuntimeException(); }
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
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<K> kClassTag ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<V> vClassTag ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaPairRDD (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, scala.reflect.ClassTag<K> kClassTag, scala.reflect.ClassTag<V> vClassTag)  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaPairRDD<K, V> wrapRDD (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd)  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<scala.Tuple2<K, V>> classTag ()  { throw new RuntimeException(); }
  /**
   * Persist this RDD with the default storage level (<code>MEMORY_ONLY</code>).
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> cache ()  { throw new RuntimeException(); }
  /**
   * Set this RDD's storage level to persist its values across operations after the first time
   * it is computed. Can only be called once on each RDD.
   * @param newLevel (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> persist (org.apache.spark.storage.StorageLevel newLevel)  { throw new RuntimeException(); }
  /**
   * Mark the RDD as non-persistent, and remove all blocks for it from memory and disk.
   * This method blocks until all blocks are deleted.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> unpersist ()  { throw new RuntimeException(); }
  /**
   * Mark the RDD as non-persistent, and remove all blocks for it from memory and disk.
   * <p>
   * @param blocking Whether to block until all blocks are deleted.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> unpersist (boolean blocking)  { throw new RuntimeException(); }
  /**
   * Return a new RDD containing the distinct elements in this RDD.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> distinct ()  { throw new RuntimeException(); }
  /**
   * Return a new RDD containing the distinct elements in this RDD.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> distinct (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new RDD containing only the elements that satisfy a predicate.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> filter (org.apache.spark.api.java.function.Function<scala.Tuple2<K, V>, java.lang.Boolean> f)  { throw new RuntimeException(); }
  /**
   * Return a new RDD that is reduced into <code>numPartitions</code> partitions.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> coalesce (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new RDD that is reduced into <code>numPartitions</code> partitions.
   * @param numPartitions (undocumented)
   * @param shuffle (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> coalesce (int numPartitions, boolean shuffle)  { throw new RuntimeException(); }
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
  public  org.apache.spark.api.java.JavaPairRDD<K, V> repartition (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a sampled subset of this RDD.
   * @param withReplacement (undocumented)
   * @param fraction (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> sample (boolean withReplacement, double fraction)  { throw new RuntimeException(); }
  /**
   * Return a sampled subset of this RDD.
   * @param withReplacement (undocumented)
   * @param fraction (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> sample (boolean withReplacement, double fraction, long seed)  { throw new RuntimeException(); }
  /**
   * Return a subset of this RDD sampled by key (via stratified sampling).
   * <p>
   * Create a sample of this RDD using variable sampling rates for different keys as specified by
   * <code>fractions</code>, a key to sampling rate map, via simple random sampling with one pass over the
   * RDD, to produce a sample of size that's approximately equal to the sum of
   * math.ceil(numItems * samplingRate) over all key values.
   * @param withReplacement (undocumented)
   * @param fractions (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> sampleByKey (boolean withReplacement, java.util.Map<K, java.lang.Double> fractions, long seed)  { throw new RuntimeException(); }
  /**
   * Return a subset of this RDD sampled by key (via stratified sampling).
   * <p>
   * Create a sample of this RDD using variable sampling rates for different keys as specified by
   * <code>fractions</code>, a key to sampling rate map, via simple random sampling with one pass over the
   * RDD, to produce a sample of size that's approximately equal to the sum of
   * math.ceil(numItems * samplingRate) over all key values.
   * <p>
   * Use Utils.random.nextLong as the default seed for the random number generator.
   * @param withReplacement (undocumented)
   * @param fractions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> sampleByKey (boolean withReplacement, java.util.Map<K, java.lang.Double> fractions)  { throw new RuntimeException(); }
  /**
   * Return a subset of this RDD sampled by key (via stratified sampling) containing exactly
   * math.ceil(numItems * samplingRate) for each stratum (group of pairs with the same key).
   * <p>
   * This method differs from {@link sampleByKey} in that we make additional passes over the RDD to
   * create a sample size that's exactly equal to the sum of math.ceil(numItems * samplingRate)
   * over all key values with a 99.99% confidence. When sampling without replacement, we need one
   * additional pass over the RDD to guarantee sample size; when sampling with replacement, we need
   * two additional passes.
   * @param withReplacement (undocumented)
   * @param fractions (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> sampleByKeyExact (boolean withReplacement, java.util.Map<K, java.lang.Double> fractions, long seed)  { throw new RuntimeException(); }
  /**
   * Return a subset of this RDD sampled by key (via stratified sampling) containing exactly
   * math.ceil(numItems * samplingRate) for each stratum (group of pairs with the same key).
   * <p>
   * This method differs from {@link sampleByKey} in that we make additional passes over the RDD to
   * create a sample size that's exactly equal to the sum of math.ceil(numItems * samplingRate)
   * over all key values with a 99.99% confidence. When sampling without replacement, we need one
   * additional pass over the RDD to guarantee sample size; when sampling with replacement, we need
   * two additional passes.
   * <p>
   * Use Utils.random.nextLong as the default seed for the random number generator.
   * @param withReplacement (undocumented)
   * @param fractions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> sampleByKeyExact (boolean withReplacement, java.util.Map<K, java.lang.Double> fractions)  { throw new RuntimeException(); }
  /**
   * Return the union of this RDD and another one. Any identical elements will appear multiple
   * times (use <code>.distinct()</code> to eliminate them).
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> union (org.apache.spark.api.java.JavaPairRDD<K, V> other)  { throw new RuntimeException(); }
  /**
   * Return the intersection of this RDD and another one. The output will not contain any duplicate
   * elements, even if the input RDDs did.
   * <p>
   * @note This method performs a shuffle internally.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> intersection (org.apache.spark.api.java.JavaPairRDD<K, V> other)  { throw new RuntimeException(); }
  public  scala.Tuple2<K, V> first ()  { throw new RuntimeException(); }
  /**
   * Generic function to combine the elements for each key using a custom set of aggregation
   * functions. Turns a JavaPairRDD[(K, V)] into a result of type JavaPairRDD[(K, C)], for a
   * "combined type" C.
   * <p>
   * Users provide three functions:
   * <p>
   *  - <code>createCombiner</code>, which turns a V into a C (e.g., creates a one-element list)
   *  - <code>mergeValue</code>, to merge a V into a C (e.g., adds it to the end of a list)
   *  - <code>mergeCombiners</code>, to combine two C's into a single one.
   * <p>
   * In addition, users can control the partitioning of the output RDD, the serializer that is use
   * for the shuffle, and whether to perform map-side aggregation (if a mapper can produce multiple
   * items with the same key).
   * <p>
   * @note V and C can be different -- for example, one might group an RDD of type (Int, Int) into
   * an RDD of type (Int, List[Int]).
   * @param createCombiner (undocumented)
   * @param mergeValue (undocumented)
   * @param mergeCombiners (undocumented)
   * @param partitioner (undocumented)
   * @param mapSideCombine (undocumented)
   * @param serializer (undocumented)
   * @return (undocumented)
   */
  public <C extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, C> combineByKey (org.apache.spark.api.java.function.Function<V, C> createCombiner, org.apache.spark.api.java.function.Function2<C, V, C> mergeValue, org.apache.spark.api.java.function.Function2<C, C, C> mergeCombiners, org.apache.spark.Partitioner partitioner, boolean mapSideCombine, org.apache.spark.serializer.Serializer serializer)  { throw new RuntimeException(); }
  /**
   * Generic function to combine the elements for each key using a custom set of aggregation
   * functions. Turns a JavaPairRDD[(K, V)] into a result of type JavaPairRDD[(K, C)], for a
   * "combined type" C.
   * <p>
   * Users provide three functions:
   * <p>
   *  - <code>createCombiner</code>, which turns a V into a C (e.g., creates a one-element list)
   *  - <code>mergeValue</code>, to merge a V into a C (e.g., adds it to the end of a list)
   *  - <code>mergeCombiners</code>, to combine two C's into a single one.
   * <p>
   * In addition, users can control the partitioning of the output RDD. This method automatically
   * uses map-side aggregation in shuffling the RDD.
   * <p>
   * @note V and C can be different -- for example, one might group an RDD of type (Int, Int) into
   * an RDD of type (Int, List[Int]).
   * @param createCombiner (undocumented)
   * @param mergeValue (undocumented)
   * @param mergeCombiners (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <C extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, C> combineByKey (org.apache.spark.api.java.function.Function<V, C> createCombiner, org.apache.spark.api.java.function.Function2<C, V, C> mergeValue, org.apache.spark.api.java.function.Function2<C, C, C> mergeCombiners, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Simplified version of combineByKey that hash-partitions the output RDD and uses map-side
   * aggregation.
   * @param createCombiner (undocumented)
   * @param mergeValue (undocumented)
   * @param mergeCombiners (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <C extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, C> combineByKey (org.apache.spark.api.java.function.Function<V, C> createCombiner, org.apache.spark.api.java.function.Function2<C, V, C> mergeValue, org.apache.spark.api.java.function.Function2<C, C, C> mergeCombiners, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Merge the values for each key using an associative and commutative reduce function. This will
   * also perform the merging locally on each mapper before sending results to a reducer, similarly
   * to a "combiner" in MapReduce.
   * @param partitioner (undocumented)
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> reduceByKey (org.apache.spark.Partitioner partitioner, org.apache.spark.api.java.function.Function2<V, V, V> func)  { throw new RuntimeException(); }
  /**
   * Merge the values for each key using an associative and commutative reduce function, but return
   * the result immediately to the master as a Map. This will also perform the merging locally on
   * each mapper before sending results to a reducer, similarly to a "combiner" in MapReduce.
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  java.util.Map<K, V> reduceByKeyLocally (org.apache.spark.api.java.function.Function2<V, V, V> func)  { throw new RuntimeException(); }
  /** Count the number of elements for each key, and return the result to the master as a Map. */
  public  java.util.Map<K, java.lang.Long> countByKey ()  { throw new RuntimeException(); }
  /**
   * Approximate version of countByKey that can return a partial result if it does
   * not finish within a timeout.
   * @param timeout (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.partial.PartialResult<java.util.Map<K, org.apache.spark.partial.BoundedDouble>> countByKeyApprox (long timeout)  { throw new RuntimeException(); }
  /**
   * Approximate version of countByKey that can return a partial result if it does
   * not finish within a timeout.
   * @param timeout (undocumented)
   * @param confidence (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.partial.PartialResult<java.util.Map<K, org.apache.spark.partial.BoundedDouble>> countByKeyApprox (long timeout, double confidence)  { throw new RuntimeException(); }
  /**
   * Aggregate the values of each key, using given combine functions and a neutral "zero value".
   * This function can return a different result type, U, than the type of the values in this RDD,
   * V. Thus, we need one operation for merging a V into a U and one operation for merging two U's,
   * as in scala.TraversableOnce. The former operation is used for merging values within a
   * partition, and the latter is used for merging values between partitions. To avoid memory
   * allocation, both of these functions are allowed to modify and return their first argument
   * instead of creating a new U.
   * @param zeroValue (undocumented)
   * @param partitioner (undocumented)
   * @param seqFunc (undocumented)
   * @param combFunc (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, U> aggregateByKey (U zeroValue, org.apache.spark.Partitioner partitioner, org.apache.spark.api.java.function.Function2<U, V, U> seqFunc, org.apache.spark.api.java.function.Function2<U, U, U> combFunc)  { throw new RuntimeException(); }
  /**
   * Aggregate the values of each key, using given combine functions and a neutral "zero value".
   * This function can return a different result type, U, than the type of the values in this RDD,
   * V. Thus, we need one operation for merging a V into a U and one operation for merging two U's,
   * as in scala.TraversableOnce. The former operation is used for merging values within a
   * partition, and the latter is used for merging values between partitions. To avoid memory
   * allocation, both of these functions are allowed to modify and return their first argument
   * instead of creating a new U.
   * @param zeroValue (undocumented)
   * @param numPartitions (undocumented)
   * @param seqFunc (undocumented)
   * @param combFunc (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, U> aggregateByKey (U zeroValue, int numPartitions, org.apache.spark.api.java.function.Function2<U, V, U> seqFunc, org.apache.spark.api.java.function.Function2<U, U, U> combFunc)  { throw new RuntimeException(); }
  /**
   * Aggregate the values of each key, using given combine functions and a neutral "zero value".
   * This function can return a different result type, U, than the type of the values in this RDD,
   * V. Thus, we need one operation for merging a V into a U and one operation for merging two U's.
   * The former operation is used for merging values within a partition, and the latter is used for
   * merging values between partitions. To avoid memory allocation, both of these functions are
   * allowed to modify and return their first argument instead of creating a new U.
   * @param zeroValue (undocumented)
   * @param seqFunc (undocumented)
   * @param combFunc (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, U> aggregateByKey (U zeroValue, org.apache.spark.api.java.function.Function2<U, V, U> seqFunc, org.apache.spark.api.java.function.Function2<U, U, U> combFunc)  { throw new RuntimeException(); }
  /**
   * Merge the values for each key using an associative function and a neutral "zero value" which
   * may be added to the result an arbitrary number of times, and must not change the result
   * (e.g ., Nil for list concatenation, 0 for addition, or 1 for multiplication.).
   * @param zeroValue (undocumented)
   * @param partitioner (undocumented)
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> foldByKey (V zeroValue, org.apache.spark.Partitioner partitioner, org.apache.spark.api.java.function.Function2<V, V, V> func)  { throw new RuntimeException(); }
  /**
   * Merge the values for each key using an associative function and a neutral "zero value" which
   * may be added to the result an arbitrary number of times, and must not change the result
   * (e.g ., Nil for list concatenation, 0 for addition, or 1 for multiplication.).
   * @param zeroValue (undocumented)
   * @param numPartitions (undocumented)
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> foldByKey (V zeroValue, int numPartitions, org.apache.spark.api.java.function.Function2<V, V, V> func)  { throw new RuntimeException(); }
  /**
   * Merge the values for each key using an associative function and a neutral "zero value"
   * which may be added to the result an arbitrary number of times, and must not change the result
   * (e.g., Nil for list concatenation, 0 for addition, or 1 for multiplication.).
   * @param zeroValue (undocumented)
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> foldByKey (V zeroValue, org.apache.spark.api.java.function.Function2<V, V, V> func)  { throw new RuntimeException(); }
  /**
   * Merge the values for each key using an associative and commutative reduce function. This will
   * also perform the merging locally on each mapper before sending results to a reducer, similarly
   * to a "combiner" in MapReduce. Output will be hash-partitioned with numPartitions partitions.
   * @param func (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> reduceByKey (org.apache.spark.api.java.function.Function2<V, V, V> func, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Group the values for each key in the RDD into a single sequence. Allows controlling the
   * partitioning of the resulting key-value pair RDD by passing a Partitioner.
   * <p>
   * @note If you are grouping in order to perform an aggregation (such as a sum or average) over
   * each key, using <code>JavaPairRDD.reduceByKey</code> or <code>JavaPairRDD.combineByKey</code>
   * will provide much better performance.
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, java.lang.Iterable<V>> groupByKey (org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Group the values for each key in the RDD into a single sequence. Hash-partitions the
   * resulting RDD with into <code>numPartitions</code> partitions.
   * <p>
   * @note If you are grouping in order to perform an aggregation (such as a sum or average) over
   * each key, using <code>JavaPairRDD.reduceByKey</code> or <code>JavaPairRDD.combineByKey</code>
   * will provide much better performance.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, java.lang.Iterable<V>> groupByKey (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the elements from <code>this</code> that are not in <code>other</code>.
   * <p>
   * Uses <code>this</code> partitioner/partition size, because even if <code>other</code> is huge, the resulting
   * RDD will be &amp;lt;= us.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> subtract (org.apache.spark.api.java.JavaPairRDD<K, V> other)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the elements from <code>this</code> that are not in <code>other</code>.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> subtract (org.apache.spark.api.java.JavaPairRDD<K, V> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the elements from <code>this</code> that are not in <code>other</code>.
   * @param other (undocumented)
   * @param p (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> subtract (org.apache.spark.api.java.JavaPairRDD<K, V> other, org.apache.spark.Partitioner p)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the pairs from <code>this</code> whose keys are not in <code>other</code>.
   * <p>
   * Uses <code>this</code> partitioner/partition size, because even if <code>other</code> is huge, the resulting
   * RDD will be &amp;lt;= us.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, V> subtractByKey (org.apache.spark.api.java.JavaPairRDD<K, W> other)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the pairs from <code>this</code> whose keys are not in <code>other</code>.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, V> subtractByKey (org.apache.spark.api.java.JavaPairRDD<K, W> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the pairs from <code>this</code> whose keys are not in <code>other</code>.
   * @param other (undocumented)
   * @param p (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, V> subtractByKey (org.apache.spark.api.java.JavaPairRDD<K, W> other, org.apache.spark.Partitioner p)  { throw new RuntimeException(); }
  /**
   * Return a copy of the RDD partitioned using the specified partitioner.
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> partitionBy (org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Return an RDD containing all pairs of elements with matching keys in <code>this</code> and <code>other</code>. Each
   * pair of elements will be returned as a (k, (v1, v2)) tuple, where (k, v1) is in <code>this</code> and
   * (k, v2) is in <code>other</code>. Uses the given Partitioner to partition the output RDD.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple2<V, W>> join (org.apache.spark.api.java.JavaPairRDD<K, W> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Perform a left outer join of <code>this</code> and <code>other</code>. For each element (k, v) in <code>this</code>, the
   * resulting RDD will either contain all pairs (k, (v, Some(w))) for w in <code>other</code>, or the
   * pair (k, (v, None)) if no elements in <code>other</code> have key k. Uses the given Partitioner to
   * partition the output RDD.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple2<V, org.apache.spark.api.java.Optional<W>>> leftOuterJoin (org.apache.spark.api.java.JavaPairRDD<K, W> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Perform a right outer join of <code>this</code> and <code>other</code>. For each element (k, w) in <code>other</code>, the
   * resulting RDD will either contain all pairs (k, (Some(v), w)) for v in <code>this</code>, or the
   * pair (k, (None, w)) if no elements in <code>this</code> have key k. Uses the given Partitioner to
   * partition the output RDD.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple2<org.apache.spark.api.java.Optional<V>, W>> rightOuterJoin (org.apache.spark.api.java.JavaPairRDD<K, W> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Perform a full outer join of <code>this</code> and <code>other</code>. For each element (k, v) in <code>this</code>, the
   * resulting RDD will either contain all pairs (k, (Some(v), Some(w))) for w in <code>other</code>, or
   * the pair (k, (Some(v), None)) if no elements in <code>other</code> have key k. Similarly, for each
   * element (k, w) in <code>other</code>, the resulting RDD will either contain all pairs
   * (k, (Some(v), Some(w))) for v in <code>this</code>, or the pair (k, (None, Some(w))) if no elements
   * in <code>this</code> have key k. Uses the given Partitioner to partition the output RDD.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple2<org.apache.spark.api.java.Optional<V>, org.apache.spark.api.java.Optional<W>>> fullOuterJoin (org.apache.spark.api.java.JavaPairRDD<K, W> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Simplified version of combineByKey that hash-partitions the resulting RDD using the existing
   * partitioner/parallelism level and using map-side aggregation.
   * @param createCombiner (undocumented)
   * @param mergeValue (undocumented)
   * @param mergeCombiners (undocumented)
   * @return (undocumented)
   */
  public <C extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, C> combineByKey (org.apache.spark.api.java.function.Function<V, C> createCombiner, org.apache.spark.api.java.function.Function2<C, V, C> mergeValue, org.apache.spark.api.java.function.Function2<C, C, C> mergeCombiners)  { throw new RuntimeException(); }
  /**
   * Merge the values for each key using an associative and commutative reduce function. This will
   * also perform the merging locally on each mapper before sending results to a reducer, similarly
   * to a "combiner" in MapReduce. Output will be hash-partitioned with the existing partitioner/
   * parallelism level.
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> reduceByKey (org.apache.spark.api.java.function.Function2<V, V, V> func)  { throw new RuntimeException(); }
  /**
   * Group the values for each key in the RDD into a single sequence. Hash-partitions the
   * resulting RDD with the existing partitioner/parallelism level.
   * <p>
   * @note If you are grouping in order to perform an aggregation (such as a sum or average) over
   * each key, using <code>JavaPairRDD.reduceByKey</code> or <code>JavaPairRDD.combineByKey</code>
   * will provide much better performance.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, java.lang.Iterable<V>> groupByKey ()  { throw new RuntimeException(); }
  /**
   * Return an RDD containing all pairs of elements with matching keys in <code>this</code> and <code>other</code>. Each
   * pair of elements will be returned as a (k, (v1, v2)) tuple, where (k, v1) is in <code>this</code> and
   * (k, v2) is in <code>other</code>. Performs a hash join across the cluster.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple2<V, W>> join (org.apache.spark.api.java.JavaPairRDD<K, W> other)  { throw new RuntimeException(); }
  /**
   * Return an RDD containing all pairs of elements with matching keys in <code>this</code> and <code>other</code>. Each
   * pair of elements will be returned as a (k, (v1, v2)) tuple, where (k, v1) is in <code>this</code> and
   * (k, v2) is in <code>other</code>. Performs a hash join across the cluster.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple2<V, W>> join (org.apache.spark.api.java.JavaPairRDD<K, W> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Perform a left outer join of <code>this</code> and <code>other</code>. For each element (k, v) in <code>this</code>, the
   * resulting RDD will either contain all pairs (k, (v, Some(w))) for w in <code>other</code>, or the
   * pair (k, (v, None)) if no elements in <code>other</code> have key k. Hash-partitions the output
   * using the existing partitioner/parallelism level.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple2<V, org.apache.spark.api.java.Optional<W>>> leftOuterJoin (org.apache.spark.api.java.JavaPairRDD<K, W> other)  { throw new RuntimeException(); }
  /**
   * Perform a left outer join of <code>this</code> and <code>other</code>. For each element (k, v) in <code>this</code>, the
   * resulting RDD will either contain all pairs (k, (v, Some(w))) for w in <code>other</code>, or the
   * pair (k, (v, None)) if no elements in <code>other</code> have key k. Hash-partitions the output
   * into <code>numPartitions</code> partitions.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple2<V, org.apache.spark.api.java.Optional<W>>> leftOuterJoin (org.apache.spark.api.java.JavaPairRDD<K, W> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Perform a right outer join of <code>this</code> and <code>other</code>. For each element (k, w) in <code>other</code>, the
   * resulting RDD will either contain all pairs (k, (Some(v), w)) for v in <code>this</code>, or the
   * pair (k, (None, w)) if no elements in <code>this</code> have key k. Hash-partitions the resulting
   * RDD using the existing partitioner/parallelism level.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple2<org.apache.spark.api.java.Optional<V>, W>> rightOuterJoin (org.apache.spark.api.java.JavaPairRDD<K, W> other)  { throw new RuntimeException(); }
  /**
   * Perform a right outer join of <code>this</code> and <code>other</code>. For each element (k, w) in <code>other</code>, the
   * resulting RDD will either contain all pairs (k, (Some(v), w)) for v in <code>this</code>, or the
   * pair (k, (None, w)) if no elements in <code>this</code> have key k. Hash-partitions the resulting
   * RDD into the given number of partitions.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple2<org.apache.spark.api.java.Optional<V>, W>> rightOuterJoin (org.apache.spark.api.java.JavaPairRDD<K, W> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Perform a full outer join of <code>this</code> and <code>other</code>. For each element (k, v) in <code>this</code>, the
   * resulting RDD will either contain all pairs (k, (Some(v), Some(w))) for w in <code>other</code>, or
   * the pair (k, (Some(v), None)) if no elements in <code>other</code> have key k. Similarly, for each
   * element (k, w) in <code>other</code>, the resulting RDD will either contain all pairs
   * (k, (Some(v), Some(w))) for v in <code>this</code>, or the pair (k, (None, Some(w))) if no elements
   * in <code>this</code> have key k. Hash-partitions the resulting RDD using the existing partitioner/
   * parallelism level.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple2<org.apache.spark.api.java.Optional<V>, org.apache.spark.api.java.Optional<W>>> fullOuterJoin (org.apache.spark.api.java.JavaPairRDD<K, W> other)  { throw new RuntimeException(); }
  /**
   * Perform a full outer join of <code>this</code> and <code>other</code>. For each element (k, v) in <code>this</code>, the
   * resulting RDD will either contain all pairs (k, (Some(v), Some(w))) for w in <code>other</code>, or
   * the pair (k, (Some(v), None)) if no elements in <code>other</code> have key k. Similarly, for each
   * element (k, w) in <code>other</code>, the resulting RDD will either contain all pairs
   * (k, (Some(v), Some(w))) for v in <code>this</code>, or the pair (k, (None, Some(w))) if no elements
   * in <code>this</code> have key k. Hash-partitions the resulting RDD into the given number of partitions.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple2<org.apache.spark.api.java.Optional<V>, org.apache.spark.api.java.Optional<W>>> fullOuterJoin (org.apache.spark.api.java.JavaPairRDD<K, W> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return the key-value pairs in this RDD to the master as a Map.
   * <p>
   * @note this method should only be used if the resulting data is expected to be small, as
   * all the data is loaded into the driver's memory.
   * @return (undocumented)
   */
  public  java.util.Map<K, V> collectAsMap ()  { throw new RuntimeException(); }
  /**
   * Pass each value in the key-value pair RDD through a map function without changing the keys;
   * this also retains the original RDD's partitioning.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, U> mapValues (org.apache.spark.api.java.function.Function<V, U> f)  { throw new RuntimeException(); }
  /**
   * Pass each value in the key-value pair RDD through a flatMap function without changing the
   * keys; this also retains the original RDD's partitioning.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, U> flatMapValues (org.apache.spark.api.java.function.Function<V, java.lang.Iterable<U>> f)  { throw new RuntimeException(); }
  /**
   * For each key k in <code>this</code> or <code>other</code>, return a resulting RDD that contains a tuple with the
   * list of values for that key in <code>this</code> as well as <code>other</code>.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple2<java.lang.Iterable<V>, java.lang.Iterable<W>>> cogroup (org.apache.spark.api.java.JavaPairRDD<K, W> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * For each key k in <code>this</code> or <code>other1</code> or <code>other2</code>, return a resulting RDD that contains a
   * tuple with the list of values for that key in <code>this</code>, <code>other1</code> and <code>other2</code>.
   * @param other1 (undocumented)
   * @param other2 (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <W1 extends java.lang.Object, W2 extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple3<java.lang.Iterable<V>, java.lang.Iterable<W1>, java.lang.Iterable<W2>>> cogroup (org.apache.spark.api.java.JavaPairRDD<K, W1> other1, org.apache.spark.api.java.JavaPairRDD<K, W2> other2, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * For each key k in <code>this</code> or <code>other1</code> or <code>other2</code> or <code>other3</code>,
   * return a resulting RDD that contains a tuple with the list of values
   * for that key in <code>this</code>, <code>other1</code>, <code>other2</code> and <code>other3</code>.
   * @param other1 (undocumented)
   * @param other2 (undocumented)
   * @param other3 (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <W1 extends java.lang.Object, W2 extends java.lang.Object, W3 extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple4<java.lang.Iterable<V>, java.lang.Iterable<W1>, java.lang.Iterable<W2>, java.lang.Iterable<W3>>> cogroup (org.apache.spark.api.java.JavaPairRDD<K, W1> other1, org.apache.spark.api.java.JavaPairRDD<K, W2> other2, org.apache.spark.api.java.JavaPairRDD<K, W3> other3, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * For each key k in <code>this</code> or <code>other</code>, return a resulting RDD that contains a tuple with the
   * list of values for that key in <code>this</code> as well as <code>other</code>.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple2<java.lang.Iterable<V>, java.lang.Iterable<W>>> cogroup (org.apache.spark.api.java.JavaPairRDD<K, W> other)  { throw new RuntimeException(); }
  /**
   * For each key k in <code>this</code> or <code>other1</code> or <code>other2</code>, return a resulting RDD that contains a
   * tuple with the list of values for that key in <code>this</code>, <code>other1</code> and <code>other2</code>.
   * @param other1 (undocumented)
   * @param other2 (undocumented)
   * @return (undocumented)
   */
  public <W1 extends java.lang.Object, W2 extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple3<java.lang.Iterable<V>, java.lang.Iterable<W1>, java.lang.Iterable<W2>>> cogroup (org.apache.spark.api.java.JavaPairRDD<K, W1> other1, org.apache.spark.api.java.JavaPairRDD<K, W2> other2)  { throw new RuntimeException(); }
  /**
   * For each key k in <code>this</code> or <code>other1</code> or <code>other2</code> or <code>other3</code>,
   * return a resulting RDD that contains a tuple with the list of values
   * for that key in <code>this</code>, <code>other1</code>, <code>other2</code> and <code>other3</code>.
   * @param other1 (undocumented)
   * @param other2 (undocumented)
   * @param other3 (undocumented)
   * @return (undocumented)
   */
  public <W1 extends java.lang.Object, W2 extends java.lang.Object, W3 extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple4<java.lang.Iterable<V>, java.lang.Iterable<W1>, java.lang.Iterable<W2>, java.lang.Iterable<W3>>> cogroup (org.apache.spark.api.java.JavaPairRDD<K, W1> other1, org.apache.spark.api.java.JavaPairRDD<K, W2> other2, org.apache.spark.api.java.JavaPairRDD<K, W3> other3)  { throw new RuntimeException(); }
  /**
   * For each key k in <code>this</code> or <code>other</code>, return a resulting RDD that contains a tuple with the
   * list of values for that key in <code>this</code> as well as <code>other</code>.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple2<java.lang.Iterable<V>, java.lang.Iterable<W>>> cogroup (org.apache.spark.api.java.JavaPairRDD<K, W> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * For each key k in <code>this</code> or <code>other1</code> or <code>other2</code>, return a resulting RDD that contains a
   * tuple with the list of values for that key in <code>this</code>, <code>other1</code> and <code>other2</code>.
   * @param other1 (undocumented)
   * @param other2 (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W1 extends java.lang.Object, W2 extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple3<java.lang.Iterable<V>, java.lang.Iterable<W1>, java.lang.Iterable<W2>>> cogroup (org.apache.spark.api.java.JavaPairRDD<K, W1> other1, org.apache.spark.api.java.JavaPairRDD<K, W2> other2, int numPartitions)  { throw new RuntimeException(); }
  /**
   * For each key k in <code>this</code> or <code>other1</code> or <code>other2</code> or <code>other3</code>,
   * return a resulting RDD that contains a tuple with the list of values
   * for that key in <code>this</code>, <code>other1</code>, <code>other2</code> and <code>other3</code>.
   * @param other1 (undocumented)
   * @param other2 (undocumented)
   * @param other3 (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W1 extends java.lang.Object, W2 extends java.lang.Object, W3 extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple4<java.lang.Iterable<V>, java.lang.Iterable<W1>, java.lang.Iterable<W2>, java.lang.Iterable<W3>>> cogroup (org.apache.spark.api.java.JavaPairRDD<K, W1> other1, org.apache.spark.api.java.JavaPairRDD<K, W2> other2, org.apache.spark.api.java.JavaPairRDD<K, W3> other3, int numPartitions)  { throw new RuntimeException(); }
  /** Alias for cogroup. */
  public <W extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple2<java.lang.Iterable<V>, java.lang.Iterable<W>>> groupWith (org.apache.spark.api.java.JavaPairRDD<K, W> other)  { throw new RuntimeException(); }
  /** Alias for cogroup. */
  public <W1 extends java.lang.Object, W2 extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple3<java.lang.Iterable<V>, java.lang.Iterable<W1>, java.lang.Iterable<W2>>> groupWith (org.apache.spark.api.java.JavaPairRDD<K, W1> other1, org.apache.spark.api.java.JavaPairRDD<K, W2> other2)  { throw new RuntimeException(); }
  /** Alias for cogroup. */
  public <W1 extends java.lang.Object, W2 extends java.lang.Object, W3 extends java.lang.Object> org.apache.spark.api.java.JavaPairRDD<K, scala.Tuple4<java.lang.Iterable<V>, java.lang.Iterable<W1>, java.lang.Iterable<W2>, java.lang.Iterable<W3>>> groupWith (org.apache.spark.api.java.JavaPairRDD<K, W1> other1, org.apache.spark.api.java.JavaPairRDD<K, W2> other2, org.apache.spark.api.java.JavaPairRDD<K, W3> other3)  { throw new RuntimeException(); }
  /**
   * Return the list of values in the RDD for key <code>key</code>. This operation is done efficiently if the
   * RDD has a known partitioner by only searching the partition that the key maps to.
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  java.util.List<V> lookup (K key)  { throw new RuntimeException(); }
  /** Output the RDD to any Hadoop-supported file system. */
  public <F extends org.apache.hadoop.mapred.OutputFormat<?, ?>> void saveAsHadoopFile (java.lang.String path, java.lang.Class<?> keyClass, java.lang.Class<?> valueClass, java.lang.Class<F> outputFormatClass, org.apache.hadoop.mapred.JobConf conf)  { throw new RuntimeException(); }
  /** Output the RDD to any Hadoop-supported file system. */
  public <F extends org.apache.hadoop.mapred.OutputFormat<?, ?>> void saveAsHadoopFile (java.lang.String path, java.lang.Class<?> keyClass, java.lang.Class<?> valueClass, java.lang.Class<F> outputFormatClass)  { throw new RuntimeException(); }
  /** Output the RDD to any Hadoop-supported file system, compressing with the supplied codec. */
  public <F extends org.apache.hadoop.mapred.OutputFormat<?, ?>> void saveAsHadoopFile (java.lang.String path, java.lang.Class<?> keyClass, java.lang.Class<?> valueClass, java.lang.Class<F> outputFormatClass, java.lang.Class<? extends org.apache.hadoop.io.compress.CompressionCodec> codec)  { throw new RuntimeException(); }
  /** Output the RDD to any Hadoop-supported file system. */
  public <F extends org.apache.hadoop.mapreduce.OutputFormat<?, ?>> void saveAsNewAPIHadoopFile (java.lang.String path, java.lang.Class<?> keyClass, java.lang.Class<?> valueClass, java.lang.Class<F> outputFormatClass, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /**
   * Output the RDD to any Hadoop-supported storage system, using
   * a Configuration object for that storage system.
   * @param conf (undocumented)
   */
  public  void saveAsNewAPIHadoopDataset (org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /** Output the RDD to any Hadoop-supported file system. */
  public <F extends org.apache.hadoop.mapreduce.OutputFormat<?, ?>> void saveAsNewAPIHadoopFile (java.lang.String path, java.lang.Class<?> keyClass, java.lang.Class<?> valueClass, java.lang.Class<F> outputFormatClass)  { throw new RuntimeException(); }
  /**
   * Output the RDD to any Hadoop-supported storage system, using a Hadoop JobConf object for
   * that storage system. The JobConf should set an OutputFormat and any output paths required
   * (e.g. a table name to write to) in the same way as it would be configured for a Hadoop
   * MapReduce job.
   * @param conf (undocumented)
   */
  public  void saveAsHadoopDataset (org.apache.hadoop.mapred.JobConf conf)  { throw new RuntimeException(); }
  /**
   * Repartition the RDD according to the given partitioner and, within each resulting partition,
   * sort records by their keys.
   * <p>
   * This is more efficient than calling <code>repartition</code> and then sorting within each partition
   * because it can push the sorting down into the shuffle machinery.
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> repartitionAndSortWithinPartitions (org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Repartition the RDD according to the given partitioner and, within each resulting partition,
   * sort records by their keys.
   * <p>
   * This is more efficient than calling <code>repartition</code> and then sorting within each partition
   * because it can push the sorting down into the shuffle machinery.
   * @param partitioner (undocumented)
   * @param comp (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> repartitionAndSortWithinPartitions (org.apache.spark.Partitioner partitioner, java.util.Comparator<K> comp)  { throw new RuntimeException(); }
  /**
   * Sort the RDD by key, so that each partition contains a sorted range of the elements in
   * ascending order. Calling <code>collect</code> or <code>save</code> on the resulting RDD will return or output an
   * ordered list of records (in the <code>save</code> case, they will be written to multiple <code>part-X</code> files
   * in the filesystem, in order of the keys).
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> sortByKey ()  { throw new RuntimeException(); }
  /**
   * Sort the RDD by key, so that each partition contains a sorted range of the elements. Calling
   * <code>collect</code> or <code>save</code> on the resulting RDD will return or output an ordered list of records
   * (in the <code>save</code> case, they will be written to multiple <code>part-X</code> files in the filesystem, in
   * order of the keys).
   * @param ascending (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> sortByKey (boolean ascending)  { throw new RuntimeException(); }
  /**
   * Sort the RDD by key, so that each partition contains a sorted range of the elements. Calling
   * <code>collect</code> or <code>save</code> on the resulting RDD will return or output an ordered list of records
   * (in the <code>save</code> case, they will be written to multiple <code>part-X</code> files in the filesystem, in
   * order of the keys).
   * @param ascending (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> sortByKey (boolean ascending, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Sort the RDD by key, so that each partition contains a sorted range of the elements. Calling
   * <code>collect</code> or <code>save</code> on the resulting RDD will return or output an ordered list of records
   * (in the <code>save</code> case, they will be written to multiple <code>part-X</code> files in the filesystem, in
   * order of the keys).
   * @param comp (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> sortByKey (java.util.Comparator<K> comp)  { throw new RuntimeException(); }
  /**
   * Sort the RDD by key, so that each partition contains a sorted range of the elements. Calling
   * <code>collect</code> or <code>save</code> on the resulting RDD will return or output an ordered list of records
   * (in the <code>save</code> case, they will be written to multiple <code>part-X</code> files in the filesystem, in
   * order of the keys).
   * @param comp (undocumented)
   * @param ascending (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> sortByKey (java.util.Comparator<K> comp, boolean ascending)  { throw new RuntimeException(); }
  /**
   * Sort the RDD by key, so that each partition contains a sorted range of the elements. Calling
   * <code>collect</code> or <code>save</code> on the resulting RDD will return or output an ordered list of records
   * (in the <code>save</code> case, they will be written to multiple <code>part-X</code> files in the filesystem, in
   * order of the keys).
   * @param comp (undocumented)
   * @param ascending (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> sortByKey (java.util.Comparator<K> comp, boolean ascending, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the keys of each tuple.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<K> keys ()  { throw new RuntimeException(); }
  /**
   * Return an RDD with the values of each tuple.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<V> values ()  { throw new RuntimeException(); }
  /**
   * Return approximate number of distinct values for each key in this RDD.
   * <p>
   * The algorithm used is based on streamlib's implementation of "HyperLogLog in Practice:
   * Algorithmic Engineering of a State of The Art Cardinality Estimation Algorithm", available
   * <a href="http://dx.doi.org/10.1145/2452376.2452456">here</a>.
   * <p>
   * @param relativeSD Relative accuracy. Smaller values create counters that require more space.
   *                   It must be greater than 0.000017.
   * @param partitioner partitioner of the resulting RDD.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, java.lang.Long> countApproxDistinctByKey (double relativeSD, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Return approximate number of distinct values for each key in this RDD.
   * <p>
   * The algorithm used is based on streamlib's implementation of "HyperLogLog in Practice:
   * Algorithmic Engineering of a State of The Art Cardinality Estimation Algorithm", available
   * <a href="http://dx.doi.org/10.1145/2452376.2452456">here</a>.
   * <p>
   * @param relativeSD Relative accuracy. Smaller values create counters that require more space.
   *                   It must be greater than 0.000017.
   * @param numPartitions number of partitions of the resulting RDD.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, java.lang.Long> countApproxDistinctByKey (double relativeSD, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return approximate number of distinct values for each key in this RDD.
   * <p>
   * The algorithm used is based on streamlib's implementation of "HyperLogLog in Practice:
   * Algorithmic Engineering of a State of The Art Cardinality Estimation Algorithm", available
   * <a href="http://dx.doi.org/10.1145/2452376.2452456">here</a>.
   * <p>
   * @param relativeSD Relative accuracy. Smaller values create counters that require more space.
   *                   It must be greater than 0.000017.
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<K, java.lang.Long> countApproxDistinctByKey (double relativeSD)  { throw new RuntimeException(); }
  /** Assign a name to this RDD */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> setName (java.lang.String name)  { throw new RuntimeException(); }
}
