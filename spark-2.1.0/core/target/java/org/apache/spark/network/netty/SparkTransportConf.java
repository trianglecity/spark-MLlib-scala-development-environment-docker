package org.apache.spark.network.netty;
/**
 * Provides a utility for transforming from a SparkConf inside a Spark JVM (e.g., Executor,
 * Driver, or a standalone shuffle service) into a TransportConf with details on our environment
 * like the number of cores that are allocated to this JVM.
 */
public  class SparkTransportConf {
  /**
   * Specifies an upper bound on the number of Netty threads that Spark requires by default.
   * In practice, only 2-4 cores should be required to transfer roughly 10 Gb/s, and each core
   * that we use will have an initial overhead of roughly 32 MB of off-heap memory, which comes
   * at a premium.
   * <p>
   * Thus, this value should still retain maximum throughput and reduce wasted off-heap memory
   * allocation. It can be overridden by setting the number of serverThreads and clientThreads
   * manually in Spark's configuration.
   * @return (undocumented)
   */
  static private  int MAX_DEFAULT_NETTY_THREADS ()  { throw new RuntimeException(); }
  /**
   * Utility for creating a {@link TransportConf} from a {@link SparkConf}.
   * @param _conf the {@link SparkConf}
   * @param module the module name
   * @param numUsableCores if nonzero, this will restrict the server and client threads to only
   *                       use the given number of cores, rather than all of the machine's cores.
   *                       This restriction will only occur if these properties are not already set.
   * @return (undocumented)
   */
  static public  org.apache.spark.network.util.TransportConf fromSparkConf (org.apache.spark.SparkConf _conf, java.lang.String module, int numUsableCores)  { throw new RuntimeException(); }
  /**
   * Returns the default number of threads for both the Netty client and server thread pools.
   * If numUsableCores is 0, we will use Runtime get an approximate number of available cores.
   * @param numUsableCores (undocumented)
   * @return (undocumented)
   */
  static private  int defaultNumThreads (int numUsableCores)  { throw new RuntimeException(); }
}
