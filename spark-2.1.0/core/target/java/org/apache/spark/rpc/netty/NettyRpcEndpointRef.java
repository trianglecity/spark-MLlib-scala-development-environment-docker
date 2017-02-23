package org.apache.spark.rpc.netty;
/**
 * The NettyRpcEnv version of RpcEndpointRef.
 * <p>
 * This class behaves differently depending on where it's created. On the node that "owns" the
 * RpcEndpoint, it's a simple wrapper around the RpcEndpointAddress instance.
 * <p>
 * On other machines that receive a serialized version of the reference, the behavior changes. The
 * instance will keep track of the TransportClient that sent the reference, so that messages
 * to the endpoint are sent over the client connection, instead of needing a new connection to
 * be opened.
 * <p>
 * The RpcAddress of this ref can be null; what that means is that the ref can only be used through
 * a client connection, since the process hosting the endpoint is not listening for incoming
 * connections. These refs should not be shared with 3rd parties, since they will not be able to
 * send messages to the endpoint.
 * <p>
 * param:  conf Spark configuration.
 * param:  endpointAddress The address where the endpoint is listening.
 * param:  nettyEnv The RpcEnv associated with this ref.
 */
  class NettyRpcEndpointRef extends org.apache.spark.rpc.RpcEndpointRef implements java.io.Serializable, org.apache.spark.internal.Logging {
  private  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.netty.NettyRpcEnv nettyEnv ()  { throw new RuntimeException(); }
  // not preceding
  public   NettyRpcEndpointRef (org.apache.spark.SparkConf conf, org.apache.spark.rpc.RpcEndpointAddress endpointAddress, org.apache.spark.rpc.netty.NettyRpcEnv nettyEnv)  { throw new RuntimeException(); }
  public  org.apache.spark.network.client.TransportClient client ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointAddress _address ()  { throw new RuntimeException(); }
  private  java.lang.String _name ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcAddress address ()  { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream in)  { throw new RuntimeException(); }
  private  void writeObject (java.io.ObjectOutputStream out)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> scala.concurrent.Future<T> ask (Object message, org.apache.spark.rpc.RpcTimeout timeout, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  public  void send (Object message)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.net.URI toURI ()  { throw new RuntimeException(); }
  public final  boolean equals (Object that)  { throw new RuntimeException(); }
  public final  int hashCode ()  { throw new RuntimeException(); }
}
