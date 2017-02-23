package org.apache.spark.sql.execution;
/**
 * Helper trait which defines methods that are shared by both
 * {@link LocalLimitExec} and {@link GlobalLimitExec}.
 */
public  interface BaseLimitExec extends org.apache.spark.sql.execution.UnaryExecNode, org.apache.spark.sql.execution.CodegenSupport {
  public  int limit ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  ;
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  ;
  public  scala.collection.Seq<org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow>> inputRDDs ()  ;
  public  java.lang.String doProduce (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  ;
  public  java.lang.String doConsume (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> input, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode row)  ;
}
