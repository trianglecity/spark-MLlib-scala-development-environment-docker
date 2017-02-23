package org.apache.spark.streaming.dstream;
/**
 * This is the abstract base class for all input streams. This class provides methods
 * start() and stop() which are called by Spark Streaming system to start and stop
 * receiving data, respectively.
 * Input streams that can generate RDDs from new data by running a service/thread only on
 * the driver node (that is, without running a receiver on worker nodes), can be
 * implemented by directly inheriting this InputDStream. For example,
 * FileInputDStream, a subclass of InputDStream, monitors a HDFS directory from the driver for
 * new files and generates RDDs with the new files. For implementing input streams
 * that requires running a receiver on the worker nodes, use
 * {@link org.apache.spark.streaming.dstream.ReceiverInputDStream} as the parent class.
 * <p>
 * param:  _ssc Streaming context that will execute this input stream
 */
public abstract class InputDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.DStream<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   InputDStream (org.apache.spark.streaming.StreamingContext _ssc, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
    org.apache.spark.streaming.Time lastValidTime ()  { throw new RuntimeException(); }
  /** This is an unique identifier for the input stream. */
  public  int id ()  { throw new RuntimeException(); }
  protected  scala.Option<org.apache.spark.streaming.scheduler.RateController> rateController ()  { throw new RuntimeException(); }
  /** A human-readable name of this InputDStream */
    java.lang.String name ()  { throw new RuntimeException(); }
  /**
   * The base scope associated with the operation that created this DStream.
   * <p>
   * For InputDStreams, we use the name of this DStream as the scope name.
   * If an outer scope is given, we assume that it includes an alternative name for this stream.
   * @return (undocumented)
   */
  protected  scala.Option<java.lang.String> baseScope ()  { throw new RuntimeException(); }
  /**
   * Checks whether the 'time' is valid wrt slideDuration for generating RDD.
   * Additionally it also ensures valid times are in strictly increasing order.
   * This ensures that InputDStream.compute() is called strictly on increasing
   * times.
   * @param time (undocumented)
   * @return (undocumented)
   */
    boolean isTimeValid (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<?>> dependencies ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration ()  { throw new RuntimeException(); }
  /** Method called to start receiving data. Subclasses must implement this method. */
  public abstract  void start ()  ;
  /** Method called to stop receiving data. Subclasses must implement this method. */
  public abstract  void stop ()  ;
}
