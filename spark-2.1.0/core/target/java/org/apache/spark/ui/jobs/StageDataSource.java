package org.apache.spark.ui.jobs;
  class StageDataSource extends org.apache.spark.ui.PagedDataSource<org.apache.spark.ui.jobs.StageTableRowData> {
  public   StageDataSource (scala.collection.Seq<org.apache.spark.scheduler.StageInfo> stages, org.apache.spark.ui.jobs.JobProgressListener listener, long currentTime, int pageSize, java.lang.String sortColumn, boolean desc)  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.ui.jobs.StageTableRowData> data ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.Object> _slicedStageIds ()  { throw new RuntimeException(); }
  public  int dataSize ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ui.jobs.StageTableRowData> sliceData (int from, int to)  { throw new RuntimeException(); }
  private  org.apache.spark.ui.jobs.StageTableRowData stageRow (org.apache.spark.scheduler.StageInfo s)  { throw new RuntimeException(); }
  /**
   * Return Ordering according to sortColumn and desc
   * @param sortColumn (undocumented)
   * @param desc (undocumented)
   * @return (undocumented)
   */
  private  scala.math.Ordering<org.apache.spark.ui.jobs.StageTableRowData> ordering (java.lang.String sortColumn, boolean desc)  { throw new RuntimeException(); }
}
