package org.apache.spark.status.api.v1;
public  class AllRDDResource$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AllRDDResource$ MODULE$ = null;
  public   AllRDDResource$ ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.RDDStorageInfo> getRDDStorageInfo (int rddId, org.apache.spark.ui.storage.StorageListener listener, boolean includeDetails)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.RDDStorageInfo getRDDStorageInfo (int rddId, org.apache.spark.storage.RDDInfo rddInfo, scala.collection.Seq<org.apache.spark.storage.StorageStatus> storageStatusList, boolean includeDetails)  { throw new RuntimeException(); }
}
