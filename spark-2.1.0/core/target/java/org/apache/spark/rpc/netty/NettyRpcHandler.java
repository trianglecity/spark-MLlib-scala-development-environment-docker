package org.apache.spark.rpc.netty;
/**
 * Dispatches incoming RPCs to registered endpoints.
 * <p>
 * The handler keeps track of all client instances that communicate with it, so that the RpcEnv
 * knows which <code>TransportClient</code> instance to use when sending RPCs to a client endpoint (i.e.,
 * one that is not listening for incoming connections, but rather needs to be contacted via the
 * client socket).
 * <p>
 * Events are sent on a per-connection basis, so if a client opens multiple connections to the
 * RpcEnv, multiple connection / disconnection events will be created for that client (albeit
 * with different <code>RpcAddress</code> information).
 */
  class NettyRpcHandler extends org.apache.spark.network.server.RpcHandler implements org.apache.spark.internal.Logging {
  public   NettyRpcHandler (org.apache.spark.rpc.netty.Dispatcher dispatcher, org.apache.spark.rpc.netty.NettyRpcEnv nettyEnv, org.apache.spark.network.server.StreamManager streamManager)  { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<org.apache.spark.rpc.RpcAddress, org.apache.spark.rpc.RpcAddress> remoteAddresses ()  { throw new RuntimeException(); }
  public  void receive (org.apache.spark.network.client.TransportClient client, java.nio.ByteBuffer message, org.apache.spark.network.client.RpcResponseCallback callback)  { throw new RuntimeException(); }
  public  void receive (org.apache.spark.network.client.TransportClient client, java.nio.ByteBuffer message)  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.netty.RequestMessage internalReceive (org.apache.spark.network.client.TransportClient client, java.nio.ByteBuffer message)  { throw new RuntimeException(); }
  public  org.apache.spark.network.server.StreamManager getStreamManager ()  { throw new RuntimeException(); }
  public  void exceptionCaught (java.lang.Throwable cause, org.apache.spark.network.client.TransportClient client)  { throw new RuntimeException(); }
  public  void channelActive (org.apache.spark.network.client.TransportClient client)  { throw new RuntimeException(); }
  public  void channelInactive (org.apache.spark.network.client.TransportClient client)  { throw new RuntimeException(); }
}
