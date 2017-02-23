package org.apache.spark.storage;
/**
 * An RpcEndpoint to take commands from the master to execute options. For example,
 * this is used to remove blocks from the slave's BlockManager.
 */
  class BlockManagerSlaveEndpoint implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging {
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  // not preceding
  public   BlockManagerSlaveEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.storage.BlockManager blockManager, org.apache.spark.MapOutputTracker mapOutputTracker)  { throw new RuntimeException(); }
  private  java.util.concurrent.ThreadPoolExecutor asyncThreadPool ()  { throw new RuntimeException(); }
  private  scala.concurrent.ExecutionContextExecutorService asyncExecutionContext ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  private <T extends java.lang.Object> void doAsync (java.lang.String actionMessage, org.apache.spark.rpc.RpcCallContext context, scala.Function0<T> body)  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
}
