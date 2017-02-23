package org.apache.spark.ui.jobs;
public  class UIData {
  static public  class JobUIData {
    public  int jobId ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> submissionTime ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> completionTime ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.Object> stageIds ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> jobGroup ()  { throw new RuntimeException(); }
    public  org.apache.spark.JobExecutionStatus status ()  { throw new RuntimeException(); }
    public  int numTasks ()  { throw new RuntimeException(); }
    public  int numActiveTasks ()  { throw new RuntimeException(); }
    public  int numCompletedTasks ()  { throw new RuntimeException(); }
    public  int numSkippedTasks ()  { throw new RuntimeException(); }
    public  int numFailedTasks ()  { throw new RuntimeException(); }
    public  int numKilledTasks ()  { throw new RuntimeException(); }
    public  int numActiveStages ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.HashSet<java.lang.Object> completedStageIndices ()  { throw new RuntimeException(); }
    public  int numSkippedStages ()  { throw new RuntimeException(); }
    public  int numFailedStages ()  { throw new RuntimeException(); }
    // not preceding
    public   JobUIData (int jobId, scala.Option<java.lang.Object> submissionTime, scala.Option<java.lang.Object> completionTime, scala.collection.Seq<java.lang.Object> stageIds, scala.Option<java.lang.String> jobGroup, org.apache.spark.JobExecutionStatus status, int numTasks, int numActiveTasks, int numCompletedTasks, int numSkippedTasks, int numFailedTasks, int numKilledTasks, int numActiveStages, scala.collection.mutable.HashSet<java.lang.Object> completedStageIndices, int numSkippedStages, int numFailedStages)  { throw new RuntimeException(); }
  }
  static public  class JobUIData$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final JobUIData$ MODULE$ = null;
    public   JobUIData$ ()  { throw new RuntimeException(); }
  }
  /**
   * These are kept mutable and reused throughout a task's lifetime to avoid excessive reallocation.
   */
  static public  class TaskUIData {
    private  org.apache.spark.scheduler.TaskInfo _taskInfo ()  { throw new RuntimeException(); }
    private  scala.Option<org.apache.spark.ui.jobs.UIData.TaskMetricsUIData> _metrics ()  { throw new RuntimeException(); }
    // not preceding
    private   TaskUIData (org.apache.spark.scheduler.TaskInfo _taskInfo, scala.Option<org.apache.spark.ui.jobs.UIData.TaskMetricsUIData> _metrics)  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> errorMessage ()  { throw new RuntimeException(); }
    public  org.apache.spark.scheduler.TaskInfo taskInfo ()  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.ui.jobs.UIData.TaskMetricsUIData> metrics ()  { throw new RuntimeException(); }
    public  void updateTaskInfo (org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
    public  void updateTaskMetrics (scala.Option<org.apache.spark.executor.TaskMetrics> metrics)  { throw new RuntimeException(); }
  }
  static public  class TaskUIData$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TaskUIData$ MODULE$ = null;
    public   TaskUIData$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.ui.jobs.UIData.TaskUIData apply (org.apache.spark.scheduler.TaskInfo taskInfo, scala.Option<org.apache.spark.executor.TaskMetrics> metrics)  { throw new RuntimeException(); }
    private  scala.Option<org.apache.spark.ui.jobs.UIData.TaskMetricsUIData> toTaskMetricsUIData (scala.Option<org.apache.spark.executor.TaskMetrics> metrics)  { throw new RuntimeException(); }
    /**
     * We don't need to store internal or SQL accumulables as their values will be shown in other
     * places, so drop them to reduce the memory usage.
     * @param taskInfo (undocumented)
     * @return (undocumented)
     */
      org.apache.spark.scheduler.TaskInfo dropInternalAndSQLAccumulables (org.apache.spark.scheduler.TaskInfo taskInfo)  { throw new RuntimeException(); }
  }
  static public  class TaskMetricsUIData implements scala.Product, scala.Serializable {
    public  long executorDeserializeTime ()  { throw new RuntimeException(); }
    public  long executorDeserializeCpuTime ()  { throw new RuntimeException(); }
    public  long executorRunTime ()  { throw new RuntimeException(); }
    public  long executorCpuTime ()  { throw new RuntimeException(); }
    public  long resultSize ()  { throw new RuntimeException(); }
    public  long jvmGCTime ()  { throw new RuntimeException(); }
    public  long resultSerializationTime ()  { throw new RuntimeException(); }
    public  long memoryBytesSpilled ()  { throw new RuntimeException(); }
    public  long diskBytesSpilled ()  { throw new RuntimeException(); }
    public  long peakExecutionMemory ()  { throw new RuntimeException(); }
    public  org.apache.spark.ui.jobs.UIData.InputMetricsUIData inputMetrics ()  { throw new RuntimeException(); }
    public  org.apache.spark.ui.jobs.UIData.OutputMetricsUIData outputMetrics ()  { throw new RuntimeException(); }
    public  org.apache.spark.ui.jobs.UIData.ShuffleReadMetricsUIData shuffleReadMetrics ()  { throw new RuntimeException(); }
    public  org.apache.spark.ui.jobs.UIData.ShuffleWriteMetricsUIData shuffleWriteMetrics ()  { throw new RuntimeException(); }
    // not preceding
    public   TaskMetricsUIData (long executorDeserializeTime, long executorDeserializeCpuTime, long executorRunTime, long executorCpuTime, long resultSize, long jvmGCTime, long resultSerializationTime, long memoryBytesSpilled, long diskBytesSpilled, long peakExecutionMemory, org.apache.spark.ui.jobs.UIData.InputMetricsUIData inputMetrics, org.apache.spark.ui.jobs.UIData.OutputMetricsUIData outputMetrics, org.apache.spark.ui.jobs.UIData.ShuffleReadMetricsUIData shuffleReadMetrics, org.apache.spark.ui.jobs.UIData.ShuffleWriteMetricsUIData shuffleWriteMetrics)  { throw new RuntimeException(); }
  }
  static public  class TaskMetricsUIData$ extends scala.runtime.AbstractFunction14<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.ui.jobs.UIData.InputMetricsUIData, org.apache.spark.ui.jobs.UIData.OutputMetricsUIData, org.apache.spark.ui.jobs.UIData.ShuffleReadMetricsUIData, org.apache.spark.ui.jobs.UIData.ShuffleWriteMetricsUIData, org.apache.spark.ui.jobs.UIData.TaskMetricsUIData> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TaskMetricsUIData$ MODULE$ = null;
    public   TaskMetricsUIData$ ()  { throw new RuntimeException(); }
  }
  static public  class InputMetricsUIData implements scala.Product, scala.Serializable {
    public  long bytesRead ()  { throw new RuntimeException(); }
    public  long recordsRead ()  { throw new RuntimeException(); }
    // not preceding
    public   InputMetricsUIData (long bytesRead, long recordsRead)  { throw new RuntimeException(); }
  }
  static public  class InputMetricsUIData$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.ui.jobs.UIData.InputMetricsUIData> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final InputMetricsUIData$ MODULE$ = null;
    public   InputMetricsUIData$ ()  { throw new RuntimeException(); }
  }
  static public  class OutputMetricsUIData implements scala.Product, scala.Serializable {
    public  long bytesWritten ()  { throw new RuntimeException(); }
    public  long recordsWritten ()  { throw new RuntimeException(); }
    // not preceding
    public   OutputMetricsUIData (long bytesWritten, long recordsWritten)  { throw new RuntimeException(); }
  }
  static public  class OutputMetricsUIData$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.ui.jobs.UIData.OutputMetricsUIData> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final OutputMetricsUIData$ MODULE$ = null;
    public   OutputMetricsUIData$ ()  { throw new RuntimeException(); }
  }
  static public  class ShuffleReadMetricsUIData implements scala.Product, scala.Serializable {
    public  long remoteBlocksFetched ()  { throw new RuntimeException(); }
    public  long localBlocksFetched ()  { throw new RuntimeException(); }
    public  long remoteBytesRead ()  { throw new RuntimeException(); }
    public  long localBytesRead ()  { throw new RuntimeException(); }
    public  long fetchWaitTime ()  { throw new RuntimeException(); }
    public  long recordsRead ()  { throw new RuntimeException(); }
    public  long totalBytesRead ()  { throw new RuntimeException(); }
    public  long totalBlocksFetched ()  { throw new RuntimeException(); }
    // not preceding
    public   ShuffleReadMetricsUIData (long remoteBlocksFetched, long localBlocksFetched, long remoteBytesRead, long localBytesRead, long fetchWaitTime, long recordsRead, long totalBytesRead, long totalBlocksFetched)  { throw new RuntimeException(); }
  }
  static public  class ShuffleReadMetricsUIData$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ShuffleReadMetricsUIData$ MODULE$ = null;
    public   ShuffleReadMetricsUIData$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.ui.jobs.UIData.ShuffleReadMetricsUIData apply (org.apache.spark.executor.ShuffleReadMetrics metrics)  { throw new RuntimeException(); }
  }
  static public  class ShuffleWriteMetricsUIData implements scala.Product, scala.Serializable {
    public  long bytesWritten ()  { throw new RuntimeException(); }
    public  long recordsWritten ()  { throw new RuntimeException(); }
    public  long writeTime ()  { throw new RuntimeException(); }
    // not preceding
    public   ShuffleWriteMetricsUIData (long bytesWritten, long recordsWritten, long writeTime)  { throw new RuntimeException(); }
  }
  static public  class ShuffleWriteMetricsUIData$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ShuffleWriteMetricsUIData$ MODULE$ = null;
    public   ShuffleWriteMetricsUIData$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.ui.jobs.UIData.ShuffleWriteMetricsUIData apply (org.apache.spark.executor.ShuffleWriteMetrics metrics)  { throw new RuntimeException(); }
  }
  static public  class ExecutorSummary {
    public   ExecutorSummary ()  { throw new RuntimeException(); }
    public  long taskTime ()  { throw new RuntimeException(); }
    public  int failedTasks ()  { throw new RuntimeException(); }
    public  int succeededTasks ()  { throw new RuntimeException(); }
    public  int killedTasks ()  { throw new RuntimeException(); }
    public  long inputBytes ()  { throw new RuntimeException(); }
    public  long inputRecords ()  { throw new RuntimeException(); }
    public  long outputBytes ()  { throw new RuntimeException(); }
    public  long outputRecords ()  { throw new RuntimeException(); }
    public  long shuffleRead ()  { throw new RuntimeException(); }
    public  long shuffleReadRecords ()  { throw new RuntimeException(); }
    public  long shuffleWrite ()  { throw new RuntimeException(); }
    public  long shuffleWriteRecords ()  { throw new RuntimeException(); }
    public  long memoryBytesSpilled ()  { throw new RuntimeException(); }
    public  long diskBytesSpilled ()  { throw new RuntimeException(); }
  }
  static public  class StageUIData {
    public   StageUIData ()  { throw new RuntimeException(); }
    public  int numActiveTasks ()  { throw new RuntimeException(); }
    public  int numCompleteTasks ()  { throw new RuntimeException(); }
    public  org.apache.spark.util.collection.OpenHashSet<java.lang.Object> completedIndices ()  { throw new RuntimeException(); }
    public  int numFailedTasks ()  { throw new RuntimeException(); }
    public  int numKilledTasks ()  { throw new RuntimeException(); }
    public  long executorRunTime ()  { throw new RuntimeException(); }
    public  long executorCpuTime ()  { throw new RuntimeException(); }
    public  long inputBytes ()  { throw new RuntimeException(); }
    public  long inputRecords ()  { throw new RuntimeException(); }
    public  long outputBytes ()  { throw new RuntimeException(); }
    public  long outputRecords ()  { throw new RuntimeException(); }
    public  long shuffleReadTotalBytes ()  { throw new RuntimeException(); }
    public  long shuffleReadRecords ()  { throw new RuntimeException(); }
    public  long shuffleWriteBytes ()  { throw new RuntimeException(); }
    public  long shuffleWriteRecords ()  { throw new RuntimeException(); }
    public  long memoryBytesSpilled ()  { throw new RuntimeException(); }
    public  long diskBytesSpilled ()  { throw new RuntimeException(); }
    public  java.lang.String schedulingPool ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> description ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.AccumulableInfo> accumulables ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.LinkedHashMap<java.lang.Object, org.apache.spark.ui.jobs.UIData.TaskUIData> taskData ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.ui.jobs.UIData.ExecutorSummary> executorSummary ()  { throw new RuntimeException(); }
    public  boolean hasInput ()  { throw new RuntimeException(); }
    public  boolean hasOutput ()  { throw new RuntimeException(); }
    public  boolean hasShuffleRead ()  { throw new RuntimeException(); }
    public  boolean hasShuffleWrite ()  { throw new RuntimeException(); }
    public  boolean hasBytesSpilled ()  { throw new RuntimeException(); }
  }
}
