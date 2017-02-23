package org.apache.spark.mllib.stat;
/**
 * Trait for multivariate statistical summary of a data matrix.
 */
public  interface MultivariateStatisticalSummary {
  /**
   * Sample mean vector.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector mean ()  ;
  /**
   * Sample variance vector. Should return a zero vector if the sample size is 1.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector variance ()  ;
  /**
   * Sample size.
   * @return (undocumented)
   */
  public  long count ()  ;
  /**
   * Number of nonzero elements (including explicitly presented zero values) in each column.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector numNonzeros ()  ;
  /**
   * Maximum value of each column.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector max ()  ;
  /**
   * Minimum value of each column.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector min ()  ;
  /**
   * Euclidean magnitude of each column
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector normL2 ()  ;
  /**
   * L1 norm of each column
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector normL1 ()  ;
}
