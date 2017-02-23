package org.apache.spark.sql.catalyst.expressions;
/**
 * A projection that returns UnsafeRow.
 */
public abstract class UnsafeProjection extends org.apache.spark.sql.catalyst.expressions.Projection {
  /**
   * Returns an UnsafeProjection for given StructType.
   * @param schema (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection create (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Returns an UnsafeProjection for given Array of DataTypes.
   * @param fields (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection create (org.apache.spark.sql.types.DataType[] fields)  { throw new RuntimeException(); }
  /**
   * Returns an UnsafeProjection for given sequence of Expressions (bounded).
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection create (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection create (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  /**
   * Returns an UnsafeProjection for given sequence of Expressions, which will be bound to
   * <code>inputSchema</code>.
   * @param exprs (undocumented)
   * @param inputSchema (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection create (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  /**
   * Same as other create()'s but allowing enabling/disabling subexpression elimination.
   * TODO: refactor the plumbing and clean this up.
   * @param exprs (undocumented)
   * @param inputSchema (undocumented)
   * @param subexpressionEliminationEnabled (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection create (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema, boolean subexpressionEliminationEnabled)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.Function1<A, R> compose (scala.Function1<A, T1> g)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.Function1<T1, A> andThen (scala.Function1<R, A> g)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  void initialize (int partitionIndex)  { throw new RuntimeException(); }
  public   UnsafeProjection ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.expressions.UnsafeRow apply (org.apache.spark.sql.catalyst.InternalRow row)  ;
}
