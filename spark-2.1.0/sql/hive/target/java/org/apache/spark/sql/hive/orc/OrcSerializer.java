package org.apache.spark.sql.hive.orc;
  class OrcSerializer implements org.apache.spark.sql.hive.HiveInspectors {
  public   OrcSerializer (org.apache.spark.sql.types.StructType dataSchema, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  public  org.apache.hadoop.io.Writable serialize (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
  private  void wrapOrcStruct (org.apache.hadoop.hive.ql.io.orc.OrcStruct struct, org.apache.hadoop.hive.serde2.objectinspector.SettableStructObjectInspector oi, org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
}
