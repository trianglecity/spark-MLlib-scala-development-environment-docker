package org.apache.spark.mllib.tree.configuration;
public  class BoostingStrategy$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BoostingStrategy$ MODULE$ = null;
  public   BoostingStrategy$ ()  { throw new RuntimeException(); }
  /**
   * Returns default configuration for the boosting algorithm
   * @param algo Learning goal.  Supported: "Classification" or "Regression"
   * @return Configuration for boosting algorithm
   */
  public  org.apache.spark.mllib.tree.configuration.BoostingStrategy defaultParams (java.lang.String algo)  { throw new RuntimeException(); }
  /**
   * Returns default configuration for the boosting algorithm
   * @param algo Learning goal.  Supported:
   *             <code>org.apache.spark.mllib.tree.configuration.Algo.Classification</code>,
   *             <code>org.apache.spark.mllib.tree.configuration.Algo.Regression</code>
   * @return Configuration for boosting algorithm
   */
  public  org.apache.spark.mllib.tree.configuration.BoostingStrategy defaultParams (scala.Enumeration.Value algo)  { throw new RuntimeException(); }
}
