package org.apache.spark.ui.jobs;
  class TaskDataSource extends org.apache.spark.ui.PagedDataSource<org.apache.spark.ui.jobs.TaskTableRowData> {
  public   TaskDataSource (scala.collection.Seq<org.apache.spark.ui.jobs.UIData.TaskUIData> tasks, boolean hasAccumulators, boolean hasInput, boolean hasOutput, boolean hasShuffleRead, boolean hasShuffleWrite, boolean hasBytesSpilled, long currentTime, int pageSize, java.lang.String sortColumn, boolean desc, org.apache.spark.ui.exec.ExecutorsListener executorsListener)  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.ui.jobs.TaskTableRowData> data ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.Object> _slicedTaskIds ()  { throw new RuntimeException(); }
  public  int dataSize ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ui.jobs.TaskTableRowData> sliceData (int from, int to)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.Object> slicedTaskIds ()  { throw new RuntimeException(); }
  private  org.apache.spark.ui.jobs.TaskTableRowData taskRow (org.apache.spark.ui.jobs.UIData.TaskUIData taskData)  { throw new RuntimeException(); }
  /**
   * Return Ordering according to sortColumn and desc
   * @param sortColumn (undocumented)
   * @param desc (undocumented)
   * @return (undocumented)
   */
  private  scala.math.Ordering<org.apache.spark.ui.jobs.TaskTableRowData> ordering (java.lang.String sortColumn, boolean desc)  { throw new RuntimeException(); }
}
