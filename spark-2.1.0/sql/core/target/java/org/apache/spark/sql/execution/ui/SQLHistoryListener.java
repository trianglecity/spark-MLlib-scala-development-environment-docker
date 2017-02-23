package org.apache.spark.sql.execution.ui;
/**
 * A {@link SQLListener} for rendering the SQL UI in the history server.
 */
public  class SQLHistoryListener extends org.apache.spark.sql.execution.ui.SQLListener {
  public   SQLHistoryListener (org.apache.spark.SparkConf conf, org.apache.spark.ui.SparkUI sparkUI)  { throw new RuntimeException(); }
  private  boolean sqlTabAttached ()  { throw new RuntimeException(); }
  public  void onExecutorMetricsUpdate (org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate u)  { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
}
