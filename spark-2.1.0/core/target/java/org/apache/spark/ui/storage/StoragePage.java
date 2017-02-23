package org.apache.spark.ui.storage;
/** Page showing list of RDD's currently stored in the cluster */
  class StoragePage extends org.apache.spark.ui.WebUIPage {
  public   StoragePage (org.apache.spark.ui.storage.StorageTab parent)  { throw new RuntimeException(); }
  private  org.apache.spark.ui.storage.StorageListener listener ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
    scala.collection.Seq<scala.xml.Node> rddTable (scala.collection.Seq<org.apache.spark.storage.RDDInfo> rdds)  { throw new RuntimeException(); }
  /** Header fields for the RDD table */
  private  scala.collection.Seq<java.lang.String> rddHeader ()  { throw new RuntimeException(); }
  /** Render an HTML row representing an RDD */
  private  scala.collection.Seq<scala.xml.Node> rddRow (org.apache.spark.storage.RDDInfo rdd)  { throw new RuntimeException(); }
    scala.collection.Seq<scala.xml.Node> receiverBlockTables (scala.collection.Seq<org.apache.spark.storage.ExecutorStreamBlockStatus> statuses)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> executorMetricsTable (scala.collection.Seq<org.apache.spark.storage.ExecutorStreamBlockStatus> statuses)  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> executorMetricsTableHeader ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> executorMetricsTableRow (org.apache.spark.storage.ExecutorStreamBlockStatus status)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> streamBlockTable (scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, scala.collection.Seq<org.apache.spark.storage.BlockUIData>>> blocks)  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> streamBlockTableHeader ()  { throw new RuntimeException(); }
  /** Render a stream block */
  private  scala.collection.Seq<scala.xml.Node> streamBlockTableRow (scala.Tuple2<org.apache.spark.storage.BlockId, scala.collection.Seq<org.apache.spark.storage.BlockUIData>> block)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> streamBlockTableSubrow (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockUIData block, int replication, boolean firstSubrow)  { throw new RuntimeException(); }
    scala.Tuple2<java.lang.String, java.lang.Object> streamBlockStorageLevelDescriptionAndSize (org.apache.spark.storage.BlockUIData block)  { throw new RuntimeException(); }
}
