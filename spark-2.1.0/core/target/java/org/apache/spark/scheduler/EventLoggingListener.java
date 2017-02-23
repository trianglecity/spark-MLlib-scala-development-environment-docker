package org.apache.spark.scheduler;
/**
 * A SparkListener that logs events to persistent storage.
 * <p>
 * Event logging is specified by the following configurable parameters:
 *   spark.eventLog.enabled - Whether event logging is enabled.
 *   spark.eventLog.compress - Whether to compress logged events
 *   spark.eventLog.overwrite - Whether to overwrite any existing files.
 *   spark.eventLog.dir - Path to the directory in which events are logged.
 *   spark.eventLog.buffer.kb - Buffer size to use when writing to output streams
 */
  class EventLoggingListener extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.internal.Logging {
  static public  java.lang.String IN_PROGRESS ()  { throw new RuntimeException(); }
  static public  java.lang.String DEFAULT_LOG_DIR ()  { throw new RuntimeException(); }
  static private  org.apache.hadoop.fs.permission.FsPermission LOG_FILE_PERMISSIONS ()  { throw new RuntimeException(); }
  static private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.io.CompressionCodec> codecMap ()  { throw new RuntimeException(); }
  /**
   * Write metadata about an event log to the given stream.
   * The metadata is encoded in the first line of the event log as JSON.
   * <p>
   * @param logStream Raw output stream to the event log file.
   */
  static public  void initEventLog (java.io.OutputStream logStream)  { throw new RuntimeException(); }
  /**
   * Return a file-system-safe path to the log file for the given application.
   * <p>
   * Note that because we currently only create a single log file for each application,
   * we must encode all the information needed to parse this event log in the file name
   * instead of within the file itself. Otherwise, if the file is compressed, for instance,
   * we won't know which codec to use to decompress the metadata needed to open the file in
   * the first place.
   * <p>
   * The log file name will identify the compression codec used for the contents, if any.
   * For example, app_123 for an uncompressed log, app_123.lzf for an LZF-compressed log.
   * <p>
   * @param logBaseDir Directory where the log file will be written.
   * @param appId A unique app ID.
   * @param appAttemptId A unique attempt id of appId. May be the empty string.
   * @param compressionCodecName Name to identify the codec used to compress the contents
   *                             of the log, or None if compression is not enabled.
   * @return A path which consists of file-system-safe characters.
   */
  static public  java.lang.String getLogPath (java.net.URI logBaseDir, java.lang.String appId, scala.Option<java.lang.String> appAttemptId, scala.Option<java.lang.String> compressionCodecName)  { throw new RuntimeException(); }
  static private  java.lang.String sanitize (java.lang.String str)  { throw new RuntimeException(); }
  /**
   * Opens an event log file and returns an input stream that contains the event data.
   * <p>
   * @return input stream that holds one JSON record per line.
   * @param log (undocumented)
   * @param fs (undocumented)
   */
  static public  java.io.InputStream openEventLog (org.apache.hadoop.fs.Path log, org.apache.hadoop.fs.FileSystem fs)  { throw new RuntimeException(); }
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
  public   EventLoggingListener (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public   EventLoggingListener (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  private  boolean shouldCompress ()  { throw new RuntimeException(); }
  private  boolean shouldOverwrite ()  { throw new RuntimeException(); }
  private  boolean testing ()  { throw new RuntimeException(); }
  private  int outputBufferSize ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fileSystem ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.io.CompressionCodec> compressionCodec ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.String> compressionCodecName ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.hadoop.fs.FSDataOutputStream> hadoopDataStream ()  { throw new RuntimeException(); }
  private  scala.Option<java.io.PrintWriter> writer ()  { throw new RuntimeException(); }
    scala.collection.mutable.ArrayBuffer<org.json4s.JsonAST.JValue> loggedEvents ()  { throw new RuntimeException(); }
    java.lang.String logPath ()  { throw new RuntimeException(); }
  /**
   * Creates the log file in the configured log directory.
   */
  public  void start ()  { throw new RuntimeException(); }
  /** Log the event as JSON. */
  private  void logEvent (org.apache.spark.scheduler.SparkListenerEvent event, boolean flushLogger)  { throw new RuntimeException(); }
  public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted event)  { throw new RuntimeException(); }
  public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart event)  { throw new RuntimeException(); }
  public  void onTaskGettingResult (org.apache.spark.scheduler.SparkListenerTaskGettingResult event)  { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd event)  { throw new RuntimeException(); }
  public  void onEnvironmentUpdate (org.apache.spark.scheduler.SparkListenerEnvironmentUpdate event)  { throw new RuntimeException(); }
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted event)  { throw new RuntimeException(); }
  public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart event)  { throw new RuntimeException(); }
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd event)  { throw new RuntimeException(); }
  public  void onBlockManagerAdded (org.apache.spark.scheduler.SparkListenerBlockManagerAdded event)  { throw new RuntimeException(); }
  public  void onBlockManagerRemoved (org.apache.spark.scheduler.SparkListenerBlockManagerRemoved event)  { throw new RuntimeException(); }
  public  void onUnpersistRDD (org.apache.spark.scheduler.SparkListenerUnpersistRDD event)  { throw new RuntimeException(); }
  public  void onApplicationStart (org.apache.spark.scheduler.SparkListenerApplicationStart event)  { throw new RuntimeException(); }
  public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd event)  { throw new RuntimeException(); }
  public  void onExecutorAdded (org.apache.spark.scheduler.SparkListenerExecutorAdded event)  { throw new RuntimeException(); }
  public  void onExecutorRemoved (org.apache.spark.scheduler.SparkListenerExecutorRemoved event)  { throw new RuntimeException(); }
  public  void onBlockUpdated (org.apache.spark.scheduler.SparkListenerBlockUpdated event)  { throw new RuntimeException(); }
  public  void onExecutorMetricsUpdate (org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate event)  { throw new RuntimeException(); }
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  /**
   * Stop logging events. The event log file will be renamed so that it loses the
   * ".inprogress" suffix.
   */
  public  void stop ()  { throw new RuntimeException(); }
}
