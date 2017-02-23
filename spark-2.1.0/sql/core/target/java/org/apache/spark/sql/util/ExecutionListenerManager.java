package org.apache.spark.sql.util;
/**
 * :: Experimental ::
 * <p>
 * Manager for {@link QueryExecutionListener}. See <code>org.apache.spark.sql.SQLContext.listenerManager</code>.
 */
public  class ExecutionListenerManager implements org.apache.spark.internal.Logging {
     ExecutionListenerManager ()  { throw new RuntimeException(); }
  /**
   * Registers the specified {@link QueryExecutionListener}.
   * @param listener (undocumented)
   */
  public  void register (org.apache.spark.sql.util.QueryExecutionListener listener)  { throw new RuntimeException(); }
  /**
   * Unregisters the specified {@link QueryExecutionListener}.
   * @param listener (undocumented)
   */
  public  void unregister (org.apache.spark.sql.util.QueryExecutionListener listener)  { throw new RuntimeException(); }
  /**
   * Removes all the registered {@link QueryExecutionListener}.
   */
  public  void clear ()  { throw new RuntimeException(); }
    void onSuccess (java.lang.String funcName, org.apache.spark.sql.execution.QueryExecution qe, long duration)  { throw new RuntimeException(); }
    void onFailure (java.lang.String funcName, org.apache.spark.sql.execution.QueryExecution qe, java.lang.Exception exception)  { throw new RuntimeException(); }
  /** A lock to prevent updating the list of listeners while we are traversing through them. */
  private  void withErrorHandling (scala.Function1<org.apache.spark.sql.util.QueryExecutionListener, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /** Acquires a read lock on the cache for the duration of `f`. */
  private <A extends java.lang.Object> A readLock (scala.Function0<A> f)  { throw new RuntimeException(); }
  /** Acquires a write lock on the cache for the duration of `f`. */
  private <A extends java.lang.Object> A writeLock (scala.Function0<A> f)  { throw new RuntimeException(); }
}
