package org.apache.spark.deploy.history;
/**
 * API for cache events. That is: loading an App UI; and for
 * attaching/detaching the UI to and from the Web UI.
 */
  interface ApplicationCacheOperations {
  /**
   * Get the application UI and the probe needed to see if it has been updated.
   * @param appId application ID
   * @param attemptId attempt ID
   * @return If found, the Spark UI and any history information to be used in the cache
   */
  public  scala.Option<org.apache.spark.deploy.history.LoadedAppUI> getAppUI (java.lang.String appId, scala.Option<java.lang.String> attemptId)  ;
  /**
   * Attach a reconstructed UI.
   * @param appId application ID
   * @param attemptId attempt ID
   * @param ui UI
   * @param completed flag to indicate that the UI has completed
   */
  public  void attachSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.ui.SparkUI ui, boolean completed)  ;
  /**
   * Detach a Spark UI.
   * <p>
   * @param ui Spark UI
   * @param appId (undocumented)
   * @param attemptId (undocumented)
   */
  public  void detachSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.ui.SparkUI ui)  ;
}
