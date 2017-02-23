package org.apache.spark.sql.catalyst.analysis;
/**
 * Thrown when an invalid attempt is made to access a property of a tree that has yet to be fully
 * resolved.
 */
public  class UnresolvedException<TreeType extends org.apache.spark.sql.catalyst.trees.TreeNode<?>> extends org.apache.spark.sql.catalyst.errors.TreeNodeException<TreeType> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(ExistentialTypeTree(AppliedTypeTree(Select(Select(Select(Select(Select(Select(Ident(org), org.apache), org.apache.spark), org.apache.spark.sql), org.apache.spark.sql.catalyst), org.apache.spark.sql.catalyst.trees), org.apache.spark.sql.catalyst.trees.TreeNode), List(TypeTree().setOriginal(Ident(TypeName("_$1"))))), List(TypeDef(Modifiers(DEFERRED | SYNTHETIC), TypeName("_$1"), List(), TypeBoundsTree(EmptyTree, EmptyTree)))))))
  public   UnresolvedException (TreeType tree, java.lang.String function)  { throw new RuntimeException(); }
}
