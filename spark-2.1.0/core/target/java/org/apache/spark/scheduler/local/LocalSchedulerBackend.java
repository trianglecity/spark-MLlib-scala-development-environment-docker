package org.apache.spark.scheduler.local;
/**
 * Used when running a local version of Spark where the executor, backend, and master all run in
 * the same JVM. It sits behind a {@link TaskSchedulerImpl} and handles launching tasks on a single
 * Executor (created by the {@link LocalSchedulerBackend}) running locally.
 */
  class LocalSchedulerBackend implements org.apache.spark.scheduler.SchedulerBackend, org.apache.spark.executor.ExecutorBackend, org.apache.spark.internal.Logging {
  public  int totalCores ()  { throw new RuntimeException(); }
  // not preceding
  public   LocalSchedulerBackend (org.apache.spark.SparkConf conf, org.apache.spark.scheduler.TaskSchedulerImpl scheduler, int totalCores)  { throw new RuntimeException(); }
  private  java.lang.String appId ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef localEndpoint ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.net.URL> userClassPath ()  { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.LiveListenerBus listenerBus ()  { throw new RuntimeException(); }
  private  org.apache.spark.launcher.LauncherBackend launcherBackend ()  { throw new RuntimeException(); }
  /**
   * Returns a list of URLs representing the user classpath.
   * <p>
   * @param conf Spark configuration.
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.net.URL> getUserClasspath (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void reviveOffers ()  { throw new RuntimeException(); }
  public  int defaultParallelism ()  { throw new RuntimeException(); }
  public  void killTask (long taskId, java.lang.String executorId, boolean interruptThread)  { throw new RuntimeException(); }
  public  void statusUpdate (long taskId, scala.Enumeration.Value state, java.nio.ByteBuffer serializedData)  { throw new RuntimeException(); }
  public  java.lang.String applicationId ()  { throw new RuntimeException(); }
  private  void stop (org.apache.spark.launcher.SparkAppHandle.State finalState)  { throw new RuntimeException(); }
}
