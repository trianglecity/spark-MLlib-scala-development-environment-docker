package org.apache.spark.sql.catalyst.analysis;
/**
 * A trivial catalog that returns an error when a function is requested. Used for testing when all
 * functions are already filled in and the analyzer needs only to resolve attribute references.
 */
public  class EmptyFunctionRegistry$ implements org.apache.spark.sql.catalyst.analysis.FunctionRegistry {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EmptyFunctionRegistry$ MODULE$ = null;
  public   EmptyFunctionRegistry$ ()  { throw new RuntimeException(); }
  public  void registerFunction (java.lang.String name, org.apache.spark.sql.catalyst.expressions.ExpressionInfo info, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression> builder)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression lookupFunction (java.lang.String name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listFunction ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.ExpressionInfo> lookupFunction (java.lang.String name)  { throw new RuntimeException(); }
  public  scala.Option<scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression>> lookupFunctionBuilder (java.lang.String name)  { throw new RuntimeException(); }
  public  boolean dropFunction (java.lang.String name)  { throw new RuntimeException(); }
  public  void clear ()  { throw new RuntimeException(); }
}
