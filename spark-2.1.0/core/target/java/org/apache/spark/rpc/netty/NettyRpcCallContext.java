package org.apache.spark.rpc.netty;
 abstract class NettyRpcCallContext implements org.apache.spark.rpc.RpcCallContext, org.apache.spark.internal.Logging {
  public  org.apache.spark.rpc.RpcAddress senderAddress ()  { throw new RuntimeException(); }
  // not preceding
  public   NettyRpcCallContext (org.apache.spark.rpc.RpcAddress senderAddress)  { throw new RuntimeException(); }
  protected abstract  void send (Object message)  ;
  public  void reply (Object response)  { throw new RuntimeException(); }
  public  void sendFailure (java.lang.Throwable e)  { throw new RuntimeException(); }
}
