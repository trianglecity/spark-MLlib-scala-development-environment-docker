package org.apache.spark.deploy.history;
/**
 * The recommended way of starting and stopping a HistoryServer is through the scripts
 * start-history-server.sh and stop-history-server.sh. The path to a base log directory,
 * as well as any other relevant history server configuration, should be specified via
 * the $SPARK_HISTORY_OPTS environment variable. For example:
 * <p>
 *   export SPARK_HISTORY_OPTS="-Dspark.history.fs.logDirectory=/tmp/spark-events"
 *   ./sbin/start-history-server.sh
 * <p>
 * This launches the HistoryServer as a Spark daemon.
 */
public  class HistoryServer$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HistoryServer$ MODULE$ = null;
  public   HistoryServer$ ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  java.lang.String UI_PATH_PREFIX ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] argStrings)  { throw new RuntimeException(); }
  public  void initSecurity ()  { throw new RuntimeException(); }
    java.lang.String getAttemptURI (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
}
