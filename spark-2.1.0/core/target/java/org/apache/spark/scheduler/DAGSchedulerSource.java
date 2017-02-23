package org.apache.spark.scheduler;
  class DAGSchedulerSource implements org.apache.spark.metrics.source.Source {
  public  org.apache.spark.scheduler.DAGScheduler dagScheduler ()  { throw new RuntimeException(); }
  // not preceding
  public   DAGSchedulerSource (org.apache.spark.scheduler.DAGScheduler dagScheduler)  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
  public  java.lang.String sourceName ()  { throw new RuntimeException(); }
  /** Timer that tracks the time to process messages in the DAGScheduler's event loop */
  public  com.codahale.metrics.Timer messageProcessingTimer ()  { throw new RuntimeException(); }
}
