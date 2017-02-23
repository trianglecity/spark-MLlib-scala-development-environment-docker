package org.apache.spark.ui.jobs;
/**
 * Contains all data that needs for sorting and generating HTML. Using this one rather than
 * TaskUIData to avoid creating duplicate contents during sorting the data.
 */
  class TaskTableRowData {
  public  int index ()  { throw new RuntimeException(); }
  public  long taskId ()  { throw new RuntimeException(); }
  public  int attempt ()  { throw new RuntimeException(); }
  public  boolean speculative ()  { throw new RuntimeException(); }
  public  java.lang.String status ()  { throw new RuntimeException(); }
  public  java.lang.String taskLocality ()  { throw new RuntimeException(); }
  public  java.lang.String executorIdAndHost ()  { throw new RuntimeException(); }
  public  long launchTime ()  { throw new RuntimeException(); }
  public  long duration ()  { throw new RuntimeException(); }
  public  java.lang.String formatDuration ()  { throw new RuntimeException(); }
  public  long schedulerDelay ()  { throw new RuntimeException(); }
  public  long taskDeserializationTime ()  { throw new RuntimeException(); }
  public  long gcTime ()  { throw new RuntimeException(); }
  public  long serializationTime ()  { throw new RuntimeException(); }
  public  long gettingResultTime ()  { throw new RuntimeException(); }
  public  long peakExecutionMemoryUsed ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> accumulators ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.ui.jobs.TaskTableRowInputData> input ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.ui.jobs.TaskTableRowOutputData> output ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.ui.jobs.TaskTableRowShuffleReadData> shuffleRead ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.ui.jobs.TaskTableRowShuffleWriteData> shuffleWrite ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.ui.jobs.TaskTableRowBytesSpilledData> bytesSpilled ()  { throw new RuntimeException(); }
  public  java.lang.String error ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> logs ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskTableRowData (int index, long taskId, int attempt, boolean speculative, java.lang.String status, java.lang.String taskLocality, java.lang.String executorIdAndHost, long launchTime, long duration, java.lang.String formatDuration, long schedulerDelay, long taskDeserializationTime, long gcTime, long serializationTime, long gettingResultTime, long peakExecutionMemoryUsed, scala.Option<java.lang.String> accumulators, scala.Option<org.apache.spark.ui.jobs.TaskTableRowInputData> input, scala.Option<org.apache.spark.ui.jobs.TaskTableRowOutputData> output, scala.Option<org.apache.spark.ui.jobs.TaskTableRowShuffleReadData> shuffleRead, scala.Option<org.apache.spark.ui.jobs.TaskTableRowShuffleWriteData> shuffleWrite, scala.Option<org.apache.spark.ui.jobs.TaskTableRowBytesSpilledData> bytesSpilled, java.lang.String error, scala.collection.immutable.Map<java.lang.String, java.lang.String> logs)  { throw new RuntimeException(); }
}
