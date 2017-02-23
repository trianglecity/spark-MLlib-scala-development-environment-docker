package org.apache.spark.scheduler.cluster;
/**
 * A {@link SchedulerBackend} implementation for Spark's standalone cluster manager.
 */
  class StandaloneSchedulerBackend extends org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend implements org.apache.spark.deploy.client.StandaloneAppClientListener, org.apache.spark.internal.Logging {
  // not preceding
  public   StandaloneSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.SparkContext sc, java.lang.String[] masters)  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.client.StandaloneAppClient client ()  { throw new RuntimeException(); }
  private  boolean stopping ()  { throw new RuntimeException(); }
  private  org.apache.spark.launcher.LauncherBackend launcherBackend ()  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.spark.scheduler.cluster.StandaloneSchedulerBackend, scala.runtime.BoxedUnit> shutdownCallback ()  { throw new RuntimeException(); }
  private  java.lang.String appId ()  { throw new RuntimeException(); }
  private  java.util.concurrent.Semaphore registrationBarrier ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> maxCores ()  { throw new RuntimeException(); }
  private  int totalExpectedCores ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void connected (java.lang.String appId)  { throw new RuntimeException(); }
  public  void disconnected ()  { throw new RuntimeException(); }
  public  void dead (java.lang.String reason)  { throw new RuntimeException(); }
  public  void executorAdded (java.lang.String fullId, java.lang.String workerId, java.lang.String hostPort, int cores, int memory)  { throw new RuntimeException(); }
  public  void executorRemoved (java.lang.String fullId, java.lang.String message, scala.Option<java.lang.Object> exitStatus, boolean workerLost)  { throw new RuntimeException(); }
  public  boolean sufficientResourcesRegistered ()  { throw new RuntimeException(); }
  public  java.lang.String applicationId ()  { throw new RuntimeException(); }
  /**
   * Request executors from the Master by specifying the total number desired,
   * including existing pending and running executors.
   * <p>
   * @return whether the request is acknowledged.
   * @param requestedTotal (undocumented)
   */
  protected  scala.concurrent.Future<java.lang.Object> doRequestTotalExecutors (int requestedTotal)  { throw new RuntimeException(); }
  /**
   * Kill the given list of executors through the Master.
   * @return whether the kill request is acknowledged.
   * @param executorIds (undocumented)
   */
  protected  scala.concurrent.Future<java.lang.Object> doKillExecutors (scala.collection.Seq<java.lang.String> executorIds)  { throw new RuntimeException(); }
  private  void waitForRegistration ()  { throw new RuntimeException(); }
  private  void notifyContext ()  { throw new RuntimeException(); }
  private  void stop (org.apache.spark.launcher.SparkAppHandle.State finalState)  { throw new RuntimeException(); }
}
