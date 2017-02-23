package org.apache.spark.metrics.source;
/**
 * :: Experimental ::
 * Metrics for access to the hive external catalog.
 */
public  class HiveCatalogMetrics {
  static public  java.lang.String sourceName ()  { throw new RuntimeException(); }
  static public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
  /**
   * Tracks the total number of partition metadata entries fetched via the client api.
   * @return (undocumented)
   */
  static public  com.codahale.metrics.Counter METRIC_PARTITIONS_FETCHED ()  { throw new RuntimeException(); }
  /**
   * Tracks the total number of files discovered off of the filesystem by InMemoryFileIndex.
   * @return (undocumented)
   */
  static public  com.codahale.metrics.Counter METRIC_FILES_DISCOVERED ()  { throw new RuntimeException(); }
  /**
   * Tracks the total number of files served from the file status cache instead of discovered.
   * @return (undocumented)
   */
  static public  com.codahale.metrics.Counter METRIC_FILE_CACHE_HITS ()  { throw new RuntimeException(); }
  /**
   * Tracks the total number of Hive client calls (e.g. to lookup a table).
   * @return (undocumented)
   */
  static public  com.codahale.metrics.Counter METRIC_HIVE_CLIENT_CALLS ()  { throw new RuntimeException(); }
  /**
   * Tracks the total number of Spark jobs launched for parallel file listing.
   * @return (undocumented)
   */
  static public  com.codahale.metrics.Counter METRIC_PARALLEL_LISTING_JOB_COUNT ()  { throw new RuntimeException(); }
  /**
   * Resets the values of all metrics to zero. This is useful in tests.
   */
  static public  void reset ()  { throw new RuntimeException(); }
  static public  void incrementFetchedPartitions (int n)  { throw new RuntimeException(); }
  static public  void incrementFilesDiscovered (int n)  { throw new RuntimeException(); }
  static public  void incrementFileCacheHits (int n)  { throw new RuntimeException(); }
  static public  void incrementHiveClientCalls (int n)  { throw new RuntimeException(); }
  static public  void incrementParallelListingJobCount (int n)  { throw new RuntimeException(); }
}
