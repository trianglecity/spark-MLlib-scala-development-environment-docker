package org.apache.spark.util.logging;
/**
 * Continuously appends the data from an input stream into the given file.
 */
  class FileAppender implements org.apache.spark.internal.Logging {
  /** Create the right appender based on Spark configuration */
  static public  org.apache.spark.util.logging.FileAppender apply (java.io.InputStream inputStream, java.io.File file, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
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
  public   FileAppender (java.io.InputStream inputStream, java.io.File file, int bufferSize)  { throw new RuntimeException(); }
  private  java.io.FileOutputStream outputStream ()  { throw new RuntimeException(); }
  private  boolean markedForStop ()  { throw new RuntimeException(); }
  private  java.lang.Thread writingThread ()  { throw new RuntimeException(); }
  /**
   * Wait for the appender to stop appending, either because input stream is closed
   * or because of any error in appending
   */
  public  void awaitTermination ()  { throw new RuntimeException(); }
  /** Stop the appender */
  public  void stop ()  { throw new RuntimeException(); }
  /** Continuously read chunks from the input stream and append to the file */
  protected  void appendStreamToFile ()  { throw new RuntimeException(); }
  /** Append bytes to the file output stream */
  protected  void appendToFile (byte[] bytes, int len)  { throw new RuntimeException(); }
  /** Open the file output stream */
  protected  void openFile ()  { throw new RuntimeException(); }
  /** Close the file output stream */
  protected  void closeFile ()  { throw new RuntimeException(); }
}
