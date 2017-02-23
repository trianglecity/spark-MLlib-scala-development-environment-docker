package org.apache.spark.rpc.netty;
/**
 * StreamManager implementation for serving files from a NettyRpcEnv.
 * <p>
 * Three kinds of resources can be registered in this manager, all backed by actual files:
 * <p>
 * - "/files": a flat list of files; used as the backend for {@link SparkContext.addFile}.
 * - "/jars": a flat list of files; used as the backend for {@link SparkContext.addJar}.
 * - arbitrary directories; all files under the directory become available through the manager,
 *   respecting the directory's hierarchy.
 * <p>
 * Only streaming (openStream) is supported.
 */
  class NettyStreamManager extends org.apache.spark.network.server.StreamManager implements org.apache.spark.rpc.RpcEnvFileServer {
  public   NettyStreamManager (org.apache.spark.rpc.netty.NettyRpcEnv rpcEnv)  { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<java.lang.String, java.io.File> files ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<java.lang.String, java.io.File> jars ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<java.lang.String, java.io.File> dirs ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer getChunk (long streamId, int chunkIndex)  { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer openStream (java.lang.String streamId)  { throw new RuntimeException(); }
  public  java.lang.String addFile (java.io.File file)  { throw new RuntimeException(); }
  public  java.lang.String addJar (java.io.File file)  { throw new RuntimeException(); }
  public  java.lang.String addDirectory (java.lang.String baseUri, java.io.File path)  { throw new RuntimeException(); }
}
