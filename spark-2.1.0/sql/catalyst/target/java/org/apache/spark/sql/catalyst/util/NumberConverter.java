package org.apache.spark.sql.catalyst.util;
public  class NumberConverter {
  /**
   * Divide x by m as if x is an unsigned 64-bit integer. Examples:
   * unsignedLongDiv(-1, 2) == Long.MAX_VALUE unsignedLongDiv(6, 3) == 2
   * unsignedLongDiv(0, 5) == 0
   * <p>
   * @param x is treated as unsigned
   * @param m is treated as signed
   * @return (undocumented)
   */
  static private  long unsignedLongDiv (long x, int m)  { throw new RuntimeException(); }
  /**
   * Decode v into value[].
   * <p>
   * @param v is treated as an unsigned 64-bit integer
   * @param radix must be between MIN_RADIX and MAX_RADIX
   * @param value (undocumented)
   */
  static private  void decode (long v, int radix, byte[] value)  { throw new RuntimeException(); }
  /**
   * Convert value[] into a long. On overflow, return -1 (as mySQL does). If a
   * negative digit is found, ignore the suffix starting there.
   * <p>
   * @param radix  must be between MIN_RADIX and MAX_RADIX
   * @param fromPos is the first element that should be considered
   * @return the result should be treated as an unsigned 64-bit integer.
   * @param value (undocumented)
   */
  static private  long encode (int radix, int fromPos, byte[] value)  { throw new RuntimeException(); }
  /**
   * Convert the bytes in value[] to the corresponding chars.
   * <p>
   * @param radix must be between MIN_RADIX and MAX_RADIX
   * @param fromPos is the first nonzero element
   * @param value (undocumented)
   */
  static private  void byte2char (int radix, int fromPos, byte[] value)  { throw new RuntimeException(); }
  /**
   * Convert the chars in value[] to the corresponding integers. Convert invalid
   * characters to -1.
   * <p>
   * @param radix must be between MIN_RADIX and MAX_RADIX
   * @param fromPos is the first nonzero element
   * @param value (undocumented)
   */
  static private  void char2byte (int radix, int fromPos, byte[] value)  { throw new RuntimeException(); }
  /**
   * Convert numbers between different number bases. If toBase>0 the result is
   * unsigned, otherwise it is signed.
   * NB: This logic is borrowed from org.apache.hadoop.hive.ql.ud.UDFConv
   * @param n (undocumented)
   * @param fromBase (undocumented)
   * @param toBase (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.UTF8String convert (byte[] n, int fromBase, int toBase)  { throw new RuntimeException(); }
}
