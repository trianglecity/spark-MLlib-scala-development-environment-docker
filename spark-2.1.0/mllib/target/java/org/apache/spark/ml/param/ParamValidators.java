package org.apache.spark.ml.param;
/**
 * :: DeveloperApi ::
 * Factory methods for common validation functions for <code>Param.isValid</code>.
 * The numerical methods only support Int, Long, Float, and Double.
 */
public  class ParamValidators {
  /** (private[param]) Default validation always return true */
  static  <T extends java.lang.Object> scala.Function1<T, java.lang.Object> alwaysTrue ()  { throw new RuntimeException(); }
  /**
   * Private method for checking numerical types and converting to Double.
   * This is mainly for the sake of compilation; type checks are really handled
   * by {@link Params} setters and the {@link ParamPair} constructor.
   * @param value (undocumented)
   * @return (undocumented)
   */
  static private <T extends java.lang.Object> double getDouble (T value)  { throw new RuntimeException(); }
  /**
   * Check if value is greater than lowerBound
   * @param lowerBound (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> gt (double lowerBound)  { throw new RuntimeException(); }
  /**
   * Check if value is greater than or equal to lowerBound
   * @param lowerBound (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> gtEq (double lowerBound)  { throw new RuntimeException(); }
  /**
   * Check if value is less than upperBound
   * @param upperBound (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> lt (double upperBound)  { throw new RuntimeException(); }
  /**
   * Check if value is less than or equal to upperBound
   * @param upperBound (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> ltEq (double upperBound)  { throw new RuntimeException(); }
  /**
   * Check for value in range lowerBound to upperBound.
   * <p>
   * @param lowerInclusive if true, range includes value = lowerBound
   * @param upperInclusive if true, range includes value = upperBound
   * @param lowerBound (undocumented)
   * @param upperBound (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> inRange (double lowerBound, double upperBound, boolean lowerInclusive, boolean upperInclusive)  { throw new RuntimeException(); }
  /** Version of `inRange()` which uses inclusive be default: [lowerBound, upperBound] */
  static public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> inRange (double lowerBound, double upperBound)  { throw new RuntimeException(); }
  /** Check for value in an allowed set of values. */
  static public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> inArray (java.lang.Object allowed)  { throw new RuntimeException(); }
  /** Check for value in an allowed set of values. */
  static public <T extends java.lang.Object> scala.Function1<T, java.lang.Object> inArray (java.util.List<T> allowed)  { throw new RuntimeException(); }
  /** Check that the array length is greater than lowerBound. */
  static public <T extends java.lang.Object> scala.Function1<java.lang.Object, java.lang.Object> arrayLengthGt (double lowerBound)  { throw new RuntimeException(); }
}
