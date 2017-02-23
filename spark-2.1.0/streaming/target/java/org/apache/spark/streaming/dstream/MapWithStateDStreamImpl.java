package org.apache.spark.streaming.dstream;
/** Internal implementation of the {@link MapWithStateDStream} */
  class MapWithStateDStreamImpl<KeyType extends java.lang.Object, ValueType extends java.lang.Object, StateType extends java.lang.Object, MappedType extends java.lang.Object> extends org.apache.spark.streaming.dstream.MapWithStateDStream<KeyType, ValueType, StateType, MappedType> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   MapWithStateDStreamImpl (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<KeyType, ValueType>> dataStream, org.apache.spark.streaming.StateSpecImpl<KeyType, ValueType, StateType, MappedType> spec, scala.reflect.ClassTag<KeyType> evidence$2, scala.reflect.ClassTag<ValueType> evidence$3, scala.reflect.ClassTag<StateType> evidence$4, scala.reflect.ClassTag<MappedType> evidence$5)  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.dstream.InternalMapWithStateDStream<KeyType, ValueType, StateType, MappedType> internalStream ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<?>> dependencies ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<MappedType>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
  /**
   * Forward the checkpoint interval to the internal DStream that computes the state maps. This
   * to make sure that this DStream does not get checkpointed, only the internal stream.
   * @param checkpointInterval (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<MappedType> checkpoint (org.apache.spark.streaming.Duration checkpointInterval)  { throw new RuntimeException(); }
  /** Return a pair DStream where each RDD is the snapshot of the state of all the keys. */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<KeyType, StateType>> stateSnapshots ()  { throw new RuntimeException(); }
  public  java.lang.Class<?> keyClass ()  { throw new RuntimeException(); }
  public  java.lang.Class<?> valueClass ()  { throw new RuntimeException(); }
  public  java.lang.Class<?> stateClass ()  { throw new RuntimeException(); }
  public  java.lang.Class<?> mappedClass ()  { throw new RuntimeException(); }
}
