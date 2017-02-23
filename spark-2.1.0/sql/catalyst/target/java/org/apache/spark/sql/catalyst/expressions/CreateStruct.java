package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns a Row containing the evaluation of all children expressions.
 */
public  class CreateStruct {
  static public  org.apache.spark.sql.catalyst.expressions.CreateNamedStruct apply (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  { throw new RuntimeException(); }
  /**
   * Entry to use in the function registry.
   * @return (undocumented)
   */
  static public  scala.Tuple2<java.lang.String, scala.Tuple2<org.apache.spark.sql.catalyst.expressions.ExpressionInfo, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression>>> registryEntry ()  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.Function1<A, R> compose (scala.Function1<A, T1> g)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.Function1<T1, A> andThen (scala.Function1<R, A> g)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
}
