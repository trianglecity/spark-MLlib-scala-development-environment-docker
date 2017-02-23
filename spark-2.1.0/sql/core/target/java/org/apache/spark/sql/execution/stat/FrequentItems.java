package org.apache.spark.sql.execution.stat;
public  class FrequentItems {
  /** A helper class wrapping `MutableMap[Any, Long]` for simplicity. */
  static private  class FreqItemCounter implements scala.Serializable {
    public   FreqItemCounter (int size)  { throw new RuntimeException(); }
    public  scala.collection.mutable.Map<java.lang.Object, java.lang.Object> baseMap ()  { throw new RuntimeException(); }
    /**
     * Add a new example to the counts if it exists, otherwise deduct the count
     * from existing items.
     * @param key (undocumented)
     * @param count (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.execution.stat.FrequentItems.FreqItemCounter add (Object key, long count)  { throw new RuntimeException(); }
    /**
     * Merge two maps of counts.
     * @param other The map containing the counts for that partition
     * @return (undocumented)
     */
    public  org.apache.spark.sql.execution.stat.FrequentItems.FreqItemCounter merge (org.apache.spark.sql.execution.stat.FrequentItems.FreqItemCounter other)  { throw new RuntimeException(); }
  }
  /**
   * Finding frequent items for columns, possibly with false positives. Using the
   * frequent element count algorithm described in
   * <a href="http://dx.doi.org/10.1145/762471.762473">here</a>, proposed by Karp, Schenker,
   * and Papadimitriou.
   * The <code>support</code> should be greater than 1e-4.
   * For Internal use only.
   * <p>
   * @param df The input DataFrame
   * @param cols the names of the columns to search frequent items in
   * @param support The minimum frequency for an item to be considered <code>frequent</code>. Should be greater
   *                than 1e-4.
   * @return A Local DataFrame with the Array of frequent items for each column.
   */
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> singlePassFreqItems (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.Seq<java.lang.String> cols, double support)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
}
