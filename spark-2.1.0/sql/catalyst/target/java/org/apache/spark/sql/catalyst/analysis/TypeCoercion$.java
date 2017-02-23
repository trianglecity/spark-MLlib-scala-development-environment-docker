package org.apache.spark.sql.catalyst.analysis;
/**
 * A collection of {@link Rule} that can be used to coerce differing types that participate in
 * operations into compatible ones.
 * <p>
 * Notes about type widening / tightest common types: Broadly, there are two cases when we need
 * to widen data types (e.g. union, binary comparison). In case 1, we are looking for a common
 * data type for two or more data types, and in this case no loss of precision is allowed. Examples
 * include type inference in JSON (e.g. what's the column's data type if one row is an integer
 * while the other row is a long?). In case 2, we are looking for a widened data type with
 * some acceptable loss of precision (e.g. there is no common type for double and decimal because
 * double's range is larger than decimal, and yet decimal is more precise than double, but in
 * union we would cast the decimal into double).
 */
public  class TypeCoercion$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TypeCoercion$ MODULE$ = null;
  public   TypeCoercion$ ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> typeCoercionRules ()  { throw new RuntimeException(); }
  public  scala.collection.IndexedSeq<org.apache.spark.sql.types.NumericType> numericPrecedence ()  { throw new RuntimeException(); }
  /**
   * Case 1 type widening (see the classdoc comment above for TypeCoercion).
   * <p>
   * Find the tightest common type of two types that might be used in a binary expression.
   * This handles all numeric types except fixed-precision decimals interacting with each other or
   * with primitive types, because in that case the precision and scale of the result depends on
   * the operation. Those rules are implemented in {@link DecimalPrecision}.
   * @return (undocumented)
   */
  public  scala.Function2<org.apache.spark.sql.types.DataType, org.apache.spark.sql.types.DataType, scala.Option<org.apache.spark.sql.types.DataType>> findTightestCommonTypeOfTwo ()  { throw new RuntimeException(); }
  /** Similar to {@link findTightestCommonType}, but can promote all the way to StringType. */
  public  scala.Option<org.apache.spark.sql.types.DataType> findTightestCommonTypeToString (org.apache.spark.sql.types.DataType left, org.apache.spark.sql.types.DataType right)  { throw new RuntimeException(); }
  /**
   * Find the tightest common type of a set of types by continuously applying
   * <code>findTightestCommonTypeOfTwo</code> on these types.
   * @param types (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<org.apache.spark.sql.types.DataType> findTightestCommonType (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
  /**
   * Case 2 type widening (see the classdoc comment above for TypeCoercion).
   * <p>
   * i.e. the main difference with {@link findTightestCommonTypeOfTwo} is that here we allow some
   * loss of precision when widening decimal and double.
   * @param t1 (undocumented)
   * @param t2 (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeForTwo (org.apache.spark.sql.types.DataType t1, org.apache.spark.sql.types.DataType t2)  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.types.DataType> findWiderCommonType (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
  /**
   * Similar to {@link findWiderCommonType}, but can't promote to string. This is also similar to
   * {@link findTightestCommonType}, but can handle decimal types. If the wider decimal type exceeds
   * system limitation, this rule will truncate the decimal type before return it.
   * @param types (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeWithoutStringPromotion (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
  private  boolean haveSameType (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
}
