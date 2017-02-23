package org.apache.spark.metrics.sink;
  interface Sink {
  public  void start ()  ;
  public  void stop ()  ;
  public  void report ()  ;
}
