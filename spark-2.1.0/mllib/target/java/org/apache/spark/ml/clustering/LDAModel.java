package org.apache.spark.ml.clustering;
/**
 * Model fitted by {@link LDA}.
 * <p>
 * param:  vocabSize  Vocabulary size (number of terms or words in the vocabulary)
 * param:  sparkSession  Used to construct local DataFrames for returning query results
 */
public abstract class LDAModel extends org.apache.spark.ml.Model<org.apache.spark.ml.clustering.LDAModel> implements org.apache.spark.ml.clustering.LDAParams, org.apache.spark.internal.Logging, org.apache.spark.ml.util.MLWritable {
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  int vocabSize ()  { throw new RuntimeException(); }
    org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  // not preceding
     LDAModel (java.lang.String uid, int vocabSize, org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  /**
   * Underlying spark.mllib model.
   * If this model was produced by Online LDA, then this is the only model representation.
   * If this model was produced by EM, then this local representation may be built lazily.
   * @return (undocumented)
   */
  protected abstract  org.apache.spark.mllib.clustering.LocalLDAModel oldLocalModel ()  ;
  /** Returns underlying spark.mllib model, which may be local or distributed */
  protected abstract  org.apache.spark.mllib.clustering.LDAModel getModel ()  ;
    double[] getEffectiveDocConcentration ()  { throw new RuntimeException(); }
    double getEffectiveTopicConcentration ()  { throw new RuntimeException(); }
  /**
   * The features for LDA should be a <code>Vector</code> representing the word counts in a document.
   * The vector should be of length vocabSize, with counts for each term (word).
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.clustering.LDAModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDAModel setSeed (long value)  { throw new RuntimeException(); }
  /**
   * Transforms the input dataset.
   * <p>
   * WARNING: If this model is an instance of {@link DistributedLDAModel} (produced when {@link optimizer}
   *          is set to "em"), this involves collecting a large {@link topicsMatrix} to the driver.
   *          This implementation may be changed in the future.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Value for {@link docConcentration} estimated from data.
   * If Online LDA was used and {@link optimizeDocConcentration} was set to false,
   * then this returns the fixed (given) value for the {@link docConcentration} parameter.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector estimatedDocConcentration ()  { throw new RuntimeException(); }
  /**
   * Inferred topics, where each topic is represented by a distribution over terms.
   * This is a matrix of size vocabSize x k, where each column is a topic.
   * No guarantees are given about the ordering of the topics.
   * <p>
   * WARNING: If this model is actually a {@link DistributedLDAModel} instance produced by
   *          the Expectation-Maximization ("em") {@link optimizer}, then this method could involve
   *          collecting a large amount of data to the driver (on the order of vocabSize x k).
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Matrix topicsMatrix ()  { throw new RuntimeException(); }
  /** Indicates whether this instance is of type {@link DistributedLDAModel} */
  public abstract  boolean isDistributed ()  ;
  /**
   * Calculates a lower bound on the log likelihood of the entire corpus.
   * <p>
   * See Equation (16) in the Online LDA paper (Hoffman et al., 2010).
   * <p>
   * WARNING: If this model is an instance of {@link DistributedLDAModel} (produced when {@link optimizer}
   *          is set to "em"), this involves collecting a large {@link topicsMatrix} to the driver.
   *          This implementation may be changed in the future.
   * <p>
   * @param dataset  test corpus to use for calculating log likelihood
   * @return variational lower bound on the log likelihood of the entire corpus
   */
  public  double logLikelihood (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Calculate an upper bound bound on perplexity.  (Lower is better.)
   * See Equation (16) in the Online LDA paper (Hoffman et al., 2010).
   * <p>
   * WARNING: If this model is an instance of {@link DistributedLDAModel} (produced when {@link optimizer}
   *          is set to "em"), this involves collecting a large {@link topicsMatrix} to the driver.
   *          This implementation may be changed in the future.
   * <p>
   * @param dataset test corpus to use for calculating perplexity
   * @return Variational upper bound on log perplexity per token.
   */
  public  double logPerplexity (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Return the topics described by their top-weighted terms.
   * <p>
   * @param maxTermsPerTopic  Maximum number of terms to collect for each topic.
   *                          Default value of 10.
   * @return  Local DataFrame with one topic per Row, with columns:
   *           - "topic": IntegerType: topic index
   *           - "termIndices": ArrayType(IntegerType): term indices, sorted in order of decreasing
   *                            term importance
   *           - "termWeights": ArrayType(DoubleType): corresponding sorted term weights
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> describeTopics (int maxTermsPerTopic)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> describeTopics ()  { throw new RuntimeException(); }
}
