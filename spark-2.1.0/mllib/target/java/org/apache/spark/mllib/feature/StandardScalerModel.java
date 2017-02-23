package org.apache.spark.mllib.feature;
/**
 * Represents a StandardScaler model that can transform vectors.
 * <p>
 * param:  std column standard deviation values
 * param:  mean column mean values
 * param:  withStd whether to scale the data to have unit standard deviation
 * param:  withMean whether to center the data before scaling
 */
public  class StandardScalerModel implements org.apache.spark.mllib.feature.VectorTransformer {
  public  org.apache.spark.mllib.linalg.Vector std ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector mean ()  { throw new RuntimeException(); }
  public  boolean withStd ()  { throw new RuntimeException(); }
  public  boolean withMean ()  { throw new RuntimeException(); }
  // not preceding
  public   StandardScalerModel (org.apache.spark.mllib.linalg.Vector std, org.apache.spark.mllib.linalg.Vector mean, boolean withStd, boolean withMean)  { throw new RuntimeException(); }
  /**
   * @param std (undocumented)
   * @param mean (undocumented)
   */
  public   StandardScalerModel (org.apache.spark.mllib.linalg.Vector std, org.apache.spark.mllib.linalg.Vector mean)  { throw new RuntimeException(); }
  public   StandardScalerModel (org.apache.spark.mllib.linalg.Vector std)  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * @param withMean (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.StandardScalerModel setWithMean (boolean withMean)  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * @param withStd (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.StandardScalerModel setWithStd (boolean withStd)  { throw new RuntimeException(); }
  private  double[] shift ()  { throw new RuntimeException(); }
  /**
   * Applies standardization transformation on a vector.
   * <p>
   * @param vector Vector to be standardized.
   * @return Standardized vector. If the std of a column is zero, it will return default <code>0.0</code>
   *         for the column with zero std.
   */
  public  org.apache.spark.mllib.linalg.Vector transform (org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
}
