package org.apache.spark.scheduler;
/**
 * ShuffleMapStages are intermediate stages in the execution DAG that produce data for a shuffle.
 * They occur right before each shuffle operation, and might contain multiple pipelined operations
 * before that (e.g. map and filter). When executed, they save map output files that can later be
 * fetched by reduce tasks. The <code>shuffleDep</code> field describes the shuffle each stage is part of,
 * and variables like <code>outputLocs</code> and <code>numAvailableOutputs</code> track how many map outputs are ready.
 * <p>
 * ShuffleMapStages can also be submitted independently as jobs with DAGScheduler.submitMapStage.
 * For such stages, the ActiveJobs that submitted them are tracked in <code>mapStageJobs</code>. Note that
 * there can be multiple ActiveJobs trying to compute the same shuffle map stage.
 */
  class ShuffleMapStage extends org.apache.spark.scheduler.Stage {
  public  org.apache.spark.ShuffleDependency<?, ?, ?> shuffleDep ()  { throw new RuntimeException(); }
  // not preceding
  public   ShuffleMapStage (int id, org.apache.spark.rdd.RDD<?> rdd, int numTasks, scala.collection.immutable.List<org.apache.spark.scheduler.Stage> parents, int firstJobId, org.apache.spark.util.CallSite callSite, org.apache.spark.ShuffleDependency<?, ?, ?> shuffleDep)  { throw new RuntimeException(); }
  /**
   * List of {@link MapStatus} for each partition. The index of the array is the map partition id,
   * and each value in the array is the list of possible {@link MapStatus} for a partition
   * (a single task might run multiple times).
   * @return (undocumented)
   */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Returns the list of active jobs,
   * i.e. map-stage jobs that were submitted to execute this stage independently (if any).
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.scheduler.ActiveJob> mapStageJobs ()  { throw new RuntimeException(); }
  /** Adds the job to the active job list. */
  public  void addActiveJob (org.apache.spark.scheduler.ActiveJob job)  { throw new RuntimeException(); }
  /** Removes the job from the active job list. */
  public  void removeActiveJob (org.apache.spark.scheduler.ActiveJob job)  { throw new RuntimeException(); }
  /**
   * Number of partitions that have shuffle outputs.
   * When this reaches {@link numPartitions}, this map stage is ready.
   * This should be kept consistent as <code>outputLocs.filter(!_.isEmpty).size</code>.
   * @return (undocumented)
   */
  public  int numAvailableOutputs ()  { throw new RuntimeException(); }
  /**
   * Returns true if the map stage is ready, i.e. all partitions have shuffle outputs.
   * This should be the same as <code>outputLocs.contains(Nil)</code>.
   * @return (undocumented)
   */
  public  boolean isAvailable ()  { throw new RuntimeException(); }
  /** Returns the sequence of partition ids that are missing (i.e. needs to be computed). */
  public  scala.collection.Seq<java.lang.Object> findMissingPartitions ()  { throw new RuntimeException(); }
  public  void addOutputLoc (int partition, org.apache.spark.scheduler.MapStatus status)  { throw new RuntimeException(); }
  public  void removeOutputLoc (int partition, org.apache.spark.storage.BlockManagerId bmAddress)  { throw new RuntimeException(); }
  /**
   * Returns an array of {@link MapStatus} (index by partition id). For each partition, the returned
   * value contains only one (i.e. the first) {@link MapStatus}. If there is no entry for the partition,
   * that position is filled with null.
   * @return (undocumented)
   */
  public  org.apache.spark.scheduler.MapStatus[] outputLocInMapOutputTrackerFormat ()  { throw new RuntimeException(); }
  /**
   * Removes all shuffle outputs associated with this executor. Note that this will also remove
   * outputs which are served by an external shuffle server (if one exists), as they are still
   * registered with this execId.
   * @param execId (undocumented)
   */
  public  void removeOutputsOnExecutor (java.lang.String execId)  { throw new RuntimeException(); }
}
