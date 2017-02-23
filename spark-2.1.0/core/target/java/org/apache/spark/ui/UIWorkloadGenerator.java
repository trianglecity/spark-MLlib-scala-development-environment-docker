package org.apache.spark.ui;
/**
 * Continuously generates jobs that expose various features of the WebUI (internal testing tool).
 * <p>
 * Usage: ./bin/spark-class org.apache.spark.ui.UIWorkloadGenerator [master] [FIFO|FAIR] [#job set (4 jobs per set)]
 */
public  class UIWorkloadGenerator {
  static public  int NUM_PARTITIONS ()  { throw new RuntimeException(); }
  static public  int INTER_JOB_WAIT_MS ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
