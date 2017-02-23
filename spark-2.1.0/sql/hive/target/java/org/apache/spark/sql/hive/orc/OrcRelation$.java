package org.apache.spark.sql.hive.orc;
public  class OrcRelation$ implements org.apache.spark.sql.hive.HiveInspectors {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OrcRelation$ MODULE$ = null;
  public   OrcRelation$ ()  { throw new RuntimeException(); }
  public  java.lang.String ORC_COMPRESSION ()  { throw new RuntimeException(); }
    java.lang.String SARG_PUSHDOWN ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> extensionsForCompressionCodecNames ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> unwrapOrcStructs (org.apache.hadoop.conf.Configuration conf, org.apache.spark.sql.types.StructType dataSchema, scala.Option<org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector> maybeStructOI, scala.collection.Iterator<org.apache.hadoop.io.Writable> iterator)  { throw new RuntimeException(); }
  public  void setRequiredColumns (org.apache.hadoop.conf.Configuration conf, org.apache.spark.sql.types.StructType physicalSchema, org.apache.spark.sql.types.StructType requestedSchema)  { throw new RuntimeException(); }
}
