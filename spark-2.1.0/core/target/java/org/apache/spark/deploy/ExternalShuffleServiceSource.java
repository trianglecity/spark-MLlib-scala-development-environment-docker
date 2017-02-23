package org.apache.spark.deploy;
/**
 * Provides metrics source for external shuffle service
 */
public  class ExternalShuffleServiceSource implements org.apache.spark.metrics.source.Source {
  public   ExternalShuffleServiceSource (org.apache.spark.network.shuffle.ExternalShuffleBlockHandler blockHandler)  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
  public  java.lang.String sourceName ()  { throw new RuntimeException(); }
}
