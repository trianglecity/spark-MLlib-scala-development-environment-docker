package org.apache.spark.sql.catalyst.expressions;
/**
 * A placeholder expression for cube/rollup, which will be replaced by analyzer
 */
public  interface GroupingSet extends org.apache.spark.sql.catalyst.expressions.codegen.CodegenFallback {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupByExprs ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  ;
  public  boolean resolved ()  ;
  public  org.apache.spark.sql.types.DataType dataType ()  ;
  public  boolean foldable ()  ;
  public  boolean nullable ()  ;
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  ;
}
