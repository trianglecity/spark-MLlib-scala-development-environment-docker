package org.apache.spark.serializer;
/**
 * Component which configures serialization, compression and encryption for various Spark
 * components, including automatic selection of which {@link Serializer} to use for shuffles.
 */
  class SerializerManager {
  public   SerializerManager (org.apache.spark.serializer.Serializer defaultSerializer, org.apache.spark.SparkConf conf, scala.Option<byte[]> encryptionKey)  { throw new RuntimeException(); }
  public   SerializerManager (org.apache.spark.serializer.Serializer defaultSerializer, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  private  org.apache.spark.io.CompressionCodec compressionCodec ()  { throw new RuntimeException(); }
  public  boolean encryptionEnabled ()  { throw new RuntimeException(); }
  public  boolean canUseKryo (scala.reflect.ClassTag<?> ct)  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.Serializer getSerializer (scala.reflect.ClassTag<?> ct, boolean autoPick)  { throw new RuntimeException(); }
  /**
   * Pick the best serializer for shuffling an RDD of key-value pairs.
   * @param keyClassTag (undocumented)
   * @param valueClassTag (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.serializer.Serializer getSerializer (scala.reflect.ClassTag<?> keyClassTag, scala.reflect.ClassTag<?> valueClassTag)  { throw new RuntimeException(); }
  private  boolean shouldCompress (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Wrap an input stream for encryption and compression
   * @param blockId (undocumented)
   * @param s (undocumented)
   * @return (undocumented)
   */
  public  java.io.InputStream wrapStream (org.apache.spark.storage.BlockId blockId, java.io.InputStream s)  { throw new RuntimeException(); }
  /**
   * Wrap an output stream for encryption and compression
   * @param blockId (undocumented)
   * @param s (undocumented)
   * @return (undocumented)
   */
  public  java.io.OutputStream wrapStream (org.apache.spark.storage.BlockId blockId, java.io.OutputStream s)  { throw new RuntimeException(); }
  /**
   * Wrap an input stream for encryption if shuffle encryption is enabled
   * @param s (undocumented)
   * @return (undocumented)
   */
  public  java.io.InputStream wrapForEncryption (java.io.InputStream s)  { throw new RuntimeException(); }
  /**
   * Wrap an output stream for encryption if shuffle encryption is enabled
   * @param s (undocumented)
   * @return (undocumented)
   */
  public  java.io.OutputStream wrapForEncryption (java.io.OutputStream s)  { throw new RuntimeException(); }
  /**
   * Wrap an output stream for compression if block compression is enabled for its block type
   * @param blockId (undocumented)
   * @param s (undocumented)
   * @return (undocumented)
   */
  private  java.io.OutputStream wrapForCompression (org.apache.spark.storage.BlockId blockId, java.io.OutputStream s)  { throw new RuntimeException(); }
  /**
   * Wrap an input stream for compression if block compression is enabled for its block type
   * @param blockId (undocumented)
   * @param s (undocumented)
   * @return (undocumented)
   */
  private  java.io.InputStream wrapForCompression (org.apache.spark.storage.BlockId blockId, java.io.InputStream s)  { throw new RuntimeException(); }
  /** Serializes into a stream. */
  public <T extends java.lang.Object> void dataSerializeStream (org.apache.spark.storage.BlockId blockId, java.io.OutputStream outputStream, scala.collection.Iterator<T> values, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /** Serializes into a chunked byte buffer. */
  public <T extends java.lang.Object> org.apache.spark.util.io.ChunkedByteBuffer dataSerialize (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<T> values, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  /** Serializes into a chunked byte buffer. */
  public  org.apache.spark.util.io.ChunkedByteBuffer dataSerializeWithExplicitClassTag (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<?> values, scala.reflect.ClassTag<?> classTag)  { throw new RuntimeException(); }
  /**
   * Deserializes an InputStream into an iterator of values and disposes of it when the end of
   * the iterator is reached.
   * @param blockId (undocumented)
   * @param inputStream (undocumented)
   * @param classTag (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.collection.Iterator<T> dataDeserializeStream (org.apache.spark.storage.BlockId blockId, java.io.InputStream inputStream, scala.reflect.ClassTag<T> classTag)  { throw new RuntimeException(); }
}
