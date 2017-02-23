package org.apache.spark.util.logging;
/**
 * Defines a {@link org.apache.spark.util.logging.RollingPolicy} by which files will be rolled
 * over after reaching a particular size.
 */
  class SizeBasedRollingPolicy implements org.apache.spark.util.logging.RollingPolicy, org.apache.spark.internal.Logging {
  static public  int MINIMUM_SIZE_BYTES ()  { throw new RuntimeException(); }
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
  public  long rolloverSizeBytes ()  { throw new RuntimeException(); }
  // not preceding
  public   SizeBasedRollingPolicy (long rolloverSizeBytes, boolean checkSizeConstraint)  { throw new RuntimeException(); }
  private  long bytesWrittenSinceRollover ()  { throw new RuntimeException(); }
  public  java.text.SimpleDateFormat formatter ()  { throw new RuntimeException(); }
  /** Should rollover if the next set of bytes is going to exceed the size limit */
  public  boolean shouldRollover (long bytesToBeWritten)  { throw new RuntimeException(); }
  /** Rollover has occurred, so reset the counter */
  public  void rolledOver ()  { throw new RuntimeException(); }
  /** Increment the bytes that have been written in the current file */
  public  void bytesWritten (long bytes)  { throw new RuntimeException(); }
  /** Get the desired name of the rollover file */
  public  java.lang.String generateRolledOverFileSuffix ()  { throw new RuntimeException(); }
}
