package org.apache.spark.sql.execution;
public  class SQLExecution {
  static public  java.lang.String EXECUTION_ID_KEY ()  { throw new RuntimeException(); }
  static private  java.util.concurrent.atomic.AtomicLong _nextExecutionId ()  { throw new RuntimeException(); }
  static private  long nextExecutionId ()  { throw new RuntimeException(); }
  /**
   * Wrap an action that will execute "queryExecution" to track all Spark jobs in the body so that
   * we can connect them with an execution.
   * @param sparkSession (undocumented)
   * @param queryExecution (undocumented)
   * @param body (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> T withNewExecutionId (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.QueryExecution queryExecution, scala.Function0<T> body)  { throw new RuntimeException(); }
  /**
   * Wrap an action with a known executionId. When running a different action in a different
   * thread from the original one, this method can be used to connect the Spark jobs in this action
   * with the known executionId, e.g., <code>BroadcastHashJoin.broadcastFuture</code>.
   * @param sc (undocumented)
   * @param executionId (undocumented)
   * @param body (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> T withExecutionId (org.apache.spark.SparkContext sc, java.lang.String executionId, scala.Function0<T> body)  { throw new RuntimeException(); }
}
