package org.apache.spark.deploy.master;
/**
 * LeaderAgent in this case is a no-op. Since leader is forever leader as the actual
 * recovery is made by restoring from filesystem.
 */
  class FileSystemRecoveryModeFactory extends org.apache.spark.deploy.master.StandaloneRecoveryModeFactory implements org.apache.spark.internal.Logging {
  public   FileSystemRecoveryModeFactory (org.apache.spark.SparkConf conf, org.apache.spark.serializer.Serializer serializer)  { throw new RuntimeException(); }
  public  java.lang.String RECOVERY_DIR ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.PersistenceEngine createPersistenceEngine ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.LeaderElectionAgent createLeaderElectionAgent (org.apache.spark.deploy.master.LeaderElectable master)  { throw new RuntimeException(); }
}
