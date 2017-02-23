package org.apache.spark.sql.catalyst.expressions;
/**
 * An expression that invokes a method on a class via reflection.
 * <p>
 * For now, only types defined in <code>Reflect.typeMapping</code> are supported (basically primitives
 * and string) as input types, and the output is turned automatically to a string.
 * <p>
 * Note that unlike Hive's reflect function, this expression calls only static methods
 * (i.e. does not support calling non-static methods).
 * <p>
 * We should also look into how to consolidate this expression with
 * {@link org.apache.spark.sql.catalyst.expressions.objects.StaticInvoke} in the future.
 * <p>
 * param:  children the first element should be a literal string for the class name,
 *                 and the second element should be a literal string for the method name,
 *                 and the remaining are input arguments to the Java method.
 */
public  class CallMethodViaReflection extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.codegen.CodegenFallback, scala.Product, scala.Serializable {
  /** Mapping from Spark's type to acceptable JVM types. */
  static public  scala.collection.immutable.Map<org.apache.spark.sql.types.DataType, scala.collection.Seq<java.lang.Class<?>>> typeMapping ()  { throw new RuntimeException(); }
  /**
   * Finds a Java static method using reflection that matches the given argument types,
   * and whose return type is string.
   * <p>
   * The types sequence must be the valid types defined in {@link typeMapping}.
   * <p>
   * This is made public for unit testing.
   * @param className (undocumented)
   * @param methodName (undocumented)
   * @param argTypes (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<java.lang.reflect.Method> findMethod (java.lang.String className, java.lang.String methodName, scala.collection.Seq<org.apache.spark.sql.types.DataType> argTypes)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.trees.Origin origin ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.trees.TreeNode<?>> containsChild ()  { throw new RuntimeException(); }
  static public  int hashCode ()  { throw new RuntimeException(); }
  static public  boolean fastEquals (org.apache.spark.sql.catalyst.trees.TreeNode<?> other)  { throw new RuntimeException(); }
  static public  scala.Option<BaseType> find (scala.Function1<BaseType, java.lang.Object> f)  { throw new RuntimeException(); }
  static public  void foreach (scala.Function1<BaseType, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void foreachUp (scala.Function1<BaseType, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.collection.Seq<A> map (scala.Function1<BaseType, A> f)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.collection.Seq<A> flatMap (scala.Function1<BaseType, scala.collection.TraversableOnce<A>> f)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Seq<B> collect (scala.PartialFunction<BaseType, B> pf)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<BaseType> collectLeaves ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.Option<B> collectFirst (scala.PartialFunction<BaseType, B> pf)  { throw new RuntimeException(); }
  static protected <B extends java.lang.Object> java.lang.Object mapProductIterator (scala.Function1<java.lang.Object, B> f, scala.reflect.ClassTag<B> evidence$1)  { throw new RuntimeException(); }
  static public  BaseType mapChildren (scala.Function1<BaseType, BaseType> f)  { throw new RuntimeException(); }
  static public  BaseType withNewChildren (scala.collection.Seq<BaseType> newChildren)  { throw new RuntimeException(); }
  static public  BaseType transform (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static public  BaseType transformDown (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static public  BaseType transformUp (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static protected  BaseType transformChildren (scala.PartialFunction<BaseType, BaseType> rule, scala.Function2<BaseType, scala.PartialFunction<BaseType, BaseType>, BaseType> nextOperation)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<java.lang.Object> otherCopyArgs ()  { throw new RuntimeException(); }
  static public  BaseType makeCopy (java.lang.Object[] newArgs)  { throw new RuntimeException(); }
  static public  java.lang.String nodeName ()  { throw new RuntimeException(); }
  static protected  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
  static public  java.lang.String argString ()  { throw new RuntimeException(); }
  static public  java.lang.String treeString ()  { throw new RuntimeException(); }
  static public  java.lang.String treeString (boolean verbose)  { throw new RuntimeException(); }
  static public  java.lang.String numberedTreeString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.trees.TreeNode<?> apply (int number)  { throw new RuntimeException(); }
  static public  BaseType p (int number)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.trees.TreeNode<?>> innerChildren ()  { throw new RuntimeException(); }
  static public  scala.collection.mutable.StringBuilder generateTreeString (int depth, scala.collection.Seq<java.lang.Object> lastChildren, scala.collection.mutable.StringBuilder builder, boolean verbose, java.lang.String prefix)  { throw new RuntimeException(); }
  static public  java.lang.String asCode ()  { throw new RuntimeException(); }
  static public  java.lang.String toJSON ()  { throw new RuntimeException(); }
  static public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  static protected  scala.collection.immutable.List<scala.Tuple2<java.lang.String, org.json4s.JsonAST.JValue>> jsonFields ()  { throw new RuntimeException(); }
  static public  java.lang.String generateTreeString$default$5 ()  { throw new RuntimeException(); }
  static public  boolean foldable ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet references ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  static public  boolean resolved ()  { throw new RuntimeException(); }
  static public  boolean childrenResolved ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.Expression canonicalized ()  { throw new RuntimeException(); }
  static public  boolean semanticEquals (org.apache.spark.sql.catalyst.expressions.Expression other)  { throw new RuntimeException(); }
  static public  int semanticHash ()  { throw new RuntimeException(); }
  static protected  scala.collection.Iterator<java.lang.Object> flatArguments ()  { throw new RuntimeException(); }
  static public final  java.lang.String verboseString ()  { throw new RuntimeException(); }
  static public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  java.lang.String sql ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.InternalRow eval$default$1 ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  // not preceding
  public   CallMethodViaReflection (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public  boolean deterministic ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Expression[] argExprs ()  { throw new RuntimeException(); }
  /** Name of the class -- this has to be called after we verify children has at least two exprs. */
  private  java.lang.String className ()  { throw new RuntimeException(); }
  /** True if the class exists and can be loaded. */
  private  boolean classExists ()  { throw new RuntimeException(); }
  /** The reflection method. */
  public  java.lang.reflect.Method method ()  { throw new RuntimeException(); }
  /** A temporary buffer used to hold intermediate results returned by children. */
  private  java.lang.Object[] buffer ()  { throw new RuntimeException(); }
}
