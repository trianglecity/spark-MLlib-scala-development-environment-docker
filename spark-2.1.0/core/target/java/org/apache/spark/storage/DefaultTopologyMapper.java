package org.apache.spark.storage;
/**
 * A TopologyMapper that assumes all nodes are in the same rack
 */
public  class DefaultTopologyMapper extends org.apache.spark.storage.TopologyMapper implements org.apache.spark.internal.Logging {
  public   DefaultTopologyMapper (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> getTopologyForHost (java.lang.String hostname)  { throw new RuntimeException(); }
}
