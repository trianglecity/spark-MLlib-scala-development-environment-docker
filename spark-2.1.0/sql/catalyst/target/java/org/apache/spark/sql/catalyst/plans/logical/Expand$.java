package org.apache.spark.sql.catalyst.plans.logical;
public  class Expand$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Expand$ MODULE$ = null;
  public   Expand$ ()  { throw new RuntimeException(); }
  /**
   * Extract attribute set according to the grouping id.
   * <p>
   * @param bitmask bitmask to represent the selected of the attribute sequence
   * @param attrs the attributes in sequence
   * @return the attributes of non selected specified via bitmask (with the bit set to 1)
   */
  private  org.apache.spark.sql.catalyst.expressions.AttributeSet buildNonSelectAttrSet (int bitmask, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> attrs)  { throw new RuntimeException(); }
  /**
   * Apply the all of the GroupExpressions to every input row, hence we will get
   * multiple output rows for an input row.
   * <p>
   * @param bitmasks The bitmask set represents the grouping sets
   * @param groupByAliases The aliased original group by expressions
   * @param groupByAttrs The attributes of aliased group by expressions
   * @param gid Attribute of the grouping id
   * @param child Child operator
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.Expand apply (scala.collection.Seq<java.lang.Object> bitmasks, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias> groupByAliases, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupByAttrs, org.apache.spark.sql.catalyst.expressions.Attribute gid, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
}
