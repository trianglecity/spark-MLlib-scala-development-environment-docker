package org.apache.spark.scheduler;
/**
 * A SparkListenerBus that can be used to replay events from serialized event data.
 */
  class ReplayListenerBus implements org.apache.spark.scheduler.SparkListenerBus, org.apache.spark.internal.Logging {
  static public  scala.Function1<java.lang.String, java.lang.Object> SELECT_ALL_FILTER ()  { throw new RuntimeException(); }
  /**
   * Classes that were removed. Structured Streaming doesn't use them any more. However, parsing
   * old json may fail and we can just ignore these failures.
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Set<java.lang.String> KNOWN_REMOVED_CLASSES ()  { throw new RuntimeException(); }
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
  static   java.util.concurrent.CopyOnWriteArrayList<L> listeners ()  { throw new RuntimeException(); }
  static public final  void addListener (L listener)  { throw new RuntimeException(); }
  static public final  void removeListener (L listener)  { throw new RuntimeException(); }
  static public final  void postToAll (E event)  { throw new RuntimeException(); }
  static  <T extends L> scala.collection.Seq<T> findListenersByClass (scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  static protected  void doPostEvent (org.apache.spark.scheduler.SparkListenerInterface listener, org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  public   ReplayListenerBus ()  { throw new RuntimeException(); }
  /**
   * Replay each event in the order maintained in the given stream. The stream is expected to
   * contain one JSON-encoded SparkListenerEvent per line.
   * <p>
   * This method can be called multiple times, but the listener behavior is undefined after any
   * error is thrown by this method.
   * <p>
   * @param logData Stream containing event log data.
   * @param sourceName Filename (or other source identifier) from whence @logData is being read
   * @param maybeTruncated Indicate whether log file might be truncated (some abnormal situations
   *        encountered, log file might not finished writing) or not
   * @param eventsFilter Filter function to select JSON event strings in the log data stream that
   *        should be parsed and replayed. When not specified, all event strings in the log data
   *        are parsed and replayed.
   */
  public  void replay (java.io.InputStream logData, java.lang.String sourceName, boolean maybeTruncated, scala.Function1<java.lang.String, java.lang.Object> eventsFilter)  { throw new RuntimeException(); }
  /**
   * Overloaded variant of {@link replay()} which accepts an iterator of lines instead of an
   * {@link InputStream}. Exposed for use by custom ApplicationHistoryProvider implementations.
   * @param lines (undocumented)
   * @param sourceName (undocumented)
   * @param maybeTruncated (undocumented)
   * @param eventsFilter (undocumented)
   */
  public  void replay (scala.collection.Iterator<java.lang.String> lines, java.lang.String sourceName, boolean maybeTruncated, scala.Function1<java.lang.String, java.lang.Object> eventsFilter)  { throw new RuntimeException(); }
}
