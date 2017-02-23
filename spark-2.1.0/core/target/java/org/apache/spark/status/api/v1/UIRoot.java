package org.apache.spark.status.api.v1;
/**
 * This trait is shared by the all the root containers for application UI information --
 * the HistoryServer and the application UI.  This provides the common
 * interface needed for them all to expose application info as json.
 */
  interface UIRoot {
  public  scala.Option<org.apache.spark.ui.SparkUI> getSparkUI (java.lang.String appKey)  ;
  public  scala.collection.Iterator<org.apache.spark.status.api.v1.ApplicationInfo> getApplicationInfoList ()  ;
  public  scala.Option<org.apache.spark.status.api.v1.ApplicationInfo> getApplicationInfo (java.lang.String appId)  ;
  /**
   * Write the event logs for the given app to the {@link ZipOutputStream} instance. If attemptId is
   * {@link None}, event logs for all attempts of this application will be written out.
   * @param appId (undocumented)
   * @param attemptId (undocumented)
   * @param zipStream (undocumented)
   */
  public  void writeEventLogs (java.lang.String appId, scala.Option<java.lang.String> attemptId, java.util.zip.ZipOutputStream zipStream)  ;
  /**
   * Get the spark UI with the given appID, and apply a function
   * to it.  If there is no such app, throw an appropriate exception
   * @param appId (undocumented)
   * @param attemptId (undocumented)
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T withSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, scala.Function1<org.apache.spark.ui.SparkUI, T> f)  ;
  public  org.apache.spark.SecurityManager securityManager ()  ;
}
