package org.apache.spark.sql.execution.columnar;
  interface NullableColumnAccessor extends org.apache.spark.sql.execution.columnar.ColumnAccessor {
  public  java.nio.ByteBuffer nullsBuffer ()  ;
  public  int nullCount ()  ;
  public  int seenNulls ()  ;
  public  int nextNullIndex ()  ;
  public  int pos ()  ;
  public  void initialize ()  ;
  public  void extractTo (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  ;
  public  boolean hasNext ()  ;
}
