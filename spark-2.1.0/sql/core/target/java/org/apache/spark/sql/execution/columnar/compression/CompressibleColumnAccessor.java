package org.apache.spark.sql.execution.columnar.compression;
  interface CompressibleColumnAccessor<T extends org.apache.spark.sql.types.AtomicType> extends org.apache.spark.sql.execution.columnar.ColumnAccessor {
  public  org.apache.spark.sql.execution.columnar.compression.Decoder<T> decoder ()  ;
  public  void initialize ()  ;
  public  boolean hasNext ()  ;
  public  void extractSingle (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  ;
}
