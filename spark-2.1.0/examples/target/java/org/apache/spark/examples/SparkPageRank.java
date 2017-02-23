package org.apache.spark.examples;
/**
 * Computes the PageRank of URLs from an input file. Input file should
 * be in format of:
 * URL         neighbor URL
 * URL         neighbor URL
 * URL         neighbor URL
 * ...
 * where URL and their neighbors are separated by space(s).
 * <p>
 * This is an example implementation for learning how to use Spark. For more conventional use,
 * please refer to org.apache.spark.graphx.lib.PageRank
 * <p>
 * Example Usage:
 * <pre><code>
 * bin/run-example SparkPageRank data/mllib/pagerank_data.txt 10
 * </code></pre>
 */
public  class SparkPageRank {
  static public  void showWarning ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
