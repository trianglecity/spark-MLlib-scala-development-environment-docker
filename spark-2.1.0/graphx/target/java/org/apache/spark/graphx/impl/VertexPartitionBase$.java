package org.apache.spark.graphx.impl;
public  class VertexPartitionBase$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final VertexPartitionBase$ MODULE$ = null;
  public   VertexPartitionBase$ ()  { throw new RuntimeException(); }
  /**
   * Construct the constituents of a VertexPartitionBase from the given vertices, merging duplicate
   * entries arbitrarily.
   * @param iter (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public <VD extends java.lang.Object> scala.Tuple3<org.apache.spark.util.collection.OpenHashSet<java.lang.Object>, java.lang.Object, org.apache.spark.util.collection.BitSet> initFrom (scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD>> iter, scala.reflect.ClassTag<VD> evidence$1)  { throw new RuntimeException(); }
  /**
   * Construct the constituents of a VertexPartitionBase from the given vertices, merging duplicate
   * entries using <code>mergeFunc</code>.
   * @param iter (undocumented)
   * @param mergeFunc (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <VD extends java.lang.Object> scala.Tuple3<org.apache.spark.util.collection.OpenHashSet<java.lang.Object>, java.lang.Object, org.apache.spark.util.collection.BitSet> initFrom (scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD>> iter, scala.Function2<VD, VD, VD> mergeFunc, scala.reflect.ClassTag<VD> evidence$2)  { throw new RuntimeException(); }
}
