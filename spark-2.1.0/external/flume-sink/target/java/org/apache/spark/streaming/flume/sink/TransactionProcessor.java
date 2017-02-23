package org.apache.spark.streaming.flume.sink;
/**
 * This class represents a transaction on the Flume channel. This class runs a separate thread
 * which owns the transaction. The thread is blocked until the success call for that transaction
 * comes back with an ACK or NACK.
 * param:  channel The channel from which to pull events
 * param:  seqNum The sequence number to use for the transaction. Must be unique
 * param:  maxBatchSize The maximum number of events to process per batch
 * param:  transactionTimeout Time in seconds after which a transaction must be rolled back
 *                           without waiting for an ACK from Spark
 * param:  parent The parent {@link SparkAvroCallbackHandler} instance, for reporting timeouts
 */
public  class TransactionProcessor implements java.util.concurrent.Callable<java.lang.Void>, org.apache.spark.streaming.flume.sink.Logging {
  public  org.apache.flume.Channel channel ()  { throw new RuntimeException(); }
  public  java.lang.String seqNum ()  { throw new RuntimeException(); }
  public  int maxBatchSize ()  { throw new RuntimeException(); }
  public  int transactionTimeout ()  { throw new RuntimeException(); }
  public  int backOffInterval ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.flume.sink.SparkAvroCallbackHandler parent ()  { throw new RuntimeException(); }
  // not preceding
  public   TransactionProcessor (org.apache.flume.Channel channel, java.lang.String seqNum, int maxBatchSize, int transactionTimeout, int backOffInterval, org.apache.spark.streaming.flume.sink.SparkAvroCallbackHandler parent)  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.flume.sink.EventBatch eventBatch ()  { throw new RuntimeException(); }
  public  java.util.concurrent.CountDownLatch batchGeneratedLatch ()  { throw new RuntimeException(); }
  public  java.util.concurrent.CountDownLatch batchAckLatch ()  { throw new RuntimeException(); }
  public  int totalAttemptsToRemoveFromChannel ()  { throw new RuntimeException(); }
  private  boolean batchSuccess ()  { throw new RuntimeException(); }
  private  boolean stopped ()  { throw new RuntimeException(); }
  private  boolean isTest ()  { throw new RuntimeException(); }
  private  java.util.concurrent.CountDownLatch testLatch ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.flume.Transaction> txOpt ()  { throw new RuntimeException(); }
  /**
   * Get an event batch from the channel. This method will block until a batch of events is
   * available from the channel. If no events are available after a large number of attempts of
   * polling the channel, this method will return an {@link EventBatch} with a non-empty error message
   * <p>
   * @return An {@link EventBatch} instance with sequence number set to seqNum, filled with a
   *         maximum of maxBatchSize events
   */
  public  org.apache.spark.streaming.flume.sink.EventBatch getEventBatch ()  { throw new RuntimeException(); }
  /**
   * This method is to be called by the sink when it receives an ACK or NACK from Spark. This
   * method is a no-op if it is called after transactionTimeout has expired since
   * getEventBatch returned a batch of events.
   * @param success True if an ACK was received and the transaction should be committed, else false.
   */
  public  void batchProcessed (boolean success)  { throw new RuntimeException(); }
    void shutdown ()  { throw new RuntimeException(); }
  /**
   * Populates events into the event batch. If the batch cannot be populated,
   * this method will not set the events into the event batch, but it sets an error message.
   */
  private  void populateEvents ()  { throw new RuntimeException(); }
  /**
   * Waits for upto transactionTimeout seconds for an ACK. If an ACK comes in
   * this method commits the transaction with the channel. If the ACK does not come in within
   * that time or a NACK comes in, this method rolls back the transaction.
   */
  private  void processAckOrNack ()  { throw new RuntimeException(); }
  /**
   * Helper method to rollback and optionally close a transaction
   * @param tx The transaction to rollback
   * @param close Whether the transaction should be closed or not after rolling back
   */
  private  void rollbackAndClose (org.apache.flume.Transaction tx, boolean close)  { throw new RuntimeException(); }
  /**
   * Helper method to convert a Map[String, String] to Map[CharSequence, CharSequence]
   * @param inMap The map to be converted
   * @return The converted map
   */
  private  java.util.Map<java.lang.CharSequence, java.lang.CharSequence> toCharSequenceMap (java.util.Map<java.lang.String, java.lang.String> inMap)  { throw new RuntimeException(); }
  /**
   * When the thread is started it sets as many events as the batch size or less (if enough
   * events aren't available) into the eventBatch and object and lets any threads waiting on the
   * {@link getEventBatch} method to proceed. Then this thread waits for acks or nacks to come in,
   * or for a specified timeout and commits or rolls back the transaction.
   * @return
   */
  public  java.lang.Void call ()  { throw new RuntimeException(); }
    void countDownWhenBatchAcked (java.util.concurrent.CountDownLatch latch)  { throw new RuntimeException(); }
}
