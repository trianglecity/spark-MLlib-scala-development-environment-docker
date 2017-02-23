package org.apache.spark.sql.catalyst.expressions;
/**
 * Common base class for both {@link CreateNamedStruct} and {@link CreateNamedStructUnsafe}.
 */
public  interface CreateNamedStructLike {
  // not preceding
  public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.expressions.Expression> nameExprs ()  ;
  public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.expressions.Expression> valExprs ()  ;
  public  scala.collection.immutable.List<java.lang.Object> names ()  ;
  public  boolean nullable ()  ;
  public  boolean foldable ()  ;
  public  org.apache.spark.sql.types.StructType dataType ()  ;
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  ;
  /**
   * Returns Aliased {@link Expression}s that could be used to construct a flattened version of this
   * StructType.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> flatten ()  ;
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  ;
}
