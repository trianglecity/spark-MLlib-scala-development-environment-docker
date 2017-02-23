package org.apache.spark.scheduler;
/**
 * A running job in the DAGScheduler. Jobs can be of two types: a result job, which computes a
 * ResultStage to execute an action, or a map-stage job, which computes the map outputs for a
 * ShuffleMapStage before any downstream stages are submitted. The latter is used for adaptive
 * query planning, to look at map output statistics before submitting later stages. We distinguish
 * between these two types of jobs using the finalStage field of this class.
 * <p>
 * Jobs are only tracked for "leaf" stages that clients directly submitted, through DAGScheduler's
 * submitJob or submitMapStage methods. However, either type of job may cause the execution of
 * other earlier stages (for RDDs in the DAG it depends on), and multiple jobs may share some of
 * these previous stages. These dependencies are managed inside DAGScheduler.
 * <p>
 * param:  jobId A unique ID for this job.
 * param:  finalStage The stage that this job computes (either a ResultStage for an action or a
 *   ShuffleMapStage for submitMapStage).
 * param:  callSite Where this job was initiated in the user's program (shown on UI).
 * param:  listener A listener to notify if tasks in this job finish or the job fails.
 * param:  properties Scheduling properties attached to the job, such as fair scheduler pool name.
 */
  class ActiveJob {
  public  int jobId ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.Stage finalStage ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.CallSite callSite ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.JobListener listener ()  { throw new RuntimeException(); }
  public  java.util.Properties properties ()  { throw new RuntimeException(); }
  // not preceding
  public   ActiveJob (int jobId, org.apache.spark.scheduler.Stage finalStage, org.apache.spark.util.CallSite callSite, org.apache.spark.scheduler.JobListener listener, java.util.Properties properties)  { throw new RuntimeException(); }
  /**
   * Number of partitions we need to compute for this job. Note that result stages may not need
   * to compute all partitions in their target RDD, for actions like first() and lookup().
   * @return (undocumented)
   */
  public  int numPartitions ()  { throw new RuntimeException(); }
  /** Which partitions of the stage have finished */
  public  boolean[] finished ()  { throw new RuntimeException(); }
  public  int numFinished ()  { throw new RuntimeException(); }
}
