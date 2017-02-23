package org.apache.spark.rpc.netty;
/**
 * If the sender and the receiver are in the same process, the reply can be sent back via <code>Promise</code>.
 */
  class LocalNettyRpcCallContext extends org.apache.spark.rpc.netty.NettyRpcCallContext {
  public   LocalNettyRpcCallContext (org.apache.spark.rpc.RpcAddress senderAddress, scala.concurrent.Promise<java.lang.Object> p)  { throw new RuntimeException(); }
  protected  void send (Object message)  { throw new RuntimeException(); }
}
