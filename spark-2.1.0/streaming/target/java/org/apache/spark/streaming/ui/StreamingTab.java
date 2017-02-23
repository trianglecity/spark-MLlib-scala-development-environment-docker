package org.apache.spark.streaming.ui;
/**
 * Spark Web UI tab that shows statistics of a streaming job.
 * This assumes the given SparkContext has enabled its SparkUI.
 */
  class StreamingTab extends org.apache.spark.ui.SparkUITab implements org.apache.spark.internal.Logging {
  static public  org.apache.spark.ui.SparkUI getSparkUI (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
  static public  java.lang.String prefix ()  { throw new RuntimeException(); }
  static public  scala.collection.mutable.ArrayBuffer<org.apache.spark.ui.WebUIPage> pages ()  { throw new RuntimeException(); }
  static public  java.lang.String name ()  { throw new RuntimeException(); }
  static public  void attachPage (org.apache.spark.ui.WebUIPage page)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.ui.WebUITab> headerTabs ()  { throw new RuntimeException(); }
  static public  java.lang.String basePath ()  { throw new RuntimeException(); }
  static public  java.lang.String appName ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
  // not preceding
  public   StreamingTab (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
  private  java.lang.String STATIC_RESOURCE_DIR ()  { throw new RuntimeException(); }
  public  org.apache.spark.ui.SparkUI parent ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.ui.StreamingJobProgressListener listener ()  { throw new RuntimeException(); }
  public  void attach ()  { throw new RuntimeException(); }
  public  void detach ()  { throw new RuntimeException(); }
}
