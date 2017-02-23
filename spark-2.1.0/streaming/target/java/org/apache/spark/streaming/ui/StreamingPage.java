package org.apache.spark.streaming.ui;
/** Page for Spark Web UI that shows statistics of a streaming job */
  class StreamingPage extends org.apache.spark.ui.WebUIPage implements org.apache.spark.internal.Logging {
  static public  java.lang.String BLACK_RIGHT_TRIANGLE_HTML ()  { throw new RuntimeException(); }
  static public  java.lang.String BLACK_DOWN_TRIANGLE_HTML ()  { throw new RuntimeException(); }
  static public  java.lang.String emptyCell ()  { throw new RuntimeException(); }
  /**
   * Returns a human-readable string representing a duration such as "5 second 35 ms"
   * @param msOption (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String formatDurationOption (scala.Option<java.lang.Object> msOption)  { throw new RuntimeException(); }
  static public  java.lang.String prefix ()  { throw new RuntimeException(); }
  static public  void prefix_$eq (java.lang.String x$1)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue renderJson (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
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
  public   StreamingPage (org.apache.spark.streaming.ui.StreamingTab parent)  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.ui.StreamingJobProgressListener listener ()  { throw new RuntimeException(); }
  private  long startTime ()  { throw new RuntimeException(); }
  /** Render the page */
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  /**
   * Generate html that will load css/js files for StreamingPage
   * @return (undocumented)
   */
  private  scala.collection.Seq<scala.xml.Node> generateLoadResources ()  { throw new RuntimeException(); }
  /** Generate basic information of the streaming program */
  private  scala.collection.Seq<scala.xml.Node> generateBasicInfo ()  { throw new RuntimeException(); }
  /**
   * Generate a global "timeFormat" dictionary in the JavaScript to store the time and its formatted
   * string. Because we cannot specify a timezone in JavaScript, to make sure the server and client
   * use the same timezone, we use the "timeFormat" dictionary to format all time values used in the
   * graphs.
   * <p>
   * @param times all time values that will be used in the graphs.
   * @return (undocumented)
   */
  private  scala.collection.Seq<scala.xml.Node> generateTimeMap (scala.collection.Seq<java.lang.Object> times)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> generateStatTable ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> generateInputDStreamsTable (org.apache.spark.streaming.ui.JsCollector jsCollector, long minX, long maxX, double minY, double maxY)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> generateInputDStreamRow (org.apache.spark.streaming.ui.JsCollector jsCollector, int streamId, scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> recordRates, long minX, long maxX, double minY, double maxY)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> generateBatchListTables ()  { throw new RuntimeException(); }
}
