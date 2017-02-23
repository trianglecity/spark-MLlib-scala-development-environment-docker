package org.apache.spark.api.java;
/**
 * Low-level status reporting APIs for monitoring job and stage progress.
 * <p>
 * These APIs intentionally provide very weak consistency semantics; consumers of these APIs should
 * be prepared to handle empty / missing information.  For example, a job's stage ids may be known
 * but the status API may not have any information about the details of those stages, so
 * <code>getStageInfo</code> could potentially return <code>null</code> for a valid stage id.
 * <p>
 * To limit memory usage, these APIs only provide information on recent jobs / stages.  These APIs
 * will provide information for the last <code>spark.ui.retainedStages</code> stages and
 * <code>spark.ui.retainedJobs</code> jobs.
 * <p>
 * @note This class's constructor should be considered private and may be subject to change.
 */
public  class JavaSparkStatusTracker {
     JavaSparkStatusTracker (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * Return a list of all known jobs in a particular job group.  If <code>jobGroup</code> is <code>null</code>, then
   * returns all known jobs that are not associated with a job group.
   * <p>
   * The returned list may contain running, failed, and completed jobs, and may vary across
   * invocations of this method.  This method does not guarantee the order of the elements in
   * its result.
   * @param jobGroup (undocumented)
   * @return (undocumented)
   */
  public  int[] getJobIdsForGroup (java.lang.String jobGroup)  { throw new RuntimeException(); }
  /**
   * Returns an array containing the ids of all active stages.
   * <p>
   * This method does not guarantee the order of the elements in its result.
   * @return (undocumented)
   */
  public  int[] getActiveStageIds ()  { throw new RuntimeException(); }
  /**
   * Returns an array containing the ids of all active jobs.
   * <p>
   * This method does not guarantee the order of the elements in its result.
   * @return (undocumented)
   */
  public  int[] getActiveJobIds ()  { throw new RuntimeException(); }
  /**
   * Returns job information, or <code>null</code> if the job info could not be found or was garbage collected.
   * @param jobId (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.SparkJobInfo getJobInfo (int jobId)  { throw new RuntimeException(); }
  /**
   * Returns stage information, or <code>null</code> if the stage info could not be found or was
   * garbage collected.
   * @param stageId (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.SparkStageInfo getStageInfo (int stageId)  { throw new RuntimeException(); }
}
