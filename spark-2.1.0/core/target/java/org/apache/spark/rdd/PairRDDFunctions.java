package org.apache.spark.rdd;
/**
 * Extra functions available on RDDs of (key, value) pairs through an implicit conversion.
 */
public  class PairRDDFunctions<K extends java.lang.Object, V extends java.lang.Object> implements org.apache.spark.internal.Logging, scala.Serializable {
  static public  int RECORDS_BETWEEN_BYTES_WRITTEN_METRIC_UPDATES ()  { throw new RuntimeException(); }
  /**
   * Allows for the <code>spark.hadoop.validateOutputSpecs</code> checks to be disabled on a case-by-case
   * basis; see SPARK-4835 for more details.
   * @return (undocumented)
   */
  static public  scala.util.DynamicVariable<java.lang.Object> disableOutputSpecValidation ()  { throw new RuntimeException(); }
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
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PairRDDFunctions (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> self, scala.reflect.ClassTag<K> kt, scala.reflect.ClassTag<V> vt, scala.math.Ordering<K> ord)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Generic function to combine the elements for each key using a custom set of aggregation
   * functions. Turns an RDD[(K, V)] into a result of type RDD[(K, C)], for a "combined type" C
   * <p>
   * Users provide three functions:
   * <p>
   *  - <code>createCombiner</code>, which turns a V into a C (e.g., creates a one-element list)
   *  - <code>mergeValue</code>, to merge a V into a C (e.g., adds it to the end of a list)
   *  - <code>mergeCombiners</code>, to combine two C's into a single one.
   * <p>
   * In addition, users can control the partitioning of the output RDD, and whether to perform
   * map-side aggregation (if a mapper can produce multiple items with the same key).
   * <p>
   * @note V and C can be different -- for example, one might group an RDD of type
   * (Int, Int) into an RDD of type (Int, Seq[Int]).
   * @param createCombiner (undocumented)
   * @param mergeValue (undocumented)
   * @param mergeCombiners (undocumented)
   * @param partitioner (undocumented)
   * @param mapSideCombine (undocumented)
   * @param serializer (undocumented)
   * @param ct (undocumented)
   * @return (undocumented)
   */
  public <C extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, C>> combineByKeyWithClassTag (scala.Function1<V, C> createCombiner, scala.Function2<C, V, C> mergeValue, scala.Function2<C, C, C> mergeCombiners, org.apache.spark.Partitioner partitioner, boolean mapSideCombine, org.apache.spark.serializer.Serializer serializer, scala.reflect.ClassTag<C> ct)  { throw new RuntimeException(); }
  /**
   * Generic function to combine the elements for each key using a custom set of aggregation
   * functions. This method is here for backward compatibility. It does not provide combiner
   * classtag information to the shuffle.
   * <p>
   * @see combineByKeyWithClassTag
   * @param createCombiner (undocumented)
   * @param mergeValue (undocumented)
   * @param mergeCombiners (undocumented)
   * @param partitioner (undocumented)
   * @param mapSideCombine (undocumented)
   * @param serializer (undocumented)
   * @return (undocumented)
   */
  public <C extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, C>> combineByKey (scala.Function1<V, C> createCombiner, scala.Function2<C, V, C> mergeValue, scala.Function2<C, C, C> mergeCombiners, org.apache.spark.Partitioner partitioner, boolean mapSideCombine, org.apache.spark.serializer.Serializer serializer)  { throw new RuntimeException(); }
  /**
   * Simplified version of combineByKeyWithClassTag that hash-partitions the output RDD.
   * This method is here for backward compatibility. It does not provide combiner
   * classtag information to the shuffle.
   * <p>
   * @see combineByKeyWithClassTag
   * @param createCombiner (undocumented)
   * @param mergeValue (undocumented)
   * @param mergeCombiners (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <C extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, C>> combineByKey (scala.Function1<V, C> createCombiner, scala.Function2<C, V, C> mergeValue, scala.Function2<C, C, C> mergeCombiners, int numPartitions)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Simplified version of combineByKeyWithClassTag that hash-partitions the output RDD.
   * @param createCombiner (undocumented)
   * @param mergeValue (undocumented)
   * @param mergeCombiners (undocumented)
   * @param numPartitions (undocumented)
   * @param ct (undocumented)
   * @return (undocumented)
   */
  public <C extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, C>> combineByKeyWithClassTag (scala.Function1<V, C> createCombiner, scala.Function2<C, V, C> mergeValue, scala.Function2<C, C, C> mergeCombiners, int numPartitions, scala.reflect.ClassTag<C> ct)  { throw new RuntimeException(); }
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
   * @param seqOp (undocumented)
   * @param combOp (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, U>> aggregateByKey (U zeroValue, org.apache.spark.Partitioner partitioner, scala.Function2<U, V, U> seqOp, scala.Function2<U, U, U> combOp, scala.reflect.ClassTag<U> evidence$1)  { throw new RuntimeException(); }
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
   * @param seqOp (undocumented)
   * @param combOp (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, U>> aggregateByKey (U zeroValue, int numPartitions, scala.Function2<U, V, U> seqOp, scala.Function2<U, U, U> combOp, scala.reflect.ClassTag<U> evidence$2)  { throw new RuntimeException(); }
  /**
   * Aggregate the values of each key, using given combine functions and a neutral "zero value".
   * This function can return a different result type, U, than the type of the values in this RDD,
   * V. Thus, we need one operation for merging a V into a U and one operation for merging two U's,
   * as in scala.TraversableOnce. The former operation is used for merging values within a
   * partition, and the latter is used for merging values between partitions. To avoid memory
   * allocation, both of these functions are allowed to modify and return their first argument
   * instead of creating a new U.
   * @param zeroValue (undocumented)
   * @param seqOp (undocumented)
   * @param combOp (undocumented)
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, U>> aggregateByKey (U zeroValue, scala.Function2<U, V, U> seqOp, scala.Function2<U, U, U> combOp, scala.reflect.ClassTag<U> evidence$3)  { throw new RuntimeException(); }
  /**
   * Merge the values for each key using an associative function and a neutral "zero value" which
   * may be added to the result an arbitrary number of times, and must not change the result
   * (e.g., Nil for list concatenation, 0 for addition, or 1 for multiplication.).
   * @param zeroValue (undocumented)
   * @param partitioner (undocumented)
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> foldByKey (V zeroValue, org.apache.spark.Partitioner partitioner, scala.Function2<V, V, V> func)  { throw new RuntimeException(); }
  /**
   * Merge the values for each key using an associative function and a neutral "zero value" which
   * may be added to the result an arbitrary number of times, and must not change the result
   * (e.g., Nil for list concatenation, 0 for addition, or 1 for multiplication.).
   * @param zeroValue (undocumented)
   * @param numPartitions (undocumented)
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> foldByKey (V zeroValue, int numPartitions, scala.Function2<V, V, V> func)  { throw new RuntimeException(); }
  /**
   * Merge the values for each key using an associative function and a neutral "zero value" which
   * may be added to the result an arbitrary number of times, and must not change the result
   * (e.g., Nil for list concatenation, 0 for addition, or 1 for multiplication.).
   * @param zeroValue (undocumented)
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> foldByKey (V zeroValue, scala.Function2<V, V, V> func)  { throw new RuntimeException(); }
  /**
   * Return a subset of this RDD sampled by key (via stratified sampling).
   * <p>
   * Create a sample of this RDD using variable sampling rates for different keys as specified by
   * <code>fractions</code>, a key to sampling rate map, via simple random sampling with one pass over the
   * RDD, to produce a sample of size that's approximately equal to the sum of
   * math.ceil(numItems * samplingRate) over all key values.
   * <p>
   * @param withReplacement whether to sample with or without replacement
   * @param fractions map of specific keys to sampling rates
   * @param seed seed for the random number generator
   * @return RDD containing the sampled subset
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> sampleByKey (boolean withReplacement, scala.collection.Map<K, java.lang.Object> fractions, long seed)  { throw new RuntimeException(); }
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
   * @param withReplacement whether to sample with or without replacement
   * @param fractions map of specific keys to sampling rates
   * @param seed seed for the random number generator
   * @return RDD containing the sampled subset
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> sampleByKeyExact (boolean withReplacement, scala.collection.Map<K, java.lang.Object> fractions, long seed)  { throw new RuntimeException(); }
  /**
   * Merge the values for each key using an associative and commutative reduce function. This will
   * also perform the merging locally on each mapper before sending results to a reducer, similarly
   * to a "combiner" in MapReduce.
   * @param partitioner (undocumented)
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> reduceByKey (org.apache.spark.Partitioner partitioner, scala.Function2<V, V, V> func)  { throw new RuntimeException(); }
  /**
   * Merge the values for each key using an associative and commutative reduce function. This will
   * also perform the merging locally on each mapper before sending results to a reducer, similarly
   * to a "combiner" in MapReduce. Output will be hash-partitioned with numPartitions partitions.
   * @param func (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> reduceByKey (scala.Function2<V, V, V> func, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Merge the values for each key using an associative and commutative reduce function. This will
   * also perform the merging locally on each mapper before sending results to a reducer, similarly
   * to a "combiner" in MapReduce. Output will be hash-partitioned with the existing partitioner/
   * parallelism level.
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> reduceByKey (scala.Function2<V, V, V> func)  { throw new RuntimeException(); }
  /**
   * Merge the values for each key using an associative and commutative reduce function, but return
   * the results immediately to the master as a Map. This will also perform the merging locally on
   * each mapper before sending results to a reducer, similarly to a "combiner" in MapReduce.
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Map<K, V> reduceByKeyLocally (scala.Function2<V, V, V> func)  { throw new RuntimeException(); }
  /**
   * Count the number of elements for each key, collecting the results to a local Map.
   * <p>
   * @note This method should only be used if the resulting map is expected to be small, as
   * the whole thing is loaded into the driver's memory.
   * To handle very large results, consider using rdd.mapValues(_ =&gt; 1L).reduceByKey(_ + _), which
   * returns an RDD[T, Long] instead of a map.
   * @return (undocumented)
   */
  public  scala.collection.Map<K, java.lang.Object> countByKey ()  { throw new RuntimeException(); }
  /**
   * Approximate version of countByKey that can return a partial result if it does
   * not finish within a timeout.
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
  public  org.apache.spark.partial.PartialResult<scala.collection.Map<K, org.apache.spark.partial.BoundedDouble>> countByKeyApprox (long timeout, double confidence)  { throw new RuntimeException(); }
  /**
   * Return approximate number of distinct values for each key in this RDD.
   * <p>
   * The algorithm used is based on streamlib's implementation of "HyperLogLog in Practice:
   * Algorithmic Engineering of a State of The Art Cardinality Estimation Algorithm", available
   * <a href="http://dx.doi.org/10.1145/2452376.2452456">here</a>.
   * <p>
   * The relative accuracy is approximately <code>1.054 / sqrt(2^p)</code>. Setting a nonzero (<code>sp</code> is
   * greater than <code>p</code>) would trigger sparse representation of registers, which may reduce the
   * memory consumption and increase accuracy when the cardinality is small.
   * <p>
   * @param p The precision value for the normal set.
   *          <code>p</code> must be a value between 4 and <code>sp</code> if <code>sp</code> is not zero (32 max).
   * @param sp The precision value for the sparse set, between 0 and 32.
   *           If <code>sp</code> equals 0, the sparse representation is skipped.
   * @param partitioner Partitioner to use for the resulting RDD.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, java.lang.Object>> countApproxDistinctByKey (int p, int sp, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Return approximate number of distinct values for each key in this RDD.
   * <p>
   * The algorithm used is based on streamlib's implementation of "HyperLogLog in Practice:
   * Algorithmic Engineering of a State of The Art Cardinality Estimation Algorithm", available
   * <a href="http://dx.doi.org/10.1145/2452376.2452456">here</a>.
   * <p>
   * @param relativeSD Relative accuracy. Smaller values create counters that require more space.
   *                   It must be greater than 0.000017.
   * @param partitioner partitioner of the resulting RDD
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, java.lang.Object>> countApproxDistinctByKey (double relativeSD, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Return approximate number of distinct values for each key in this RDD.
   * <p>
   * The algorithm used is based on streamlib's implementation of "HyperLogLog in Practice:
   * Algorithmic Engineering of a State of The Art Cardinality Estimation Algorithm", available
   * <a href="http://dx.doi.org/10.1145/2452376.2452456">here</a>.
   * <p>
   * @param relativeSD Relative accuracy. Smaller values create counters that require more space.
   *                   It must be greater than 0.000017.
   * @param numPartitions number of partitions of the resulting RDD
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, java.lang.Object>> countApproxDistinctByKey (double relativeSD, int numPartitions)  { throw new RuntimeException(); }
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
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, java.lang.Object>> countApproxDistinctByKey (double relativeSD)  { throw new RuntimeException(); }
  /**
   * Group the values for each key in the RDD into a single sequence. Allows controlling the
   * partitioning of the resulting key-value pair RDD by passing a Partitioner.
   * The ordering of elements within each group is not guaranteed, and may even differ
   * each time the resulting RDD is evaluated.
   * <p>
   * @note This operation may be very expensive. If you are grouping in order to perform an
   * aggregation (such as a sum or average) over each key, using <code>PairRDDFunctions.aggregateByKey</code>
   * or <code>PairRDDFunctions.reduceByKey</code> will provide much better performance.
   * <p>
   * @note As currently implemented, groupByKey must be able to hold all the key-value pairs for any
   * key in memory. If a key has too many values, it can result in an {@link OutOfMemoryError}.
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<V>>> groupByKey (org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Group the values for each key in the RDD into a single sequence. Hash-partitions the
   * resulting RDD with into <code>numPartitions</code> partitions. The ordering of elements within
   * each group is not guaranteed, and may even differ each time the resulting RDD is evaluated.
   * <p>
   * @note This operation may be very expensive. If you are grouping in order to perform an
   * aggregation (such as a sum or average) over each key, using <code>PairRDDFunctions.aggregateByKey</code>
   * or <code>PairRDDFunctions.reduceByKey</code> will provide much better performance.
   * <p>
   * @note As currently implemented, groupByKey must be able to hold all the key-value pairs for any
   * key in memory. If a key has too many values, it can result in an {@link OutOfMemoryError}.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<V>>> groupByKey (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a copy of the RDD partitioned using the specified partitioner.
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> partitionBy (org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Return an RDD containing all pairs of elements with matching keys in <code>this</code> and <code>other</code>. Each
   * pair of elements will be returned as a (k, (v1, v2)) tuple, where (k, v1) is in <code>this</code> and
   * (k, v2) is in <code>other</code>. Uses the given Partitioner to partition the output RDD.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<V, W>>> join (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Perform a left outer join of <code>this</code> and <code>other</code>. For each element (k, v) in <code>this</code>, the
   * resulting RDD will either contain all pairs (k, (v, Some(w))) for w in <code>other</code>, or the
   * pair (k, (v, None)) if no elements in <code>other</code> have key k. Uses the given Partitioner to
   * partition the output RDD.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<V, scala.Option<W>>>> leftOuterJoin (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Perform a right outer join of <code>this</code> and <code>other</code>. For each element (k, w) in <code>other</code>, the
   * resulting RDD will either contain all pairs (k, (Some(v), w)) for v in <code>this</code>, or the
   * pair (k, (None, w)) if no elements in <code>this</code> have key k. Uses the given Partitioner to
   * partition the output RDD.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, W>>> rightOuterJoin (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
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
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, scala.Option<W>>>> fullOuterJoin (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Simplified version of combineByKeyWithClassTag that hash-partitions the resulting RDD using the
   * existing partitioner/parallelism level. This method is here for backward compatibility. It
   * does not provide combiner classtag information to the shuffle.
   * <p>
   * @see combineByKeyWithClassTag
   * @param createCombiner (undocumented)
   * @param mergeValue (undocumented)
   * @param mergeCombiners (undocumented)
   * @return (undocumented)
   */
  public <C extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, C>> combineByKey (scala.Function1<V, C> createCombiner, scala.Function2<C, V, C> mergeValue, scala.Function2<C, C, C> mergeCombiners)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Simplified version of combineByKeyWithClassTag that hash-partitions the resulting RDD using the
   * existing partitioner/parallelism level.
   * @param createCombiner (undocumented)
   * @param mergeValue (undocumented)
   * @param mergeCombiners (undocumented)
   * @param ct (undocumented)
   * @return (undocumented)
   */
  public <C extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, C>> combineByKeyWithClassTag (scala.Function1<V, C> createCombiner, scala.Function2<C, V, C> mergeValue, scala.Function2<C, C, C> mergeCombiners, scala.reflect.ClassTag<C> ct)  { throw new RuntimeException(); }
  /**
   * Group the values for each key in the RDD into a single sequence. Hash-partitions the
   * resulting RDD with the existing partitioner/parallelism level. The ordering of elements
   * within each group is not guaranteed, and may even differ each time the resulting RDD is
   * evaluated.
   * <p>
   * @note This operation may be very expensive. If you are grouping in order to perform an
   * aggregation (such as a sum or average) over each key, using <code>PairRDDFunctions.aggregateByKey</code>
   * or <code>PairRDDFunctions.reduceByKey</code> will provide much better performance.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<V>>> groupByKey ()  { throw new RuntimeException(); }
  /**
   * Return an RDD containing all pairs of elements with matching keys in <code>this</code> and <code>other</code>. Each
   * pair of elements will be returned as a (k, (v1, v2)) tuple, where (k, v1) is in <code>this</code> and
   * (k, v2) is in <code>other</code>. Performs a hash join across the cluster.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<V, W>>> join (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other)  { throw new RuntimeException(); }
  /**
   * Return an RDD containing all pairs of elements with matching keys in <code>this</code> and <code>other</code>. Each
   * pair of elements will be returned as a (k, (v1, v2)) tuple, where (k, v1) is in <code>this</code> and
   * (k, v2) is in <code>other</code>. Performs a hash join across the cluster.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<V, W>>> join (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Perform a left outer join of <code>this</code> and <code>other</code>. For each element (k, v) in <code>this</code>, the
   * resulting RDD will either contain all pairs (k, (v, Some(w))) for w in <code>other</code>, or the
   * pair (k, (v, None)) if no elements in <code>other</code> have key k. Hash-partitions the output
   * using the existing partitioner/parallelism level.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<V, scala.Option<W>>>> leftOuterJoin (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other)  { throw new RuntimeException(); }
  /**
   * Perform a left outer join of <code>this</code> and <code>other</code>. For each element (k, v) in <code>this</code>, the
   * resulting RDD will either contain all pairs (k, (v, Some(w))) for w in <code>other</code>, or the
   * pair (k, (v, None)) if no elements in <code>other</code> have key k. Hash-partitions the output
   * into <code>numPartitions</code> partitions.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<V, scala.Option<W>>>> leftOuterJoin (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Perform a right outer join of <code>this</code> and <code>other</code>. For each element (k, w) in <code>other</code>, the
   * resulting RDD will either contain all pairs (k, (Some(v), w)) for v in <code>this</code>, or the
   * pair (k, (None, w)) if no elements in <code>this</code> have key k. Hash-partitions the resulting
   * RDD using the existing partitioner/parallelism level.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, W>>> rightOuterJoin (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other)  { throw new RuntimeException(); }
  /**
   * Perform a right outer join of <code>this</code> and <code>other</code>. For each element (k, w) in <code>other</code>, the
   * resulting RDD will either contain all pairs (k, (Some(v), w)) for v in <code>this</code>, or the
   * pair (k, (None, w)) if no elements in <code>this</code> have key k. Hash-partitions the resulting
   * RDD into the given number of partitions.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, W>>> rightOuterJoin (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other, int numPartitions)  { throw new RuntimeException(); }
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
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, scala.Option<W>>>> fullOuterJoin (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other)  { throw new RuntimeException(); }
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
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, scala.Option<W>>>> fullOuterJoin (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return the key-value pairs in this RDD to the master as a Map.
   * <p>
   * Warning: this doesn't return a multimap (so if you have multiple values to the same key, only
   *          one value per key is preserved in the map returned)
   * <p>
   * @note this method should only be used if the resulting data is expected to be small, as
   * all the data is loaded into the driver's memory.
   * @return (undocumented)
   */
  public  scala.collection.Map<K, V> collectAsMap ()  { throw new RuntimeException(); }
  /**
   * Pass each value in the key-value pair RDD through a map function without changing the keys;
   * this also retains the original RDD's partitioning.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, U>> mapValues (scala.Function1<V, U> f)  { throw new RuntimeException(); }
  /**
   * Pass each value in the key-value pair RDD through a flatMap function without changing the
   * keys; this also retains the original RDD's partitioning.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, U>> flatMapValues (scala.Function1<V, scala.collection.TraversableOnce<U>> f)  { throw new RuntimeException(); }
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
  public <W1 extends java.lang.Object, W2 extends java.lang.Object, W3 extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple4<scala.collection.Iterable<V>, scala.collection.Iterable<W1>, scala.collection.Iterable<W2>, scala.collection.Iterable<W3>>>> cogroup (org.apache.spark.rdd.RDD<scala.Tuple2<K, W1>> other1, org.apache.spark.rdd.RDD<scala.Tuple2<K, W2>> other2, org.apache.spark.rdd.RDD<scala.Tuple2<K, W3>> other3, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * For each key k in <code>this</code> or <code>other</code>, return a resulting RDD that contains a tuple with the
   * list of values for that key in <code>this</code> as well as <code>other</code>.
   * @param other (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<scala.collection.Iterable<V>, scala.collection.Iterable<W>>>> cogroup (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * For each key k in <code>this</code> or <code>other1</code> or <code>other2</code>, return a resulting RDD that contains a
   * tuple with the list of values for that key in <code>this</code>, <code>other1</code> and <code>other2</code>.
   * @param other1 (undocumented)
   * @param other2 (undocumented)
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public <W1 extends java.lang.Object, W2 extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple3<scala.collection.Iterable<V>, scala.collection.Iterable<W1>, scala.collection.Iterable<W2>>>> cogroup (org.apache.spark.rdd.RDD<scala.Tuple2<K, W1>> other1, org.apache.spark.rdd.RDD<scala.Tuple2<K, W2>> other2, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * For each key k in <code>this</code> or <code>other1</code> or <code>other2</code> or <code>other3</code>,
   * return a resulting RDD that contains a tuple with the list of values
   * for that key in <code>this</code>, <code>other1</code>, <code>other2</code> and <code>other3</code>.
   * @param other1 (undocumented)
   * @param other2 (undocumented)
   * @param other3 (undocumented)
   * @return (undocumented)
   */
  public <W1 extends java.lang.Object, W2 extends java.lang.Object, W3 extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple4<scala.collection.Iterable<V>, scala.collection.Iterable<W1>, scala.collection.Iterable<W2>, scala.collection.Iterable<W3>>>> cogroup (org.apache.spark.rdd.RDD<scala.Tuple2<K, W1>> other1, org.apache.spark.rdd.RDD<scala.Tuple2<K, W2>> other2, org.apache.spark.rdd.RDD<scala.Tuple2<K, W3>> other3)  { throw new RuntimeException(); }
  /**
   * For each key k in <code>this</code> or <code>other</code>, return a resulting RDD that contains a tuple with the
   * list of values for that key in <code>this</code> as well as <code>other</code>.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<scala.collection.Iterable<V>, scala.collection.Iterable<W>>>> cogroup (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other)  { throw new RuntimeException(); }
  /**
   * For each key k in <code>this</code> or <code>other1</code> or <code>other2</code>, return a resulting RDD that contains a
   * tuple with the list of values for that key in <code>this</code>, <code>other1</code> and <code>other2</code>.
   * @param other1 (undocumented)
   * @param other2 (undocumented)
   * @return (undocumented)
   */
  public <W1 extends java.lang.Object, W2 extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple3<scala.collection.Iterable<V>, scala.collection.Iterable<W1>, scala.collection.Iterable<W2>>>> cogroup (org.apache.spark.rdd.RDD<scala.Tuple2<K, W1>> other1, org.apache.spark.rdd.RDD<scala.Tuple2<K, W2>> other2)  { throw new RuntimeException(); }
  /**
   * For each key k in <code>this</code> or <code>other</code>, return a resulting RDD that contains a tuple with the
   * list of values for that key in <code>this</code> as well as <code>other</code>.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<scala.collection.Iterable<V>, scala.collection.Iterable<W>>>> cogroup (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other, int numPartitions)  { throw new RuntimeException(); }
  /**
   * For each key k in <code>this</code> or <code>other1</code> or <code>other2</code>, return a resulting RDD that contains a
   * tuple with the list of values for that key in <code>this</code>, <code>other1</code> and <code>other2</code>.
   * @param other1 (undocumented)
   * @param other2 (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public <W1 extends java.lang.Object, W2 extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple3<scala.collection.Iterable<V>, scala.collection.Iterable<W1>, scala.collection.Iterable<W2>>>> cogroup (org.apache.spark.rdd.RDD<scala.Tuple2<K, W1>> other1, org.apache.spark.rdd.RDD<scala.Tuple2<K, W2>> other2, int numPartitions)  { throw new RuntimeException(); }
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
  public <W1 extends java.lang.Object, W2 extends java.lang.Object, W3 extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple4<scala.collection.Iterable<V>, scala.collection.Iterable<W1>, scala.collection.Iterable<W2>, scala.collection.Iterable<W3>>>> cogroup (org.apache.spark.rdd.RDD<scala.Tuple2<K, W1>> other1, org.apache.spark.rdd.RDD<scala.Tuple2<K, W2>> other2, org.apache.spark.rdd.RDD<scala.Tuple2<K, W3>> other3, int numPartitions)  { throw new RuntimeException(); }
  /** Alias for cogroup. */
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<scala.collection.Iterable<V>, scala.collection.Iterable<W>>>> groupWith (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other)  { throw new RuntimeException(); }
  /** Alias for cogroup. */
  public <W1 extends java.lang.Object, W2 extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple3<scala.collection.Iterable<V>, scala.collection.Iterable<W1>, scala.collection.Iterable<W2>>>> groupWith (org.apache.spark.rdd.RDD<scala.Tuple2<K, W1>> other1, org.apache.spark.rdd.RDD<scala.Tuple2<K, W2>> other2)  { throw new RuntimeException(); }
  /** Alias for cogroup. */
  public <W1 extends java.lang.Object, W2 extends java.lang.Object, W3 extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple4<scala.collection.Iterable<V>, scala.collection.Iterable<W1>, scala.collection.Iterable<W2>, scala.collection.Iterable<W3>>>> groupWith (org.apache.spark.rdd.RDD<scala.Tuple2<K, W1>> other1, org.apache.spark.rdd.RDD<scala.Tuple2<K, W2>> other2, org.apache.spark.rdd.RDD<scala.Tuple2<K, W3>> other3)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the pairs from <code>this</code> whose keys are not in <code>other</code>.
   * <p>
   * Uses <code>this</code> partitioner/partition size, because even if <code>other</code> is huge, the resulting
   * RDD will be less than or equal to us.
   * @param other (undocumented)
   * @param evidence$4 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> subtractByKey (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other, scala.reflect.ClassTag<W> evidence$4)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the pairs from <code>this</code> whose keys are not in <code>other</code>.
   * @param other (undocumented)
   * @param numPartitions (undocumented)
   * @param evidence$5 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> subtractByKey (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other, int numPartitions, scala.reflect.ClassTag<W> evidence$5)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the pairs from <code>this</code> whose keys are not in <code>other</code>.
   * @param other (undocumented)
   * @param p (undocumented)
   * @param evidence$6 (undocumented)
   * @return (undocumented)
   */
  public <W extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> subtractByKey (org.apache.spark.rdd.RDD<scala.Tuple2<K, W>> other, org.apache.spark.Partitioner p, scala.reflect.ClassTag<W> evidence$6)  { throw new RuntimeException(); }
  /**
   * Return the list of values in the RDD for key <code>key</code>. This operation is done efficiently if the
   * RDD has a known partitioner by only searching the partition that the key maps to.
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<V> lookup (K key)  { throw new RuntimeException(); }
  /**
   * Output the RDD to any Hadoop-supported file system, using a Hadoop <code>OutputFormat</code> class
   * supporting the key and value types K and V in this RDD.
   * @param path (undocumented)
   * @param fm (undocumented)
   */
  public <F extends org.apache.hadoop.mapred.OutputFormat<K, V>> void saveAsHadoopFile (java.lang.String path, scala.reflect.ClassTag<F> fm)  { throw new RuntimeException(); }
  /**
   * Output the RDD to any Hadoop-supported file system, using a Hadoop <code>OutputFormat</code> class
   * supporting the key and value types K and V in this RDD. Compress the result with the
   * supplied codec.
   * @param path (undocumented)
   * @param codec (undocumented)
   * @param fm (undocumented)
   */
  public <F extends org.apache.hadoop.mapred.OutputFormat<K, V>> void saveAsHadoopFile (java.lang.String path, java.lang.Class<? extends org.apache.hadoop.io.compress.CompressionCodec> codec, scala.reflect.ClassTag<F> fm)  { throw new RuntimeException(); }
  /**
   * Output the RDD to any Hadoop-supported file system, using a new Hadoop API <code>OutputFormat</code>
   * (mapreduce.OutputFormat) object supporting the key and value types K and V in this RDD.
   * @param path (undocumented)
   * @param fm (undocumented)
   */
  public <F extends org.apache.hadoop.mapreduce.OutputFormat<K, V>> void saveAsNewAPIHadoopFile (java.lang.String path, scala.reflect.ClassTag<F> fm)  { throw new RuntimeException(); }
  /**
   * Output the RDD to any Hadoop-supported file system, using a new Hadoop API <code>OutputFormat</code>
   * (mapreduce.OutputFormat) object supporting the key and value types K and V in this RDD.
   * @param path (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param outputFormatClass (undocumented)
   * @param conf (undocumented)
   */
  public  void saveAsNewAPIHadoopFile (java.lang.String path, java.lang.Class<?> keyClass, java.lang.Class<?> valueClass, java.lang.Class<? extends org.apache.hadoop.mapreduce.OutputFormat<?, ?>> outputFormatClass, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /**
   * Output the RDD to any Hadoop-supported file system, using a Hadoop <code>OutputFormat</code> class
   * supporting the key and value types K and V in this RDD. Compress with the supplied codec.
   * @param path (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param outputFormatClass (undocumented)
   * @param codec (undocumented)
   */
  public  void saveAsHadoopFile (java.lang.String path, java.lang.Class<?> keyClass, java.lang.Class<?> valueClass, java.lang.Class<? extends org.apache.hadoop.mapred.OutputFormat<?, ?>> outputFormatClass, java.lang.Class<? extends org.apache.hadoop.io.compress.CompressionCodec> codec)  { throw new RuntimeException(); }
  /**
   * Output the RDD to any Hadoop-supported file system, using a Hadoop <code>OutputFormat</code> class
   * supporting the key and value types K and V in this RDD.
   * <p>
   * @note We should make sure our tasks are idempotent when speculation is enabled, i.e. do
   * not use output committer that writes data directly.
   * There is an example in https://issues.apache.org/jira/browse/SPARK-10063 to show the bad
   * result of using direct output committer with speculation enabled.
   * @param path (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param outputFormatClass (undocumented)
   * @param conf (undocumented)
   * @param codec (undocumented)
   */
  public  void saveAsHadoopFile (java.lang.String path, java.lang.Class<?> keyClass, java.lang.Class<?> valueClass, java.lang.Class<? extends org.apache.hadoop.mapred.OutputFormat<?, ?>> outputFormatClass, org.apache.hadoop.mapred.JobConf conf, scala.Option<java.lang.Class<? extends org.apache.hadoop.io.compress.CompressionCodec>> codec)  { throw new RuntimeException(); }
  /**
   * Output the RDD to any Hadoop-supported storage system with new Hadoop API, using a Hadoop
   * Configuration object for that storage system. The Conf should set an OutputFormat and any
   * output paths required (e.g. a table name to write to) in the same way as it would be
   * configured for a Hadoop MapReduce job.
   * <p>
   * @note We should make sure our tasks are idempotent when speculation is enabled, i.e. do
   * not use output committer that writes data directly.
   * There is an example in https://issues.apache.org/jira/browse/SPARK-10063 to show the bad
   * result of using direct output committer with speculation enabled.
   * @param conf (undocumented)
   */
  public  void saveAsNewAPIHadoopDataset (org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /**
   * Output the RDD to any Hadoop-supported storage system, using a Hadoop JobConf object for
   * that storage system. The JobConf should set an OutputFormat and any output paths required
   * (e.g. a table name to write to) in the same way as it would be configured for a Hadoop
   * MapReduce job.
   * @param conf (undocumented)
   */
  public  void saveAsHadoopDataset (org.apache.hadoop.mapred.JobConf conf)  { throw new RuntimeException(); }
  private  scala.Option<scala.Tuple2<org.apache.spark.executor.OutputMetrics, scala.Function0<java.lang.Object>>> initHadoopOutputMetrics (org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  private  void maybeUpdateOutputMetrics (scala.Option<scala.Tuple2<org.apache.spark.executor.OutputMetrics, scala.Function0<java.lang.Object>>> outputMetricsAndBytesWrittenCallback, long recordsWritten)  { throw new RuntimeException(); }
  /**
   * Return an RDD with the keys of each tuple.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<K> keys ()  { throw new RuntimeException(); }
  /**
   * Return an RDD with the values of each tuple.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<V> values ()  { throw new RuntimeException(); }
    java.lang.Class<?> keyClass ()  { throw new RuntimeException(); }
    java.lang.Class<?> valueClass ()  { throw new RuntimeException(); }
    scala.Option<scala.math.Ordering<K>> keyOrdering ()  { throw new RuntimeException(); }
  private  boolean isOutputSpecValidationEnabled ()  { throw new RuntimeException(); }
}
