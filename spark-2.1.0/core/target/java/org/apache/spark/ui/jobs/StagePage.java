package org.apache.spark.ui.jobs;
/** Page showing statistics and task list for a given stage */
  class StagePage extends org.apache.spark.ui.WebUIPage {
  static   long getGettingResultTime (org.apache.spark.scheduler.TaskInfo info, long currentTime)  { throw new RuntimeException(); }
  static   long getSchedulerDelay (org.apache.spark.scheduler.TaskInfo info, org.apache.spark.ui.jobs.UIData.TaskMetricsUIData metrics, long currentTime)  { throw new RuntimeException(); }
  static public  java.lang.String prefix ()  { throw new RuntimeException(); }
  static public  void prefix_$eq (java.lang.String x$1)  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JValue renderJson (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  public   StagePage (org.apache.spark.ui.jobs.StagesTab parent)  { throw new RuntimeException(); }
  private  org.apache.spark.ui.jobs.JobProgressListener progressListener ()  { throw new RuntimeException(); }
  private  org.apache.spark.ui.scope.RDDOperationGraphListener operationGraphListener ()  { throw new RuntimeException(); }
  private  org.apache.spark.ui.exec.ExecutorsListener executorsListener ()  { throw new RuntimeException(); }
  private  scala.xml.Elem TIMELINE_LEGEND ()  { throw new RuntimeException(); }
  private  int MAX_TIMELINE_TASKS ()  { throw new RuntimeException(); }
  private  java.lang.String getLocalitySummaryString (org.apache.spark.ui.jobs.UIData.StageUIData stageData)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> makeTimeline (scala.collection.Seq<org.apache.spark.ui.jobs.UIData.TaskUIData> tasks, long currentTime)  { throw new RuntimeException(); }
}
