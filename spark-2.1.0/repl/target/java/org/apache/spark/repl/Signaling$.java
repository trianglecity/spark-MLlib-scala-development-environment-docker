package org.apache.spark.repl;
public  class Signaling$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Signaling$ MODULE$ = null;
  public   Signaling$ ()  { throw new RuntimeException(); }
  /**
   * Register a SIGINT handler, that terminates all active spark jobs or terminates
   * when no jobs are currently running.
   * This makes it possible to interrupt a running shell job by pressing Ctrl+C.
   * @param ctx (undocumented)
   */
  public  void cancelOnInterrupt (org.apache.spark.SparkContext ctx)  { throw new RuntimeException(); }
}
