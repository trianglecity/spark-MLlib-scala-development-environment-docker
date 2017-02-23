package org.apache.spark.graphx.impl;
/**
 * A typeclass for subclasses of <code>VertexPartitionBase</code> representing the ability to wrap them in a
 * <code>VertexPartitionBaseOps</code>.
 */
  interface VertexPartitionBaseOpsConstructor<T extends org.apache.spark.graphx.impl.VertexPartitionBase<java.lang.Object>> {
  public <VD extends java.lang.Object> org.apache.spark.graphx.impl.VertexPartitionBaseOps<VD, T> toOps (T partition, scala.reflect.ClassTag<VD> evidence$4)  ;
}
