package org.apache.spark.streaming.flume;
/**
 * This class implements the core functionality of {@link FlumePollingReceiver}. When started it
 * pulls data from Flume, stores it to Spark and then sends an Ack or Nack. This class should be
 * run via a {@link java.util.concurrent.Executor} as this implements {@link Runnable}
 * <p>
 * param:  receiver The receiver that owns this instance.
 */
  class FlumeBatchFetcher implements java.lang.Runnable, org.apache.spark.internal.Logging {
  public   FlumeBatchFetcher (org.apache.spark.streaming.flume.FlumePollingReceiver receiver)  { throw new RuntimeException(); }
  public  void run ()  { throw new RuntimeException(); }
  /**
   * Gets a batch of events from the specified client. This method does not handle any exceptions
   * which will be propagated to the caller.
   * @param client Client to get events from
   * @return {@link Some} which contains the event batch if Flume sent any events back, else {@link None}
   */
  private  scala.Option<org.apache.spark.streaming.flume.sink.EventBatch> getBatch (org.apache.spark.streaming.flume.sink.SparkFlumeProtocol.Callback client)  { throw new RuntimeException(); }
  /**
   * Store the events in the buffer to Spark. This method will not propagate any exceptions,
   * but will propagate any other errors.
   * @param buffer The buffer to store
   * @return true if the data was stored without any exception being thrown, else false
   */
  private  boolean store (scala.collection.mutable.ArrayBuffer<org.apache.spark.streaming.flume.SparkFlumeEvent> buffer)  { throw new RuntimeException(); }
  /**
   * Send an ack to the client for the sequence number. This method does not handle any exceptions
   * which will be propagated to the caller.
   * @param client client to send the ack to
   * @param seq sequence number of the batch to be ack-ed.
   * @return
   */
  private  void sendAck (org.apache.spark.streaming.flume.sink.SparkFlumeProtocol.Callback client, java.lang.CharSequence seq)  { throw new RuntimeException(); }
  /**
   * This method sends a Nack if a batch was received to the client with the given sequence
   * number. Any exceptions thrown by the RPC call is simply thrown out as is - no effort is made
   * to handle it.
   * @param batchReceived true if a batch was received. If this is false, no nack is sent
   * @param client The client to which the nack should be sent
   * @param seq The sequence number of the batch that is being nack-ed.
   */
  private  void sendNack (boolean batchReceived, org.apache.spark.streaming.flume.sink.SparkFlumeProtocol.Callback client, java.lang.CharSequence seq)  { throw new RuntimeException(); }
  /**
   * Utility method to convert {@link SparkSinkEvent}s to {@link SparkFlumeEvent}s
   * @param events - Events to convert to SparkFlumeEvents
   * @return - The SparkFlumeEvent generated from SparkSinkEvent
   */
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.streaming.flume.SparkFlumeEvent> toSparkFlumeEvents (java.util.List<org.apache.spark.streaming.flume.sink.SparkSinkEvent> events)  { throw new RuntimeException(); }
}
