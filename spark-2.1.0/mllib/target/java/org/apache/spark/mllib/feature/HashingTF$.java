package org.apache.spark.mllib.feature;
public  class HashingTF$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HashingTF$ MODULE$ = null;
  public   HashingTF$ ()  { throw new RuntimeException(); }
    java.lang.String Native ()  { throw new RuntimeException(); }
    java.lang.String Murmur3 ()  { throw new RuntimeException(); }
  private  int seed ()  { throw new RuntimeException(); }
  /**
   * Calculate a hash code value for the term object using the native Scala implementation.
   * This is the default hash algorithm used in Spark 1.6 and earlier.
   * @param term (undocumented)
   * @return (undocumented)
   */
    int nativeHash (Object term)  { throw new RuntimeException(); }
  /**
   * Calculate a hash code value for the term object using
   * Austin Appleby's MurmurHash 3 algorithm (MurmurHash3_x86_32).
   * This is the default hash algorithm used from Spark 2.0 onwards.
   * @param term (undocumented)
   * @return (undocumented)
   */
    int murmur3Hash (Object term)  { throw new RuntimeException(); }
}
