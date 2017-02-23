package org.apache.spark.sql.execution.streaming;
/**
 * An interface for systems that can collect the results of a streaming query. In order to preserve
 * exactly once semantics a sink must be idempotent in the face of multiple attempts to add the same
 * batch.
 */
public  interface Sink {
  /**
   * Adds a batch of data to this sink. The data for a given <code>batchId</code> is deterministic and if
   * this method is called more than once with the same batchId (which will happen in the case of
   * failures), then <code>data</code> should only be added once.
   * <p>
   * Note: You cannot apply any operators on <code>data</code> except consuming it (e.g., <code>collect/foreach</code>).
   * Otherwise, you may get a wrong result.
   * @param batchId (undocumented)
   * @param data (undocumented)
   */
  public  void addBatch (long batchId, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data)  ;
}
