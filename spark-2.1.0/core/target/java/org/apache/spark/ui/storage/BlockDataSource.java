package org.apache.spark.ui.storage;
  class BlockDataSource extends org.apache.spark.ui.PagedDataSource<org.apache.spark.ui.storage.BlockTableRowData> {
  public   BlockDataSource (scala.collection.Seq<org.apache.spark.status.api.v1.RDDPartitionInfo> rddPartitions, int pageSize, java.lang.String sortColumn, boolean desc)  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.ui.storage.BlockTableRowData> data ()  { throw new RuntimeException(); }
  public  int dataSize ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ui.storage.BlockTableRowData> sliceData (int from, int to)  { throw new RuntimeException(); }
  private  org.apache.spark.ui.storage.BlockTableRowData blockRow (org.apache.spark.status.api.v1.RDDPartitionInfo rddPartition)  { throw new RuntimeException(); }
  /**
   * Return Ordering according to sortColumn and desc
   * @param sortColumn (undocumented)
   * @param desc (undocumented)
   * @return (undocumented)
   */
  private  scala.math.Ordering<org.apache.spark.ui.storage.BlockTableRowData> ordering (java.lang.String sortColumn, boolean desc)  { throw new RuntimeException(); }
}
