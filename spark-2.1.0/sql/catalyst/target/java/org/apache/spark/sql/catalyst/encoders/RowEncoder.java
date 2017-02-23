package org.apache.spark.sql.catalyst.encoders;
/**
 * A factory for constructing encoders that convert external row to/from the Spark SQL
 * internal binary representation.
 * <p>
 * The following is a mapping between Spark SQL types and its allowed external types:
 * <pre><code>
 *   BooleanType -&gt; java.lang.Boolean
 *   ByteType -&gt; java.lang.Byte
 *   ShortType -&gt; java.lang.Short
 *   IntegerType -&gt; java.lang.Integer
 *   FloatType -&gt; java.lang.Float
 *   DoubleType -&gt; java.lang.Double
 *   StringType -&gt; String
 *   DecimalType -&gt; java.math.BigDecimal or scala.math.BigDecimal or Decimal
 *
 *   DateType -&gt; java.sql.Date
 *   TimestampType -&gt; java.sql.Timestamp
 *
 *   BinaryType -&gt; byte array
 *   ArrayType -&gt; scala.collection.Seq or Array
 *   MapType -&gt; scala.collection.Map
 *   StructType -&gt; org.apache.spark.sql.Row
 * </code></pre>
 */
public  class RowEncoder {
  static public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<org.apache.spark.sql.Row> apply (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.Expression serializerFor (org.apache.spark.sql.catalyst.expressions.Expression inputObject, org.apache.spark.sql.types.DataType inputType)  { throw new RuntimeException(); }
  /**
   * Returns the <code>DataType</code> that can be used when generating code that converts input data
   * into the Spark SQL internal format.  Unlike <code>externalDataTypeFor</code>, the <code>DataType</code> returned
   * by this function can be more permissive since multiple external types may map to a single
   * internal type.  For example, for an input with DecimalType in external row, its external types
   * can be <code>scala.math.BigDecimal</code>, <code>java.math.BigDecimal</code>, or
   * <code>org.apache.spark.sql.types.Decimal</code>.
   * @param dt (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.types.DataType externalDataTypeForInput (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DataType externalDataTypeFor (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.Expression deserializerFor (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.Expression deserializerFor (org.apache.spark.sql.catalyst.expressions.Expression input)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.Expression deserializerFor (org.apache.spark.sql.catalyst.expressions.Expression input, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
}
