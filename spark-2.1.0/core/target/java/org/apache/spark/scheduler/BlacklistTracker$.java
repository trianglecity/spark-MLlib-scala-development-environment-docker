package org.apache.spark.scheduler;
public  class BlacklistTracker$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BlacklistTracker$ MODULE$ = null;
  public   BlacklistTracker$ ()  { throw new RuntimeException(); }
  private  java.lang.String DEFAULT_TIMEOUT ()  { throw new RuntimeException(); }
  /**
   * Returns true if the blacklist is enabled, based on checking the configuration in the following
   * order:
   * 1. Is it specifically enabled or disabled?
   * 2. Is it enabled via the legacy timeout conf?
   * 3. Default is off
   * @param conf (undocumented)
   * @return (undocumented)
   */
  public  boolean isBlacklistEnabled (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  long getBlacklistTimeout (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Verify that blacklist configurations are consistent; if not, throw an exception.  Should only
   * be called if blacklisting is enabled.
   * <p>
   * The configuration for the blacklist is expected to adhere to a few invariants.  Default
   * values follow these rules of course, but users may unwittingly change one configuration
   * without making the corresponding adjustment elsewhere.  This ensures we fail-fast when
   * there are such misconfigurations.
   * @param conf (undocumented)
   */
  public  void validateBlacklistConfs (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
}
