package org.apache.spark.api.r;
/**
 * Handler for RBackend
 * TODO: This is marked as sharable to get a handle to RBackend. Is it safe to re-use
 * this across connections ?
 */
  class RBackendHandler extends io.netty.channel.SimpleChannelInboundHandler<byte[]> implements org.apache.spark.internal.Logging {
  public   RBackendHandler (org.apache.spark.api.r.RBackend server)  { throw new RuntimeException(); }
  public  void channelRead0 (io.netty.channel.ChannelHandlerContext ctx, byte[] msg)  { throw new RuntimeException(); }
  public  void channelReadComplete (io.netty.channel.ChannelHandlerContext ctx)  { throw new RuntimeException(); }
  public  void exceptionCaught (io.netty.channel.ChannelHandlerContext ctx, java.lang.Throwable cause)  { throw new RuntimeException(); }
  public  void handleMethodCall (boolean isStatic, java.lang.String objId, java.lang.String methodName, int numArgs, java.io.DataInputStream dis, java.io.DataOutputStream dos)  { throw new RuntimeException(); }
  public  java.lang.Object[] readArgs (int numArgs, java.io.DataInputStream dis)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> findMatchedSignature (java.lang.Class<?>[][] parameterTypesOfMethods, java.lang.Object[] args)  { throw new RuntimeException(); }
}
