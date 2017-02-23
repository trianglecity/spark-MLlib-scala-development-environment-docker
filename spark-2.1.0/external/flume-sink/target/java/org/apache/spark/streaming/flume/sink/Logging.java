package org.apache.spark.streaming.flume.sink;
/**
 * Copy of the org.apache.spark.Logging for being used in the Spark Sink.
 * The org.apache.spark.Logging is not used so that all of Spark is not brought
 * in as a dependency.
 */
  interface Logging {
  public  org.slf4j.Logger _log ()  ;
  public  org.slf4j.Logger log ()  ;
  public  void logInfo (scala.Function0<java.lang.String> msg)  ;
  public  void logDebug (scala.Function0<java.lang.String> msg)  ;
  public  void logTrace (scala.Function0<java.lang.String> msg)  ;
  public  void logWarning (scala.Function0<java.lang.String> msg)  ;
  public  void logError (scala.Function0<java.lang.String> msg)  ;
  public  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  ;
  public  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  ;
  public  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  ;
  public  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  ;
  public  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  ;
  public  boolean isTraceEnabled ()  ;
  public  void initializeIfNecessary ()  ;
  public  void initializeLogging ()  ;
}
