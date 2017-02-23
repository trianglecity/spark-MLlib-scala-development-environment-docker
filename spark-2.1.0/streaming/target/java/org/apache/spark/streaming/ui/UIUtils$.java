package org.apache.spark.streaming.ui;
public  class UIUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final UIUtils$ MODULE$ = null;
  public   UIUtils$ ()  { throw new RuntimeException(); }
  /**
   * Return the short string for a <code>TimeUnit</code>.
   * @param unit (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String shortTimeUnitString (java.util.concurrent.TimeUnit unit)  { throw new RuntimeException(); }
  /**
   * Find the best <code>TimeUnit</code> for converting milliseconds to a friendly string. Return the value
   * after converting, also with its TimeUnit.
   * @param milliseconds (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple2<java.lang.Object, java.util.concurrent.TimeUnit> normalizeDuration (long milliseconds)  { throw new RuntimeException(); }
  /**
   * Convert <code>milliseconds</code> to the specified <code>unit</code>. We cannot use <code>TimeUnit.convert</code> because it
   * will discard the fractional part.
   * @param milliseconds (undocumented)
   * @param unit (undocumented)
   * @return (undocumented)
   */
  public  double convertToTimeUnit (long milliseconds, java.util.concurrent.TimeUnit unit)  { throw new RuntimeException(); }
  private  java.lang.ThreadLocal<java.text.SimpleDateFormat> batchTimeFormat ()  { throw new RuntimeException(); }
  private  java.lang.ThreadLocal<java.text.SimpleDateFormat> batchTimeFormatWithMilliseconds ()  { throw new RuntimeException(); }
  /**
   * If <code>batchInterval</code> is less than 1 second, format <code>batchTime</code> with milliseconds. Otherwise,
   * format <code>batchTime</code> without milliseconds.
   * <p>
   * @param batchTime the batch time to be formatted
   * @param batchInterval the batch interval
   * @param showYYYYMMSS if showing the <code>yyyy/MM/dd</code> part. If it's false, the return value wll be
   *                     only <code>HH:mm:ss</code> or <code>HH:mm:ss.SSS</code> depending on <code>batchInterval</code>
   * @param timezone only for test
   * @return (undocumented)
   */
  public  java.lang.String formatBatchTime (long batchTime, long batchInterval, boolean showYYYYMMSS, java.util.TimeZone timezone)  { throw new RuntimeException(); }
  public  java.lang.String createOutputOperationFailureForUI (java.lang.String failure)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> failureReasonCell (java.lang.String failureReason, int rowspan, boolean includeFirstLineInExpandDetails)  { throw new RuntimeException(); }
}
