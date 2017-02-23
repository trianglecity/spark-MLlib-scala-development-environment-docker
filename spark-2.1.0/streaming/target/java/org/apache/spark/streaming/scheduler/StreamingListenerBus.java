package org.apache.spark.streaming.scheduler;
/**
 * A Streaming listener bus to forward events to StreamingListeners. This one will wrap received
 * Streaming events as WrappedStreamingListenerEvent and send them to Spark listener bus. It also
 * registers itself with Spark listener bus, so that it can receive WrappedStreamingListenerEvents,
 * unwrap them as StreamingListenerEvent and dispatch them to StreamingListeners.
 */
  class StreamingListenerBus extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.util.ListenerBus<org.apache.spark.streaming.scheduler.StreamingListener, org.apache.spark.streaming.scheduler.StreamingListenerEvent> {
  public   StreamingListenerBus (org.apache.spark.scheduler.LiveListenerBus sparkListenerBus)  { throw new RuntimeException(); }
  /**
   * Post a StreamingListenerEvent to the Spark listener bus asynchronously. This event will be
   * dispatched to all StreamingListeners in the thread of the Spark listener bus.
   * @param event (undocumented)
   */
  public  void post (org.apache.spark.streaming.scheduler.StreamingListenerEvent event)  { throw new RuntimeException(); }
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  protected  void doPostEvent (org.apache.spark.streaming.scheduler.StreamingListener listener, org.apache.spark.streaming.scheduler.StreamingListenerEvent event)  { throw new RuntimeException(); }
  /**
   * Register this one with the Spark listener bus so that it can receive Streaming events and
   * forward them to StreamingListeners.
   */
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Unregister this one with the Spark listener bus and all StreamingListeners won't receive any
   * events after that.
   */
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Wrapper for StreamingListenerEvent as SparkListenerEvent so that it can be posted to Spark
   * listener bus.
   */
  private  class WrappedStreamingListenerEvent implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
    public  org.apache.spark.streaming.scheduler.StreamingListenerEvent streamingListenerEvent ()  { throw new RuntimeException(); }
    // not preceding
    public   WrappedStreamingListenerEvent (org.apache.spark.streaming.scheduler.StreamingListenerEvent streamingListenerEvent)  { throw new RuntimeException(); }
    protected  boolean logEvent ()  { throw new RuntimeException(); }
  }
  private  class WrappedStreamingListenerEvent extends scala.runtime.AbstractFunction1<org.apache.spark.streaming.scheduler.StreamingListenerEvent, org.apache.spark.streaming.scheduler.StreamingListenerBus.WrappedStreamingListenerEvent> implements scala.Serializable {
    public   WrappedStreamingListenerEvent ()  { throw new RuntimeException(); }
  }
}
