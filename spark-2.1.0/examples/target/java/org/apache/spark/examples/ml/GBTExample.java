package org.apache.spark.examples.ml;
/**
 * An example runner for decision trees. Run with
 * <pre><code>
 * ./bin/run-example ml.GBTExample [options]
 * </code></pre>
 * Decision Trees and ensembles can take a large amount of memory. If the run-example command
 * above fails, try running via spark-submit and specifying the amount of memory as at least 1g.
 * For local mode, run
 * <pre><code>
 * ./bin/spark-submit --class org.apache.spark.examples.ml.GBTExample --driver-memory 1g
 *   [examples JAR path] [options]
 * </code></pre>
 * If you use it as a template to create your own app, please use <code>spark-submit</code> to submit your app.
 */
public  class GBTExample {
  static public  class Params extends org.apache.spark.examples.mllib.AbstractParams<org.apache.spark.examples.ml.GBTExample.Params> implements scala.Product, scala.Serializable {
    public  java.lang.String input ()  { throw new RuntimeException(); }
    public  java.lang.String testInput ()  { throw new RuntimeException(); }
    public  java.lang.String dataFormat ()  { throw new RuntimeException(); }
    public  java.lang.String algo ()  { throw new RuntimeException(); }
    public  int maxDepth ()  { throw new RuntimeException(); }
    public  int maxBins ()  { throw new RuntimeException(); }
    public  int minInstancesPerNode ()  { throw new RuntimeException(); }
    public  double minInfoGain ()  { throw new RuntimeException(); }
    public  int maxIter ()  { throw new RuntimeException(); }
    public  double fracTest ()  { throw new RuntimeException(); }
    public  boolean cacheNodeIds ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> checkpointDir ()  { throw new RuntimeException(); }
    public  int checkpointInterval ()  { throw new RuntimeException(); }
    // not preceding
    public   Params (java.lang.String input, java.lang.String testInput, java.lang.String dataFormat, java.lang.String algo, int maxDepth, int maxBins, int minInstancesPerNode, double minInfoGain, int maxIter, double fracTest, boolean cacheNodeIds, scala.Option<java.lang.String> checkpointDir, int checkpointInterval)  { throw new RuntimeException(); }
  }
  static public  class Params$ extends scala.runtime.AbstractFunction13<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, scala.Option<java.lang.String>, java.lang.Object, org.apache.spark.examples.ml.GBTExample.Params> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Params$ MODULE$ = null;
    public   Params$ ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void run (org.apache.spark.examples.ml.GBTExample.Params params)  { throw new RuntimeException(); }
}
