package org.apache.spark.ui.exec;
  class ExecutorSummaryInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  public  java.lang.String hostPort ()  { throw new RuntimeException(); }
  public  int rddBlocks ()  { throw new RuntimeException(); }
  public  long memoryUsed ()  { throw new RuntimeException(); }
  public  long diskUsed ()  { throw new RuntimeException(); }
  public  int activeTasks ()  { throw new RuntimeException(); }
  public  int failedTasks ()  { throw new RuntimeException(); }
  public  int completedTasks ()  { throw new RuntimeException(); }
  public  int totalTasks ()  { throw new RuntimeException(); }
  public  long totalDuration ()  { throw new RuntimeException(); }
  public  long totalInputBytes ()  { throw new RuntimeException(); }
  public  long totalShuffleRead ()  { throw new RuntimeException(); }
  public  long totalShuffleWrite ()  { throw new RuntimeException(); }
  public  long maxMemory ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> executorLogs ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorSummaryInfo (java.lang.String id, java.lang.String hostPort, int rddBlocks, long memoryUsed, long diskUsed, int activeTasks, int failedTasks, int completedTasks, int totalTasks, long totalDuration, long totalInputBytes, long totalShuffleRead, long totalShuffleWrite, long maxMemory, scala.collection.immutable.Map<java.lang.String, java.lang.String> executorLogs)  { throw new RuntimeException(); }
}
