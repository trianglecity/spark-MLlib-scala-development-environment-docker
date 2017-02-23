package org.apache.spark.streaming.dstream;
/**
 * Abstract class for defining any {@link org.apache.spark.streaming.dstream.InputDStream}
 * that has to start a receiver on worker nodes to receive external data.
 * Specific implementations of ReceiverInputDStream must
 * define {@link getReceiver} function that gets the receiver object of type
 * {@link org.apache.spark.streaming.receiver.Receiver} that will be sent
 * to the workers to receive data.
 * param:  _ssc Streaming context that will execute this input stream
 * @tparam T Class type of the object of this stream
 */
public abstract class ReceiverInputDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.InputDStream<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ReceiverInputDStream (org.apache.spark.streaming.StreamingContext _ssc, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * Asynchronously maintains &amp; sends new rate limits to the receiver through the receiver tracker.
   * @return (undocumented)
   */
  protected  scala.Option<org.apache.spark.streaming.scheduler.RateController> rateController ()  { throw new RuntimeException(); }
  /**
   * Gets the receiver object that will be sent to the worker nodes
   * to receive data. This method needs to defined by any specific implementation
   * of a ReceiverInputDStream.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.streaming.receiver.Receiver<T> getReceiver ()  ;
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * @param validTime (undocumented)
   * @return (undocumented)
   * Generates RDDs with blocks received by the receiver of this stream. */
  public  scala.Option<org.apache.spark.rdd.RDD<T>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
    org.apache.spark.rdd.RDD<T> createBlockRDD (org.apache.spark.streaming.Time time, scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo> blockInfos)  { throw new RuntimeException(); }
  /**
   * A RateController that sends the new rate to receivers, via the receiver tracker.
   */
    class ReceiverRateController extends org.apache.spark.streaming.scheduler.RateController {
    public   ReceiverRateController (int id, org.apache.spark.streaming.scheduler.rate.RateEstimator estimator)  { throw new RuntimeException(); }
    public  void publish (long rate)  { throw new RuntimeException(); }
  }
}
