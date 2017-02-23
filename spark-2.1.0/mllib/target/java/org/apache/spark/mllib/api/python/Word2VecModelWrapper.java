package org.apache.spark.mllib.api.python;
/**
 * Wrapper around Word2VecModel to provide helper methods in Python
 */
  class Word2VecModelWrapper {
  public   Word2VecModelWrapper (org.apache.spark.mllib.feature.Word2VecModel model)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector transform (java.lang.String word)  { throw new RuntimeException(); }
  /**
   * Transforms an RDD of words to its vector representation
   * @param rdd an RDD of words
   * @return an RDD of vector representations of words
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> transform (org.apache.spark.api.java.JavaRDD<java.lang.String> rdd)  { throw new RuntimeException(); }
  /**
   * Finds synonyms of a word; do not include the word itself in results.
   * @param word a word
   * @param num number of synonyms to find
   * @return a list consisting of a list of words and a vector of cosine similarities
   */
  public  java.util.List<java.lang.Object> findSynonyms (java.lang.String word, int num)  { throw new RuntimeException(); }
  /**
   * Finds words similar to the the vector representation of a word without
   * filtering results.
   * @param vector a vector
   * @param num number of synonyms to find
   * @return a list consisting of a list of words and a vector of cosine similarities
   */
  public  java.util.List<java.lang.Object> findSynonyms (org.apache.spark.mllib.linalg.Vector vector, int num)  { throw new RuntimeException(); }
  private  java.util.List<java.lang.Object> prepareResult (scala.Tuple2<java.lang.String, java.lang.Object>[] result)  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.util.List<java.lang.Object>> getVectors ()  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
