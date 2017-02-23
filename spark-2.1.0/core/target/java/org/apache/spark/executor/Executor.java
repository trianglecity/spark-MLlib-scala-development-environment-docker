package org.apache.spark.executor;
/**
 * Spark executor, backed by a threadpool to run tasks.
 * <p>
 * This can be used with Mesos, YARN, and the standalone scheduler.
 * An internal RPC interface is used for communication with the driver,
 * except in the case of Mesos fine-grained mode.
 */
  class Executor implements org.apache.spark.internal.Logging {
  public  class TaskRunner implements java.lang.Runnable {
    public  long taskId ()  { throw new RuntimeException(); }
    public  int attemptNumber ()  { throw new RuntimeException(); }
    // not preceding
    public   TaskRunner (org.apache.spark.executor.ExecutorBackend execBackend, long taskId, int attemptNumber, java.lang.String taskName, java.nio.ByteBuffer serializedTask)  { throw new RuntimeException(); }
    /** Whether this task has been killed. */
    private  boolean killed ()  { throw new RuntimeException(); }
    /** Whether this task has been finished. */
    private  boolean finished ()  { throw new RuntimeException(); }
    /** How much the JVM process has spent in GC when the task starts to run. */
    public  long startGCTime ()  { throw new RuntimeException(); }
    /**
     * The task to run. This will be set in run() by deserializing the task binary coming
     * from the driver. Once it is set, it will never be changed.
     * @return (undocumented)
     */
    public  org.apache.spark.scheduler.Task<java.lang.Object> task ()  { throw new RuntimeException(); }
    public  void kill (boolean interruptThread)  { throw new RuntimeException(); }
    /**
     * Set the finished flag to true and clear the current thread's interrupt status
     */
    private  void setTaskFinishedAndClearInterruptStatus ()  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
  }
  static public  java.lang.ThreadLocal<java.util.Properties> taskDeserializationProps ()  { throw new RuntimeException(); }
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
  public   Executor (java.lang.String executorId, java.lang.String executorHostname, org.apache.spark.SparkEnv env, scala.collection.Seq<java.net.URL> userClassPath, boolean isLocal)  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> currentFiles ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> currentJars ()  { throw new RuntimeException(); }
  private  java.nio.ByteBuffer EMPTY_BYTE_BUFFER ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ThreadPoolExecutor threadPool ()  { throw new RuntimeException(); }
  private  org.apache.spark.executor.ExecutorSource executorSource ()  { throw new RuntimeException(); }
  private  boolean userClassPathFirst ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.MutableURLClassLoader urlClassLoader ()  { throw new RuntimeException(); }
  private  java.lang.ClassLoader replClassLoader ()  { throw new RuntimeException(); }
  private  long maxDirectResultSize ()  { throw new RuntimeException(); }
  private  long maxResultSize ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<java.lang.Object, org.apache.spark.executor.Executor.TaskRunner> runningTasks ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledExecutorService heartbeater ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef heartbeatReceiverRef ()  { throw new RuntimeException(); }
  /**
   * When an executor is unable to send heartbeats to the driver more than <code>HEARTBEAT_MAX_FAILURES</code>
   * times, it should kill itself. The default value is 60. It means we will retry to send
   * heartbeats about 10 minutes because the heartbeat interval is 10s.
   * @return (undocumented)
   */
  private  int HEARTBEAT_MAX_FAILURES ()  { throw new RuntimeException(); }
  /**
   * Count the failure times of heartbeat. It should only be accessed in the heartbeat thread. Each
   * successful heartbeat will reset it to 0.
   * @return (undocumented)
   */
  private  int heartbeatFailures ()  { throw new RuntimeException(); }
  public  void launchTask (org.apache.spark.executor.ExecutorBackend context, long taskId, int attemptNumber, java.lang.String taskName, java.nio.ByteBuffer serializedTask)  { throw new RuntimeException(); }
  public  void killTask (long taskId, boolean interruptThread)  { throw new RuntimeException(); }
  /**
   * Function to kill the running tasks in an executor.
   * This can be called by executor back-ends to kill the
   * tasks instead of taking the JVM down.
   * @param interruptThread whether to interrupt the task thread
   */
  public  void killAllTasks (boolean interruptThread)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /** Returns the total amount of time this JVM process has spent in garbage collection. */
  private  long computeTotalGcTime ()  { throw new RuntimeException(); }
  /**
   * Create a ClassLoader for use in tasks, adding any JARs specified by the user or any classes
   * created by the interpreter to the search path
   * @return (undocumented)
   */
  private  org.apache.spark.util.MutableURLClassLoader createClassLoader ()  { throw new RuntimeException(); }
  /**
   * If the REPL is in use, add another ClassLoader that will read
   * new classes defined by the REPL as the user types code
   * @param parent (undocumented)
   * @return (undocumented)
   */
  private  java.lang.ClassLoader addReplClassLoaderIfNeeded (java.lang.ClassLoader parent)  { throw new RuntimeException(); }
  /**
   * Download any missing dependencies if we receive a new set of files and JARs from the
   * SparkContext. Also adds any new JARs we fetched to the class loader.
   * @param newFiles (undocumented)
   * @param newJars (undocumented)
   */
  private  void updateDependencies (scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> newFiles, scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> newJars)  { throw new RuntimeException(); }
  /** Reports heartbeat and metrics for active tasks to the driver. */
  private  void reportHeartBeat ()  { throw new RuntimeException(); }
  /**
   * Schedules a task to report heartbeat and partial metrics for active tasks to driver.
   */
  private  void startDriverHeartbeater ()  { throw new RuntimeException(); }
}
