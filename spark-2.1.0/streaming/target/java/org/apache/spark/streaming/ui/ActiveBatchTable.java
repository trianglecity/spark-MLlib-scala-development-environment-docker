package org.apache.spark.streaming.ui;
  class ActiveBatchTable extends org.apache.spark.streaming.ui.BatchTableBase {
  public   ActiveBatchTable (scala.collection.Seq<org.apache.spark.streaming.ui.BatchUIData> runningBatches, scala.collection.Seq<org.apache.spark.streaming.ui.BatchUIData> waitingBatches, long batchInterval)  { throw new RuntimeException(); }
  private  scala.Option<java.lang.String> firstFailureReason ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<scala.xml.Node> columns ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<scala.xml.Node> renderRows ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> runningBatchRow (org.apache.spark.streaming.ui.BatchUIData batch)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> waitingBatchRow (org.apache.spark.streaming.ui.BatchUIData batch)  { throw new RuntimeException(); }
}
