package org.apache.spark.streaming.ui;
 abstract class BatchTableBase {
  public   BatchTableBase (java.lang.String tableId, long batchInterval)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<scala.xml.Node> columns ()  { throw new RuntimeException(); }
  /**
   * Return the first failure reason if finding in the batches.
   * @param batches (undocumented)
   * @return (undocumented)
   */
  protected  scala.Option<java.lang.String> getFirstFailureReason (scala.collection.Seq<org.apache.spark.streaming.ui.BatchUIData> batches)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<scala.xml.Node> getFirstFailureTableCell (org.apache.spark.streaming.ui.BatchUIData batch)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<scala.xml.Node> baseRow (org.apache.spark.streaming.ui.BatchUIData batch)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> batchTable ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> toNodeSeq ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<scala.xml.Node> createOutputOperationProgressBar (org.apache.spark.streaming.ui.BatchUIData batch)  { throw new RuntimeException(); }
  /**
   * Return HTML for all rows of this table.
   * @return (undocumented)
   */
  protected abstract  scala.collection.Seq<scala.xml.Node> renderRows ()  ;
}
