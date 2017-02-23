package org.apache.spark.util.io;
/**
 * An OutputStream that writes to fixed-size chunks of byte arrays.
 * <p>
 * param:  chunkSize size of each chunk, in bytes.
 */
  class ChunkedByteBufferOutputStream extends java.io.OutputStream {
  public   ChunkedByteBufferOutputStream (int chunkSize, scala.Function1<java.lang.Object, java.nio.ByteBuffer> allocator)  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<java.nio.ByteBuffer> chunks ()  { throw new RuntimeException(); }
  /**
   * Next position to write in the last chunk.
   * <p>
   * If this equals chunkSize, it means for next write we need to allocate a new chunk.
   * This can also never be 0.
   * @return (undocumented)
   */
  public  long size ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  void write (int b)  { throw new RuntimeException(); }
  public  void write (byte[] bytes, int off, int len)  { throw new RuntimeException(); }
  private  void allocateNewChunkIfNeeded ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.io.ChunkedByteBuffer toChunkedByteBuffer ()  { throw new RuntimeException(); }
}
