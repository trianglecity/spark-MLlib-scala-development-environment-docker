package org.apache.spark.examples.streaming;
/**
 * Custom Receiver that receives data over a socket. Received bytes are interpreted as
 * text and \n delimited lines are considered as records. They are then counted and printed.
 * <p>
 * To run this on your local machine, you need to first run a Netcat server
 *    <code>$ nc -lk 9999</code>
 * and then run the example
 *    <code>$ bin/run-example org.apache.spark.examples.streaming.CustomReceiver localhost 9999</code>
 */
public  class CustomReceiver$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CustomReceiver$ MODULE$ = null;
  public   CustomReceiver$ ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
