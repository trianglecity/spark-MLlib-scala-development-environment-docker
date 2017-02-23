package org.apache.spark.shuffle;
/**
 * Failed to fetch a shuffle block. The executor catches this exception and propagates it
 * back to DAGScheduler (through TaskEndReason) so we'd resubmit the previous stage.
 * <p>
 * Note that bmAddress can be null.
 */
  class FetchFailedException extends java.lang.Exception {
  static public  java.lang.String getMessage ()  { throw new RuntimeException(); }
  static public  java.lang.String getLocalizedMessage ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable getCause ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable initCause (java.lang.Throwable x$1)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  void printStackTrace ()  { throw new RuntimeException(); }
  static public  void printStackTrace (java.io.PrintStream x$1)  { throw new RuntimeException(); }
  static public  void printStackTrace (java.io.PrintWriter x$1)  { throw new RuntimeException(); }
  static public  java.lang.Throwable fillInStackTrace ()  { throw new RuntimeException(); }
  static public  java.lang.StackTraceElement[] getStackTrace ()  { throw new RuntimeException(); }
  static public  void setStackTrace (java.lang.StackTraceElement[] x$1)  { throw new RuntimeException(); }
  static   int getStackTraceDepth ()  { throw new RuntimeException(); }
  static   java.lang.StackTraceElement getStackTraceElement (int x$1)  { throw new RuntimeException(); }
  static public final  void addSuppressed (java.lang.Throwable x$1)  { throw new RuntimeException(); }
  static public final  java.lang.Throwable[] getSuppressed ()  { throw new RuntimeException(); }
  public   FetchFailedException (org.apache.spark.storage.BlockManagerId bmAddress, int shuffleId, int mapId, int reduceId, java.lang.String message, java.lang.Throwable cause)  { throw new RuntimeException(); }
  public   FetchFailedException (org.apache.spark.storage.BlockManagerId bmAddress, int shuffleId, int mapId, int reduceId, java.lang.Throwable cause)  { throw new RuntimeException(); }
  public  org.apache.spark.TaskFailedReason toTaskFailedReason ()  { throw new RuntimeException(); }
}
