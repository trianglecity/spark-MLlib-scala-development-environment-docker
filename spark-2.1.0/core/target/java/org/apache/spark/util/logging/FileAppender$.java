package org.apache.spark.util.logging;
/**
 * Companion object to {@link org.apache.spark.util.logging.FileAppender} which has helper
 * functions to choose the correct type of FileAppender based on SparkConf configuration.
 */
public  class FileAppender$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FileAppender$ MODULE$ = null;
  public   FileAppender$ ()  { throw new RuntimeException(); }
  /** Create the right appender based on Spark configuration */
  public  org.apache.spark.util.logging.FileAppender apply (java.io.InputStream inputStream, java.io.File file, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
}
