package org.apache.spark.sql.jdbc;
public  class MsSqlServerDialect$ extends org.apache.spark.sql.jdbc.JdbcDialect {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MsSqlServerDialect$ MODULE$ = null;
  public   MsSqlServerDialect$ ()  { throw new RuntimeException(); }
  public  boolean canHandle (java.lang.String url)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.DataType> getCatalystType (int sqlType, java.lang.String typeName, int size, org.apache.spark.sql.types.MetadataBuilder md)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.jdbc.JdbcType> getJDBCType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> isCascadingTruncateTable ()  { throw new RuntimeException(); }
}
