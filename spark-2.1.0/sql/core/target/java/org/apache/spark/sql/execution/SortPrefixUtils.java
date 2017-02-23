package org.apache.spark.sql.execution;
public  class SortPrefixUtils {
  /**
   * A dummy prefix comparator which always claims that prefixes are equal. This is used in cases
   * where we don't know how to generate or compare prefixes for a SortOrder.
   */
  static private  class NoOpPrefixComparator$ extends org.apache.spark.util.collection.unsafe.sort.PrefixComparator {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NoOpPrefixComparator$ MODULE$ = null;
    public   NoOpPrefixComparator$ ()  { throw new RuntimeException(); }
    public  int compare (long prefix1, long prefix2)  { throw new RuntimeException(); }
  }
  /**
   * Dummy sort prefix result to use for empty rows.
   * @return (undocumented)
   */
  static private  org.apache.spark.sql.execution.UnsafeExternalRowSorter.PrefixComputer.Prefix emptyPrefix ()  { throw new RuntimeException(); }
  static public  org.apache.spark.util.collection.unsafe.sort.PrefixComparator getPrefixComparator (org.apache.spark.sql.catalyst.expressions.SortOrder sortOrder)  { throw new RuntimeException(); }
  static private  org.apache.spark.util.collection.unsafe.sort.PrefixComparator stringPrefixComparator (org.apache.spark.sql.catalyst.expressions.SortOrder sortOrder)  { throw new RuntimeException(); }
  static private  org.apache.spark.util.collection.unsafe.sort.PrefixComparator binaryPrefixComparator (org.apache.spark.sql.catalyst.expressions.SortOrder sortOrder)  { throw new RuntimeException(); }
  static private  org.apache.spark.util.collection.unsafe.sort.PrefixComparator longPrefixComparator (org.apache.spark.sql.catalyst.expressions.SortOrder sortOrder)  { throw new RuntimeException(); }
  static private  org.apache.spark.util.collection.unsafe.sort.PrefixComparator doublePrefixComparator (org.apache.spark.sql.catalyst.expressions.SortOrder sortOrder)  { throw new RuntimeException(); }
  /**
   * Creates the prefix comparator for the first field in the given schema, in ascending order.
   * @param schema (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.util.collection.unsafe.sort.PrefixComparator getPrefixComparator (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Returns whether the specified SortOrder can be satisfied with a radix sort on the prefix.
   * @param sortOrder (undocumented)
   * @return (undocumented)
   */
  static public  boolean canSortFullyWithPrefix (org.apache.spark.sql.catalyst.expressions.SortOrder sortOrder)  { throw new RuntimeException(); }
  /**
   * Returns whether the fully sorting on the specified key field is possible with radix sort.
   * @param field (undocumented)
   * @return (undocumented)
   */
  static public  boolean canSortFullyWithPrefix (org.apache.spark.sql.types.StructField field)  { throw new RuntimeException(); }
  /**
   * Creates the prefix computer for the first field in the given schema, in ascending order.
   * @param schema (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.execution.UnsafeExternalRowSorter.PrefixComputer createPrefixGenerator (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
