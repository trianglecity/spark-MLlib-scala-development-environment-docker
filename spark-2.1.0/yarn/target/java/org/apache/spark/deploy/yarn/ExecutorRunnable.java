package org.apache.spark.deploy.yarn;
  class ExecutorRunnable implements org.apache.spark.internal.Logging {
  public   ExecutorRunnable (scala.Option<org.apache.hadoop.yarn.api.records.Container> container, org.apache.hadoop.yarn.conf.YarnConfiguration conf, org.apache.spark.SparkConf sparkConf, java.lang.String masterAddress, java.lang.String executorId, java.lang.String hostname, int executorMemory, int executorCores, java.lang.String appId, org.apache.spark.SecurityManager securityMgr, scala.collection.immutable.Map<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> localResources)  { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.ipc.YarnRPC rpc ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.client.api.NMClient nmClient ()  { throw new RuntimeException(); }
  public  void run ()  { throw new RuntimeException(); }
  public  java.lang.String launchContextDebugInfo ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.nio.ByteBuffer> startContainer ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.List<java.lang.String> prepareCommand ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> prepareEnvironment ()  { throw new RuntimeException(); }
}
