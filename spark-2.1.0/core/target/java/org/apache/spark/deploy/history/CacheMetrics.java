package org.apache.spark.deploy.history;
/**
 * Metrics of the cache
 * param:  prefix prefix to register all entries under
 */
  class CacheMetrics implements org.apache.spark.metrics.source.Source {
  public   CacheMetrics (java.lang.String prefix)  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter lookupCount ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter lookupFailureCount ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter evictionCount ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter loadCount ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Timer loadTimer ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter updateProbeCount ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Timer updateProbeTimer ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.Counter updateTriggeredCount ()  { throw new RuntimeException(); }
  /** all the counters: for registration and string conversion. */
  private  scala.collection.Seq<scala.Tuple2<java.lang.String, com.codahale.metrics.Counter>> counters ()  { throw new RuntimeException(); }
  /** all metrics, including timers */
  private  scala.collection.Seq<scala.Tuple2<java.lang.String, com.codahale.metrics.Metric>> allMetrics ()  { throw new RuntimeException(); }
  /**
   * Name of metric source
   * @return (undocumented)
   */
  public  java.lang.String sourceName ()  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
  /**
   * Startup actions.
   * This includes registering metrics with {@link metricRegistry}
   */
  private  void init ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
