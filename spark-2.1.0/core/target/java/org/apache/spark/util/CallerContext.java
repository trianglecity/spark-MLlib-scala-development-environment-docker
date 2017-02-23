package org.apache.spark.util;
  class CallerContext implements org.apache.spark.internal.Logging {
  static public  boolean callerContextSupported ()  { throw new RuntimeException(); }
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
  public   CallerContext (java.lang.String from, scala.Option<java.lang.String> appId, scala.Option<java.lang.String> appAttemptId, scala.Option<java.lang.Object> jobId, scala.Option<java.lang.Object> stageId, scala.Option<java.lang.Object> stageAttemptId, scala.Option<java.lang.Object> taskId, scala.Option<java.lang.Object> taskAttemptNumber)  { throw new RuntimeException(); }
  public  java.lang.String appIdStr ()  { throw new RuntimeException(); }
  public  java.lang.String appAttemptIdStr ()  { throw new RuntimeException(); }
  public  java.lang.String jobIdStr ()  { throw new RuntimeException(); }
  public  java.lang.String stageIdStr ()  { throw new RuntimeException(); }
  public  java.lang.String stageAttemptIdStr ()  { throw new RuntimeException(); }
  public  java.lang.String taskIdStr ()  { throw new RuntimeException(); }
  public  java.lang.String taskAttemptNumberStr ()  { throw new RuntimeException(); }
  public  java.lang.String context ()  { throw new RuntimeException(); }
  /**
   * Set up the caller context {@link context} by invoking Hadoop CallerContext API of
   * {@link org.apache.hadoop.ipc.CallerContext}, which was added in hadoop 2.8.
   */
  public  void setCurrentContext ()  { throw new RuntimeException(); }
}
