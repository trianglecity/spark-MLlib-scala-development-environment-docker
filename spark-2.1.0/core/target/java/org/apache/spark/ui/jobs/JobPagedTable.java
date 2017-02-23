package org.apache.spark.ui.jobs;
  class JobPagedTable implements org.apache.spark.ui.PagedTable<org.apache.spark.ui.jobs.JobTableRowData> {
  public   JobPagedTable (scala.collection.Seq<org.apache.spark.ui.jobs.UIData.JobUIData> data, java.lang.String tableHeaderId, java.lang.String jobTag, java.lang.String basePath, java.lang.String subPath, scala.collection.Iterable<java.lang.String> parameterOtherTable, scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.StageInfo> stageIdToInfo, scala.collection.mutable.HashMap<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.ui.jobs.UIData.StageUIData> stageIdToData, boolean killEnabled, long currentTime, java.lang.String jobIdTitle, int pageSize, java.lang.String sortColumn, boolean desc)  { throw new RuntimeException(); }
  public  java.lang.String parameterPath ()  { throw new RuntimeException(); }
  public  java.lang.String tableId ()  { throw new RuntimeException(); }
  public  java.lang.String tableCssClass ()  { throw new RuntimeException(); }
  public  java.lang.String pageSizeFormField ()  { throw new RuntimeException(); }
  public  java.lang.String prevPageSizeFormField ()  { throw new RuntimeException(); }
  public  java.lang.String pageNumberFormField ()  { throw new RuntimeException(); }
  public  org.apache.spark.ui.jobs.JobDataSource dataSource ()  { throw new RuntimeException(); }
  public  java.lang.String pageLink (int page)  { throw new RuntimeException(); }
  public  java.lang.String goButtonFormPath ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> headers ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> row (org.apache.spark.ui.jobs.JobTableRowData jobTableRow)  { throw new RuntimeException(); }
}
