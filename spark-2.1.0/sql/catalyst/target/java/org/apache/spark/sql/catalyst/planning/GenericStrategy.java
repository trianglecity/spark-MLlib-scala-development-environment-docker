package org.apache.spark.sql.catalyst.planning;
/**
 * Given a {@link LogicalPlan}, returns a list of <code>PhysicalPlan</code>s that can
 * be used for execution. If this strategy does not apply to the give logical operation then an
 * empty list should be returned.
 */
public abstract class GenericStrategy<PhysicalPlan extends org.apache.spark.sql.catalyst.trees.TreeNode<PhysicalPlan>> implements org.apache.spark.internal.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Select(Select(Select(Select(Select(Select(Ident(org), org.apache), org.apache.spark), org.apache.spark.sql), org.apache.spark.sql.catalyst), org.apache.spark.sql.catalyst.trees), org.apache.spark.sql.catalyst.trees.TreeNode), List(TypeTree().setOriginal(Ident(TypeName("PhysicalPlan"))))))))
  public   GenericStrategy ()  { throw new RuntimeException(); }
  /**
   * Returns a placeholder for a physical plan that executes <code>plan</code>. This placeholder will be
   * filled in automatically by the QueryPlanner using the other execution strategies that are
   * available.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  protected abstract  PhysicalPlan planLater (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
  public abstract  scala.collection.Seq<PhysicalPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
}
