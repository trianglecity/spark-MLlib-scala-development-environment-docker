package org.apache.spark.sql.catalyst.expressions;
/**
 * A projection that could turn UnsafeRow into GenericInternalRow
 */
public  class FromUnsafeProjection$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FromUnsafeProjection$ MODULE$ = null;
  public   FromUnsafeProjection$ ()  { throw new RuntimeException(); }
  /**
   * Returns a Projection for given StructType.
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Projection apply (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Returns an UnsafeProjection for given Array of DataTypes.
   * @param fields (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Projection apply (scala.collection.Seq<org.apache.spark.sql.types.DataType> fields)  { throw new RuntimeException(); }
  /**
   * Returns a Projection for given sequence of Expressions (bounded).
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.expressions.Projection create (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
}
