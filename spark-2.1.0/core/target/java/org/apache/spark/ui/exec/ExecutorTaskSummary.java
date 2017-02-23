package org.apache.spark.ui.exec;
  class ExecutorTaskSummary implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String executorId ()  { throw new RuntimeException(); }
  public  int totalCores ()  { throw new RuntimeException(); }
  public  int tasksMax ()  { throw new RuntimeException(); }
  public  int tasksActive ()  { throw new RuntimeException(); }
  public  int tasksFailed ()  { throw new RuntimeException(); }
  public  int tasksComplete ()  { throw new RuntimeException(); }
  public  long duration ()  { throw new RuntimeException(); }
  public  long jvmGCTime ()  { throw new RuntimeException(); }
  public  long inputBytes ()  { throw new RuntimeException(); }
  public  long inputRecords ()  { throw new RuntimeException(); }
  public  long outputBytes ()  { throw new RuntimeException(); }
  public  long outputRecords ()  { throw new RuntimeException(); }
  public  long shuffleRead ()  { throw new RuntimeException(); }
  public  long shuffleWrite ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> executorLogs ()  { throw new RuntimeException(); }
  public  boolean isAlive ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorTaskSummary (java.lang.String executorId, int totalCores, int tasksMax, int tasksActive, int tasksFailed, int tasksComplete, long duration, long jvmGCTime, long inputBytes, long inputRecords, long outputBytes, long outputRecords, long shuffleRead, long shuffleWrite, scala.collection.immutable.Map<java.lang.String, java.lang.String> executorLogs, boolean isAlive)  { throw new RuntimeException(); }
}
