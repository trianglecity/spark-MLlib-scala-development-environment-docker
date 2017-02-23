package org.apache.spark.streaming.flume.sink;
/**
 * Class that implements the SparkFlumeProtocol, that is used by the Avro Netty Server to process
 * requests. Each getEvents, ack and nack call is forwarded to an instance of this class.
 * param:  threads Number of threads to use to process requests.
 * param:  channel The channel that the sink pulls events from
 * param:  transactionTimeout Timeout in millis after which the transaction if not acked by Spark
 *                           is rolled back.
 */
  class SparkAvroCallbackHandler implements org.apache.spark.streaming.flume.sink.SparkFlumeProtocol, org.apache.spark.streaming.flume.sink.Logging {
  public  int threads ()  { throw new RuntimeException(); }
  public  org.apache.flume.Channel channel ()  { throw new RuntimeException(); }
  public  int transactionTimeout ()  { throw new RuntimeException(); }
  public  int backOffInterval ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkAvroCallbackHandler (int threads, org.apache.flume.Channel channel, int transactionTimeout, int backOffInterval)  { throw new RuntimeException(); }
  public  scala.Option<java.util.concurrent.ExecutorService> transactionExecutorOpt ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.CharSequence, org.apache.spark.streaming.flume.sink.TransactionProcessor> sequenceNumberToProcessor ()  { throw new RuntimeException(); }
  private  java.lang.String seqBase ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicLong seqCounter ()  { throw new RuntimeException(); }
  private  boolean stopped ()  { throw new RuntimeException(); }
  private  boolean isTest ()  { throw new RuntimeException(); }
  private  java.util.concurrent.CountDownLatch testLatch ()  { throw new RuntimeException(); }
  /**
   * Returns a bunch of events to Spark over Avro RPC.
   * @param n Maximum number of events to return in a batch
   * @return {@link EventBatch} instance that has a sequence number and an array of at most n events
   */
  public  org.apache.spark.streaming.flume.sink.EventBatch getEventBatch (int n)  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.streaming.flume.sink.TransactionProcessor> createProcessor (java.lang.String seq, int n)  { throw new RuntimeException(); }
  /**
   * Called by Spark to indicate successful commit of a batch
   * @param sequenceNumber The sequence number of the event batch that was successful
   * @return (undocumented)
   */
  public  java.lang.Void ack (java.lang.CharSequence sequenceNumber)  { throw new RuntimeException(); }
  /**
   * Called by Spark to indicate failed commit of a batch
   * @param sequenceNumber The sequence number of the event batch that failed
   * @return
   */
  public  java.lang.Void nack (java.lang.CharSequence sequenceNumber)  { throw new RuntimeException(); }
  /**
   * Helper method to commit or rollback a transaction.
   * @param sequenceNumber The sequence number of the batch that was completed
   * @param success Whether the batch was successful or not.
   */
  private  void completeTransaction (java.lang.CharSequence sequenceNumber, boolean success)  { throw new RuntimeException(); }
  /**
   * Helper method to remove the TxnProcessor for a Sequence Number. Can be used to avoid a leak.
   * @param sequenceNumber
   * @return An <code>Option</code> of the transaction processor for the corresponding batch. Note that this
   *         instance is no longer tracked and the caller is responsible for that txn processor.
   */
    scala.Option<org.apache.spark.streaming.flume.sink.TransactionProcessor> removeAndGetProcessor (java.lang.CharSequence sequenceNumber)  { throw new RuntimeException(); }
    void countDownWhenBatchAcked (java.util.concurrent.CountDownLatch latch)  { throw new RuntimeException(); }
  /**
   * Shuts down the executor used to process transactions.
   */
  public  void shutdown ()  { throw new RuntimeException(); }
}
