package org.apache.spark.util;
/**
 * An event loop to receive events from the caller and process all events in the event thread. It
 * will start an exclusive event thread to process all events.
 * <p>
 * Note: The event queue will grow indefinitely. So subclasses should make sure <code>onReceive</code> can
 * handle events in time to avoid the potential OOM.
 */
 abstract class EventLoop<E extends java.lang.Object> implements org.apache.spark.internal.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   EventLoop (java.lang.String name)  { throw new RuntimeException(); }
  private  java.util.concurrent.BlockingQueue<E> eventQueue ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicBoolean stopped ()  { throw new RuntimeException(); }
  private  java.lang.Thread eventThread ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Put the event into the event queue. The event thread will process it later.
   * @param event (undocumented)
   */
  public  void post (E event)  { throw new RuntimeException(); }
  /**
   * Return if the event thread has already been started but not yet stopped.
   * @return (undocumented)
   */
  public  boolean isActive ()  { throw new RuntimeException(); }
  /**
   * Invoked when <code>start()</code> is called but before the event thread starts.
   */
  protected  void onStart ()  { throw new RuntimeException(); }
  /**
   * Invoked when <code>stop()</code> is called and the event thread exits.
   */
  protected  void onStop ()  { throw new RuntimeException(); }
  /**
   * Invoked in the event thread when polling events from the event queue.
   * <p>
   * Note: Should avoid calling blocking actions in <code>onReceive</code>, or the event thread will be blocked
   * and cannot process events in time. If you want to call some blocking actions, run them in
   * another thread.
   * @param event (undocumented)
   */
  protected abstract  void onReceive (E event)  ;
  /**
   * Invoked if <code>onReceive</code> throws any non fatal error. Any non fatal error thrown from <code>onError</code>
   * will be ignored.
   * @param e (undocumented)
   */
  protected abstract  void onError (java.lang.Throwable e)  ;
}
