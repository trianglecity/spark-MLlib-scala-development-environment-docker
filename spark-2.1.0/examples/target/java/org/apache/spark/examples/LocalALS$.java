package org.apache.spark.examples;
/**
 * Alternating least squares matrix factorization.
 * <p>
 * This is an example implementation for learning how to use Spark. For more conventional use,
 * please refer to org.apache.spark.ml.recommendation.ALS.
 */
public  class LocalALS$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LocalALS$ MODULE$ = null;
  public   LocalALS$ ()  { throw new RuntimeException(); }
  public  int M ()  { throw new RuntimeException(); }
  public  int U ()  { throw new RuntimeException(); }
  public  int F ()  { throw new RuntimeException(); }
  public  int ITERATIONS ()  { throw new RuntimeException(); }
  public  double LAMBDA ()  { throw new RuntimeException(); }
  public  org.apache.commons.math3.linear.RealMatrix generateR ()  { throw new RuntimeException(); }
  public  double rmse (org.apache.commons.math3.linear.RealMatrix targetR, org.apache.commons.math3.linear.RealVector[] ms, org.apache.commons.math3.linear.RealVector[] us)  { throw new RuntimeException(); }
  public  org.apache.commons.math3.linear.RealVector updateMovie (int i, org.apache.commons.math3.linear.RealVector m, org.apache.commons.math3.linear.RealVector[] us, org.apache.commons.math3.linear.RealMatrix R)  { throw new RuntimeException(); }
  public  org.apache.commons.math3.linear.RealVector updateUser (int j, org.apache.commons.math3.linear.RealVector u, org.apache.commons.math3.linear.RealVector[] ms, org.apache.commons.math3.linear.RealMatrix R)  { throw new RuntimeException(); }
  public  void showWarning ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  private  org.apache.commons.math3.linear.RealVector randomVector (int n)  { throw new RuntimeException(); }
  private  org.apache.commons.math3.linear.RealMatrix randomMatrix (int rows, int cols)  { throw new RuntimeException(); }
}
