package org.apache.spark.streaming.util;
public  class HdfsUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HdfsUtils$ MODULE$ = null;
  public   HdfsUtils$ ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FSDataOutputStream getOutputStream (java.lang.String path, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FSDataInputStream getInputStream (java.lang.String path, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  public  void checkState (boolean state, scala.Function0<java.lang.String> errorMsg)  { throw new RuntimeException(); }
  /** Get the locations of the HDFS blocks containing the given file segment. */
  public  java.lang.String[] getFileSegmentLocations (java.lang.String path, long offset, long length, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FileSystem getFileSystemForPath (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /** Check if the file exists at the given path. */
  public  boolean checkFileExists (java.lang.String path, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
}
