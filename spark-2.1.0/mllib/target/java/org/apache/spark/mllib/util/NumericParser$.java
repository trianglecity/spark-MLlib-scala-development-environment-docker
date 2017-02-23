package org.apache.spark.mllib.util;
/**
 * Simple parser for a numeric structure consisting of three types:
 * <p>
 *  - number: a double in Java's floating number format
 *  - array: an array of numbers stored as <code>[v0,v1,...,vn]</code>
 *  - tuple: a list of numbers, arrays, or tuples stored as <code>(...)</code>
 */
public  class NumericParser$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final NumericParser$ MODULE$ = null;
  public   NumericParser$ ()  { throw new RuntimeException(); }
  /** Parses a string into a Double, an Array[Double], or a Seq[Any]. */
  public  Object parse (java.lang.String s)  { throw new RuntimeException(); }
  private  double[] parseArray (java.util.StringTokenizer tokenizer)  { throw new RuntimeException(); }
  private  scala.collection.Seq<?> parseTuple (java.util.StringTokenizer tokenizer)  { throw new RuntimeException(); }
  private  double parseDouble (java.lang.String s)  { throw new RuntimeException(); }
}
