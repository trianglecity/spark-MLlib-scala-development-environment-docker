package org.apache.spark.streaming.flume;
/**
 * Share codes for Scala and Python unit tests
 */
  class FlumeTestUtils {
  public   FlumeTestUtils ()  { throw new RuntimeException(); }
  private  org.apache.avro.ipc.NettyTransceiver transceiver ()  { throw new RuntimeException(); }
  private  int testPort ()  { throw new RuntimeException(); }
  public  int getTestPort ()  { throw new RuntimeException(); }
  /** Find a free port */
  private  int findFreePort ()  { throw new RuntimeException(); }
  /** Send data to the flume receiver */
  public  void writeInput (java.util.List<java.lang.String> input, boolean enableCompression)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  /** Class to create socket channel with compression */
  private  class CompressionChannelFactory extends org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory {
    public   CompressionChannelFactory (int compressionLevel)  { throw new RuntimeException(); }
    public  org.jboss.netty.channel.socket.SocketChannel newChannel (org.jboss.netty.channel.ChannelPipeline pipeline)  { throw new RuntimeException(); }
  }
}
