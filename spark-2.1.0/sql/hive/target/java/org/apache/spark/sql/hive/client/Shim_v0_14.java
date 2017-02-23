package org.apache.spark.sql.hive.client;
  class Shim_v0_14 extends org.apache.spark.sql.hive.client.Shim_v0_13 {
  public   Shim_v0_14 ()  { throw new RuntimeException(); }
  private  java.lang.reflect.Method loadPartitionMethod ()  { throw new RuntimeException(); }
  private  java.lang.reflect.Method loadTableMethod ()  { throw new RuntimeException(); }
  private  java.lang.reflect.Method loadDynamicPartitionsMethod ()  { throw new RuntimeException(); }
  private  java.lang.reflect.Method dropTableMethod ()  { throw new RuntimeException(); }
  private  java.lang.reflect.Method getTimeVarMethod ()  { throw new RuntimeException(); }
  public  void loadPartition (org.apache.hadoop.hive.ql.metadata.Hive hive, org.apache.hadoop.fs.Path loadPath, java.lang.String tableName, java.util.Map<java.lang.String, java.lang.String> partSpec, boolean replace, boolean holdDDLTime, boolean inheritTableSpecs, boolean isSkewedStoreAsSubdir)  { throw new RuntimeException(); }
  public  void loadTable (org.apache.hadoop.hive.ql.metadata.Hive hive, org.apache.hadoop.fs.Path loadPath, java.lang.String tableName, boolean replace, boolean holdDDLTime)  { throw new RuntimeException(); }
  public  void loadDynamicPartitions (org.apache.hadoop.hive.ql.metadata.Hive hive, org.apache.hadoop.fs.Path loadPath, java.lang.String tableName, java.util.Map<java.lang.String, java.lang.String> partSpec, boolean replace, int numDP, boolean holdDDLTime, boolean listBucketingEnabled)  { throw new RuntimeException(); }
  public  void dropTable (org.apache.hadoop.hive.ql.metadata.Hive hive, java.lang.String dbName, java.lang.String tableName, boolean deleteData, boolean ignoreIfNotExists, boolean purge)  { throw new RuntimeException(); }
  public  long getMetastoreClientConnectRetryDelayMillis (org.apache.hadoop.hive.conf.HiveConf conf)  { throw new RuntimeException(); }
  protected  boolean isSrcLocal (org.apache.hadoop.fs.Path path, org.apache.hadoop.hive.conf.HiveConf conf)  { throw new RuntimeException(); }
}
