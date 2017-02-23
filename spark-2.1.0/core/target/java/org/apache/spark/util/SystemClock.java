package org.apache.spark.util;
/**
 * A clock backed by the actual time from the OS as reported by the <code>System</code> API.
 */
  class SystemClock implements org.apache.spark.util.Clock {
  public   SystemClock ()  { throw new RuntimeException(); }
  public  long minPollTime ()  { throw new RuntimeException(); }
  /**
   * @return the same time (milliseconds since the epoch)
   *         as is reported by <code>System.currentTimeMillis()</code>
   */
  public  long getTimeMillis ()  { throw new RuntimeException(); }
  /**
   * @param targetTime block until the current time is at least this value
   * @return current system time when wait has completed
   */
  public  long waitTillTime (long targetTime)  { throw new RuntimeException(); }
}
