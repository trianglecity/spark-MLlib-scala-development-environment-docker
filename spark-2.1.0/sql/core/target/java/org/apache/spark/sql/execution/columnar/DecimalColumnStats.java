package org.apache.spark.sql.execution.columnar;
  class DecimalColumnStats implements org.apache.spark.sql.execution.columnar.ColumnStats {
  public   DecimalColumnStats (int precision, int scale)  { throw new RuntimeException(); }
  public   DecimalColumnStats (org.apache.spark.sql.types.DecimalType dt)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.Decimal upper ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.Decimal lower ()  { throw new RuntimeException(); }
  public  void gatherStats (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.GenericInternalRow collectedStatistics ()  { throw new RuntimeException(); }
}
