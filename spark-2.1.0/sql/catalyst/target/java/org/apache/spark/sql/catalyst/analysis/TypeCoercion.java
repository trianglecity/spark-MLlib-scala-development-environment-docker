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
public  class TypeCoercion {
  /**
   * Applies any changes to {@link AttributeReference} data types that are made by other rules to
   * instances higher in the query tree.
   */
  static public  class PropagateTypes$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PropagateTypes$ MODULE$ = null;
    public   PropagateTypes$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Widens numeric types and converts strings to numbers when appropriate.
   * <p>
   * Loosely based on rules from "Hadoop: The Definitive Guide" 2nd edition, by Tom White
   * <p>
   * The implicit conversion rules can be summarized as follows:
   *   - Any integral numeric type can be implicitly converted to a wider type.
   *   - All the integral numeric types, FLOAT, and (perhaps surprisingly) STRING can be implicitly
   *     converted to DOUBLE.
   *   - TINYINT, SMALLINT, and INT can all be converted to FLOAT.
   *   - BOOLEAN types cannot be converted to any other type.
   *   - Any integral numeric type can be implicitly converted to decimal type.
   *   - two different decimal types will be converted into a wider decimal type for both of them.
   *   - decimal type will be converted into double if there float or double together with it.
   * <p>
   * Additionally, all types when UNION-ed with strings will be promoted to strings.
   * Other string conversions are handled by PromoteStrings.
   * <p>
   * Widening types might result in loss of precision in the following cases:
   * - IntegerType to FloatType
   * - LongType to FloatType
   * - LongType to DoubleType
   * - DecimalType to Double
   * <p>
   * This rule is only applied to Union/Except/Intersect
   */
  static public  class WidenSetOperationTypes$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final WidenSetOperationTypes$ MODULE$ = null;
    public   WidenSetOperationTypes$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    /** Build new children with the widest types for each attribute among all the children */
    private  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> buildNewChildrenWithWiderTypes (scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children)  { throw new RuntimeException(); }
    /** Get the widest type for each attribute in all the children */
    private  scala.collection.Seq<org.apache.spark.sql.types.DataType> getWidestTypes (scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children, int attrIndex, scala.collection.mutable.Queue<org.apache.spark.sql.types.DataType> castedTypes)  { throw new RuntimeException(); }
    /** Given a plan, add an extra project on top to widen some columns' data types. */
    private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan widenTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.Seq<org.apache.spark.sql.types.DataType> targetTypes)  { throw new RuntimeException(); }
  }
  /**
   * Promotes strings that appear in arithmetic expressions.
   */
  static public  class PromoteStrings$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PromoteStrings$ MODULE$ = null;
    public   PromoteStrings$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Convert the value and in list expressions to the common operator type
   * by looking at all the argument types and finding the closest one that
   * all the arguments can be cast to. When no common operator type is found
   * the original expression will be returned and an Analysis Exception will
   * be raised at type checking phase.
   */
  static public  class InConversion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final InConversion$ MODULE$ = null;
    public   InConversion$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Changes numeric values to booleans so that expressions like true = 1 can be evaluated.
   */
  static public  class BooleanEquality$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BooleanEquality$ MODULE$ = null;
    public   BooleanEquality$ ()  { throw new RuntimeException(); }
    private  scala.collection.Seq<java.lang.Object> trueValues ()  { throw new RuntimeException(); }
    private  scala.collection.Seq<java.lang.Object> falseValues ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * When encountering a cast from a string representing a valid fractional number to an integral
   * type the jvm will throw a <code>java.lang.NumberFormatException</code>.  Hive, in contrast, returns the
   * truncated version of this number.
   */
  static public  class StringToIntegralCasts$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StringToIntegralCasts$ MODULE$ = null;
    public   StringToIntegralCasts$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * This ensure that the types for various functions are as expected.
   */
  static public  class FunctionArgumentConversion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FunctionArgumentConversion$ MODULE$ = null;
    public   FunctionArgumentConversion$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Hive only performs integral division with the DIV operator. The arguments to / are always
   * converted to fractional types.
   */
  static public  class Division$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Division$ MODULE$ = null;
    public   Division$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    private  boolean isNumericOrNull (org.apache.spark.sql.catalyst.expressions.Expression ex)  { throw new RuntimeException(); }
  }
  /**
   * Coerces the type of different branches of a CASE WHEN statement to a common type.
   */
  static public  class CaseWhenCoercion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CaseWhenCoercion$ MODULE$ = null;
    public   CaseWhenCoercion$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Coerces the type of different branches of If statement to a common type.
   */
  static public  class IfCoercion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final IfCoercion$ MODULE$ = null;
    public   IfCoercion$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Turns Add/Subtract of DateType/TimestampType/StringType and CalendarIntervalType
   * to TimeAdd/TimeSub
   */
  static public  class DateTimeOperations$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DateTimeOperations$ MODULE$ = null;
    public   DateTimeOperations$ ()  { throw new RuntimeException(); }
    private  scala.collection.Seq<org.apache.spark.sql.types.AtomicType> acceptedTypes ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Casts types according to the expected input types for {@link Expression}s.
   */
  static public  class ImplicitTypeCasts$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ImplicitTypeCasts$ MODULE$ = null;
    public   ImplicitTypeCasts$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    /**
     * Given an expected data type, try to cast the expression and return the cast expression.
     * <p>
     * If the expression already fits the input type, we simply return the expression itself.
     * If the expression has an incompatible type that cannot be implicitly cast, return None.
     * @param e (undocumented)
     * @param expectedType (undocumented)
     * @return (undocumented)
     */
    public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> implicitCast (org.apache.spark.sql.catalyst.expressions.Expression e, org.apache.spark.sql.types.AbstractDataType expectedType)  { throw new RuntimeException(); }
  }
  static public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> typeCoercionRules ()  { throw new RuntimeException(); }
  static public  scala.collection.IndexedSeq<org.apache.spark.sql.types.NumericType> numericPrecedence ()  { throw new RuntimeException(); }
  /**
   * Case 1 type widening (see the classdoc comment above for TypeCoercion).
   * <p>
   * Find the tightest common type of two types that might be used in a binary expression.
   * This handles all numeric types except fixed-precision decimals interacting with each other or
   * with primitive types, because in that case the precision and scale of the result depends on
   * the operation. Those rules are implemented in {@link DecimalPrecision}.
   * @return (undocumented)
   */
  static public  scala.Function2<org.apache.spark.sql.types.DataType, org.apache.spark.sql.types.DataType, scala.Option<org.apache.spark.sql.types.DataType>> findTightestCommonTypeOfTwo ()  { throw new RuntimeException(); }
  /** Similar to {@link findTightestCommonType}, but can promote all the way to StringType. */
  static public  scala.Option<org.apache.spark.sql.types.DataType> findTightestCommonTypeToString (org.apache.spark.sql.types.DataType left, org.apache.spark.sql.types.DataType right)  { throw new RuntimeException(); }
  /**
   * Find the tightest common type of a set of types by continuously applying
   * <code>findTightestCommonTypeOfTwo</code> on these types.
   * @param types (undocumented)
   * @return (undocumented)
   */
  static private  scala.Option<org.apache.spark.sql.types.DataType> findTightestCommonType (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
  /**
   * Case 2 type widening (see the classdoc comment above for TypeCoercion).
   * <p>
   * i.e. the main difference with {@link findTightestCommonTypeOfTwo} is that here we allow some
   * loss of precision when widening decimal and double.
   * @param t1 (undocumented)
   * @param t2 (undocumented)
   * @return (undocumented)
   */
  static private  scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeForTwo (org.apache.spark.sql.types.DataType t1, org.apache.spark.sql.types.DataType t2)  { throw new RuntimeException(); }
  static private  scala.Option<org.apache.spark.sql.types.DataType> findWiderCommonType (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
  /**
   * Similar to {@link findWiderCommonType}, but can't promote to string. This is also similar to
   * {@link findTightestCommonType}, but can handle decimal types. If the wider decimal type exceeds
   * system limitation, this rule will truncate the decimal type before return it.
   * @param types (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeWithoutStringPromotion (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
  static private  boolean haveSameType (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
}
