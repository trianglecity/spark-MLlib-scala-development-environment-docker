package org.apache.spark.sql.execution.datasources.parquet;
/**
 * A {@link RecordMaterializer} for Catalyst rows.
 * <p>
 * param:  parquetSchema Parquet schema of the records to be read
 * param:  catalystSchema Catalyst schema of the rows to be constructed
 * param:  schemaConverter A Parquet-Catalyst schema converter that helps initializing row converters
 */
  class ParquetRecordMaterializer extends org.apache.parquet.io.api.RecordMaterializer<org.apache.spark.sql.catalyst.expressions.UnsafeRow> {
  public   ParquetRecordMaterializer (org.apache.parquet.schema.MessageType parquetSchema, org.apache.spark.sql.types.StructType catalystSchema, org.apache.spark.sql.execution.datasources.parquet.ParquetSchemaConverter schemaConverter)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.parquet.ParquetRowConverter rootConverter ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow getCurrentRecord ()  { throw new RuntimeException(); }
  public  org.apache.parquet.io.api.GroupConverter getRootConverter ()  { throw new RuntimeException(); }
}
