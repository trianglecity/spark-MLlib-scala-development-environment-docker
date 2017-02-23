package org.apache.spark.sql.catalyst.expressions;
public  class PredicateSubquery$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PredicateSubquery$ MODULE$ = null;
  public   PredicateSubquery$ ()  { throw new RuntimeException(); }
  public  boolean hasPredicateSubquery (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  /**
   * Returns whether there are any null-aware predicate subqueries inside Not. If not, we could
   * turn the null-aware predicate into not-null-aware predicate.
   * @param e (undocumented)
   * @return (undocumented)
   */
  public  boolean hasNullAwarePredicateWithinNot (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
}
