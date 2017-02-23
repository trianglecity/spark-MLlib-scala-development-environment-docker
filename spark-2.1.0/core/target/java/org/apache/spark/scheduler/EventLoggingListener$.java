package org.apache.spark.scheduler;
public  class EventLoggingListener$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EventLoggingListener$ MODULE$ = null;
  public   EventLoggingListener$ ()  { throw new RuntimeException(); }
  public  java.lang.String IN_PROGRESS ()  { throw new RuntimeException(); }
  public  java.lang.String DEFAULT_LOG_DIR ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.permission.FsPermission LOG_FILE_PERMISSIONS ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.io.CompressionCodec> codecMap ()  { throw new RuntimeException(); }
  /**
   * Write metadata about an event log to the given stream.
   * The metadata is encoded in the first line of the event log as JSON.
   * <p>
   * @param logStream Raw output stream to the event log file.
   */
  public  void initEventLog (java.io.OutputStream logStream)  { throw new RuntimeException(); }
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
  public  java.lang.String getLogPath (java.net.URI logBaseDir, java.lang.String appId, scala.Option<java.lang.String> appAttemptId, scala.Option<java.lang.String> compressionCodecName)  { throw new RuntimeException(); }
  private  java.lang.String sanitize (java.lang.String str)  { throw new RuntimeException(); }
  /**
   * Opens an event log file and returns an input stream that contains the event data.
   * <p>
   * @return input stream that holds one JSON record per line.
   * @param log (undocumented)
   * @param fs (undocumented)
   */
  public  java.io.InputStream openEventLog (org.apache.hadoop.fs.Path log, org.apache.hadoop.fs.FileSystem fs)  { throw new RuntimeException(); }
}
