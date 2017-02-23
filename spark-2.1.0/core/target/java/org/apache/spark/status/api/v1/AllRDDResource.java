package org.apache.spark.status.api.v1;
  class AllRDDResource {
  static public  scala.Option<org.apache.spark.status.api.v1.RDDStorageInfo> getRDDStorageInfo (int rddId, org.apache.spark.ui.storage.StorageListener listener, boolean includeDetails)  { throw new RuntimeException(); }
  static public  org.apache.spark.status.api.v1.RDDStorageInfo getRDDStorageInfo (int rddId, org.apache.spark.storage.RDDInfo rddInfo, scala.collection.Seq<org.apache.spark.storage.StorageStatus> storageStatusList, boolean includeDetails)  { throw new RuntimeException(); }
  public   AllRDDResource (org.apache.spark.ui.SparkUI ui)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.RDDStorageInfo> rddList ()  { throw new RuntimeException(); }
}
