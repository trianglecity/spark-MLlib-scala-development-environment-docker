package org.apache.spark.sql.catalyst.util;
public  class StringUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StringUtils$ MODULE$ = null;
  public   StringUtils$ ()  { throw new RuntimeException(); }
  public  java.lang.String escapeLikeRegex (java.lang.String v)  { throw new RuntimeException(); }
  public  boolean isTrueString (org.apache.spark.unsafe.types.UTF8String s)  { throw new RuntimeException(); }
  public  boolean isFalseString (org.apache.spark.unsafe.types.UTF8String s)  { throw new RuntimeException(); }
  /**
   * This utility can be used for filtering pattern in the "Like" of "Show Tables / Functions" DDL
   * @param names the names list to be filtered
   * @param pattern the filter pattern, only '*' and '|' are allowed as wildcards, others will
   *                follow regular expression convention, case insensitive match and white spaces
   *                on both ends will be ignored
   * @return the filtered names list in order
   */
  public  scala.collection.Seq<java.lang.String> filterPattern (scala.collection.Seq<java.lang.String> names, java.lang.String pattern)  { throw new RuntimeException(); }
}
