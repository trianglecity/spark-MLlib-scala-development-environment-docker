package org.apache.spark.storage;
/**
 * A simple file based topology mapper. This expects topology information provided as a
 * {@link java.util.Properties} file. The name of the file is obtained from SparkConf property
 * <code>spark.storage.replication.topologyFile</code>. To use this topology mapper, set the
 * <code>spark.storage.replication.topologyMapper</code> property to
 * {@link org.apache.spark.storage.FileBasedTopologyMapper}
 * param:  conf SparkConf object
 */
public  class FileBasedTopologyMapper extends org.apache.spark.storage.TopologyMapper implements org.apache.spark.internal.Logging {
  public   FileBasedTopologyMapper (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> topologyFile ()  { throw new RuntimeException(); }
  public  scala.collection.Map<java.lang.String, java.lang.String> topologyMap ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> getTopologyForHost (java.lang.String hostname)  { throw new RuntimeException(); }
}
