package org.apache.spark.mllib.util;
/**
 * :: DeveloperApi ::
 * Generate RDD(s) containing data for Matrix Factorization.
 * <p>
 * This method samples training entries according to the oversampling factor
 * 'trainSampFact', which is a multiplicative factor of the number of
 * degrees of freedom of the matrix: rank*(m+n-rank).
 * <p>
 * It optionally samples entries for a testing matrix using
 * 'testSampFact', the percentage of the number of training entries
 * to use for testing.
 * <p>
 * This method takes the following inputs:
 *   sparkMaster    (String) The master URL.
 *   outputPath     (String) Directory to save output.
 *   m              (Int) Number of rows in data matrix.
 *   n              (Int) Number of columns in data matrix.
 *   rank           (Int) Underlying rank of data matrix.
 *   trainSampFact  (Double) Oversampling factor.
 *   noise          (Boolean) Whether to add gaussian noise to training data.
 *   sigma          (Double) Standard deviation of added gaussian noise.
 *   test           (Boolean) Whether to create testing RDD.
 *   testSampFact   (Double) Percentage of training data to use as test data.
 */
public  class MFDataGenerator$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MFDataGenerator$ MODULE$ = null;
  public   MFDataGenerator$ ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
