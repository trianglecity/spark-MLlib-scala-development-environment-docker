package org.apache.spark.ml.feature;
/**
 * :: Experimental ::
 * <p>
 * Params for {@link BucketedRandomProjectionLSH}.
 */
  interface BucketedRandomProjectionLSHParams extends org.apache.spark.ml.param.Params {
  /**
   * The length of each hash bucket, a larger bucket lowers the false negative rate. The number of
   * buckets will be <code>(max L2 norm of input vectors) / bucketLength</code>.
   * <p>
   * If input vectors are normalized, 1-10 times of pow(numRecords, -1/inputDim) would be a
   * reasonable value
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam bucketLength ()  ;
  /** @group getParam */
  public  double getBucketLength ()  ;
}
