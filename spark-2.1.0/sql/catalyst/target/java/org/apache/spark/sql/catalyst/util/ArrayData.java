package org.apache.spark.sql.catalyst.util;
public abstract class ArrayData implements org.apache.spark.sql.catalyst.expressions.SpecializedGetters, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.util.ArrayData toArrayData (Object input)  { throw new RuntimeException(); }
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
  public   ArrayData ()  { throw new RuntimeException(); }
  public abstract  int numElements ()  ;
  public abstract  org.apache.spark.sql.catalyst.util.ArrayData copy ()  ;
  public abstract  java.lang.Object[] array ()  ;
  public  boolean[] toBooleanArray ()  { throw new RuntimeException(); }
  public  byte[] toByteArray ()  { throw new RuntimeException(); }
  public  short[] toShortArray ()  { throw new RuntimeException(); }
  public  int[] toIntArray ()  { throw new RuntimeException(); }
  public  long[] toLongArray ()  { throw new RuntimeException(); }
  public  float[] toFloatArray ()  { throw new RuntimeException(); }
  public  double[] toDoubleArray ()  { throw new RuntimeException(); }
  public  java.lang.Object[] toObjectArray (org.apache.spark.sql.types.DataType elementType)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> java.lang.Object toArray (org.apache.spark.sql.types.DataType elementType, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  void foreach (org.apache.spark.sql.types.DataType elementType, scala.Function2<java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
}
