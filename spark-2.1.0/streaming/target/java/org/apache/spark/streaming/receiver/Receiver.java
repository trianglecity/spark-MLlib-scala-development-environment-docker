package org.apache.spark.streaming.receiver;
/**
 * :: DeveloperApi ::
 * Abstract class of a receiver that can be run on worker nodes to receive external data. A
 * custom receiver can be defined by defining the functions <code>onStart()</code> and <code>onStop()</code>. <code>onStart()</code>
 * should define the setup steps necessary to start receiving data,
 * and <code>onStop()</code> should define the cleanup steps necessary to stop receiving data.
 * Exceptions while receiving can be handled either by restarting the receiver with <code>restart(...)</code>
 * or stopped completely by <code>stop(...)</code>.
 * <p>
 * A custom receiver in Scala would look like this.
 * <p>
 * <pre><code>
 *  class MyReceiver(storageLevel: StorageLevel) extends NetworkReceiver[String](storageLevel) {
 *      def onStart() {
 *          // Setup stuff (start threads, open sockets, etc.) to start receiving data.
 *          // Must start new thread to receive data, as onStart() must be non-blocking.
 *
 *          // Call store(...) in those threads to store received data into Spark's memory.
 *
 *          // Call stop(...), restart(...) or reportError(...) on any thread based on how
 *          // different errors need to be handled.
 *
 *          // See corresponding method documentation for more details
 *      }
 *
 *      def onStop() {
 *          // Cleanup stuff (stop threads, close sockets, etc.) to stop receiving data.
 *      }
 *  }
 * </code></pre>
 * <p>
 * A custom receiver in Java would look like this.
 * <p>
 * <pre><code>
 * class MyReceiver extends Receiver&lt;String&gt; {
 *     public MyReceiver(StorageLevel storageLevel) {
 *         super(storageLevel);
 *     }
 *
 *     public void onStart() {
 *          // Setup stuff (start threads, open sockets, etc.) to start receiving data.
 *          // Must start new thread to receive data, as onStart() must be non-blocking.
 *
 *          // Call store(...) in those threads to store received data into Spark's memory.
 *
 *          // Call stop(...), restart(...) or reportError(...) on any thread based on how
 *          // different errors need to be handled.
 *
 *          // See corresponding method documentation for more details
 *     }
 *
 *     public void onStop() {
 *          // Cleanup stuff (stop threads, close sockets, etc.) to stop receiving data.
 *     }
 * }
 * </code></pre>
 */
public abstract class Receiver<T extends java.lang.Object> implements scala.Serializable {
  public  org.apache.spark.storage.StorageLevel storageLevel ()  { throw new RuntimeException(); }
  // not preceding
  public   Receiver (org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /**
   * This method is called by the system when the receiver is started. This function
   * must initialize all resources (threads, buffers, etc.) necessary for receiving data.
   * This function must be non-blocking, so receiving the data must occur on a different
   * thread. Received data can be stored with Spark by calling <code>store(data)</code>.
   * <p>
   * If there are errors in threads started here, then following options can be done
   * (i) <code>reportError(...)</code> can be called to report the error to the driver.
   * The receiving of data will continue uninterrupted.
   * (ii) <code>stop(...)</code> can be called to stop receiving data. This will call <code>onStop()</code> to
   * clear up all resources allocated (threads, buffers, etc.) during <code>onStart()</code>.
   * (iii) <code>restart(...)</code> can be called to restart the receiver. This will call <code>onStop()</code>
   * immediately, and then <code>onStart()</code> after a delay.
   */
  public abstract  void onStart ()  ;
  /**
   * This method is called by the system when the receiver is stopped. All resources
   * (threads, buffers, etc.) set up in <code>onStart()</code> must be cleaned up in this method.
   */
  public abstract  void onStop ()  ;
  /** Override this to specify a preferred location (hostname). */
  public  scala.Option<java.lang.String> preferredLocation ()  { throw new RuntimeException(); }
  /**
   * Store a single item of received data to Spark's memory.
   * These single items will be aggregated together into data blocks before
   * being pushed into Spark's memory.
   * @param dataItem (undocumented)
   */
  public  void store (T dataItem)  { throw new RuntimeException(); }
  /** Store an ArrayBuffer of received data as a data block into Spark's memory. */
  public  void store (scala.collection.mutable.ArrayBuffer<T> dataBuffer)  { throw new RuntimeException(); }
  /**
   * Store an ArrayBuffer of received data as a data block into Spark's memory.
   * The metadata will be associated with this block of data
   * for being used in the corresponding InputDStream.
   * @param dataBuffer (undocumented)
   * @param metadata (undocumented)
   */
  public  void store (scala.collection.mutable.ArrayBuffer<T> dataBuffer, Object metadata)  { throw new RuntimeException(); }
  /** Store an iterator of received data as a data block into Spark's memory. */
  public  void store (scala.collection.Iterator<T> dataIterator)  { throw new RuntimeException(); }
  /**
   * Store an iterator of received data as a data block into Spark's memory.
   * The metadata will be associated with this block of data
   * for being used in the corresponding InputDStream.
   * @param dataIterator (undocumented)
   * @param metadata (undocumented)
   */
  public  void store (java.util.Iterator<T> dataIterator, Object metadata)  { throw new RuntimeException(); }
  /** Store an iterator of received data as a data block into Spark's memory. */
  public  void store (java.util.Iterator<T> dataIterator)  { throw new RuntimeException(); }
  /**
   * Store an iterator of received data as a data block into Spark's memory.
   * The metadata will be associated with this block of data
   * for being used in the corresponding InputDStream.
   * @param dataIterator (undocumented)
   * @param metadata (undocumented)
   */
  public  void store (scala.collection.Iterator<T> dataIterator, Object metadata)  { throw new RuntimeException(); }
  /**
   * Store the bytes of received data as a data block into Spark's memory. Note
   * that the data in the ByteBuffer must be serialized using the same serializer
   * that Spark is configured to use.
   * @param bytes (undocumented)
   */
  public  void store (java.nio.ByteBuffer bytes)  { throw new RuntimeException(); }
  /**
   * Store the bytes of received data as a data block into Spark's memory.
   * The metadata will be associated with this block of data
   * for being used in the corresponding InputDStream.
   * @param bytes (undocumented)
   * @param metadata (undocumented)
   */
  public  void store (java.nio.ByteBuffer bytes, Object metadata)  { throw new RuntimeException(); }
  /** Report exceptions in receiving data. */
  public  void reportError (java.lang.String message, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  /**
   * Restart the receiver. This method schedules the restart and returns
   * immediately. The stopping and subsequent starting of the receiver
   * (by calling <code>onStop()</code> and <code>onStart()</code>) is performed asynchronously
   * in a background thread. The delay between the stopping and the starting
   * is defined by the Spark configuration <code>spark.streaming.receiverRestartDelay</code>.
   * The <code>message</code> will be reported to the driver.
   * @param message (undocumented)
   */
  public  void restart (java.lang.String message)  { throw new RuntimeException(); }
  /**
   * Restart the receiver. This method schedules the restart and returns
   * immediately. The stopping and subsequent starting of the receiver
   * (by calling <code>onStop()</code> and <code>onStart()</code>) is performed asynchronously
   * in a background thread. The delay between the stopping and the starting
   * is defined by the Spark configuration <code>spark.streaming.receiverRestartDelay</code>.
   * The <code>message</code> and <code>exception</code> will be reported to the driver.
   * @param message (undocumented)
   * @param error (undocumented)
   */
  public  void restart (java.lang.String message, java.lang.Throwable error)  { throw new RuntimeException(); }
  /**
   * Restart the receiver. This method schedules the restart and returns
   * immediately. The stopping and subsequent starting of the receiver
   * (by calling <code>onStop()</code> and <code>onStart()</code>) is performed asynchronously
   * in a background thread.
   * @param message (undocumented)
   * @param error (undocumented)
   * @param millisecond (undocumented)
   */
  public  void restart (java.lang.String message, java.lang.Throwable error, int millisecond)  { throw new RuntimeException(); }
  /** Stop the receiver completely. */
  public  void stop (java.lang.String message)  { throw new RuntimeException(); }
  /** Stop the receiver completely due to an exception */
  public  void stop (java.lang.String message, java.lang.Throwable error)  { throw new RuntimeException(); }
  /** Check if the receiver has started or not. */
  public  boolean isStarted ()  { throw new RuntimeException(); }
  /**
   * Check if receiver has been marked for stopping. Use this to identify when
   * the receiving of data should be stopped.
   * @return (undocumented)
   */
  public  boolean isStopped ()  { throw new RuntimeException(); }
  /**
   * Get the unique identifier the receiver input stream that this
   * receiver is associated with.
   * @return (undocumented)
   */
  public  int streamId ()  { throw new RuntimeException(); }
  /** Identifier of the stream this receiver is associated with. */
  private  int id ()  { throw new RuntimeException(); }
  /** Handler object that runs the receiver. This is instantiated lazily in the worker. */
  private  org.apache.spark.streaming.receiver.ReceiverSupervisor _supervisor ()  { throw new RuntimeException(); }
  /** Set the ID of the DStream that this receiver is associated with. */
    void setReceiverId (int _id)  { throw new RuntimeException(); }
  /** Attach Network Receiver executor to this receiver. */
    void attachSupervisor (org.apache.spark.streaming.receiver.ReceiverSupervisor exec)  { throw new RuntimeException(); }
  /** Get the attached supervisor. */
    org.apache.spark.streaming.receiver.ReceiverSupervisor supervisor ()  { throw new RuntimeException(); }
}
