package org.apache.spark.sql.internal;
public  class HiveSerDe$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HiveSerDe$ MODULE$ = null;
  public   HiveSerDe$ ()  { throw new RuntimeException(); }
  /**
   * Get the Hive SerDe information from the data source abbreviation string or classname.
   * <p>
   * @param source Currently the source abbreviation can be one of the following:
   *               SequenceFile, RCFile, ORC, PARQUET, and case insensitive.
   * @return HiveSerDe associated with the specified source
   */
  public  scala.Option<org.apache.spark.sql.internal.HiveSerDe> sourceToSerDe (java.lang.String source)  { throw new RuntimeException(); }
}
