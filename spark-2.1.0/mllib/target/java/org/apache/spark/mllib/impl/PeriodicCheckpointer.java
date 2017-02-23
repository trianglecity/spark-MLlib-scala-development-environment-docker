package org.apache.spark.mllib.impl;
/**
 * This abstraction helps with persisting and checkpointing RDDs and types derived from RDDs
 * (such as Graphs and DataFrames).  In documentation, we use the phrase "Dataset" to refer to
 * the distributed data type (RDD, Graph, etc.).
 * <p>
 * Specifically, this abstraction automatically handles persisting and (optionally) checkpointing,
 * as well as unpersisting and removing checkpoint files.
 * <p>
 * Users should call update() when a new Dataset has been created,
 * before the Dataset has been materialized.  After updating {@link PeriodicCheckpointer}, users are
 * responsible for materializing the Dataset to ensure that persisting and checkpointing actually
 * occur.
 * <p>
 * When update() is called, this does the following:
 *  - Persist new Dataset (if not yet persisted), and put in queue of persisted Datasets.
 *  - Unpersist Datasets from queue until there are at most 3 persisted Datasets.
 *  - If using checkpointing and the checkpoint interval has been reached,
 *     - Checkpoint the new Dataset, and put in a queue of checkpointed Datasets.
 *     - Remove older checkpoints.
 * <p>
 * WARNINGS:
 *  - This class should NOT be copied (since copies may conflict on which Datasets should be
 *    checkpointed).
 *  - This class removes checkpoint files once later Datasets have been checkpointed.
 *    However, references to the older Datasets will still return isCheckpointed = true.
 * <p>
 * param:  checkpointInterval  Datasets will be checkpointed at this interval.
 *                            If this interval was set as -1, then checkpointing will be disabled.
 * param:  sc  SparkContext for the Datasets given to this checkpointer
 * @tparam T  Dataset type, such as RDD[Double]
 */
 abstract class PeriodicCheckpointer<T extends java.lang.Object> implements org.apache.spark.internal.Logging {
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
  public  int checkpointInterval ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  // not preceding
  public   PeriodicCheckpointer (int checkpointInterval, org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /** FIFO queue of past checkpointed Datasets */
  private  scala.collection.mutable.Queue<T> checkpointQueue ()  { throw new RuntimeException(); }
  /** FIFO queue of past persisted Datasets */
  private  scala.collection.mutable.Queue<T> persistedQueue ()  { throw new RuntimeException(); }
  /** Number of times {@link update()} has been called */
  private  int updateCount ()  { throw new RuntimeException(); }
  /**
   * Update with a new Dataset. Handle persistence and checkpointing as needed.
   * Since this handles persistence and checkpointing, this should be called before the Dataset
   * has been materialized.
   * <p>
   * @param newData  New Dataset created from previous Datasets in the lineage.
   */
  public  void update (T newData)  { throw new RuntimeException(); }
  /** Checkpoint the Dataset */
  protected abstract  void checkpoint (T data)  ;
  /** Return true iff the Dataset is checkpointed */
  protected abstract  boolean isCheckpointed (T data)  ;
  /**
   * Persist the Dataset.
   * Note: This should handle checking the current {@link StorageLevel} of the Dataset.
   * @param data (undocumented)
   */
  protected abstract  void persist (T data)  ;
  /** Unpersist the Dataset */
  protected abstract  void unpersist (T data)  ;
  /** Get list of checkpoint files for this given Dataset */
  protected abstract  scala.collection.Iterable<java.lang.String> getCheckpointFiles (T data)  ;
  /**
   * Call this at the end to delete any remaining checkpoint files.
   */
  public  void deleteAllCheckpoints ()  { throw new RuntimeException(); }
  /**
   * Call this at the end to delete any remaining checkpoint files, except for the last checkpoint.
   * Note that there may not be any checkpoints at all.
   */
  public  void deleteAllCheckpointsButLast ()  { throw new RuntimeException(); }
  /**
   * Get all current checkpoint files.
   * This is useful in combination with {@link deleteAllCheckpointsButLast()}.
   * @return (undocumented)
   */
  public  java.lang.String[] getAllCheckpointFiles ()  { throw new RuntimeException(); }
  /**
   * Dequeue the oldest checkpointed Dataset, and remove its checkpoint files.
   * This prints a warning but does not fail if the files cannot be removed.
   */
  private  void removeCheckpointFile ()  { throw new RuntimeException(); }
}
