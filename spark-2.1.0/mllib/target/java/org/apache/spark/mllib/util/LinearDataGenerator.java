package org.apache.spark.mllib.util;
/**
 * :: DeveloperApi ::
 * Generate sample data used for Linear Data. This class generates
 * uniformly random values for every feature and adds Gaussian noise with mean <code>eps</code> to the
 * response variable <code>Y</code>.
 */
public  class LinearDataGenerator {
  /**
   * Return a Java List of synthetic data randomly generated according to a multi
   * collinear model.
   * @param intercept Data intercept
   * @param weights  Weights to be applied.
   * @param nPoints Number of points in sample.
   * @param seed Random seed
   * @return Java List of input.
   * @param eps (undocumented)
   */
  static public  java.util.List<org.apache.spark.mllib.regression.LabeledPoint> generateLinearInputAsList (double intercept, double[] weights, int nPoints, int seed, double eps)  { throw new RuntimeException(); }
  /**
   * For compatibility, the generated data without specifying the mean and variance
   * will have zero mean and variance of (1.0/3.0) since the original output range is
   * [-1, 1] with uniform distribution, and the variance of uniform distribution
   * is (b - a)^2^ / 12 which will be (1.0/3.0)
   * <p>
   * @param intercept Data intercept
   * @param weights  Weights to be applied.
   * @param nPoints Number of points in sample.
   * @param seed Random seed
   * @param eps Epsilon scaling factor.
   * @return Seq of input.
   */
  static public  scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> generateLinearInput (double intercept, double[] weights, int nPoints, int seed, double eps)  { throw new RuntimeException(); }
  /**
   * @param intercept Data intercept
   * @param weights  Weights to be applied.
   * @param xMean the mean of the generated features. Lots of time, if the features are not properly
   *              standardized, the algorithm with poor implementation will have difficulty
   *              to converge.
   * @param xVariance the variance of the generated features.
   * @param nPoints Number of points in sample.
   * @param seed Random seed
   * @param eps Epsilon scaling factor.
   * @return Seq of input.
   */
  static public  scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> generateLinearInput (double intercept, double[] weights, double[] xMean, double[] xVariance, int nPoints, int seed, double eps)  { throw new RuntimeException(); }
  /**
   * @param intercept Data intercept
   * @param weights  Weights to be applied.
   * @param xMean the mean of the generated features. Lots of time, if the features are not properly
   *              standardized, the algorithm with poor implementation will have difficulty
   *              to converge.
   * @param xVariance the variance of the generated features.
   * @param nPoints Number of points in sample.
   * @param seed Random seed
   * @param eps Epsilon scaling factor.
   * @param sparsity The ratio of zero elements. If it is 0.0, LabeledPoints with
   *                 DenseVector is returned.
   * @return Seq of input.
   */
  static public  scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> generateLinearInput (double intercept, double[] weights, double[] xMean, double[] xVariance, int nPoints, int seed, double eps, double sparsity)  { throw new RuntimeException(); }
  /**
   * Generate an RDD containing sample data for Linear Regression models - including Ridge, Lasso,
   * and unregularized variants.
   * <p>
   * @param sc SparkContext to be used for generating the RDD.
   * @param nexamples Number of examples that will be contained in the RDD.
   * @param nfeatures Number of features to generate for each example.
   * @param eps Epsilon factor by which examples are scaled.
   * @param nparts Number of partitions in the RDD. Default value is 2.
   * <p>
   * @return RDD of LabeledPoint containing sample data.
   * @param intercept (undocumented)
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> generateLinearRDD (org.apache.spark.SparkContext sc, int nexamples, int nfeatures, double eps, int nparts, double intercept)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
