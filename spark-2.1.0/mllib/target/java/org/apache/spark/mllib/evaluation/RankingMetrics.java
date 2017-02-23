package org.apache.spark.mllib.evaluation;
/**
 * Evaluator for ranking algorithms.
 * <p>
 * Java users should use <code>RankingMetrics$.of</code> to create a {@link RankingMetrics} instance.
 * <p>
 * param:  predictionAndLabels an RDD of (predicted ranking, ground truth set) pairs.
 */
public  class RankingMetrics<T extends java.lang.Object> implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Creates a {@link RankingMetrics} instance (for Java users).
   * @param predictionAndLabels a JavaRDD of (predicted ranking, ground truth set) pairs
   * @return (undocumented)
   */
  static public <E extends java.lang.Object, T extends java.lang.Iterable<E>> org.apache.spark.mllib.evaluation.RankingMetrics<E> of (org.apache.spark.api.java.JavaRDD<scala.Tuple2<T, T>> predictionAndLabels)  { throw new RuntimeException(); }
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
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   RankingMetrics (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> predictionAndLabels, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * Compute the average precision of all the queries, truncated at ranking position k.
   * <p>
   * If for a query, the ranking algorithm returns n (n is less than k) results, the precision
   * value will be computed as #(relevant items retrieved) / k. This formula also applies when
   * the size of the ground truth set is less than k.
   * <p>
   * If a query has an empty ground truth set, zero will be used as precision together with
   * a log warning.
   * <p>
   * See the following paper for detail:
   * <p>
   * IR evaluation methods for retrieving highly relevant documents. K. Jarvelin and J. Kekalainen
   * <p>
   * @param k the position to compute the truncated precision, must be positive
   * @return the average precision at the first k ranking positions
   */
  public  double precisionAt (int k)  { throw new RuntimeException(); }
  /**
   * Returns the mean average precision (MAP) of all the queries.
   * If a query has an empty ground truth set, the average precision will be zero and a log
   * warning is generated.
   * @return (undocumented)
   */
  public  double meanAveragePrecision ()  { throw new RuntimeException(); }
  /**
   * Compute the average NDCG value of all the queries, truncated at ranking position k.
   * The discounted cumulative gain at position k is computed as:
   *    sum,,i=1,,^k^ (2^{relevance of ''i''th item}^ - 1) / log(i + 1),
   * and the NDCG is obtained by dividing the DCG value on the ground truth set. In the current
   * implementation, the relevance value is binary.
   * <p>
   * If a query has an empty ground truth set, zero will be used as ndcg together with
   * a log warning.
   * <p>
   * See the following paper for detail:
   * <p>
   * IR evaluation methods for retrieving highly relevant documents. K. Jarvelin and J. Kekalainen
   * <p>
   * @param k the position to compute the truncated ndcg, must be positive
   * @return the average ndcg at the first k ranking positions
   */
  public  double ndcgAt (int k)  { throw new RuntimeException(); }
}
