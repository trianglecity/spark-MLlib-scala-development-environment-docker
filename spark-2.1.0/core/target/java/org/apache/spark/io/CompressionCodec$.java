package org.apache.spark.io;
public  class CompressionCodec$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CompressionCodec$ MODULE$ = null;
  public   CompressionCodec$ ()  { throw new RuntimeException(); }
  private  java.lang.String configKey ()  { throw new RuntimeException(); }
    boolean supportsConcatenationOfSerializedStreams (org.apache.spark.io.CompressionCodec codec)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.String> shortCompressionCodecNames ()  { throw new RuntimeException(); }
  public  java.lang.String getCodecName (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.io.CompressionCodec createCodec (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.io.CompressionCodec createCodec (org.apache.spark.SparkConf conf, java.lang.String codecName)  { throw new RuntimeException(); }
  /**
   * Return the short version of the given codec name.
   * If it is already a short name, just return it.
   * @param codecName (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getShortName (java.lang.String codecName)  { throw new RuntimeException(); }
  public  java.lang.String FALLBACK_COMPRESSION_CODEC ()  { throw new RuntimeException(); }
  public  java.lang.String DEFAULT_COMPRESSION_CODEC ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> ALL_COMPRESSION_CODECS ()  { throw new RuntimeException(); }
}
