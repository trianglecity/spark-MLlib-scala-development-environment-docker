package org.apache.spark.streaming;
  class StreamingSource implements org.apache.spark.metrics.source.Source {
  public   StreamingSource (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
  public  java.lang.String sourceName ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.ui.StreamingJobProgressListener streamingListener ()  { throw new RuntimeException(); }
  private <T extends java.lang.Object> void registerGauge (java.lang.String name, scala.Function1<org.apache.spark.streaming.ui.StreamingJobProgressListener, T> f, T defaultValue)  { throw new RuntimeException(); }
  private <T extends java.lang.Object> void registerGaugeWithOption (java.lang.String name, scala.Function1<org.apache.spark.streaming.ui.StreamingJobProgressListener, scala.Option<T>> f, T defaultValue)  { throw new RuntimeException(); }
}
