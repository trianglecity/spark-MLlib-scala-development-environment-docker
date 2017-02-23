package org.apache.spark.streaming;
/**
 * Main entry point for Spark Streaming functionality. It provides methods used to create
 * {@link org.apache.spark.streaming.dstream.DStream}s from various input sources. It can be either
 * created by providing a Spark master URL and an appName, or from a org.apache.spark.SparkConf
 * configuration (see core Spark documentation), or from an existing org.apache.spark.SparkContext.
 * The associated SparkContext can be accessed using <code>context.sparkContext</code>. After
 * creating and transforming DStreams, the streaming computation can be started and stopped
 * using <code>context.start()</code> and <code>context.stop()</code>, respectively.
 * <code>context.awaitTermination()</code> allows the current thread to wait for the termination
 * of the context by <code>stop()</code> or by an exception.
 */
public  class StreamingContext implements org.apache.spark.internal.Logging {
  /**
   * Lock that guards activation of a StreamingContext as well as access to the singleton active
   * StreamingContext in getActiveOrCreate().
   * @return (undocumented)
   */
  static private  java.lang.Object ACTIVATION_LOCK ()  { throw new RuntimeException(); }
  static private  int SHUTDOWN_HOOK_PRIORITY ()  { throw new RuntimeException(); }
  static private  java.util.concurrent.atomic.AtomicReference<org.apache.spark.streaming.StreamingContext> activeContext ()  { throw new RuntimeException(); }
  static private  void assertNoOtherContextIsActive ()  { throw new RuntimeException(); }
  static private  void setActiveContext (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * <p>
   * Get the currently active context, if there is one. Active means started but not stopped.
   * @return (undocumented)
   */
  static public  scala.Option<org.apache.spark.streaming.StreamingContext> getActive ()  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * <p>
   * Either return the "active" StreamingContext (that is, started but not stopped), or create a
   * new StreamingContext that is
   * @param creatingFunc   Function to create a new StreamingContext
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.StreamingContext getActiveOrCreate (scala.Function0<org.apache.spark.streaming.StreamingContext> creatingFunc)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * <p>
   * Either get the currently active StreamingContext (that is, started but not stopped),
   * OR recreate a StreamingContext from checkpoint data in the given path. If checkpoint data
   * does not exist in the provided, then create a new StreamingContext by calling the provided
   * <code>creatingFunc</code>.
   * <p>
   * @param checkpointPath Checkpoint directory used in an earlier StreamingContext program
   * @param creatingFunc   Function to create a new StreamingContext
   * @param hadoopConf     Optional Hadoop configuration if necessary for reading from the
   *                       file system
   * @param createOnError  Optional, whether to create a new StreamingContext if there is an
   *                       error in reading checkpoint data. By default, an exception will be
   *                       thrown on error.
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.StreamingContext getActiveOrCreate (java.lang.String checkpointPath, scala.Function0<org.apache.spark.streaming.StreamingContext> creatingFunc, org.apache.hadoop.conf.Configuration hadoopConf, boolean createOnError)  { throw new RuntimeException(); }
  /**
   * Either recreate a StreamingContext from checkpoint data or create a new StreamingContext.
   * If checkpoint data exists in the provided <code>checkpointPath</code>, then StreamingContext will be
   * recreated from the checkpoint data. If the data does not exist, then the StreamingContext
   * will be created by called the provided <code>creatingFunc</code>.
   * <p>
   * @param checkpointPath Checkpoint directory used in an earlier StreamingContext program
   * @param creatingFunc   Function to create a new StreamingContext
   * @param hadoopConf     Optional Hadoop configuration if necessary for reading from the
   *                       file system
   * @param createOnError  Optional, whether to create a new StreamingContext if there is an
   *                       error in reading checkpoint data. By default, an exception will be
   *                       thrown on error.
   * @return (undocumented)
   */
  static public  org.apache.spark.streaming.StreamingContext getOrCreate (java.lang.String checkpointPath, scala.Function0<org.apache.spark.streaming.StreamingContext> creatingFunc, org.apache.hadoop.conf.Configuration hadoopConf, boolean createOnError)  { throw new RuntimeException(); }
  /**
   * Find the JAR from which a given class was loaded, to make it easy for users to pass
   * their JARs to StreamingContext.
   * @param cls (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<java.lang.String> jarOfClass (java.lang.Class<?> cls)  { throw new RuntimeException(); }
  static   org.apache.spark.SparkContext createNewSparkContext (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static   org.apache.spark.SparkContext createNewSparkContext (java.lang.String master, java.lang.String appName, java.lang.String sparkHome, scala.collection.Seq<java.lang.String> jars, scala.collection.Map<java.lang.String, java.lang.String> environment)  { throw new RuntimeException(); }
  static  <T extends java.lang.Object> java.lang.String rddToFileName (java.lang.String prefix, java.lang.String suffix, org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
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
     StreamingContext (org.apache.spark.SparkContext _sc, org.apache.spark.streaming.Checkpoint _cp, org.apache.spark.streaming.Duration _batchDur)  { throw new RuntimeException(); }
  /**
   * Create a StreamingContext using an existing SparkContext.
   * @param sparkContext existing SparkContext
   * @param batchDuration the time interval at which streaming data will be divided into batches
   */
  public   StreamingContext (org.apache.spark.SparkContext sparkContext, org.apache.spark.streaming.Duration batchDuration)  { throw new RuntimeException(); }
  /**
   * Create a StreamingContext by providing the configuration necessary for a new SparkContext.
   * @param conf a org.apache.spark.SparkConf object specifying Spark parameters
   * @param batchDuration the time interval at which streaming data will be divided into batches
   */
  public   StreamingContext (org.apache.spark.SparkConf conf, org.apache.spark.streaming.Duration batchDuration)  { throw new RuntimeException(); }
  /**
   * Create a StreamingContext by providing the details necessary for creating a new SparkContext.
   * @param master cluster URL to connect to (e.g. mesos://host:port, spark://host:port, local[4]).
   * @param appName a name for your job, to display on the cluster web UI
   * @param batchDuration the time interval at which streaming data will be divided into batches
   * @param sparkHome (undocumented)
   * @param jars (undocumented)
   * @param environment (undocumented)
   */
  public   StreamingContext (java.lang.String master, java.lang.String appName, org.apache.spark.streaming.Duration batchDuration, java.lang.String sparkHome, scala.collection.Seq<java.lang.String> jars, scala.collection.Map<java.lang.String, java.lang.String> environment)  { throw new RuntimeException(); }
  /**
   * Recreate a StreamingContext from a checkpoint file.
   * @param path Path to the directory that was specified as the checkpoint directory
   * @param hadoopConf Optional, configuration object if necessary for reading from
   *                   HDFS compatible filesystems
   */
  public   StreamingContext (java.lang.String path, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /**
   * Recreate a StreamingContext from a checkpoint file.
   * @param path Path to the directory that was specified as the checkpoint directory
   */
  public   StreamingContext (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Recreate a StreamingContext from a checkpoint file using an existing SparkContext.
   * @param path Path to the directory that was specified as the checkpoint directory
   * @param sparkContext Existing SparkContext
   */
  public   StreamingContext (java.lang.String path, org.apache.spark.SparkContext sparkContext)  { throw new RuntimeException(); }
    boolean isCheckpointPresent ()  { throw new RuntimeException(); }
    org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
    org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
    org.apache.spark.SparkEnv env ()  { throw new RuntimeException(); }
    org.apache.spark.streaming.DStreamGraph graph ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicInteger nextInputStreamId ()  { throw new RuntimeException(); }
    java.lang.String checkpointDir ()  { throw new RuntimeException(); }
    org.apache.spark.streaming.Duration checkpointDuration ()  { throw new RuntimeException(); }
    org.apache.spark.streaming.scheduler.JobScheduler scheduler ()  { throw new RuntimeException(); }
    org.apache.spark.streaming.ContextWaiter waiter ()  { throw new RuntimeException(); }
    org.apache.spark.streaming.ui.StreamingJobProgressListener progressListener ()  { throw new RuntimeException(); }
    scala.Option<org.apache.spark.streaming.ui.StreamingTab> uiTab ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.StreamingSource streamingSource ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.StreamingContextState state ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicReference<org.apache.spark.util.CallSite> startSite ()  { throw new RuntimeException(); }
    java.util.concurrent.atomic.AtomicReference<java.util.Properties> savedProperties ()  { throw new RuntimeException(); }
    org.apache.spark.util.CallSite getStartSite ()  { throw new RuntimeException(); }
  private  java.lang.Object shutdownHookRef ()  { throw new RuntimeException(); }
  /**
   * Return the associated Spark context
   * @return (undocumented)
   */
  public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  /**
   * Set each DStream in this context to remember RDDs it generated in the last given duration.
   * DStreams remember RDDs only for a limited duration of time and release them for garbage
   * collection. This method allows the developer to specify how long to remember the RDDs (
   * if the developer wishes to query old data outside the DStream computation).
   * @param duration Minimum duration that each DStream should remember its RDDs
   */
  public  void remember (org.apache.spark.streaming.Duration duration)  { throw new RuntimeException(); }
  /**
   * Set the context to periodically checkpoint the DStream operations for driver
   * fault-tolerance.
   * @param directory HDFS-compatible directory where the checkpoint data will be reliably stored.
   *                  Note that this must be a fault-tolerant file system like HDFS.
   */
  public  void checkpoint (java.lang.String directory)  { throw new RuntimeException(); }
    boolean isCheckpointingEnabled ()  { throw new RuntimeException(); }
    org.apache.spark.streaming.Checkpoint initialCheckpoint ()  { throw new RuntimeException(); }
    int getNewInputStreamId ()  { throw new RuntimeException(); }
  /**
   * Execute a block of code in a scope such that all new DStreams created in this body will
   * be part of the same scope. For more detail, see the comments in <code>doCompute</code>.
   * <p>
   * Note: Return statements are NOT allowed in the given body.
   * @param body (undocumented)
   * @return (undocumented)
   */
   <U extends java.lang.Object> U withScope (scala.Function0<U> body)  { throw new RuntimeException(); }
  /**
   * Execute a block of code in a scope such that all new DStreams created in this body will
   * be part of the same scope. For more detail, see the comments in <code>doCompute</code>.
   * <p>
   * Note: Return statements are NOT allowed in the given body.
   * @param name (undocumented)
   * @param body (undocumented)
   * @return (undocumented)
   */
   <U extends java.lang.Object> U withNamedScope (java.lang.String name, scala.Function0<U> body)  { throw new RuntimeException(); }
  /**
   * Create an input stream with any arbitrary user implemented receiver.
   * Find more details at http://spark.apache.org/docs/latest/streaming-custom-receivers.html
   * @param receiver Custom implementation of Receiver
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.ReceiverInputDStream<T> receiverStream (org.apache.spark.streaming.receiver.Receiver<T> receiver, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * Creates an input stream from TCP source hostname:port. Data is received using
   * a TCP socket and the receive bytes is interpreted as UTF8 encoded <code>\n</code> delimited
   * lines.
   * @param hostname      Hostname to connect to for receiving data
   * @param port          Port to connect to for receiving data
   * @param storageLevel  Storage level to use for storing the received objects
   *                      (default: StorageLevel.MEMORY_AND_DISK_SER_2)
   * @see socketStream
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.ReceiverInputDStream<java.lang.String> socketTextStream (java.lang.String hostname, int port, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /**
   * Creates an input stream from TCP source hostname:port. Data is received using
   * a TCP socket and the receive bytes it interpreted as object using the given
   * converter.
   * @param hostname      Hostname to connect to for receiving data
   * @param port          Port to connect to for receiving data
   * @param converter     Function to convert the byte stream to objects
   * @param storageLevel  Storage level to use for storing the received objects
   * @tparam T            Type of the objects received (after converting bytes to objects)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.ReceiverInputDStream<T> socketStream (java.lang.String hostname, int port, scala.Function1<java.io.InputStream, scala.collection.Iterator<T>> converter, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  /**
   * Create an input stream from network source hostname:port, where data is received
   * as serialized blocks (serialized using the Spark's serializer) that can be directly
   * pushed into the block manager without deserializing them. This is the most efficient
   * way to receive data.
   * @param hostname      Hostname to connect to for receiving data
   * @param port          Port to connect to for receiving data
   * @param storageLevel  Storage level to use for storing the received objects
   *                      (default: StorageLevel.MEMORY_AND_DISK_SER_2)
   * @tparam T            Type of the objects in the received blocks
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.ReceiverInputDStream<T> rawSocketStream (java.lang.String hostname, int port, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  /**
   * Create an input stream that monitors a Hadoop-compatible filesystem
   * for new files and reads them using the given key-value types and input format.
   * Files must be written to the monitored directory by "moving" them from another
   * location within the same file system. File names starting with . are ignored.
   * @param directory HDFS directory to monitor for new file
   * @tparam K Key type for reading HDFS file
   * @tparam V Value type for reading HDFS file
   * @tparam F Input format for reading HDFS file
   * @param evidence$4 (undocumented)
   * @param evidence$5 (undocumented)
   * @param evidence$6 (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> org.apache.spark.streaming.dstream.InputDStream<scala.Tuple2<K, V>> fileStream (java.lang.String directory, scala.reflect.ClassTag<K> evidence$4, scala.reflect.ClassTag<V> evidence$5, scala.reflect.ClassTag<F> evidence$6)  { throw new RuntimeException(); }
  /**
   * Create an input stream that monitors a Hadoop-compatible filesystem
   * for new files and reads them using the given key-value types and input format.
   * Files must be written to the monitored directory by "moving" them from another
   * location within the same file system.
   * @param directory HDFS directory to monitor for new file
   * @param filter Function to filter paths to process
   * @param newFilesOnly Should process only new files and ignore existing files in the directory
   * @tparam K Key type for reading HDFS file
   * @tparam V Value type for reading HDFS file
   * @tparam F Input format for reading HDFS file
   * @param evidence$7 (undocumented)
   * @param evidence$8 (undocumented)
   * @param evidence$9 (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> org.apache.spark.streaming.dstream.InputDStream<scala.Tuple2<K, V>> fileStream (java.lang.String directory, scala.Function1<org.apache.hadoop.fs.Path, java.lang.Object> filter, boolean newFilesOnly, scala.reflect.ClassTag<K> evidence$7, scala.reflect.ClassTag<V> evidence$8, scala.reflect.ClassTag<F> evidence$9)  { throw new RuntimeException(); }
  /**
   * Create an input stream that monitors a Hadoop-compatible filesystem
   * for new files and reads them using the given key-value types and input format.
   * Files must be written to the monitored directory by "moving" them from another
   * location within the same file system. File names starting with . are ignored.
   * @param directory HDFS directory to monitor for new file
   * @param filter Function to filter paths to process
   * @param newFilesOnly Should process only new files and ignore existing files in the directory
   * @param conf Hadoop configuration
   * @tparam K Key type for reading HDFS file
   * @tparam V Value type for reading HDFS file
   * @tparam F Input format for reading HDFS file
   * @param evidence$10 (undocumented)
   * @param evidence$11 (undocumented)
   * @param evidence$12 (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> org.apache.spark.streaming.dstream.InputDStream<scala.Tuple2<K, V>> fileStream (java.lang.String directory, scala.Function1<org.apache.hadoop.fs.Path, java.lang.Object> filter, boolean newFilesOnly, org.apache.hadoop.conf.Configuration conf, scala.reflect.ClassTag<K> evidence$10, scala.reflect.ClassTag<V> evidence$11, scala.reflect.ClassTag<F> evidence$12)  { throw new RuntimeException(); }
  /**
   * Create an input stream that monitors a Hadoop-compatible filesystem
   * for new files and reads them as text files (using key as LongWritable, value
   * as Text and input format as TextInputFormat). Files must be written to the
   * monitored directory by "moving" them from another location within the same
   * file system. File names starting with . are ignored.
   * @param directory HDFS directory to monitor for new file
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<java.lang.String> textFileStream (java.lang.String directory)  { throw new RuntimeException(); }
  /**
   * Create an input stream that monitors a Hadoop-compatible filesystem
   * for new files and reads them as flat binary files, assuming a fixed length per record,
   * generating one byte array per record. Files must be written to the monitored directory
   * by "moving" them from another location within the same file system. File names
   * starting with . are ignored.
   * <p>
   * @param directory HDFS directory to monitor for new file
   * @param recordLength length of each record in bytes
   * <p>
   * @note We ensure that the byte array for each record in the
   * resulting RDDs of the DStream has the provided record length.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<byte[]> binaryRecordsStream (java.lang.String directory, int recordLength)  { throw new RuntimeException(); }
  /**
   * Create an input stream from a queue of RDDs. In each batch,
   * it will process either one or all of the RDDs returned by the queue.
   * <p>
   * @param queue      Queue of RDDs. Modifications to this data structure must be synchronized.
   * @param oneAtATime Whether only one RDD should be consumed from the queue in every interval
   * @tparam T         Type of objects in the RDD
   * <p>
   * @note Arbitrary RDDs can be added to <code>queueStream</code>, there is no way to recover data of
   * those RDDs, so <code>queueStream</code> doesn't support checkpointing.
   * @param evidence$13 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.InputDStream<T> queueStream (scala.collection.mutable.Queue<org.apache.spark.rdd.RDD<T>> queue, boolean oneAtATime, scala.reflect.ClassTag<T> evidence$13)  { throw new RuntimeException(); }
  /**
   * Create an input stream from a queue of RDDs. In each batch,
   * it will process either one or all of the RDDs returned by the queue.
   * <p>
   * @param queue      Queue of RDDs. Modifications to this data structure must be synchronized.
   * @param oneAtATime Whether only one RDD should be consumed from the queue in every interval
   * @param defaultRDD Default RDD is returned by the DStream when the queue is empty.
   *                   Set as null if no RDD should be returned when empty
   * @tparam T         Type of objects in the RDD
   * <p>
   * @note Arbitrary RDDs can be added to <code>queueStream</code>, there is no way to recover data of
   * those RDDs, so <code>queueStream</code> doesn't support checkpointing.
   * @param evidence$14 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.InputDStream<T> queueStream (scala.collection.mutable.Queue<org.apache.spark.rdd.RDD<T>> queue, boolean oneAtATime, org.apache.spark.rdd.RDD<T> defaultRDD, scala.reflect.ClassTag<T> evidence$14)  { throw new RuntimeException(); }
  /**
   * Create a unified DStream from multiple DStreams of the same type and same slide duration.
   * @param streams (undocumented)
   * @param evidence$15 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<T> union (scala.collection.Seq<org.apache.spark.streaming.dstream.DStream<T>> streams, scala.reflect.ClassTag<T> evidence$15)  { throw new RuntimeException(); }
  /**
   * Create a new DStream in which each RDD is generated by applying a function on RDDs of
   * the DStreams.
   * @param dstreams (undocumented)
   * @param transformFunc (undocumented)
   * @param evidence$16 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<T> transform (scala.collection.Seq<org.apache.spark.streaming.dstream.DStream<?>> dstreams, scala.Function2<scala.collection.Seq<org.apache.spark.rdd.RDD<?>>, org.apache.spark.streaming.Time, org.apache.spark.rdd.RDD<T>> transformFunc, scala.reflect.ClassTag<T> evidence$16)  { throw new RuntimeException(); }
  /**
   * Add a {@link org.apache.spark.streaming.scheduler.StreamingListener} object for
   * receiving system events related to streaming.
   * @param streamingListener (undocumented)
   */
  public  void addStreamingListener (org.apache.spark.streaming.scheduler.StreamingListener streamingListener)  { throw new RuntimeException(); }
  private  void validate ()  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * <p>
   * Return the current state of the context. The context can be in three possible states -
   * <p>
   *  - StreamingContextState.INITIALIZED - The context has been created, but not started yet.
   *    Input DStreams, transformations and output operations can be created on the context.
   *  - StreamingContextState.ACTIVE - The context has been started, and not stopped.
   *    Input DStreams, transformations and output operations cannot be created on the context.
   *  - StreamingContextState.STOPPED - The context has been stopped and cannot be used any more.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.StreamingContextState getState ()  { throw new RuntimeException(); }
  /**
   * Start the execution of the streams.
   * <p>
   * @throws IllegalStateException if the StreamingContext is already stopped.
   */
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Wait for the execution to stop. Any exceptions that occurs during the execution
   * will be thrown in this thread.
   */
  public  void awaitTermination ()  { throw new RuntimeException(); }
  /**
   * Wait for the execution to stop. Any exceptions that occurs during the execution
   * will be thrown in this thread.
   * <p>
   * @param timeout time to wait in milliseconds
   * @return <code>true</code> if it's stopped; or throw the reported error during the execution; or <code>false</code>
   *         if the waiting time elapsed before returning from the method.
   */
  public  boolean awaitTerminationOrTimeout (long timeout)  { throw new RuntimeException(); }
  /**
   * Stop the execution of the streams immediately (does not wait for all received data
   * to be processed). By default, if <code>stopSparkContext</code> is not specified, the underlying
   * SparkContext will also be stopped. This implicit behavior can be configured using the
   * SparkConf configuration spark.streaming.stopSparkContextByDefault.
   * <p>
   * @param stopSparkContext If true, stops the associated SparkContext. The underlying SparkContext
   *                         will be stopped regardless of whether this StreamingContext has been
   *                         started.
   */
  public  void stop (boolean stopSparkContext)  { throw new RuntimeException(); }
  /**
   * Stop the execution of the streams, with option of ensuring all received data
   * has been processed.
   * <p>
   * @param stopSparkContext if true, stops the associated SparkContext. The underlying SparkContext
   *                         will be stopped regardless of whether this StreamingContext has been
   *                         started.
   * @param stopGracefully if true, stops gracefully by waiting for the processing of all
   *                       received data to be completed
   */
  public  void stop (boolean stopSparkContext, boolean stopGracefully)  { throw new RuntimeException(); }
  /**
   * Stop the execution of the streams, with option of ensuring all received data
   * has been processed.
   * <p>
   * @param stopSparkContext if true, stops the associated SparkContext. The underlying SparkContext
   *                         will be stopped regardless of whether this StreamingContext has been
   *                         started.
   * @param stopGracefully if true, stops gracefully by waiting for the processing of all
   *                       received data to be completed
   */
  private  void stopOnShutdown ()  { throw new RuntimeException(); }
}
