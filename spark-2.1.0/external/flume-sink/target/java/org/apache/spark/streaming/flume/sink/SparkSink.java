package org.apache.spark.streaming.flume.sink;
/**
 * A sink that uses Avro RPC to run a server that can be polled by Spark's
 * FlumePollingInputDStream. This sink has the following configuration parameters:
 * <p>
 * hostname - The hostname to bind to. Default: 0.0.0.0
 * port - The port to bind to. (No default - mandatory)
 * timeout - Time in seconds after which a transaction is rolled back,
 * if an ACK is not received from Spark within that time
 * threads - Number of threads to use to receive requests from Spark (Default: 10)
 * <p>
 * This sink is unlike other Flume sinks in the sense that it does not push data,
 * instead the process method in this sink simply blocks the SinkRunner the first time it is
 * called. This sink starts up an Avro IPC server that uses the SparkFlumeProtocol.
 * <p>
 * Each time a getEventBatch call comes, creates a transaction and reads events
 * from the channel. When enough events are read, the events are sent to the Spark receiver and
 * the thread itself is blocked and a reference to it saved off.
 * <p>
 * When the ack for that batch is received,
 * the thread which created the transaction is is retrieved and it commits the transaction with the
 * channel from the same thread it was originally created in (since Flume transactions are
 * thread local). If a nack is received instead, the sink rolls back the transaction. If no ack
 * is received within the specified timeout, the transaction is rolled back too. If an ack comes
 * after that, it is simply ignored and the events get re-sent.
 * <p>
 */
public  class SparkSink extends org.apache.flume.sink.AbstractSink implements org.apache.spark.streaming.flume.sink.Logging, org.apache.flume.conf.Configurable {
  public   SparkSink ()  { throw new RuntimeException(); }
  private  java.lang.Integer poolSize ()  { throw new RuntimeException(); }
  private  int transactionTimeout ()  { throw new RuntimeException(); }
  private  java.lang.String hostname ()  { throw new RuntimeException(); }
  private  int port ()  { throw new RuntimeException(); }
  private  int backOffInterval ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.avro.ipc.NettyServer> serverOpt ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.streaming.flume.sink.SparkAvroCallbackHandler> handler ()  { throw new RuntimeException(); }
  private  java.util.concurrent.CountDownLatch blockingLatch ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void configure (org.apache.flume.Context ctx)  { throw new RuntimeException(); }
  public  org.apache.flume.Sink.Status process ()  { throw new RuntimeException(); }
    int getPort ()  { throw new RuntimeException(); }
  /**
   * Pass in a {@link CountDownLatch} for testing purposes. This batch is counted down when each
   * batch is received. The test can simply call await on this latch till the expected number of
   * batches are received.
   * @param latch
   */
    void countdownWhenBatchReceived (java.util.concurrent.CountDownLatch latch)  { throw new RuntimeException(); }
}
