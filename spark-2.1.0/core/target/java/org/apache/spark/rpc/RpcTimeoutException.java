package org.apache.spark.rpc;
/**
 * An exception thrown if RpcTimeout modifies a {@link TimeoutException}.
 */
  class RpcTimeoutException extends java.util.concurrent.TimeoutException {
  public   RpcTimeoutException (java.lang.String message, java.util.concurrent.TimeoutException cause)  { throw new RuntimeException(); }
}
