package org.apache.spark.mllib.feature;
/**
 * Standardizes features by removing the mean and scaling to unit std using column summary
 * statistics on the samples in the training set.
 * <p>
 * The "unit std" is computed using the corrected sample standard deviation
 * (https://en.wikipedia.org/wiki/Standard_deviation#Corrected_sample_standard_deviation),
 * which is computed as the square root of the unbiased sample variance.
 * <p>
 * param:  withMean False by default. Centers the data with mean before scaling. It will build a
 *                 dense output, so take care when applying to sparse input.
 * param:  withStd True by default. Scales the data to unit standard deviation.
 */
public  class StandardScaler implements org.apache.spark.internal.Logging {
  public   StandardScaler (boolean withMean, boolean withStd)  { throw new RuntimeException(); }
  public   StandardScaler ()  { throw new RuntimeException(); }
  /**
   * Computes the mean and variance and stores as a model to be used for later scaling.
   * <p>
   * @param data The data used to compute the mean and variance to build the transformation model.
   * @return a StandardScalarModel
   */
  public  org.apache.spark.mllib.feature.StandardScalerModel fit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
}
