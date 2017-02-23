package org.apache.spark.rpc;
public  class RpcTimeout$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RpcTimeout$ MODULE$ = null;
  public   RpcTimeout$ ()  { throw new RuntimeException(); }
  /**
   * Lookup the timeout property in the configuration and create
   * a RpcTimeout with the property key in the description.
   * <p>
   * @param conf configuration properties containing the timeout
   * @param timeoutProp property key for the timeout in seconds
   * @throws NoSuchElementException if property is not set
   * @return (undocumented)
   */
  public  org.apache.spark.rpc.RpcTimeout apply (org.apache.spark.SparkConf conf, java.lang.String timeoutProp)  { throw new RuntimeException(); }
  /**
   * Lookup the timeout property in the configuration and create
   * a RpcTimeout with the property key in the description.
   * Uses the given default value if property is not set
   * <p>
   * @param conf configuration properties containing the timeout
   * @param timeoutProp property key for the timeout in seconds
   * @param defaultValue default timeout value in seconds if property not found
   * @return (undocumented)
   */
  public  org.apache.spark.rpc.RpcTimeout apply (org.apache.spark.SparkConf conf, java.lang.String timeoutProp, java.lang.String defaultValue)  { throw new RuntimeException(); }
  /**
   * Lookup prioritized list of timeout properties in the configuration
   * and create a RpcTimeout with the first set property key in the
   * description.
   * Uses the given default value if property is not set
   * <p>
   * @param conf configuration properties containing the timeout
   * @param timeoutPropList prioritized list of property keys for the timeout in seconds
   * @param defaultValue default timeout value in seconds if no properties found
   * @return (undocumented)
   */
  public  org.apache.spark.rpc.RpcTimeout apply (org.apache.spark.SparkConf conf, scala.collection.Seq<java.lang.String> timeoutPropList, java.lang.String defaultValue)  { throw new RuntimeException(); }
}
