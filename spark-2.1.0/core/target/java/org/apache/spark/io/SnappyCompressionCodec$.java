package org.apache.spark.io;
/**
 * Object guards against memory leak bug in snappy-java library:
 * (https://github.com/xerial/snappy-java/issues/131).
 * Before a new version of the library, we only call the method once and cache the result.
 */
public final class SnappyCompressionCodec$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SnappyCompressionCodec$ MODULE$ = null;
  public   SnappyCompressionCodec$ ()  { throw new RuntimeException(); }
  private  java.lang.String version ()  { throw new RuntimeException(); }
}
