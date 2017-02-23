package org.apache.spark.sql.execution.streaming;
/**
 * A trigger executor that runs a batch every <code>intervalMs</code> milliseconds.
 */
public  class ProcessingTimeExecutor implements org.apache.spark.sql.execution.streaming.TriggerExecutor, org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
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
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.ProcessingTime processingTime ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  // not preceding
  public   ProcessingTimeExecutor (org.apache.spark.sql.streaming.ProcessingTime processingTime, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  private  long intervalMs ()  { throw new RuntimeException(); }
  public  void execute (scala.Function0<java.lang.Object> batchRunner)  { throw new RuntimeException(); }
  /** Called when a batch falls behind. Expose for test only */
  public  void notifyBatchFallingBehind (long realElapsedTimeMs)  { throw new RuntimeException(); }
  /**
   * Returns the start time in milliseconds for the next batch interval, given the current time.
   * Note that a batch interval is inclusive with respect to its start time, and thus calling
   * <code>nextBatchTime</code> with the result of a previous call should return the next interval. (i.e. given
   * an interval of <code>100 ms</code>, <code>nextBatchTime(nextBatchTime(0)) = 200</code> rather than <code>0</code>).
   * @param now (undocumented)
   * @return (undocumented)
   */
  public  long nextBatchTime (long now)  { throw new RuntimeException(); }
}
