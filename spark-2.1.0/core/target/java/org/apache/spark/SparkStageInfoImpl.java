package org.apache.spark;
public  class SparkStageInfoImpl implements org.apache.spark.SparkStageInfo {
  public  int stageId ()  { throw new RuntimeException(); }
  public  int currentAttemptId ()  { throw new RuntimeException(); }
  public  long submissionTime ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  int numTasks ()  { throw new RuntimeException(); }
  public  int numActiveTasks ()  { throw new RuntimeException(); }
  public  int numCompletedTasks ()  { throw new RuntimeException(); }
  public  int numFailedTasks ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkStageInfoImpl (int stageId, int currentAttemptId, long submissionTime, java.lang.String name, int numTasks, int numActiveTasks, int numCompletedTasks, int numFailedTasks)  { throw new RuntimeException(); }
}
