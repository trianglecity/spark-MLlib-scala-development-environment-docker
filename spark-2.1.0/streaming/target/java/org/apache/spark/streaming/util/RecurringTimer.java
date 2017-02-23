package org.apache.spark.streaming.util;
  class RecurringTimer implements org.apache.spark.internal.Logging {
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  public   RecurringTimer (org.apache.spark.util.Clock clock, long period, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> callback, java.lang.String name)  { throw new RuntimeException(); }
  private  java.lang.Thread thread ()  { throw new RuntimeException(); }
  private  long prevTime ()  { throw new RuntimeException(); }
  private  long nextTime ()  { throw new RuntimeException(); }
  private  boolean stopped ()  { throw new RuntimeException(); }
  /**
   * Get the time when this timer will fire if it is started right now.
   * The time will be a multiple of this timer's period and more than
   * current system time.
   * @return (undocumented)
   */
  public  long getStartTime ()  { throw new RuntimeException(); }
  /**
   * Get the time when the timer will fire if it is restarted right now.
   * This time depends on when the timer was started the first time, and was stopped
   * for whatever reason. The time must be a multiple of this timer's period and
   * more than current time.
   * @param originalStartTime (undocumented)
   * @return (undocumented)
   */
  public  long getRestartTime (long originalStartTime)  { throw new RuntimeException(); }
  /**
   * Start at the given start time.
   * @param startTime (undocumented)
   * @return (undocumented)
   */
  public  long start (long startTime)  { throw new RuntimeException(); }
  /**
   * Start at the earliest time it can start based on the period.
   * @return (undocumented)
   */
  public  long start ()  { throw new RuntimeException(); }
  /**
   * Stop the timer, and return the last time the callback was made.
   * <p>
   * @param interruptTimer True will interrupt the callback if it is in progress (not guaranteed to
   *                       give correct time in this case). False guarantees that there will be at
   *                       least one callback after <code>stop</code> has been called.
   * @return (undocumented)
   */
  public  long stop (boolean interruptTimer)  { throw new RuntimeException(); }
  private  void triggerActionForNextInterval ()  { throw new RuntimeException(); }
  /**
   * Repeatedly call the callback every interval.
   */
  private  void loop ()  { throw new RuntimeException(); }
}
