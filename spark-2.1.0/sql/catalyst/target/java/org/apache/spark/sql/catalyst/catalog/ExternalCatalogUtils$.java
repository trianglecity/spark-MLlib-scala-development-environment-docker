package org.apache.spark.sql.catalyst.catalog;
public  class ExternalCatalogUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExternalCatalogUtils$ MODULE$ = null;
  public   ExternalCatalogUtils$ ()  { throw new RuntimeException(); }
  public  java.lang.String DEFAULT_PARTITION_NAME ()  { throw new RuntimeException(); }
  public  java.util.BitSet charToEscape ()  { throw new RuntimeException(); }
  /**
   * ASCII 01-1F are HTTP control characters that need to be escaped.
   * <p>
   and  are \n and \r, respectively.
   * @param c (undocumented)
   * @return (undocumented)
   */
  public  boolean needsEscaping (char c)  { throw new RuntimeException(); }
  public  java.lang.String escapePathName (java.lang.String path)  { throw new RuntimeException(); }
  public  java.lang.String unescapePathName (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.Path generatePartitionPath (scala.collection.immutable.Map<java.lang.String, java.lang.String> spec, scala.collection.Seq<java.lang.String> partitionColumnNames, org.apache.hadoop.fs.Path tablePath)  { throw new RuntimeException(); }
}
