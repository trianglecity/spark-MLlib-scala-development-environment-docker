package org.apache.spark.mllib.feature;
/**
 * Creates a ChiSquared feature selector.
 * The selector supports different selection methods: <code>numTopFeatures</code>, <code>percentile</code>, <code>fpr</code>.
 *  - <code>numTopFeatures</code> chooses a fixed number of top features according to a chi-squared test.
 *  - <code>percentile</code> is similar but chooses a fraction of all features instead of a fixed number.
 *  - <code>fpr</code> chooses all features whose p-value is below a threshold, thus controlling the false
 *    positive rate of selection.
 * By default, the selection method is <code>numTopFeatures</code>, with the default number of top features
 * set to 50.
 */
public  class ChiSqSelector implements scala.Serializable {
  /**
   * String name for <code>numTopFeatures</code> selector type.
   * @return (undocumented)
   */
  static public  java.lang.String NumTopFeatures ()  { throw new RuntimeException(); }
  /**
   * String name for <code>percentile</code> selector type.
   * @return (undocumented)
   */
  static public  java.lang.String Percentile ()  { throw new RuntimeException(); }
  /** String name for `fpr` selector type. */
  static public  java.lang.String FPR ()  { throw new RuntimeException(); }
  /** Set of selector types that ChiSqSelector supports. */
  static public  java.lang.String[] supportedSelectorTypes ()  { throw new RuntimeException(); }
  public   ChiSqSelector ()  { throw new RuntimeException(); }
  public  int numTopFeatures ()  { throw new RuntimeException(); }
  public  double percentile ()  { throw new RuntimeException(); }
  public  double fpr ()  { throw new RuntimeException(); }
  public  java.lang.String selectorType ()  { throw new RuntimeException(); }
  /**
   * The is the same to call this() and setNumTopFeatures(numTopFeatures)
   * @param numTopFeatures (undocumented)
   */
  public   ChiSqSelector (int numTopFeatures)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.ChiSqSelector setNumTopFeatures (int value)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.ChiSqSelector setPercentile (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.ChiSqSelector setFpr (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.ChiSqSelector setSelectorType (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Returns a ChiSquared feature selector.
   * <p>
   * @param data an <code>RDD[LabeledPoint]</code> containing the labeled dataset with categorical features.
   *             Real-valued features will be treated as categorical for each distinct value.
   *             Apply feature discretizer before using this function.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.ChiSqSelectorModel fit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data)  { throw new RuntimeException(); }
}
