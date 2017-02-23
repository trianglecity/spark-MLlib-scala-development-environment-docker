package org.apache.spark.ui.jobs;
  class TaskPagedTable implements org.apache.spark.ui.PagedTable<org.apache.spark.ui.jobs.TaskTableRowData> {
  public   TaskPagedTable (org.apache.spark.SparkConf conf, java.lang.String basePath, scala.collection.Seq<org.apache.spark.ui.jobs.UIData.TaskUIData> data, boolean hasAccumulators, boolean hasInput, boolean hasOutput, boolean hasShuffleRead, boolean hasShuffleWrite, boolean hasBytesSpilled, long currentTime, int pageSize, java.lang.String sortColumn, boolean desc, org.apache.spark.ui.exec.ExecutorsListener executorsListener)  { throw new RuntimeException(); }
  public  java.lang.String tableId ()  { throw new RuntimeException(); }
  public  java.lang.String tableCssClass ()  { throw new RuntimeException(); }
  public  java.lang.String pageSizeFormField ()  { throw new RuntimeException(); }
  public  java.lang.String prevPageSizeFormField ()  { throw new RuntimeException(); }
  public  java.lang.String pageNumberFormField ()  { throw new RuntimeException(); }
  public  org.apache.spark.ui.jobs.TaskDataSource dataSource ()  { throw new RuntimeException(); }
  public  java.lang.String pageLink (int page)  { throw new RuntimeException(); }
  public  java.lang.String goButtonFormPath ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> headers ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> row (org.apache.spark.ui.jobs.TaskTableRowData task)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> errorMessageCell (java.lang.String error)  { throw new RuntimeException(); }
}
