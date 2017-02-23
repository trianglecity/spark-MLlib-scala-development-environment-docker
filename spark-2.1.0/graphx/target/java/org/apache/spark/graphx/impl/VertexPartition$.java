package org.apache.spark.graphx.impl;
public  class VertexPartition$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final VertexPartition$ MODULE$ = null;
  public   VertexPartition$ ()  { throw new RuntimeException(); }
  /** Construct a `VertexPartition` from the given vertices. */
  public <VD extends java.lang.Object> org.apache.spark.graphx.impl.VertexPartition<VD> apply (scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD>> iter, scala.reflect.ClassTag<VD> evidence$1)  { throw new RuntimeException(); }
  /**
   * Implicit conversion to allow invoking <code>VertexPartitionBase</code> operations directly on a
   * <code>VertexPartition</code>.
   * @param partition (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <VD extends java.lang.Object> org.apache.spark.graphx.impl.VertexPartitionOps<VD> partitionToOps (org.apache.spark.graphx.impl.VertexPartition<VD> partition, scala.reflect.ClassTag<VD> evidence$2)  { throw new RuntimeException(); }
}
