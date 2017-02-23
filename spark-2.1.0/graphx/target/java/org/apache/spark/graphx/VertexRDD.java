package org.apache.spark.graphx;
/**
 * Extends <code>RDD[(VertexId, VD)]</code> by ensuring that there is only one entry for each vertex and by
 * pre-indexing the entries for fast, efficient joins. Two VertexRDDs with the same index can be
 * joined efficiently. All operations except {@link reindex} preserve the index. To construct a
 * <code>VertexRDD</code>, use the {@link org.apache.spark.graphx.VertexRDD$ VertexRDD object}.
 * <p>
 * Additionally, stores routing information to enable joining the vertex attributes with an
 * {@link EdgeRDD}.
 * <p>
 * @example Construct a <code>VertexRDD</code> from a plain RDD:
 * <pre><code>
 * // Construct an initial vertex set
 * val someData: RDD[(VertexId, SomeType)] = loadData(someFile)
 * val vset = VertexRDD(someData)
 * // If there were redundant values in someData we would use a reduceFunc
 * val vset2 = VertexRDD(someData, reduceFunc)
 * // Finally we can use the VertexRDD to index another dataset
 * val otherData: RDD[(VertexId, OtherType)] = loadData(otherFile)
 * val vset3 = vset2.innerJoin(otherData) { (vid, a, b) =&gt; b }
 * // Now we can construct very fast joins between the two sets
 * val vset4: VertexRDD[(SomeType, OtherType)] = vset.leftJoin(vset3)
 * </code></pre>
 * <p>
 * @tparam VD the vertex attribute associated with each vertex in the set.
 */
public abstract class VertexRDD<VD extends java.lang.Object> extends org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> {
  /**
   * Constructs a standalone <code>VertexRDD</code> (one that is not set up for efficient joins with an
   * {@link EdgeRDD}) from an RDD of vertex-attribute pairs. Duplicate entries are removed arbitrarily.
   * <p>
   * @tparam VD the vertex attribute type
   * <p>
   * @param vertices the collection of vertex-attribute pairs
   * @param evidence$14 (undocumented)
   * @return (undocumented)
   */
  static public <VD extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD> apply (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> vertices, scala.reflect.ClassTag<VD> evidence$14)  { throw new RuntimeException(); }
  /**
   * Constructs a <code>VertexRDD</code> from an RDD of vertex-attribute pairs. Duplicate vertex entries are
   * removed arbitrarily. The resulting <code>VertexRDD</code> will be joinable with <code>edges</code>, and any missing
   * vertices referred to by <code>edges</code> will be created with the attribute <code>defaultVal</code>.
   * <p>
   * @tparam VD the vertex attribute type
   * <p>
   * @param vertices the collection of vertex-attribute pairs
   * @param edges the {@link EdgeRDD} that these vertices may be joined with
   * @param defaultVal the vertex attribute to use when creating missing vertices
   * @param evidence$15 (undocumented)
   * @return (undocumented)
   */
  static public <VD extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD> apply (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> vertices, org.apache.spark.graphx.EdgeRDD<?> edges, VD defaultVal, scala.reflect.ClassTag<VD> evidence$15)  { throw new RuntimeException(); }
  /**
   * Constructs a <code>VertexRDD</code> from an RDD of vertex-attribute pairs. Duplicate vertex entries are
   * merged using <code>mergeFunc</code>. The resulting <code>VertexRDD</code> will be joinable with <code>edges</code>, and any
   * missing vertices referred to by <code>edges</code> will be created with the attribute <code>defaultVal</code>.
   * <p>
   * @tparam VD the vertex attribute type
   * <p>
   * @param vertices the collection of vertex-attribute pairs
   * @param edges the {@link EdgeRDD} that these vertices may be joined with
   * @param defaultVal the vertex attribute to use when creating missing vertices
   * @param mergeFunc the commutative, associative duplicate vertex attribute merge function
   * @param evidence$16 (undocumented)
   * @return (undocumented)
   */
  static public <VD extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD> apply (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> vertices, org.apache.spark.graphx.EdgeRDD<?> edges, VD defaultVal, scala.Function2<VD, VD, VD> mergeFunc, scala.reflect.ClassTag<VD> evidence$16)  { throw new RuntimeException(); }
  /**
   * Constructs a <code>VertexRDD</code> containing all vertices referred to in <code>edges</code>. The vertices will be
   * created with the attribute <code>defaultVal</code>. The resulting <code>VertexRDD</code> will be joinable with
   * <code>edges</code>.
   * <p>
   * @tparam VD the vertex attribute type
   * <p>
   * @param edges the {@link EdgeRDD} referring to the vertices to create
   * @param numPartitions the desired number of partitions for the resulting <code>VertexRDD</code>
   * @param defaultVal the vertex attribute to use when creating missing vertices
   * @param evidence$17 (undocumented)
   * @return (undocumented)
   */
  static public <VD extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD> fromEdges (org.apache.spark.graphx.EdgeRDD<?> edges, int numPartitions, VD defaultVal, scala.reflect.ClassTag<VD> evidence$17)  { throw new RuntimeException(); }
  static   org.apache.spark.rdd.RDD<org.apache.spark.graphx.impl.RoutingTablePartition> createRoutingTables (org.apache.spark.graphx.EdgeRDD<?> edges, org.apache.spark.Partitioner vertexPartitioner)  { throw new RuntimeException(); }
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
  static   org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.Dependency<?>> getDependencies ()  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.Partitioner> partitioner ()  { throw new RuntimeException(); }
  static public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  static public  int id ()  { throw new RuntimeException(); }
  static public  java.lang.String name ()  { throw new RuntimeException(); }
  static public  void name_$eq (java.lang.String x$1)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> setName (java.lang.String _name)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> persist (org.apache.spark.storage.StorageLevel newLevel)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> persist ()  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> cache ()  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> unpersist (boolean blocking)  { throw new RuntimeException(); }
  static public  org.apache.spark.storage.StorageLevel getStorageLevel ()  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<org.apache.spark.Dependency<?>> dependencies ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.Partition[] partitions ()  { throw new RuntimeException(); }
  static public final  int getNumPartitions ()  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<java.lang.String> preferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
  static public final  scala.collection.Iterator<T> iterator (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  static   scala.collection.Seq<org.apache.spark.rdd.RDD<?>> getNarrowAncestors ()  { throw new RuntimeException(); }
  static   scala.collection.Iterator<T> computeOrReadCheckpoint (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  static   scala.collection.Iterator<T> getOrCompute (org.apache.spark.Partition partition, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  static  <U extends java.lang.Object> U withScope (scala.Function0<U> body)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> map (scala.Function1<T, U> f, scala.reflect.ClassTag<U> evidence$3)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> flatMap (scala.Function1<T, scala.collection.TraversableOnce<U>> f, scala.reflect.ClassTag<U> evidence$4)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> distinct (int numPartitions, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> distinct ()  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> repartition (int numPartitions, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> coalesce (int numPartitions, boolean shuffle, scala.Option<org.apache.spark.rdd.PartitionCoalescer> partitionCoalescer, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> sample (boolean withReplacement, double fraction, long seed)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T>[] randomSplit (double[] weights, long seed)  { throw new RuntimeException(); }
  static   org.apache.spark.rdd.RDD<T> randomSampleWithRange (double lb, double ub, long seed)  { throw new RuntimeException(); }
  static public  java.lang.Object takeSample (boolean withReplacement, int num, long seed)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> union (org.apache.spark.rdd.RDD<T> other)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> $plus$plus (org.apache.spark.rdd.RDD<T> other)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> org.apache.spark.rdd.RDD<T> sortBy (scala.Function1<T, K> f, boolean ascending, int numPartitions, scala.math.Ordering<K> ord, scala.reflect.ClassTag<K> ctag)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> intersection (org.apache.spark.rdd.RDD<T> other)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> intersection (org.apache.spark.rdd.RDD<T> other, org.apache.spark.Partitioner partitioner, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> intersection (org.apache.spark.rdd.RDD<T> other, int numPartitions)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.Object> glom ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<T, U>> cartesian (org.apache.spark.rdd.RDD<U> other, scala.reflect.ClassTag<U> evidence$5)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<T>>> groupBy (scala.Function1<T, K> f, scala.reflect.ClassTag<K> kt)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<T>>> groupBy (scala.Function1<T, K> f, int numPartitions, scala.reflect.ClassTag<K> kt)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<T>>> groupBy (scala.Function1<T, K> f, org.apache.spark.Partitioner p, scala.reflect.ClassTag<K> kt, scala.math.Ordering<K> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.String> pipe (java.lang.String command)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.String> pipe (java.lang.String command, scala.collection.Map<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.String> pipe (scala.collection.Seq<java.lang.String> command, scala.collection.Map<java.lang.String, java.lang.String> env, scala.Function1<scala.Function1<java.lang.String, scala.runtime.BoxedUnit>, scala.runtime.BoxedUnit> printPipeContext, scala.Function2<T, scala.Function1<java.lang.String, scala.runtime.BoxedUnit>, scala.runtime.BoxedUnit> printRDDElement, boolean separateWorkingDir, int bufferSize, java.lang.String encoding)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitions (scala.Function1<scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$6)  { throw new RuntimeException(); }
  static  <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitionsWithIndexInternal (scala.Function2<java.lang.Object, scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$7)  { throw new RuntimeException(); }
  static  <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitionsInternal (scala.Function1<scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$8)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitionsWithIndex (scala.Function2<java.lang.Object, scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$9)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<T, U>> zip (org.apache.spark.rdd.RDD<U> other, scala.reflect.ClassTag<U> evidence$10)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, boolean preservesPartitioning, scala.Function2<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$11, scala.reflect.ClassTag<V> evidence$12)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, scala.Function2<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$13, scala.reflect.ClassTag<V> evidence$14)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, C extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, org.apache.spark.rdd.RDD<C> rdd3, boolean preservesPartitioning, scala.Function3<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<C>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$15, scala.reflect.ClassTag<C> evidence$16, scala.reflect.ClassTag<V> evidence$17)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, C extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, org.apache.spark.rdd.RDD<C> rdd3, scala.Function3<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<C>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$18, scala.reflect.ClassTag<C> evidence$19, scala.reflect.ClassTag<V> evidence$20)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, org.apache.spark.rdd.RDD<C> rdd3, org.apache.spark.rdd.RDD<D> rdd4, boolean preservesPartitioning, scala.Function4<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<C>, scala.collection.Iterator<D>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$21, scala.reflect.ClassTag<C> evidence$22, scala.reflect.ClassTag<D> evidence$23, scala.reflect.ClassTag<V> evidence$24)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, org.apache.spark.rdd.RDD<C> rdd3, org.apache.spark.rdd.RDD<D> rdd4, scala.Function4<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<C>, scala.collection.Iterator<D>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$25, scala.reflect.ClassTag<C> evidence$26, scala.reflect.ClassTag<D> evidence$27, scala.reflect.ClassTag<V> evidence$28)  { throw new RuntimeException(); }
  static public  void foreach (scala.Function1<T, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void foreachPartition (scala.Function1<scala.collection.Iterator<T>, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  java.lang.Object collect ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<T> toLocalIterator ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> collect (scala.PartialFunction<T, U> f, scala.reflect.ClassTag<U> evidence$29)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> subtract (org.apache.spark.rdd.RDD<T> other)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> subtract (org.apache.spark.rdd.RDD<T> other, int numPartitions)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> subtract (org.apache.spark.rdd.RDD<T> other, org.apache.spark.Partitioner p, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  T reduce (scala.Function2<T, T, T> f)  { throw new RuntimeException(); }
  static public  T treeReduce (scala.Function2<T, T, T> f, int depth)  { throw new RuntimeException(); }
  static public  T fold (T zeroValue, scala.Function2<T, T, T> op)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> U aggregate (U zeroValue, scala.Function2<U, T, U> seqOp, scala.Function2<U, U, U> combOp, scala.reflect.ClassTag<U> evidence$30)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> U treeAggregate (U zeroValue, scala.Function2<U, T, U> seqOp, scala.Function2<U, U, U> combOp, int depth, scala.reflect.ClassTag<U> evidence$31)  { throw new RuntimeException(); }
  static public  long count ()  { throw new RuntimeException(); }
  static public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> countApprox (long timeout, double confidence)  { throw new RuntimeException(); }
  static public  scala.collection.Map<T, java.lang.Object> countByValue (scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.partial.PartialResult<scala.collection.Map<T, org.apache.spark.partial.BoundedDouble>> countByValueApprox (long timeout, double confidence, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  long countApproxDistinct (int p, int sp)  { throw new RuntimeException(); }
  static public  long countApproxDistinct (double relativeSD)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<scala.Tuple2<T, java.lang.Object>> zipWithIndex ()  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<scala.Tuple2<T, java.lang.Object>> zipWithUniqueId ()  { throw new RuntimeException(); }
  static public  java.lang.Object take (int num)  { throw new RuntimeException(); }
  static public  T first ()  { throw new RuntimeException(); }
  static public  java.lang.Object top (int num, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  java.lang.Object takeOrdered (int num, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  T max (scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  T min (scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  boolean isEmpty ()  { throw new RuntimeException(); }
  static public  void saveAsTextFile (java.lang.String path)  { throw new RuntimeException(); }
  static public  void saveAsTextFile (java.lang.String path, java.lang.Class<? extends org.apache.hadoop.io.compress.CompressionCodec> codec)  { throw new RuntimeException(); }
  static public  void saveAsObjectFile (java.lang.String path)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, T>> keyBy (scala.Function1<T, K> f)  { throw new RuntimeException(); }
  static   java.lang.Object[] collectPartitions ()  { throw new RuntimeException(); }
  static public  void checkpoint ()  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> localCheckpoint ()  { throw new RuntimeException(); }
  static public  boolean isCheckpointed ()  { throw new RuntimeException(); }
  static   boolean isCheckpointedAndMaterialized ()  { throw new RuntimeException(); }
  static   boolean isLocallyCheckpointed ()  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> getCheckpointFile ()  { throw new RuntimeException(); }
  static   org.apache.spark.util.CallSite creationSite ()  { throw new RuntimeException(); }
  static   scala.Option<org.apache.spark.rdd.RDDOperationScope> scope ()  { throw new RuntimeException(); }
  static   java.lang.String getCreationSite ()  { throw new RuntimeException(); }
  static   scala.reflect.ClassTag<T> elementClassTag ()  { throw new RuntimeException(); }
  static   scala.Option<org.apache.spark.rdd.RDDCheckpointData<T>> checkpointData ()  { throw new RuntimeException(); }
  static   void checkpointData_$eq (scala.Option<org.apache.spark.rdd.RDDCheckpointData<T>> x$1)  { throw new RuntimeException(); }
  static protected <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> firstParent (scala.reflect.ClassTag<U> evidence$32)  { throw new RuntimeException(); }
  static protected <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> parent (int j, scala.reflect.ClassTag<U> evidence$33)  { throw new RuntimeException(); }
  static public  org.apache.spark.SparkContext context ()  { throw new RuntimeException(); }
  static   org.apache.spark.rdd.RDD<T> retag (java.lang.Class<T> cls)  { throw new RuntimeException(); }
  static   org.apache.spark.rdd.RDD<T> retag (scala.reflect.ClassTag<T> classTag)  { throw new RuntimeException(); }
  static   void doCheckpoint ()  { throw new RuntimeException(); }
  static   void markCheckpointed ()  { throw new RuntimeException(); }
  static protected  void clearDependencies ()  { throw new RuntimeException(); }
  static public  java.lang.String toDebugString ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<T> toJavaRDD ()  { throw new RuntimeException(); }
  static public  long sample$default$3 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> boolean mapPartitionsWithIndex$default$2 ()  { throw new RuntimeException(); }
  static public  boolean unpersist$default$1 ()  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> distinct$default$2 (int numPartitions)  { throw new RuntimeException(); }
  static public  boolean coalesce$default$2 ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.rdd.PartitionCoalescer> coalesce$default$3 ()  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> coalesce$default$4 (int numPartitions, boolean shuffle, scala.Option<org.apache.spark.rdd.PartitionCoalescer> partitionCoalescer)  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> repartition$default$2 (int numPartitions)  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> subtract$default$3 (org.apache.spark.rdd.RDD<T> other, org.apache.spark.Partitioner p)  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> intersection$default$3 (org.apache.spark.rdd.RDD<T> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  static public  long randomSplit$default$2 ()  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> boolean sortBy$default$2 ()  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> int sortBy$default$3 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> boolean mapPartitions$default$2 ()  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> scala.runtime.Null$ groupBy$default$4 (scala.Function1<T, K> f, org.apache.spark.Partitioner p)  { throw new RuntimeException(); }
  static public  scala.collection.Map<java.lang.String, java.lang.String> pipe$default$2 ()  { throw new RuntimeException(); }
  static public  scala.Function1<scala.Function1<java.lang.String, scala.runtime.BoxedUnit>, scala.runtime.BoxedUnit> pipe$default$3 ()  { throw new RuntimeException(); }
  static public  scala.Function2<T, scala.Function1<java.lang.String, scala.runtime.BoxedUnit>, scala.runtime.BoxedUnit> pipe$default$4 ()  { throw new RuntimeException(); }
  static public  boolean pipe$default$5 ()  { throw new RuntimeException(); }
  static public  int pipe$default$6 ()  { throw new RuntimeException(); }
  static public  java.lang.String pipe$default$7 ()  { throw new RuntimeException(); }
  static public  int treeReduce$default$2 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> int treeAggregate$default$4 (U zeroValue)  { throw new RuntimeException(); }
  static public  double countApprox$default$2 ()  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> countByValue$default$1 ()  { throw new RuntimeException(); }
  static public  double countByValueApprox$default$2 ()  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> countByValueApprox$default$3 (long timeout, double confidence)  { throw new RuntimeException(); }
  static public  long takeSample$default$3 ()  { throw new RuntimeException(); }
  static public  double countApproxDistinct$default$1 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> boolean mapPartitionsWithIndexInternal$default$2 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> boolean mapPartitionsInternal$default$2 ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   VertexRDD (org.apache.spark.SparkContext sc, scala.collection.Seq<org.apache.spark.Dependency<?>> deps)  { throw new RuntimeException(); }
  protected abstract  scala.reflect.ClassTag<VD> vdTag ()  ;
   abstract  org.apache.spark.rdd.RDD<org.apache.spark.graphx.impl.ShippableVertexPartition<VD>> partitionsRDD ()  ;
  protected  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  /**
   * Provides the <code>RDD[(VertexId, VD)]</code> equivalent output.
   * @param part (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD>> compute (org.apache.spark.Partition part, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /**
   * Construct a new VertexRDD that is indexed by only the visible vertices. The resulting
   * VertexRDD will be based on a different index and can no longer be quickly joined with this
   * RDD.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.graphx.VertexRDD<VD> reindex ()  ;
  /**
   * Applies a function to each <code>VertexPartition</code> of this RDD and returns a new VertexRDD.
   * @param f (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
   abstract <VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> mapVertexPartitions (scala.Function1<org.apache.spark.graphx.impl.ShippableVertexPartition<VD>, org.apache.spark.graphx.impl.ShippableVertexPartition<VD2>> f, scala.reflect.ClassTag<VD2> evidence$1)  ;
  /**
   * Restricts the vertex set to the set of vertices satisfying the given predicate. This operation
   * preserves the index for efficient joins with the original RDD, and it sets bits in the bitmask
   * rather than allocating new memory.
   * <p>
   * It is declared and defined here to allow refining the return type from <code>RDD[(VertexId, VD)]</code> to
   * <code>VertexRDD[VD]</code>.
   * <p>
   * @param pred the user defined predicate, which takes a tuple to conform to the
   * <code>RDD[(VertexId, VD)]</code> interface
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.VertexRDD<VD> filter (scala.Function1<scala.Tuple2<java.lang.Object, VD>, java.lang.Object> pred)  { throw new RuntimeException(); }
  /**
   * Maps each vertex attribute, preserving the index.
   * <p>
   * @tparam VD2 the type returned by the map function
   * <p>
   * @param f the function applied to each value in the RDD
   * @return a new VertexRDD with values obtained by applying <code>f</code> to each of the entries in the
   * original VertexRDD
   * @param evidence$2 (undocumented)
   */
  public abstract <VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> mapValues (scala.Function1<VD, VD2> f, scala.reflect.ClassTag<VD2> evidence$2)  ;
  /**
   * Maps each vertex attribute, additionally supplying the vertex ID.
   * <p>
   * @tparam VD2 the type returned by the map function
   * <p>
   * @param f the function applied to each ID-value pair in the RDD
   * @return a new VertexRDD with values obtained by applying <code>f</code> to each of the entries in the
   * original VertexRDD.  The resulting VertexRDD retains the same index.
   * @param evidence$3 (undocumented)
   */
  public abstract <VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> mapValues (scala.Function2<java.lang.Object, VD, VD2> f, scala.reflect.ClassTag<VD2> evidence$3)  ;
  /**
   * For each VertexId present in both <code>this</code> and <code>other</code>, minus will act as a set difference
   * operation returning only those unique VertexId's present in <code>this</code>.
   * <p>
   * @param other an RDD to run the set operation against
   * @return (undocumented)
   */
  public abstract  org.apache.spark.graphx.VertexRDD<VD> minus (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> other)  ;
  /**
   * For each VertexId present in both <code>this</code> and <code>other</code>, minus will act as a set difference
   * operation returning only those unique VertexId's present in <code>this</code>.
   * <p>
   * @param other a VertexRDD to run the set operation against
   * @return (undocumented)
   */
  public abstract  org.apache.spark.graphx.VertexRDD<VD> minus (org.apache.spark.graphx.VertexRDD<VD> other)  ;
  /**
   * For each vertex present in both <code>this</code> and <code>other</code>, <code>diff</code> returns only those vertices with
   * differing values; for values that are different, keeps the values from <code>other</code>. This is
   * only guaranteed to work if the VertexRDDs share a common ancestor.
   * <p>
   * @param other the other RDD[(VertexId, VD)] with which to diff against.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.graphx.VertexRDD<VD> diff (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> other)  ;
  /**
   * For each vertex present in both <code>this</code> and <code>other</code>, <code>diff</code> returns only those vertices with
   * differing values; for values that are different, keeps the values from <code>other</code>. This is
   * only guaranteed to work if the VertexRDDs share a common ancestor.
   * <p>
   * @param other the other VertexRDD with which to diff against.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.graphx.VertexRDD<VD> diff (org.apache.spark.graphx.VertexRDD<VD> other)  ;
  /**
   * Left joins this RDD with another VertexRDD with the same index. This function will fail if
   * both VertexRDDs do not share the same index. The resulting vertex set contains an entry for
   * each vertex in <code>this</code>.
   * If <code>other</code> is missing any vertex in this VertexRDD, <code>f</code> is passed <code>None</code>.
   * <p>
   * @tparam VD2 the attribute type of the other VertexRDD
   * @tparam VD3 the attribute type of the resulting VertexRDD
   * <p>
   * @param other the other VertexRDD with which to join.
   * @param f the function mapping a vertex id and its attributes in this and the other vertex set
   * to a new vertex attribute.
   * @return a VertexRDD containing the results of <code>f</code>
   * @param evidence$4 (undocumented)
   * @param evidence$5 (undocumented)
   */
  public abstract <VD2 extends java.lang.Object, VD3 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD3> leftZipJoin (org.apache.spark.graphx.VertexRDD<VD2> other, scala.Function3<java.lang.Object, VD, scala.Option<VD2>, VD3> f, scala.reflect.ClassTag<VD2> evidence$4, scala.reflect.ClassTag<VD3> evidence$5)  ;
  /**
   * Left joins this VertexRDD with an RDD containing vertex attribute pairs. If the other RDD is
   * backed by a VertexRDD with the same index then the efficient {@link leftZipJoin} implementation is
   * used. The resulting VertexRDD contains an entry for each vertex in <code>this</code>. If <code>other</code> is
   * missing any vertex in this VertexRDD, <code>f</code> is passed <code>None</code>. If there are duplicates,
   * the vertex is picked arbitrarily.
   * <p>
   * @tparam VD2 the attribute type of the other VertexRDD
   * @tparam VD3 the attribute type of the resulting VertexRDD
   * <p>
   * @param other the other VertexRDD with which to join
   * @param f the function mapping a vertex id and its attributes in this and the other vertex set
   * to a new vertex attribute.
   * @return a VertexRDD containing all the vertices in this VertexRDD with the attributes emitted
   * by <code>f</code>.
   * @param evidence$6 (undocumented)
   * @param evidence$7 (undocumented)
   */
  public abstract <VD2 extends java.lang.Object, VD3 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD3> leftJoin (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD2>> other, scala.Function3<java.lang.Object, VD, scala.Option<VD2>, VD3> f, scala.reflect.ClassTag<VD2> evidence$6, scala.reflect.ClassTag<VD3> evidence$7)  ;
  /**
   * Efficiently inner joins this VertexRDD with another VertexRDD sharing the same index. See
   * {@link innerJoin} for the behavior of the join.
   * @param other (undocumented)
   * @param f (undocumented)
   * @param evidence$8 (undocumented)
   * @param evidence$9 (undocumented)
   * @return (undocumented)
   */
  public abstract <U extends java.lang.Object, VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> innerZipJoin (org.apache.spark.graphx.VertexRDD<U> other, scala.Function3<java.lang.Object, VD, U, VD2> f, scala.reflect.ClassTag<U> evidence$8, scala.reflect.ClassTag<VD2> evidence$9)  ;
  /**
   * Inner joins this VertexRDD with an RDD containing vertex attribute pairs. If the other RDD is
   * backed by a VertexRDD with the same index then the efficient {@link innerZipJoin} implementation
   * is used.
   * <p>
   * @param other an RDD containing vertices to join. If there are multiple entries for the same
   * vertex, one is picked arbitrarily. Use {@link aggregateUsingIndex} to merge multiple entries.
   * @param f the join function applied to corresponding values of <code>this</code> and <code>other</code>
   * @return a VertexRDD co-indexed with <code>this</code>, containing only vertices that appear in both
   *         <code>this</code> and <code>other</code>, with values supplied by <code>f</code>
   * @param evidence$10 (undocumented)
   * @param evidence$11 (undocumented)
   */
  public abstract <U extends java.lang.Object, VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> innerJoin (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, U>> other, scala.Function3<java.lang.Object, VD, U, VD2> f, scala.reflect.ClassTag<U> evidence$10, scala.reflect.ClassTag<VD2> evidence$11)  ;
  /**
   * Aggregates vertices in <code>messages</code> that have the same ids using <code>reduceFunc</code>, returning a
   * VertexRDD co-indexed with <code>this</code>.
   * <p>
   * @param messages an RDD containing messages to aggregate, where each message is a pair of its
   * target vertex ID and the message data
   * @param reduceFunc the associative aggregation function for merging messages to the same vertex
   * @return a VertexRDD co-indexed with <code>this</code>, containing only vertices that received messages.
   * For those vertices, their values are the result of applying <code>reduceFunc</code> to all received
   * messages.
   * @param evidence$12 (undocumented)
   */
  public abstract <VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> aggregateUsingIndex (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD2>> messages, scala.Function2<VD2, VD2, VD2> reduceFunc, scala.reflect.ClassTag<VD2> evidence$12)  ;
  /**
   * Returns a new <code>VertexRDD</code> reflecting a reversal of all edge directions in the corresponding
   * {@link EdgeRDD}.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.graphx.VertexRDD<VD> reverseRoutingTables ()  ;
  /** Prepares this VertexRDD for efficient joins with the given EdgeRDD. */
  public abstract  org.apache.spark.graphx.VertexRDD<VD> withEdges (org.apache.spark.graphx.EdgeRDD<?> edges)  ;
  /** Replaces the vertex partitions while preserving all other properties of the VertexRDD. */
   abstract <VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> withPartitionsRDD (org.apache.spark.rdd.RDD<org.apache.spark.graphx.impl.ShippableVertexPartition<VD2>> partitionsRDD, scala.reflect.ClassTag<VD2> evidence$13)  ;
  /**
   * Changes the target storage level while preserving all other properties of the
   * VertexRDD. Operations on the returned VertexRDD will preserve this storage level.
   * <p>
   * This does not actually trigger a cache; to do this, call
   * {@link org.apache.spark.graphx.VertexRDD#cache} on the returned VertexRDD.
   * @param targetStorageLevel (undocumented)
   * @return (undocumented)
   */
   abstract  org.apache.spark.graphx.VertexRDD<VD> withTargetStorageLevel (org.apache.spark.storage.StorageLevel targetStorageLevel)  ;
  /** Generates an RDD of vertex attributes suitable for shipping to the edge partitions. */
   abstract  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.VertexAttributeBlock<VD>>> shipVertexAttributes (boolean shipSrc, boolean shipDst)  ;
  /** Generates an RDD of vertex IDs suitable for shipping to the edge partitions. */
   abstract  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, long[]>> shipVertexIds ()  ;
}
