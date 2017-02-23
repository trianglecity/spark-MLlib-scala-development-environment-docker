package org.apache.spark.rdd;
/**
 * An implementation of checkpointing that writes the RDD data to reliable storage.
 * This allows drivers to be restarted on failure with previously computed state.
 */
  class ReliableRDDCheckpointData<T extends java.lang.Object> extends org.apache.spark.rdd.RDDCheckpointData<T> implements org.apache.spark.internal.Logging {
  /** Return the path of the directory to which this RDD's checkpoint data is written. */
  static public  scala.Option<org.apache.hadoop.fs.Path> checkpointPath (org.apache.spark.SparkContext sc, int rddId)  { throw new RuntimeException(); }
  /** Clean up the files associated with the checkpoint data for this RDD. */
  static public  void cleanCheckpoint (org.apache.spark.SparkContext sc, int rddId)  { throw new RuntimeException(); }
  static protected  scala.Enumeration.Value cpState ()  { throw new RuntimeException(); }
  static protected  void cpState_$eq (scala.Enumeration.Value x$1)  { throw new RuntimeException(); }
  static public  boolean isCheckpointed ()  { throw new RuntimeException(); }
  static public final  void checkpoint ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.rdd.CheckpointRDD<T>> checkpointRDD ()  { throw new RuntimeException(); }
  static public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
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
  private  org.apache.spark.rdd.RDD<T> rdd ()  { throw new RuntimeException(); }
  // not preceding
  public   ReliableRDDCheckpointData (org.apache.spark.rdd.RDD<T> rdd, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  private  java.lang.String cpDir ()  { throw new RuntimeException(); }
  /**
   * Return the directory to which this RDD was checkpointed.
   * If the RDD is not checkpointed yet, return None.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> getCheckpointDir ()  { throw new RuntimeException(); }
  /**
   * Materialize this RDD and write its content to a reliable DFS.
   * This is called immediately after the first action invoked on this RDD has completed.
   * @return (undocumented)
   */
  protected  org.apache.spark.rdd.CheckpointRDD<T> doCheckpoint ()  { throw new RuntimeException(); }
}
