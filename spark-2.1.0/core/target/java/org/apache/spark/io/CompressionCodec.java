package org.apache.spark.io;
/**
 * :: DeveloperApi ::
 * CompressionCodec allows the customization of choosing different compression implementations
 * to be used in block storage.
 * <p>
 * @note The wire protocol for a codec is not guaranteed compatible across versions of Spark.
 * This is intended for use as an internal compression utility within a single Spark application.
 */
public  interface CompressionCodec {
  public  java.io.OutputStream compressedOutputStream (java.io.OutputStream s)  ;
  public  java.io.InputStream compressedInputStream (java.io.InputStream s)  ;
}
