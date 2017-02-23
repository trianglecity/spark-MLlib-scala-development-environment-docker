package org.apache.spark.util;
/**
 * A <code>Clock</code> whose time can be manually set and modified. Its reported time does not change
 * as time elapses, but only as its time is modified by callers. This is mainly useful for
 * testing.
 * <p>
 * param:  time initial time (in milliseconds since the epoch)
 */
  class ManualClock implements org.apache.spark.util.Clock {
  private  long time ()  { throw new RuntimeException(); }
  // not preceding
  public   ManualClock (long time)  { throw new RuntimeException(); }
  /**
   * @return <code>ManualClock</code> with initial time 0
   */
  public   ManualClock ()  { throw new RuntimeException(); }
  public  long getTimeMillis ()  { throw new RuntimeException(); }
  /**
   * @param timeToSet new time (in milliseconds) that the clock should represent
   */
  public  void setTime (long timeToSet)  { throw new RuntimeException(); }
  /**
   * @param timeToAdd time (in milliseconds) to add to the clock's time
   */
  public  void advance (long timeToAdd)  { throw new RuntimeException(); }
  /**
   * @param targetTime block until the clock time is set or advanced to at least this time
   * @return current time reported by the clock when waiting finishes
   */
  public  long waitTillTime (long targetTime)  { throw new RuntimeException(); }
}
