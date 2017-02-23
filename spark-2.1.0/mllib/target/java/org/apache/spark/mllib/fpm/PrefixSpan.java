package org.apache.spark.mllib.fpm;
/**
 * A parallel PrefixSpan algorithm to mine frequent sequential patterns.
 * The PrefixSpan algorithm is described in J. Pei, et al., PrefixSpan: Mining Sequential Patterns
 * Efficiently by Prefix-Projected Pattern Growth
 * (see <a href="http://doi.org/10.1109/ICDE.2001.914830">here</a>).
 * <p>
 * param:  minSupport the minimal support level of the sequential pattern, any pattern that appears
 *                   more than (minSupport * size-of-the-dataset) times will be output
 * param:  maxPatternLength the maximal length of the sequential pattern, any pattern that appears
 *                         less than maxPatternLength will be output
 * param:  maxLocalProjDBSize The maximum number of items (including delimiters used in the internal
 *                           storage format) allowed in a projected database before local
 *                           processing. If a projected database exceeds this size, another
 *                           iteration of distributed prefix growth is run.
 * <p>
 * @see <a href="https://en.wikipedia.org/wiki/Sequential_Pattern_Mining">Sequential Pattern Mining
 * (Wikipedia)</a>
 */
public  class PrefixSpan implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Represents a prefix.
   * param:  items items in this prefix, using the internal format
   * param:  length length of this prefix, not counting 0
   */
  static   class Prefix implements scala.Serializable {
    public  int[] items ()  { throw new RuntimeException(); }
    public  int length ()  { throw new RuntimeException(); }
    // not preceding
    private   Prefix (int[] items, int length)  { throw new RuntimeException(); }
    /** A unique id for this prefix. */
    public  int id ()  { throw new RuntimeException(); }
  }
  static public  class Prefix$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Prefix$ MODULE$ = null;
    public   Prefix$ ()  { throw new RuntimeException(); }
    /** Internal counter to generate unique IDs. */
    private  java.util.concurrent.atomic.AtomicInteger counter ()  { throw new RuntimeException(); }
    /** Gets the next unique ID. */
    private  int nextId ()  { throw new RuntimeException(); }
    /** An empty {@link Prefix} instance. */
    public  org.apache.spark.mllib.fpm.PrefixSpan.Prefix empty ()  { throw new RuntimeException(); }
  }
  /**
   * An internal representation of a postfix from some projection.
   * We use one int array to store the items, which might also contains other items from the
   * original sequence.
   * Items are represented by positive integers, and items in each itemset must be distinct and
   * ordered.
   * we use 0 as the delimiter between itemsets.
   * For example, a sequence <code>(12)(31)1</code> is represented by <code>[0, 1, 2, 0, 1, 3, 0, 1, 0]</code>.
   * The postfix of this sequence w.r.t. to prefix <code>1</code> is <code>(_2)(13)1</code>.
   * We may reuse the original items array <code>[0, 1, 2, 0, 1, 3, 0, 1, 0]</code> to represent the postfix,
   * and mark the start index of the postfix, which is <code>2</code> in this example.
   * So the active items in this postfix are <code>[2, 0, 1, 3, 0, 1, 0]</code>.
   * We also remember the start indices of partial projections, the ones that split an itemset.
   * For example, another possible partial projection w.r.t. <code>1</code> is <code>(_3)1</code>.
   * We remember the start indices of partial projections, which is <code>[2, 5]</code> in this example.
   * This data structure makes it easier to do projections.
   * <p>
   * param:  items a sequence stored as <code>Array[Int]</code> containing this postfix
   * param:  start the start index of this postfix in items
   * param:  partialStarts start indices of possible partial projections, strictly increasing
   */
  static   class Postfix implements scala.Serializable {
    public  int[] items ()  { throw new RuntimeException(); }
    public  int start ()  { throw new RuntimeException(); }
    public  int[] partialStarts ()  { throw new RuntimeException(); }
    // not preceding
    public   Postfix (int[] items, int start, int[] partialStarts)  { throw new RuntimeException(); }
    /**
     * Start index of the first full itemset contained in this postfix.
     * @return (undocumented)
     */
    private  int fullStart ()  { throw new RuntimeException(); }
    /**
     * Generates length-1 prefix items of this postfix with the corresponding postfix sizes.
     * There are two types of prefix items:
     *   a) The item can be assembled to the last itemset of the prefix. For example,
     *      the postfix of <code><(12)(123)>1</code> w.r.t. <code><1></code> is <code><(_2)(123)1></code>. The prefix items of this
     *      postfix can be assembled to <code><1></code> is <code>_2</code> and <code>_3</code>, resulting new prefixes <code><(12)></code> and
     *      <code><(13)></code>. We flip the sign in the output to indicate that this is a partial prefix item.
     *   b) The item can be appended to the prefix. Taking the same example above, the prefix items
     *      can be appended to <code><1></code> is <code>1</code>, <code>2</code>, and <code>3</code>, resulting new prefixes <code><11></code>, <code><12></code>,
     *      and <code><13></code>.
     * @return an iterator of (prefix item, corresponding postfix size). If the item is negative, it
     *         indicates a partial prefix item, which should be assembled to the last itemset of the
     *         current prefix. Otherwise, the item should be appended to the current prefix.
     */
    public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> genPrefixItems ()  { throw new RuntimeException(); }
    /** Tests whether this postfix is non-empty. */
    public  boolean nonEmpty ()  { throw new RuntimeException(); }
    /**
     * Projects this postfix with respect to the input prefix item.
     * @param prefix prefix item. If prefix is positive, we match items in any full itemset; if it
     *               is negative, we do partial projections.
     * @return the projected postfix
     */
    public  org.apache.spark.mllib.fpm.PrefixSpan.Postfix project (int prefix)  { throw new RuntimeException(); }
    /**
     * Projects this postfix with respect to the input prefix.
     * @param prefix (undocumented)
     * @return (undocumented)
     */
    private  org.apache.spark.mllib.fpm.PrefixSpan.Postfix project (int[] prefix)  { throw new RuntimeException(); }
    /**
     * Projects this postfix with respect to the input prefix.
     * @param prefix (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.mllib.fpm.PrefixSpan.Postfix project (org.apache.spark.mllib.fpm.PrefixSpan.Prefix prefix)  { throw new RuntimeException(); }
    /**
     * Returns the same sequence with compressed storage if possible.
     * @return (undocumented)
     */
    public  org.apache.spark.mllib.fpm.PrefixSpan.Postfix compressed ()  { throw new RuntimeException(); }
  }
  static public  class Postfix$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Postfix$ MODULE$ = null;
    public   Postfix$ ()  { throw new RuntimeException(); }
  }
  /**
   * Represents a frequent sequence.
   * param:  sequence a sequence of itemsets stored as an Array of Arrays
   * param:  freq frequency
   * @tparam Item item type
   */
  static public  class FreqSequence<Item extends java.lang.Object> implements scala.Serializable {
    public  java.lang.Object[] sequence ()  { throw new RuntimeException(); }
    public  long freq ()  { throw new RuntimeException(); }
    // not preceding
    public   FreqSequence (java.lang.Object[] sequence, long freq)  { throw new RuntimeException(); }
    /**
     * Returns sequence as a Java List of lists for Java users.
     * @return (undocumented)
     */
    public  java.util.List<java.util.List<Item>> javaSequence ()  { throw new RuntimeException(); }
  }
  /**
   * Find the complete set of frequent sequential patterns in the input sequences.
   * @param data ordered sequences of itemsets. We represent a sequence internally as Array[Int],
   *             where each itemset is represented by a contiguous sequence of distinct and ordered
   *             positive integers. We use 0 as the delimiter at itemset boundaries, including the
   *             first and the last position.
   * @return an RDD of (frequent sequential pattern, count) pairs,
   * @see Postfix
   * @param minCount (undocumented)
   * @param maxPatternLength (undocumented)
   * @param maxLocalProjDBSize (undocumented)
   */
  static   org.apache.spark.rdd.RDD<scala.Tuple2<int[], java.lang.Object>> genFreqPatterns (org.apache.spark.rdd.RDD<int[]> data, long minCount, int maxPatternLength, long maxLocalProjDBSize)  { throw new RuntimeException(); }
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
  private  double minSupport ()  { throw new RuntimeException(); }
  private  int maxPatternLength ()  { throw new RuntimeException(); }
  private  long maxLocalProjDBSize ()  { throw new RuntimeException(); }
  // not preceding
  private   PrefixSpan (double minSupport, int maxPatternLength, long maxLocalProjDBSize)  { throw new RuntimeException(); }
  /**
   * Constructs a default instance with default parameters
   * {minSupport: <code>0.1</code>, maxPatternLength: <code>10</code>, maxLocalProjDBSize: <code>32000000L</code>}.
   */
  public   PrefixSpan ()  { throw new RuntimeException(); }
  /**
   * Get the minimal support (i.e. the frequency of occurrence before a pattern is considered
   * frequent).
   * @return (undocumented)
   */
  public  double getMinSupport ()  { throw new RuntimeException(); }
  /**
   * Sets the minimal support level (default: <code>0.1</code>).
   * @param minSupport (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.fpm.PrefixSpan setMinSupport (double minSupport)  { throw new RuntimeException(); }
  /**
   * Gets the maximal pattern length (i.e. the length of the longest sequential pattern to consider.
   * @return (undocumented)
   */
  public  int getMaxPatternLength ()  { throw new RuntimeException(); }
  /**
   * Sets maximal pattern length (default: <code>10</code>).
   * @param maxPatternLength (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.fpm.PrefixSpan setMaxPatternLength (int maxPatternLength)  { throw new RuntimeException(); }
  /**
   * Gets the maximum number of items allowed in a projected database before local processing.
   * @return (undocumented)
   */
  public  long getMaxLocalProjDBSize ()  { throw new RuntimeException(); }
  /**
   * Sets the maximum number of items (including delimiters used in the internal storage format)
   * allowed in a projected database before local processing (default: <code>32000000L</code>).
   * @param maxLocalProjDBSize (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.fpm.PrefixSpan setMaxLocalProjDBSize (long maxLocalProjDBSize)  { throw new RuntimeException(); }
  /**
   * Finds the complete set of frequent sequential patterns in the input sequences of itemsets.
   * @param data sequences of itemsets.
   * @return a {@link PrefixSpanModel} that contains the frequent patterns
   * @param evidence$1 (undocumented)
   */
  public <Item extends java.lang.Object> org.apache.spark.mllib.fpm.PrefixSpanModel<Item> run (org.apache.spark.rdd.RDD<java.lang.Object[]> data, scala.reflect.ClassTag<Item> evidence$1)  { throw new RuntimeException(); }
  /**
   * A Java-friendly version of <code>run()</code> that reads sequences from a <code>JavaRDD</code> and returns
   * frequent sequences in a {@link PrefixSpanModel}.
   * @param data ordered sequences of itemsets stored as Java Iterable of Iterables
   * @tparam Item item type
   * @tparam Itemset itemset type, which is an Iterable of Items
   * @tparam Sequence sequence type, which is an Iterable of Itemsets
   * @return a {@link PrefixSpanModel} that contains the frequent sequential patterns
   */
  public <Item extends java.lang.Object, Itemset extends java.lang.Iterable<Item>, Sequence extends java.lang.Iterable<Itemset>> org.apache.spark.mllib.fpm.PrefixSpanModel<Item> run (org.apache.spark.api.java.JavaRDD<Sequence> data)  { throw new RuntimeException(); }
}
