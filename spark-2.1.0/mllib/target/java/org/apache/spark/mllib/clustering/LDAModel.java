package org.apache.spark.mllib.clustering;
/**
 * Latent Dirichlet Allocation (LDA) model.
 * <p>
 * This abstraction permits for different underlying representations,
 * including local and distributed data structures.
 */
public abstract class LDAModel implements org.apache.spark.mllib.util.Saveable {
     LDAModel ()  { throw new RuntimeException(); }
  /** Number of topics */
  public abstract  int k ()  ;
  /** Vocabulary size (number of terms or terms in the vocabulary) */
  public abstract  int vocabSize ()  ;
  /**
   * Concentration parameter (commonly named "alpha") for the prior placed on documents'
   * distributions over topics ("theta").
   * <p>
   * This is the parameter to a Dirichlet distribution.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.mllib.linalg.Vector docConcentration ()  ;
  /**
   * Concentration parameter (commonly named "beta" or "eta") for the prior placed on topics'
   * distributions over terms.
   * <p>
   * This is the parameter to a symmetric Dirichlet distribution.
   * <p>
   * @note The topics' distributions over terms are called "beta" in the original LDA paper
   * by Blei et al., but are called "phi" in many later papers such as Asuncion et al., 2009.
   * @return (undocumented)
   */
  public abstract  double topicConcentration ()  ;
  /**
   * Shape parameter for random initialization of variational parameter gamma.
   * Used for variational inference for perplexity and other test-time computations.
   * @return (undocumented)
   */
  protected abstract  double gammaShape ()  ;
  /**
   * Inferred topics, where each topic is represented by a distribution over terms.
   * This is a matrix of size vocabSize x k, where each column is a topic.
   * No guarantees are given about the ordering of the topics.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.mllib.linalg.Matrix topicsMatrix ()  ;
  /**
   * Return the topics described by weighted terms.
   * <p>
   * @param maxTermsPerTopic  Maximum number of terms to collect for each topic.
   * @return  Array over topics.  Each topic is represented as a pair of matching arrays:
   *          (term indices, term weights in topic).
   *          Each topic's terms are sorted in order of decreasing weight.
   */
  public abstract  scala.Tuple2<int[], double[]>[] describeTopics (int maxTermsPerTopic)  ;
  /**
   * Return the topics described by weighted terms.
   * <p>
   * WARNING: If vocabSize and k are large, this can return a large object!
   * <p>
   * @return  Array over topics.  Each topic is represented as a pair of matching arrays:
   *          (term indices, term weights in topic).
   *          Each topic's terms are sorted in order of decreasing weight.
   */
  public  scala.Tuple2<int[], double[]>[] describeTopics ()  { throw new RuntimeException(); }
}
