package org.apache.spark.sql.catalyst.expressions;
/**
 * An extended version of {@link InternalRow} that implements all special getters, toString
 * and equals/hashCode by <code>genericGet</code>.
 */
public  interface BaseGenericInternalRow {
  public  Object genericGet (int ordinal)  ;
  public <T extends java.lang.Object> T getAs (int ordinal)  ;
  public  boolean isNullAt (int ordinal)  ;
  public  java.lang.Object get (int ordinal, org.apache.spark.sql.types.DataType dataType)  ;
  public  boolean getBoolean (int ordinal)  ;
  public  byte getByte (int ordinal)  ;
  public  short getShort (int ordinal)  ;
  public  int getInt (int ordinal)  ;
  public  long getLong (int ordinal)  ;
  public  float getFloat (int ordinal)  ;
  public  double getDouble (int ordinal)  ;
  public  org.apache.spark.sql.types.Decimal getDecimal (int ordinal, int precision, int scale)  ;
  public  org.apache.spark.unsafe.types.UTF8String getUTF8String (int ordinal)  ;
  public  byte[] getBinary (int ordinal)  ;
  public  org.apache.spark.sql.catalyst.util.ArrayData getArray (int ordinal)  ;
  public  org.apache.spark.unsafe.types.CalendarInterval getInterval (int ordinal)  ;
  public  org.apache.spark.sql.catalyst.util.MapData getMap (int ordinal)  ;
  public  org.apache.spark.sql.catalyst.InternalRow getStruct (int ordinal, int numFields)  ;
  public  boolean anyNull ()  ;
  public  java.lang.String toString ()  ;
  public  boolean equals (Object o)  ;
  public  int hashCode ()  ;
}
