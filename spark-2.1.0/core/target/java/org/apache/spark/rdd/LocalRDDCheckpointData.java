package org.apache.spark.rdd;
/**
 * An implementation of checkpointing implemented on top of Spark's caching layer.
 * <p>
 * Local checkpointing trades off fault tolerance for performance by skipping the expensive
 * step of saving the RDD data to a reliable and fault-tolerant storage. Instead, the data
 * is written to the local, ephemeral block storage that lives in each executor. This is useful
 * for use cases where RDDs build up long lineages that need to be truncated often (e.g. GraphX).
 */
  class LocalRDDCheckpointData<T extends java.lang.Object> extends org.apache.spark.rdd.RDDCheckpointData<T> implements org.apache.spark.internal.Logging {
  static public  org.apache.spark.storage.StorageLevel DEFAULT_STORAGE_LEVEL ()  { throw new RuntimeException(); }
  /**
   * Transform the specified storage level to one that uses disk.
   * <p>
   * This guarantees that the RDD can be recomputed multiple times correctly as long as
   * executors do not fail. Otherwise, if the RDD is cached in memory only, for instance,
   * the checkpoint data will be lost if the relevant block is evicted from memory.
   * <p>
   * This method is idempotent.
   * @param level (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.storage.StorageLevel transformStorageLevel (org.apache.spark.storage.StorageLevel level)  { throw new RuntimeException(); }
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
  public   LocalRDDCheckpointData (org.apache.spark.rdd.RDD<T> rdd, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * Ensure the RDD is fully cached so the partitions can be recovered later.
   * @return (undocumented)
   */
  protected  org.apache.spark.rdd.CheckpointRDD<T> doCheckpoint ()  { throw new RuntimeException(); }
}
