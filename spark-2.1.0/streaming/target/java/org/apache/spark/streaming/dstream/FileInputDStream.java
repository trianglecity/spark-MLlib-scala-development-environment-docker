package org.apache.spark.streaming.dstream;
/**
 * This class represents an input stream that monitors a Hadoop-compatible filesystem for new
 * files and creates a stream out of them. The way it works as follows.
 * <p>
 * At each batch interval, the file system is queried for files in the given directory and
 * detected new files are selected for that batch. In this case "new" means files that
 * became visible to readers during that time period. Some extra care is needed to deal
 * with the fact that files may become visible after they are created. For this purpose, this
 * class remembers the information about the files selected in past batches for
 * a certain duration (say, "remember window") as shown in the figure below.
 * <p>
 * <pre><code>
 *                      |&lt;----- remember window -----&gt;|
 * ignore threshold ---&gt;|                             |&lt;--- current batch time
 *                      |____.____.____.____.____.____|
 *                      |    |    |    |    |    |    |
 * ---------------------|----|----|----|----|----|----|-----------------------&gt; Time
 *                      |____|____|____|____|____|____|
 *                             remembered batches
 * </code></pre>
 * <p>
 * The trailing end of the window is the "ignore threshold" and all files whose mod times
 * are less than this threshold are assumed to have already been selected and are therefore
 * ignored. Files whose mod times are within the "remember window" are checked against files
 * that have already been selected. At a high level, this is how new files are identified in
 * each batch - files whose mod times are greater than the ignore threshold and
 * have not been considered within the remember window. See the documentation on the method
 * <code>isNewFile</code> for more details.
 * <p>
 * This makes some assumptions from the underlying file system that the system is monitoring.
 * <p>
 *  - The clock of the file system is assumed to synchronized with the clock of the machine running
 *    the streaming app.
 *  - If a file is to be visible in the directory listings, it must be visible within a certain
 *    duration of the mod time of the file. This duration is the "remember window", which is set to
 *    1 minute (see <code>FileInputDStream.minRememberDuration</code>). Otherwise, the file will never be
 *    selected as the mod time will be less than the ignore threshold when it becomes visible.
 *  - Once a file is visible, the mod time cannot change. If it does due to appends, then the
 *    processing semantics are undefined.
 */
  class FileInputDStream<K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> extends org.apache.spark.streaming.dstream.InputDStream<scala.Tuple2<K, V>> {
  /**
   * A custom version of the DStreamCheckpointData that stores names of
   * Hadoop files as checkpoint data.
   */
    class FileInputDStreamCheckpointData extends org.apache.spark.streaming.dstream.DStreamCheckpointData<scala.Tuple2<K, V>> {
    public   FileInputDStreamCheckpointData ()  { throw new RuntimeException(); }
    private  scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, java.lang.String[]> hadoopFiles ()  { throw new RuntimeException(); }
    public  void update (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
    public  void cleanup (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
    public  void restore ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static public  boolean defaultFilter (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  /**
   * Calculate the number of last batches to remember, such that all the files selected in
   * at least last minRememberDurationS duration can be remembered.
   * @param batchDuration (undocumented)
   * @param minRememberDurationS (undocumented)
   * @return (undocumented)
   */
  static public  int calculateNumBatchesToRemember (org.apache.spark.streaming.Duration batchDuration, org.apache.spark.streaming.Duration minRememberDurationS)  { throw new RuntimeException(); }
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
  static   org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
  static   void ssc_$eq (org.apache.spark.streaming.StreamingContext x$1)  { throw new RuntimeException(); }
  static   scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, org.apache.spark.rdd.RDD<T>> generatedRDDs ()  { throw new RuntimeException(); }
  static   void generatedRDDs_$eq (scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, org.apache.spark.rdd.RDD<T>> x$1)  { throw new RuntimeException(); }
  static   org.apache.spark.streaming.Time zeroTime ()  { throw new RuntimeException(); }
  static   void zeroTime_$eq (org.apache.spark.streaming.Time x$1)  { throw new RuntimeException(); }
  static   org.apache.spark.streaming.Duration rememberDuration ()  { throw new RuntimeException(); }
  static   void rememberDuration_$eq (org.apache.spark.streaming.Duration x$1)  { throw new RuntimeException(); }
  static   org.apache.spark.storage.StorageLevel storageLevel ()  { throw new RuntimeException(); }
  static   void storageLevel_$eq (org.apache.spark.storage.StorageLevel x$1)  { throw new RuntimeException(); }
  static   boolean mustCheckpoint ()  { throw new RuntimeException(); }
  static   org.apache.spark.streaming.Duration checkpointDuration ()  { throw new RuntimeException(); }
  static   void checkpointDuration_$eq (org.apache.spark.streaming.Duration x$1)  { throw new RuntimeException(); }
  static   org.apache.spark.streaming.DStreamGraph graph ()  { throw new RuntimeException(); }
  static   void graph_$eq (org.apache.spark.streaming.DStreamGraph x$1)  { throw new RuntimeException(); }
  static   boolean isInitialized ()  { throw new RuntimeException(); }
  static   org.apache.spark.streaming.Duration parentRememberDuration ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.StreamingContext context ()  { throw new RuntimeException(); }
  static   org.apache.spark.util.CallSite creationSite ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<T> persist (org.apache.spark.storage.StorageLevel level)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<T> persist ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<T> cache ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<T> checkpoint (org.apache.spark.streaming.Duration interval)  { throw new RuntimeException(); }
  static   void initialize (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  static   void validateAtStart ()  { throw new RuntimeException(); }
  static   void setContext (org.apache.spark.streaming.StreamingContext s)  { throw new RuntimeException(); }
  static   void setGraph (org.apache.spark.streaming.DStreamGraph g)  { throw new RuntimeException(); }
  static   void remember (org.apache.spark.streaming.Duration duration)  { throw new RuntimeException(); }
  static  final  scala.Option<org.apache.spark.rdd.RDD<T>> getOrCompute (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  static protected <U extends java.lang.Object> U createRDDWithLocalProperties (org.apache.spark.streaming.Time time, boolean displayInnerRDDOps, scala.Function0<U> body)  { throw new RuntimeException(); }
  static   scala.Option<org.apache.spark.streaming.scheduler.Job> generateJob (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  static   void updateCheckpointData (org.apache.spark.streaming.Time currentTime)  { throw new RuntimeException(); }
  static   void clearCheckpointData (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  static   void restoreCheckpointData ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<U> map (scala.Function1<T, U> mapFunc, scala.reflect.ClassTag<U> evidence$2)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<U> flatMap (scala.Function1<T, scala.collection.TraversableOnce<U>> flatMapFunc, scala.reflect.ClassTag<U> evidence$3)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<T> filter (scala.Function1<T, java.lang.Object> filterFunc)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<java.lang.Object> glom ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<T> repartition (int numPartitions)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<U> mapPartitions (scala.Function1<scala.collection.Iterator<T>, scala.collection.Iterator<U>> mapPartFunc, boolean preservePartitioning, scala.reflect.ClassTag<U> evidence$4)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<T> reduce (scala.Function2<T, T, T> reduceFunc)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<java.lang.Object> count ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<T, java.lang.Object>> countByValue (int numPartitions, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  void foreachRDD (scala.Function1<org.apache.spark.rdd.RDD<T>, scala.runtime.BoxedUnit> foreachFunc)  { throw new RuntimeException(); }
  static public  void foreachRDD (scala.Function2<org.apache.spark.rdd.RDD<T>, org.apache.spark.streaming.Time, scala.runtime.BoxedUnit> foreachFunc)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<U> transform (scala.Function1<org.apache.spark.rdd.RDD<T>, org.apache.spark.rdd.RDD<U>> transformFunc, scala.reflect.ClassTag<U> evidence$5)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<U> transform (scala.Function2<org.apache.spark.rdd.RDD<T>, org.apache.spark.streaming.Time, org.apache.spark.rdd.RDD<U>> transformFunc, scala.reflect.ClassTag<U> evidence$6)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<V> transformWith (org.apache.spark.streaming.dstream.DStream<U> other, scala.Function2<org.apache.spark.rdd.RDD<T>, org.apache.spark.rdd.RDD<U>, org.apache.spark.rdd.RDD<V>> transformFunc, scala.reflect.ClassTag<U> evidence$7, scala.reflect.ClassTag<V> evidence$8)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<V> transformWith (org.apache.spark.streaming.dstream.DStream<U> other, scala.Function3<org.apache.spark.rdd.RDD<T>, org.apache.spark.rdd.RDD<U>, org.apache.spark.streaming.Time, org.apache.spark.rdd.RDD<V>> transformFunc, scala.reflect.ClassTag<U> evidence$9, scala.reflect.ClassTag<V> evidence$10)  { throw new RuntimeException(); }
  static public  void print ()  { throw new RuntimeException(); }
  static public  void print (int num)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<T> window (org.apache.spark.streaming.Duration windowDuration)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<T> window (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<T> reduceByWindow (scala.Function2<T, T, T> reduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<T> reduceByWindow (scala.Function2<T, T, T> reduceFunc, scala.Function2<T, T, T> invReduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<java.lang.Object> countByWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<T, java.lang.Object>> countByValueAndWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, int numPartitions, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<T> union (org.apache.spark.streaming.dstream.DStream<T> that)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.rdd.RDD<T>> slice (org.apache.spark.streaming.Interval interval)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.rdd.RDD<T>> slice (org.apache.spark.streaming.Time fromTime, org.apache.spark.streaming.Time toTime)  { throw new RuntimeException(); }
  static public  void saveAsObjectFiles (java.lang.String prefix, java.lang.String suffix)  { throw new RuntimeException(); }
  static public  void saveAsTextFiles (java.lang.String prefix, java.lang.String suffix)  { throw new RuntimeException(); }
  static   org.apache.spark.streaming.dstream.DStream<T> register ()  { throw new RuntimeException(); }
  static public  int countByValue$default$1 ()  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> countByValue$default$2 (int numPartitions)  { throw new RuntimeException(); }
  static public  int countByValueAndWindow$default$3 ()  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> countByValueAndWindow$default$4 (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, int numPartitions)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> boolean mapPartitions$default$2 ()  { throw new RuntimeException(); }
  static public  java.lang.String saveAsObjectFiles$default$2 ()  { throw new RuntimeException(); }
  static public  java.lang.String saveAsTextFiles$default$2 ()  { throw new RuntimeException(); }
  static   org.apache.spark.streaming.Time lastValidTime ()  { throw new RuntimeException(); }
  static   void lastValidTime_$eq (org.apache.spark.streaming.Time x$1)  { throw new RuntimeException(); }
  static public  int id ()  { throw new RuntimeException(); }
  static protected  scala.Option<org.apache.spark.streaming.scheduler.RateController> rateController ()  { throw new RuntimeException(); }
  static   java.lang.String name ()  { throw new RuntimeException(); }
  static protected  scala.Option<java.lang.String> baseScope ()  { throw new RuntimeException(); }
  static   boolean isTimeValid (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<?>> dependencies ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.Duration slideDuration ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Select(Select(Select(Select(Ident(org), org.apache), org.apache.hadoop), org.apache.hadoop.mapreduce), [org.apache.hadoop.mapreduce.InputFormat aka TypeName("NewInputFormat")]), List(TypeTree().setOriginal(Ident(TypeName("K"))), TypeTree().setOriginal(Ident(TypeName("V"))))))))
  public   FileInputDStream (org.apache.spark.streaming.StreamingContext _ssc, java.lang.String directory, scala.Function1<org.apache.hadoop.fs.Path, java.lang.Object> filter, boolean newFilesOnly, scala.Option<org.apache.hadoop.conf.Configuration> conf, scala.reflect.ClassTag<K> km, scala.reflect.ClassTag<V> vm, scala.reflect.ClassTag<F> fm)  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.util.SerializableConfiguration> serializableConfOpt ()  { throw new RuntimeException(); }
  /**
   * Minimum duration of remembering the information of selected files. Defaults to 60 seconds.
   * <p>
   * Files with mod times older than this "window" of remembering will be ignored. So if new
   * files are visible within this window, then the file will get selected in the next batch.
   * @return (undocumented)
   */
  private  org.apache.spark.streaming.Duration minRememberDurationS ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  protected  org.apache.spark.streaming.dstream.FileInputDStream<K, V, F>.FileInputDStreamCheckpointData checkpointData ()  { throw new RuntimeException(); }
  private  long initialModTimeIgnoreThreshold ()  { throw new RuntimeException(); }
  private  int numBatchesToRemember ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.Duration durationToRemember ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, java.lang.String[]> batchTimeToSelectedFiles ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.lang.String> recentlySelectedFiles ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.TimeStampedHashMap<java.lang.String, java.lang.Object> fileToModTime ()  { throw new RuntimeException(); }
  private  long lastNewFileFindingTime ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path _path ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem _fs ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Finds the files that were modified since the last time this method was called and makes
   * a union RDD out of them. Note that this maintains the list of files that were processed
   * in the latest modification time in the previous call to this method. This is because the
   * modification time returned by the FileStatus API seems to return times only at the
   * granularity of seconds. And new files may have the same modification time as the
   * latest modification time in the previous call to this method yet was not reported in
   * the previous call.
   * @param validTime (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.rdd.RDD<scala.Tuple2<K, V>>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
  /** Clear the old time-to-files mappings along with old RDDs */
  protected  void clearMetadata (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  /**
   * Find new files for the batch of <code>currentTime</code>. This is done by first calculating the
   * ignore threshold for file mod times, and then getting a list of files filtered based on
   * the current batch time and the ignore threshold. The ignore threshold is the max of
   * initial ignore threshold and the trailing end of the remember window (that is, which ever
   * is later in time).
   * @param currentTime (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String[] findNewFiles (long currentTime)  { throw new RuntimeException(); }
  /**
   * Identify whether the given <code>path</code> is a new file for the batch of <code>currentTime</code>. For it to be
   * accepted, it has to pass the following criteria.
   * - It must pass the user-provided file filter.
   * - It must be newer than the ignore threshold. It is assumed that files older than the ignore
   *   threshold have already been considered or are existing files before start
   *   (when newFileOnly = true).
   * - It must not be present in the recently selected files that this class remembers.
   * - It must not be newer than the time of the batch (i.e. <code>currentTime</code> for which this
   *   file is being tested. This can occur if the driver was recovered, and the missing batches
   *   (during downtime) are being generated. In that case, a batch of time T may be generated
   *   at time T+x. Say x = 5. If that batch T contains file of mod time T+5, then bad things can
   *   happen. Let's say the selected files are remembered for 60 seconds.  At time t+61,
   *   the batch of time t is forgotten, and the ignore threshold is still T+1.
   *   The files with mod time T+5 are not remembered and cannot be ignored (since, t+5 > t+1).
   *   Hence they can get selected as new files again. To prevent this, files whose mod time is more
   *   than current batch time are not considered.
   * @param path (undocumented)
   * @param currentTime (undocumented)
   * @param modTimeIgnoreThreshold (undocumented)
   * @return (undocumented)
   */
  private  boolean isNewFile (org.apache.hadoop.fs.Path path, long currentTime, long modTimeIgnoreThreshold)  { throw new RuntimeException(); }
  /** Generate one RDD from an array of files */
  private  org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> filesToRDD (scala.collection.Seq<java.lang.String> files)  { throw new RuntimeException(); }
  /** Get file mod time from cache or fetch it from the file system */
  private  long getFileModTime (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path directoryPath ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fs ()  { throw new RuntimeException(); }
  private  void reset ()  { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream ois) throws java.io.IOException { throw new RuntimeException(); }
}
