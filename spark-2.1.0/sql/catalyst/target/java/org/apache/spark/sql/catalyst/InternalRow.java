package org.apache.spark.sql.catalyst;
/**
 * An abstract class for row used internally in Spark SQL, which only contains the columns as
 * internal types.
 */
public abstract class InternalRow implements org.apache.spark.sql.catalyst.expressions.SpecializedGetters, scala.Serializable {
  /**
   * This method can be used to construct a {@link InternalRow} with the given values.
   * @param values (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.InternalRow apply (scala.collection.Seq<java.lang.Object> values)  { throw new RuntimeException(); }
  /**
   * This method can be used to construct a {@link InternalRow} from a {@link Seq} of values.
   * @param values (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.InternalRow fromSeq (scala.collection.Seq<java.lang.Object> values)  { throw new RuntimeException(); }
  /** Returns an empty {@link InternalRow}. */
  static public  org.apache.spark.sql.catalyst.InternalRow empty ()  { throw new RuntimeException(); }
  static public abstract  boolean isNullAt (int ordinal)  ;
  static public abstract  boolean getBoolean (int ordinal)  ;
  static public abstract  byte getByte (int ordinal)  ;
  static public abstract  short getShort (int ordinal)  ;
  static public abstract  int getInt (int ordinal)  ;
  static public abstract  long getLong (int ordinal)  ;
  static public abstract  float getFloat (int ordinal)  ;
  static public abstract  double getDouble (int ordinal)  ;
  static public abstract  org.apache.spark.sql.types.Decimal getDecimal (int ordinal, int precision, int scale)  ;
  static public abstract  org.apache.spark.unsafe.types.UTF8String getUTF8String (int ordinal)  ;
  static public abstract  byte[] getBinary (int ordinal)  ;
  static public abstract  org.apache.spark.unsafe.types.CalendarInterval getInterval (int ordinal)  ;
  static public abstract  org.apache.spark.sql.catalyst.InternalRow getStruct (int ordinal, int numFields)  ;
  static public abstract  org.apache.spark.sql.catalyst.util.ArrayData getArray (int ordinal)  ;
  static public abstract  org.apache.spark.sql.catalyst.util.MapData getMap (int ordinal)  ;
  static public abstract  java.lang.Object get (int ordinal, org.apache.spark.sql.types.DataType dataType)  ;
  public   InternalRow ()  { throw new RuntimeException(); }
  public abstract  int numFields ()  ;
  public  java.lang.String getString (int ordinal)  { throw new RuntimeException(); }
  public abstract  void setNullAt (int i)  ;
  public abstract  void update (int i, Object value)  ;
  public  void setBoolean (int i, boolean value)  { throw new RuntimeException(); }
  public  void setByte (int i, byte value)  { throw new RuntimeException(); }
  public  void setShort (int i, short value)  { throw new RuntimeException(); }
  public  void setInt (int i, int value)  { throw new RuntimeException(); }
  public  void setLong (int i, long value)  { throw new RuntimeException(); }
  public  void setFloat (int i, float value)  { throw new RuntimeException(); }
  public  void setDouble (int i, double value)  { throw new RuntimeException(); }
  /**
   * Update the decimal column at <code>i</code>.
   * <p>
   * Note: In order to support update decimal with precision > 18 in UnsafeRow,
   * CAN NOT call setNullAt() for decimal column on UnsafeRow, call setDecimal(i, null, precision).
   * @param i (undocumented)
   * @param value (undocumented)
   * @param precision (undocumented)
   */
  public  void setDecimal (int i, org.apache.spark.sql.types.Decimal value, int precision)  { throw new RuntimeException(); }
  /**
   * Make a copy of the current {@link InternalRow} object.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.catalyst.InternalRow copy ()  ;
  /** Returns true if there are any NULL values in this row. */
  public abstract  boolean anyNull ()  ;
  /**
   * Return a Scala Seq representing the row. Elements are placed in the same order in the Seq.
   * @param fieldTypes (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.Object> toSeq (scala.collection.Seq<org.apache.spark.sql.types.DataType> fieldTypes)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> toSeq (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
