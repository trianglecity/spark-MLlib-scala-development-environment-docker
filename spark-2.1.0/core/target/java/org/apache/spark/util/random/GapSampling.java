package org.apache.spark.util.random;
  class GapSampling implements scala.Serializable {
  public   GapSampling (double f, java.util.Random rng, double epsilon)  { throw new RuntimeException(); }
  private  double lnq ()  { throw new RuntimeException(); }
  /** Return 1 if the next item should be sampled. Otherwise, return 0. */
  public  int sample ()  { throw new RuntimeException(); }
  private  int countForDropping ()  { throw new RuntimeException(); }
  /**
   * Decide the number of elements that won't be sampled,
   * according to geometric dist P(k) = (f)(1-f)^k.
   */
  private  void advance ()  { throw new RuntimeException(); }
}
