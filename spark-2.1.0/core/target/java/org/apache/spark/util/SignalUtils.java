package org.apache.spark.util;
/**
 * Contains utilities for working with posix signals.
 */
public  class SignalUtils {
  /**
   * A handler for the given signal that runs a collection of actions.
   */
  static private  class ActionHandler implements sun.misc.SignalHandler {
    public   ActionHandler (sun.misc.Signal signal)  { throw new RuntimeException(); }
    /**
     * List of actions upon the signal; the callbacks should return true if the signal is "handled",
     * i.e. should not escalate to the next callback.
     * @return (undocumented)
     */
    private  java.util.List<scala.Function0<java.lang.Object>> actions ()  { throw new RuntimeException(); }
    private  sun.misc.SignalHandler prevHandler ()  { throw new RuntimeException(); }
    /**
     * Called when this handler's signal is received. Note that if the same signal is received
     * before this method returns, it is escalated to the previous handler.
     * @param sig (undocumented)
     */
    public  void handle (sun.misc.Signal sig)  { throw new RuntimeException(); }
    /**
     * Adds an action to be run by this handler.
     * @param action An action to be run when a signal is received. Return true if the signal
     *               should be stopped with this handler, false if it should be escalated.
     */
    public  void register (scala.Function0<java.lang.Object> action)  { throw new RuntimeException(); }
  }
  /** A flag to make sure we only register the logger once. */
  static private  boolean loggerRegistered ()  { throw new RuntimeException(); }
  /** Register a signal handler to log signals on UNIX-like systems. */
  static public  void registerLogger (org.slf4j.Logger log)  { throw new RuntimeException(); }
  /**
   * Adds an action to be run when a given signal is received by this process.
   * <p>
   * Note that signals are only supported on unix-like operating systems and work on a best-effort
   * basis: if a signal is not available or cannot be intercepted, only a warning is emitted.
   * <p>
   * All actions for a given signal are run in a separate thread.
   * @param signal (undocumented)
   * @param action (undocumented)
   */
  static public  void register (java.lang.String signal, scala.Function0<java.lang.Object> action)  { throw new RuntimeException(); }
  /** Mapping from signal to their respective handlers. */
  static private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.util.SignalUtils.ActionHandler> handlers ()  { throw new RuntimeException(); }
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
}
