package org.apache.spark.ui.jobs;
/** Web UI showing progress status of all jobs in the given SparkContext. */
  class JobsTab extends org.apache.spark.ui.SparkUITab {
  public   JobsTab (org.apache.spark.ui.SparkUI parent)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.SparkContext> sc ()  { throw new RuntimeException(); }
  public  boolean killEnabled ()  { throw new RuntimeException(); }
  public  org.apache.spark.ui.jobs.JobProgressListener jobProgresslistener ()  { throw new RuntimeException(); }
  public  org.apache.spark.ui.exec.ExecutorsListener executorListener ()  { throw new RuntimeException(); }
  public  org.apache.spark.ui.scope.RDDOperationGraphListener operationGraphListener ()  { throw new RuntimeException(); }
  public  boolean isFairScheduler ()  { throw new RuntimeException(); }
  public  java.lang.String getSparkUser ()  { throw new RuntimeException(); }
  public  void handleKillRequest (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
}
