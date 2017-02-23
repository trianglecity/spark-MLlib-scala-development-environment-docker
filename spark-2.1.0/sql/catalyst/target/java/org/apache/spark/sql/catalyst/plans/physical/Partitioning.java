package org.apache.spark.sql.catalyst.plans.physical;
/**
 * Describes how an operator's output is split across partitions. The <code>compatibleWith</code>,
 * <code>guarantees</code>, and <code>satisfies</code> methods describe relationships between child partitionings,
 * target partitionings, and {@link Distribution}s. These relations are described more precisely in
 * their individual method docs, but at a high level:
 * <p>
 *  - <code>satisfies</code> is a relationship between partitionings and distributions.
 *  - <code>compatibleWith</code> is relationships between an operator's child output partitionings.
 *  - <code>guarantees</code> is a relationship between a child's existing output partitioning and a target
 *     output partitioning.
 * <p>
 *  Diagrammatically:
 * <p>
 *            +--------------+
 *            | Distribution |
 *            +--------------+
 *                    ^
 *                    |
 *               satisfies
 *                    |
 *            +--------------+                  +--------------+
 *            |    Child     |                  |    Target    |
 *       +----| Partitioning |----guarantees--->| Partitioning |
 *       |    +--------------+                  +--------------+
 *       |            ^
 *       |            |
 *       |     compatibleWith
 *       |            |
 *       +------------+
 * <p>
 */
public  interface Partitioning {
  /** Returns the number of partitions that the data is split across */
  public  int numPartitions ()  ;
  /**
   * Returns true iff the guarantees made by this {@link Partitioning} are sufficient
   * to satisfy the partitioning scheme mandated by the <code>required</code> {@link Distribution},
   * i.e. the current dataset does not need to be re-partitioned for the <code>required</code>
   * Distribution (it is possible that tuples within a partition need to be reorganized).
   * @param required (undocumented)
   * @return (undocumented)
   */
  public  boolean satisfies (org.apache.spark.sql.catalyst.plans.physical.Distribution required)  ;
  /**
   * Returns true iff we can say that the partitioning scheme of this {@link Partitioning}
   * guarantees the same partitioning scheme described by <code>other</code>.
   * <p>
   * Compatibility of partitionings is only checked for operators that have multiple children
   * and that require a specific child output {@link Distribution}, such as joins.
   * <p>
   * Intuitively, partitionings are compatible if they route the same partitioning key to the same
   * partition. For instance, two hash partitionings are only compatible if they produce the same
   * number of output partitionings and hash records according to the same hash function and
   * same partitioning key schema.
   * <p>
   * Put another way, two partitionings are compatible with each other if they satisfy all of the
   * same distribution guarantees.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  boolean compatibleWith (org.apache.spark.sql.catalyst.plans.physical.Partitioning other)  ;
  /**
   * Returns true iff we can say that the partitioning scheme of this {@link Partitioning} guarantees
   * the same partitioning scheme described by <code>other</code>. If a <code>A.guarantees(B)</code>, then repartitioning
   * the child's output according to <code>B</code> will be unnecessary. <code>guarantees</code> is used as a performance
   * optimization to allow the exchange planner to avoid redundant repartitionings. By default,
   * a partitioning only guarantees partitionings that are equal to itself (i.e. the same number
   * of partitions, same strategy (range or hash), etc).
   * <p>
   * In order to enable more aggressive optimization, this strict equality check can be relaxed.
   * For example, say that the planner needs to repartition all of an operator's children so that
   * they satisfy the {@link AllTuples} distribution. One way to do this is to repartition all children
   * to have the {@link SinglePartition} partitioning. If one of the operator's children already happens
   * to be hash-partitioned with a single partition then we do not need to re-shuffle this child;
   * this repartitioning can be avoided if a single-partition {@link HashPartitioning} <code>guarantees</code>
   * {@link SinglePartition}.
   * <p>
   * The SinglePartition example given above is not particularly interesting; guarantees' real
   * value occurs for more advanced partitioning strategies. SPARK-7871 will introduce a notion
   * of null-safe partitionings, under which partitionings can specify whether rows whose
   * partitioning keys contain null values will be grouped into the same partition or whether they
   * will have an unknown / random distribution. If a partitioning does not require nulls to be
   * clustered then a partitioning which _does_ cluster nulls will guarantee the null clustered
   * partitioning. The converse is not true, however: a partitioning which clusters nulls cannot
   * be guaranteed by one which does not cluster them. Thus, in general <code>guarantees</code> is not a
   * symmetric relation.
   * <p>
   * Another way to think about <code>guarantees</code>: if <code>A.guarantees(B)</code>, then any partitioning of rows
   * produced by <code>A</code> could have also been produced by <code>B</code>.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  boolean guarantees (org.apache.spark.sql.catalyst.plans.physical.Partitioning other)  ;
}
