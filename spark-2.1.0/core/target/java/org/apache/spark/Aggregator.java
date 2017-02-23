package org.apache.spark;
/**
 * :: DeveloperApi ::
 * A set of functions used to aggregate data.
 * <p>
 * param:  createCombiner function to create the initial value of the aggregation.
 * param:  mergeValue function to merge a new value into the aggregation result.
 * param:  mergeCombiners function to merge outputs from multiple mergeValue function.
 */
public  class Aggregator<K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.Function1<V, C> createCombiner ()  { throw new RuntimeException(); }
  public  scala.Function2<C, V, C> mergeValue ()  { throw new RuntimeException(); }
  public  scala.Function2<C, C, C> mergeCombiners ()  { throw new RuntimeException(); }
  // not preceding
  public   Aggregator (scala.Function1<V, C> createCombiner, scala.Function2<C, V, C> mergeValue, scala.Function2<C, C, C> mergeCombiners)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<K, C>> combineValuesByKey (scala.collection.Iterator<? extends scala.Product2<K, V>> iter, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<K, C>> combineCombinersByKey (scala.collection.Iterator<? extends scala.Product2<K, C>> iter, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /** Update task metrics after populating the external map. */
  private  void updateMetrics (org.apache.spark.TaskContext context, org.apache.spark.util.collection.ExternalAppendOnlyMap<?, ?, ?> map)  { throw new RuntimeException(); }
}
