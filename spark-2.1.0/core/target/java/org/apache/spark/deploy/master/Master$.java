package org.apache.spark.deploy.master;
public  class Master$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Master$ MODULE$ = null;
  public   Master$ ()  { throw new RuntimeException(); }
  public  java.lang.String SYSTEM_NAME ()  { throw new RuntimeException(); }
  public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] argStrings)  { throw new RuntimeException(); }
  /**
   * Start the Master and return a three tuple of:
   *   (1) The Master RpcEnv
   *   (2) The web UI bound port
   *   (3) The REST server bound port, if any
   * @param host (undocumented)
   * @param port (undocumented)
   * @param webUiPort (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple3<org.apache.spark.rpc.RpcEnv, java.lang.Object, scala.Option<java.lang.Object>> startRpcEnvAndEndpoint (java.lang.String host, int port, int webUiPort, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
}
