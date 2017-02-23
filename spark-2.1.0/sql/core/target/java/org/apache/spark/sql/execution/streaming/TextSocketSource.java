package org.apache.spark.sql.execution.streaming;
/**
 * A source that reads text lines through a TCP socket, designed only for tutorials and debugging.
 * This source will *not* work in production applications due to multiple reasons, including no
 * support for fault recovery and keeping all of the text read in memory forever.
 */
public  class TextSocketSource implements org.apache.spark.sql.execution.streaming.Source, org.apache.spark.internal.Logging {
  static public  org.apache.spark.sql.types.StructType SCHEMA_REGULAR ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType SCHEMA_TIMESTAMP ()  { throw new RuntimeException(); }
  static public  java.text.SimpleDateFormat DATE_FORMAT ()  { throw new RuntimeException(); }
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
  public   TextSocketSource (java.lang.String host, int port, boolean includeTimestamp, org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
  private  java.net.Socket socket ()  { throw new RuntimeException(); }
  private  java.lang.Thread readThread ()  { throw new RuntimeException(); }
  /**
   * All batches from <code>lastCommittedOffset + 1</code> to <code>currentOffset</code>, inclusive.
   * Stored in a ListBuffer to facilitate removing committed batches.
   * @return (undocumented)
   */
  protected  scala.collection.mutable.ListBuffer<scala.Tuple2<java.lang.String, java.sql.Timestamp>> batches ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.LongOffset currentOffset ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.LongOffset lastOffsetCommitted ()  { throw new RuntimeException(); }
  private  void initialize ()  { throw new RuntimeException(); }
  /** Returns the schema of the data from this source */
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.streaming.Offset> getOffset ()  { throw new RuntimeException(); }
  /** Returns the data that is between the offsets (`start`, `end`]. */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getBatch (scala.Option<org.apache.spark.sql.execution.streaming.Offset> start, org.apache.spark.sql.execution.streaming.Offset end)  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.execution.streaming.Offset end)  { throw new RuntimeException(); }
  /** Stop this source. */
  public  void stop ()  { throw new RuntimeException(); }
}
