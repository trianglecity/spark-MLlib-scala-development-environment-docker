package org.apache.spark.rpc.netty;
/**
 * A {@link RpcCallContext} that will call {@link RpcResponseCallback} to send the reply back.
 */
  class RemoteNettyRpcCallContext extends org.apache.spark.rpc.netty.NettyRpcCallContext {
  public   RemoteNettyRpcCallContext (org.apache.spark.rpc.netty.NettyRpcEnv nettyEnv, org.apache.spark.network.client.RpcResponseCallback callback, org.apache.spark.rpc.RpcAddress senderAddress)  { throw new RuntimeException(); }
  protected  void send (Object message)  { throw new RuntimeException(); }
}
