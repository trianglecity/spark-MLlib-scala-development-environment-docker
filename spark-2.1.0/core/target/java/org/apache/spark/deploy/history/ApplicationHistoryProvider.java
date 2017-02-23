package org.apache.spark.deploy.history;
 abstract class ApplicationHistoryProvider {
  public   ApplicationHistoryProvider ()  { throw new RuntimeException(); }
  /**
   * Returns the count of application event logs that the provider is currently still processing.
   * History Server UI can use this to indicate to a user that the application listing on the UI
   * can be expected to list additional known applications once the processing of these
   * application event logs completes.
   * <p>
   * A History Provider that does not have a notion of count of event logs that may be pending
   * for processing need not override this method.
   * <p>
   * @return Count of application event logs that are currently under process
   */
  public  int getEventLogsUnderProcess ()  { throw new RuntimeException(); }
  /**
   * Returns the time the history provider last updated the application history information
   * <p>
   * @return 0 if this is undefined or unsupported, otherwise the last updated time in millis
   */
  public  long getLastUpdatedTime ()  { throw new RuntimeException(); }
  /**
   * Returns a list of applications available for the history server to show.
   * <p>
   * @return List of all know applications.
   */
  public abstract  scala.collection.Iterator<org.apache.spark.deploy.history.ApplicationHistoryInfo> getListing ()  ;
  /**
   * Returns the Spark UI for a specific application.
   * <p>
   * @param appId The application ID.
   * @param attemptId The application attempt ID (or None if there is no attempt ID).
   * @return a {@link LoadedAppUI} instance containing the application's UI and any state information
   *         for update probes, or <code>None</code> if the application/attempt is not found.
   */
  public abstract  scala.Option<org.apache.spark.deploy.history.LoadedAppUI> getAppUI (java.lang.String appId, scala.Option<java.lang.String> attemptId)  ;
  /**
   * Called when the server is shutting down.
   */
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Returns configuration data to be shown in the History Server home page.
   * <p>
   * @return A map with the configuration data. Data is show in the order returned by the map.
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getConfig ()  { throw new RuntimeException(); }
  /**
   * Writes out the event logs to the output stream provided. The logs will be compressed into a
   * single zip file and written out.
   * @throws SparkException if the logs for the app id cannot be found.
   * @param appId (undocumented)
   * @param attemptId (undocumented)
   * @param zipStream (undocumented)
   */
  public abstract  void writeEventLogs (java.lang.String appId, scala.Option<java.lang.String> attemptId, java.util.zip.ZipOutputStream zipStream) throws org.apache.spark.SparkException ;
  /**
   * @return the {@link ApplicationHistoryInfo} for the appId if it exists.
   * @param appId (undocumented)
   */
  public abstract  scala.Option<org.apache.spark.deploy.history.ApplicationHistoryInfo> getApplicationInfo (java.lang.String appId)  ;
  /**
   * @return html text to display when the application list is empty
   */
  public  scala.collection.Seq<scala.xml.Node> getEmptyListingHtml ()  { throw new RuntimeException(); }
}
