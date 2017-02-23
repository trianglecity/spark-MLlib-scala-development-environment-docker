package org.apache.spark.deploy.yarn;
/**
 * Handles registering and unregistering the application with the YARN ResourceManager.
 */
  class YarnRMClient implements org.apache.spark.internal.Logging {
  public   YarnRMClient ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.yarn.client.api.AMRMClient<org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest> amClient ()  { throw new RuntimeException(); }
  private  java.lang.String uiHistoryAddress ()  { throw new RuntimeException(); }
  private  boolean registered ()  { throw new RuntimeException(); }
  /**
   * Registers the application master with the RM.
   * <p>
   * @param conf The Yarn configuration.
   * @param sparkConf The Spark configuration.
   * @param uiAddress Address of the SparkUI.
   * @param uiHistoryAddress Address of the application on the History Server.
   * @param securityMgr The security manager.
   * @param localResources Map with information about files distributed via YARN's cache.
   * @param driverUrl (undocumented)
   * @param driverRef (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.deploy.yarn.YarnAllocator register (java.lang.String driverUrl, org.apache.spark.rpc.RpcEndpointRef driverRef, org.apache.hadoop.yarn.conf.YarnConfiguration conf, org.apache.spark.SparkConf sparkConf, java.lang.String uiAddress, java.lang.String uiHistoryAddress, org.apache.spark.SecurityManager securityMgr, scala.collection.immutable.Map<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> localResources)  { throw new RuntimeException(); }
  /**
   * Unregister the AM. Guaranteed to only be called once.
   * <p>
   * @param status The final status of the AM.
   * @param diagnostics Diagnostics message to include in the final status.
   */
  public  void unregister (org.apache.hadoop.yarn.api.records.FinalApplicationStatus status, java.lang.String diagnostics)  { throw new RuntimeException(); }
  /** Returns the attempt ID. */
  public  org.apache.hadoop.yarn.api.records.ApplicationAttemptId getAttemptId ()  { throw new RuntimeException(); }
  /** Returns the configuration for the AmIpFilter to add to the Spark UI. */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getAmIpFilterParams (org.apache.hadoop.yarn.conf.YarnConfiguration conf, java.lang.String proxyBase)  { throw new RuntimeException(); }
  /** Returns the maximum number of attempts to register the AM. */
  public  int getMaxRegAttempts (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.yarn.conf.YarnConfiguration yarnConf)  { throw new RuntimeException(); }
}
