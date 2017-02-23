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
public  class GBTExample$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GBTExample$ MODULE$ = null;
  public   GBTExample$ ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  public  void run (org.apache.spark.examples.ml.GBTExample.Params params)  { throw new RuntimeException(); }
}
