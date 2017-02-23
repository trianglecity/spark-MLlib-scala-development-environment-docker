package org.apache.spark.ui.jobs;
  class JobDataSource extends org.apache.spark.ui.PagedDataSource<org.apache.spark.ui.jobs.JobTableRowData> {
  public   JobDataSource (scala.collection.Seq<org.apache.spark.ui.jobs.UIData.JobUIData> jobs, scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.StageInfo> stageIdToInfo, scala.collection.mutable.HashMap<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.ui.jobs.UIData.StageUIData> stageIdToData, java.lang.String basePath, long currentTime, int pageSize, java.lang.String sortColumn, boolean desc)  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.ui.jobs.JobTableRowData> data ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.Object> _slicedJobIds ()  { throw new RuntimeException(); }
  public  int dataSize ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ui.jobs.JobTableRowData> sliceData (int from, int to)  { throw new RuntimeException(); }
  private  scala.Tuple2<java.lang.String, java.lang.String> getLastStageNameAndDescription (org.apache.spark.ui.jobs.UIData.JobUIData job)  { throw new RuntimeException(); }
  private  org.apache.spark.ui.jobs.JobTableRowData jobRow (org.apache.spark.ui.jobs.UIData.JobUIData jobData)  { throw new RuntimeException(); }
  /**
   * Return Ordering according to sortColumn and desc
   * @param sortColumn (undocumented)
   * @param desc (undocumented)
   * @return (undocumented)
   */
  private  scala.math.Ordering<org.apache.spark.ui.jobs.JobTableRowData> ordering (java.lang.String sortColumn, boolean desc)  { throw new RuntimeException(); }
}
