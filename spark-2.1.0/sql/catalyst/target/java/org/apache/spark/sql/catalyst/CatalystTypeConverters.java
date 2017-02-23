package org.apache.spark.sql.catalyst;
/**
 * Functions to convert Scala types to Catalyst types and vice versa.
 */
public  class CatalystTypeConverters {
  static private  class IdentityConverter extends org.apache.spark.sql.catalyst.CatalystTypeConverters.CatalystTypeConverter<java.lang.Object, java.lang.Object, java.lang.Object> implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
    // not preceding
    public   IdentityConverter (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
    public  Object toCatalystImpl (Object scalaValue)  { throw new RuntimeException(); }
    public  Object toScala (Object catalystValue)  { throw new RuntimeException(); }
    public  Object toScalaImpl (org.apache.spark.sql.catalyst.InternalRow row, int column)  { throw new RuntimeException(); }
  }
  static private  class IdentityConverter$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.types.DataType, org.apache.spark.sql.catalyst.CatalystTypeConverters.IdentityConverter> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final IdentityConverter$ MODULE$ = null;
    public   IdentityConverter$ ()  { throw new RuntimeException(); }
  }
  static private  class UDTConverter<A extends java.lang.Object> extends org.apache.spark.sql.catalyst.CatalystTypeConverters.CatalystTypeConverter<A, A, java.lang.Object> implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.types.UserDefinedType<A> udt ()  { throw new RuntimeException(); }
    // not preceding
    public   UDTConverter (org.apache.spark.sql.types.UserDefinedType<A> udt)  { throw new RuntimeException(); }
    public  Object toCatalystImpl (A scalaValue)  { throw new RuntimeException(); }
    public  A toScala (Object catalystValue)  { throw new RuntimeException(); }
    public  A toScalaImpl (org.apache.spark.sql.catalyst.InternalRow row, int column)  { throw new RuntimeException(); }
  }
  static private  class UDTConverter$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final UDTConverter$ MODULE$ = null;
    public   UDTConverter$ ()  { throw new RuntimeException(); }
  }
  /** Converter for arrays, sequences, and Java iterables. */
  static private  class ArrayConverter extends org.apache.spark.sql.catalyst.CatalystTypeConverters.CatalystTypeConverter<java.lang.Object, scala.collection.Seq<java.lang.Object>, org.apache.spark.sql.catalyst.util.ArrayData> implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.types.DataType elementType ()  { throw new RuntimeException(); }
    // not preceding
    public   ArrayConverter (org.apache.spark.sql.types.DataType elementType)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.util.ArrayData toCatalystImpl (Object scalaValue)  { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.Object> toScala (org.apache.spark.sql.catalyst.util.ArrayData catalystValue)  { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.Object> toScalaImpl (org.apache.spark.sql.catalyst.InternalRow row, int column)  { throw new RuntimeException(); }
  }
  static private  class ArrayConverter$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.types.DataType, org.apache.spark.sql.catalyst.CatalystTypeConverters.ArrayConverter> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ArrayConverter$ MODULE$ = null;
    public   ArrayConverter$ ()  { throw new RuntimeException(); }
  }
  static private  class MapConverter extends org.apache.spark.sql.catalyst.CatalystTypeConverters.CatalystTypeConverter<java.lang.Object, scala.collection.Map<java.lang.Object, java.lang.Object>, org.apache.spark.sql.catalyst.util.MapData> implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.types.DataType keyType ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.DataType valueType ()  { throw new RuntimeException(); }
    // not preceding
    public   MapConverter (org.apache.spark.sql.types.DataType keyType, org.apache.spark.sql.types.DataType valueType)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.util.MapData toCatalystImpl (Object scalaValue)  { throw new RuntimeException(); }
    public  scala.collection.Map<java.lang.Object, java.lang.Object> toScala (org.apache.spark.sql.catalyst.util.MapData catalystValue)  { throw new RuntimeException(); }
    public  scala.collection.Map<java.lang.Object, java.lang.Object> toScalaImpl (org.apache.spark.sql.catalyst.InternalRow row, int column)  { throw new RuntimeException(); }
  }
  static private  class MapConverter$ extends scala.runtime.AbstractFunction2<org.apache.spark.sql.types.DataType, org.apache.spark.sql.types.DataType, org.apache.spark.sql.catalyst.CatalystTypeConverters.MapConverter> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MapConverter$ MODULE$ = null;
    public   MapConverter$ ()  { throw new RuntimeException(); }
  }
  static private  class StructConverter extends org.apache.spark.sql.catalyst.CatalystTypeConverters.CatalystTypeConverter<java.lang.Object, org.apache.spark.sql.Row, org.apache.spark.sql.catalyst.InternalRow> implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.types.StructType structType ()  { throw new RuntimeException(); }
    // not preceding
    public   StructConverter (org.apache.spark.sql.types.StructType structType)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.InternalRow toCatalystImpl (Object scalaValue)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Row toScala (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Row toScalaImpl (org.apache.spark.sql.catalyst.InternalRow row, int column)  { throw new RuntimeException(); }
  }
  static private  class StructConverter$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.types.StructType, org.apache.spark.sql.catalyst.CatalystTypeConverters.StructConverter> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StructConverter$ MODULE$ = null;
    public   StructConverter$ ()  { throw new RuntimeException(); }
  }
  static private  class StringConverter$ extends org.apache.spark.sql.catalyst.CatalystTypeConverters.CatalystTypeConverter<java.lang.Object, java.lang.String, org.apache.spark.unsafe.types.UTF8String> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StringConverter$ MODULE$ = null;
    public   StringConverter$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.unsafe.types.UTF8String toCatalystImpl (Object scalaValue)  { throw new RuntimeException(); }
    public  java.lang.String toScala (org.apache.spark.unsafe.types.UTF8String catalystValue)  { throw new RuntimeException(); }
    public  java.lang.String toScalaImpl (org.apache.spark.sql.catalyst.InternalRow row, int column)  { throw new RuntimeException(); }
  }
  static private  class DateConverter$ extends org.apache.spark.sql.catalyst.CatalystTypeConverters.CatalystTypeConverter<java.sql.Date, java.sql.Date, java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DateConverter$ MODULE$ = null;
    public   DateConverter$ ()  { throw new RuntimeException(); }
    public  int toCatalystImpl (java.sql.Date scalaValue)  { throw new RuntimeException(); }
    public  java.sql.Date toScala (Object catalystValue)  { throw new RuntimeException(); }
    public  java.sql.Date toScalaImpl (org.apache.spark.sql.catalyst.InternalRow row, int column)  { throw new RuntimeException(); }
  }
  static private  class TimestampConverter$ extends org.apache.spark.sql.catalyst.CatalystTypeConverters.CatalystTypeConverter<java.sql.Timestamp, java.sql.Timestamp, java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TimestampConverter$ MODULE$ = null;
    public   TimestampConverter$ ()  { throw new RuntimeException(); }
    public  long toCatalystImpl (java.sql.Timestamp scalaValue)  { throw new RuntimeException(); }
    public  java.sql.Timestamp toScala (Object catalystValue)  { throw new RuntimeException(); }
    public  java.sql.Timestamp toScalaImpl (org.apache.spark.sql.catalyst.InternalRow row, int column)  { throw new RuntimeException(); }
  }
  static private  class BooleanConverter$ extends org.apache.spark.sql.catalyst.CatalystTypeConverters.PrimitiveConverter<java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BooleanConverter$ MODULE$ = null;
    public   BooleanConverter$ ()  { throw new RuntimeException(); }
    public  boolean toScalaImpl (org.apache.spark.sql.catalyst.InternalRow row, int column)  { throw new RuntimeException(); }
  }
  static private  class ByteConverter$ extends org.apache.spark.sql.catalyst.CatalystTypeConverters.PrimitiveConverter<java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ByteConverter$ MODULE$ = null;
    public   ByteConverter$ ()  { throw new RuntimeException(); }
    public  byte toScalaImpl (org.apache.spark.sql.catalyst.InternalRow row, int column)  { throw new RuntimeException(); }
  }
  static private  class ShortConverter$ extends org.apache.spark.sql.catalyst.CatalystTypeConverters.PrimitiveConverter<java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ShortConverter$ MODULE$ = null;
    public   ShortConverter$ ()  { throw new RuntimeException(); }
    public  short toScalaImpl (org.apache.spark.sql.catalyst.InternalRow row, int column)  { throw new RuntimeException(); }
  }
  static private  class IntConverter$ extends org.apache.spark.sql.catalyst.CatalystTypeConverters.PrimitiveConverter<java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final IntConverter$ MODULE$ = null;
    public   IntConverter$ ()  { throw new RuntimeException(); }
    public  int toScalaImpl (org.apache.spark.sql.catalyst.InternalRow row, int column)  { throw new RuntimeException(); }
  }
  static private  class LongConverter$ extends org.apache.spark.sql.catalyst.CatalystTypeConverters.PrimitiveConverter<java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final LongConverter$ MODULE$ = null;
    public   LongConverter$ ()  { throw new RuntimeException(); }
    public  long toScalaImpl (org.apache.spark.sql.catalyst.InternalRow row, int column)  { throw new RuntimeException(); }
  }
  static private  class FloatConverter$ extends org.apache.spark.sql.catalyst.CatalystTypeConverters.PrimitiveConverter<java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FloatConverter$ MODULE$ = null;
    public   FloatConverter$ ()  { throw new RuntimeException(); }
    public  float toScalaImpl (org.apache.spark.sql.catalyst.InternalRow row, int column)  { throw new RuntimeException(); }
  }
  static private  class DoubleConverter$ extends org.apache.spark.sql.catalyst.CatalystTypeConverters.PrimitiveConverter<java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DoubleConverter$ MODULE$ = null;
    public   DoubleConverter$ ()  { throw new RuntimeException(); }
    public  double toScalaImpl (org.apache.spark.sql.catalyst.InternalRow row, int column)  { throw new RuntimeException(); }
  }
  /**
   * Converts a Scala type to its Catalyst equivalent (and vice versa).
   * <p>
   * @tparam ScalaInputType The type of Scala values that can be converted to Catalyst.
   * @tparam ScalaOutputType The type of Scala values returned when converting Catalyst to Scala.
   * @tparam CatalystType The internal Catalyst type used to represent values of this Scala type.
   */
  static private abstract class CatalystTypeConverter<ScalaInputType extends java.lang.Object, ScalaOutputType extends java.lang.Object, CatalystType extends java.lang.Object> implements scala.Serializable {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   CatalystTypeConverter ()  { throw new RuntimeException(); }
    /**
     * Converts a Scala type to its Catalyst equivalent while automatically handling nulls
     * and Options.
     * @param maybeScalaValue (undocumented)
     * @return (undocumented)
     */
    public final  CatalystType toCatalyst (Object maybeScalaValue)  { throw new RuntimeException(); }
    /**
     * Given a Catalyst row, convert the value at column <code>column</code> to its Scala equivalent.
     * @param row (undocumented)
     * @param column (undocumented)
     * @return (undocumented)
     */
    public final  ScalaOutputType toScala (org.apache.spark.sql.catalyst.InternalRow row, int column)  { throw new RuntimeException(); }
    /**
     * Convert a Catalyst value to its Scala equivalent.
     * @param catalystValue (undocumented)
     * @return (undocumented)
     */
    public abstract  ScalaOutputType toScala (CatalystType catalystValue)  ;
    /**
     * Converts a Scala value to its Catalyst equivalent.
     * @param scalaValue the Scala value, guaranteed not to be null.
     * @return the Catalyst value.
     */
    protected abstract  CatalystType toCatalystImpl (ScalaInputType scalaValue)  ;
    /**
     * Given a Catalyst row, convert the value at column <code>column</code> to its Scala equivalent.
     * This method will only be called on non-null columns.
     * @param row (undocumented)
     * @param column (undocumented)
     * @return (undocumented)
     */
    protected abstract  ScalaOutputType toScalaImpl (org.apache.spark.sql.catalyst.InternalRow row, int column)  ;
  }
  static private  class DecimalConverter extends org.apache.spark.sql.catalyst.CatalystTypeConverters.CatalystTypeConverter<java.lang.Object, java.math.BigDecimal, org.apache.spark.sql.types.Decimal> {
    public   DecimalConverter (org.apache.spark.sql.types.DecimalType dataType)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.Decimal toCatalystImpl (Object scalaValue)  { throw new RuntimeException(); }
    public  java.math.BigDecimal toScala (org.apache.spark.sql.types.Decimal catalystValue)  { throw new RuntimeException(); }
    public  java.math.BigDecimal toScalaImpl (org.apache.spark.sql.catalyst.InternalRow row, int column)  { throw new RuntimeException(); }
  }
  static private abstract class PrimitiveConverter<T extends java.lang.Object> extends org.apache.spark.sql.catalyst.CatalystTypeConverters.CatalystTypeConverter<T, java.lang.Object, java.lang.Object> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   PrimitiveConverter ()  { throw new RuntimeException(); }
    public final  Object toScala (Object catalystValue)  { throw new RuntimeException(); }
    public final  Object toCatalystImpl (T scalaValue)  { throw new RuntimeException(); }
  }
  static private  boolean isPrimitive (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.CatalystTypeConverters.CatalystTypeConverter<java.lang.Object, java.lang.Object, java.lang.Object> getConverterForType (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Creates a converter function that will convert Scala objects to the specified Catalyst type.
   * Typical use case would be converting a collection of rows that have the same schema. You will
   * call this function once to get a converter, and apply it to every row.
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  static public  scala.Function1<java.lang.Object, java.lang.Object> createToCatalystConverter (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Creates a converter function that will convert Catalyst types to Scala type.
   * Typical use case would be converting a collection of rows that have the same schema. You will
   * call this function once to get a converter, and apply it to every row.
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  static public  scala.Function1<java.lang.Object, java.lang.Object> createToScalaConverter (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   *  Converts Scala objects to Catalyst rows / types.
   * <p>
   *  Note: This should be called before do evaluation on Row
   *        (It does not support UDT)
   *  This is used to create an RDD or test results with correct types for Catalyst.
   * @param a (undocumented)
   * @return (undocumented)
   */
  static public  Object convertToCatalyst (Object a)  { throw new RuntimeException(); }
  /**
   * Converts Catalyst types used internally in rows to standard Scala types
   * This method is slow, and for batch conversion you should be using converter
   * produced by createToScalaConverter.
   * @param catalystValue (undocumented)
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  static public  Object convertToScala (Object catalystValue, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
}
