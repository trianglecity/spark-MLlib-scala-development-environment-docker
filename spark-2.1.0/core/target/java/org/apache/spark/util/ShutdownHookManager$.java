package org.apache.spark.util;
/**
 * Various utility methods used by Spark.
 */
public  class ShutdownHookManager$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ShutdownHookManager$ MODULE$ = null;
  public   ShutdownHookManager$ ()  { throw new RuntimeException(); }
  public  int DEFAULT_SHUTDOWN_PRIORITY ()  { throw new RuntimeException(); }
  /**
   * The shutdown priority of the SparkContext instance. This is lower than the default
   * priority, so that by default hooks are run before the context is shut down.
   * @return (undocumented)
   */
  public  int SPARK_CONTEXT_SHUTDOWN_PRIORITY ()  { throw new RuntimeException(); }
  /**
   * The shutdown priority of temp directory must be lower than the SparkContext shutdown
   * priority. Otherwise cleaning the temp directories while Spark jobs are running can
   * throw undesirable errors at the time of shutdown.
   * @return (undocumented)
   */
  public  int TEMP_DIR_SHUTDOWN_PRIORITY ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.SparkShutdownHookManager shutdownHooks ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.lang.String> shutdownDeletePaths ()  { throw new RuntimeException(); }
  public  void registerShutdownDeleteDir (java.io.File file)  { throw new RuntimeException(); }
  public  void removeShutdownDeleteDir (java.io.File file)  { throw new RuntimeException(); }
  public  boolean hasShutdownDeleteDir (java.io.File file)  { throw new RuntimeException(); }
  public  boolean hasRootAsShutdownDeleteDir (java.io.File file)  { throw new RuntimeException(); }
  /**
   * Detect whether this thread might be executing a shutdown hook. Will always return true if
   * the current thread is a running a shutdown hook but may spuriously return true otherwise (e.g.
   * if System.exit was just called by a concurrent thread).
   * <p>
   * Currently, this detects whether the JVM is shutting down by Runtime#addShutdownHook throwing
   * an IllegalStateException.
   * @return (undocumented)
   */
  public  boolean inShutdown ()  { throw new RuntimeException(); }
  /**
   * Adds a shutdown hook with default priority.
   * <p>
   * @param hook The code to run during shutdown.
   * @return A handle that can be used to unregister the shutdown hook.
   */
  public  java.lang.Object addShutdownHook (scala.Function0<scala.runtime.BoxedUnit> hook)  { throw new RuntimeException(); }
  /**
   * Adds a shutdown hook with the given priority. Hooks with lower priority values run
   * first.
   * <p>
   * @param hook The code to run during shutdown.
   * @return A handle that can be used to unregister the shutdown hook.
   * @param priority (undocumented)
   */
  public  java.lang.Object addShutdownHook (int priority, scala.Function0<scala.runtime.BoxedUnit> hook)  { throw new RuntimeException(); }
  /**
   * Remove a previously installed shutdown hook.
   * <p>
   * @param ref A handle returned by <code>addShutdownHook</code>.
   * @return Whether the hook was removed.
   */
  public  boolean removeShutdownHook (java.lang.Object ref)  { throw new RuntimeException(); }
}
