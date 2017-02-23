package org.apache.spark.deploy.master;
  class ZooKeeperRecoveryModeFactory extends org.apache.spark.deploy.master.StandaloneRecoveryModeFactory {
  public   ZooKeeperRecoveryModeFactory (org.apache.spark.SparkConf conf, org.apache.spark.serializer.Serializer serializer)  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.PersistenceEngine createPersistenceEngine ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.LeaderElectionAgent createLeaderElectionAgent (org.apache.spark.deploy.master.LeaderElectable master)  { throw new RuntimeException(); }
}
