package org.apache.spark.sql.execution.streaming;
public  class TextSocketSourceProvider implements org.apache.spark.sql.sources.StreamSourceProvider, org.apache.spark.sql.sources.DataSourceRegister, org.apache.spark.internal.Logging {
  public   TextSocketSourceProvider ()  { throw new RuntimeException(); }
  private  boolean parseIncludeTimestamp (scala.collection.immutable.Map<java.lang.String, java.lang.String> params)  { throw new RuntimeException(); }
  /** Returns the name and schema of the source that can be used to continually read data. */
  public  scala.Tuple2<java.lang.String, org.apache.spark.sql.types.StructType> sourceSchema (org.apache.spark.sql.SQLContext sqlContext, scala.Option<org.apache.spark.sql.types.StructType> schema, java.lang.String providerName, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.Source createSource (org.apache.spark.sql.SQLContext sqlContext, java.lang.String metadataPath, scala.Option<org.apache.spark.sql.types.StructType> schema, java.lang.String providerName, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  /** String that represents the format that this data source provider uses. */
  public  java.lang.String shortName ()  { throw new RuntimeException(); }
}
