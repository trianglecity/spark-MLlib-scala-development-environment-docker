package org.apache.spark.util;
/**
 * Utility class to benchmark components. An example of how to use this is:
 *  val benchmark = new Benchmark("My Benchmark", valuesPerIteration)
 *   benchmark.addCase("V1")(<function>)
 *   benchmark.addCase("V2")(<function>)
 *   benchmark.run
 * This will output the average time to run each function and the rate of each function.
 * <p>
 * The benchmark function takes one argument that is the iteration that's being run.
 * <p>
 * param:  name name of this benchmark.
 * param:  valuesPerIteration number of values used in the test case, used to compute rows/s.
 * param:  minNumIters the min number of iterations that will be run per case, not counting warm-up.
 * param:  warmupTime amount of time to spend running dummy case iterations for JIT warm-up.
 * param:  minTime further iterations will be run for each case until this time is used up.
 * param:  outputPerIteration if true, the timing for each run will be printed to stdout.
 * param:  output optional output stream to write benchmark results to
 */
  class Benchmark {
  static public  class Case implements scala.Product, scala.Serializable {
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  scala.Function1<org.apache.spark.util.Benchmark.Timer, scala.runtime.BoxedUnit> fn ()  { throw new RuntimeException(); }
    public  int numIters ()  { throw new RuntimeException(); }
    // not preceding
    public   Case (java.lang.String name, scala.Function1<org.apache.spark.util.Benchmark.Timer, scala.runtime.BoxedUnit> fn, int numIters)  { throw new RuntimeException(); }
  }
  static public  class Case$ extends scala.runtime.AbstractFunction3<java.lang.String, scala.Function1<org.apache.spark.util.Benchmark.Timer, scala.runtime.BoxedUnit>, java.lang.Object, org.apache.spark.util.Benchmark.Case> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Case$ MODULE$ = null;
    public   Case$ ()  { throw new RuntimeException(); }
  }
  static public  class Result implements scala.Product, scala.Serializable {
    public  double avgMs ()  { throw new RuntimeException(); }
    public  double bestRate ()  { throw new RuntimeException(); }
    public  double bestMs ()  { throw new RuntimeException(); }
    // not preceding
    public   Result (double avgMs, double bestRate, double bestMs)  { throw new RuntimeException(); }
  }
  static public  class Result$ extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.util.Benchmark.Result> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Result$ MODULE$ = null;
    public   Result$ ()  { throw new RuntimeException(); }
  }
  /**
   * Object available to benchmark code to control timing e.g. to exclude set-up time.
   * <p>
   * param:  iteration specifies this is the nth iteration of running the benchmark case
   */
  static public  class Timer {
    public  int iteration ()  { throw new RuntimeException(); }
    // not preceding
    public   Timer (int iteration)  { throw new RuntimeException(); }
    private  long accumulatedTime ()  { throw new RuntimeException(); }
    private  long timeStart ()  { throw new RuntimeException(); }
    public  void startTiming ()  { throw new RuntimeException(); }
    public  void stopTiming ()  { throw new RuntimeException(); }
    public  long totalTime ()  { throw new RuntimeException(); }
  }
  /**
   * This should return a user helpful processor information. Getting at this depends on the OS.
   * This should return something like "Intel(R) Core(TM) i7-4870HQ CPU @ 2.50GHz"
   * @return (undocumented)
   */
  static public  java.lang.String getProcessorName ()  { throw new RuntimeException(); }
  /**
   * This should return a user helpful JVM &amp; OS information.
   * This should return something like
   * "OpenJDK 64-Bit Server VM 1.8.0_65-b17 on Linux 4.1.13-100.fc21.x86_64"
   * @return (undocumented)
   */
  static public  java.lang.String getJVMOSInfo ()  { throw new RuntimeException(); }
  public   Benchmark (java.lang.String name, long valuesPerIteration, int minNumIters, scala.concurrent.duration.FiniteDuration warmupTime, scala.concurrent.duration.FiniteDuration minTime, boolean outputPerIteration, scala.Option<java.io.OutputStream> output)  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.util.Benchmark.Case> benchmarks ()  { throw new RuntimeException(); }
  public  java.io.PrintStream out ()  { throw new RuntimeException(); }
  /**
   * Adds a case to run when run() is called. The given function will be run for several
   * iterations to collect timing statistics.
   * <p>
   * @param name of the benchmark case
   * @param numIters if non-zero, forces exactly this many iterations to be run
   * @param f (undocumented)
   */
  public  void addCase (java.lang.String name, int numIters, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /**
   * Adds a case with manual timing control. When the function is run, timing does not start
   * until timer.startTiming() is called within the given function. The corresponding
   * timer.stopTiming() method must be called before the function returns.
   * <p>
   * @param name of the benchmark case
   * @param numIters if non-zero, forces exactly this many iterations to be run
   * @param f (undocumented)
   */
  public  void addTimerCase (java.lang.String name, int numIters, scala.Function1<org.apache.spark.util.Benchmark.Timer, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /**
   * Runs the benchmark and outputs the results to stdout. This should be copied and added as
   * a comment with the benchmark. Although the results vary from machine to machine, it should
   * provide some baseline.
   */
  public  void run ()  { throw new RuntimeException(); }
  /**
   * Runs a single function <code>f</code> for iters, returning the average time the function took and
   * the rate of the function.
   * @param num (undocumented)
   * @param overrideNumIters (undocumented)
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.util.Benchmark.Result measure (long num, int overrideNumIters, scala.Function1<org.apache.spark.util.Benchmark.Timer, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
}
