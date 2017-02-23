package org.apache.spark.streaming.api.java;
/**
 * A Java-friendly interface to a DStream of key-value pairs, which provides extra methods
 * like <code>reduceByKey</code> and <code>join</code>.
 */
public  class JavaPairDStream<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.streaming.api.java.AbstractJavaDStreamLike<scala.Tuple2<K, V>, org.apache.spark.streaming.api.java.JavaPairDStream<K, V>, org.apache.spark.api.java.JavaPairRDD<K, V>> {
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, V> fromPairDStream (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> dstream, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, V> fromJavaDStream (org.apache.spark.streaming.api.java.JavaDStream<scala.Tuple2<K, V>> dstream)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, java.lang.Long> scalaToJavaLong (org.apache.spark.streaming.api.java.JavaPairDStream<K, java.lang.Object> dstream, scala.reflect.ClassTag<K> evidence$3)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<java.lang.Long> scalaIntToJavaLong (org.apache.spark.streaming.dstream.DStream<java.lang.Object> in)  { throw new RuntimeException(); }
  static public  void print ()  { throw new RuntimeException(); }
  static public  void print (int num)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<java.lang.Long> count ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaPairDStream<T, java.lang.Long> countByValue ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaPairDStream<T, java.lang.Long> countByValue (int numPartitions)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<java.lang.Long> countByWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaPairDStream<T, java.lang.Long> countByValueAndWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaPairDStream<T, java.lang.Long> countByValueAndWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, int numPartitions)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<java.util.List<T>> glom ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.StreamingContext context ()  { throw new RuntimeException(); }
  static public <R extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<R> map (org.apache.spark.api.java.function.Function<T, R> f)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> mapToPair (org.apache.spark.api.java.function.PairFunction<T, K2, V2> f)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<U> flatMap (org.apache.spark.api.java.function.FlatMapFunction<T, U> f)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> flatMapToPair (org.apache.spark.api.java.function.PairFlatMapFunction<T, K2, V2> f)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<U> mapPartitions (org.apache.spark.api.java.function.FlatMapFunction<java.util.Iterator<T>, U> f)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> mapPartitionsToPair (org.apache.spark.api.java.function.PairFlatMapFunction<java.util.Iterator<T>, K2, V2> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<T> reduce (org.apache.spark.api.java.function.Function2<T, T, T> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<T> reduceByWindow (org.apache.spark.api.java.function.Function2<T, T, T> reduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<T> reduceByWindow (org.apache.spark.api.java.function.Function2<T, T, T> reduceFunc, org.apache.spark.api.java.function.Function2<T, T, T> invReduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  static public  java.util.List<R> slice (org.apache.spark.streaming.Time fromTime, org.apache.spark.streaming.Time toTime)  { throw new RuntimeException(); }
  static public  void foreachRDD (org.apache.spark.api.java.function.VoidFunction<R> foreachFunc)  { throw new RuntimeException(); }
  static public  void foreachRDD (org.apache.spark.api.java.function.VoidFunction2<R, org.apache.spark.streaming.Time> foreachFunc)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<U> transform (org.apache.spark.api.java.function.Function<R, org.apache.spark.api.java.JavaRDD<U>> transformFunc)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<U> transform (org.apache.spark.api.java.function.Function2<R, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaRDD<U>> transformFunc)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> transformToPair (org.apache.spark.api.java.function.Function<R, org.apache.spark.api.java.JavaPairRDD<K2, V2>> transformFunc)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> transformToPair (org.apache.spark.api.java.function.Function2<R, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaPairRDD<K2, V2>> transformFunc)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<W> transformWith (org.apache.spark.streaming.api.java.JavaDStream<U> other, org.apache.spark.api.java.function.Function3<R, org.apache.spark.api.java.JavaRDD<U>, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaRDD<W>> transformFunc)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> transformWithToPair (org.apache.spark.streaming.api.java.JavaDStream<U> other, org.apache.spark.api.java.function.Function3<R, org.apache.spark.api.java.JavaRDD<U>, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaPairRDD<K2, V2>> transformFunc)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object, W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<W> transformWith (org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> other, org.apache.spark.api.java.function.Function3<R, org.apache.spark.api.java.JavaPairRDD<K2, V2>, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaRDD<W>> transformFunc)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object, K3 extends java.lang.Object, V3 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K3, V3> transformWithToPair (org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> other, org.apache.spark.api.java.function.Function3<R, org.apache.spark.api.java.JavaPairRDD<K2, V2>, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaPairRDD<K3, V3>> transformFunc)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<T> checkpoint (org.apache.spark.streaming.Duration interval)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> dstream ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<K> kManifest ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<V> vManifest ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaPairDStream (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> dstream, scala.reflect.ClassTag<K> kManifest, scala.reflect.ClassTag<V> vManifest)  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaPairRDD<K, V> wrapRDD (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd)  { throw new RuntimeException(); }
  /** Return a new DStream containing only the elements that satisfy a predicate. */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> filter (org.apache.spark.api.java.function.Function<scala.Tuple2<K, V>, java.lang.Boolean> f)  { throw new RuntimeException(); }
  /** Persist RDDs of this DStream with the default storage level (MEMORY_ONLY_SER) */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> cache ()  { throw new RuntimeException(); }
  /** Persist RDDs of this DStream with the default storage level (MEMORY_ONLY_SER) */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> persist ()  { throw new RuntimeException(); }
  /** Persist the RDDs of this DStream with the given storage level */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> persist (org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /**
   * Return a new DStream with an increased or decreased level of parallelism. Each RDD in the
   * returned DStream has exactly numPartitions partitions.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> repartition (int numPartitions)  { throw new RuntimeException(); }
  /** Method that generates an RDD for the given Duration */
  public  org.apache.spark.api.java.JavaPairRDD<K, V> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
  /**
   * Return a new DStream which is computed based on windowed batches of this DStream.
   * The new DStream generates RDDs with the same interval as this DStream.
   * @param windowDuration width of the window; must be a multiple of this DStream's interval.
   * @return
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> window (org.apache.spark.streaming.Duration windowDuration)  { throw new RuntimeException(); }
  /**
   * Return a new DStream which is computed based on windowed batches of this DStream.
   * @param windowDuration duration (i.e., width) of the window;
   *                   must be a multiple of this DStream's interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                   the new DStream will generate RDDs); must be a multiple of this
   *                   DStream's interval
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> window (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by unifying data of another DStream with this DStream.
   * @param that Another DStream having the same interval (i.e., slideDuration) as this DStream.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> union (org.apache.spark.streaming.api.java.JavaPairDStream<K, V> that)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> to each RDD. Hash partitioning is used to
   * generate the RDDs with Spark's default number of partitions.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, java.lang.Iterable<V>> groupByKey ()  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> to each RDD. Hash partitioning is used to
   * generate the RDDs with <code>numPartitions</code> partitions.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, java.lang.Iterable<V>> groupByKey (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> on each RDD of <code>this</code> DStream.
   * Therefore, the values for each key in <code>this</code> DStream's RDDs are grouped into a
   * single sequence to generate the RDDs of the new DStream. org.apache.spark.Partitioner
   * is used to control the partitioning of each RDD.
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, java.lang.Iterable<V>> groupByKey (org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> to each RDD. The values for each key are
   * merged using the associative and commutative reduce function. Hash partitioning is used to
   * generate the RDDs with Spark's default number of partitions.
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> reduceByKey (org.apache.spark.api.java.function.Function2<V, V, V> func)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> to each RDD. The values for each key are
   * merged using the supplied reduce function. Hash partitioning is used to generate the RDDs
   * with <code>numPartitions</code> partitions.
   * @param func (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> reduceByKey (org.apache.spark.api.java.function.Function2<V, V, V> func, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> to each RDD. The values for each key are
   * merged using the supplied reduce function. org.apache.spark.Partitioner is used to control
   * the partitioning of each RDD.
   * @param func (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> reduceByKey (org.apache.spark.api.java.function.Function2<V, V, V> func, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Combine elements of each key in DStream's RDDs using custom function. This is similar to the
   * combineByKey for RDDs. Please refer to combineByKey in
   * org.apache.spark.rdd.PairRDDFunctions for more information.
   * @param createCombiner (undocumented)
   * @param mergeValue (undocumented)
   * @param mergeCombiners (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <C extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, C> combineByKey (org.apache.spark.api.java.function.Function<V, C> createCombiner, org.apache.spark.api.java.function.Function2<C, V, C> mergeValue, org.apache.spark.api.java.function.Function2<C, C, C> mergeCombiners, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Combine elements of each key in DStream's RDDs using custom function. This is similar to the
   * combineByKey for RDDs. Please refer to combineByKey in
   * org.apache.spark.rdd.PairRDDFunctions for more information.
   * @param createCombiner (undocumented)
   * @param mergeValue (undocumented)
   * @param mergeCombiners (undocumented)
   * @param partitioner (undocumented)
   * @param mapSideCombine (undocumented)
   * @return (undocumented)
   */
  public <C extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, C> combineByKey (org.apache.spark.api.java.function.Function<V, C> createCombiner, org.apache.spark.api.java.function.Function2<C, V, C> mergeValue, org.apache.spark.api.java.function.Function2<C, C, C> mergeCombiners, org.apache.spark.Partitioner partitioner, boolean mapSideCombine)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> over a sliding window. This is similar to
   * <code>DStream.groupByKey()</code> but applies it over a sliding window. The new DStream generates RDDs
   * with the same interval as this DStream. Hash partitioning is used to generate the RDDs with
   * Spark's default number of partitions.
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, java.lang.Iterable<V>> groupByKeyAndWindow (org.apache.spark.streaming.Duration windowDuration)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> over a sliding window. Similar to
   * <code>DStream.groupByKey()</code>, but applies it over a sliding window. Hash partitioning is used to
   * generate the RDDs with Spark's default number of partitions.
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, java.lang.Iterable<V>> groupByKeyAndWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> over a sliding window on <code>this</code> DStream.
   * Similar to <code>DStream.groupByKey()</code>, but applies it over a sliding window.
   * Hash partitioning is used to generate the RDDs with <code>numPartitions</code> partitions.
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param numPartitions  Number of partitions of each RDD in the new DStream.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, java.lang.Iterable<V>> groupByKeyAndWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> over a sliding window on <code>this</code> DStream.
   * Similar to <code>DStream.groupByKey()</code>, but applies it over a sliding window.
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param partitioner Partitioner for controlling the partitioning of each RDD in the new
   *                    DStream.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, java.lang.Iterable<V>> groupByKeyAndWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Create a new DStream by applying <code>reduceByKey</code> over a sliding window on <code>this</code> DStream.
   * Similar to <code>DStream.reduceByKey()</code>, but applies it over a sliding window. The new DStream
   * generates RDDs with the same interval as this DStream. Hash partitioning is used to generate
   * the RDDs with Spark's default number of partitions.
   * @param reduceFunc associative and commutative reduce function
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> reduceByKeyAndWindow (org.apache.spark.api.java.function.Function2<V, V, V> reduceFunc, org.apache.spark.streaming.Duration windowDuration)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> over a sliding window. This is similar to
   * <code>DStream.reduceByKey()</code> but applies it over a sliding window. Hash partitioning is used to
   * generate the RDDs with Spark's default number of partitions.
   * @param reduceFunc associative and commutative reduce function
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> reduceByKeyAndWindow (org.apache.spark.api.java.function.Function2<V, V, V> reduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> over a sliding window. This is similar to
   * <code>DStream.reduceByKey()</code> but applies it over a sliding window. Hash partitioning is used to
   * generate the RDDs with <code>numPartitions</code> partitions.
   * @param reduceFunc associative and commutative reduce function
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param numPartitions  Number of partitions of each RDD in the new DStream.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> reduceByKeyAndWindow (org.apache.spark.api.java.function.Function2<V, V, V> reduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> over a sliding window. Similar to
   * <code>DStream.reduceByKey()</code>, but applies it over a sliding window.
   * @param reduceFunc associative rand commutative educe function
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param partitioner Partitioner for controlling the partitioning of each RDD in the new
   *                    DStream.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> reduceByKeyAndWindow (org.apache.spark.api.java.function.Function2<V, V, V> reduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by reducing over a using incremental computation.
   * The reduced value of over a new window is calculated using the old window's reduce value :
   *  1. reduce the new values that entered the window (e.g., adding new counts)
   *  2. "inverse reduce" the old values that left the window (e.g., subtracting old counts)
   * This is more efficient that reduceByKeyAndWindow without "inverse reduce" function.
   * However, it is applicable to only "invertible reduce functions".
   * Hash partitioning is used to generate the RDDs with Spark's default number of partitions.
   * @param reduceFunc associative and commutative reduce function
   * @param invReduceFunc inverse function; such that for all y, invertible x:
   *                      <code>invReduceFunc(reduceFunc(x, y), x) = y</code>
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> reduceByKeyAndWindow (org.apache.spark.api.java.function.Function2<V, V, V> reduceFunc, org.apache.spark.api.java.function.Function2<V, V, V> invReduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying incremental <code>reduceByKey</code> over a sliding window.
   * The reduced value of over a new window is calculated using the old window's reduce value :
   *  1. reduce the new values that entered the window (e.g., adding new counts)
   *  2. "inverse reduce" the old values that left the window (e.g., subtracting old counts)
   * This is more efficient that reduceByKeyAndWindow without "inverse reduce" function.
   * However, it is applicable to only "invertible reduce functions".
   * Hash partitioning is used to generate the RDDs with <code>numPartitions</code> partitions.
   * @param reduceFunc associative and commutative reduce function
   * @param invReduceFunc inverse function
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param numPartitions  number of partitions of each RDD in the new DStream.
   * @param filterFunc     function to filter expired key-value pairs;
   *                       only pairs that satisfy the function are retained
   *                       set this to null if you do not want to filter
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> reduceByKeyAndWindow (org.apache.spark.api.java.function.Function2<V, V, V> reduceFunc, org.apache.spark.api.java.function.Function2<V, V, V> invReduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, int numPartitions, org.apache.spark.api.java.function.Function<scala.Tuple2<K, V>, java.lang.Boolean> filterFunc)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying incremental <code>reduceByKey</code> over a sliding window.
   * The reduced value of over a new window is calculated using the old window's reduce value :
   *  1. reduce the new values that entered the window (e.g., adding new counts)
   *  2. "inverse reduce" the old values that left the window (e.g., subtracting old counts)
   * This is more efficient that reduceByKeyAndWindow without "inverse reduce" function.
   * However, it is applicable to only "invertible reduce functions".
   * @param reduceFunc associative and commutative reduce function
   * @param invReduceFunc inverse function
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param partitioner Partitioner for controlling the partitioning of each RDD in the new
   *                    DStream.
   * @param filterFunc     function to filter expired key-value pairs;
   *                       only pairs that satisfy the function are retained
   *                       set this to null if you do not want to filter
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaPairDStream<K, V> reduceByKeyAndWindow (org.apache.spark.api.java.function.Function2<V, V, V> reduceFunc, org.apache.spark.api.java.function.Function2<V, V, V> invReduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, org.apache.spark.Partitioner partitioner, org.apache.spark.api.java.function.Function<scala.Tuple2<K, V>, java.lang.Boolean> filterFunc)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Return a {@link JavaMapWithStateDStream} by applying a function to every key-value element of
   * <code>this</code> stream, while maintaining some state data for each unique key. The mapping function
   * and other specification (e.g. partitioners, timeouts, initial state data, etc.) of this
   * transformation can be specified using <code>StateSpec</code> class. The state data is accessible in
   * as a parameter of type <code>State</code> in the mapping function.
   * <p>
   * Example of using <code>mapWithState</code>:
   * <pre><code>
   *   // A mapping function that maintains an integer state and return a string
   *   Function3&lt;String, Optional&lt;Integer&gt;, State&lt;Integer&gt;, String&gt; mappingFunction =
   *       new Function3&lt;String, Optional&lt;Integer&gt;, State&lt;Integer&gt;, String&gt;() {
   *           &#64;Override
   *           public Optional&lt;String&gt; call(Optional&lt;Integer&gt; value, State&lt;Integer&gt; state) {
   *               // Use state.exists(), state.get(), state.update() and state.remove()
   *               // to manage state, and return the necessary string
   *           }
   *       };
   *
   *    JavaMapWithStateDStream&lt;String, Integer, Integer, String&gt; mapWithStateDStream =
   *        keyValueDStream.mapWithState(StateSpec.function(mappingFunc));
   *</code></pre>
   * <p>
   * @param spec          Specification of this transformation
   * @tparam StateType    Class type of the state data
   * @tparam MappedType   Class type of the mapped data
   * @return (undocumented)
   */
  public <StateType extends java.lang.Object, MappedType extends java.lang.Object> org.apache.spark.streaming.api.java.JavaMapWithStateDStream<K, V, StateType, MappedType> mapWithState (org.apache.spark.streaming.StateSpec<K, V, StateType, MappedType> spec)  { throw new RuntimeException(); }
  private <S extends java.lang.Object> scala.Function2<scala.collection.Seq<V>, scala.Option<S>, scala.Option<S>> convertUpdateStateFunction (org.apache.spark.api.java.function.Function2<java.util.List<V>, org.apache.spark.api.java.Optional<S>, org.apache.spark.api.java.Optional<S>> in)  { throw new RuntimeException(); }
  /**
   * Return a new "state" DStream where the state for each key is updated by applying
   * the given function on the previous state of the key and the new values of each key.
   * Hash partitioning is used to generate the RDDs with Spark's default number of partitions.
   * @param updateFunc State update function. If <code>this</code> function returns None, then
   *                   corresponding state key-value pair will be eliminated.
   * @tparam S State type
   * @return (undocumented)
   */
  public <S extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, S> updateStateByKey (org.apache.spark.api.java.function.Function2<java.util.List<V>, org.apache.spark.api.java.Optional<S>, org.apache.spark.api.java.Optional<S>> updateFunc)  { throw new RuntimeException(); }
  /**
   * Return a new "state" DStream where the state for each key is updated by applying
   * the given function on the previous state of the key and the new values of each key.
   * Hash partitioning is used to generate the RDDs with <code>numPartitions</code> partitions.
   * @param updateFunc State update function. If <code>this</code> function returns None, then
   *                   corresponding state key-value pair will be eliminated.
   * @param numPartitions Number of partitions of each RDD in the new DStream.
   * @tparam S State type
   * @return (undocumented)
   */
  public <S extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, S> updateStateByKey (org.apache.spark.api.java.function.Function2<java.util.List<V>, org.apache.spark.api.java.Optional<S>, org.apache.spark.api.java.Optional<S>> updateFunc, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new "state" DStream where the state for each key is updated by applying
   * the given function on the previous state of the key and the new values of the key.
   * org.apache.spark.Partitioner is used to control the partitioning of each RDD.
   * @param updateFunc State update function. If <code>this</code> function returns None, then
   *                   corresponding state key-value pair will be eliminated.
   * @param partitioner Partitioner for controlling the partitioning of each RDD in the new
   *                    DStream.
   * @tparam S State type
   * @return (undocumented)
   */
  public <S extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, S> updateStateByKey (org.apache.spark.api.java.function.Function2<java.util.List<V>, org.apache.spark.api.java.Optional<S>, org.apache.spark.api.java.Optional<S>> updateFunc, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Return a new "state" DStream where the state for each key is updated by applying
   * the given function on the previous state of the key and the new values of the key.
   * org.apache.spark.Partitioner is used to control the partitioning of each RDD.
   * @param updateFunc State update function. If <code>this</code> function returns None, then
   *                   corresponding state key-value pair will be eliminated.
   * @param partitioner Partitioner for controlling the partitioning of each RDD in the new
   *                    DStream.
   * @param initialRDD initial state value of each key.
   * @tparam S State type
   * @return (undocumented)
   */
  public <S extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, S> updateStateByKey (org.apache.spark.api.java.function.Function2<java.util.List<V>, org.apache.spark.api.java.Optional<S>, org.apache.spark.api.java.Optional<S>> updateFunc, org.apache.spark.Partitioner partitioner, org.apache.spark.api.java.JavaPairRDD<K, S> initialRDD)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying a map function to the value of each key-value pairs in
   * 'this' DStream without changing the key.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, U> mapValues (org.apache.spark.api.java.function.Function<V, U> f)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying a flatmap function to the value of each key-value pairs in
   * 'this' DStream without changing the key.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, U> flatMapValues (org.apache.spark.api.java.function.Function<V, java.lang.Iterable<U>> f)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'cogroup' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * Hash partitioning is used to generate the RDDs with Spark's default number
   * of partitions.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, scala.Tuple2<java.lang.Iterable<V>, java.lang.Iterable<W>>> cogroup (org.apache.spark.streaming.api.java.JavaPairDStream<K, W> other)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'cogroup' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * Hash partitioning is used to generate the RDDs with <code>numPartitions</code> partitions.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, scala.Tuple2<java.lang.Iterable<V>, java.lang.Iterable<W>>> cogroup (org.apache.spark.streaming.api.java.JavaPairDStream<K, W> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'cogroup' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * Hash partitioning is used to generate the RDDs with <code>numPartitions</code> partitions.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, scala.Tuple2<java.lang.Iterable<V>, java.lang.Iterable<W>>> cogroup (org.apache.spark.streaming.api.java.JavaPairDStream<K, W> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'join' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * Hash partitioning is used to generate the RDDs with Spark's default number of partitions.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, scala.Tuple2<V, W>> join (org.apache.spark.streaming.api.java.JavaPairDStream<K, W> other)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'join' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * Hash partitioning is used to generate the RDDs with <code>numPartitions</code> partitions.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, scala.Tuple2<V, W>> join (org.apache.spark.streaming.api.java.JavaPairDStream<K, W> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'join' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * The supplied org.apache.spark.Partitioner is used to control the partitioning of each RDD.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, scala.Tuple2<V, W>> join (org.apache.spark.streaming.api.java.JavaPairDStream<K, W> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'left outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with Spark's default
   * number of partitions.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, scala.Tuple2<V, org.apache.spark.api.java.Optional<W>>> leftOuterJoin (org.apache.spark.streaming.api.java.JavaPairDStream<K, W> other)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'left outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with <code>numPartitions</code>
   * partitions.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, scala.Tuple2<V, org.apache.spark.api.java.Optional<W>>> leftOuterJoin (org.apache.spark.streaming.api.java.JavaPairDStream<K, W> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'left outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. The supplied org.apache.spark.Partitioner is used to control
   * the partitioning of each RDD.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, scala.Tuple2<V, org.apache.spark.api.java.Optional<W>>> leftOuterJoin (org.apache.spark.streaming.api.java.JavaPairDStream<K, W> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'right outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with Spark's default
   * number of partitions.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, scala.Tuple2<org.apache.spark.api.java.Optional<V>, W>> rightOuterJoin (org.apache.spark.streaming.api.java.JavaPairDStream<K, W> other)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'right outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with <code>numPartitions</code>
   * partitions.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, scala.Tuple2<org.apache.spark.api.java.Optional<V>, W>> rightOuterJoin (org.apache.spark.streaming.api.java.JavaPairDStream<K, W> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'right outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. The supplied org.apache.spark.Partitioner is used to control
   * the partitioning of each RDD.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, scala.Tuple2<org.apache.spark.api.java.Optional<V>, W>> rightOuterJoin (org.apache.spark.streaming.api.java.JavaPairDStream<K, W> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'full outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with Spark's default
   * number of partitions.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, scala.Tuple2<org.apache.spark.api.java.Optional<V>, org.apache.spark.api.java.Optional<W>>> fullOuterJoin (org.apache.spark.streaming.api.java.JavaPairDStream<K, W> other)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'full outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with <code>numPartitions</code>
   * partitions.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, scala.Tuple2<org.apache.spark.api.java.Optional<V>, org.apache.spark.api.java.Optional<W>>> fullOuterJoin (org.apache.spark.streaming.api.java.JavaPairDStream<K, W> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'full outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. The supplied org.apache.spark.Partitioner is used to control
   * the partitioning of each RDD.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, scala.Tuple2<org.apache.spark.api.java.Optional<V>, org.apache.spark.api.java.Optional<W>>> fullOuterJoin (org.apache.spark.streaming.api.java.JavaPairDStream<K, W> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Save each RDD in <code>this</code> DStream as a Hadoop file. The file name at each batch interval is
   * generated based on <code>prefix</code> and <code>suffix</code>: "prefix-TIME_IN_MS.suffix".
   * @param prefix (undocumented)
   * @param suffix (undocumented)
   */
  public  void saveAsHadoopFiles (java.lang.String prefix, java.lang.String suffix)  { throw new RuntimeException(); }
  /**
   * Save each RDD in <code>this</code> DStream as a Hadoop file. The file name at each batch interval is
   * generated based on <code>prefix</code> and <code>suffix</code>: "prefix-TIME_IN_MS.suffix".
   * @param prefix (undocumented)
   * @param suffix (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param outputFormatClass (undocumented)
   */
  public <F extends org.apache.hadoop.mapred.OutputFormat<?, ?>> void saveAsHadoopFiles (java.lang.String prefix, java.lang.String suffix, java.lang.Class<?> keyClass, java.lang.Class<?> valueClass, java.lang.Class<F> outputFormatClass)  { throw new RuntimeException(); }
  /**
   * Save each RDD in <code>this</code> DStream as a Hadoop file. The file name at each batch interval is
   * generated based on <code>prefix</code> and <code>suffix</code>: "prefix-TIME_IN_MS.suffix".
   * @param prefix (undocumented)
   * @param suffix (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param outputFormatClass (undocumented)
   * @param conf (undocumented)
   */
  public <F extends org.apache.hadoop.mapred.OutputFormat<?, ?>> void saveAsHadoopFiles (java.lang.String prefix, java.lang.String suffix, java.lang.Class<?> keyClass, java.lang.Class<?> valueClass, java.lang.Class<F> outputFormatClass, org.apache.hadoop.mapred.JobConf conf)  { throw new RuntimeException(); }
  /**
   * Save each RDD in <code>this</code> DStream as a Hadoop file. The file name at each batch interval is
   * generated based on <code>prefix</code> and <code>suffix</code>: "prefix-TIME_IN_MS.suffix".
   * @param prefix (undocumented)
   * @param suffix (undocumented)
   */
  public  void saveAsNewAPIHadoopFiles (java.lang.String prefix, java.lang.String suffix)  { throw new RuntimeException(); }
  /**
   * Save each RDD in <code>this</code> DStream as a Hadoop file. The file name at each batch interval is
   * generated based on <code>prefix</code> and <code>suffix</code>: "prefix-TIME_IN_MS.suffix".
   * @param prefix (undocumented)
   * @param suffix (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param outputFormatClass (undocumented)
   */
  public <F extends org.apache.hadoop.mapreduce.OutputFormat<?, ?>> void saveAsNewAPIHadoopFiles (java.lang.String prefix, java.lang.String suffix, java.lang.Class<?> keyClass, java.lang.Class<?> valueClass, java.lang.Class<F> outputFormatClass)  { throw new RuntimeException(); }
  /**
   * Save each RDD in <code>this</code> DStream as a Hadoop file. The file name at each batch interval is
   * generated based on <code>prefix</code> and <code>suffix</code>: "prefix-TIME_IN_MS.suffix".
   * @param prefix (undocumented)
   * @param suffix (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param outputFormatClass (undocumented)
   * @param conf (undocumented)
   */
  public <F extends org.apache.hadoop.mapreduce.OutputFormat<?, ?>> void saveAsNewAPIHadoopFiles (java.lang.String prefix, java.lang.String suffix, java.lang.Class<?> keyClass, java.lang.Class<?> valueClass, java.lang.Class<F> outputFormatClass, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /** Convert to a JavaDStream */
  public  org.apache.spark.streaming.api.java.JavaDStream<scala.Tuple2<K, V>> toJavaDStream ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<scala.Tuple2<K, V>> classTag ()  { throw new RuntimeException(); }
}
