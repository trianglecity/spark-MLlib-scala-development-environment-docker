package org.apache.spark.examples.graphx;
/**
 * The SynthBenchmark application can be used to run various GraphX algorithms on
 * synthetic log-normal graphs.  The intent of this code is to enable users to
 * profile the GraphX system without access to large graph datasets.
 */
public  class SynthBenchmark$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SynthBenchmark$ MODULE$ = null;
  public   SynthBenchmark$ ()  { throw new RuntimeException(); }
  /**
   * To run this program use the following:
   * <p>
   * MASTER=spark://foobar bin/run-example graphx.SynthBenchmark -app=pagerank
   * <p>
   * Options:
   *   -app "pagerank" or "cc" for pagerank or connected components. (Default: pagerank)
   *   -niters the number of iterations of pagerank to use (Default: 10)
   *   -nverts the number of vertices in the graph (Default: 1000000)
   *   -numEPart the number of edge partitions in the graph (Default: number of cores)
   *   -partStrategy the graph partitioning strategy to use
   *   -mu the mean parameter for the log-normal graph (Default: 4.0)
   *   -sigma the stdev parameter for the log-normal graph (Default: 1.3)
   *   -degFile the local file to save the degree information (Default: Empty)
   *   -seed seed to use for RNGs (Default: -1, picks seed randomly)
   * @param args (undocumented)
   */
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
