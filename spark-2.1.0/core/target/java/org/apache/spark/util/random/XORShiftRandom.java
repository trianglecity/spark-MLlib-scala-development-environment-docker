package org.apache.spark.util.random;
/**
 * This class implements a XORShift random number generator algorithm
 * Source:
 * Marsaglia, G. (2003). Xorshift RNGs. Journal of Statistical Software, Vol. 8, Issue 14.
 * @see <a href="http://www.jstatsoft.org/v08/i14/paper">Paper</a>
 * This implementation is approximately 3.5 times faster than
 * {@link java.util.Random java.util.Random}, partly because of the algorithm, but also due
 * to renouncing thread safety. JDK's implementation uses an AtomicLong seed, this class
 * uses a regular Long. We can forgo thread safety since we use a new instance of the RNG
 * for each thread.
 */
  class XORShiftRandom extends java.util.Random {
  /** Hash seeds to have 0/1 bits throughout. */
  static   long hashSeed (long seed)  { throw new RuntimeException(); }
  /**
   * Main method for running benchmark
   * @param args takes one argument - the number of random numbers to generate
   */
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  /**
   * @param numIters Number of random numbers to generate while running the benchmark
   * @return Map of execution times for {@link java.util.Random java.util.Random}
   * and XORShift
   */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> benchmark (int numIters)  { throw new RuntimeException(); }
  static public  void nextBytes (byte[] x$1)  { throw new RuntimeException(); }
  static  final  long internalNextLong (long x$1, long x$2)  { throw new RuntimeException(); }
  static  final  int internalNextInt (int x$1, int x$2)  { throw new RuntimeException(); }
  static  final  double internalNextDouble (double x$1, double x$2)  { throw new RuntimeException(); }
  static public  int nextInt ()  { throw new RuntimeException(); }
  static public  int nextInt (int x$1)  { throw new RuntimeException(); }
  static public  long nextLong ()  { throw new RuntimeException(); }
  static public  boolean nextBoolean ()  { throw new RuntimeException(); }
  static public  float nextFloat ()  { throw new RuntimeException(); }
  static public  double nextDouble ()  { throw new RuntimeException(); }
  static public  double nextGaussian ()  { throw new RuntimeException(); }
  static public  java.util.stream.IntStream ints (long x$1)  { throw new RuntimeException(); }
  static public  java.util.stream.IntStream ints ()  { throw new RuntimeException(); }
  static public  java.util.stream.IntStream ints (long x$1, int x$2, int x$3)  { throw new RuntimeException(); }
  static public  java.util.stream.IntStream ints (int x$1, int x$2)  { throw new RuntimeException(); }
  static public  java.util.stream.LongStream longs (long x$1)  { throw new RuntimeException(); }
  static public  java.util.stream.LongStream longs ()  { throw new RuntimeException(); }
  static public  java.util.stream.LongStream longs (long x$1, long x$2, long x$3)  { throw new RuntimeException(); }
  static public  java.util.stream.LongStream longs (long x$1, long x$2)  { throw new RuntimeException(); }
  static public  java.util.stream.DoubleStream doubles (long x$1)  { throw new RuntimeException(); }
  static public  java.util.stream.DoubleStream doubles ()  { throw new RuntimeException(); }
  static public  java.util.stream.DoubleStream doubles (long x$1, double x$2, double x$3)  { throw new RuntimeException(); }
  static public  java.util.stream.DoubleStream doubles (double x$1, double x$2)  { throw new RuntimeException(); }
  public   XORShiftRandom (long init)  { throw new RuntimeException(); }
  public   XORShiftRandom ()  { throw new RuntimeException(); }
  private  long seed ()  { throw new RuntimeException(); }
  protected  int next (int bits)  { throw new RuntimeException(); }
  public  void setSeed (long s)  { throw new RuntimeException(); }
}
