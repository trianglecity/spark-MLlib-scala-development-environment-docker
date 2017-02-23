package org.apache.spark.ui;
public  class SparkUI$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkUI$ MODULE$ = null;
  public   SparkUI$ ()  { throw new RuntimeException(); }
  public  int DEFAULT_PORT ()  { throw new RuntimeException(); }
  public  java.lang.String STATIC_RESOURCE_DIR ()  { throw new RuntimeException(); }
  public  java.lang.String DEFAULT_POOL_NAME ()  { throw new RuntimeException(); }
  public  int DEFAULT_RETAINED_STAGES ()  { throw new RuntimeException(); }
  public  int DEFAULT_RETAINED_JOBS ()  { throw new RuntimeException(); }
  public  int getUIPort (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.ui.SparkUI createLiveUI (org.apache.spark.SparkContext sc, org.apache.spark.SparkConf conf, org.apache.spark.scheduler.SparkListenerBus listenerBus, org.apache.spark.ui.jobs.JobProgressListener jobProgressListener, org.apache.spark.SecurityManager securityManager, java.lang.String appName, long startTime)  { throw new RuntimeException(); }
  public  org.apache.spark.ui.SparkUI createHistoryUI (org.apache.spark.SparkConf conf, org.apache.spark.scheduler.SparkListenerBus listenerBus, org.apache.spark.SecurityManager securityManager, java.lang.String appName, java.lang.String basePath, long startTime)  { throw new RuntimeException(); }
  /**
   * Create a new Spark UI.
   * <p>
   * @param sc optional SparkContext; this can be None when reconstituting a UI from event logs.
   * @param jobProgressListener if supplied, this JobProgressListener will be used; otherwise, the
   *                            web UI will create and register its own JobProgressListener.
   * @param conf (undocumented)
   * @param listenerBus (undocumented)
   * @param securityManager (undocumented)
   * @param appName (undocumented)
   * @param basePath (undocumented)
   * @param startTime (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.ui.SparkUI create (scala.Option<org.apache.spark.SparkContext> sc, org.apache.spark.SparkConf conf, org.apache.spark.scheduler.SparkListenerBus listenerBus, org.apache.spark.SecurityManager securityManager, java.lang.String appName, java.lang.String basePath, scala.Option<org.apache.spark.ui.jobs.JobProgressListener> jobProgressListener, long startTime)  { throw new RuntimeException(); }
}
