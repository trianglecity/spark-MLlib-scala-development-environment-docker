package org.apache.spark.storage;
  class BlockStatusListener extends org.apache.spark.scheduler.SparkListener {
  public   BlockStatusListener ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.storage.BlockManagerId, scala.collection.mutable.HashMap<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockUIData>> blockManagers ()  { throw new RuntimeException(); }
  public  void onBlockUpdated (org.apache.spark.scheduler.SparkListenerBlockUpdated blockUpdated)  { throw new RuntimeException(); }
  public  void onBlockManagerAdded (org.apache.spark.scheduler.SparkListenerBlockManagerAdded blockManagerAdded)  { throw new RuntimeException(); }
  public  void onBlockManagerRemoved (org.apache.spark.scheduler.SparkListenerBlockManagerRemoved blockManagerRemoved)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.storage.ExecutorStreamBlockStatus> allExecutorStreamBlockStatus ()  { throw new RuntimeException(); }
}
