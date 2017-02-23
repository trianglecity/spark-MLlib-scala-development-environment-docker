package org.apache.spark.sql.catalyst.rules;
public abstract class Rule<TreeType extends org.apache.spark.sql.catalyst.trees.TreeNode<?>> implements org.apache.spark.internal.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(ExistentialTypeTree(AppliedTypeTree(Select(Select(Select(Select(Select(Select(Ident(org), org.apache), org.apache.spark), org.apache.spark.sql), org.apache.spark.sql.catalyst), org.apache.spark.sql.catalyst.trees), org.apache.spark.sql.catalyst.trees.TreeNode), List(TypeTree().setOriginal(Ident(TypeName("_$1"))))), List(TypeDef(Modifiers(DEFERRED | SYNTHETIC), TypeName("_$1"), List(), TypeBoundsTree(EmptyTree, EmptyTree)))))))
  public   Rule ()  { throw new RuntimeException(); }
  /** Name for this rule, automatically inferred based on class name. */
  public  java.lang.String ruleName ()  { throw new RuntimeException(); }
  public abstract  TreeType apply (TreeType plan)  ;
}
