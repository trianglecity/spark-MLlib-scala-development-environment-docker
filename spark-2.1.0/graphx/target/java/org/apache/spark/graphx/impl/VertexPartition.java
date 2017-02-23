package org.apache.spark.graphx.impl;
/** A map from vertex id to vertex attribute. */
  class VertexPartition<VD extends java.lang.Object> extends org.apache.spark.graphx.impl.VertexPartitionBase<VD> {
  /**
   * Implicit evidence that <code>VertexPartition</code> is a member of the <code>VertexPartitionBaseOpsConstructor</code>
   * typeclass. This enables invoking <code>VertexPartitionBase</code> operations on a <code>VertexPartition</code> via an
   * evidence parameter, as in {@link VertexPartitionBaseOps}.
   */
  static public  class VertexPartitionOpsConstructor$ implements org.apache.spark.graphx.impl.VertexPartitionBaseOpsConstructor<org.apache.spark.graphx.impl.VertexPartition> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final VertexPartitionOpsConstructor$ MODULE$ = null;
    public   VertexPartitionOpsConstructor$ ()  { throw new RuntimeException(); }
    public <VD extends java.lang.Object> org.apache.spark.graphx.impl.VertexPartitionBaseOps<VD, org.apache.spark.graphx.impl.VertexPartition> toOps (org.apache.spark.graphx.impl.VertexPartition<VD> partition, scala.reflect.ClassTag<VD> evidence$3)  { throw new RuntimeException(); }
  }
  /** Construct a `VertexPartition` from the given vertices. */
  static public <VD extends java.lang.Object> org.apache.spark.graphx.impl.VertexPartition<VD> apply (scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD>> iter, scala.reflect.ClassTag<VD> evidence$1)  { throw new RuntimeException(); }
  /**
   * Implicit conversion to allow invoking <code>VertexPartitionBase</code> operations directly on a
   * <code>VertexPartition</code>.
   * @param partition (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  static public <VD extends java.lang.Object> org.apache.spark.graphx.impl.VertexPartitionOps<VD> partitionToOps (org.apache.spark.graphx.impl.VertexPartition<VD> partition, scala.reflect.ClassTag<VD> evidence$2)  { throw new RuntimeException(); }
  static public  int capacity ()  { throw new RuntimeException(); }
  static public  int size ()  { throw new RuntimeException(); }
  static public  boolean isDefined (long vid)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD>> iterator ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.OpenHashSet<java.lang.Object> index ()  { throw new RuntimeException(); }
  public  java.lang.Object values ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.BitSet mask ()  { throw new RuntimeException(); }
  // not preceding
  public   VertexPartition (org.apache.spark.util.collection.OpenHashSet<java.lang.Object> index, java.lang.Object values, org.apache.spark.util.collection.BitSet mask, scala.reflect.ClassTag<VD> evidence$4)  { throw new RuntimeException(); }
}
