package org.apache.spark.graphx.impl;
/**
 * Constructs an EdgePartition from an existing EdgePartition with the same vertex set. This enables
 * reuse of the local vertex ids. Intended for internal use in EdgePartition only.
 */
  class ExistingEdgePartitionBuilder<ED extends java.lang.Object, VD extends java.lang.Object> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ExistingEdgePartitionBuilder (org.apache.spark.graphx.util.collection.GraphXPrimitiveKeyOpenHashMap<java.lang.Object, java.lang.Object> global2local, long[] local2global, java.lang.Object vertexAttrs, scala.Option<org.apache.spark.util.collection.OpenHashSet<java.lang.Object>> activeSet, int size, scala.reflect.ClassTag<ED> evidence$3, scala.reflect.ClassTag<VD> evidence$4)  { throw new RuntimeException(); }
  /** Add a new edge to the partition. */
  public  void add (long src, long dst, int localSrc, int localDst, ED d)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.impl.EdgePartition<ED, VD> toEdgePartition ()  { throw new RuntimeException(); }
}
