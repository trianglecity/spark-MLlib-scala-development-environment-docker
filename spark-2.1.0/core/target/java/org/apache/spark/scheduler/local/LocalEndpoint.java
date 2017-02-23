package org.apache.spark.scheduler.local;
/**
 * Calls to {@link LocalSchedulerBackend} are all serialized through LocalEndpoint. Using an
 * RpcEndpoint makes the calls on {@link LocalSchedulerBackend} asynchronous, which is necessary
 * to prevent deadlock between {@link LocalSchedulerBackend} and the {@link TaskSchedulerImpl}.
 */
  class LocalEndpoint implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging {
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  private  int totalCores ()  { throw new RuntimeException(); }
  // not preceding
  public   LocalEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, scala.collection.Seq<java.net.URL> userClassPath, org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.scheduler.local.LocalSchedulerBackend executorBackend, int totalCores)  { throw new RuntimeException(); }
  private  int freeCores ()  { throw new RuntimeException(); }
  public  java.lang.String localExecutorId ()  { throw new RuntimeException(); }
  public  java.lang.String localExecutorHostname ()  { throw new RuntimeException(); }
  private  org.apache.spark.executor.Executor executor ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  public  void reviveOffers ()  { throw new RuntimeException(); }
}
