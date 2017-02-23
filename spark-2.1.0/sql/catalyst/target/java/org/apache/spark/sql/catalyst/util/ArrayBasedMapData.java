package org.apache.spark.sql.catalyst.util;
public  class ArrayBasedMapData extends org.apache.spark.sql.catalyst.util.MapData {
  /**
   * Creates a {@link ArrayBasedMapData} by applying the given converters over
   * each (key -> value) pair of the input {@link java.util.Map}
   * <p>
   * @param javaMap Input map
   * @param keyConverter This function is applied over all the keys of the input map to
   *                     obtain the output map's keys
   * @param valueConverter This function is applied over all the values of the input map to
   *                       obtain the output map's values
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.util.ArrayBasedMapData apply (java.util.Map<?, ?> javaMap, scala.Function1<java.lang.Object, java.lang.Object> keyConverter, scala.Function1<java.lang.Object, java.lang.Object> valueConverter)  { throw new RuntimeException(); }
  /**
   * Creates a {@link ArrayBasedMapData} by applying the given converters over
   * each (key -> value) pair of the input map
   * <p>
   * @param map Input map
   * @param keyConverter This function is applied over all the keys of the input map to
   *                     obtain the output map's keys
   * @param valueConverter This function is applied over all the values of the input map to
   *                       obtain the output map's values
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.util.ArrayBasedMapData apply (scala.collection.Map<?, ?> map, scala.Function1<java.lang.Object, java.lang.Object> keyConverter, scala.Function1<java.lang.Object, java.lang.Object> valueConverter)  { throw new RuntimeException(); }
  /**
   * Creates a {@link ArrayBasedMapData} by applying the given converters over
   * each (key -> value) pair from the given iterator
   * <p>
   * @param iterator Input iterator
   * @param size Number of elements
   * @param keyConverter This function is applied over all the keys extracted from the
   *                     given iterator to obtain the output map's keys
   * @param valueConverter This function is applied over all the values extracted from the
   *                       given iterator to obtain the output map's values
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.util.ArrayBasedMapData apply (scala.collection.Iterator<scala.Tuple2<?, ?>> iterator, int size, scala.Function1<java.lang.Object, java.lang.Object> keyConverter, scala.Function1<java.lang.Object, java.lang.Object> valueConverter)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.util.ArrayBasedMapData apply (java.lang.Object keys, java.lang.Object values)  { throw new RuntimeException(); }
  /**
   * Creates a {@link ArrayBasedMapData} by applying the given converters over
   * each (key -> value) pair from the given iterator
   * <p>
   * @param iterator Input iterator
   * @param size Number of elements
   * @param keyConverter This function is applied over all the keys extracted from the
   *                     given iterator to obtain the output map's keys
   * @param valueConverter This function is applied over all the values extracted from the
   *                       given iterator to obtain the output map's values
   * @param map (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> toScalaMap (org.apache.spark.sql.catalyst.util.ArrayBasedMapData map)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> toScalaMap (java.lang.Object[] keys, java.lang.Object[] values)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> toScalaMap (scala.collection.Seq<java.lang.Object> keys, scala.collection.Seq<java.lang.Object> values)  { throw new RuntimeException(); }
  static public  java.util.Map<java.lang.Object, java.lang.Object> toJavaMap (java.lang.Object[] keys, java.lang.Object[] values)  { throw new RuntimeException(); }
  static public  void foreach (org.apache.spark.sql.types.DataType keyType, org.apache.spark.sql.types.DataType valueType, scala.Function2<java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.util.ArrayData keyArray ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.util.ArrayData valueArray ()  { throw new RuntimeException(); }
  // not preceding
  public   ArrayBasedMapData (org.apache.spark.sql.catalyst.util.ArrayData keyArray, org.apache.spark.sql.catalyst.util.ArrayData valueArray)  { throw new RuntimeException(); }
  public  int numElements ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.util.MapData copy ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
