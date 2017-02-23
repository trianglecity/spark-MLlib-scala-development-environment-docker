package org.apache.spark.streaming.api.java;
/**
 * A Java-friendly interface to {@link org.apache.spark.streaming.dstream.ReceiverInputDStream}, the
 * abstract class for defining any input stream that receives data over the network.
 */
public  class JavaReceiverInputDStream<T extends java.lang.Object> extends org.apache.spark.streaming.api.java.JavaInputDStream<T> {
  /**
   * Convert a scala {@link org.apache.spark.streaming.dstream.ReceiverInputDStream} to a Java-friendly
   * {@link org.apache.spark.streaming.api.java.JavaReceiverInputDStream}.
   * @param receiverInputDStream (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaReceiverInputDStream<T> fromReceiverInputDStream (org.apache.spark.streaming.dstream.ReceiverInputDStream<T> receiverInputDStream, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<java.lang.Long> scalaIntToJavaLong (org.apache.spark.streaming.dstream.DStream<java.lang.Object> in)  { throw new RuntimeException(); }
  static public  void print ()  { throw new RuntimeException(); }
  static public  void print (int num)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<java.lang.Long> count ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaPairDStream<T, java.lang.Long> countByValue ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaPairDStream<T, java.lang.Long> countByValue (int numPartitions)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<java.lang.Long> countByWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaPairDStream<T, java.lang.Long> countByValueAndWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaPairDStream<T, java.lang.Long> countByValueAndWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, int numPartitions)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<java.util.List<T>> glom ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.StreamingContext context ()  { throw new RuntimeException(); }
  static public <R extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<R> map (org.apache.spark.api.java.function.Function<T, R> f)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> mapToPair (org.apache.spark.api.java.function.PairFunction<T, K2, V2> f)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<U> flatMap (org.apache.spark.api.java.function.FlatMapFunction<T, U> f)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> flatMapToPair (org.apache.spark.api.java.function.PairFlatMapFunction<T, K2, V2> f)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<U> mapPartitions (org.apache.spark.api.java.function.FlatMapFunction<java.util.Iterator<T>, U> f)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> mapPartitionsToPair (org.apache.spark.api.java.function.PairFlatMapFunction<java.util.Iterator<T>, K2, V2> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<T> reduce (org.apache.spark.api.java.function.Function2<T, T, T> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<T> reduceByWindow (org.apache.spark.api.java.function.Function2<T, T, T> reduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<T> reduceByWindow (org.apache.spark.api.java.function.Function2<T, T, T> reduceFunc, org.apache.spark.api.java.function.Function2<T, T, T> invReduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  static public  java.util.List<R> slice (org.apache.spark.streaming.Time fromTime, org.apache.spark.streaming.Time toTime)  { throw new RuntimeException(); }
  static public  void foreachRDD (org.apache.spark.api.java.function.VoidFunction<R> foreachFunc)  { throw new RuntimeException(); }
  static public  void foreachRDD (org.apache.spark.api.java.function.VoidFunction2<R, org.apache.spark.streaming.Time> foreachFunc)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<U> transform (org.apache.spark.api.java.function.Function<R, org.apache.spark.api.java.JavaRDD<U>> transformFunc)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<U> transform (org.apache.spark.api.java.function.Function2<R, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaRDD<U>> transformFunc)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> transformToPair (org.apache.spark.api.java.function.Function<R, org.apache.spark.api.java.JavaPairRDD<K2, V2>> transformFunc)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> transformToPair (org.apache.spark.api.java.function.Function2<R, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaPairRDD<K2, V2>> transformFunc)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<W> transformWith (org.apache.spark.streaming.api.java.JavaDStream<U> other, org.apache.spark.api.java.function.Function3<R, org.apache.spark.api.java.JavaRDD<U>, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaRDD<W>> transformFunc)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> transformWithToPair (org.apache.spark.streaming.api.java.JavaDStream<U> other, org.apache.spark.api.java.function.Function3<R, org.apache.spark.api.java.JavaRDD<U>, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaPairRDD<K2, V2>> transformFunc)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object, W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<W> transformWith (org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> other, org.apache.spark.api.java.function.Function3<R, org.apache.spark.api.java.JavaPairRDD<K2, V2>, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaRDD<W>> transformFunc)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object, K3 extends java.lang.Object, V3 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K3, V3> transformWithToPair (org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> other, org.apache.spark.api.java.function.Function3<R, org.apache.spark.api.java.JavaPairRDD<K2, V2>, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaPairRDD<K3, V3>> transformFunc)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<T> checkpoint (org.apache.spark.streaming.Duration interval)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<T> dstream ()  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<T> wrapRDD (org.apache.spark.rdd.RDD<T> rdd)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<T> filter (org.apache.spark.api.java.function.Function<T, java.lang.Boolean> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<T> cache ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<T> persist ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<T> persist (org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<T> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<T> window (org.apache.spark.streaming.Duration windowDuration)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<T> window (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<T> union (org.apache.spark.streaming.api.java.JavaDStream<T> that)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<T> repartition (int numPartitions)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.InputDStream<T> inputDStream ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.ReceiverInputDStream<T> receiverInputDStream ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<T> classTag ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaReceiverInputDStream (org.apache.spark.streaming.dstream.ReceiverInputDStream<T> receiverInputDStream, scala.reflect.ClassTag<T> classTag)  { throw new RuntimeException(); }
}
