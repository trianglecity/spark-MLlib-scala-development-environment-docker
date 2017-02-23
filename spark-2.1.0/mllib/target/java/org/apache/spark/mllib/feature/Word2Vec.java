package org.apache.spark.mllib.feature;
/**
 * Word2Vec creates vector representation of words in a text corpus.
 * The algorithm first constructs a vocabulary from the corpus
 * and then learns vector representation of words in the vocabulary.
 * The vector representation can be used as features in
 * natural language processing and machine learning algorithms.
 * <p>
 * We used skip-gram model in our implementation and hierarchical softmax
 * method to train the model. The variable names in the implementation
 * matches the original C implementation.
 * <p>
 * For original C implementation, see https://code.google.com/p/word2vec/
 * For research papers, see
 * Efficient Estimation of Word Representations in Vector Space
 * and
 * Distributed Representations of Words and Phrases and their Compositionality.
 */
public  class Word2Vec implements scala.Serializable, org.apache.spark.internal.Logging {
  public   Word2Vec ()  { throw new RuntimeException(); }
  private  int vectorSize ()  { throw new RuntimeException(); }
  private  double learningRate ()  { throw new RuntimeException(); }
  private  int numPartitions ()  { throw new RuntimeException(); }
  private  int numIterations ()  { throw new RuntimeException(); }
  private  long seed ()  { throw new RuntimeException(); }
  private  int minCount ()  { throw new RuntimeException(); }
  private  int maxSentenceLength ()  { throw new RuntimeException(); }
  /**
   * Sets the maximum length (in words) of each sentence in the input data.
   * Any sentence longer than this threshold will be divided into chunks of
   * up to <code>maxSentenceLength</code> size (default: 1000)
   * @param maxSentenceLength (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.Word2Vec setMaxSentenceLength (int maxSentenceLength)  { throw new RuntimeException(); }
  /**
   * Sets vector size (default: 100).
   * @param vectorSize (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.Word2Vec setVectorSize (int vectorSize)  { throw new RuntimeException(); }
  /**
   * Sets initial learning rate (default: 0.025).
   * @param learningRate (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.Word2Vec setLearningRate (double learningRate)  { throw new RuntimeException(); }
  /**
   * Sets number of partitions (default: 1). Use a small number for accuracy.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.Word2Vec setNumPartitions (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Sets number of iterations (default: 1), which should be smaller than or equal to number of
   * partitions.
   * @param numIterations (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.Word2Vec setNumIterations (int numIterations)  { throw new RuntimeException(); }
  /**
   * Sets random seed (default: a random long integer).
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.Word2Vec setSeed (long seed)  { throw new RuntimeException(); }
  /**
   * Sets the window of words (default: 5)
   * @param window (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.Word2Vec setWindowSize (int window)  { throw new RuntimeException(); }
  /**
   * Sets minCount, the minimum number of times a token must appear to be included in the word2vec
   * model's vocabulary (default: 5).
   * @param minCount (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.Word2Vec setMinCount (int minCount)  { throw new RuntimeException(); }
  private  int EXP_TABLE_SIZE ()  { throw new RuntimeException(); }
  private  int MAX_EXP ()  { throw new RuntimeException(); }
  private  int MAX_CODE_LENGTH ()  { throw new RuntimeException(); }
  /** context words from [-window, window] */
  private  int window ()  { throw new RuntimeException(); }
  private  long trainWordsCount ()  { throw new RuntimeException(); }
  private  int vocabSize ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.feature.VocabWord[] vocab ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> vocabHash ()  { throw new RuntimeException(); }
  private <S extends scala.collection.Iterable<java.lang.String>> void learnVocab (org.apache.spark.rdd.RDD<S> dataset)  { throw new RuntimeException(); }
  private  float[] createExpTable ()  { throw new RuntimeException(); }
  private  void createBinaryTree ()  { throw new RuntimeException(); }
  /**
   * Computes the vector representation of each word in vocabulary.
   * @param dataset an RDD of sentences,
   *                each sentence is expressed as an iterable collection of words
   * @return a Word2VecModel
   */
  public <S extends scala.collection.Iterable<java.lang.String>> org.apache.spark.mllib.feature.Word2VecModel fit (org.apache.spark.rdd.RDD<S> dataset)  { throw new RuntimeException(); }
  /**
   * Computes the vector representation of each word in vocabulary (Java version).
   * @param dataset a JavaRDD of words
   * @return a Word2VecModel
   */
  public <S extends java.lang.Iterable<java.lang.String>> org.apache.spark.mllib.feature.Word2VecModel fit (org.apache.spark.api.java.JavaRDD<S> dataset)  { throw new RuntimeException(); }
}
