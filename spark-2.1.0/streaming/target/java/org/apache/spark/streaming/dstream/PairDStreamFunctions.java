package org.apache.spark.streaming.dstream;
/**
 * Extra functions available on DStream of (key, value) pairs through an implicit conversion.
 */
public  class PairDStreamFunctions<K extends java.lang.Object, V extends java.lang.Object> implements scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PairDStreamFunctions (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> self, scala.reflect.ClassTag<K> kt, scala.reflect.ClassTag<V> vt, scala.math.Ordering<K> ord)  { throw new RuntimeException(); }
    org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
    org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
    org.apache.spark.HashPartitioner defaultPartitioner (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> to each RDD. Hash partitioning is used to
   * generate the RDDs with Spark's default number of partitions.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.collection.Iterable<V>>> groupByKey ()  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> to each RDD. Hash partitioning is used to
   * generate the RDDs with <code>numPartitions</code> partitions.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.collection.Iterable<V>>> groupByKey (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> on each RDD. The supplied
   * org.apache.spark.Partitioner is used to control the partitioning of each RDD.
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.collection.Iterable<V>>> groupByKey (org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> to each RDD. The values for each key are
   * merged using the associative and commutative reduce function. Hash partitioning is used to
   * generate the RDDs with Spark's default number of partitions.
   * @param reduceFunc (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKey (scala.Function2<V, V, V> reduceFunc)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> to each RDD. The values for each key are
   * merged using the supplied reduce function. Hash partitioning is used to generate the RDDs
   * with <code>numPartitions</code> partitions.
   * @param reduceFunc (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKey (scala.Function2<V, V, V> reduceFunc, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> to each RDD. The values for each key are
   * merged using the supplied reduce function. org.apache.spark.Partitioner is used to control
   * the partitioning of each RDD.
   * @param reduceFunc (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKey (scala.Function2<V, V, V> reduceFunc, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Combine elements of each key in DStream's RDDs using custom functions. This is similar to the
   * combineByKey for RDDs. Please refer to combineByKey in
   * org.apache.spark.rdd.PairRDDFunctions in the Spark core documentation for more information.
   * @param createCombiner (undocumented)
   * @param mergeValue (undocumented)
   * @param mergeCombiner (undocumented)
   * @param partitioner (undocumented)
   * @param mapSideCombine (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public <C extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, C>> combineByKey (scala.Function1<V, C> createCombiner, scala.Function2<C, V, C> mergeValue, scala.Function2<C, C, C> mergeCombiner, org.apache.spark.Partitioner partitioner, boolean mapSideCombine, scala.reflect.ClassTag<C> evidence$1)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> over a sliding window. This is similar to
   * <code>DStream.groupByKey()</code> but applies it over a sliding window. The new DStream generates RDDs
   * with the same interval as this DStream. Hash partitioning is used to generate the RDDs with
   * Spark's default number of partitions.
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.collection.Iterable<V>>> groupByKeyAndWindow (org.apache.spark.streaming.Duration windowDuration)  { throw new RuntimeException(); }
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
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.collection.Iterable<V>>> groupByKeyAndWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> over a sliding window on <code>this</code> DStream.
   * Similar to <code>DStream.groupByKey()</code>, but applies it over a sliding window.
   * Hash partitioning is used to generate the RDDs with <code>numPartitions</code> partitions.
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param numPartitions  number of partitions of each RDD in the new DStream; if not specified
   *                       then Spark's default number of partitions will be used
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.collection.Iterable<V>>> groupByKeyAndWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Create a new DStream by applying <code>groupByKey</code> over a sliding window on <code>this</code> DStream.
   * Similar to <code>DStream.groupByKey()</code>, but applies it over a sliding window.
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param partitioner    partitioner for controlling the partitioning of each RDD in the new
   *                       DStream.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.collection.Iterable<V>>> groupByKeyAndWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> over a sliding window on <code>this</code> DStream.
   * Similar to <code>DStream.reduceByKey()</code>, but applies it over a sliding window. The new DStream
   * generates RDDs with the same interval as this DStream. Hash partitioning is used to generate
   * the RDDs with Spark's default number of partitions.
   * @param reduceFunc associative and commutative reduce function
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKeyAndWindow (scala.Function2<V, V, V> reduceFunc, org.apache.spark.streaming.Duration windowDuration)  { throw new RuntimeException(); }
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
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKeyAndWindow (scala.Function2<V, V, V> reduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
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
   * @param numPartitions  number of partitions of each RDD in the new DStream.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKeyAndWindow (scala.Function2<V, V, V> reduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> over a sliding window. Similar to
   * <code>DStream.reduceByKey()</code>, but applies it over a sliding window.
   * @param reduceFunc associative and commutative reduce function
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param partitioner    partitioner for controlling the partitioning of each RDD
   *                       in the new DStream.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKeyAndWindow (scala.Function2<V, V, V> reduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying incremental <code>reduceByKey</code> over a sliding window.
   * The reduced value of over a new window is calculated using the old window's reduced value :
   *  1. reduce the new values that entered the window (e.g., adding new counts)
   * <p>
   *  2. "inverse reduce" the old values that left the window (e.g., subtracting old counts)
   * <p>
   * This is more efficient than reduceByKeyAndWindow without "inverse reduce" function.
   * However, it is applicable to only "invertible reduce functions".
   * Hash partitioning is used to generate the RDDs with Spark's default number of partitions.
   * @param reduceFunc associative and commutative reduce function
   * @param invReduceFunc inverse reduce function; such that for all y, invertible x:
   *                      <code>invReduceFunc(reduceFunc(x, y), x) = y</code>
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param filterFunc     Optional function to filter expired key-value pairs;
   *                       only pairs that satisfy the function are retained
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKeyAndWindow (scala.Function2<V, V, V> reduceFunc, scala.Function2<V, V, V> invReduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, int numPartitions, scala.Function1<scala.Tuple2<K, V>, java.lang.Object> filterFunc)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying incremental <code>reduceByKey</code> over a sliding window.
   * The reduced value of over a new window is calculated using the old window's reduced value :
   *  1. reduce the new values that entered the window (e.g., adding new counts)
   *  2. "inverse reduce" the old values that left the window (e.g., subtracting old counts)
   * This is more efficient than reduceByKeyAndWindow without "inverse reduce" function.
   * However, it is applicable to only "invertible reduce functions".
   * @param reduceFunc     associative and commutative reduce function
   * @param invReduceFunc  inverse reduce function
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param partitioner    partitioner for controlling the partitioning of each RDD in the new
   *                       DStream.
   * @param filterFunc     Optional function to filter expired key-value pairs;
   *                       only pairs that satisfy the function are retained
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKeyAndWindow (scala.Function2<V, V, V> reduceFunc, scala.Function2<V, V, V> invReduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, org.apache.spark.Partitioner partitioner, scala.Function1<scala.Tuple2<K, V>, java.lang.Object> filterFunc)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Return a {@link MapWithStateDStream} by applying a function to every key-value element of
   * <code>this</code> stream, while maintaining some state data for each unique key. The mapping function
   * and other specification (e.g. partitioners, timeouts, initial state data, etc.) of this
   * transformation can be specified using <code>StateSpec</code> class. The state data is accessible in
   * as a parameter of type <code>State</code> in the mapping function.
   * <p>
   * Example of using <code>mapWithState</code>:
   * <pre><code>
   *    // A mapping function that maintains an integer state and return a String
   *    def mappingFunction(key: String, value: Option[Int], state: State[Int]): Option[String] = {
   *      // Use state.exists(), state.get(), state.update() and state.remove()
   *      // to manage state, and return the necessary string
   *    }
   *
   *    val spec = StateSpec.function(mappingFunction).numPartitions(10)
   *
   *    val mapWithStateDStream = keyValueDStream.mapWithState[StateType, MappedType](spec)
   * </code></pre>
   * <p>
   * @param spec          Specification of this transformation
   * @tparam StateType    Class type of the state data
   * @tparam MappedType   Class type of the mapped data
   * @param evidence$2 (undocumented)
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  public <StateType extends java.lang.Object, MappedType extends java.lang.Object> org.apache.spark.streaming.dstream.MapWithStateDStream<K, V, StateType, MappedType> mapWithState (org.apache.spark.streaming.StateSpec<K, V, StateType, MappedType> spec, scala.reflect.ClassTag<StateType> evidence$2, scala.reflect.ClassTag<MappedType> evidence$3)  { throw new RuntimeException(); }
  /**
   * Return a new "state" DStream where the state for each key is updated by applying
   * the given function on the previous state of the key and the new values of each key.
   * Hash partitioning is used to generate the RDDs with Spark's default number of partitions.
   * @param updateFunc State update function. If <code>this</code> function returns None, then
   *                   corresponding state key-value pair will be eliminated.
   * @tparam S State type
   * @param evidence$4 (undocumented)
   * @return (undocumented)
   */
  public <S extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, S>> updateStateByKey (scala.Function2<scala.collection.Seq<V>, scala.Option<S>, scala.Option<S>> updateFunc, scala.reflect.ClassTag<S> evidence$4)  { throw new RuntimeException(); }
  /**
   * Return a new "state" DStream where the state for each key is updated by applying
   * the given function on the previous state of the key and the new values of each key.
   * Hash partitioning is used to generate the RDDs with <code>numPartitions</code> partitions.
   * @param updateFunc State update function. If <code>this</code> function returns None, then
   *                   corresponding state key-value pair will be eliminated.
   * @param numPartitions Number of partitions of each RDD in the new DStream.
   * @tparam S State type
   * @param evidence$5 (undocumented)
   * @return (undocumented)
   */
  public <S extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, S>> updateStateByKey (scala.Function2<scala.collection.Seq<V>, scala.Option<S>, scala.Option<S>> updateFunc, int numPartitions, scala.reflect.ClassTag<S> evidence$5)  { throw new RuntimeException(); }
  /**
   * Return a new "state" DStream where the state for each key is updated by applying
   * the given function on the previous state of the key and the new values of the key.
   * {@link org.apache.spark.Partitioner} is used to control the partitioning of each RDD.
   * @param updateFunc State update function. If <code>this</code> function returns None, then
   *                   corresponding state key-value pair will be eliminated.
   * @param partitioner Partitioner for controlling the partitioning of each RDD in the new
   *                    DStream.
   * @tparam S State type
   * @param evidence$6 (undocumented)
   * @return (undocumented)
   */
  public <S extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, S>> updateStateByKey (scala.Function2<scala.collection.Seq<V>, scala.Option<S>, scala.Option<S>> updateFunc, org.apache.spark.Partitioner partitioner, scala.reflect.ClassTag<S> evidence$6)  { throw new RuntimeException(); }
  /**
   * Return a new "state" DStream where the state for each key is updated by applying
   * the given function on the previous state of the key and the new values of each key.
   * {@link org.apache.spark.Partitioner} is used to control the partitioning of each RDD.
   * @param updateFunc State update function. Note, that this function may generate a different
   *                   tuple with a different key than the input key. Therefore keys may be removed
   *                   or added in this way. It is up to the developer to decide whether to
   *                   remember the partitioner despite the key being changed.
   * @param partitioner Partitioner for controlling the partitioning of each RDD in the new
   *                    DStream
   * @param rememberPartitioner Whether to remember the partitioner object in the generated RDDs.
   * @tparam S State type
   * @param evidence$7 (undocumented)
   * @return (undocumented)
   */
  public <S extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, S>> updateStateByKey (scala.Function1<scala.collection.Iterator<scala.Tuple3<K, scala.collection.Seq<V>, scala.Option<S>>>, scala.collection.Iterator<scala.Tuple2<K, S>>> updateFunc, org.apache.spark.Partitioner partitioner, boolean rememberPartitioner, scala.reflect.ClassTag<S> evidence$7)  { throw new RuntimeException(); }
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
   * @param evidence$8 (undocumented)
   * @return (undocumented)
   */
  public <S extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, S>> updateStateByKey (scala.Function2<scala.collection.Seq<V>, scala.Option<S>, scala.Option<S>> updateFunc, org.apache.spark.Partitioner partitioner, org.apache.spark.rdd.RDD<scala.Tuple2<K, S>> initialRDD, scala.reflect.ClassTag<S> evidence$8)  { throw new RuntimeException(); }
  /**
   * Return a new "state" DStream where the state for each key is updated by applying
   * the given function on the previous state of the key and the new values of each key.
   * org.apache.spark.Partitioner is used to control the partitioning of each RDD.
   * @param updateFunc State update function. Note, that this function may generate a different
   *                   tuple with a different key than the input key. Therefore keys may be removed
   *                   or added in this way. It is up to the developer to decide whether to
   *                   remember the  partitioner despite the key being changed.
   * @param partitioner Partitioner for controlling the partitioning of each RDD in the new
   *                    DStream
   * @param rememberPartitioner Whether to remember the partitioner object in the generated RDDs.
   * @param initialRDD initial state value of each key.
   * @tparam S State type
   * @param evidence$9 (undocumented)
   * @return (undocumented)
   */
  public <S extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, S>> updateStateByKey (scala.Function1<scala.collection.Iterator<scala.Tuple3<K, scala.collection.Seq<V>, scala.Option<S>>>, scala.collection.Iterator<scala.Tuple2<K, S>>> updateFunc, org.apache.spark.Partitioner partitioner, boolean rememberPartitioner, org.apache.spark.rdd.RDD<scala.Tuple2<K, S>> initialRDD, scala.reflect.ClassTag<S> evidence$9)  { throw new RuntimeException(); }
  /**
   * Return a new "state" DStream where the state for each key is updated by applying
   * the given function on the previous state of the key and the new values of the key.
   * org.apache.spark.Partitioner is used to control the partitioning of each RDD.
   * @param updateFunc State update function. If <code>this</code> function returns None, then
   *                   corresponding state key-value pair will be eliminated.
   * @param partitioner Partitioner for controlling the partitioning of each RDD in the new
   *                    DStream.
   * @tparam S State type
   * @param rememberPartitioner (undocumented)
   * @param initialRDD (undocumented)
   * @param evidence$10 (undocumented)
   * @return (undocumented)
   */
  public <S extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, S>> updateStateByKey (scala.Function4<org.apache.spark.streaming.Time, K, scala.collection.Seq<V>, scala.Option<S>, scala.Option<S>> updateFunc, org.apache.spark.Partitioner partitioner, boolean rememberPartitioner, scala.Option<org.apache.spark.rdd.RDD<scala.Tuple2<K, S>>> initialRDD, scala.reflect.ClassTag<S> evidence$10)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying a map function to the value of each key-value pairs in
   * 'this' DStream without changing the key.
   * @param mapValuesFunc (undocumented)
   * @param evidence$11 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, U>> mapValues (scala.Function1<V, U> mapValuesFunc, scala.reflect.ClassTag<U> evidence$11)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying a flatmap function to the value of each key-value pairs in
   * 'this' DStream without changing the key.
   * @param flatMapValuesFunc (undocumented)
   * @param evidence$12 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, U>> flatMapValues (scala.Function1<V, scala.collection.TraversableOnce<U>> flatMapValuesFunc, scala.reflect.ClassTag<U> evidence$12)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'cogroup' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * Hash partitioning is used to generate the RDDs with Spark's default number
   * of partitions.
   * @param other (undocumented)
   * @param evidence$13 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.collection.Iterable<V>, scala.collection.Iterable<W>>>> cogroup (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, scala.reflect.ClassTag<W> evidence$13)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'cogroup' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * Hash partitioning is used to generate the RDDs with <code>numPartitions</code> partitions.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @param evidence$14 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.collection.Iterable<V>, scala.collection.Iterable<W>>>> cogroup (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, int numPartitions, scala.reflect.ClassTag<W> evidence$14)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'cogroup' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * The supplied org.apache.spark.Partitioner is used to partition the generated RDDs.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @param evidence$15 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.collection.Iterable<V>, scala.collection.Iterable<W>>>> cogroup (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, org.apache.spark.Partitioner partitioner, scala.reflect.ClassTag<W> evidence$15)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'join' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * Hash partitioning is used to generate the RDDs with Spark's default number of partitions.
   * @param other (undocumented)
   * @param evidence$16 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<V, W>>> join (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, scala.reflect.ClassTag<W> evidence$16)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'join' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * Hash partitioning is used to generate the RDDs with <code>numPartitions</code> partitions.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @param evidence$17 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<V, W>>> join (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, int numPartitions, scala.reflect.ClassTag<W> evidence$17)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'join' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * The supplied org.apache.spark.Partitioner is used to control the partitioning of each RDD.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @param evidence$18 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<V, W>>> join (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, org.apache.spark.Partitioner partitioner, scala.reflect.ClassTag<W> evidence$18)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'left outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with Spark's default
   * number of partitions.
   * @param other (undocumented)
   * @param evidence$19 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<V, scala.Option<W>>>> leftOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, scala.reflect.ClassTag<W> evidence$19)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'left outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with <code>numPartitions</code>
   * partitions.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @param evidence$20 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<V, scala.Option<W>>>> leftOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, int numPartitions, scala.reflect.ClassTag<W> evidence$20)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'left outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. The supplied org.apache.spark.Partitioner is used to control
   * the partitioning of each RDD.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @param evidence$21 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<V, scala.Option<W>>>> leftOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, org.apache.spark.Partitioner partitioner, scala.reflect.ClassTag<W> evidence$21)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'right outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with Spark's default
   * number of partitions.
   * @param other (undocumented)
   * @param evidence$22 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, W>>> rightOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, scala.reflect.ClassTag<W> evidence$22)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'right outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with <code>numPartitions</code>
   * partitions.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @param evidence$23 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, W>>> rightOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, int numPartitions, scala.reflect.ClassTag<W> evidence$23)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'right outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. The supplied org.apache.spark.Partitioner is used to control
   * the partitioning of each RDD.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @param evidence$24 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, W>>> rightOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, org.apache.spark.Partitioner partitioner, scala.reflect.ClassTag<W> evidence$24)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'full outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with Spark's default
   * number of partitions.
   * @param other (undocumented)
   * @param evidence$25 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, scala.Option<W>>>> fullOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, scala.reflect.ClassTag<W> evidence$25)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'full outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with <code>numPartitions</code>
   * partitions.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @param evidence$26 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, scala.Option<W>>>> fullOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, int numPartitions, scala.reflect.ClassTag<W> evidence$26)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'full outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. The supplied org.apache.spark.Partitioner is used to control
   * the partitioning of each RDD.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @param evidence$27 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, scala.Option<W>>>> fullOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, org.apache.spark.Partitioner partitioner, scala.reflect.ClassTag<W> evidence$27)  { throw new RuntimeException(); }
  /**
   * Save each RDD in <code>this</code> DStream as a Hadoop file. The file name at each batch interval
   * is generated based on <code>prefix</code> and <code>suffix</code>: "prefix-TIME_IN_MS.suffix"
   * @param prefix (undocumented)
   * @param suffix (undocumented)
   * @param fm (undocumented)
   */
  public <F extends org.apache.hadoop.mapred.OutputFormat<K, V>> void saveAsHadoopFiles (java.lang.String prefix, java.lang.String suffix, scala.reflect.ClassTag<F> fm)  { throw new RuntimeException(); }
  /**
   * Save each RDD in <code>this</code> DStream as a Hadoop file. The file name at each batch interval
   * is generated based on <code>prefix</code> and <code>suffix</code>: "prefix-TIME_IN_MS.suffix"
   * @param prefix (undocumented)
   * @param suffix (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param outputFormatClass (undocumented)
   * @param conf (undocumented)
   */
  public  void saveAsHadoopFiles (java.lang.String prefix, java.lang.String suffix, java.lang.Class<?> keyClass, java.lang.Class<?> valueClass, java.lang.Class<? extends org.apache.hadoop.mapred.OutputFormat<?, ?>> outputFormatClass, org.apache.hadoop.mapred.JobConf conf)  { throw new RuntimeException(); }
  /**
   * Save each RDD in <code>this</code> DStream as a Hadoop file. The file name at each batch interval is
   * generated based on <code>prefix</code> and <code>suffix</code>: "prefix-TIME_IN_MS.suffix".
   * @param prefix (undocumented)
   * @param suffix (undocumented)
   * @param fm (undocumented)
   */
  public <F extends org.apache.hadoop.mapreduce.OutputFormat<K, V>> void saveAsNewAPIHadoopFiles (java.lang.String prefix, java.lang.String suffix, scala.reflect.ClassTag<F> fm)  { throw new RuntimeException(); }
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
  public  void saveAsNewAPIHadoopFiles (java.lang.String prefix, java.lang.String suffix, java.lang.Class<?> keyClass, java.lang.Class<?> valueClass, java.lang.Class<? extends org.apache.hadoop.mapreduce.OutputFormat<?, ?>> outputFormatClass, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  private  java.lang.Class<?> keyClass ()  { throw new RuntimeException(); }
  private  java.lang.Class<?> valueClass ()  { throw new RuntimeException(); }
}
