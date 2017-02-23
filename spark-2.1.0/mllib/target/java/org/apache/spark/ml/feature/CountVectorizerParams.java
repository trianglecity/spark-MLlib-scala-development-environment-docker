package org.apache.spark.ml.feature;
/**
 * Params for {@link CountVectorizer} and {@link CountVectorizerModel}.
 */
  interface CountVectorizerParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol {
  /**
   * Max size of the vocabulary.
   * CountVectorizer will build a vocabulary that only considers the top
   * vocabSize terms ordered by term frequency across the corpus.
   * <p>
   * Default: 2^18^
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam vocabSize ()  ;
  /** @group getParam */
  public  int getVocabSize ()  ;
  /**
   * Specifies the minimum number of different documents a term must appear in to be included
   * in the vocabulary.
   * If this is an integer greater than or equal to 1, this specifies the number of documents
   * the term must appear in; if this is a double in [0,1), then this specifies the fraction of
   * documents.
   * <p>
   * Default: 1.0
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam minDF ()  ;
  /** @group getParam */
  public  double getMinDF ()  ;
  /** Validates and transforms the input schema. */
  public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  ;
  /**
   * Filter to ignore rare words in a document. For each document, terms with
   * frequency/count less than the given threshold are ignored.
   * If this is an integer greater than or equal to 1, then this specifies a count (of times the
   * term must appear in the document);
   * if this is a double in [0,1), then this specifies a fraction (out of the document's token
   * count).
   * <p>
   * Note that the parameter is only used in transform of {@link CountVectorizerModel} and does not
   * affect fitting.
   * <p>
   * Default: 1.0
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam minTF ()  ;
  /** @group getParam */
  public  double getMinTF ()  ;
  /**
   * Binary toggle to control the output vector values.
   * If True, all nonzero counts (after minTF filter applied) are set to 1. This is useful for
   * discrete probabilistic models that model binary events rather than integer counts.
   * Default: false
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam binary ()  ;
  /** @group getParam */
  public  boolean getBinary ()  ;
}
