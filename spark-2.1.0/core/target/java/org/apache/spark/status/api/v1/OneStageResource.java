package org.apache.spark.status.api.v1;
  class OneStageResource {
  private  class StageStatusInfoUi implements scala.Product, scala.Serializable {
    public  org.apache.spark.status.api.v1.StageStatus status ()  { throw new RuntimeException(); }
    public  org.apache.spark.scheduler.StageInfo info ()  { throw new RuntimeException(); }
    public  org.apache.spark.ui.jobs.UIData.StageUIData ui ()  { throw new RuntimeException(); }
    // not preceding
    public   StageStatusInfoUi (org.apache.spark.status.api.v1.StageStatus status, org.apache.spark.scheduler.StageInfo info, org.apache.spark.ui.jobs.UIData.StageUIData ui)  { throw new RuntimeException(); }
  }
  private  class StageStatusInfoUi$ extends scala.runtime.AbstractFunction3<org.apache.spark.status.api.v1.StageStatus, org.apache.spark.scheduler.StageInfo, org.apache.spark.ui.jobs.UIData.StageUIData, org.apache.spark.status.api.v1.OneStageResource.StageStatusInfoUi> implements scala.Serializable {
    public   StageStatusInfoUi$ ()  { throw new RuntimeException(); }
  }
  static public  scala.math.Ordering<org.apache.spark.status.api.v1.TaskData> ordering (org.apache.spark.status.api.v1.TaskSorting taskSorting)  { throw new RuntimeException(); }
  public   OneStageResource (org.apache.spark.ui.SparkUI ui)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.StageData> stageData (int stageId)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.StageData oneAttemptData (int stageId, int stageAttemptId)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.TaskMetricDistributions taskSummary (int stageId, int stageAttemptId, java.lang.String quantileString)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> taskList (int stageId, int stageAttemptId, int offset, int length, org.apache.spark.status.api.v1.TaskSorting sortBy)  { throw new RuntimeException(); }
  private <T extends java.lang.Object> T withStage (int stageId, scala.Function1<scala.collection.Seq<org.apache.spark.status.api.v1.OneStageResource.StageStatusInfoUi>, T> f)  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.status.api.v1.OneStageResource.StageStatusInfoUi> findStageStatusUIData (org.apache.spark.ui.jobs.JobProgressListener listener, int stageId)  { throw new RuntimeException(); }
  private <T extends java.lang.Object> T withStageAttempt (int stageId, int stageAttemptId, scala.Function1<org.apache.spark.status.api.v1.OneStageResource.StageStatusInfoUi, T> f)  { throw new RuntimeException(); }
}
