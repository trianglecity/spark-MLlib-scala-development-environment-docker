package org.apache.spark.util.logging;
/**
 * Defines a {@link org.apache.spark.util.logging.RollingPolicy} by which files will be rolled
 * over at a fixed interval.
 */
  class TimeBasedRollingPolicy implements org.apache.spark.util.logging.RollingPolicy, org.apache.spark.internal.Logging {
  static public  long MINIMUM_INTERVAL_SECONDS ()  { throw new RuntimeException(); }
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
  public  long rolloverIntervalMillis ()  { throw new RuntimeException(); }
  // not preceding
  public   TimeBasedRollingPolicy (long rolloverIntervalMillis, java.lang.String rollingFileSuffixPattern, boolean checkIntervalConstraint)  { throw new RuntimeException(); }
  private  long nextRolloverTime ()  { throw new RuntimeException(); }
  private  java.text.SimpleDateFormat formatter ()  { throw new RuntimeException(); }
  /** Should rollover if current time has exceeded next rollover time */
  public  boolean shouldRollover (long bytesToBeWritten)  { throw new RuntimeException(); }
  /** Rollover has occurred, so find the next time to rollover */
  public  void rolledOver ()  { throw new RuntimeException(); }
  public  void bytesWritten (long bytes)  { throw new RuntimeException(); }
  private  long calculateNextRolloverTime ()  { throw new RuntimeException(); }
  public  java.lang.String generateRolledOverFileSuffix ()  { throw new RuntimeException(); }
}
