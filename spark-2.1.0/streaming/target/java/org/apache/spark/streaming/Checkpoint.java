package org.apache.spark.streaming;
  class Checkpoint implements org.apache.spark.internal.Logging, java.io.Serializable {
  static public  java.lang.String PREFIX ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex REGEX ()  { throw new RuntimeException(); }
  /** Get the checkpoint file for the given checkpoint time */
  static public  org.apache.hadoop.fs.Path checkpointFile (java.lang.String checkpointDir, org.apache.spark.streaming.Time checkpointTime)  { throw new RuntimeException(); }
  /** Get the checkpoint backup file for the given checkpoint time */
  static public  org.apache.hadoop.fs.Path checkpointBackupFile (java.lang.String checkpointDir, org.apache.spark.streaming.Time checkpointTime)  { throw new RuntimeException(); }
  /**
   * @param checkpointDir checkpoint directory to read checkpoint files from
   * @return checkpoint files from the <code>checkpointDir</code> checkpoint directory, ordered by oldest-first
   * @param fsOption (undocumented)
   */
  static public  scala.collection.Seq<org.apache.hadoop.fs.Path> getCheckpointFiles (java.lang.String checkpointDir, scala.Option<org.apache.hadoop.fs.FileSystem> fsOption)  { throw new RuntimeException(); }
  /** Serialize the checkpoint, or throw any exception that occurs */
  static public  byte[] serialize (org.apache.spark.streaming.Checkpoint checkpoint, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /** Deserialize a checkpoint from the input stream, or throw any exception that occurs */
  static public  org.apache.spark.streaming.Checkpoint deserialize (java.io.InputStream inputStream, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
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
  public  org.apache.spark.streaming.Time checkpointTime ()  { throw new RuntimeException(); }
  // not preceding
  public   Checkpoint (org.apache.spark.streaming.StreamingContext ssc, org.apache.spark.streaming.Time checkpointTime)  { throw new RuntimeException(); }
  public  java.lang.String master ()  { throw new RuntimeException(); }
  public  java.lang.String framework ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> jars ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.DStreamGraph graph ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration checkpointDuration ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time[] pendingTimes ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, java.lang.String>[] sparkConfPairs ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf createSparkConf ()  { throw new RuntimeException(); }
  public  void validate ()  { throw new RuntimeException(); }
}
