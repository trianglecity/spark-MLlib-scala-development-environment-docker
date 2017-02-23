package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A relation with one row. This is used in "SELECT ..." without a from clause.
 */
public  class OneRowRelation$ extends org.apache.spark.sql.catalyst.plans.logical.LeafNode implements scala.Product, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OneRowRelation$ MODULE$ = null;
  public   OneRowRelation$ ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxRows ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  /**
   * Computes {@link Statistics} for this plan. The default implementation assumes the output
   * cardinality is the product of of all child plan's cardinality, i.e. applies in the case
   * of cartesian joins.
   * <p>
   * {@link LeafNode}s must override this.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics statistics ()  { throw new RuntimeException(); }
}
