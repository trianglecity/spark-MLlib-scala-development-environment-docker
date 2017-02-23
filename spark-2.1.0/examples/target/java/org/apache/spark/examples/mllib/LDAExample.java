package org.apache.spark.examples.mllib;
/**
 * An example Latent Dirichlet Allocation (LDA) app. Run with
 * <pre><code>
 * ./bin/run-example mllib.LDAExample [options] &lt;input&gt;
 * </code></pre>
 * If you use it as a template to create your own app, please use <code>spark-submit</code> to submit your app.
 */
public  class LDAExample {
  static private  class Params extends org.apache.spark.examples.mllib.AbstractParams<org.apache.spark.examples.mllib.LDAExample.Params> implements scala.Product, scala.Serializable {
    public  scala.collection.Seq<java.lang.String> input ()  { throw new RuntimeException(); }
    public  int k ()  { throw new RuntimeException(); }
    public  int maxIterations ()  { throw new RuntimeException(); }
    public  double docConcentration ()  { throw new RuntimeException(); }
    public  double topicConcentration ()  { throw new RuntimeException(); }
    public  int vocabSize ()  { throw new RuntimeException(); }
    public  java.lang.String stopwordFile ()  { throw new RuntimeException(); }
    public  java.lang.String algorithm ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> checkpointDir ()  { throw new RuntimeException(); }
    public  int checkpointInterval ()  { throw new RuntimeException(); }
    // not preceding
    public   Params (scala.collection.Seq<java.lang.String> input, int k, int maxIterations, double docConcentration, double topicConcentration, int vocabSize, java.lang.String stopwordFile, java.lang.String algorithm, scala.Option<java.lang.String> checkpointDir, int checkpointInterval)  { throw new RuntimeException(); }
  }
  static private  class Params$ extends scala.runtime.AbstractFunction10<scala.collection.Seq<java.lang.String>, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.String, scala.Option<java.lang.String>, java.lang.Object, org.apache.spark.examples.mllib.LDAExample.Params> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Params$ MODULE$ = null;
    public   Params$ ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static private  void run (org.apache.spark.examples.mllib.LDAExample.Params params)  { throw new RuntimeException(); }
  /**
   * Load documents, tokenize them, create vocabulary, and prepare documents as term count vectors.
   * @return (corpus, vocabulary as array, total token count in corpus)
   * @param sc (undocumented)
   * @param paths (undocumented)
   * @param vocabSize (undocumented)
   * @param stopwordFile (undocumented)
   */
  static private  scala.Tuple3<org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>>, java.lang.String[], java.lang.Object> preprocess (org.apache.spark.SparkContext sc, scala.collection.Seq<java.lang.String> paths, int vocabSize, java.lang.String stopwordFile)  { throw new RuntimeException(); }
}
