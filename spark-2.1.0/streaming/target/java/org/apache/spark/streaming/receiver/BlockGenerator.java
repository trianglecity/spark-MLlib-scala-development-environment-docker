package org.apache.spark.streaming.receiver;
/**
 * Generates batches of objects received by a
 * {@link org.apache.spark.streaming.receiver.Receiver} and puts them into appropriately
 * named blocks at regular intervals. This class starts two threads,
 * one to periodically start a new batch and prepare the previous batch of as a block,
 * the other to push the blocks into the block manager.
 * <p>
 * Note: Do not create BlockGenerator instances directly inside receivers. Use
 * <code>ReceiverSupervisor.createBlockGenerator</code> to create a BlockGenerator and use it.
 */
  class BlockGenerator extends org.apache.spark.streaming.receiver.RateLimiter implements org.apache.spark.internal.Logging {
  private  class Block implements scala.Product, scala.Serializable {
    public  org.apache.spark.storage.StreamBlockId id ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.ArrayBuffer<java.lang.Object> buffer ()  { throw new RuntimeException(); }
    // not preceding
    public   Block (org.apache.spark.storage.StreamBlockId id, scala.collection.mutable.ArrayBuffer<java.lang.Object> buffer)  { throw new RuntimeException(); }
  }
  private  class Block$ extends scala.runtime.AbstractFunction2<org.apache.spark.storage.StreamBlockId, scala.collection.mutable.ArrayBuffer<java.lang.Object>, org.apache.spark.streaming.receiver.BlockGenerator.Block> implements scala.Serializable {
    public   Block$ ()  { throw new RuntimeException(); }
  }
  /**
   * The BlockGenerator can be in 5 possible states, in the order as follows.
   * <p>
   *  - Initialized: Nothing has been started.
   *  - Active: start() has been called, and it is generating blocks on added data.
   *  - StoppedAddingData: stop() has been called, the adding of data has been stopped,
   *                       but blocks are still being generated and pushed.
   *  - StoppedGeneratingBlocks: Generating of blocks has been stopped, but
   *                             they are still being pushed.
   *  - StoppedAll: Everything has been stopped, and the BlockGenerator object can be GCed.
   */
  private  class GeneratorState$ extends scala.Enumeration {
    public   GeneratorState$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value Initialized ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value Active ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value StoppedAddingData ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value StoppedGeneratingBlocks ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value StoppedAll ()  { throw new RuntimeException(); }
  }
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
  static public  void waitToPush ()  { throw new RuntimeException(); }
  static public  long getCurrentLimit ()  { throw new RuntimeException(); }
  static   void updateRate (long newRate)  { throw new RuntimeException(); }
  public   BlockGenerator (org.apache.spark.streaming.receiver.BlockGeneratorListener listener, int receiverId, org.apache.spark.SparkConf conf, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  private  org.apache.spark.streaming.receiver.BlockGenerator.GeneratorState$ GeneratorState ()  { throw new RuntimeException(); }
  private  long blockIntervalMs ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.util.RecurringTimer blockIntervalTimer ()  { throw new RuntimeException(); }
  private  int blockQueueSize ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ArrayBlockingQueue<org.apache.spark.streaming.receiver.BlockGenerator.Block> blocksForPushing ()  { throw new RuntimeException(); }
  private  java.lang.Thread blockPushingThread ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<java.lang.Object> currentBuffer ()  { throw new RuntimeException(); }
  private  scala.Enumeration.Value state ()  { throw new RuntimeException(); }
  /** Start block generating and pushing threads. */
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Stop everything in the right order such that all the data added is pushed out correctly.
   * <p>
   *  - First, stop adding data to the current buffer.
   *  - Second, stop generating blocks.
   *  - Finally, wait for queue of to-be-pushed blocks to be drained.
   */
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Push a single data item into the buffer.
   * @param data (undocumented)
   */
  public  void addData (Object data)  { throw new RuntimeException(); }
  /**
   * Push a single data item into the buffer. After buffering the data, the
   * <code>BlockGeneratorListener.onAddData</code> callback will be called.
   * @param data (undocumented)
   * @param metadata (undocumented)
   */
  public  void addDataWithCallback (Object data, Object metadata)  { throw new RuntimeException(); }
  /**
   * Push multiple data items into the buffer. After buffering the data, the
   * <code>BlockGeneratorListener.onAddData</code> callback will be called. Note that all the data items
   * are atomically added to the buffer, and are hence guaranteed to be present in a single block.
   * @param dataIterator (undocumented)
   * @param metadata (undocumented)
   */
  public  void addMultipleDataWithCallback (scala.collection.Iterator<java.lang.Object> dataIterator, Object metadata)  { throw new RuntimeException(); }
  public  boolean isActive ()  { throw new RuntimeException(); }
  public  boolean isStopped ()  { throw new RuntimeException(); }
  /** Change the buffer to which single records are added to. */
  private  void updateCurrentBuffer (long time)  { throw new RuntimeException(); }
  /** Keep pushing blocks to the BlockManager. */
  private  void keepPushingBlocks ()  { throw new RuntimeException(); }
  private  void reportError (java.lang.String message, java.lang.Throwable t)  { throw new RuntimeException(); }
  private  void pushBlock (org.apache.spark.streaming.receiver.BlockGenerator.Block block)  { throw new RuntimeException(); }
}
