package org.apache.spark.sql.catalyst.json;
  class JacksonGenerator {
  public   JacksonGenerator (org.apache.spark.sql.types.StructType schema, java.io.Writer writer, org.apache.spark.sql.catalyst.json.JSONOptions options)  { throw new RuntimeException(); }
  private  scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit>[] rootFieldWriters ()  { throw new RuntimeException(); }
  private  com.fasterxml.jackson.core.JsonGenerator gen ()  { throw new RuntimeException(); }
  private  scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit> makeWriter (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  private  void writeObject (scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  private  void writeFields (org.apache.spark.sql.catalyst.InternalRow row, org.apache.spark.sql.types.StructType schema, scala.collection.Seq<scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit>> fieldWriters)  { throw new RuntimeException(); }
  private  void writeArray (scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  private  void writeArrayData (org.apache.spark.sql.catalyst.util.ArrayData array, scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit> fieldWriter)  { throw new RuntimeException(); }
  private  void writeMapData (org.apache.spark.sql.catalyst.util.MapData map, org.apache.spark.sql.types.MapType mapType, scala.Function2<org.apache.spark.sql.catalyst.expressions.SpecializedGetters, java.lang.Object, scala.runtime.BoxedUnit> fieldWriter)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  void flush ()  { throw new RuntimeException(); }
  /**
   * Transforms a single InternalRow to JSON using Jackson
   * <p>
   * @param row The row to convert
   */
  public  void write (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
}
