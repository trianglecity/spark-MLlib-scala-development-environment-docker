package org.apache.spark.sql.catalyst.expressions;
/**
 * Rewrites an expression using rules that are guaranteed preserve the result while attempting
 * to remove cosmetic variations. Deterministic expressions that are <code>equal</code> after canonicalization
 * will always return the same answer given the same input (i.e. false positives should not be
 * possible). However, it is possible that two canonical expressions that are not equal will in fact
 * return the same answer given any input (i.e. false negatives are possible).
 * <p>
 * The following rules are applied:
 *  - Names and nullability hints for {@link org.apache.spark.sql.types.DataType}s are stripped.
 *  - Commutative and associative operations ({@link Add} and {@link Multiply}) have their children ordered
 *    by <code>hashCode</code>.
 *  - {@link EqualTo} and {@link EqualNullSafe} are reordered by <code>hashCode</code>.
 *  - Other comparisons ({@link GreaterThan}, {@link LessThan}) are reversed by <code>hashCode</code>.
 */
public  class Canonicalize {
  static public  org.apache.spark.sql.catalyst.expressions.Expression execute (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  /** Remove names and nullability from types. */
  static private  org.apache.spark.sql.catalyst.expressions.Expression ignoreNamesTypes (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  /** Collects adjacent commutative operations. */
  static private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> gatherCommutative (org.apache.spark.sql.catalyst.expressions.Expression e, scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> f)  { throw new RuntimeException(); }
  /** Orders a set of commutative operations by their hash code. */
  static private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> orderCommutative (org.apache.spark.sql.catalyst.expressions.Expression e, scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> f)  { throw new RuntimeException(); }
  /** Rearrange expressions that are commutative or associative. */
  static private  org.apache.spark.sql.catalyst.expressions.Expression expressionReorder (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
}
