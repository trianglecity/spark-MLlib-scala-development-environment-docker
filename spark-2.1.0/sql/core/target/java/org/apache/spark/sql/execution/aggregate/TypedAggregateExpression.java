package org.apache.spark.sql.execution.aggregate;
public  class TypedAggregateExpression extends org.apache.spark.sql.catalyst.expressions.aggregate.DeclarativeAggregate implements org.apache.spark.sql.catalyst.expressions.NonSQLExpression, scala.Product, scala.Serializable {
  static public <BUF extends java.lang.Object, OUT extends java.lang.Object> org.apache.spark.sql.execution.aggregate.TypedAggregateExpression apply (org.apache.spark.sql.expressions.Aggregator<?, BUF, OUT> aggregator, org.apache.spark.sql.Encoder<BUF> evidence$1, org.apache.spark.sql.Encoder<OUT> evidence$2)  { throw new RuntimeException(); }
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
  static protected  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
  static public  java.lang.String argString ()  { throw new RuntimeException(); }
  static public  java.lang.String treeString ()  { throw new RuntimeException(); }
  static public  java.lang.String treeString (boolean verbose)  { throw new RuntimeException(); }
  static public  java.lang.String numberedTreeString ()  { throw new RuntimeException(); }
  static public  BaseType p (int number)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.trees.TreeNode<?>> innerChildren ()  { throw new RuntimeException(); }
  static public  scala.collection.mutable.StringBuilder generateTreeString (int depth, scala.collection.Seq<java.lang.Object> lastChildren, scala.collection.mutable.StringBuilder builder, boolean verbose, java.lang.String prefix)  { throw new RuntimeException(); }
  static public  java.lang.String asCode ()  { throw new RuntimeException(); }
  static public  java.lang.String toJSON ()  { throw new RuntimeException(); }
  static public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  static protected  scala.collection.immutable.List<scala.Tuple2<java.lang.String, org.json4s.JsonAST.JValue>> jsonFields ()  { throw new RuntimeException(); }
  static public  java.lang.String generateTreeString$default$5 ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  static public  boolean childrenResolved ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.Expression canonicalized ()  { throw new RuntimeException(); }
  static public  boolean semanticEquals (org.apache.spark.sql.catalyst.expressions.Expression other)  { throw new RuntimeException(); }
  static public  int semanticHash ()  { throw new RuntimeException(); }
  static public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  static protected  scala.collection.Iterator<java.lang.Object> flatArguments ()  { throw new RuntimeException(); }
  static public final  java.lang.String verboseString ()  { throw new RuntimeException(); }
  static public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  static public final  boolean foldable ()  { throw new RuntimeException(); }
  static public  boolean supportsPartial ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.catalyst.expressions.Literal> defaultResult ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression toAggregateExpression ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression toAggregateExpression (boolean isDistinct)  { throw new RuntimeException(); }
  static public  java.lang.String sql (boolean isDistinct)  { throw new RuntimeException(); }
  static public  java.lang.String toAggString (boolean isDistinct)  { throw new RuntimeException(); }
  static public final  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  static public final  org.apache.spark.sql.catalyst.InternalRow eval$default$1 ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.sql.types.StructType aggBufferSchema ()  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> inputAggBufferAttributes ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.aggregate.DeclarativeAggregate.RichAttribute RichAttribute (org.apache.spark.sql.catalyst.expressions.AttributeReference a)  { throw new RuntimeException(); }
  static public final  java.lang.String sql ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.expressions.Aggregator<java.lang.Object, java.lang.Object, java.lang.Object> aggregator ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> inputDeserializer ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Class<?>> inputClass ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> inputSchema ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> bufferSerializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression bufferDeserializer ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> outputSerializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType outputExternalType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  // not preceding
  public   TypedAggregateExpression (org.apache.spark.sql.expressions.Aggregator<java.lang.Object, java.lang.Object, java.lang.Object> aggregator, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> inputDeserializer, scala.Option<java.lang.Class<?>> inputClass, scala.Option<org.apache.spark.sql.types.StructType> inputSchema, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> bufferSerializer, org.apache.spark.sql.catalyst.expressions.Expression bufferDeserializer, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> outputSerializer, org.apache.spark.sql.types.DataType outputExternalType, org.apache.spark.sql.types.DataType dataType, boolean nullable)  { throw new RuntimeException(); }
  public  boolean deterministic ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet references ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Literal aggregatorLiteral ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.DataType bufferExternalType ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> initialValues ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> updateExpressions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> mergeExpressions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression evaluateExpression ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String nodeName ()  { throw new RuntimeException(); }
}
