package org.apache.spark.rpc;
public  class RpcAddress$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RpcAddress$ MODULE$ = null;
  public   RpcAddress$ ()  { throw new RuntimeException(); }
  /** Return the {@link RpcAddress} represented by `uri`. */
  public  org.apache.spark.rpc.RpcAddress fromURIString (java.lang.String uri)  { throw new RuntimeException(); }
  /** Returns the {@link RpcAddress} encoded in the form of "spark://host:port" */
  public  org.apache.spark.rpc.RpcAddress fromSparkURL (java.lang.String sparkUrl)  { throw new RuntimeException(); }
}
