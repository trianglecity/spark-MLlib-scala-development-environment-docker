package org.apache.spark.sql.catalyst.analysis;
public  class SimpleFunctionRegistry implements org.apache.spark.sql.catalyst.analysis.FunctionRegistry {
  public   SimpleFunctionRegistry ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.util.StringKeyHashMap<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.ExpressionInfo, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression>>> functionBuilders ()  { throw new RuntimeException(); }
  public  void registerFunction (java.lang.String name, org.apache.spark.sql.catalyst.expressions.ExpressionInfo info, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression> builder)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression lookupFunction (java.lang.String name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listFunction ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.ExpressionInfo> lookupFunction (java.lang.String name)  { throw new RuntimeException(); }
  public  scala.Option<scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression>> lookupFunctionBuilder (java.lang.String name)  { throw new RuntimeException(); }
  public  boolean dropFunction (java.lang.String name)  { throw new RuntimeException(); }
  public  void clear ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.SimpleFunctionRegistry copy ()  { throw new RuntimeException(); }
}
