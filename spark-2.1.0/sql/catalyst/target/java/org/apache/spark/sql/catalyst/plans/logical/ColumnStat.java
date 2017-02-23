package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Statistics collected for a column.
 * <p>
 * 1. Supported data types are defined in <code>ColumnStat.supportsType</code>.
 * 2. The JVM data type stored in min/max is the external data type (used in Row) for the
 * corresponding Catalyst data type. For example, for DateType we store java.sql.Date, and for
 * TimestampType we store java.sql.Timestamp.
 * 3. For integral types, they are all upcasted to longs, i.e. shorts are stored as longs.
 * 4. There is no guarantee that the statistics collected are accurate. Approximation algorithms
 *    (sketches) might have been used, and the data collected can also be stale.
 * <p>
 * param:  distinctCount number of distinct values
 * param:  min minimum value
 * param:  max maximum value
 * param:  nullCount number of nulls
 * param:  avgLen average length of the values. For fixed-length types, this should be a constant.
 * param:  maxLen maximum length of the values. For fixed-length types, this should be a constant.
 */
public  class ColumnStat implements scala.Product, scala.Serializable {
  static public  java.lang.String KEY_VERSION ()  { throw new RuntimeException(); }
  static private  java.lang.String KEY_DISTINCT_COUNT ()  { throw new RuntimeException(); }
  static private  java.lang.String KEY_MIN_VALUE ()  { throw new RuntimeException(); }
  static private  java.lang.String KEY_MAX_VALUE ()  { throw new RuntimeException(); }
  static private  java.lang.String KEY_NULL_COUNT ()  { throw new RuntimeException(); }
  static private  java.lang.String KEY_AVG_LEN ()  { throw new RuntimeException(); }
  static private  java.lang.String KEY_MAX_LEN ()  { throw new RuntimeException(); }
  /** Returns true iff the we support gathering column statistics on column of the given type. */
  static public  boolean supportsType (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Creates a {@link ColumnStat} object from the given map. This is used to deserialize column stats
   * from some external storage. The serialization side is defined in {@link ColumnStat.toMap}.
   * @param table (undocumented)
   * @param field (undocumented)
   * @param map (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.ColumnStat> fromMap (java.lang.String table, org.apache.spark.sql.types.StructField field, scala.collection.immutable.Map<java.lang.String, java.lang.String> map)  { throw new RuntimeException(); }
  /**
   * Constructs an expression to compute column statistics for a given column.
   * <p>
   * The expression should create a single struct column with the following schema:
   * distinctCount: Long, min: T, max: T, nullCount: Long, avgLen: Long, maxLen: Long
   * <p>
   * Together with {@link rowToColumnStat}, this function is used to create {@link ColumnStat} and
   * as a result should stay in sync with it.
   * @param col (undocumented)
   * @param relativeSD (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.expressions.CreateNamedStruct statExprs (org.apache.spark.sql.catalyst.expressions.Attribute col, double relativeSD)  { throw new RuntimeException(); }
  /** Convert a struct for column stats (defined in statExprs) into {@link ColumnStat}. */
  static public  org.apache.spark.sql.catalyst.plans.logical.ColumnStat rowToColumnStat (org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.math.BigInt distinctCount ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> min ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> max ()  { throw new RuntimeException(); }
  public  scala.math.BigInt nullCount ()  { throw new RuntimeException(); }
  public  long avgLen ()  { throw new RuntimeException(); }
  public  long maxLen ()  { throw new RuntimeException(); }
  // not preceding
  public   ColumnStat (scala.math.BigInt distinctCount, scala.Option<java.lang.Object> min, scala.Option<java.lang.Object> max, scala.math.BigInt nullCount, long avgLen, long maxLen)  { throw new RuntimeException(); }
  /**
   * Returns a map from string to string that can be used to serialize the column stats.
   * The key is the name of the field (e.g. "distinctCount" or "min"), and the value is the string
   * representation for the value. The deserialization side is defined in {@link ColumnStat.fromMap}.
   * <p>
   * As part of the protocol, the returned map always contains a key called "version".
   * In the case min/max values are null (None), they won't appear in the map.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> toMap ()  { throw new RuntimeException(); }
}
