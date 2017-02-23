package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns a Row containing the evaluation of all children expressions.
 */
public  class CreateStruct$ implements scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CreateStruct$ MODULE$ = null;
  public   CreateStruct$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.CreateNamedStruct apply (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  { throw new RuntimeException(); }
  /**
   * Entry to use in the function registry.
   * @return (undocumented)
   */
  public  scala.Tuple2<java.lang.String, scala.Tuple2<org.apache.spark.sql.catalyst.expressions.ExpressionInfo, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression>>> registryEntry ()  { throw new RuntimeException(); }
}
