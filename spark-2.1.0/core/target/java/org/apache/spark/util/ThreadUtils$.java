package org.apache.spark.util;
public  class ThreadUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ThreadUtils$ MODULE$ = null;
  public   ThreadUtils$ ()  { throw new RuntimeException(); }
  private  scala.concurrent.ExecutionContextExecutorService sameThreadExecutionContext ()  { throw new RuntimeException(); }
  /**
   * An <code>ExecutionContextExecutor</code> that runs each task in the thread that invokes <code>execute/submit</code>.
   * The caller should make sure the tasks running in this <code>ExecutionContextExecutor</code> are short and
   * never block.
   * @return (undocumented)
   */
  public  scala.concurrent.ExecutionContextExecutor sameThread ()  { throw new RuntimeException(); }
  /**
   * Create a thread factory that names threads with a prefix and also sets the threads to daemon.
   * @param prefix (undocumented)
   * @return (undocumented)
   */
  public  java.util.concurrent.ThreadFactory namedThreadFactory (java.lang.String prefix)  { throw new RuntimeException(); }
  /**
   * Wrapper over newCachedThreadPool. Thread names are formatted as prefix-ID, where ID is a
   * unique, sequentially assigned integer.
   * @param prefix (undocumented)
   * @return (undocumented)
   */
  public  java.util.concurrent.ThreadPoolExecutor newDaemonCachedThreadPool (java.lang.String prefix)  { throw new RuntimeException(); }
  /**
   * Create a cached thread pool whose max number of threads is <code>maxThreadNumber</code>. Thread names
   * are formatted as prefix-ID, where ID is a unique, sequentially assigned integer.
   * @param prefix (undocumented)
   * @param maxThreadNumber (undocumented)
   * @param keepAliveSeconds (undocumented)
   * @return (undocumented)
   */
  public  java.util.concurrent.ThreadPoolExecutor newDaemonCachedThreadPool (java.lang.String prefix, int maxThreadNumber, int keepAliveSeconds)  { throw new RuntimeException(); }
  /**
   * Wrapper over newFixedThreadPool. Thread names are formatted as prefix-ID, where ID is a
   * unique, sequentially assigned integer.
   * @param nThreads (undocumented)
   * @param prefix (undocumented)
   * @return (undocumented)
   */
  public  java.util.concurrent.ThreadPoolExecutor newDaemonFixedThreadPool (int nThreads, java.lang.String prefix)  { throw new RuntimeException(); }
  /**
   * Wrapper over newSingleThreadExecutor.
   * @param threadName (undocumented)
   * @return (undocumented)
   */
  public  java.util.concurrent.ExecutorService newDaemonSingleThreadExecutor (java.lang.String threadName)  { throw new RuntimeException(); }
  /**
   * Wrapper over ScheduledThreadPoolExecutor.
   * @param threadName (undocumented)
   * @return (undocumented)
   */
  public  java.util.concurrent.ScheduledExecutorService newDaemonSingleThreadScheduledExecutor (java.lang.String threadName)  { throw new RuntimeException(); }
  /**
   * Run a piece of code in a new thread and return the result. Exception in the new thread is
   * thrown in the caller thread with an adjusted stack trace that removes references to this
   * method for clarity. The exception stack traces will be like the following
   * <p>
   * SomeException: exception-message
   *   at CallerClass.body-method (sourcefile.scala)
   *   at ... run in separate thread using org.apache.spark.util.ThreadUtils ... ()
   *   at CallerClass.caller-method (sourcefile.scala)
   *   ...
   * @param threadName (undocumented)
   * @param isDaemon (undocumented)
   * @param body (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T runInNewThread (java.lang.String threadName, boolean isDaemon, scala.Function0<T> body)  { throw new RuntimeException(); }
  /**
   * Construct a new Scala ForkJoinPool with a specified max parallelism and name prefix.
   * @param prefix (undocumented)
   * @param maxThreadNumber (undocumented)
   * @return (undocumented)
   */
  public  scala.concurrent.forkjoin.ForkJoinPool newForkJoinPool (java.lang.String prefix, int maxThreadNumber)  { throw new RuntimeException(); }
  /**
   * Preferred alternative to <code>Await.result()</code>. This method wraps and re-throws any exceptions
   * thrown by the underlying <code>Await</code> call, ensuring that this thread's stack trace appears in
   * logs.
   * @param awaitable (undocumented)
   * @param atMost (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T awaitResult (scala.concurrent.Awaitable<T> awaitable, scala.concurrent.duration.Duration atMost) throws org.apache.spark.SparkException { throw new RuntimeException(); }
  /**
   * Calls <code>Awaitable.result</code> directly to avoid using <code>ForkJoinPool</code>'s <code>BlockingContext</code>, wraps
   * and re-throws any exceptions with nice stack track.
   * <p>
   * Codes running in the user's thread may be in a thread of Scala ForkJoinPool. As concurrent
   * executions in ForkJoinPool may see some {@link ThreadLocal} value unexpectedly, this method
   * basically prevents ForkJoinPool from running other tasks in the current waiting thread.
   * @param awaitable (undocumented)
   * @param atMost (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T awaitResultInForkJoinSafely (scala.concurrent.Awaitable<T> awaitable, scala.concurrent.duration.Duration atMost) throws org.apache.spark.SparkException { throw new RuntimeException(); }
}
