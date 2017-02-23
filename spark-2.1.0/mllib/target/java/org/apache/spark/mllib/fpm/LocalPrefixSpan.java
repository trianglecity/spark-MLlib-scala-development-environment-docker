package org.apache.spark.mllib.fpm;
/**
 * Calculate all patterns of a projected database in local mode.
 * <p>
 * param:  minCount minimal count for a frequent pattern
 * param:  maxPatternLength max pattern length for a frequent pattern
 */
  class LocalPrefixSpan implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Represents a prefix stored as a list in reversed order.
   * param:  items items in the prefix in reversed order
   * param:  length length of the prefix, not counting delimiters
   */
  static public  class ReversedPrefix implements scala.Serializable {
    public  scala.collection.immutable.List<java.lang.Object> items ()  { throw new RuntimeException(); }
    public  int length ()  { throw new RuntimeException(); }
    // not preceding
    private   ReversedPrefix (scala.collection.immutable.List<java.lang.Object> items, int length)  { throw new RuntimeException(); }
    /**
     * Converts this prefix to a sequence.
     * @return (undocumented)
     */
    public  int[] toSequence ()  { throw new RuntimeException(); }
  }
  static public  class ReversedPrefix$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ReversedPrefix$ MODULE$ = null;
    public   ReversedPrefix$ ()  { throw new RuntimeException(); }
    /** An empty prefix. */
    public  org.apache.spark.mllib.fpm.LocalPrefixSpan.ReversedPrefix empty ()  { throw new RuntimeException(); }
  }
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
  public  long minCount ()  { throw new RuntimeException(); }
  public  int maxPatternLength ()  { throw new RuntimeException(); }
  // not preceding
  public   LocalPrefixSpan (long minCount, int maxPatternLength)  { throw new RuntimeException(); }
  /**
   * Generates frequent patterns on the input array of postfixes.
   * @param postfixes an array of postfixes
   * @return an iterator of (frequent pattern, count)
   */
  public  scala.collection.Iterator<scala.Tuple2<int[], java.lang.Object>> run (org.apache.spark.mllib.fpm.PrefixSpan.Postfix[] postfixes)  { throw new RuntimeException(); }
  /**
   * Recursively generates frequent patterns.
   * @param prefix current prefix
   * @param postfixes projected postfixes w.r.t. the prefix
   * @return an iterator of (prefix, count)
   */
  private  scala.collection.Iterator<scala.Tuple2<org.apache.spark.mllib.fpm.LocalPrefixSpan.ReversedPrefix, java.lang.Object>> genFreqPatterns (org.apache.spark.mllib.fpm.LocalPrefixSpan.ReversedPrefix prefix, org.apache.spark.mllib.fpm.PrefixSpan.Postfix[] postfixes)  { throw new RuntimeException(); }
}
