package org.apache.spark.deploy.history;
/**
 * An entry in the cache.
 * <p>
 * param:  ui Spark UI
 * param:  completed Flag to indicated that the application has completed (and so
 *                 does not need refreshing).
 * param:  updateProbe function to call to see if the application has been updated and
 *                    therefore that the cached value needs to be refreshed.
 * param:  probeTime Times in milliseconds when the probe was last executed.
 */
 final class CacheEntry {
  public  org.apache.spark.ui.SparkUI ui ()  { throw new RuntimeException(); }
  public  boolean completed ()  { throw new RuntimeException(); }
  public  scala.Function0<java.lang.Object> updateProbe ()  { throw new RuntimeException(); }
  public  long probeTime ()  { throw new RuntimeException(); }
  // not preceding
  public   CacheEntry (org.apache.spark.ui.SparkUI ui, boolean completed, scala.Function0<java.lang.Object> updateProbe, long probeTime)  { throw new RuntimeException(); }
  /** string value is for test assertions */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
