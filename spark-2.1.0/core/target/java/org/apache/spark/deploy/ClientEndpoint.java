package org.apache.spark.deploy;
/**
 * Proxy that relays messages to the driver.
 * <p>
 * We currently don't support retry if submission fails. In HA mode, client will submit request to
 * all masters and see which one could handle it.
 */
public  class ClientEndpoint implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging {
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  // not preceding
  public   ClientEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.deploy.ClientArguments driverArgs, scala.collection.Seq<org.apache.spark.rpc.RpcEndpointRef> masterEndpoints, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledExecutorService forwardMessageThread ()  { throw new RuntimeException(); }
  private  scala.concurrent.ExecutionContextExecutor forwardMessageExecutionContext ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<org.apache.spark.rpc.RpcAddress> lostMasters ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef activeMasterEndpoint ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  /**
   * Send the message to master and forward the reply to self asynchronously.
   * @param message (undocumented)
   * @param evidence$1 (undocumented)
   */
  private <T extends java.lang.Object> void ayncSendToMasterAndForwardReply (Object message, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  void pollAndReportStatus (java.lang.String driverId)  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void onNetworkError (java.lang.Throwable cause, org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void onError (java.lang.Throwable cause)  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
}
