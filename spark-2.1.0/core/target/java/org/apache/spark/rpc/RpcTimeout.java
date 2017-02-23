package org.apache.spark.rpc;
/**
 * Associates a timeout with a description so that a when a TimeoutException occurs, additional
 * context about the timeout can be amended to the exception message.
 * <p>
 * param:  duration timeout duration in seconds
 * param:  timeoutProp the configuration property that controls this timeout
 */
  class RpcTimeout implements scala.Serializable {
  /**
   * Lookup the timeout property in the configuration and create
   * a RpcTimeout with the property key in the description.
   * <p>
   * @param conf configuration properties containing the timeout
   * @param timeoutProp property key for the timeout in seconds
   * @throws NoSuchElementException if property is not set
   * @return (undocumented)
   */
  static public  org.apache.spark.rpc.RpcTimeout apply (org.apache.spark.SparkConf conf, java.lang.String timeoutProp)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.rpc.RpcTimeout apply (org.apache.spark.SparkConf conf, java.lang.String timeoutProp, java.lang.String defaultValue)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.rpc.RpcTimeout apply (org.apache.spark.SparkConf conf, scala.collection.Seq<java.lang.String> timeoutPropList, java.lang.String defaultValue)  { throw new RuntimeException(); }
  public  scala.concurrent.duration.FiniteDuration duration ()  { throw new RuntimeException(); }
  public  java.lang.String timeoutProp ()  { throw new RuntimeException(); }
  // not preceding
  public   RpcTimeout (scala.concurrent.duration.FiniteDuration duration, java.lang.String timeoutProp)  { throw new RuntimeException(); }
  /** Amends the standard message of TimeoutException to include the description */
  private  org.apache.spark.rpc.RpcTimeoutException createRpcTimeoutException (java.util.concurrent.TimeoutException te)  { throw new RuntimeException(); }
  /**
   * PartialFunction to match a TimeoutException and add the timeout description to the message
   * <p>
   * @note This can be used in the recover callback of a Future to add to a TimeoutException
   * Example:
   *    val timeout = new RpcTimeout(5 millis, "short timeout")
   *    Future(throw new TimeoutException).recover(timeout.addMessageIfTimeout)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.PartialFunction<java.lang.Throwable, T> addMessageIfTimeout ()  { throw new RuntimeException(); }
  /**
   * Wait for the completed result and return it. If the result is not available within this
   * timeout, throw a {@link RpcTimeoutException} to indicate which configuration controls the timeout.
   * <p>
   * @param  future  the <code>Future</code> to be awaited
   * @throws RpcTimeoutException if after waiting for the specified time <code>future</code>
   *         is still not ready
   * @param future (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T awaitResult (scala.concurrent.Future<T> future)  { throw new RuntimeException(); }
}
