package org.apache.spark.rpc;
/**
 * A trait that requires RpcEnv thread-safely sending messages to it.
 * <p>
 * Thread-safety means processing of one message happens before processing of the next message by
 * the same {@link ThreadSafeRpcEndpoint}. In the other words, changes to internal fields of a
 * {@link ThreadSafeRpcEndpoint} are visible when processing the next message, and fields in the
 * {@link ThreadSafeRpcEndpoint} need not be volatile or equivalent.
 * <p>
 * However, there is no guarantee that the same thread will be executing the same
 * {@link ThreadSafeRpcEndpoint} for different messages.
 */
  interface ThreadSafeRpcEndpoint extends org.apache.spark.rpc.RpcEndpoint {
}
