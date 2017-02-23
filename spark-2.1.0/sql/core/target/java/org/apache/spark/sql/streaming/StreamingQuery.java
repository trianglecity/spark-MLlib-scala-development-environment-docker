package org.apache.spark.sql.streaming;
/**
 * :: Experimental ::
 * A handle to a query that is executing continuously in the background as new data arrives.
 * All these methods are thread-safe.
 * @since 2.0.0
 */
public  interface StreamingQuery {
  /**
   * Returns the user-specified name of the query, or null if not specified.
   * This name can be specified in the <code>org.apache.spark.sql.streaming.DataStreamWriter</code>
   * as <code>dataframe.writeStream.queryName("query").start()</code>.
   * This name, if set, must be unique across all active queries.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  java.lang.String name ()  ;
  /**
   * Returns the unique id of this query that persists across restarts from checkpoint data.
   * That is, this id is generated when a query is started for the first time, and
   * will be the same every time it is restarted from checkpoint data. Also see {@link runId}.
   * <p>
   * @since 2.1.0
   * @return (undocumented)
   */
  public  java.util.UUID id ()  ;
  /**
   * Returns the unique id of this run of the query. That is, every start/restart of a query will
   * generated a unique runId. Therefore, every time a query is restarted from
   * checkpoint, it will have the same {@link id} but different {@link runId}s.
   * @return (undocumented)
   */
  public  java.util.UUID runId ()  ;
  /**
   * Returns the <code>SparkSession</code> associated with <code>this</code>.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SparkSession sparkSession ()  ;
  /**
   * Returns <code>true</code> if this query is actively running.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  boolean isActive ()  ;
  /**
   * Returns the {@link StreamingQueryException} if the query was terminated by an exception.
   * @since 2.0.0
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.streaming.StreamingQueryException> exception ()  ;
  /**
   * Returns the current status of the query.
   * <p>
   * @since 2.0.2
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.StreamingQueryStatus status ()  ;
  /**
   * Returns an array of the most recent {@link StreamingQueryProgress} updates for this query.
   * The number of progress updates retained for each stream is configured by Spark session
   * configuration <code>spark.sql.streaming.numRecentProgressUpdates</code>.
   * <p>
   * @since 2.1.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.StreamingQueryProgress[] recentProgress ()  ;
  /**
   * Returns the most recent {@link StreamingQueryProgress} update of this streaming query.
   * <p>
   * @since 2.1.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.StreamingQueryProgress lastProgress ()  ;
  /**
   * Waits for the termination of <code>this</code> query, either by <code>query.stop()</code> or by an exception.
   * If the query has terminated with an exception, then the exception will be thrown.
   * <p>
   * If the query has terminated, then all subsequent calls to this method will either return
   * immediately (if the query was terminated by <code>stop()</code>), or throw the exception
   * immediately (if the query has terminated with exception).
   * <p>
   * @throws StreamingQueryException if the query has terminated with an exception.
   * <p>
   * @since 2.0.0
   */
  public  void awaitTermination () throws org.apache.spark.sql.streaming.StreamingQueryException ;
  /**
   * Waits for the termination of <code>this</code> query, either by <code>query.stop()</code> or by an exception.
   * If the query has terminated with an exception, then the exception will be thrown.
   * Otherwise, it returns whether the query has terminated or not within the <code>timeoutMs</code>
   * milliseconds.
   * <p>
   * If the query has terminated, then all subsequent calls to this method will either return
   * <code>true</code> immediately (if the query was terminated by <code>stop()</code>), or throw the exception
   * immediately (if the query has terminated with exception).
   * <p>
   * @throws StreamingQueryException if the query has terminated with an exception
   * <p>
   * @since 2.0.0
   * @param timeoutMs (undocumented)
   * @return (undocumented)
   */
  public  boolean awaitTermination (long timeoutMs) throws org.apache.spark.sql.streaming.StreamingQueryException ;
  /**
   * Blocks until all available data in the source has been processed and committed to the sink.
   * This method is intended for testing. Note that in the case of continually arriving data, this
   * method may block forever. Additionally, this method is only guaranteed to block until data that
   * has been synchronously appended data to a {@link org.apache.spark.sql.execution.streaming.Source}
   * prior to invocation. (i.e. <code>getOffset</code> must immediately reflect the addition).
   * @since 2.0.0
   */
  public  void processAllAvailable ()  ;
  /**
   * Stops the execution of this query if it is running. This method blocks until the threads
   * performing execution has stopped.
   * @since 2.0.0
   */
  public  void stop ()  ;
  /**
   * Prints the physical plan to the console for debugging purposes.
   * @since 2.0.0
   */
  public  void explain ()  ;
  /**
   * Prints the physical plan to the console for debugging purposes.
   * <p>
   * @param extended whether to do extended explain or not
   * @since 2.0.0
   */
  public  void explain (boolean extended)  ;
}
