package org.apache.spark.sql.execution.window;
/**
 * A window function calculates the results of a number of window functions for a window frame.
 * Before use a frame must be prepared by passing it all the rows in the current partition. After
 * preparation the update method can be called to fill the output rows.
 */
 abstract class WindowFunctionFrame {
  public   WindowFunctionFrame ()  { throw new RuntimeException(); }
  /**
   * Prepare the frame for calculating the results for a partition.
   * <p>
   * @param rows to calculate the frame results for.
   */
  public abstract  void prepare (org.apache.spark.sql.execution.window.RowBuffer rows)  ;
  /**
   * Write the current results to the target row.
   * @param index (undocumented)
   * @param current (undocumented)
   */
  public abstract  void write (int index, org.apache.spark.sql.catalyst.InternalRow current)  ;
}
