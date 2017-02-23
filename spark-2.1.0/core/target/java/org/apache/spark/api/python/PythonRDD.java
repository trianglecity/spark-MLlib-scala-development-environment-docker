package org.apache.spark.api.python;
  class PythonRDD extends org.apache.spark.rdd.RDD<byte[]> {
  static private  scala.collection.mutable.WeakHashMap<java.net.Socket, scala.collection.mutable.Set<java.lang.Object>> workerBroadcasts ()  { throw new RuntimeException(); }
  static public  scala.collection.mutable.Set<java.lang.Object> getWorkerBroadcasts (java.net.Socket worker)  { throw new RuntimeException(); }
  /**
   * Return an RDD of values from an RDD of (Long, Array[Byte]), with preservePartitions=true
   * <p>
   * This is useful for PySpark to have the partitioner after partitionBy()
   * @param pair (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.api.java.JavaRDD<byte[]> valueOfPair (org.apache.spark.api.java.JavaPairRDD<java.lang.Object, byte[]> pair)  { throw new RuntimeException(); }
  /**
   * Adapter for calling SparkContext#runJob from Python.
   * <p>
   * This method will serve an iterator of an array that contains all elements in the RDD
   * (effectively a collect()), but allows you to run on a certain subset of partitions,
   * or to enable local execution.
   * <p>
   * @return the port number of a local socket which serves the data collected from this job.
   * @param sc (undocumented)
   * @param rdd (undocumented)
   * @param partitions (undocumented)
   */
  static public  int runJob (org.apache.spark.SparkContext sc, org.apache.spark.api.java.JavaRDD<byte[]> rdd, java.util.ArrayList<java.lang.Object> partitions)  { throw new RuntimeException(); }
  /**
   * A helper function to collect an RDD as an iterator, then serve it via socket.
   * <p>
   * @return the port number of a local socket which serves the data collected from this job.
   * @param rdd (undocumented)
   */
  static public <T extends java.lang.Object> int collectAndServe (org.apache.spark.rdd.RDD<T> rdd)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> int toLocalIteratorAndServe (org.apache.spark.rdd.RDD<T> rdd)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<byte[]> readRDDFromFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String filename, int parallelism)  { throw new RuntimeException(); }
  static public  org.apache.spark.broadcast.Broadcast<org.apache.spark.api.python.PythonBroadcast> readBroadcastFromFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> void writeIteratorToStream (scala.collection.Iterator<T> iter, java.io.DataOutputStream dataOut)  { throw new RuntimeException(); }
  /**
   * Create an RDD from a path using {@link org.apache.hadoop.mapred.SequenceFileInputFormat},
   * key and value class.
   * A key and/or value converter class can optionally be passed in
   * (see {@link org.apache.spark.api.python.Converter})
   * @param sc (undocumented)
   * @param path (undocumented)
   * @param keyClassMaybeNull (undocumented)
   * @param valueClassMaybeNull (undocumented)
   * @param keyConverterClass (undocumented)
   * @param valueConverterClass (undocumented)
   * @param minSplits (undocumented)
   * @param batchSize (undocumented)
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.api.java.JavaRDD<byte[]> sequenceFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String path, java.lang.String keyClassMaybeNull, java.lang.String valueClassMaybeNull, java.lang.String keyConverterClass, java.lang.String valueConverterClass, int minSplits, int batchSize)  { throw new RuntimeException(); }
  /**
   * Create an RDD from a file path, using an arbitrary {@link org.apache.hadoop.mapreduce.InputFormat},
   * key and value class.
   * A key and/or value converter class can optionally be passed in
   * (see {@link org.apache.spark.api.python.Converter})
   * @param sc (undocumented)
   * @param path (undocumented)
   * @param inputFormatClass (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param keyConverterClass (undocumented)
   * @param valueConverterClass (undocumented)
   * @param confAsMap (undocumented)
   * @param batchSize (undocumented)
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> org.apache.spark.api.java.JavaRDD<byte[]> newAPIHadoopFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String path, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, int batchSize)  { throw new RuntimeException(); }
  /**
   * Create an RDD from a {@link org.apache.hadoop.conf.Configuration} converted from a map that is
   * passed in from Python, using an arbitrary {@link org.apache.hadoop.mapreduce.InputFormat},
   * key and value class.
   * A key and/or value converter class can optionally be passed in
   * (see {@link org.apache.spark.api.python.Converter})
   * @param sc (undocumented)
   * @param inputFormatClass (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param keyConverterClass (undocumented)
   * @param valueConverterClass (undocumented)
   * @param confAsMap (undocumented)
   * @param batchSize (undocumented)
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> org.apache.spark.api.java.JavaRDD<byte[]> newAPIHadoopRDD (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, int batchSize)  { throw new RuntimeException(); }
  static private <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> newAPIHadoopRDDFromClassNames (org.apache.spark.api.java.JavaSparkContext sc, scala.Option<java.lang.String> path, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /**
   * Create an RDD from a file path, using an arbitrary {@link org.apache.hadoop.mapred.InputFormat},
   * key and value class.
   * A key and/or value converter class can optionally be passed in
   * (see {@link org.apache.spark.api.python.Converter})
   * @param sc (undocumented)
   * @param path (undocumented)
   * @param inputFormatClass (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param keyConverterClass (undocumented)
   * @param valueConverterClass (undocumented)
   * @param confAsMap (undocumented)
   * @param batchSize (undocumented)
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapred.InputFormat<K, V>> org.apache.spark.api.java.JavaRDD<byte[]> hadoopFile (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String path, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, int batchSize)  { throw new RuntimeException(); }
  /**
   * Create an RDD from a {@link org.apache.hadoop.conf.Configuration} converted from a map
   * that is passed in from Python, using an arbitrary {@link org.apache.hadoop.mapred.InputFormat},
   * key and value class
   * A key and/or value converter class can optionally be passed in
   * (see {@link org.apache.spark.api.python.Converter})
   * @param sc (undocumented)
   * @param inputFormatClass (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param keyConverterClass (undocumented)
   * @param valueConverterClass (undocumented)
   * @param confAsMap (undocumented)
   * @param batchSize (undocumented)
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapred.InputFormat<K, V>> org.apache.spark.api.java.JavaRDD<byte[]> hadoopRDD (org.apache.spark.api.java.JavaSparkContext sc, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, int batchSize)  { throw new RuntimeException(); }
  static private <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapred.InputFormat<K, V>> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> hadoopRDDFromClassNames (org.apache.spark.api.java.JavaSparkContext sc, scala.Option<java.lang.String> path, java.lang.String inputFormatClass, java.lang.String keyClass, java.lang.String valueClass, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  static public  void writeUTF (java.lang.String str, java.io.DataOutputStream dataOut)  { throw new RuntimeException(); }
  /**
   * Create a socket server and a background thread to serve the data in <code>items</code>,
   * <p>
   * The socket server can only accept one connection, or close if no connection
   * in 3 seconds.
   * <p>
   * Once a connection comes in, it tries to serialize all the data in <code>items</code>
   * and send them into this connection.
   * <p>
   * The thread will terminate after all the data are sent or any exceptions happen.
   * @param items (undocumented)
   * @param threadName (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> int serveIterator (scala.collection.Iterator<T> items, java.lang.String threadName)  { throw new RuntimeException(); }
  static private  org.apache.hadoop.conf.Configuration getMergedConf (java.util.HashMap<java.lang.String, java.lang.String> confAsMap, org.apache.hadoop.conf.Configuration baseConf)  { throw new RuntimeException(); }
  static private <K extends java.lang.Object, V extends java.lang.Object> scala.Tuple2<java.lang.Class<?>, java.lang.Class<?>> inferKeyValueTypes (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, java.lang.String keyConverterClass, java.lang.String valueConverterClass)  { throw new RuntimeException(); }
  static private  scala.Option<scala.Tuple2<java.lang.Class<?>, java.lang.Class<?>>> getKeyValueTypes (java.lang.String keyClass, java.lang.String valueClass)  { throw new RuntimeException(); }
  static private  scala.Tuple2<org.apache.spark.api.python.Converter<java.lang.Object, java.lang.Object>, org.apache.spark.api.python.Converter<java.lang.Object, java.lang.Object>> getKeyValueConverters (java.lang.String keyConverterClass, java.lang.String valueConverterClass, org.apache.spark.api.python.Converter<java.lang.Object, java.lang.Object> defaultConverter)  { throw new RuntimeException(); }
  /**
   * Convert an RDD of key-value pairs from internal types to serializable types suitable for
   * output, or vice versa.
   * @param rdd (undocumented)
   * @param keyConverterClass (undocumented)
   * @param valueConverterClass (undocumented)
   * @param defaultConverter (undocumented)
   * @return (undocumented)
   */
  static private <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> convertRDD (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, java.lang.String keyConverterClass, java.lang.String valueConverterClass, org.apache.spark.api.python.Converter<java.lang.Object, java.lang.Object> defaultConverter)  { throw new RuntimeException(); }
  /**
   * Output a Python RDD of key-value pairs as a Hadoop SequenceFile using the Writable types
   * we convert from the RDD's key and value types. Note that keys and values can't be
   * {@link org.apache.hadoop.io.Writable} types already, since Writables are not Java
   * <code>Serializable</code> and we can't peek at them. The <code>path</code> can be on any Hadoop file system.
   * @param pyRDD (undocumented)
   * @param batchSerialized (undocumented)
   * @param path (undocumented)
   * @param compressionCodecClass (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object, C extends org.apache.hadoop.io.compress.CompressionCodec> void saveAsSequenceFile (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batchSerialized, java.lang.String path, java.lang.String compressionCodecClass)  { throw new RuntimeException(); }
  /**
   * Output a Python RDD of key-value pairs to any Hadoop file system, using old Hadoop
   * <code>OutputFormat</code> in mapred package. Keys and values are converted to suitable output
   * types using either user specified converters or, if not specified,
   * {@link org.apache.spark.api.python.JavaToWritableConverter}. Post-conversion types
   * <code>keyClass</code> and <code>valueClass</code> are automatically inferred if not specified. The passed-in
   * <code>confAsMap</code> is merged with the default Hadoop conf associated with the SparkContext of
   * this RDD.
   * @param pyRDD (undocumented)
   * @param batchSerialized (undocumented)
   * @param path (undocumented)
   * @param outputFormatClass (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param keyConverterClass (undocumented)
   * @param valueConverterClass (undocumented)
   * @param confAsMap (undocumented)
   * @param compressionCodecClass (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapred.OutputFormat<?, ?>, C extends org.apache.hadoop.io.compress.CompressionCodec> void saveAsHadoopFile (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batchSerialized, java.lang.String path, java.lang.String outputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, java.lang.String compressionCodecClass)  { throw new RuntimeException(); }
  /**
   * Output a Python RDD of key-value pairs to any Hadoop file system, using new Hadoop
   * <code>OutputFormat</code> in mapreduce package. Keys and values are converted to suitable output
   * types using either user specified converters or, if not specified,
   * {@link org.apache.spark.api.python.JavaToWritableConverter}. Post-conversion types
   * <code>keyClass</code> and <code>valueClass</code> are automatically inferred if not specified. The passed-in
   * <code>confAsMap</code> is merged with the default Hadoop conf associated with the SparkContext of
   * this RDD.
   * @param pyRDD (undocumented)
   * @param batchSerialized (undocumented)
   * @param path (undocumented)
   * @param outputFormatClass (undocumented)
   * @param keyClass (undocumented)
   * @param valueClass (undocumented)
   * @param keyConverterClass (undocumented)
   * @param valueConverterClass (undocumented)
   * @param confAsMap (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.OutputFormat<?, ?>> void saveAsNewAPIHadoopFile (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batchSerialized, java.lang.String path, java.lang.String outputFormatClass, java.lang.String keyClass, java.lang.String valueClass, java.lang.String keyConverterClass, java.lang.String valueConverterClass, java.util.HashMap<java.lang.String, java.lang.String> confAsMap)  { throw new RuntimeException(); }
  /**
   * Output a Python RDD of key-value pairs to any Hadoop file system, using a Hadoop conf
   * converted from the passed-in <code>confAsMap</code>. The conf should set relevant output params (
   * e.g., output path, output format, etc), in the same way as it would be configured for
   * a Hadoop MapReduce job. Both old and new Hadoop OutputFormat APIs are supported
   * (mapred vs. mapreduce). Keys/values are converted for output using either user specified
   * converters or, by default, {@link org.apache.spark.api.python.JavaToWritableConverter}.
   * @param pyRDD (undocumented)
   * @param batchSerialized (undocumented)
   * @param confAsMap (undocumented)
   * @param keyConverterClass (undocumented)
   * @param valueConverterClass (undocumented)
   * @param useNewAPI (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> void saveAsHadoopDataset (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batchSerialized, java.util.HashMap<java.lang.String, java.lang.String> confAsMap, java.lang.String keyConverterClass, java.lang.String valueConverterClass, boolean useNewAPI)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.rdd.RDD<T> filter (scala.Function1<T, java.lang.Object> f)  { throw new RuntimeException(); }
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
  static public <U extends java.lang.Object> boolean mapPartitionsWithIndex$default$2 ()  { throw new RuntimeException(); }
  static public  boolean unpersist$default$1 ()  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> distinct$default$2 (int numPartitions)  { throw new RuntimeException(); }
  static public  boolean coalesce$default$2 ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.rdd.PartitionCoalescer> coalesce$default$3 ()  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> coalesce$default$4 (int numPartitions, boolean shuffle, scala.Option<org.apache.spark.rdd.PartitionCoalescer> partitionCoalescer)  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> repartition$default$2 (int numPartitions)  { throw new RuntimeException(); }
  static public  long sample$default$3 ()  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> intersection$default$3 (org.apache.spark.rdd.RDD<T> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> subtract$default$3 (org.apache.spark.rdd.RDD<T> other, org.apache.spark.Partitioner p)  { throw new RuntimeException(); }
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
  static public  long randomSplit$default$2 ()  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> boolean sortBy$default$2 ()  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> int sortBy$default$3 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> boolean mapPartitionsWithIndexInternal$default$2 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> boolean mapPartitionsInternal$default$2 ()  { throw new RuntimeException(); }
  public   PythonRDD (org.apache.spark.rdd.RDD<?> parent, org.apache.spark.api.python.PythonFunction func, boolean preservePartitoning)  { throw new RuntimeException(); }
  public  int bufferSize ()  { throw new RuntimeException(); }
  public  boolean reuse_worker ()  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.Partitioner> partitioner ()  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<byte[]> asJavaRDD ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<byte[]> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
