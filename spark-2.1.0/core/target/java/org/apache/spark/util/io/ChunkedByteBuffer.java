package org.apache.spark.util.io;
/**
 * Read-only byte buffer which is physically stored as multiple chunks rather than a single
 * contiguous array.
 * <p>
 * param:  chunks an array of {@link ByteBuffer}s. Each buffer in this array must have position == 0.
 *               Ownership of these buffers is transferred to the ChunkedByteBuffer, so if these
 *               buffers may also be used elsewhere then the caller is responsible for copying
 *               them as needed.
 */
  class ChunkedByteBuffer {
  public  java.nio.ByteBuffer[] chunks ()  { throw new RuntimeException(); }
  // not preceding
  public   ChunkedByteBuffer (java.nio.ByteBuffer[] chunks)  { throw new RuntimeException(); }
  /**
   * This size of this buffer, in bytes.
   * @return (undocumented)
   */
  public  long size ()  { throw new RuntimeException(); }
  public   ChunkedByteBuffer (java.nio.ByteBuffer byteBuffer)  { throw new RuntimeException(); }
  /**
   * Write this buffer to a channel.
   * @param channel (undocumented)
   */
  public  void writeFully (java.nio.channels.WritableByteChannel channel)  { throw new RuntimeException(); }
  /**
   * Wrap this buffer to view it as a Netty ByteBuf.
   * @return (undocumented)
   */
  public  io.netty.buffer.ByteBuf toNetty ()  { throw new RuntimeException(); }
  /**
   * Copy this buffer into a new byte array.
   * <p>
   * @throws UnsupportedOperationException if this buffer's size exceeds the maximum array size.
   * @return (undocumented)
   */
  public  byte[] toArray ()  { throw new RuntimeException(); }
  /**
   * Copy this buffer into a new ByteBuffer.
   * <p>
   * @throws UnsupportedOperationException if this buffer's size exceeds the max ByteBuffer size.
   * @return (undocumented)
   */
  public  java.nio.ByteBuffer toByteBuffer ()  { throw new RuntimeException(); }
  /**
   * Creates an input stream to read data from this ChunkedByteBuffer.
   * <p>
   * @param dispose if true, {@link dispose()} will be called at the end of the stream
   *                in order to close any memory-mapped files which back this buffer.
   * @return (undocumented)
   */
  public  java.io.InputStream toInputStream (boolean dispose)  { throw new RuntimeException(); }
  /**
   * Get duplicates of the ByteBuffers backing this ChunkedByteBuffer.
   * @return (undocumented)
   */
  public  java.nio.ByteBuffer[] getChunks ()  { throw new RuntimeException(); }
  /**
   * Make a copy of this ChunkedByteBuffer, copying all of the backing data into new buffers.
   * The new buffer will share no resources with the original buffer.
   * <p>
   * @param allocator a method for allocating byte buffers
   * @return (undocumented)
   */
  public  org.apache.spark.util.io.ChunkedByteBuffer copy (scala.Function1<java.lang.Object, java.nio.ByteBuffer> allocator)  { throw new RuntimeException(); }
  /**
   * Attempt to clean up a ByteBuffer if it is memory-mapped. This uses an *unsafe* Sun API that
   * might cause errors if one attempts to read from the unmapped buffer, but it's better than
   * waiting for the GC to find it because that could lead to huge numbers of open files. There's
   * unfortunately no standard API to do this.
   */
  public  void dispose ()  { throw new RuntimeException(); }
}
