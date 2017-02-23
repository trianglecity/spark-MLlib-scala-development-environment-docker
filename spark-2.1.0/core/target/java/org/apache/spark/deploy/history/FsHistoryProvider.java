package org.apache.spark.deploy.history;
/**
 * A class that provides application history from event logs stored in the file system.
 * This provider checks for new finished applications in the background periodically and
 * renders the history application UI by parsing the associated event logs.
 * <p>
 * == How new and updated attempts are detected ==
 * <p>
 * - New attempts are detected in {@link checkForLogs}: the log dir is scanned, and any
 * entries in the log dir whose modification time is greater than the last scan time
 * are considered new or updated. These are replayed to create a new {@link FsApplicationAttemptInfo}
 * entry and update or create a matching {@link FsApplicationHistoryInfo} element in the list
 * of applications.
 * - Updated attempts are also found in {@link checkForLogs} -- if the attempt's log file has grown, the
 * {@link FsApplicationAttemptInfo} is replaced by another one with a larger log size.
 * - When {@link updateProbe()} is invoked to check if a loaded {@link SparkUI}
 * instance is out of date, the log size of the cached instance is checked against the app last
 * loaded by {@link checkForLogs}.
 * <p>
 * The use of log size, rather than simply relying on modification times, is needed to
 * address the following issues
 * - some filesystems do not appear to update the <code>modtime</code> value whenever data is flushed to
 * an open file output stream. Changes to the history may not be picked up.
 * - the granularity of the <code>modtime</code> field may be 2+ seconds. Rapid changes to the FS can be
 * missed.
 * <p>
 * Tracking filesize works given the following invariant: the logs get bigger
 * as new events are added. If a format was used in which this did not hold, the mechanism would
 * break. Simple streaming of JSON-formatted events, as is implemented today, implicitly
 * maintains this invariant.
 */
  class FsHistoryProvider extends org.apache.spark.deploy.history.ApplicationHistoryProvider implements org.apache.spark.internal.Logging {
  static public  java.lang.String DEFAULT_LOG_DIR ()  { throw new RuntimeException(); }
  static private  java.lang.String NOT_STARTED ()  { throw new RuntimeException(); }
  static private  java.lang.String SPARK_HISTORY_FS_NUM_REPLAY_THREADS ()  { throw new RuntimeException(); }
  static private  java.lang.String APPL_START_EVENT_PREFIX ()  { throw new RuntimeException(); }
  static private  java.lang.String APPL_END_EVENT_PREFIX ()  { throw new RuntimeException(); }
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
  public   FsHistoryProvider (org.apache.spark.SparkConf conf, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  public   FsHistoryProvider (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  private  long SAFEMODE_CHECK_INTERVAL_S ()  { throw new RuntimeException(); }
  private  long UPDATE_INTERVAL_S ()  { throw new RuntimeException(); }
  private  long CLEAN_INTERVAL_S ()  { throw new RuntimeException(); }
  private  int NUM_PROCESSING_THREADS ()  { throw new RuntimeException(); }
  private  java.lang.String logDir ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fs ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledExecutorService pool ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicLong lastScanTime ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.LinkedHashMap<java.lang.String, org.apache.spark.deploy.history.FsApplicationHistoryInfo> applications ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<org.apache.hadoop.fs.Path, org.apache.spark.deploy.history.FsApplicationAttemptInfo> fileToAppInfo ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ListBuffer<org.apache.spark.deploy.history.FsApplicationAttemptInfo> attemptsToClean ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicInteger pendingReplayTasksCount ()  { throw new RuntimeException(); }
  /**
   * Return a runnable that performs the given operation on the event logs.
   * This operation is expected to be executed periodically.
   * @param operateFun (undocumented)
   * @return (undocumented)
   */
  private  java.lang.Runnable getRunner (scala.Function0<scala.runtime.BoxedUnit> operateFun)  { throw new RuntimeException(); }
  /**
   * Fixed size thread pool to fetch and parse log files.
   * @return (undocumented)
   */
  private  java.util.concurrent.ExecutorService replayExecutor ()  { throw new RuntimeException(); }
  public  java.lang.Thread initThread ()  { throw new RuntimeException(); }
    java.lang.Thread initialize ()  { throw new RuntimeException(); }
    java.lang.Thread startSafeModeCheckThread (scala.Option<java.lang.Thread.UncaughtExceptionHandler> errorHandler)  { throw new RuntimeException(); }
  private  void startPolling ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.deploy.history.FsApplicationHistoryInfo> getListing ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.deploy.history.FsApplicationHistoryInfo> getApplicationInfo (java.lang.String appId)  { throw new RuntimeException(); }
  public  int getEventLogsUnderProcess ()  { throw new RuntimeException(); }
  public  long getLastUpdatedTime ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.deploy.history.LoadedAppUI> getAppUI (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> getEmptyListingHtml ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getConfig ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Builds the application list based on the current contents of the log directory.
   * Tries to reuse as much of the data already in memory as possible, by not reading
   * applications that haven't been updated since last time the logs were checked.
   */
    void checkForLogs ()  { throw new RuntimeException(); }
  private  long getNewLastScanTime ()  { throw new RuntimeException(); }
  public  void writeEventLogs (java.lang.String appId, scala.Option<java.lang.String> attemptId, java.util.zip.ZipOutputStream zipStream)  { throw new RuntimeException(); }
  /**
   * Replay the log files in the list and merge the list of old applications with new ones
   * @param fileStatus (undocumented)
   */
  private  void mergeApplicationListing (org.apache.hadoop.fs.FileStatus fileStatus)  { throw new RuntimeException(); }
  /**
   * Delete event logs from the log directory according to the clean policy defined by the user.
   */
    void cleanLogs ()  { throw new RuntimeException(); }
  /**
   * Comparison function that defines the sort order for the application listing.
   * <p>
   * @return Whether <code>i1</code> should precede <code>i2</code>.
   * @param i1 (undocumented)
   * @param i2 (undocumented)
   */
  private  boolean compareAppInfo (org.apache.spark.deploy.history.FsApplicationHistoryInfo i1, org.apache.spark.deploy.history.FsApplicationHistoryInfo i2)  { throw new RuntimeException(); }
  /**
   * Comparison function that defines the sort order for application attempts within the same
   * application. Order is: attempts are sorted by descending start time.
   * Most recent attempt state matches with current state of the app.
   * <p>
   * Normally applications should have a single running attempt; but failure to call sc.stop()
   * may cause multiple running attempts to show up.
   * <p>
   * @return Whether <code>a1</code> should precede <code>a2</code>.
   * @param a1 (undocumented)
   * @param a2 (undocumented)
   */
  private  boolean compareAttemptInfo (org.apache.spark.deploy.history.FsApplicationAttemptInfo a1, org.apache.spark.deploy.history.FsApplicationAttemptInfo a2)  { throw new RuntimeException(); }
  /**
   * Replays the events in the specified log file on the supplied <code>ReplayListenerBus</code>. Returns
   * an <code>ApplicationEventListener</code> instance with event data captured from the replay.
   * <code>ReplayEventsFilter</code> determines what events are replayed and can therefore limit the
   * data captured in the returned <code>ApplicationEventListener</code> instance.
   * @param eventLog (undocumented)
   * @param appCompleted (undocumented)
   * @param bus (undocumented)
   * @param eventsFilter (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.scheduler.ApplicationEventListener replay (org.apache.hadoop.fs.FileStatus eventLog, boolean appCompleted, org.apache.spark.scheduler.ReplayListenerBus bus, scala.Function1<java.lang.String, java.lang.Object> eventsFilter)  { throw new RuntimeException(); }
  /**
   * Return true when the application has completed.
   * @param entry (undocumented)
   * @return (undocumented)
   */
  private  boolean isApplicationCompleted (org.apache.hadoop.fs.FileStatus entry)  { throw new RuntimeException(); }
  /**
   * Checks whether HDFS is in safe mode.
   * <p>
   * Note that DistributedFileSystem is a <code>@LimitedPrivate</code> class, which for all practical reasons
   * makes it more public than not.
   * @return (undocumented)
   */
    boolean isFsInSafeMode ()  { throw new RuntimeException(); }
    boolean isFsInSafeMode (org.apache.hadoop.hdfs.DistributedFileSystem dfs)  { throw new RuntimeException(); }
  /**
   * String description for diagnostics
   * @return a summary of the component state
   */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Look up an application attempt
   * @param appId application ID
   * @param attemptId Attempt ID, if set
   * @return the matching attempt, if found
   */
  public  scala.Option<org.apache.spark.deploy.history.FsApplicationAttemptInfo> lookup (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  /**
   * Return true iff a newer version of the UI is available.  The check is based on whether the
   * fileSize for the currently loaded UI is smaller than the file size the last time
   * the logs were loaded.
   * <p>
   * This is a very cheap operation -- the work of loading the new attempt was already done
   * by {@link checkForLogs}.
   * @param appId application to probe
   * @param attemptId attempt to probe
   * @param prevFileSize the file size of the logs for the currently displayed UI
   * @return (undocumented)
   */
  private  boolean updateProbe (java.lang.String appId, scala.Option<java.lang.String> attemptId, long prevFileSize)  { throw new RuntimeException(); }
}
