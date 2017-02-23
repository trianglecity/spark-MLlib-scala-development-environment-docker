package org.apache.spark.sql.catalyst.expressions;
public  class RowOrdering {
  /**
   * Returns true iff the data type can be ordered (i.e. can be sorted).
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  static public  boolean isOrderable (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Returns true iff outputs from the expressions can be ordered.
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  static public  boolean isOrderable (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
}
