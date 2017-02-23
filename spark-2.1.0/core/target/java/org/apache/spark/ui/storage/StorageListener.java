package org.apache.spark.ui.storage;
/**
 * :: DeveloperApi ::
 * A SparkListener that prepares information to be displayed on the BlockManagerUI.
 * <p>
 * This class is thread-safe (unlike JobProgressListener)
 */
public  class StorageListener extends org.apache.spark.storage.BlockStatusListener {
  public   StorageListener (org.apache.spark.storage.StorageStatusListener storageStatusListener)  { throw new RuntimeException(); }
    scala.collection.mutable.Map<java.lang.Object, org.apache.spark.storage.RDDInfo> _rddInfoMap ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.storage.StorageStatus> activeStorageStatusList ()  { throw new RuntimeException(); }
  /** Filter RDD info to include only those with cached partitions */
  public  scala.collection.Seq<org.apache.spark.storage.RDDInfo> rddInfoList ()  { throw new RuntimeException(); }
  /** Update the storage info of the RDDs whose blocks are among the given updated blocks */
  private  void updateRDDInfo (scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> updatedBlocks)  { throw new RuntimeException(); }
  public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmitted)  { throw new RuntimeException(); }
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  { throw new RuntimeException(); }
  public  void onUnpersistRDD (org.apache.spark.scheduler.SparkListenerUnpersistRDD unpersistRDD)  { throw new RuntimeException(); }
  public  void onBlockUpdated (org.apache.spark.scheduler.SparkListenerBlockUpdated blockUpdated)  { throw new RuntimeException(); }
}
