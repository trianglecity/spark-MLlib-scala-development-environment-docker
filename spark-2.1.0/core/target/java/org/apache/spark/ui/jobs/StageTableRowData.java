package org.apache.spark.ui.jobs;
  class StageTableRowData {
  public  org.apache.spark.scheduler.StageInfo stageInfo ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.ui.jobs.UIData.StageUIData> stageData ()  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
  public  int attemptId ()  { throw new RuntimeException(); }
  public  java.lang.String schedulingPool ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> descriptionOption ()  { throw new RuntimeException(); }
  public  long submissionTime ()  { throw new RuntimeException(); }
  public  java.lang.String formattedSubmissionTime ()  { throw new RuntimeException(); }
  public  long duration ()  { throw new RuntimeException(); }
  public  java.lang.String formattedDuration ()  { throw new RuntimeException(); }
  public  long inputRead ()  { throw new RuntimeException(); }
  public  java.lang.String inputReadWithUnit ()  { throw new RuntimeException(); }
  public  long outputWrite ()  { throw new RuntimeException(); }
  public  java.lang.String outputWriteWithUnit ()  { throw new RuntimeException(); }
  public  long shuffleRead ()  { throw new RuntimeException(); }
  public  java.lang.String shuffleReadWithUnit ()  { throw new RuntimeException(); }
  public  long shuffleWrite ()  { throw new RuntimeException(); }
  public  java.lang.String shuffleWriteWithUnit ()  { throw new RuntimeException(); }
  // not preceding
  public   StageTableRowData (org.apache.spark.scheduler.StageInfo stageInfo, scala.Option<org.apache.spark.ui.jobs.UIData.StageUIData> stageData, int stageId, int attemptId, java.lang.String schedulingPool, scala.Option<java.lang.String> descriptionOption, long submissionTime, java.lang.String formattedSubmissionTime, long duration, java.lang.String formattedDuration, long inputRead, java.lang.String inputReadWithUnit, long outputWrite, java.lang.String outputWriteWithUnit, long shuffleRead, java.lang.String shuffleReadWithUnit, long shuffleWrite, java.lang.String shuffleWriteWithUnit)  { throw new RuntimeException(); }
}
