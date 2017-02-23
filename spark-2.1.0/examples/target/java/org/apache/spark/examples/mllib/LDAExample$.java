package org.apache.spark.examples.mllib;
/**
 * An example Latent Dirichlet Allocation (LDA) app. Run with
 * <pre><code>
 * ./bin/run-example mllib.LDAExample [options] &lt;input&gt;
 * </code></pre>
 * If you use it as a template to create your own app, please use <code>spark-submit</code> to submit your app.
 */
public  class LDAExample$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LDAExample$ MODULE$ = null;
  public   LDAExample$ ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  private  void run (org.apache.spark.examples.mllib.LDAExample.Params params)  { throw new RuntimeException(); }
  /**
   * Load documents, tokenize them, create vocabulary, and prepare documents as term count vectors.
   * @return (corpus, vocabulary as array, total token count in corpus)
   * @param sc (undocumented)
   * @param paths (undocumented)
   * @param vocabSize (undocumented)
   * @param stopwordFile (undocumented)
   */
  private  scala.Tuple3<org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>>, java.lang.String[], java.lang.Object> preprocess (org.apache.spark.SparkContext sc, scala.collection.Seq<java.lang.String> paths, int vocabSize, java.lang.String stopwordFile)  { throw new RuntimeException(); }
}
