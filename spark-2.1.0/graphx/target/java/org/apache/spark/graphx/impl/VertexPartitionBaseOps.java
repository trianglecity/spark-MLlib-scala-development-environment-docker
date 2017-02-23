package org.apache.spark.graphx.impl;
/**
 * A class containing additional operations for subclasses of VertexPartitionBase that provide
 * implicit evidence of membership in the <code>VertexPartitionBaseOpsConstructor</code> typeclass (for
 * example, <code>VertexPartition.VertexPartitionOpsConstructor</code>).
 */
 abstract class VertexPartitionBaseOps<VD extends java.lang.Object, Self extends org.apache.spark.graphx.impl.VertexPartitionBase<java.lang.Object>> implements scala.Serializable, org.apache.spark.internal.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeDef(Modifiers(PARAM), TypeName("X"), List(), TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree())))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.graphx.impl.VertexPartitionBase), List(TypeTree().setOriginal(Ident(TypeName("X"))))))))
  public   VertexPartitionBaseOps (Self self, scala.reflect.ClassTag<VD> evidence$1, org.apache.spark.graphx.impl.VertexPartitionBaseOpsConstructor<Self> evidence$2)  { throw new RuntimeException(); }
  public abstract  Self withIndex (org.apache.spark.util.collection.OpenHashSet<java.lang.Object> index)  ;
  public abstract <VD2 extends java.lang.Object> Self withValues (java.lang.Object values, scala.reflect.ClassTag<VD2> evidence$3)  ;
  public abstract  Self withMask (org.apache.spark.util.collection.BitSet mask)  ;
  /**
   * Pass each vertex attribute along with the vertex id through a map
   * function and retain the original RDD's partitioning and index.
   * <p>
   * @tparam VD2 the type returned by the map function
   * <p>
   * @param f the function applied to each vertex id and vertex
   * attribute in the RDD
   * <p>
   * @return a new VertexPartition with values obtained by applying <code>f</code> to
   * each of the entries in the original VertexRDD.  The resulting
   * VertexPartition retains the same index.
   * @param evidence$4 (undocumented)
   */
  public <VD2 extends java.lang.Object> Self map (scala.Function2<java.lang.Object, VD, VD2> f, scala.reflect.ClassTag<VD2> evidence$4)  { throw new RuntimeException(); }
  /**
   * Restrict the vertex set to the set of vertices satisfying the given predicate.
   * <p>
   * @param pred the user defined predicate
   * <p>
   * @note The vertex set preserves the original index structure which means that the returned
   *       RDD can be easily joined with the original vertex-set. Furthermore, the filter only
   *       modifies the bitmap index and so no new values are allocated.
   * @return (undocumented)
   */
  public  Self filter (scala.Function2<java.lang.Object, VD, java.lang.Object> pred)  { throw new RuntimeException(); }
  /** Hides the VertexId's that are the same between `this` and `other`. */
  public  Self minus (Self other)  { throw new RuntimeException(); }
  /** Hides the VertexId's that are the same between `this` and `other`. */
  public  Self minus (scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD>> other)  { throw new RuntimeException(); }
  /**
   * Hides vertices that are the same between this and other. For vertices that are different, keeps
   * the values from <code>other</code>. The indices of <code>this</code> and <code>other</code> must be the same.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  Self diff (Self other)  { throw new RuntimeException(); }
  /** Left outer join another VertexPartition. */
  public <VD2 extends java.lang.Object, VD3 extends java.lang.Object> Self leftJoin (Self other, scala.Function3<java.lang.Object, VD, scala.Option<VD2>, VD3> f, scala.reflect.ClassTag<VD2> evidence$5, scala.reflect.ClassTag<VD3> evidence$6)  { throw new RuntimeException(); }
  /** Left outer join another iterator of messages. */
  public <VD2 extends java.lang.Object, VD3 extends java.lang.Object> Self leftJoin (scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD2>> other, scala.Function3<java.lang.Object, VD, scala.Option<VD2>, VD3> f, scala.reflect.ClassTag<VD2> evidence$7, scala.reflect.ClassTag<VD3> evidence$8)  { throw new RuntimeException(); }
  /** Inner join another VertexPartition. */
  public <U extends java.lang.Object, VD2 extends java.lang.Object> Self innerJoin (Self other, scala.Function3<java.lang.Object, VD, U, VD2> f, scala.reflect.ClassTag<U> evidence$9, scala.reflect.ClassTag<VD2> evidence$10)  { throw new RuntimeException(); }
  /**
   * Inner join an iterator of messages.
   * @param iter (undocumented)
   * @param f (undocumented)
   * @param evidence$11 (undocumented)
   * @param evidence$12 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object, VD2 extends java.lang.Object> Self innerJoin (scala.collection.Iterator<scala.Product2<java.lang.Object, U>> iter, scala.Function3<java.lang.Object, VD, U, VD2> f, scala.reflect.ClassTag<U> evidence$11, scala.reflect.ClassTag<VD2> evidence$12)  { throw new RuntimeException(); }
  /**
   * Similar effect as aggregateUsingIndex((a, b) =&gt; a)
   * @param iter (undocumented)
   * @param evidence$13 (undocumented)
   * @return (undocumented)
   */
  public <VD2 extends java.lang.Object> Self createUsingIndex (scala.collection.Iterator<scala.Product2<java.lang.Object, VD2>> iter, scala.reflect.ClassTag<VD2> evidence$13)  { throw new RuntimeException(); }
  /**
   * Similar to innerJoin, but vertices from the left side that don't appear in iter will remain in
   * the partition, hidden by the bitmask.
   * @param iter (undocumented)
   * @return (undocumented)
   */
  public  Self innerJoinKeepLeft (scala.collection.Iterator<scala.Product2<java.lang.Object, VD>> iter)  { throw new RuntimeException(); }
  public <VD2 extends java.lang.Object> Self aggregateUsingIndex (scala.collection.Iterator<scala.Product2<java.lang.Object, VD2>> iter, scala.Function2<VD2, VD2, VD2> reduceFunc, scala.reflect.ClassTag<VD2> evidence$14)  { throw new RuntimeException(); }
  /**
   * Construct a new VertexPartition whose index contains only the vertices in the mask.
   * @return (undocumented)
   */
  public  Self reindex ()  { throw new RuntimeException(); }
  /**
   * Converts a vertex partition (in particular, one of type <code>Self</code>) into a
   * <code>VertexPartitionBaseOps</code>. Within this class, this allows chaining the methods defined above,
   * because these methods return a <code>Self</code> and this implicit conversion re-wraps that in a
   * <code>VertexPartitionBaseOps</code>. This relies on the context bound on <code>Self</code>.
   * @param partition (undocumented)
   * @param evidence$15 (undocumented)
   * @return (undocumented)
   */
  private <VD2 extends java.lang.Object> org.apache.spark.graphx.impl.VertexPartitionBaseOps<VD2, Self> toOps (Self partition, scala.reflect.ClassTag<VD2> evidence$15)  { throw new RuntimeException(); }
}
