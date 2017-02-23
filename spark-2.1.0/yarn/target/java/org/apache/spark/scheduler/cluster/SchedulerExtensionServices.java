package org.apache.spark.scheduler.cluster;
/**
 * Container for {@link SchedulerExtensionService} instances.
 * <p>
 * Loads Extension Services from the configuration property
 * <code>"spark.yarn.services"</code>, instantiates and starts them.
 * When stopped, it stops all child entries.
 * <p>
 * The order in which child extension services are started and stopped
 * is undefined.
 */
  class SchedulerExtensionServices implements org.apache.spark.scheduler.cluster.SchedulerExtensionService, org.apache.spark.internal.Logging {
  public   SchedulerExtensionServices ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.String> serviceOption ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.List<org.apache.spark.scheduler.cluster.SchedulerExtensionService> services ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicBoolean started ()  { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.cluster.SchedulerExtensionServiceBinding binding ()  { throw new RuntimeException(); }
  /**
   * Binding operation will load the named services and call bind on them too; the
   * entire set of services are then ready for <code>init()</code> and <code>start()</code> calls.
   * <p>
   * @param binding binding to the spark application and YARN
   */
  public  void start (org.apache.spark.scheduler.cluster.SchedulerExtensionServiceBinding binding)  { throw new RuntimeException(); }
  /**
   * Get the list of services.
   * <p>
   * @return a list of services; Nil until the service is started
   */
  public  scala.collection.immutable.List<org.apache.spark.scheduler.cluster.SchedulerExtensionService> getServices ()  { throw new RuntimeException(); }
  /**
   * Stop the services; idempotent.
   * <p>
   */
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
