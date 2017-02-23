package org.apache.spark.ui.scope;
/**
 * A SparkListener that constructs a DAG of RDD operations.
 */
  class RDDOperationGraphListener extends org.apache.spark.scheduler.SparkListener {
  public   RDDOperationGraphListener (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.Object, scala.collection.Seq<java.lang.Object>> jobIdToStageIds ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.Object, scala.collection.Seq<java.lang.Object>> jobIdToSkippedStageIds ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> stageIdToJobId ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.ui.scope.RDDOperationGraph> stageIdToGraph ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashSet<java.lang.Object> completedStageIds ()  { throw new RuntimeException(); }
    scala.collection.mutable.ArrayBuffer<java.lang.Object> jobIds ()  { throw new RuntimeException(); }
    scala.collection.mutable.ArrayBuffer<java.lang.Object> stageIds ()  { throw new RuntimeException(); }
    int retainedNodes ()  { throw new RuntimeException(); }
  private  int retainedJobs ()  { throw new RuntimeException(); }
  private  int retainedStages ()  { throw new RuntimeException(); }
  /**
   * Return the graph metadata for all stages in the given job.
   * An empty list is returned if one or more of its stages has been cleaned up.
   * @param jobId (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.ui.scope.RDDOperationGraph> getOperationGraphForJob (int jobId)  { throw new RuntimeException(); }
  /** Return the graph metadata for the given stage, or None if no such information exists. */
  public  scala.Option<org.apache.spark.ui.scope.RDDOperationGraph> getOperationGraphForStage (int stageId)  { throw new RuntimeException(); }
  /** On job start, construct a RDDOperationGraph for each stage in the job for display later. */
  public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart jobStart)  { throw new RuntimeException(); }
  /** Keep track of stages that have completed. */
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  { throw new RuntimeException(); }
  /** On job end, find all stages in this job that are skipped and mark them as such. */
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd jobEnd)  { throw new RuntimeException(); }
  /** Clean metadata for old stages if we have exceeded the number to retain. */
  private  void trimStagesIfNecessary ()  { throw new RuntimeException(); }
  /** Clean metadata for old jobs if we have exceeded the number to retain. */
  private  void trimJobsIfNecessary ()  { throw new RuntimeException(); }
  /** Clean metadata for the given stage, its job, and all other stages that belong to the job. */
    void cleanStage (int stageId)  { throw new RuntimeException(); }
  /** Clean metadata for the given job and all stages that belong to it. */
    void cleanJob (int jobId)  { throw new RuntimeException(); }
}
