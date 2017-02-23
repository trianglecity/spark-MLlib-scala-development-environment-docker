package org.apache.spark.scheduler.cluster;
/**
 * An extension service that can be loaded into a Spark YARN scheduler.
 * A Service that can be started and stopped.
 * <p>
 * 1. For implementations to be loadable by <code>SchedulerExtensionServices</code>,
 * they must provide an empty constructor.
 * 2. The <code>stop()</code> operation MUST be idempotent, and succeed even if <code>start()</code> was
 * never invoked.
 */
public  interface SchedulerExtensionService {
  /**
   * Start the extension service. This should be a no-op if
   * called more than once.
   * @param binding binding to the spark application and YARN
   */
  public  void start (org.apache.spark.scheduler.cluster.SchedulerExtensionServiceBinding binding)  ;
  /**
   * Stop the service
   * The <code>stop()</code> operation MUST be idempotent, and succeed even if <code>start()</code> was
   * never invoked.
   */
  public  void stop ()  ;
}
