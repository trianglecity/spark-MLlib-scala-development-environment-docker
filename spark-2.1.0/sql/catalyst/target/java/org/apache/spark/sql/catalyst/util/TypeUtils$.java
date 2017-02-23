package org.apache.spark.sql.catalyst.util;
/**
 * Helper functions to check for valid data types.
 */
public  class TypeUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TypeUtils$ MODULE$ = null;
  public   TypeUtils$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkForNumericExpr (org.apache.spark.sql.types.DataType dt, java.lang.String caller)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkForOrderingExpr (org.apache.spark.sql.types.DataType dt, java.lang.String caller)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkForSameTypeInputExpr (scala.collection.Seq<org.apache.spark.sql.types.DataType> types, java.lang.String caller)  { throw new RuntimeException(); }
  public  scala.math.Numeric<java.lang.Object> getNumeric (org.apache.spark.sql.types.DataType t)  { throw new RuntimeException(); }
  public  scala.math.Ordering<java.lang.Object> getInterpretedOrdering (org.apache.spark.sql.types.DataType t)  { throw new RuntimeException(); }
  public  int compareBinary (byte[] x, byte[] y)  { throw new RuntimeException(); }
}
