package org.apache.spark.sql.execution.joins;
public  class SortMergeFullOuterJoinScanner {
  public   SortMergeFullOuterJoinScanner (org.apache.spark.sql.catalyst.expressions.Projection leftKeyGenerator, org.apache.spark.sql.catalyst.expressions.Projection rightKeyGenerator, scala.math.Ordering<org.apache.spark.sql.catalyst.InternalRow> keyOrdering, org.apache.spark.sql.execution.RowIterator leftIter, org.apache.spark.sql.execution.RowIterator rightIter, scala.Function1<org.apache.spark.sql.catalyst.InternalRow, java.lang.Object> boundCondition, org.apache.spark.sql.catalyst.InternalRow leftNullRow, org.apache.spark.sql.catalyst.InternalRow rightNullRow)  { throw new RuntimeException(); }
  /**
   * Advance the left iterator and compute the new row's join key.
   * @return true if the left iterator returned a row and false otherwise.
   */
  private  boolean advancedLeft ()  { throw new RuntimeException(); }
  /**
   * Advance the right iterator and compute the new row's join key.
   * @return true if the right iterator returned a row and false otherwise.
   */
  private  boolean advancedRight ()  { throw new RuntimeException(); }
  /**
   * Populate the left and right buffers with rows matching the provided key.
   * This consumes rows from both iterators until their keys are different from the matching key.
   * @param matchingKey (undocumented)
   */
  private  void findMatchingRows (org.apache.spark.sql.catalyst.InternalRow matchingKey)  { throw new RuntimeException(); }
  /**
   * Scan the left and right buffers for the next valid match.
   * <p>
   * Note: this method mutates <code>joinedRow</code> to point to the latest matching rows in the buffers.
   * If a left row has no valid matches on the right, or a right row has no valid matches on the
   * left, then the row is joined with the null row and the result is considered a valid match.
   * <p>
   * @return true if a valid match is found, false otherwise.
   */
  private  boolean scanNextInBuffered ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.JoinedRow getJoinedRow ()  { throw new RuntimeException(); }
  public  boolean advanceNext ()  { throw new RuntimeException(); }
}
