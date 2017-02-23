package org.apache.spark.status.api.v1;
public  class JobData {
  public  int jobId ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> description ()  { throw new RuntimeException(); }
  public  scala.Option<java.util.Date> submissionTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.util.Date> completionTime ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> stageIds ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> jobGroup ()  { throw new RuntimeException(); }
  public  org.apache.spark.JobExecutionStatus status ()  { throw new RuntimeException(); }
  public  int numTasks ()  { throw new RuntimeException(); }
  public  int numActiveTasks ()  { throw new RuntimeException(); }
  public  int numCompletedTasks ()  { throw new RuntimeException(); }
  public  int numSkippedTasks ()  { throw new RuntimeException(); }
  public  int numFailedTasks ()  { throw new RuntimeException(); }
  public  int numActiveStages ()  { throw new RuntimeException(); }
  public  int numCompletedStages ()  { throw new RuntimeException(); }
  public  int numSkippedStages ()  { throw new RuntimeException(); }
  public  int numFailedStages ()  { throw new RuntimeException(); }
  // not preceding
     JobData (int jobId, java.lang.String name, scala.Option<java.lang.String> description, scala.Option<java.util.Date> submissionTime, scala.Option<java.util.Date> completionTime, scala.collection.Seq<java.lang.Object> stageIds, scala.Option<java.lang.String> jobGroup, org.apache.spark.JobExecutionStatus status, int numTasks, int numActiveTasks, int numCompletedTasks, int numSkippedTasks, int numFailedTasks, int numActiveStages, int numCompletedStages, int numSkippedStages, int numFailedStages)  { throw new RuntimeException(); }
}
