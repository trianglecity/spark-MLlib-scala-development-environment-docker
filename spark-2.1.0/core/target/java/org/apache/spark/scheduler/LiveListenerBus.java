package org.apache.spark.scheduler;
/**
 * Asynchronously passes SparkListenerEvents to registered SparkListeners.
 * <p>
 * Until <code>start()</code> is called, all posted events are only buffered. Only after this listener bus
 * has started will events be actually propagated to all attached listeners. This listener bus
 * is stopped when <code>stop()</code> is called, and it will drop further events after stopping.
 */
  class LiveListenerBus implements org.apache.spark.scheduler.SparkListenerBus {
  static public  scala.util.DynamicVariable<java.lang.Object> withinListenerThread ()  { throw new RuntimeException(); }
  /** The thread name of Spark listener bus */
  static public  java.lang.String name ()  { throw new RuntimeException(); }
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
  static   java.util.concurrent.CopyOnWriteArrayList<L> listeners ()  { throw new RuntimeException(); }
  static public final  void addListener (L listener)  { throw new RuntimeException(); }
  static public final  void removeListener (L listener)  { throw new RuntimeException(); }
  static public final  void postToAll (E event)  { throw new RuntimeException(); }
  static  <T extends L> scala.collection.Seq<T> findListenersByClass (scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  static protected  void doPostEvent (org.apache.spark.scheduler.SparkListenerInterface listener, org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  // not preceding
  public   LiveListenerBus (org.apache.spark.SparkContext sparkContext)  { throw new RuntimeException(); }
  private  int EVENT_QUEUE_CAPACITY ()  { throw new RuntimeException(); }
  private  java.util.concurrent.LinkedBlockingQueue<org.apache.spark.scheduler.SparkListenerEvent> eventQueue ()  { throw new RuntimeException(); }
  private  int validateAndGetQueueSize ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicBoolean started ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicBoolean stopped ()  { throw new RuntimeException(); }
  /** A counter for dropped events. It will be reset every time we log it. */
  private  java.util.concurrent.atomic.AtomicLong droppedEventsCounter ()  { throw new RuntimeException(); }
  /** When `droppedEventsCounter` was logged last time in milliseconds. */
  private  long lastReportTimestamp ()  { throw new RuntimeException(); }
  private  boolean processingEvent ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicBoolean logDroppedEvent ()  { throw new RuntimeException(); }
  private  java.util.concurrent.Semaphore eventLock ()  { throw new RuntimeException(); }
  private  java.lang.Thread listenerThread ()  { throw new RuntimeException(); }
  /**
   * Start sending events to attached listeners.
   * <p>
   * This first sends out all buffered events posted before this listener bus has started, then
   * listens for any additional events asynchronously while the listener bus is still running.
   * This should only be called once.
   * <p>
   */
  public  void start ()  { throw new RuntimeException(); }
  public  void post (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  /**
   * For testing only. Wait until there are no more events in the queue, or until the specified
   * time has elapsed. Throw <code>TimeoutException</code> if the specified time elapsed before the queue
   * emptied.
   * Exposed for testing.
   * @param timeoutMillis (undocumented)
   */
  public  void waitUntilEmpty (long timeoutMillis) throws java.util.concurrent.TimeoutException { throw new RuntimeException(); }
  /**
   * For testing only. Return whether the listener daemon thread is still alive.
   * Exposed for testing.
   * @return (undocumented)
   */
  public  boolean listenerThreadIsAlive ()  { throw new RuntimeException(); }
  /**
   * Return whether the event queue is empty.
   * <p>
   * The use of synchronized here guarantees that all events that once belonged to this queue
   * have already been processed by all attached listeners, if this returns true.
   * @return (undocumented)
   */
  private  boolean queueIsEmpty ()  { throw new RuntimeException(); }
  /**
   * Stop the listener bus. It will wait until the queued events have been processed, but drop the
   * new events after stopping.
   */
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * If the event queue exceeds its capacity, the new events will be dropped. The subclasses will be
   * notified with the dropped events.
   * <p>
   * Note: <code>onDropEvent</code> can be called in any thread.
   * @param event (undocumented)
   */
  public  void onDropEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
}
