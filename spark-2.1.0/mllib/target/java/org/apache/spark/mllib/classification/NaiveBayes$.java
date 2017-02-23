package org.apache.spark.mllib.classification;
/**
 * Top-level methods for calling naive Bayes.
 */
public  class NaiveBayes$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final NaiveBayes$ MODULE$ = null;
  public   NaiveBayes$ ()  { throw new RuntimeException(); }
  /** String name for multinomial model type. */
    java.lang.String Multinomial ()  { throw new RuntimeException(); }
  /** String name for Bernoulli model type. */
    java.lang.String Bernoulli ()  { throw new RuntimeException(); }
    scala.collection.immutable.Set<java.lang.String> supportedModelTypes ()  { throw new RuntimeException(); }
  /**
   * Trains a Naive Bayes model given an RDD of <code>(label, features)</code> pairs.
   * <p>
   * This is the default Multinomial NB (see <a href="http://tinyurl.com/lsdw6p">here</a>)
   * which can handle all kinds of discrete data. For example, by converting documents into
   * TF-IDF vectors, it can be used for document classification.
   * <p>
   * This version of the method uses a default smoothing parameter of 1.0.
   * <p>
   * @param input RDD of <code>(label, array of features)</code> pairs.  Every vector should be a frequency
   *              vector or a count vector.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.classification.NaiveBayesModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input)  { throw new RuntimeException(); }
  /**
   * Trains a Naive Bayes model given an RDD of <code>(label, features)</code> pairs.
   * <p>
   * This is the default Multinomial NB (see <a href="http://tinyurl.com/lsdw6p">here</a>)
   * which can handle all kinds of discrete data. For example, by converting documents
   * into TF-IDF vectors, it can be used for document classification.
   * <p>
   * @param input RDD of <code>(label, array of features)</code> pairs.  Every vector should be a frequency
   *              vector or a count vector.
   * @param lambda The smoothing parameter
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.classification.NaiveBayesModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, double lambda)  { throw new RuntimeException(); }
  /**
   * Trains a Naive Bayes model given an RDD of <code>(label, features)</code> pairs.
   * <p>
   * The model type can be set to either Multinomial NB (see <a href="http://tinyurl.com/lsdw6p">
   * here</a>) or Bernoulli NB (see <a href="http://tinyurl.com/p7c96j6">here</a>).
   * The Multinomial NB can handle discrete count data and can be called by setting the model
   * type to "multinomial".
   * For example, it can be used with word counts or TF_IDF vectors of documents.
   * The Bernoulli model fits presence or absence (0-1) counts. By making every vector a
   * 0-1 vector and setting the model type to "bernoulli", the  fits and predicts as
   * Bernoulli NB.
   * <p>
   * @param input RDD of <code>(label, array of features)</code> pairs.  Every vector should be a frequency
   *              vector or a count vector.
   * @param lambda The smoothing parameter
   * <p>
   * @param modelType The type of NB model to fit from the enumeration NaiveBayesModels, can be
   *              multinomial or bernoulli
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.classification.NaiveBayesModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, double lambda, java.lang.String modelType)  { throw new RuntimeException(); }
}
