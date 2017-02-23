package org.apache.spark.deploy.history;
/**
 * Global state for the {@link ApplicationCacheCheckFilter} instances, so that they can relay cache
 * probes to the cache.
 * <p>
 * This is an ugly workaround for the limitation of servlets and filters in the Java servlet
 * API; they are still configured on the model of a list of classnames and configuration
 * strings in a <code>web.xml</code> field, rather than a chain of instances wired up by hand or
 * via an injection framework. There is no way to directly configure a servlet filter instance
 * with a reference to the application cache which is must use: some global state is needed.
 * <p>
 * Here, {@link ApplicationCacheCheckFilter} is that global state; it relays all requests
 * to the singleton {@link ApplicationCache}
 * <p>
 * The field <code>applicationCache</code> must be set for the filters to work -
 * this is done during the construction of {@link ApplicationCache}, which requires that there
 * is only one cache serving requests through the WebUI.
 * <p>
 * *Important* In test runs, if there is more than one {@link ApplicationCache}, the relay logic
 * will break: filters may not find instances. Tests must not do that.
 * <p>
 */
public  class ApplicationCacheCheckFilterRelay {
  static public  java.lang.String APP_ID ()  { throw new RuntimeException(); }
  static public  java.lang.String ATTEMPT_ID ()  { throw new RuntimeException(); }
  static public  java.lang.String FILTER_NAME ()  { throw new RuntimeException(); }
  /** the application cache to relay requests to */
  static private  scala.Option<org.apache.spark.deploy.history.ApplicationCache> applicationCache ()  { throw new RuntimeException(); }
  /**
   * Set the application cache. Logs a warning if it is overwriting an existing value
   * @param cache new cache
   */
  static public  void setApplicationCache (org.apache.spark.deploy.history.ApplicationCache cache)  { throw new RuntimeException(); }
  /**
   * Reset the application cache
   */
  static public  void resetApplicationCache ()  { throw new RuntimeException(); }
  /**
   * Check to see if there has been an update
   * @param requestURI URI the request came in on
   * @param appId application ID
   * @param attemptId attempt ID
   * @return true if an update was loaded for the app/attempt
   */
  static public  boolean checkForUpdates (java.lang.String requestURI, java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  /**
   * Register a filter for the web UI which checks for updates to the given app/attempt
   * @param ui Spark UI to attach filters to
   * @param appId application ID
   * @param attemptId attempt ID
   */
  static public  void registerFilter (org.apache.spark.ui.SparkUI ui, java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
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
}
