package org.apache.spark.streaming.util;
public  class HdfsUtils {
  static public  org.apache.hadoop.fs.FSDataOutputStream getOutputStream (java.lang.String path, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FSDataInputStream getInputStream (java.lang.String path, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  static public  void checkState (boolean state, scala.Function0<java.lang.String> errorMsg)  { throw new RuntimeException(); }
  /** Get the locations of the HDFS blocks containing the given file segment. */
  static public  java.lang.String[] getFileSegmentLocations (java.lang.String path, long offset, long length, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FileSystem getFileSystemForPath (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /** Check if the file exists at the given path. */
  static public  boolean checkFileExists (java.lang.String path, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
}
