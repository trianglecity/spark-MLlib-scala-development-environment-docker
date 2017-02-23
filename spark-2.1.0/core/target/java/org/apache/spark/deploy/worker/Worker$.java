package org.apache.spark.deploy.worker;
public  class Worker$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Worker$ MODULE$ = null;
  public   Worker$ ()  { throw new RuntimeException(); }
  public  java.lang.String SYSTEM_NAME ()  { throw new RuntimeException(); }
  public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] argStrings)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv startRpcEnvAndEndpoint (java.lang.String host, int port, int webUiPort, int cores, int memory, java.lang.String[] masterUrls, java.lang.String workDir, scala.Option<java.lang.Object> workerNumber, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  boolean isUseLocalNodeSSLConfig (org.apache.spark.deploy.Command cmd)  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.Command maybeUpdateSSLSettings (org.apache.spark.deploy.Command cmd, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
}
