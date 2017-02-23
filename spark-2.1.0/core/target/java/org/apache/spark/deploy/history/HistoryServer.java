package org.apache.spark.deploy.history;
/**
 * A web server that renders SparkUIs of completed applications.
 * <p>
 * For the standalone mode, MasterWebUI already achieves this functionality. Thus, the
 * main use case of the HistoryServer is in other deploy modes (e.g. Yarn or Mesos).
 * <p>
 * The logging directory structure is as follows: Within the given base directory, each
 * application's event logs are maintained in the application's own sub-directory. This
 * is the same structure as maintained in the event log write code path in
 * EventLoggingListener.
 */
public  class HistoryServer extends org.apache.spark.ui.WebUI implements org.apache.spark.internal.Logging, org.apache.spark.status.api.v1.UIRoot, org.apache.spark.deploy.history.ApplicationCacheOperations {
  static private  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  static public  java.lang.String UI_PATH_PREFIX ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] argStrings)  { throw new RuntimeException(); }
  static public  void initSecurity ()  { throw new RuntimeException(); }
  static   java.lang.String getAttemptURI (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static public  org.apache.spark.SecurityManager securityManager ()  { throw new RuntimeException(); }
  static public  org.apache.spark.SSLOptions sslOptions ()  { throw new RuntimeException(); }
  static protected  scala.collection.mutable.ArrayBuffer<org.apache.spark.ui.WebUITab> tabs ()  { throw new RuntimeException(); }
  static protected  scala.collection.mutable.ArrayBuffer<org.eclipse.jetty.servlet.ServletContextHandler> handlers ()  { throw new RuntimeException(); }
  static protected  scala.collection.mutable.HashMap<org.apache.spark.ui.WebUIPage, scala.collection.mutable.ArrayBuffer<org.eclipse.jetty.servlet.ServletContextHandler>> pageToHandlers ()  { throw new RuntimeException(); }
  static protected  scala.Option<org.apache.spark.ui.ServerInfo> serverInfo ()  { throw new RuntimeException(); }
  static protected  void serverInfo_$eq (scala.Option<org.apache.spark.ui.ServerInfo> x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String publicHostName ()  { throw new RuntimeException(); }
  static public  java.lang.String getBasePath ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.ui.WebUITab> getTabs ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.eclipse.jetty.servlet.ServletContextHandler> getHandlers ()  { throw new RuntimeException(); }
  static public  org.apache.spark.SecurityManager getSecurityManager ()  { throw new RuntimeException(); }
  static public  void attachTab (org.apache.spark.ui.WebUITab tab)  { throw new RuntimeException(); }
  static public  void detachTab (org.apache.spark.ui.WebUITab tab)  { throw new RuntimeException(); }
  static public  void detachPage (org.apache.spark.ui.WebUIPage page)  { throw new RuntimeException(); }
  static public  void attachPage (org.apache.spark.ui.WebUIPage page)  { throw new RuntimeException(); }
  static public  void attachHandler (org.eclipse.jetty.servlet.ServletContextHandler handler)  { throw new RuntimeException(); }
  static public  void detachHandler (org.eclipse.jetty.servlet.ServletContextHandler handler)  { throw new RuntimeException(); }
  static public  void addStaticHandler (java.lang.String resourceBase, java.lang.String path)  { throw new RuntimeException(); }
  static public  void removeStaticHandler (java.lang.String path)  { throw new RuntimeException(); }
  static public  java.lang.String webUrl ()  { throw new RuntimeException(); }
  static public  int boundPort ()  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T withSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, scala.Function1<org.apache.spark.ui.SparkUI, T> f)  { throw new RuntimeException(); }
  static public abstract  org.apache.spark.SecurityManager securityManager ()  ;
  public   HistoryServer (org.apache.spark.SparkConf conf, org.apache.spark.deploy.history.ApplicationHistoryProvider provider, org.apache.spark.SecurityManager securityManager, int port)  { throw new RuntimeException(); }
  private  int retainedApplications ()  { throw new RuntimeException(); }
    int maxApplications ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.history.ApplicationCache appCache ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.history.CacheMetrics cacheMetrics ()  { throw new RuntimeException(); }
  private  javax.servlet.http.HttpServlet loaderServlet ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.ui.SparkUI> getSparkUI (java.lang.String appKey)  { throw new RuntimeException(); }
  /**
   * Initialize the history server.
   * <p>
   * This starts a background thread that periodically synchronizes information displayed on
   * this UI with the event logs in the provided base directory.
   */
  public  void initialize ()  { throw new RuntimeException(); }
  /** Bind to the HTTP server behind this web interface. */
  public  void bind ()  { throw new RuntimeException(); }
  /** Stop the server and close the file system. */
  public  void stop ()  { throw new RuntimeException(); }
  /** Attach a reconstructed UI to this server. Only valid after bind(). */
  public  void attachSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.ui.SparkUI ui, boolean completed)  { throw new RuntimeException(); }
  /** Detach a reconstructed UI from this server. Only valid after bind(). */
  public  void detachSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.ui.SparkUI ui)  { throw new RuntimeException(); }
  /**
   * Get the application UI and whether or not it is completed
   * @param appId application ID
   * @param attemptId attempt ID
   * @return If found, the Spark UI and any history information to be used in the cache
   */
  public  scala.Option<org.apache.spark.deploy.history.LoadedAppUI> getAppUI (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  /**
   * Returns a list of available applications, in descending order according to their end time.
   * <p>
   * @return List of all known applications.
   */
  public  scala.collection.Iterator<org.apache.spark.deploy.history.ApplicationHistoryInfo> getApplicationList ()  { throw new RuntimeException(); }
  public  int getEventLogsUnderProcess ()  { throw new RuntimeException(); }
  public  long getLastUpdatedTime ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.status.api.v1.ApplicationInfo> getApplicationInfoList ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.status.api.v1.ApplicationInfo> getApplicationInfo (java.lang.String appId)  { throw new RuntimeException(); }
  public  void writeEventLogs (java.lang.String appId, scala.Option<java.lang.String> attemptId, java.util.zip.ZipOutputStream zipStream)  { throw new RuntimeException(); }
  /**
   * @return html text to display when the application list is empty
   */
  public  scala.collection.Seq<scala.xml.Node> emptyListingHtml ()  { throw new RuntimeException(); }
  /**
   * Returns the provider configuration to show in the listing page.
   * <p>
   * @return A map with the provider's configuration.
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getProviderConfig ()  { throw new RuntimeException(); }
  /**
   * Load an application UI and attach it to the web server.
   * @param appId application ID
   * @param attemptId optional attempt ID
   * @return true if the application was found and loaded.
   */
  private  boolean loadAppUi (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  /**
   * String value for diagnostics.
   * @return a multi-line description of the server state.
   */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
