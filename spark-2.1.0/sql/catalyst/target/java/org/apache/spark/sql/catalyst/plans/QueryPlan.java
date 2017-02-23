package org.apache.spark.sql.catalyst.plans;
public abstract class QueryPlan<PlanType extends org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType>> extends org.apache.spark.sql.catalyst.trees.TreeNode<PlanType> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.sql.catalyst.plans.QueryPlan), List(TypeTree().setOriginal(Ident(TypeName("PlanType"))))))))
  public   QueryPlan ()  { throw new RuntimeException(); }
  public abstract  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  ;
  /**
   * Extracts the relevant constraints from a given set of constraints based on the attributes that
   * appear in the {@link outputSet}.
   * @param constraints (undocumented)
   * @return (undocumented)
   */
  protected  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> getRelevantConstraints (scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> constraints)  { throw new RuntimeException(); }
  /**
   * Infers a set of <code>isNotNull</code> constraints from null intolerant expressions as well as
   * non-nullable attributes. For e.g., if an expression is of the form (<code>a > 5</code>), this
   * returns a constraint of the form <code>isNotNull(a)</code>
   * @param constraints (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> constructIsNotNullConstraints (scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> constraints)  { throw new RuntimeException(); }
  /**
   * Infer the Attribute-specific IsNotNull constraints from the null intolerant child expressions
   * of constraints.
   * @param constraint (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> inferIsNotNullConstraints (org.apache.spark.sql.catalyst.expressions.Expression constraint)  { throw new RuntimeException(); }
  /**
   * Recursively explores the expressions which are null intolerant and returns all attributes
   * in these expressions.
   * @param expr (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> scanNullIntolerantAttribute (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Expression> aliasMap ()  { throw new RuntimeException(); }
  /**
   * Infers an additional set of constraints from a given set of equality constraints.
   * For e.g., if an operator has constraints of the form (<code>a = 5</code>, <code>a = b</code>), this returns an
   * additional constraint of the form <code>b = 5</code>.
   * <p>
   * [SPARK-17733] We explicitly prevent producing recursive constraints of the form <code>a = f(a, b)</code>
   * as they are often useless and can lead to a non-converging set of constraints.
   * @param constraints (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> inferAdditionalConstraints (scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> constraints)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression>> generateEquivalentConstraintClasses (scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> constraints)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> getConstraintClass (org.apache.spark.sql.catalyst.expressions.Expression expr, scala.collection.Seq<scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression>> constraintClasses)  { throw new RuntimeException(); }
  private  boolean isRecursiveDeduction (org.apache.spark.sql.catalyst.expressions.Attribute attr, scala.collection.Seq<scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression>> constraintClasses)  { throw new RuntimeException(); }
  /**
   * An {@link ExpressionSet} that contains invariants about the rows output by this operator. For
   * example, if this set contains the expression <code>a = 2</code> then that expression is guaranteed to
   * evaluate to <code>true</code> for all rows produced.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.ExpressionSet constraints ()  { throw new RuntimeException(); }
  /**
   * This method can be overridden by any child class of QueryPlan to specify a set of constraints
   * based on the given operator's constraint propagation logic. These constraints are then
   * canonicalized and filtered automatically to contain only those attributes that appear in the
   * {@link outputSet}.
   * <p>
   * See {@link Canonicalize} for more details.
   * @return (undocumented)
   */
  protected  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> validConstraints ()  { throw new RuntimeException(); }
  /**
   * Returns the set of attributes that are output by this node.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet outputSet ()  { throw new RuntimeException(); }
  /**
   * All Attributes that appear in expressions from this operator.  Note that this set does not
   * include attributes that are implicitly referenced by being passed through to the output tuple.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet references ()  { throw new RuntimeException(); }
  /**
   * The set of all attributes that are input to this operator by its children.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet inputSet ()  { throw new RuntimeException(); }
  /**
   * The set of all attributes that are produced by this node.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  { throw new RuntimeException(); }
  /**
   * Attributes that are referenced by expressions but not provided by this nodes children.
   * Subclasses should override this method if they produce attributes internally as it is used by
   * assertions designed to prevent the construction of invalid plans.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet missingInput ()  { throw new RuntimeException(); }
  /**
   * Runs {@link transform} with <code>rule</code> on all expressions present in this query operator.
   * Users should not expect a specific directionality. If a specific directionality is needed,
   * transformExpressionsDown or transformExpressionsUp should be used.
   * <p>
   * @param rule the rule to be applied to every expression in this operator.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressions (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  /**
   * Runs {@link transformDown} with <code>rule</code> on all expressions present in this query operator.
   * <p>
   * @param rule the rule to be applied to every expression in this operator.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressionsDown (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  /**
   * Runs {@link transformUp} with <code>rule</code> on all expressions present in this query operator.
   * <p>
   * @param rule the rule to be applied to every expression in this operator.
   * @return
   */
  public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressionsUp (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  /**
   * Returns the result of running {@link transformExpressions} on this node
   * and all its children.
   * @param rule (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformAllExpressions (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  /** Returns all of the expressions present in this query plan operator. */
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  /** Returns the output schema in the tree format. */
  public  java.lang.String schemaString ()  { throw new RuntimeException(); }
  /** Prints out the schema in the tree format */
  public  void printSchema ()  { throw new RuntimeException(); }
  /**
   * A prefix string used when printing the plan.
   * <p>
   * We use "!" to indicate an invalid plan, and "'" to indicate an unresolved plan.
   * @return (undocumented)
   */
  protected  java.lang.String statePrefix ()  { throw new RuntimeException(); }
  public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  public  java.lang.String verboseString ()  { throw new RuntimeException(); }
  /**
   * All the subqueries of current plan.
   * @return (undocumented)
   */
  public  scala.collection.Seq<PlanType> subqueries ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.QueryPlan<?>> innerChildren ()  { throw new RuntimeException(); }
  /**
   * Canonicalized copy of this query plan.
   * @return (undocumented)
   */
  protected  PlanType canonicalized ()  { throw new RuntimeException(); }
  /**
   * Returns true when the given query plan will return the same results as this query plan.
   * <p>
   * Since its likely undecidable to generally determine if two given plans will produce the same
   * results, it is okay for this function to return false, even if the results are actually
   * the same.  Such behavior will not affect correctness, only the application of performance
   * enhancements like caching.  However, it is not acceptable to return true if the results could
   * possibly be different.
   * <p>
   * By default this function performs a modified version of equality that is tolerant of cosmetic
   * differences like attribute naming and or expression id differences. Operators that
   * can do better should override this function.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  public  boolean sameResult (PlanType plan)  { throw new RuntimeException(); }
  /**
   * All the attributes that are used for this plan.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.AttributeSeq allAttributes ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression cleanExpression (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  /** Args that have cleaned such that differences in expression id should not affect equality */
  protected  scala.collection.Seq<java.lang.Object> cleanArgs ()  { throw new RuntimeException(); }
}
