package org.apache.spark.status.api.v1;
public  class ExecutorStageSummary {
  public  long taskTime ()  { throw new RuntimeException(); }
  public  int failedTasks ()  { throw new RuntimeException(); }
  public  int succeededTasks ()  { throw new RuntimeException(); }
  public  long inputBytes ()  { throw new RuntimeException(); }
  public  long outputBytes ()  { throw new RuntimeException(); }
  public  long shuffleRead ()  { throw new RuntimeException(); }
  public  long shuffleWrite ()  { throw new RuntimeException(); }
  public  long memoryBytesSpilled ()  { throw new RuntimeException(); }
  public  long diskBytesSpilled ()  { throw new RuntimeException(); }
  // not preceding
     ExecutorStageSummary (long taskTime, int failedTasks, int succeededTasks, long inputBytes, long outputBytes, long shuffleRead, long shuffleWrite, long memoryBytesSpilled, long diskBytesSpilled)  { throw new RuntimeException(); }
}
