package org.apache.spark.sql.execution.streaming;
public  class MemoryStream<A extends java.lang.Object> implements org.apache.spark.sql.execution.streaming.Source, org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  static protected  java.util.concurrent.atomic.AtomicInteger currentBlockId ()  { throw new RuntimeException(); }
  static protected  java.util.concurrent.atomic.AtomicInteger memoryStreamId ()  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> org.apache.spark.sql.execution.streaming.MemoryStream<A> apply (org.apache.spark.sql.Encoder<A> evidence$1, org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
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
  public  int id ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  // not preceding
  public   MemoryStream (int id, org.apache.spark.sql.SQLContext sqlContext, org.apache.spark.sql.Encoder<A> evidence$2)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<A> encoder ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.StreamingExecutionRelation logicalPlan ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  /**
   * All batches from <code>lastCommittedOffset + 1</code> to <code>currentOffset</code>, inclusive.
   * Stored in a ListBuffer to facilitate removing committed batches.
   * @return (undocumented)
   */
  protected  scala.collection.mutable.ListBuffer<org.apache.spark.sql.Dataset<A>> batches ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.LongOffset currentOffset ()  { throw new RuntimeException(); }
  /**
   * Last offset that was discarded, or -1 if no commits have occurred. Note that the value
   * -1 is used in calculations below and isn't just an arbitrary constant.
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.execution.streaming.LongOffset lastOffsetCommitted ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<A> toDS ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> toDF ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.Offset addData (scala.collection.Seq<A> data)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.Offset addData (scala.collection.TraversableOnce<A> data)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.streaming.Offset> getOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getBatch (scala.Option<org.apache.spark.sql.execution.streaming.Offset> start, org.apache.spark.sql.execution.streaming.Offset end)  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.execution.streaming.Offset end)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
}
