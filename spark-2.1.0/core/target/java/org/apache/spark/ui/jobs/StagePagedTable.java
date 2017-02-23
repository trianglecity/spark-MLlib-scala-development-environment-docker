package org.apache.spark.ui.jobs;
/** Page showing list of all ongoing and recently finished stages */
  class StagePagedTable implements org.apache.spark.ui.PagedTable<org.apache.spark.ui.jobs.StageTableRowData> {
  public   StagePagedTable (scala.collection.Seq<org.apache.spark.scheduler.StageInfo> stages, java.lang.String tableHeaderId, java.lang.String stageTag, java.lang.String basePath, java.lang.String subPath, org.apache.spark.ui.jobs.JobProgressListener listener, boolean isFairScheduler, boolean killEnabled, long currentTime, int pageSize, java.lang.String sortColumn, boolean desc, boolean isFailedStage, scala.collection.Iterable<java.lang.String> parameterOtherTable)  { throw new RuntimeException(); }
  public  java.lang.String tableId ()  { throw new RuntimeException(); }
  public  java.lang.String tableCssClass ()  { throw new RuntimeException(); }
  public  java.lang.String pageSizeFormField ()  { throw new RuntimeException(); }
  public  java.lang.String prevPageSizeFormField ()  { throw new RuntimeException(); }
  public  java.lang.String pageNumberFormField ()  { throw new RuntimeException(); }
  public  java.lang.String parameterPath ()  { throw new RuntimeException(); }
  public  org.apache.spark.ui.jobs.StageDataSource dataSource ()  { throw new RuntimeException(); }
  public  java.lang.String pageLink (int page)  { throw new RuntimeException(); }
  public  java.lang.String goButtonFormPath ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> headers ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> row (org.apache.spark.ui.jobs.StageTableRowData data)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> rowContent (org.apache.spark.ui.jobs.StageTableRowData data)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> failureReasonHtml (org.apache.spark.scheduler.StageInfo s)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> makeDescription (org.apache.spark.scheduler.StageInfo s, scala.Option<java.lang.String> descriptionOption)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<scala.xml.Node> missingStageRow (int stageId)  { throw new RuntimeException(); }
}
