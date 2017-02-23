package org.apache.spark.deploy;
public  class SparkCuratorUtil$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkCuratorUtil$ MODULE$ = null;
  public   SparkCuratorUtil$ ()  { throw new RuntimeException(); }
  private  int ZK_CONNECTION_TIMEOUT_MILLIS ()  { throw new RuntimeException(); }
  private  int ZK_SESSION_TIMEOUT_MILLIS ()  { throw new RuntimeException(); }
  private  int RETRY_WAIT_MILLIS ()  { throw new RuntimeException(); }
  private  int MAX_RECONNECT_ATTEMPTS ()  { throw new RuntimeException(); }
  public  org.apache.curator.framework.CuratorFramework newClient (org.apache.spark.SparkConf conf, java.lang.String zkUrlConf)  { throw new RuntimeException(); }
  public  void mkdir (org.apache.curator.framework.CuratorFramework zk, java.lang.String path)  { throw new RuntimeException(); }
  public  void deleteRecursive (org.apache.curator.framework.CuratorFramework zk, java.lang.String path)  { throw new RuntimeException(); }
}
