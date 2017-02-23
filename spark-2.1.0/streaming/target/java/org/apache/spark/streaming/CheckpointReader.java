package org.apache.spark.streaming;
public  class CheckpointReader {
  /**
   * Read checkpoint files present in the given checkpoint directory. If there are no checkpoint
   * files, then return None, else try to return the latest valid checkpoint object. If no
   * checkpoint files could be read correctly, then return None.
   * @param checkpointDir (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<org.apache.spark.streaming.Checkpoint> read (java.lang.String checkpointDir)  { throw new RuntimeException(); }
  /**
   * Read checkpoint files present in the given checkpoint directory. If there are no checkpoint
   * files, then return None, else try to return the latest valid checkpoint object. If no
   * checkpoint files could be read correctly, then return None (if ignoreReadError = true),
   * or throw exception (if ignoreReadError = false).
   * @param checkpointDir (undocumented)
   * @param conf (undocumented)
   * @param hadoopConf (undocumented)
   * @param ignoreReadError (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<org.apache.spark.streaming.Checkpoint> read (java.lang.String checkpointDir, org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf, boolean ignoreReadError)  { throw new RuntimeException(); }
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
}
