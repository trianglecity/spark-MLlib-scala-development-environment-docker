package org.apache.spark.deploy.history;
/**
 * Cache for applications.
 * <p>
 * Completed applications are cached for as long as there is capacity for them.
 * Incompleted applications have their update time checked on every
 * retrieval; if the cached entry is out of date, it is refreshed.
 * <p>
 * @note there must be only one instance of {@link ApplicationCache} in a
 * JVM at a time. This is because a static field in {@link ApplicationCacheCheckFilterRelay}
 * keeps a reference to the cache so that HTTP requests on the attempt-specific web UIs
 * can probe the current cache to see if the attempts have changed.
 * <p>
 * Creating multiple instances will break this routing.
 * param:  operations implementation of record access operations
 * param:  retainedApplications number of retained applications
 * param:  clock time source
 */
  class ApplicationCache implements org.apache.spark.internal.Logging {
  public  org.apache.spark.deploy.history.ApplicationCacheOperations operations ()  { throw new RuntimeException(); }
  public  int retainedApplications ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  // not preceding
  public   ApplicationCache (org.apache.spark.deploy.history.ApplicationCacheOperations operations, int retainedApplications, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  /**
   * Services the load request from the cache.
   * @return (undocumented)
   */
  private  com.google.common.cache.CacheLoader<org.apache.spark.deploy.history.CacheKey, org.apache.spark.deploy.history.CacheEntry> appLoader ()  { throw new RuntimeException(); }
  /**
   * Handler for callbacks from the cache of entry removal.
   * @return (undocumented)
   */
  private  java.lang.Object removalListener ()  { throw new RuntimeException(); }
  /**
   * The cache of applications.
   * <p>
   * Tagged as <code>protected</code> so as to allow subclasses in tests to access it directly
   * @return (undocumented)
   */
  protected  com.google.common.cache.LoadingCache<org.apache.spark.deploy.history.CacheKey, org.apache.spark.deploy.history.CacheEntry> appCache ()  { throw new RuntimeException(); }
  /**
   * The metrics which are updated as the cache is used.
   * @return (undocumented)
   */
  public  org.apache.spark.deploy.history.CacheMetrics metrics ()  { throw new RuntimeException(); }
  /**
   * Perform any startup operations.
   * <p>
   * This includes declaring this instance as the cache to use in the
   * {@link ApplicationCacheCheckFilterRelay}.
   */
  private  void init ()  { throw new RuntimeException(); }
  /**
   * Stop the cache.
   * This will reset the relay in {@link ApplicationCacheCheckFilterRelay}.
   */
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Get an entry.
   * <p>
   * Cache fetch/refresh will have taken place by the time this method returns.
   * @param appAndAttempt application to look up in the format needed by the history server web UI,
   *                      <code>appId/attemptId</code> or <code>appId</code>.
   * @return the entry
   */
  public  org.apache.spark.ui.SparkUI get (java.lang.String appAndAttempt)  { throw new RuntimeException(); }
  /**
   * Get the Spark UI, converting a lookup failure from an exception to <code>None</code>.
   * @param appAndAttempt application to look up in the format needed by the history server web UI,
   *                      <code>appId/attemptId</code> or <code>appId</code>.
   * @return the entry
   */
  public  scala.Option<org.apache.spark.ui.SparkUI> getSparkUI (java.lang.String appAndAttempt)  { throw new RuntimeException(); }
  /**
   * Get the associated spark UI.
   * <p>
   * Cache fetch/refresh will have taken place by the time this method returns.
   * @param appId application ID
   * @param attemptId optional attempt ID
   * @return the entry
   */
  public  org.apache.spark.ui.SparkUI get (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  /**
   * Look up the entry; update it if needed.
   * @param appId application ID
   * @param attemptId optional attempt ID
   * @return the underlying cache entry -which can have its timestamp changed, and a flag to
   *         indicate that the entry has changed
   */
  private  scala.Tuple2<org.apache.spark.deploy.history.CacheEntry, java.lang.Object> lookupAndUpdate (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  /**
   * This method is visible for testing.
   * <p>
   * It looks up the cached entry *and returns a clone of it*.
   * This ensures that the cached entries never leak
   * @param appId application ID
   * @param attemptId optional attempt ID
   * @return a new entry with shared SparkUI, but copies of the other fields.
   */
  public  org.apache.spark.deploy.history.CacheEntry lookupCacheEntry (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  /**
   * Probe for an application being updated.
   * @param appId application ID
   * @param attemptId attempt ID
   * @return true if an update has been triggered
   */
  public  boolean checkForUpdates (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  /**
   * Size probe, primarily for testing.
   * @return size
   */
  public  long size ()  { throw new RuntimeException(); }
  /**
   * Emptiness predicate, primarily for testing.
   * @return true if the cache is empty
   */
  public  boolean isEmpty ()  { throw new RuntimeException(); }
  /**
   * Time a closure, returning its output.
   * @param t timer
   * @param f function
   * @tparam T type of return value of time
   * @return the result of the function.
   */
  private <T extends java.lang.Object> T time (com.codahale.metrics.Timer t, scala.Function0<T> f)  { throw new RuntimeException(); }
  /**
   * Load the Spark UI via {@link ApplicationCacheOperations.getAppUI()},
   * then attach it to the web UI via {@link ApplicationCacheOperations.attachSparkUI()}.
   * <p>
   * If the application is incomplete, it has the {@link ApplicationCacheCheckFilter}
   * added as a filter to the HTTP requests, so that queries on the UI will trigger
   * update checks.
   * <p>
   * The generated entry contains the UI and the current timestamp.
   * The timer {@link metrics.loadTimer} tracks the time taken to load the UI.
   * <p>
   * @param appId application ID
   * @param attemptId optional attempt ID
   * @return the cache entry
   * @throws NoSuchElementException if there is no matching element
   */
  public  org.apache.spark.deploy.history.CacheEntry loadApplicationEntry (java.lang.String appId, scala.Option<java.lang.String> attemptId) throws java.util.NoSuchElementException { throw new RuntimeException(); }
  /**
   * Split up an <code>applicationId/attemptId</code> or <code>applicationId</code> key into the separate pieces.
   * <p>
   * @param appAndAttempt combined key
   * @return a tuple of the application ID and, if present, the attemptID
   */
  public  scala.Tuple2<java.lang.String, scala.Option<java.lang.String>> splitAppAndAttemptKey (java.lang.String appAndAttempt)  { throw new RuntimeException(); }
  /**
   * Merge an appId and optional attempt Id into a key of the form <code>applicationId/attemptId</code>.
   * <p>
   * If there is an <code>attemptId</code>; <code>applicationId</code> if not.
   * @param appId application ID
   * @param attemptId optional attempt ID
   * @return a unified string
   */
  public  java.lang.String mergeAppAndAttemptToKey (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  /**
   * String operator dumps the cache entries and metrics.
   * @return a string value, primarily for testing and diagnostics
   */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
