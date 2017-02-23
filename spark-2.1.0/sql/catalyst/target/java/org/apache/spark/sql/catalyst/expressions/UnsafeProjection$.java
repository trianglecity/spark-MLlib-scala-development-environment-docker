package org.apache.spark.sql.catalyst.expressions;
public  class UnsafeProjection$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final UnsafeProjection$ MODULE$ = null;
  public   UnsafeProjection$ ()  { throw new RuntimeException(); }
  /**
   * Returns an UnsafeProjection for given StructType.
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection create (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Returns an UnsafeProjection for given Array of DataTypes.
   * @param fields (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection create (org.apache.spark.sql.types.DataType[] fields)  { throw new RuntimeException(); }
  /**
   * Returns an UnsafeProjection for given sequence of Expressions (bounded).
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection create (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection create (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  /**
   * Returns an UnsafeProjection for given sequence of Expressions, which will be bound to
   * <code>inputSchema</code>.
   * @param exprs (undocumented)
   * @param inputSchema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection create (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  /**
   * Same as other create()'s but allowing enabling/disabling subexpression elimination.
   * TODO: refactor the plumbing and clean this up.
   * @param exprs (undocumented)
   * @param inputSchema (undocumented)
   * @param subexpressionEliminationEnabled (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection create (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema, boolean subexpressionEliminationEnabled)  { throw new RuntimeException(); }
}
