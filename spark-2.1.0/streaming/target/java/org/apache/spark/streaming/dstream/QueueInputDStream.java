package org.apache.spark.streaming.dstream;
  class QueueInputDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.InputDStream<T> {
  public  scala.collection.mutable.Queue<org.apache.spark.rdd.RDD<T>> queue ()  { throw new RuntimeException(); }
  // not preceding
  public   QueueInputDStream (org.apache.spark.streaming.StreamingContext ssc, scala.collection.mutable.Queue<org.apache.spark.rdd.RDD<T>> queue, boolean oneAtATime, org.apache.spark.rdd.RDD<T> defaultRDD, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream in)  { throw new RuntimeException(); }
  private  void writeObject (java.io.ObjectOutputStream oos)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<T>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
}
