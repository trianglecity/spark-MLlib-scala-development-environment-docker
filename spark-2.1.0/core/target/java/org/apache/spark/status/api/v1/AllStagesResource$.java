package org.apache.spark.status.api.v1;
public  class AllStagesResource$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AllStagesResource$ MODULE$ = null;
  public   AllStagesResource$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.StageData stageUiToStageData (org.apache.spark.status.api.v1.StageStatus status, org.apache.spark.scheduler.StageInfo stageInfo, org.apache.spark.ui.jobs.UIData.StageUIData stageUiData, boolean includeDetails)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<org.apache.spark.status.api.v1.StageStatus, scala.collection.Seq<org.apache.spark.scheduler.StageInfo>>> stagesAndStatus (org.apache.spark.ui.SparkUI ui)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.TaskData convertTaskData (org.apache.spark.ui.jobs.UIData.TaskUIData uiData)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.TaskMetricDistributions taskMetricDistributions (scala.collection.Iterable<org.apache.spark.ui.jobs.UIData.TaskUIData> allTaskData, double[] quantiles)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.AccumulableInfo convertAccumulableInfo (org.apache.spark.scheduler.AccumulableInfo acc)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.TaskMetrics convertUiTaskMetrics (org.apache.spark.ui.jobs.UIData.TaskMetricsUIData internal)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.InputMetrics convertInputMetrics (org.apache.spark.ui.jobs.UIData.InputMetricsUIData internal)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.OutputMetrics convertOutputMetrics (org.apache.spark.ui.jobs.UIData.OutputMetricsUIData internal)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.ShuffleReadMetrics convertShuffleReadMetrics (org.apache.spark.ui.jobs.UIData.ShuffleReadMetricsUIData internal)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.ShuffleWriteMetrics convertShuffleWriteMetrics (org.apache.spark.ui.jobs.UIData.ShuffleWriteMetricsUIData internal)  { throw new RuntimeException(); }
}
