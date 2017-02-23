package org.apache.spark.network.netty;
/**
 * Serves requests to open blocks by simply registering one chunk per block requested.
 * Handles opening and uploading arbitrary BlockManager blocks.
 * <p>
 * Opened blocks are registered with the "one-for-one" strategy, meaning each Transport-layer Chunk
 * is equivalent to one Spark-level shuffle block.
 */
public  class NettyBlockRpcServer extends org.apache.spark.network.server.RpcHandler implements org.apache.spark.internal.Logging {
  public   NettyBlockRpcServer (java.lang.String appId, org.apache.spark.serializer.Serializer serializer, org.apache.spark.network.BlockDataManager blockManager)  { throw new RuntimeException(); }
  private  org.apache.spark.network.server.OneForOneStreamManager streamManager ()  { throw new RuntimeException(); }
  public  void receive (org.apache.spark.network.client.TransportClient client, java.nio.ByteBuffer rpcMessage, org.apache.spark.network.client.RpcResponseCallback responseContext)  { throw new RuntimeException(); }
  public  org.apache.spark.network.server.StreamManager getStreamManager ()  { throw new RuntimeException(); }
}
