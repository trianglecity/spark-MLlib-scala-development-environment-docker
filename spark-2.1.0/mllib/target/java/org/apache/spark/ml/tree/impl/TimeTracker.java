package org.apache.spark.ml.tree.impl;
/**
 * Time tracker implementation which holds labeled timers.
 */
  class TimeTracker implements scala.Serializable {
  public   TimeTracker ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> starts ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> totals ()  { throw new RuntimeException(); }
  /**
   * Starts a new timer, or re-starts a stopped timer.
   * @param timerLabel (undocumented)
   */
  public  void start (java.lang.String timerLabel)  { throw new RuntimeException(); }
  /**
   * Stops a timer and returns the elapsed time in seconds.
   * @param timerLabel (undocumented)
   * @return (undocumented)
   */
  public  double stop (java.lang.String timerLabel)  { throw new RuntimeException(); }
  /**
   * Print all timing results in seconds.
   * @return (undocumented)
   */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
