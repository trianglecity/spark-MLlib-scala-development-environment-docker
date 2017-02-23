package org.apache.spark.status.api.v1;
public  class AllJobsResource$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AllJobsResource$ MODULE$ = null;
  public   AllJobsResource$ ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<org.apache.spark.JobExecutionStatus, scala.collection.Seq<org.apache.spark.ui.jobs.UIData.JobUIData>>> getStatusToJobs (org.apache.spark.ui.SparkUI ui)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.JobData convertJobData (org.apache.spark.ui.jobs.UIData.JobUIData job, org.apache.spark.ui.jobs.JobProgressListener listener, boolean includeStageDetails)  { throw new RuntimeException(); }
}
