package org.apache.spark.ui.jobs;
  class StageTableBase {
  public   StageTableBase (javax.servlet.http.HttpServletRequest request, scala.collection.Seq<org.apache.spark.scheduler.StageInfo> stages, java.lang.String tableHeaderID, java.lang.String stageTag, java.lang.String basePath, java.lang.String subPath, org.apache.spark.ui.jobs.JobProgressListener progressListener, boolean isFairScheduler, boolean killEnabled, boolean isFailedStage)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String[]> allParameters ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Iterable<java.lang.String> parameterOtherTable ()  { throw new RuntimeException(); }
  public  java.lang.String parameterStagePage ()  { throw new RuntimeException(); }
  public  java.lang.String parameterStageSortColumn ()  { throw new RuntimeException(); }
  public  java.lang.String parameterStageSortDesc ()  { throw new RuntimeException(); }
  public  java.lang.String parameterStagePageSize ()  { throw new RuntimeException(); }
  public  java.lang.String parameterStagePrevPageSize ()  { throw new RuntimeException(); }
  public  int stagePage ()  { throw new RuntimeException(); }
  public  java.lang.String stageSortColumn ()  { throw new RuntimeException(); }
  public  boolean stageSortDesc ()  { throw new RuntimeException(); }
  public  int stagePageSize ()  { throw new RuntimeException(); }
  public  int stagePrevPageSize ()  { throw new RuntimeException(); }
  public  int page ()  { throw new RuntimeException(); }
  public  long currentTime ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> toNodeSeq ()  { throw new RuntimeException(); }
}
