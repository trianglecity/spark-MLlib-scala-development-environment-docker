package org.apache.spark;
public  class SparkJobInfoImpl implements org.apache.spark.SparkJobInfo {
  public  int jobId ()  { throw new RuntimeException(); }
  public  int[] stageIds ()  { throw new RuntimeException(); }
  public  org.apache.spark.JobExecutionStatus status ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkJobInfoImpl (int jobId, int[] stageIds, org.apache.spark.JobExecutionStatus status)  { throw new RuntimeException(); }
}
