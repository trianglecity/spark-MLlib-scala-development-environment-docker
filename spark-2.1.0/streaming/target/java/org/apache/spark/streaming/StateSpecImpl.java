package org.apache.spark.streaming;
/** Internal implementation of {@link org.apache.spark.streaming.StateSpec} interface. */
  class StateSpecImpl<K extends java.lang.Object, V extends java.lang.Object, S extends java.lang.Object, T extends java.lang.Object> extends org.apache.spark.streaming.StateSpec<K, V, S, T> implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.Function4<org.apache.spark.streaming.Time, K, scala.Option<V>, org.apache.spark.streaming.State<S>, scala.Option<T>> function ()  { throw new RuntimeException(); }
  // not preceding
  public   StateSpecImpl (scala.Function4<org.apache.spark.streaming.Time, K, scala.Option<V>, org.apache.spark.streaming.State<S>, scala.Option<T>> function)  { throw new RuntimeException(); }
  private  org.apache.spark.Partitioner partitioner ()  { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDD<scala.Tuple2<K, S>> initialStateRDD ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.Duration timeoutInterval ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.StateSpecImpl<K, V, S, T> initialState (org.apache.spark.rdd.RDD<scala.Tuple2<K, S>> rdd)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.StateSpecImpl<K, V, S, T> initialState (org.apache.spark.api.java.JavaPairRDD<K, S> javaPairRDD)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.StateSpecImpl<K, V, S, T> numPartitions (int numPartitions)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.StateSpecImpl<K, V, S, T> partitioner (org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.StateSpecImpl<K, V, S, T> timeout (org.apache.spark.streaming.Duration interval)  { throw new RuntimeException(); }
    scala.Function4<org.apache.spark.streaming.Time, K, scala.Option<V>, org.apache.spark.streaming.State<S>, scala.Option<T>> getFunction ()  { throw new RuntimeException(); }
    scala.Option<org.apache.spark.rdd.RDD<scala.Tuple2<K, S>>> getInitialStateRDD ()  { throw new RuntimeException(); }
    scala.Option<org.apache.spark.Partitioner> getPartitioner ()  { throw new RuntimeException(); }
    scala.Option<org.apache.spark.streaming.Duration> getTimeoutInterval ()  { throw new RuntimeException(); }
}
