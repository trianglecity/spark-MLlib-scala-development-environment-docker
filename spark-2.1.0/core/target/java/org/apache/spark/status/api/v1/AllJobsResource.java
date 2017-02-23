package org.apache.spark.status.api.v1;
  class AllJobsResource {
  static public  scala.collection.Seq<scala.Tuple2<org.apache.spark.JobExecutionStatus, scala.collection.Seq<org.apache.spark.ui.jobs.UIData.JobUIData>>> getStatusToJobs (org.apache.spark.ui.SparkUI ui)  { throw new RuntimeException(); }
  static public  org.apache.spark.status.api.v1.JobData convertJobData (org.apache.spark.ui.jobs.UIData.JobUIData job, org.apache.spark.ui.jobs.JobProgressListener listener, boolean includeStageDetails)  { throw new RuntimeException(); }
  public   AllJobsResource (org.apache.spark.ui.SparkUI ui)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.JobData> jobsList (java.util.List<org.apache.spark.JobExecutionStatus> statuses)  { throw new RuntimeException(); }
}
