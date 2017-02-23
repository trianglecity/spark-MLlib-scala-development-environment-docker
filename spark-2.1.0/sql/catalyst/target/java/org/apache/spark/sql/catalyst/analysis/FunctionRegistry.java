package org.apache.spark.sql.catalyst.analysis;
/**
 * A catalog for looking up user defined functions, used by an {@link Analyzer}.
 * <p>
 * Note: The implementation should be thread-safe to allow concurrent access.
 */
public  interface FunctionRegistry {
  public  void registerFunction (java.lang.String name, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression> builder)  ;
  public  void registerFunction (java.lang.String name, org.apache.spark.sql.catalyst.expressions.ExpressionInfo info, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression> builder)  ;
  public  org.apache.spark.sql.catalyst.expressions.Expression lookupFunction (java.lang.String name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children) throws org.apache.spark.sql.AnalysisException ;
  public  scala.collection.Seq<java.lang.String> listFunction ()  ;
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.ExpressionInfo> lookupFunction (java.lang.String name)  ;
  public  scala.Option<scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression>> lookupFunctionBuilder (java.lang.String name)  ;
  /** Drop a function and return whether the function existed. */
  public  boolean dropFunction (java.lang.String name)  ;
  /** Checks if a function with a given name exists. */
  public  boolean functionExists (java.lang.String name)  ;
  /** Clear all registered functions. */
  public  void clear ()  ;
}
