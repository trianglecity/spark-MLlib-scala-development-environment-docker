package org.apache.spark.sql.catalyst.expressions;
public  class TimeWindow$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TimeWindow$ MODULE$ = null;
  public   TimeWindow$ ()  { throw new RuntimeException(); }
  /**
   * Parses the interval string for a valid time duration. CalendarInterval expects interval
   * strings to start with the string <code>interval</code>. For usability, we prepend <code>interval</code> to the string
   * if the user omitted it.
   * <p>
   * @param interval The interval string
   * @return The interval duration in microseconds. SparkSQL casts TimestampType has microsecond
   *         precision.
   */
  private  long getIntervalInMicroSeconds (java.lang.String interval)  { throw new RuntimeException(); }
  /**
   * Parses the duration expression to generate the long value for the original constructor so
   * that we can use <code>window</code> in SQL.
   * @param expr (undocumented)
   * @return (undocumented)
   */
  private  long parseExpression (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.TimeWindow apply (org.apache.spark.sql.catalyst.expressions.Expression timeColumn, java.lang.String windowDuration, java.lang.String slideDuration, java.lang.String startTime)  { throw new RuntimeException(); }
}
